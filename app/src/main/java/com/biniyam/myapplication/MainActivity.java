package com.biniyam.myapplication;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    EditText userNameInput;
    EditText UserPasswordInput;
    Button registrerButton;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = findViewById(R.id.edit_text_password);
        userPassword = findViewById(R.edit_);
        registrerButton
        //
        //
        //

        registerButton.setOnClicklistner;


    });
        @Override

              //  public void setOnClick(View v){
        String userName = userNameInput.getText().toString();
        String password = userPassword.getTex().toString();
/* if (DataManger.checkUser,password)){
//      Intent newActivityIntent = new Intent( MainActivity.this, NewActivity.class)
//      startActivity(newActivityIntent);// öppnar a ny sida
else{
Toast.makeText(MainActivity)


}
//
//
// }
*/

    }
}
    //
        //
        //
        //  }


                // static betyder:

}

/*public class DataManager{

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