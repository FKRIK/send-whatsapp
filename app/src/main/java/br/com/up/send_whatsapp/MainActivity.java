package br.com.up.send_whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    //criando variáveis
    private TextInputEditText telefone;
    private TextInputEditText mensagem;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //capturando os inputs
        telefone = findViewById(R.id.input_telefone);
        mensagem = findViewById(R.id.input_mensagem);
        enviar = findViewById(R.id.btn_enviar);

        //listener
        enviar.setOnClickListener(view -> {
            String tel = telefone.getText().toString();
            String msg = mensagem.getText().toString();

            Uri webpage = Uri.parse("https://wa.me/" + tel + "?text=" + msg);
            Intent webintent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webintent);
        });

    }
}