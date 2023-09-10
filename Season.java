class Season {
        public static void main(String[]args)
        {
            switch(args[0])
            {
                case "11":
                case "12":
                case "1":
                case "2":

                System.out.println("winter searon");
                 break;

                case "3":
                case "4":
                case "5":
                case "6":
                    System.out.println("summer season");
                    break;

                case "7":
                case "8":
                case "9":
                case "10":
                    System.out.println("rainy season");
                    break;

                default:
                    System.out.println("wrong month number");

            }
        }
    }
