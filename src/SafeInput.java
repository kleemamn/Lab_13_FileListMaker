import java.util.Scanner;

public class SafeInput
{
    Scanner in = new Scanner(System.in);

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    //Part A

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ":  "); // show prompt add space
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);

        return retString;
    }

    //Part B

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + " Is not a valid number");
            }
        }
        while(!done);

        return retVal;
    }

    //Part C

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + "You must enter a double not: " + trash);
            }
        }
        while(!done);

        return retVal;
    }

    //Part D

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt);
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You entered \"" + retVal + "\"");
                    System.out.println("Enter a valid integer [" + low + "-" + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer not \"" + trash + "\"");
            }
        }
        while(!done);

        return retVal;
    }

    //Part E

    public static int getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt);
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Your entered \"" + retVal + "\"");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double not \"" + trash + "\"");
            }
        }
        while(!done);

        return (int) retVal;
    }

    //Part F

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String respYN;
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.print(prompt + "[Y/N]: ");
            respYN = pipe.nextLine();

            if (respYN.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (respYN.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter [Y/N]: ");
            }
        }
        while(!done);

        return retVal;
    }

    //Part G

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Enter a matching pattern not: " + retVal);
            }
        }
        while (!done);

        return retVal;
    }

    //Part H

    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
    }

}
