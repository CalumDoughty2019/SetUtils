public class MySet {

    private int[] set;

    public MySet(int[] set){
        this.set = set;
    }

    public int[] getSet() {
        return set;
    }

    public void setSet(int[] set) {
        this.set = set;
    }

    //check to see if any value is found in all sets
    public boolean disjointed1(MySet setB, MySet setC){
        for(int a : set){
            for(int b : setB.getSet()){
                for(int c : setC.getSet()){
                    if((a == b) && (b == c)){
                        return false; //false as there is a/multiple value/values which exist in all 3 sets
                    }
                }
            }
        }
        return true; //true that values are not in all 3 sets
    }

    //check to see if any value is found in all sets //quicker way
    public boolean disjointed2(MySet setB, MySet setC){
        for(int a : set){
            for(int b : setB.getSet()){
                if(a == b){ //if no shared value in a and b then no need to check c
                    for(int c : setC.getSet()){
                        if(a == c){
                            return false; //false as there is a/multiple value/values which exist in all 3 sets
                        }
                    }
                }
            }
        }
        return true; //true that values are not in all 3 sets
    }
}
