import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Matrix {
    public void numberOfNonZeroValues{
        int nemnull = 0;
        int[][] matrix = {
                {  0,  67,  22,   0,  95},
                { 72,   0,   0, -88,   0},
                {  0, -79,   0,   0, -97},
                {  0,   0, -13, -19,   0},
                {  0,  89,  95,   0,   0}
        };

        for(int i=0; i<5;i++){
            for (int j=0; j<5;j++){
                if (matrix[i][j] != 0)
                    nemnull++;
            }
        }
        System.out(nemnull);
    }
    
    public void indexOfColumnsWithSameValues{
        int nemAzonosErtekek = 5;
        int[][] matrix = {
                { 84,  79,  22, -72,  95},
                { 72,  79,   2, -88,  30},
                { 95,  79, -87, -27, -97},
                {-52,  79, -13, -19, -27},
                { 79,  79,  95, -84, -53}
        };

        for(int i=0; i<5;i++){
            for (int j=0; j<5;j++){
                if(matrix[i][j] == matrix[i][j+1] && matrix[i][j] == matrix[i][j+2] &&
                        matrix[i][j] == matrix[i][j+3] && matrix[i][j] == matrix[i][j+4]){
                    nemAzonosErtekek--;
                }
            }
        }
        System.out(nemAzonosErtekek);
    }
}