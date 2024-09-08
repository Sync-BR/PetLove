package com.petlove.pet.services;

public class ActivitieService {
    public Object check(Float urine, int faces){
        int urinePorcento = calculateUrine(urine) ;
        double facesCheck =  checkFaces(faces);
        return urinePorcento+" "+ facesCheck;
    }

    private static int calculateUrine(float urine) {
        if (urine <= 0.3f)
            return 10;
        else if (urine <= 0.6f)
            return 30;
        else if(urine <= 1.0f)
            return 50;
        else if (urine <= 1.4f)
            return 70;
        else if(urine <= 1.6f)
            return 90;
        else if(urine <= 1.9f)
            return 95;
        else {
            return 100;
        }
    }

    private static double checkFaces(int faces){
        return Double.valueOf(faces * 0.75);
    }

    public static void main(String[] args) {
        ActivitieService a = new ActivitieService();
       System.out.println(a.check(0.2f, 10));
    }

}
