public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

int lowest=args[0];

for(int i=1;i<args.length;i++)
{
   if(args[i]<lowest)
   lowest=args[i];


}
return lowest;

    }
}