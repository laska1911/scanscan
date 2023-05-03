

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="#6E6E6E"
tools:context=".MainActivity">

<Button
android:id="@+id/button"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:layout_marginStart="16dp"
android:layout_marginEnd="16dp"
android:layout_marginBottom="16dp"
android:text="Generate"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.498"
app:layout_constraintStart_toStartOf="parent" />

<androidx.cardview.widget.CardView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
app:cardCornerRadius="5dp"
app:layout_constraintBottom_toTopOf="@+id/button"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent">

<LinearLayout
android:layout_width="match_parent"
android:layout_height="match_parent"
android:layout_margin="5dp"
android:orientation="horizontal">

<ImageView
android:id="@+id/imageView"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
tools:srcCompat="@tools:sample/avatars" />
</LinearLayout>

</androidx.cardview.widget.CardView>

<Button
android:id="@+id/bScan"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Scanner"
app:layout_constraintBottom_toTopOf="@+id/button"
app:layout_constraintEnd_toEndOf="@+id/button"
app:layout_constraintStart_toStartOf="@+id/button" />
</androidx.constraintlayout.widget.ConstraintLayout>

