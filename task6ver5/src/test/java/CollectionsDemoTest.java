import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionsDemoTest {
    @Test
    public void testAmountStringsByFirstChar(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("bass");
        list1.add("band");
        Assert.assertEquals(2, CollectionsDemo.amountStringsByFirstChar(list1, 'b'));
    }

    @Test
    public void testGetListWIthSameSurname(){
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Smith","James","Anthony", 19));
        humans.add(new Human("Smith","Andrew","John",68));
        humans.add(new Human("Gallagher","Carl","Francis",20));

        ArrayList<Human> resList = new ArrayList<Human>();
        resList.add(new Human("Smith","James","Anthony", 19));
        resList.add(new Human("Smith","Andrew","John",68));

        Human human = new Human("Smith","Anthony","Steven", 12);

        Assert.assertEquals(resList, CollectionsDemo.getListWIthSameSurname(humans,human));
    }

    @Test
    public void testCopyListWithoutMarkedHuman(){
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Smith","James","Anthony", 19));
        humans.add(new Human("Gallagher","Carl","Francis",20));
        humans.add(new Human("Smith","Andrew","John",68));

        ArrayList<Human> resList = new ArrayList<Human>();
        resList.add(new Human("Smith","James","Anthony", 19));
        resList.add(new Human("Smith","Andrew","John",68));

        Human human = new Human("Gallagher","Carl","Francis",20);
        Assert.assertEquals(resList, CollectionsDemo.copyListWithoutMarkedHuman(humans,human));
    }

    @Test
    public void testGetListNonIntersectingSets(){
        ArrayList<Set<Integer>> sets = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        sets.add(set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        sets.add(set2);

        HashSet<Integer> set3 = new HashSet<>();
        set3.add(5);
        set3.add(6);
        set3.add(7);
        sets.add(set3);

        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);

        ArrayList<HashSet<Integer>> resSets = new ArrayList<>();
        resSets.add(new HashSet<>(set3));

        Assert.assertEquals(resSets, CollectionsDemo.getListNonIntersectingSets(sets, set));
    }


    @Test
    public void testGetListHumansWithMaxAge(){

        ArrayList<Human> humans = new ArrayList<>();

        Student student1 = new Student("Surname1","Name1","MidName1", 20 ,"imit");
        humans.add(student1);

        Human human = new Human("Surname","Name","MidName", 20);
        humans.add(human);

        Student student2 = new Student("Surname2", "Name2","MidName2",16,"abvgdej");
        humans.add(student2);

        HashSet<Human> resList = new HashSet<>();
        resList.add(student1);
        resList.add(human);

        Assert.assertEquals(resList, CollectionsDemo.getListHumansWithMaxAge(humans));
    }

    @Test
    public void testGetSetHumansWithId(){
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("Surname1", "Name1", "MidName1", 13));
        map.put(2, new Human("Surname2", "Name2", "MidName2", 21));
        map.put(3, new Human("Surname3", "Name3", "MidName3", 24));

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(4);

        HashSet<Human> resultSet = new HashSet<>();
        resultSet.add(new Human("Surname1", "Name1", "MidName1", 13));
        resultSet.add(new Human("Surname3", "Name3", "MidName3", 24));

        Assert.assertEquals(resultSet, CollectionsDemo.getSetHumansWithId(map, set));
    }

    @Test
    public void testGetListIdAgeLess18(){
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("Surname1", "Name1", "MidName1", 13));
        map.put(2, new Human("Surname2", "Name2", "MidName2", 21));
        map.put(3, new Human("Surname3", "Name3", "MidName3", 11));

        ArrayList<Integer> resList = new ArrayList<>();
        resList.add(2);

        Assert.assertEquals(resList, CollectionsDemo.getListIdAgeLess18(map));
    }

    @Test
    public void testGetMapWithIdAndAge(){
        HashMap<Integer, Human> map = new HashMap<>();
        map.put(1, new Human("Surname1", "Name1", "MidName1", 12));
        map.put(2, new Human("Surname2", "Name2", "MidName2", 20));
        map.put(3, new Human("Surname3", "Name3", "MidName3", 17));

        HashMap<Integer, Integer> resMap = new HashMap<>();
        resMap.put(1, 12);
        resMap.put(2, 20);
        resMap.put(3, 17);

        Assert.assertEquals(resMap, CollectionsDemo.getMapWithIdAndAge(map));
    }

    @Test
    public void testGetMapWithIdAgeValueListOfHumans(){
        Set<Human> set = new HashSet<>();
        set.add(new Human("Surname1", "Name1", "MidName1", 13));
        set.add(new Human("Surname2", "Name2", "MidName2", 21));
        set.add(new Human("Surname3", "Name3", "MidName3", 13));

        Map<Integer, List<Human>> resultMap = new HashMap<>();

        List<Human> humans1 = new ArrayList<>();
        humans1.add(new Human("Surname1", "Name1", "MidName1", 13));
        humans1.add(new Human("Surname3", "Name3", "MidName3", 13));
        resultMap.put(13, humans1);

        List<Human> humans2 = new ArrayList<>();
        humans2.add(new Human("Surname2", "Name2", "MidName2", 21));
        resultMap.put(21, humans2);
        Assert.assertEquals(resultMap, CollectionsDemo.getMapWithIdAgeValueListOfHumans(set));
    }


}