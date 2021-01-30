package com.sonysri.scientificcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView user_input, sign_Box;
    Button b1, b2, b3, b4, bsin, bcos, btan, blog, bln, bfact, bpower, root, onebyx, bplus, btn7, btn8, btn9, bmul,
            btn4, btn5, btn6, bminus, btn1, btn2, btn3, bdiv, bpi, btn0, bdot, equal;


    String pi = "3.14159265";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_input = findViewById(R.id.input_user);
        sign_Box = findViewById(R.id.sign_user);


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bpower = findViewById(R.id.bpower);
        root = findViewById(R.id.root);
        onebyx = findViewById(R.id.onebyx);
        bplus = findViewById(R.id.bplus);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        bmul = findViewById(R.id.bmul);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        bminus = findViewById(R.id.bminus);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        bdiv = findViewById(R.id.bdiv);
        bpi = findViewById(R.id.bpi);
        btn0 = findViewById(R.id.btn0);
        bdot = findViewById(R.id.bdot);
        equal = findViewById(R.id.equal);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + ".");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText("");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = sign_Box.getText().toString();
                val = val.substring(0, val.length() - 1);
                sign_Box.setText(val);

            }
        });


        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "+");
            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "*");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "/");
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = sign_Box.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                sign_Box.setText(String.valueOf(r));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "(");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + ")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_input.setText(bpi.getText());
                sign_Box.setText(sign_Box.getText() + "pi");

            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "sin");

            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "cos");

            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "tan");

            }
        });
        onebyx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "^" + "(-1)");

            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(sign_Box.getText().toString());
                int fact = factorial(val);
                sign_Box.setText(String.valueOf(fact));
                user_input.setText(val + "!");
            }
        });
        bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(sign_Box.getText().toString());
                double square = d * d;
                sign_Box.setText(String.valueOf(square));
                user_input.setText(d + "²");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "ln");

            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_Box.setText(sign_Box.getText() + "log");

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = sign_Box.getText().toString();
                String replacedstr = val.replace('+', '+').replace('*', '*');
                double result = eval(replacedstr);
                sign_Box.setText(String.valueOf(result));
                user_input.setText(val);
            }
        });

    }

    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {

                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {

                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }
                double parseExpression () {
                    double x = parseTerm();
                    for (; ; ) {
                        if (eat('+')) x += parseTerm();
                        else if (eat('-')) x -= parseTerm();
                        else return x;
                    }
                }
                double parseTerm () {
                    double x = parseFactor();
                    for (; ; ) {
                        if (eat('*')) x *= parseFactor();
                        else if (eat('/')) x /= parseFactor();
                        else return x;
                    }
                }
                    double parseFactor () {
                        if (eat('+')) return parseFactor();
                        if (eat('-')) return -parseFactor();

                        double x;
                        int startPos = this.pos;
                        if (eat('(')) {
                            x = parseExpression();
                            eat(')');
                        } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                            while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                            x = Double.parseDouble(str.substring(startPos, this.pos));
                        } else if (ch >= 'a' && ch <= 'z') {
                            while (ch >= 'a' && ch <= 'z') nextChar();
                            String func = str.substring(startPos, this.pos);
                            x = parseFactor();
                            if (func.equals("sqrt")) x = Math.sqrt(x);
                            else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                            else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                            else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                            else if (func.equals("log")) x = Math.log10(x);
                            else if (func.equals("ln")) x = Math.log(x);
                            else throw new RuntimeException("Unknown function: " + func);
                        } else {
                            throw new RuntimeException("Unexpected: " + (char) ch);
                        }
                        if (eat('^')) x = Math.pow(x, parseFactor());
                        return x;
                    }
                }.parse();

    }
}


