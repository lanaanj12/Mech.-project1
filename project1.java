public class Main {
   
    
    private class Car{
        private int initial_speed;
        private int distanceToIntersection;
        private int positiveMagnitude;
        private int negativeMagnitude;
        private int yellowLight;
        private int intersectWidth;
       

        private  Car(int speed1, int distance, int positive, int negative){

            initial_speed= speed1;
            distance_to_intersection=distance;
            positiveMagnitude=positive;
            negativeMagnitude= negative;
        }

    

    
        
        private Road(int yellow, int intWidth){
            yellowLight= yellow;
            intersectWidth= intWidth;

        }

    }

    public Car CarParameters(int speed1, int distance, int positive,int negative){
        if(speed1<20 ||speed1>80||distance <10 || distance>150||positive<1|| positive>3||negative<1|| negative>3) {

            System.out.println("your parameters are not correct, please enter new parameters.");
            return null;
              Car car= new Car(speed1,distance, positive, negative);
        return car;

    }

    public Car MaxSpeed(int speed1, int distance, int positive,int negative){
        if(speed1<50 ||speed1>150||distance <10 || distance>150||positive<1|| positive>3||negative<1|| negative>3) {

            System.out.println("your parameters are not correct,please enter new parameters.");
            return null;
        }
        Car car= new Car(speed1,distance, positive, negative);
        return car;

    }

    public Car RoadParameters(int yellow, int intWidth){
        if(yellow<2 || yellow >5 || intWidth<5 || intWidth >20){
            System.out.println("your parameters are not correct,please enter new parameters.");
            return null;
        }
        Road road = new Road(yellow, intWidth);
        return road;

    }
    public int Advice(Car car, Road road){
        if(car!=null && road!=null){

            double positiveWay= car.initial_speed * car.yellowLight  + 0.5*(car.positiveMagnitude * car.yellowLight *car.yellowLight);        
            if( positiveWay > car.intersectWidth+car.distance_to_intersection || positiveWay == car.intersectWidth + car.distance_to_intersection ){
                System.out.println("you can pass the light if you accelerate.");
                return 1;
            } 
                
            else {
                
                System.out.println("you passed a red light.");
                return 0;
            }

        }
       

    }
   public void TwoCars(){
        Main carAcceleration = new Main();
        Car car1 = carAcceleration.initFrontCarParameters(50,30,2,3,10);
        Car car2 = carAcceleration.CarParameters(20,50,1,3);
        Road road = carAcceleration.RoadParameters(2,20);

    }
     public static void main(String args[]){
        Main carAcceleration = new Main();
        carAcceleration.Advice();
        carAcceleration.TwoCars();
}
}

