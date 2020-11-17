package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button pizza,burger,fries,sandwich,noodles,pasta,biryani,coffee,tea,drinks,order;
    Button pizza_rm,burger_rm,fries_rm,sandwich_rm,noodles_rm,pasta_rm,biryani_rm,coffee_rm,tea_rm,drinks_rm;

    TextView menu, htv, btv, ftv, rtv, fitv, dtv;
    TextView hptv, bptv, fptv, rptv, fiptv, dptv;


    String choices = "";
    String price;

    int hp = 0, bp = 0, fp = 0, sp = 0, np = 0, pp = 0, byp = 0, cp = 0, tp = 0,dp = 0;
    int thp = 0, tbp = 0, tfp = 0, tsp = 0, tnp = 0, tpp = 0, tbyp = 0, tcp = 0, ttp = 0,tdp = 0;
    int total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //htv = findViewById(R.id.pizza_textView);

        pizza=(Button) findViewById(R.id.pizzaButton);
        burger=(Button) findViewById(R.id.burgerButton);
        fries=(Button) findViewById(R.id.friesButton);
        sandwich=(Button) findViewById(R.id.sandwichButton);
        noodles=(Button) findViewById(R.id.noodlesButton);
        pasta=(Button) findViewById(R.id.pastaButton);
        biryani=(Button) findViewById(R.id.biryaniButton);
        coffee=(Button) findViewById(R.id.coffeeButton);
        tea=(Button) findViewById(R.id.teaButton);
        drinks=(Button) findViewById(R.id.drinksButton);

        pizza_rm=(Button) findViewById(R.id.pizzaButton_rm);
        burger_rm=(Button) findViewById(R.id.burgerButton_rm);
        fries_rm=(Button) findViewById(R.id.friesButton_rm);
        sandwich_rm=(Button) findViewById(R.id.sandwichButton_rm);
        noodles_rm=(Button) findViewById(R.id.noodlesButton_rm);
        pasta_rm=(Button) findViewById(R.id.pastaButton_rm);
        biryani_rm=(Button) findViewById(R.id.biryaniButton_rm);
        coffee_rm=(Button) findViewById(R.id.coffeeButton_rm);
        tea_rm=(Button) findViewById(R.id.teaButton_rm);
        drinks_rm=(Button) findViewById(R.id.drinksButton_rm);

        order = (Button) findViewById(R.id.order_button);

    }

    public void add_to_list(View view){
        if (view == findViewById(R.id.pizzaButton)){


            Toast.makeText(this, "Pizza Added", Toast.LENGTH_SHORT).show();
            hp = hp + 1;


            pizza.setText(Integer.toString(hp));

        }else if (view == findViewById(R.id.burgerButton)) {
            Toast.makeText(this, "Burger Added", Toast.LENGTH_SHORT).show();

            bp = bp + 1;

            burger.setText(Integer.toString(bp));

        }else if (view == findViewById(R.id.friesButton)) {
            Toast.makeText(this, "fries Added", Toast.LENGTH_SHORT).show();

            fp = fp + 1;

            fries.setText(Integer.toString(fp));

        }else if (view == findViewById(R.id.sandwichButton)) {
            Toast.makeText(this, "sandwich Added", Toast.LENGTH_SHORT).show();

            sp = sp + 1;

            sandwich.setText(Integer.toString(sp));

        }else if (view == findViewById(R.id.noodlesButton)) {
            Toast.makeText(this, "noodles Added", Toast.LENGTH_SHORT).show();

            np = np + 1;

            noodles.setText(Integer.toString(np));

        }else if (view == findViewById(R.id.pastaButton)) {
            Toast.makeText(this, "pasta Added", Toast.LENGTH_SHORT).show();

            pp = pp + 1;

            pasta.setText(Integer.toString(pp));

        }else if (view == findViewById(R.id.biryaniButton)) {
            Toast.makeText(this, "biryani Added", Toast.LENGTH_SHORT).show();

            byp = byp + 1;

            biryani.setText(Integer.toString(byp));

        }else if (view == findViewById(R.id.coffeeButton)) {
            Toast.makeText(this, "coffee Added", Toast.LENGTH_SHORT).show();

            cp = cp + 1;

            coffee.setText(Integer.toString(cp));

        }else if (view == findViewById(R.id.teaButton)) {
            Toast.makeText(this, "tea Added", Toast.LENGTH_SHORT).show();

            tp = tp + 1;

            tea.setText(Integer.toString(tp));

        }else if (view == findViewById(R.id.drinksButton)) {
            Toast.makeText(this, "drinks Added", Toast.LENGTH_SHORT).show();

            dp = dp + 1;

            drinks.setText(Integer.toString(dp));

        }

    }

    public void rmv_from_list(View view){
        if (view == findViewById(R.id.pizzaButton_rm)) {
            if (hp > 0) {

                hp = hp - 1;
                pizza.setText(Integer.toString(hp));
                Toast.makeText(this, "Pizza Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, " Iteams Removed", Toast.LENGTH_SHORT).show();



        }else if (view == findViewById(R.id.burgerButton_rm)) {


            if (bp > 0) {
                bp = bp - 1;

                burger.setText(Integer.toString(bp));
                Toast.makeText(this, "burger Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.friesButton_rm)) {


            if (fp > 0) {
                fp = fp - 1;

                fries.setText(Integer.toString(fp));
                Toast.makeText(this, "fries Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.sandwichButton_rm)) {


            if (sp > 0) {
                sp = sp - 1;

                sandwich.setText(Integer.toString(sp));
                Toast.makeText(this, "sandwich Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.noodlesButton_rm)) {


            if (np > 0) {
                np = np - 1;

                noodles.setText(Integer.toString(np));
                Toast.makeText(this, "noodles Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.pastaButton_rm)) {


            if (pp > 0) {
                pp = pp - 1;

                pasta.setText(Integer.toString(pp));
                Toast.makeText(this, "pasta Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.biryaniButton_rm)) {


            if (byp > 0) {
                byp = byp - 1;

                biryani.setText(Integer.toString(byp));
                Toast.makeText(this, "biryani Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.coffeeButton_rm)) {

            if (cp > 0) {
                cp = cp - 1;

                coffee.setText(Integer.toString(cp));
                Toast.makeText(this, "coffee Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.teaButton_rm)) {


            if (tp > 0) {
                tp = tp - 1;

                tea.setText(Integer.toString(tp));
                Toast.makeText(this, "tea Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }else if (view == findViewById(R.id.drinksButton_rm)) {


            if (dp > 0) {
                dp = dp - 1;

                drinks.setText(Integer.toString(dp));
                Toast.makeText(this, "drinks Removed", Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, "Iteams Removed", Toast.LENGTH_SHORT).show();

        }



    }

    public void place_order(View view){

        balancesheet();

        Intent i = new Intent(Activity2.this,Activity3.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price", Double.parseDouble(price));
        i.putExtras(bundle);
        startActivity(i);
        choices = "";
    }

    public void balancesheet(){
        thp = hp * 500;
        tbp = bp * 200;
        tfp = fp * 100;
        tsp = sp * 150;
        tnp = np * 100;
        tpp = pp * 200;
        tbyp = byp * 250;
        tcp = cp * 50;
        ttp = tp * 20;
        tdp = dp * 60;
        total = thp+tbp+tfp+tsp+tnp+tpp+tbyp+tcp+ttp+tdp;
        price = Integer.toString(total);

        if (hp > 0) {
            choices = choices + "Pizza       (" + hp + " x 500₹) = " + thp + "₹";
        }

        if (bp > 0) {
            choices = choices + "\n\nBurger       (" + bp + " x 200₹) = " + tbp + "₹";
        }

        if (fp > 0) {
            choices = choices + "\n\nFries       (" + fp + " x 100₹) = " + tfp + "₹";
        }

        if (sp > 0) {
            choices = choices + "\n\nSandwich       (" + sp + " x 150₹) = " + tsp + "₹";
        }

        if (np > 0) {
            choices = choices + "\n\nNoodles       (" + np + " x 100₹) = " + tnp + "₹";
        }

        if (pp > 0) {
            choices = choices + "\n\nPasta       (" + pp + " x 200₹) = " + tpp + "₹";
        }

        if (byp > 0) {
            choices = choices + "\n\nBiryani       (" + byp + " x 250₹) = " + tbyp + "₹";
        }

        if (cp > 0) {
            choices = choices + "\n\nCoffee       (" + cp + " x 50₹) = " + tcp + "₹";
        }

        if (tp > 0) {
            choices = choices + "\n\nTea       (" + tp + " x 20₹) = " + ttp + "₹";
        }

        if (dp > 0) {
            choices = choices + "\n\nDrinks       (" + dp + " x 60₹) = " + tdp + "₹";
        }

    }
}

