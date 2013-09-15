package sample

import ca.odell.glazedlists.*

class SampleModel {
   EventList<Person> people = new SortedList<Person>(new BasicEventList<Person>(),
     {a, b -> a.id <=> b.id} as Comparator<Person>)
}