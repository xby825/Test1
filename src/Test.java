public class Test {
    volatile static boolean f = false;
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);

        Thread a = new Thread(new Runnable(){
            public void run(){
                while(true){
                    if(!f){
                        System.out.println("1");
                        f = true;
                    }
                }
            }
        });
        Thread b = new Thread(new Runnable(){
            public void run(){
                while(true){
                    if(f){
                        System.out.println("2");
                        f = false;
                    }
                }
            }
        });
        a.start();
        b.start();
    }
}
