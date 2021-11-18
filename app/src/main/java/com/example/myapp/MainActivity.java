package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.content.Intent;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mvCover = new ArrayList<>();
    private ArrayList<String> mvTitle = new ArrayList<>();
    private ArrayList<String> mvVoteAverage = new ArrayList<>();
    private ArrayList<String> mvOverview = new ArrayList<>();
    private ArrayList<String> mvReleaseDate = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }
    private void prosesRecyclerViewAdapter() {
        RecyclerView recyclerView = findViewById(R.id.lv_movie);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mvCover, mvTitle, mvVoteAverage, mvOverview, mvReleaseDate, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getData(){
        mvTitle.add("Rogue City");
        mvCover.add("https://themoviedb.org/t/p/w500//9HT9982bzgN5on1sLRmc1GMn6ZC.jpg");
        mvVoteAverage.add("6.1");
        mvOverview.add("Caught in the crosshairs of police corruption and Marseilles warring gangs, a loyal cop must protect his squad by taking matters into his own hands.");
        mvReleaseDate.add("2020-10-30");

        mvTitle.add("Sponge on the Run");
        mvCover.add("https://themoviedb.org/t/p/w500/jlJ8nDhMhCYJuzOw3f52CP1W8MW.jpg");
        mvVoteAverage.add("8.2");
        mvOverview.add("When his best friend Gary is suddenly snatched away, SpongeBob takes Patrick on a madcap mission far beyond Bikini Bottom to save their pink-shelled pal.");
        mvReleaseDate.add("2020-08-14");

        mvTitle.add("Hard Kill");
        mvCover.add("https://themoviedb.org/t/p/w500/ugZW8ocsrfgI95pnQ7wrmKDxIe.jpg");
        mvVoteAverage.add("5.1");
        mvOverview.add("The work of billionaire tech CEO Donovan Chalmers is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.");
        mvReleaseDate.add("2020-10-23");

        mvTitle.add("Roald Dahl's The Witches");
        mvCover.add("https://themoviedb.org/t/p/w500/betExZlgK0l7CZ9CsCBVcwO1OjL.jpg");
        mvVoteAverage.add("6.9");
        mvOverview.add("In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the worlds Grand High Witch has gathered.");
        mvReleaseDate.add("2020-10-26");

        mvTitle.add("2067");
        mvCover.add("https://themoviedb.org/t/p/w500/7D430eqZj8y3oVkLFfsWXGRcpEG.jpg");
        mvVoteAverage.add("4.8");
        mvOverview.add("A lowly utility worker is called to the future by a mysterious radio signal, he must leave his dying wife to embark on a journey that will force him to face his deepest fears in an attempt to change the fabric of reality and save humankind from its greatest environmental crisis yet.");
        mvReleaseDate.add("2020-10-01");

        mvTitle.add("The New Mutants");
        mvCover.add("https://themoviedb.org/t/p/w500/xrI4EnZWftpo1B7tTvlMUXVOikd.jpg");
        mvVoteAverage.add("6.3");
        mvOverview.add("Five young mutants, just discovering their abilities while held in a secret facility against their will, fight to escape their past sins and save themselves.");
        mvReleaseDate.add("2020-08-26");

        mvTitle.add("Welcome to Sudden Death");
        mvCover.add("https://themoviedb.org/t/p/w500/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg");
        mvVoteAverage.add("6.3");
        mvOverview.add("Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the teams owner and Jesses daughter during opening night. Facing a ticking clock and impossible odds, its up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.");
        mvReleaseDate.add("2020-09-04");


        mvTitle.add("Once Upon a Snowman");
        mvCover.add("https://themoviedb.org/t/p/w500/hddzYJtfYYeMDOQVcH58n8m1W3A.jpg");
        mvVoteAverage.add("7.1");
        mvOverview.add("The previously untold origins of Olaf, the innocent and insightful, summer-loving snowman are revealed as we follow Olafs first steps as he comes to life and searches for his identity in the snowy mountains outside Arendelle.");
        mvReleaseDate.add("2020-10-23");


        mvTitle.add("Mulan");
        mvCover.add("https://themoviedb.org/t/p/w500/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg");
        mvVoteAverage.add("7.2");
        mvOverview.add("When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.");
        mvReleaseDate.add("2020-09-04");


        mvTitle.add("After We Collided");
        mvCover.add("https://themoviedb.org/t/p/w500/kiX7UYfOpYrMFSAGbI6j1pFkLzQ.jpg");
        mvVoteAverage.add("7.3");
        mvOverview.add("Tessa finds herself struggling with her complicated relationship with Hardin; she faces a dilemma that could change their lives forever.");
        mvReleaseDate.add("2020-09-02");


        prosesRecyclerViewAdapter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflaterMenu = getMenuInflater();
        inflaterMenu.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menu_about) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        else if(item.getItemId()==R.id.menu_lang) {
            startActivity(new Intent(Settings.ACTION_LOCALE_SETTINGS));
        }
        return true;
    }
}