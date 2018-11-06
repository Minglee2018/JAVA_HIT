/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_4;

import java.util.ArrayList;

public class Math {
    public static float average(ArrayList <Float> a){
        float tong=0;
        for (int i=0; i<a.size(); i++){
            tong+=a.get(i);
        }
        return tong/a.size();
    }
}
