package com.purple.algorithmUtil;

import com.purple.algorithmUtil.SortUtil;


public class InsertSort implements SortUtil.Sort{

    /* (non-Javadoc)
     * @see org.rut.util.algorithm.SortUtil.Sort#sort(int[])
     */
    public void sort(int[] data) {
        for(int i=1;i<data.length;i++){
            for(int j=i;(j>0)&&(data[j]<data[j-1]);j--){
                SortUtil.swap(data,j,j-1);
            }
        }        
    }

}

