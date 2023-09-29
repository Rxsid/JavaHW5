import java.util.*;

public class TelephonNumbers {
    private Map<String, ArrayList<String>> map = new HashMap<>();

    void add(String LastName, String TelephonNumber){
        if (map.containsKey(LastName)) {
            map.get(LastName).add(TelephonNumber);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(TelephonNumber);
            map.put(LastName, list);
        }
    }

    String getByTelephonNumber(String TelephonNumber){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
            if(entry.getValue().equals(TelephonNumber)){
                stringBuilder.append(entry.getKey())
                        .append(" : ")
                        .append(TelephonNumber)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }


    String getByName(String LastName){
        return LastName + " : " + map.get(LastName);
    }
    String getAllSorted(){
        List<String> keysArrayList = new ArrayList<String>();
        for (Map.Entry entry :
                map.entrySet()) {
            keysArrayList.add(entry.getKey().toString());
            // System.out.println(entry.getKey().getClass().getName());
        }
        for (int i = 1; i < keysArrayList.size(); i++) {
            for (int j = 0; j < keysArrayList.size(); j++) {
                if(map.get(keysArrayList.get(i)).size() > map.get(keysArrayList.get(j)).size()){
                    Collections.swap(keysArrayList, i, j);
//                    System.out.println(keysArrayList.toString());
                }
            }
        }
        // ArrayList<Integer> valuesArrayList = new ArrayList<Integer>();
        // for (String string : keysArrayList) {
        //     valuesArrayList.add(map.get(string).size());
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k <keysArrayList.size(); k++){
            stringBuilder
                    .append(keysArrayList.get(k))
                    .append(" : ")
                    .append(map.get(keysArrayList.get(k)))
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    String getAll(){
        return map.toString();
    }
}
