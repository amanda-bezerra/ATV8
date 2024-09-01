package br.com.amanda.atv8;  // Esse é o pacote onde a nossa classe principal mora.

import android.os.Bundle;  // Importando o pacote para passar dados entre as telas.
import android.view.View;  // Importando a View, que representa qualquer coisa na tela.
import android.widget.Button;  // Importando o botão que vamos usar pra brincar.
import android.widget.Toast;  // Importando o Toast, que é só uma mensagem rápida na tela.
import androidx.appcompat.app.AppCompatActivity;  // Importando a classe que mantém nosso app compatível com versões antigas do Android.

public class MainActivity extends AppCompatActivity {  // Essa é a nossa Activity principal, o coração do app.

    @Override  // A gente tá sobrescrevendo um método padrão aqui, o onCreate.
    protected void onCreate(Bundle bundleDeDiversao) {  // Esse método roda quando a tela é criada. Aqui começa a festa.
        super.onCreate(bundleDeDiversao);  // Chamando o método da superclasse pra garantir que tudo funcione bem.
        setContentView(R.layout.tela_atv8);  // Dizendo pro Android qual layout XML usar pra essa tela divertida.

        // Agora vamos achar o botão lá do XML pelo ID dele, que é bobo, mas útil.
        Button seiLaBuTAUM = findViewById(R.id.sei_la_butaum);  // Conectando o botão do XML ao nosso código pra fazer mágica.

        // Aqui a gente diz o que vai acontecer quando o botão for clicado.
        seiLaBuTAUM.setOnClickListener(new View.OnClickListener() {  // Configurando o ouvinte de clique pra ver quem vai clicar no botão.
            @Override  // Sobrescrevendo o método onClick que vai rolar quando alguém clicar no botão.
            public void onClick(View vistaBoba) {  // Tudo que acontece quando o botão é clicado vai aqui dentro.
                // Quando o botão for clicado, a gente mostra uma mensagem na tela.
                Toast.makeText(MainActivity.this, "Você clicou no Sei Lá BuTAUM!", Toast.LENGTH_SHORT).show();  // Aqui a gente tá mostrando uma mensagem rápida na tela falando que o botão foi clicado.
            }
        });
    }
}
