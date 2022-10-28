package com.biniyam.myapplication;

public class DataManger {


    //DAO data access object simulera backend

    public ArrayList<>   users = ArrayList<>(); // dynaamic than array

    public void createUser(String name, String password){
        User kanin = new User(name, password);// anråpa konstratorn

        users.add (Kanin);
        System.out.println(kanin.toString());
    }
    public boolean checkUser(String name, String password){

        // boolean svar = false;
        for ( User u : users ){
            if (name == u.getUserName());{
                if (name == u.getPassword()){
                    return true;
                    // svar = true;
                }
            }

            return false;

        }
        //for (int i=0;i< user.size();i++){}

    }
}*/
}
