package com.example.adawson.courseadvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.adawson.courseadvisor.model.Course;

import java.util.List;

public class CourseSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_selection);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));

        //List<Course> courses = loadCoursesFromDatabase();
        //list.setAdapter(new CourseAdapter(courses));
    }
}
