package co.example.dddroid.alex.dddroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.OptionsMenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<People> list = new ArrayList<>();
    private RecyclerView recyclerView;
    private PeopleAdapter adapter;
    @Override//lel
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.rcview);
        adapter= new PeopleAdapter(list);
        RecyclerView.LayoutManager pLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(pLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        preparePeopleData();
    }

    private void preparePeopleData() {
        People people = new People("Tweek Tweak","ID:1");
        list.add(people);

        people = new People("Bebe Stevens","ID:2");
        list.add(people);

        people = new People("Bradley Biggle","ID:3");
        list.add(people);

        people = new People("Clyde Donovan","ID:4");
        list.add(people);

        people = new People("Craig Tucker","ID:5");
        list.add(people);

        people = new People("JImmy Valmer","ID:6");
        list.add(people);

        people = new People("Timmy Burch","ID:7");
        list.add(people);

        people = new People("Token Black","ID:8");
        list.add(people);

        people = new People("John Smith","ID:9");
        list.add(people);

        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_activity,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.contactItem:
                Intent intent = new Intent(this, CreateNewContact_.class);
                this.startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}