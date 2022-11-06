import java.util.*;

public class CollectionsDemo {
    //Вход: список строк и символ. Выход: количество строк входного списка, у которых первый
    //символ совпадает с заданным
    public static int amountStringsByFirstChar(List<String> list, char c){
        int amount = 0;
        for(String str : list){
            if(str != null && !"".equals(str) && str.charAt(0) == c){
                amount++;
            }
        }
        return amount;
    }

    //получает на вход список объектов типа Human
    //и еще один объект типа Human. Результат — список однофамильцев заданного человека
    //среди людей из входного списка.
    public static List<Human> getListWIthSameSurname(List<Human> humans, Human human){
        List<Human> resList = new ArrayList<>();
        for(Human human1 : humans){
            if(human1.getLastName().equals(human.getLastName())){
                resList.add(human1);
            }
        }
        return resList;
    }

    //Вход: список объектов типа Human и еще один объект типа Human. Выход — копия
    //входного списка, не содержащая выделенного человека. При изменении элементов
    //входного списка элементы выходного изменяться не должны.
    public static List<Human> copyListWithoutMarkedHuman(List<Human> humans, Human human){
        List<Human> resList = new ArrayList<>();
        for(Human human1 : humans){
            if(human1.equals(human)){
                continue;
            }
            resList.add(new Human(human1));
        }
        return resList;
    }

    //Вход: список множеств целых чисел и еще одно множество. Выход: список всех множеств
    //входного списка, которые не пересекаются с заданным множеством.
    public static List<Set<Integer>> getListNonIntersectingSets(List<Set<Integer>> sets, Set<Integer> set){ //не пересекающиеся
        List<Set<Integer>> resSets = new ArrayList<>();
        for(Set<Integer> set1 : sets){
            var midwaySet = new HashSet<>(set1);
            midwaySet.retainAll(set);
            if(midwaySet.isEmpty()){
                resSets.add(set1);
            }
        }
        return resSets;
    }


    //получает на вход список, состоящий из объектов типа Human и его производных классов.
    // Результат — множество людей из входного списка с максимальным возрастом.
    public static Set<? extends Human> getListHumansWithMaxAge(List<? extends Human> humans){
        Set<Human> resList = new HashSet<>();
        int max = -1;
        for(Human human : humans){
            if(human.getAge() >= max){
                if(human.getAge() > max){
                    max = human.getAge();
                    resList.clear();
                }
                resList.add(human);
            }
        }
        return resList;
    }

    //Имеется набор людей, каждому человеку задан уникальный целочисленный идентификатор.
    // Напишите метод, который получает на вход отображение (Map) целочисленных идентификаторов в
    // объекты типа Human и множество целых чисел. Результат — множество людей, идентификаторы
    // которых содержатся во входном множестве.
    public static Set<Human> getSetHumansWithId(Map<Integer, Human> map, Set<Integer> set){
        Set<Human> resSet = new HashSet<>();
        for(int id : set){
            if(map.containsKey(id)){
                resSet.add(map.get(id));
            }
        }
        return resSet;
    }

    //Для отображения из задачи 7 постройте список идентификаторов людей,
    // чей возраст не менее 18 лет.
    public static List<Integer> getListIdAgeLess18(Map<Integer, Human> map){
        List<Integer> resList = new ArrayList<>();

        for(var thing : map.entrySet()){ // entrySet для листа ключ-значений
            if(thing.getValue().getAge() >= 18){
                resList.add(thing.getKey());
            }
        }
        return resList;
    }

    //Для отображения из задачи 7 постройте новое отображение,
    // которое идентификатору сопоставляет возраст человека.
    public static Map<Integer, Integer> getMapWithIdAndAge(Map<Integer, Human> map){
        Map<Integer, Integer> resMap = new HashMap<>();

        for(int id : map.keySet()){ //keySet для листа ключей
            resMap.put(id, map.get(id).getAge());
        }
        return resMap;
    }

    // По множеству объектов типа Human постройте отображение, которое целому числу
    // (возраст человека) сопоставляет список всех людей данного возраста из входного
    // множества.
    public static Map<Integer, List<Human>> getMapWithIdAgeValueListOfHumans(Set<Human> set){
        Map<Integer, List<Human>> resMap = new HashMap<>();
        for(Human human : set) {
            resMap.putIfAbsent(human.getAge(), new ArrayList<>()); //сопоставление ключа с указанным значением
            resMap.get(human.getAge()).add(human);
        }
        return resMap;
    }

}