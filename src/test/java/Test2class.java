public class Test2class {


        public static void main(String[] args) {

//newbranch code
            // StringBuffer str= new StringBuffer("halloween");

            //System.out.println(str.reverse());

//changed as per PR comments
            String str= "halloween";

            int len= str.length();

            String rev="";
            for (int i= str.length()-1; i>0; i--)
            {
                rev=rev+str.charAt(i);

                System.out.println(rev);
            }
        }
    }
}
