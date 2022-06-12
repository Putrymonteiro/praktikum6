package com.example.praktikum6;

impo

Button LogInButton;
EditText Email,Password;
TextView RegisterButton;
String EmailHolder, PasswordHolder;
boolean EditTextEmptyHolder;
SQLiteDatabase sqLiteDatabaseObj;
Cursor cursor;
String TempPassword = "NOT_FOUND" ;
public static final String UserEmail = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogInButton = (Button) findViewById(R.id.buttonLogin);

        RegisterButton = (TextView)
        findViewById(R.id.buttonRegister);

        Email = (EditText)findViewById(R.id.editEmail);
        Password = (EditText)findViewById(R.id.editPassword);

        sqLiteHelper = new SQLiteHelper (this);

        //method onClick Login
        LogInButton.setOnClickListener(new View.OnClickListener)()
        {
@Override
public void onClick(View View){
        //Method Cek Email Password
        CheckEditTextStatus();

        //Method Login Akun
        LoginFuction();
        }
        });

        //
        }
    }
}