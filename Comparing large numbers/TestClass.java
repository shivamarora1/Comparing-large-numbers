import java.util.Scanner;

/**
 *
 * @author Shivam
 */
class TestClass {
    public static void main(String[] args)
    {
        int[] res=new int[1000];
        int test_case=0;
        Scanner s=new Scanner(System.in);
        while(true)
        {
            try
            {
           String exp=s.nextLine();
            
        
            //
            
            String [] exp_arr=exp.split(" ");
            
            Long exp1=Long.parseLong(exp_arr[0]);
            Long exp2=Long.parseLong(exp_arr[2]);
            
            switch(exp_arr[1]){
                case "==":
                {
                    if(exp1==exp2)
                        res[test_case]=1;
                    else
                        res[test_case]=0;
                    test_case++;
                    break;
                }
                
                case "!=":
                {
                    if(exp1!=exp2)
                        res[test_case]=1;
                    else
                        res[test_case]=0;
                    test_case++;
                    break;
                }
                
                case ">=":
                {
                    if(exp1>=exp2)
                        res[test_case]=1;
                    else
                        res[test_case]=0;
                    test_case++;
                    break;
                }
                
                case "<=":
                {
                    if(exp1<=exp2)
                        res[test_case]=1;
                    else
                        res[test_case]=0;
                    test_case++;
                    break;
                }
            }
            }
            
            catch(Exception e){
                break;
            }
            
            
        }
        for(int co=0;co<test_case;co++){
                System.out.println(res[co]);
            }
    }
}
