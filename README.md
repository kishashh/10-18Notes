# 10/18-20Notes

## 10/18
* Worked with ArrayLists in jshell
  - `.add()`: Adds element to ArrayList
  - `.remove()`: Removes element from ArrayList
  - `.forEach()`: Can loop for each of a certian item in an array
  
```java
//x = {"two","one","three","two","two","one","two","one",}

x.forEach(e -> System.out.println(">>>>> "+e));

/*prints
>>>>> two
>>>>> two
>>>>> two
>>>>> two
>>>>> two
>>>>> two
*/
```

* HashMaps
 ```java
 //initialize HashMap
 HashMap<String, ArrayList<String>> hm = new HashMap<>();
 
 // name, list of grades
 hm.put("Mo", new ArrayList<String>());          //hm ==> {Mo=[]}
 hm.put("Bhu", new ArrayList<String>());         //hm ==> {Mo=[], Bhu=[]}
 hm.get("Mo").add("7");                          //hm ==> {Mo=[7], Bhu=[]}
 hm.get("Bhu").add("3");                         //hm ==> {Mo=[7], Bhu=[3]}
 hm.putIfAbsent("Moo", new ArrayList<String>()); //hm ==> {Mo=[7], Bhu=[3], Moo=[]} 
 ``` 
 
 * TreeMap
   - Sorts the list unlike HashMap
 ```java
 //initalize
 TreeMap<String, ArrayList<String>> t = newTreeMap<>(hm);//t ==> {Bhu[3], Mo=[7], Moo=[]}
 
 ```
 
 ## 10/20
