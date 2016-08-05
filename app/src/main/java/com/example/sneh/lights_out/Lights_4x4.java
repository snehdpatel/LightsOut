package com.example.sneh.lights_out;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


public class Lights_4x4 extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights_4x4);

        final ImageView img1 = (ImageView) findViewById(R.id.x4x4_imageView_1);
        final ImageView img2 = (ImageView) findViewById(R.id.x4x4_imageView_2);
        final ImageView img3 = (ImageView) findViewById(R.id.x4x4_imageView_3);
        final ImageView img4 = (ImageView) findViewById(R.id.x4x4_imageView_4);
        final ImageView img5 = (ImageView) findViewById(R.id.x4x4_imageView_5);
        final ImageView img6 = (ImageView) findViewById(R.id.x4x4_imageView_6);
        final ImageView img7 = (ImageView) findViewById(R.id.x4x4_imageView_7);
        final ImageView img8 = (ImageView) findViewById(R.id.x4x4_imageView_8);
        final ImageView img9 = (ImageView) findViewById(R.id.x4x4_imageView_9);
        final ImageView img10 = (ImageView) findViewById(R.id.x4x4_imageView_10);
        final ImageView img11 = (ImageView) findViewById(R.id.x4x4_imageView_11);
        final ImageView img12 = (ImageView) findViewById(R.id.x4x4_imageView_12);
        final ImageView img13 = (ImageView) findViewById(R.id.x4x4_imageView_13);
        final ImageView img14 = (ImageView) findViewById(R.id.x4x4_imageView_14);
        final ImageView img15 = (ImageView) findViewById(R.id.x4x4_imageView_15);
        final ImageView img16 = (ImageView) findViewById(R.id.x4x4_imageView_16);

        Button home = (Button) findViewById(R.id.x4x4_Button1);
        Button reset = (Button) findViewById(R.id.x4x4_Button2);

        final EditText e1 = (EditText) findViewById(R.id.editText1);
        e1.setEnabled(false);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_4x4.this, Lights_out.class));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_4x4.this, Lights_4x4.class));
            }
        });

        Random rn = new Random();
        int on_off = rn.nextInt() % 2;

        if (on_off == 0) {
            img1.setImageResource(R.drawable.light_off);
            img1.setTag("off");
        } else {
            img1.setImageResource(R.drawable.light_on);
            img1.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img2.setImageResource(R.drawable.light_off);
            img2.setTag("off");
        } else {
            img2.setImageResource(R.drawable.light_on);
            img2.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img3.setImageResource(R.drawable.light_off);
            img3.setTag("off");
        } else {
            img3.setImageResource(R.drawable.light_on);
            img3.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img4.setImageResource(R.drawable.light_off);
            img4.setTag("off");
        } else {
            img4.setImageResource(R.drawable.light_on);
            img4.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img5.setImageResource(R.drawable.light_off);
            img5.setTag("off");
        } else {
            img5.setImageResource(R.drawable.light_on);
            img5.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img6.setImageResource(R.drawable.light_off);
            img6.setTag("off");
        } else {
            img6.setImageResource(R.drawable.light_on);
            img6.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img7.setImageResource(R.drawable.light_off);
            img7.setTag("off");
        } else {
            img7.setImageResource(R.drawable.light_on);
            img7.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img8.setImageResource(R.drawable.light_off);
            img8.setTag("off");
        } else {
            img8.setImageResource(R.drawable.light_on);
            img8.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img9.setImageResource(R.drawable.light_off);
            img9.setTag("off");
        } else {
            img9.setImageResource(R.drawable.light_on);
            img9.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img10.setImageResource(R.drawable.light_off);
            img10.setTag("off");
        } else {
            img10.setImageResource(R.drawable.light_on);
            img10.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img11.setImageResource(R.drawable.light_off);
            img11.setTag("off");
        } else {
            img11.setImageResource(R.drawable.light_on);
            img11.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img12.setImageResource(R.drawable.light_off);
            img12.setTag("off");
        } else {
            img12.setImageResource(R.drawable.light_on);
            img12.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img13.setImageResource(R.drawable.light_off);
            img13.setTag("off");
        } else {
            img13.setImageResource(R.drawable.light_on);
            img13.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img14.setImageResource(R.drawable.light_off);
            img14.setTag("off");
        } else {
            img14.setImageResource(R.drawable.light_on);
            img14.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img15.setImageResource(R.drawable.light_off);
            img15.setTag("off");
        } else {
            img15.setImageResource(R.drawable.light_on);
            img15.setTag("on");
        }

        rn = new Random();
        on_off = rn.nextInt() % 2;
        if (on_off == 0) {
            img16.setImageResource(R.drawable.light_off);
            img16.setTag("off");
        } else {
            img16.setImageResource(R.drawable.light_on);
            img16.setTag("on");
        }

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img1.getTag().equals("on")) {
                        img1.setImageResource(R.drawable.light_off);
                        img1.setTag("off");
                    } else {
                        img1.setImageResource(R.drawable.light_on);
                        img1.setTag("on");
                    }

                    if (img2.getTag().equals("on")) {
                        img2.setImageResource(R.drawable.light_off);
                        img2.setTag("off");
                    } else {
                        img2.setImageResource(R.drawable.light_on);
                        img2.setTag("on");
                    }

                    if (img5.getTag().equals("on")) {
                        img5.setImageResource(R.drawable.light_off);
                        img5.setTag("off");
                    } else {
                        img5.setImageResource(R.drawable.light_on);
                        img5.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img1.getTag().equals("on")) {
                        img1.setImageResource(R.drawable.light_off);
                        img1.setTag("off");
                    } else {
                        img1.setImageResource(R.drawable.light_on);
                        img1.setTag("on");
                    }

                    if (img2.getTag().equals("on")) {
                        img2.setImageResource(R.drawable.light_off);
                        img2.setTag("off");
                    } else {
                        img2.setImageResource(R.drawable.light_on);
                        img2.setTag("on");
                    }

                    if (img3.getTag().equals("on")) {
                        img3.setImageResource(R.drawable.light_off);
                        img3.setTag("off");
                    } else {
                        img3.setImageResource(R.drawable.light_on);
                        img3.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img4.getTag().equals("on")) {
                        img4.setImageResource(R.drawable.light_off);
                        img4.setTag("off");
                    } else {
                        img4.setImageResource(R.drawable.light_on);
                        img4.setTag("on");
                    }

                    if (img2.getTag().equals("on")) {
                        img2.setImageResource(R.drawable.light_off);
                        img2.setTag("off");
                    } else {
                        img2.setImageResource(R.drawable.light_on);
                        img2.setTag("on");
                    }

                    if (img3.getTag().equals("on")) {
                        img3.setImageResource(R.drawable.light_off);
                        img3.setTag("off");
                    } else {
                        img3.setImageResource(R.drawable.light_on);
                        img3.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img4.getTag().equals("on")) {
                        img4.setImageResource(R.drawable.light_off);
                        img4.setTag("off");
                    } else {
                        img4.setImageResource(R.drawable.light_on);
                        img4.setTag("on");
                    }

                    if (img3.getTag().equals("on")) {
                        img3.setImageResource(R.drawable.light_off);
                        img3.setTag("off");
                    } else {
                        img3.setImageResource(R.drawable.light_on);
                        img3.setTag("on");
                    }

                    if (img8.getTag().equals("on")) {
                        img8.setImageResource(R.drawable.light_off);
                        img8.setTag("off");
                    } else {
                        img8.setImageResource(R.drawable.light_on);
                        img8.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img1.getTag().equals("on")) {
                        img1.setImageResource(R.drawable.light_off);
                        img1.setTag("off");
                    } else {
                        img1.setImageResource(R.drawable.light_on);
                        img1.setTag("on");
                    }

                    if (img5.getTag().equals("on")) {
                        img5.setImageResource(R.drawable.light_off);
                        img5.setTag("off");
                    } else {
                        img5.setImageResource(R.drawable.light_on);
                        img5.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }

                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img2.getTag().equals("on")) {
                        img2.setImageResource(R.drawable.light_off);
                        img2.setTag("off");
                    } else {
                        img2.setImageResource(R.drawable.light_on);
                        img2.setTag("on");
                    }

                    if (img5.getTag().equals("on")) {
                        img5.setImageResource(R.drawable.light_off);
                        img5.setTag("off");
                    } else {
                        img5.setImageResource(R.drawable.light_on);
                        img5.setTag("on");
                    }

                    if (img10.getTag().equals("on")) {
                        img10.setImageResource(R.drawable.light_off);
                        img10.setTag("off");
                    } else {
                        img10.setImageResource(R.drawable.light_on);
                        img10.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img3.getTag().equals("on")) {
                        img3.setImageResource(R.drawable.light_off);
                        img3.setTag("off");
                    } else {
                        img3.setImageResource(R.drawable.light_on);
                        img3.setTag("on");
                    }

                    if (img8.getTag().equals("on")) {
                        img8.setImageResource(R.drawable.light_off);
                        img8.setTag("off");
                    } else {
                        img8.setImageResource(R.drawable.light_on);
                        img8.setTag("on");
                    }

                    if (img11.getTag().equals("on")) {
                        img11.setImageResource(R.drawable.light_off);
                        img11.setTag("off");
                    } else {
                        img11.setImageResource(R.drawable.light_on);
                        img11.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img4.getTag().equals("on")) {
                        img4.setImageResource(R.drawable.light_off);
                        img4.setTag("off");
                    } else {
                        img4.setImageResource(R.drawable.light_on);
                        img4.setTag("on");
                    }

                    if (img8.getTag().equals("on")) {
                        img8.setImageResource(R.drawable.light_off);
                        img8.setTag("off");
                    } else {
                        img8.setImageResource(R.drawable.light_on);
                        img8.setTag("on");
                    }

                    if (img12.getTag().equals("on")) {
                        img12.setImageResource(R.drawable.light_off);
                        img12.setTag("off");
                    } else {
                        img12.setImageResource(R.drawable.light_on);
                        img12.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img13.getTag().equals("on")) {
                        img13.setImageResource(R.drawable.light_off);
                        img13.setTag("off");
                    } else {
                        img13.setImageResource(R.drawable.light_on);
                        img13.setTag("on");
                    }

                    if (img5.getTag().equals("on")) {
                        img5.setImageResource(R.drawable.light_off);
                        img5.setTag("off");
                    } else {
                        img5.setImageResource(R.drawable.light_on);
                        img5.setTag("on");
                    }

                    if (img10.getTag().equals("on")) {
                        img10.setImageResource(R.drawable.light_off);
                        img10.setTag("off");
                    } else {
                        img10.setImageResource(R.drawable.light_on);
                        img10.setTag("on");
                    }

                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img11.getTag().equals("on")) {
                        img11.setImageResource(R.drawable.light_off);
                        img11.setTag("off");
                    } else {
                        img11.setImageResource(R.drawable.light_on);
                        img11.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }

                    if (img10.getTag().equals("on")) {
                        img10.setImageResource(R.drawable.light_off);
                        img10.setTag("off");
                    } else {
                        img10.setImageResource(R.drawable.light_on);
                        img10.setTag("on");
                    }

                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
                    }

                    if (img14.getTag().equals("on")) {
                        img14.setImageResource(R.drawable.light_off);
                        img14.setTag("off");
                    } else {
                        img14.setImageResource(R.drawable.light_on);
                        img14.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));

                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img11.getTag().equals("on")) {
                        img11.setImageResource(R.drawable.light_off);
                        img11.setTag("off");
                    } else {
                        img11.setImageResource(R.drawable.light_on);
                        img11.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }

                    if (img10.getTag().equals("on")) {
                        img10.setImageResource(R.drawable.light_off);
                        img10.setTag("off");
                    } else {
                        img10.setImageResource(R.drawable.light_on);
                        img10.setTag("on");
                    }

                    if (img12.getTag().equals("on")) {
                        img12.setImageResource(R.drawable.light_off);
                        img12.setTag("off");
                    } else {
                        img12.setImageResource(R.drawable.light_on);
                        img12.setTag("on");
                    }

                    if (img15.getTag().equals("on")) {
                        img15.setImageResource(R.drawable.light_off);
                        img15.setTag("off");
                    } else {
                        img15.setImageResource(R.drawable.light_on);
                        img15.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img11.getTag().equals("on")) {
                        img11.setImageResource(R.drawable.light_off);
                        img11.setTag("off");
                    } else {
                        img11.setImageResource(R.drawable.light_on);
                        img11.setTag("on");
                    }

                    if (img8.getTag().equals("on")) {
                        img8.setImageResource(R.drawable.light_off);
                        img8.setTag("off");
                    } else {
                        img8.setImageResource(R.drawable.light_on);
                        img8.setTag("on");
                    }

                    if (img12.getTag().equals("on")) {
                        img12.setImageResource(R.drawable.light_off);
                        img12.setTag("off");
                    } else {
                        img12.setImageResource(R.drawable.light_on);
                        img12.setTag("on");
                    }

                    if (img16.getTag().equals("on")) {
                        img16.setImageResource(R.drawable.light_off);
                        img16.setTag("off");
                    } else {
                        img16.setImageResource(R.drawable.light_on);
                        img16.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img13.getTag().equals("on")) {
                        img13.setImageResource(R.drawable.light_off);
                        img13.setTag("off");
                    } else {
                        img13.setImageResource(R.drawable.light_on);
                        img13.setTag("on");
                    }

                    if (img14.getTag().equals("on")) {
                        img14.setImageResource(R.drawable.light_off);
                        img14.setTag("off");
                    } else {
                        img14.setImageResource(R.drawable.light_on);
                        img14.setTag("on");
                    }

                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img15.getTag().equals("on")) {
                        img15.setImageResource(R.drawable.light_off);
                        img15.setTag("off");
                    } else {
                        img15.setImageResource(R.drawable.light_on);
                        img15.setTag("on");
                    }

                    if (img10.getTag().equals("on")) {
                        img10.setImageResource(R.drawable.light_off);
                        img10.setTag("off");
                    } else {
                        img10.setImageResource(R.drawable.light_on);
                        img10.setTag("on");
                    }

                    if (img13.getTag().equals("on")) {
                        img13.setImageResource(R.drawable.light_off);
                        img13.setTag("off");
                    } else {
                        img13.setImageResource(R.drawable.light_on);
                        img13.setTag("on");
                    }

                    if (img14.getTag().equals("on")) {
                        img14.setImageResource(R.drawable.light_off);
                        img14.setTag("off");
                    } else {
                        img14.setImageResource(R.drawable.light_on);
                        img14.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img11.getTag().equals("on")) {
                        img11.setImageResource(R.drawable.light_off);
                        img11.setTag("off");
                    } else {
                        img11.setImageResource(R.drawable.light_on);
                        img11.setTag("on");
                    }

                    if (img14.getTag().equals("on")) {
                        img14.setImageResource(R.drawable.light_off);
                        img14.setTag("off");
                    } else {
                        img14.setImageResource(R.drawable.light_on);
                        img14.setTag("on");
                    }

                    if (img16.getTag().equals("on")) {
                        img16.setImageResource(R.drawable.light_off);
                        img16.setTag("off");
                    } else {
                        img16.setImageResource(R.drawable.light_on);
                        img16.setTag("on");
                    }

                    if (img15.getTag().equals("on")) {
                        img15.setImageResource(R.drawable.light_off);
                        img15.setTag("off");
                    } else {
                        img15.setImageResource(R.drawable.light_on);
                        img15.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img15.getTag().equals("on")) {
                        img15.setImageResource(R.drawable.light_off);
                        img15.setTag("off");
                    } else {
                        img15.setImageResource(R.drawable.light_on);
                        img15.setTag("on");
                    }

                    if (img12.getTag().equals("on")) {
                        img12.setImageResource(R.drawable.light_off);
                        img12.setTag("off");
                    } else {
                        img12.setImageResource(R.drawable.light_on);
                        img12.setTag("on");
                    }

                    if (img16.getTag().equals("on")) {
                        img16.setImageResource(R.drawable.light_off);
                        img16.setTag("off");
                    } else {
                        img16.setImageResource(R.drawable.light_on);
                        img16.setTag("on");
                    }
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off") && img10.getTag().equals("off") && img11.getTag().equals("off") && img12.getTag().equals("off") && img13.getTag().equals("off") && img14.getTag().equals("off") && img15.getTag().equals("off") && img16.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                }
            }
        });

    }

}