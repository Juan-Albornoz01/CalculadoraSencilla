package easy.tuto.calculadorados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultado;


double n1,n2,res;
String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public  void OnClickCaptura1(View view){
        resultado = (TextView) findViewById(R.id.resultado);
        n1 = Double.parseDouble(resultado.getText().toString());
        resultado.setText(" ");
    }



    public void punto(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+".");
    }
    public void cero(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"0");

    }
    public void uno(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"1");


    }

    public void dos(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"2");

    }

    public void tres(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"3");
    }
    public void nueve(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"9");
    }

    public void cuatro(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"4");
    }

    public void cinco(View view) {

        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"5");

    }

    public void seis(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"6");
    }
    public void siete(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"7");

    }

    public void ocho(View view) {
        resultado = (TextView)findViewById(R.id.resultado) ;
        resultado.setText(resultado.getText()+"8");
    }

    public void clear(View view) {
        resultado.setText("");
        n1 = 0.0f;
        n2= 0.0f;

        operador = "";
    }



    public void igual(View view) {

        resultado = (TextView) findViewById(R.id.resultado);
        n2 = Double.parseDouble(resultado.getText().toString());

        if (operador.equals("+")){
            res = n1  + n2;
        }else  if (operador.equals("-")){
            res = n1  - n2;}
        else  if (operador.equals("*")){
            res = n1  * n2;
        }else  if  (operador.equals("/")){
            if (n2 == 0.0f){
                resultado.setText("0");
                Toast.makeText(this,"no se puede no sea perro",Toast.LENGTH_LONG).show();
            }else{res = n1/n2;
            resultado.setText(res+"");}
            res = n1  / n2;
        }else  if (operador.equals("exp")){
            resultado = (TextView) findViewById(R.id.resultado);
            n2 = Double.parseDouble(resultado.getText().toString());
            resultado.setText(" ");
            res = Math.pow(n1,n2);
        }
        resultado.setText(""+res);
    }


    public void dividir(View view) {
        operador = "/";
        OnClickCaptura1(view);


    }
    public void Multiplicar(View view) {

        operador = "*";
        OnClickCaptura1(view);


    }

    public void cuadrado(View view) {

        resultado = (TextView) findViewById(R.id.resultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            res = Math.pow(n1,2);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }


    public void restar(View view) {
        operador = "-";
        OnClickCaptura1(view);
    }


    public void suma(View view) {

    operador = "+";
    OnClickCaptura1(view);

    }

    public void Expon(View view){
        operador = "exp";
                resultado = (TextView) findViewById(R.id.resultado);
                try {
                    n1 = Double.parseDouble(resultado.getText().toString());
                    resultado.setText("");
                }catch (NumberFormatException nfe){}

    }


    public  void Rnd(View view){
        for (int x=0;x <100;x++){
            int na = (int)Math.floor(Math.random()*(100+(1+1+(1))));

            resultado.setText(String.valueOf(na));


        }
    }

    public void Raiz(View view){
        resultado=(TextView) findViewById(R.id.resultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            res = Math.sqrt(n1);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }


    public void cubo(View view) {
        resultado = (TextView) findViewById(R.id.resultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            res = Math.pow(n1,3);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void BorrarAnteriorN(View view) {
        if (resultado.getText().toString().equals(" ")){
            resultado.setText(resultado.getText().subSequence(0,resultado.getText().length()-1)+" ");
        }
    }
}

