class Time{
  int hours, minutes, seconds;
  Time(){
    hours = 0;
    minutes = 0;
    seconds = 0;
  }
  Time(int sec){
    hours = sec/3600;
    sec = sec%3600;
    minutes = sec/60;
    sec = sec%60;
    seconds = sec;
  }
  Time(int h,int min,int sec){
    hours = h;
    if(min >= 60){
      hours = hours + min/60;
      minutes = min%60;
    }else minutes = min;
    if(sec >= 60){
      minutes = minutes + sec/60;
      seconds = sec%60;
    }else seconds = sec;
  }
  void display(){
    System.out.println("Hours: "+hours+" minutes: "+minutes+" seconds: "+seconds);
  }
}
class TimeMain{
  public static void main(String args[]){
    Time t1 = new Time();
    Time t2 = new Time(1000);
    Time t3 = new Time(3,90,71);
    t1.display();
    t2.display();
    t3.display();
  }
}


