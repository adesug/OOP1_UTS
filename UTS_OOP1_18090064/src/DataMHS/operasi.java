/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMHS;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ade Sug
 */
public class operasi {

    private static List<Data> listData = new LinkedList<Data>();

    public static void addData(Data data) {
        listData.add(data);
    }

    public static void editData(Data data, int idx) {
        listData.set(idx, data);
    }

    public static void removeData(int idx) {
        listData.remove(idx);
    }

    public static List<Data> getListData() {
        return listData;
    }

}
