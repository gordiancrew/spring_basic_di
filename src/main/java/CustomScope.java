import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

    private Map<String, Object> scopedObjects = Collections.synchronizedMap(new HashMap<String, Object>());
    private Map<String, Integer> count = Collections.synchronizedMap(new HashMap<String, Integer>());
    private Map<String, Runnable> destructionCallbacks = Collections.synchronizedMap(new HashMap<String, Runnable>());

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        System.out.println("!!!!!"+name+" count= ");
        if (!scopedObjects.containsKey(name)) {
            scopedObjects.put(name, objectFactory.getObject());
            count.put(name,1);

        }
        else if(count.get(name)>2){
       count.remove(name);
       scopedObjects.remove(name);
            scopedObjects.put(name, objectFactory.getObject());
            count.put(name,1);



            //return objectFactory.getObject();

        }

        else {
           int gapCount=count.get(name);
           gapCount++;
           count.remove(name);
           count.put(name,gapCount);

        }
        return scopedObjects.get(name);
    }

    @Override
    public Object remove(String name) {
        destructionCallbacks.remove(name);
        return scopedObjects.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        destructionCallbacks.put(name, callback);
    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "tenant";
    }
}
