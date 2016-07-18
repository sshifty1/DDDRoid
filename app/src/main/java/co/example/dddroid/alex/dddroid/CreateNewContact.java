package co.example.dddroid.alex.dddroid;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User1 on 2016.07.18..
 */
/*testing githubbbbb*/
@EActivity(R.layout.people_create)
public class CreateNewContact extends Activity {
    String name;
    @ViewById(R.id.edNewPerson)
    EditText editNewPerson;

    @ViewById(R.id.btnAddPerson)
    Button addPerson;


    List<People>lista=new ArrayList<>();
    private PeopleAdapter adapter= new PeopleAdapter(lista);

    @Click(R.id.btnAddPerson)
    void addITEM(){
        name=editNewPerson.toString();
        People people = new People(name,"ID: "+lista.size());
        lista.add(people);
        adapter.notifyDataSetChanged();
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);


    }

}