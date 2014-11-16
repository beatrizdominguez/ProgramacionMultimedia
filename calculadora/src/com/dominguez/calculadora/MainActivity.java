package com.dominguez.calculadora;

/**
 * Autor: Beatriz Domínguez 
 */
import com.dominguez.calculadora.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	// caja de texto
	EditText cajaTexto;

	// VARIABLES
	// num: nuevo número introducido
	// resultado: resultado de todas las operaciones anteriores
	double num, resultado;
	// boolean que determina si hay una nueva operación o no
	boolean nuevaOp = true;
	// típo de operación
	int operacion = 0;

	// 1=suma 3=multiplicación 5=porcentaje
	// 2=resta 4=división

	// método onCreate que se ejecuta al ejecutarse el archivo
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);

		// creamos la caja de texto
		cajaTexto = (EditText) findViewById(R.id.txtText);

		// definimos los botones y le asignamos un listener
		// numeros
		Button button1 = (Button) findViewById(R.id.boton1);
		button1.setOnClickListener(this);
		Button button2 = (Button) findViewById(R.id.boton2);
		button2.setOnClickListener(this);
		Button button3 = (Button) findViewById(R.id.boton3);
		button3.setOnClickListener(this);
		Button button4 = (Button) findViewById(R.id.boton4);
		button4.setOnClickListener(this);
		Button button5 = (Button) findViewById(R.id.boton5);
		button5.setOnClickListener(this);
		Button button6 = (Button) findViewById(R.id.boton6);
		button6.setOnClickListener(this);
		Button button7 = (Button) findViewById(R.id.boton7);
		button7.setOnClickListener(this);
		Button button8 = (Button) findViewById(R.id.boton8);
		button8.setOnClickListener(this);
		Button button9 = (Button) findViewById(R.id.boton9);
		button9.setOnClickListener(this);
		Button button0 = (Button) findViewById(R.id.botonCero);
		button0.setOnClickListener(this);
		Button button00 = (Button) findViewById(R.id.boton00);
		button00.setOnClickListener(this);
		// operadores
		Button buttonIgual = (Button) findViewById(R.id.botonIgual);
		buttonIgual.setOnClickListener(this);
		Button buttonMas = (Button) findViewById(R.id.botonMas);
		buttonMas.setOnClickListener(this);
		Button buttonMenos = (Button) findViewById(R.id.botonMenos);
		buttonMenos.setOnClickListener(this);
		Button buttonPor = (Button) findViewById(R.id.botonMult);
		buttonPor.setOnClickListener(this);
		Button buttonPorcentaje = (Button) findViewById(R.id.botonPorciento);
		buttonPorcentaje.setOnClickListener(this);
		Button buttonDiv = (Button) findViewById(R.id.botonDiv);
		buttonDiv.setOnClickListener(this);
		// borrar
		Button buttonC = (Button) findViewById(R.id.botonC);
		buttonC.setOnClickListener(this);

	}

	// método onClick que se ejecuta cuando se hace clic en un botón
	public void onClick(View v) {

		// hacemos una u otra acción según el botón pulsado (según la id)
		switch (v.getId()) {

		case (R.id.boton1):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 1
			num = num * 10 + 1;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "1");

			break;

		case (R.id.boton2):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 2
			num = num * 10 + 2;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "2");
			break;

		case (R.id.boton3):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 3
			num = num * 10 + 3;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "3");
			break;

		case (R.id.boton4):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 4
			num = num * 10 + 4;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "4");
			break;

		case (R.id.boton5):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");

			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 5
			num = num * 10 + 5;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "5");
			break;

		case (R.id.boton6):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 6
			num = num * 10 + 6;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "6");
			break;

		case (R.id.boton7):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 7
			num = num * 10 + 7;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "7");
			break;

		case (R.id.boton8):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 8
			num = num * 10 + 8;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "8");
			break;

		case (R.id.boton9):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10 y sumando 9
			num = num * 10 + 9;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "9");
			break;

		case (R.id.botonCero):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 10
			num = num * 10;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "0");
			break;

		case (R.id.boton00):
			// si es una nueva operación limpiamos la anterior
			if (nuevaOp == true)
				cajaTexto.setText("");
			nuevaOp = false;

			// modificamos el numero multiplicándolo por 100
			num = num * 100;
			// mostramos el nuevo número por pantalla
			cajaTexto.setText(cajaTexto.getText() + "00");
			break;

		case (R.id.botonMas):
			if (nuevaOp == true)
				cajaTexto.setText("0");

			// calculamos el resultado de la operacion anterior
			resultado = operaciones(resultado, num, operacion);

			// definimos el nuevo número y la suma
			num = 0;
			operacion = 1;
			cajaTexto.setText(cajaTexto.getText() + "+");

			nuevaOp = false;
			break;

		case (R.id.botonMenos):
			if (nuevaOp == true)
				cajaTexto.setText("0");

			// calculamos el resultado de la operacion anterior
			resultado = operaciones(resultado, num, operacion);

			// definimos el nuevo número y la resta
			num = 0;
			operacion = 2;
			cajaTexto.setText(cajaTexto.getText() + "-");

			nuevaOp = false;
			break;

		case (R.id.botonMult):
			if (nuevaOp == true)
				cajaTexto.setText("0");

			// calculamos el resultado de la operacion anterior
			resultado = operaciones(resultado, num, operacion);

			// definimos el nuevo número y la multiplicación
			num = 0;
			operacion = 3;
			cajaTexto.setText(cajaTexto.getText() + "x");

			nuevaOp = false;
			break;

		case (R.id.botonDiv):
			if (nuevaOp == true)
				cajaTexto.setText("0");

			// calculamos el resultado de la operacion anterior
			resultado = operaciones(resultado, num, operacion);

			// definimos el nuevo número y la división
			num = 0;
			operacion = 4;
			cajaTexto.setText(cajaTexto.getText() + "÷");
			nuevaOp = false;
			break;

		case (R.id.botonPorciento):
			if (nuevaOp == true)
				cajaTexto.setText("0");

			// calculamos el resultado según la operación anterior
			if (operacion == 1)
				resultado = resultado + (num / 100 * resultado);
			else if (operacion == 2)
				resultado = resultado - (num / 100 * resultado);
			else if (operacion == 3)
				resultado = resultado * (num / 100 * resultado);
			else if (operacion == 4)
				resultado = resultado / (num / 100 * resultado);
			else
				resultado = num / 100;

			resultado = operaciones(resultado, num, operacion);

			// definimos el nuevo número y la operación
			num = 0;
			operacion = 5;
			cajaTexto.setText(cajaTexto.getText() + "%");
			break;

		case (R.id.botonIgual):

			// calculamos el resultado final según la operación anterior
			resultado = operaciones(resultado, num, operacion);

			// mostramos el resultado final de las operaciones
			cajaTexto.setText(cajaTexto.getText() + "=" + resultado);

			// reiniciamos las variables
			resultado = 0;
			num = 0;
			operacion = 0;
			nuevaOp = true;

			break;

		case (R.id.botonC):

			// reiniciamos todas las variables
			resultado = 0;
			num = 0;
			operacion = 0;
			cajaTexto.setText("");
			nuevaOp = true;
			break;

		}// end switch

	} // end onClick

	private double operaciones(double resultado, double num, int op) {

		// calculamos el resultado de la operación anterior
		if (operacion == 1)
			resultado = resultado + num;
		else if (operacion == 2)
			resultado = resultado - num;
		else if (operacion == 3)
			resultado = resultado * num;
		else if (operacion == 4)
			resultado = resultado / num;
		else if (operacion == 5)
			// porcentaje ya está calculado
			resultado = resultado;
		else
			resultado = num;

		return resultado;

	}

}// end main

