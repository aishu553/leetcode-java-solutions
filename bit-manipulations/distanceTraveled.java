/*
     It took me 01:08:55 time to solve this question 🥲
     The code in the last took me 58 mins only to realise that
        I've been checking for unnecessary conditions (trust me, this isn't my first time to be stuck in this typa situation )
    I've been sitting in this same place, manda-odachifying for this easy question this whole time 🤧.
    I should really practice harder to solve these typa questions faster.
*/



class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int maxdist=0;
        int used=0;
        while(mainTank>0){  //5  //4 //3 //2 //1
            mainTank--;
            maxdist+=10;
            used++;
            if(used==5 && additionalTank>0){
                mainTank++;
                additionalTank--;
                used=0;
            }
        }
        return maxdist;
    }
}

// while(mainTank>0){ //9 //8 //7 //6 //5 //6 //5 //4 //3 //2 //1
//             if(limit==5){ //yes
//                 if(mainTank==0 && additionalTank==0)return maxdist;//no
//                 additionalTank--;//1->0
//                 limit=1;//0
//                 mainTank+=1;//6
//             }
//             else if(limit==5 && additionalTank==0){
//                 limit=1; 
//                 maxdist+=10;
//                 mainTank--;
//             }
//             else{ //9 //8 //7 //6 //6 //5 //4 //3 //2 //1
//                 limit++;//2 //3 //4 //5 //2 //3 //4 //5 //2 //3
//                 maxdist+=10;
//                 mainTank--; //8 //7 //6 //5 //5 //4 //3 //2 //1 //0
//             }
//         }
// return maxdist;//10 //20 //30 //40 //50 //60 //70 //80 //90 //100