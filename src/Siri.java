public class Siri {

    public Siri(){}

    public static void main(String[] args) {

        Siri siriControl = new Siri();

        siriControl.tellMeTheDate();
        siriControl.tellMeThePlace();
        siriControl.tellMeTheWeather();
        siriControl.tellMeTime();


    }

    public void tellMeTheDate(){
        System.out.println("it's 10th november,2022");
    }

    public void tellMeTheTime(){
        System.out.println("it's 10.48a.m");
    }

    public void tellMeTheWeather(){
        System.out.println("it's sunny outside");
    }

    public void tellMeThePlace(){
        System.out.println("it's Drexel Hill");
    }

    public void tellMeTime(){

        System.out.println("Time is 9 o CLock");

    }


}
