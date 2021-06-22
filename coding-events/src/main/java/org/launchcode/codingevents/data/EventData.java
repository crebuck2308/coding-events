package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need place to put/store events: (integer = eventID;
    private static final Map<Integer, Event> events = new HashMap<>();
    //made final once initiated it cannot change - data inside can though

    //static means only one
    //have declared to by of type Map of Integer-Event pairs
    //Will be a hashmap - map object will store integer (id) event (event object) pairs

    //all static because don't want to create instances of event data**

    //need a method to getAll() events
    public static Collection<Event> getAll(){
        return events.values();
        //going to return a collection (list) of events
        //do not need keys but want the "values"
        //collections implements Iterable allows us to loop over this Collection
        //want to return something we can work with (collection)
    }

    //need a method to get a single event
    public static Event getById(int id) {
        return events.get(id);
        //putting an event into our Map - key = id of event obj and value = event object itself
    }

    //need a method to add an event
    public static void addEvent(Event event) {
        events.put(event.getId(), event);
    }

    //need a method to remove an event
    public static void removeEvent(int id) {
        events.remove(id);
    }
}
