<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".PerformingAction">



    <TextView
        android:id="@+id/textView5"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:paddingHorizontal="60dp"
        android:paddingVertical="20px"
        android:layout_marginBottom= "30px"
        android:text="CGPA Calculator"
        android:textStyle="bold"
        android:textSize="30dp"
        android:textColor="@color/white"
        android:background="@color/blue"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:layout_marginTop="50dp"
        android:text="Chandra Vardhan"
        android:textStyle="bold"
        android:textSize="35dp"
        android:textColor="@color/black"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="12305894"
        android:gravity="center"
        android:textColor="@color/black"
        android:textSize="25dp"
        />
    <ImageView
        android:layout_width="100dp"
        android:layout_height="150dp"
        android:src="@drawable/name"
        android:layout_marginTop="15dp"
        android:scaleType="fitXY"
        android:layout_gravity="center"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Subject1: "
        android:textSize="25dp"
        android:textColor="@color/black"
        android:layout_marginTop="20dp"
        />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="enter the marks"
        android:id="@+id/E1"
        />
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Subject2: "
        android:textSize="25dp"
        android:textColor="@color/black"
        android:layout_marginTop="20dp"
        />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="enter the marks"
        android:id="@+id/E2"
        /><TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Subject3: "
    android:textSize="25dp"
    android:textColor="@color/black"
    android:layout_marginTop="20dp"
    />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="enter the marks"
        android:id="@+id/E3"
        />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="calculate"
        android:layout_gravity="center"
        android:layout_marginTop="20dp"
        android:id="@+id/b1"
/>

</LinearLayout>
