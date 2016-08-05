package com.example.sneh.lights_out;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Lights_3x3 extends AppCompatActivity {

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights_3x3);
        final ImageView img1 = (ImageView) findViewById(R.id.x3x3_imageView_1);
        final ImageView img2 = (ImageView) findViewById(R.id.x3x3_imageView_2);
        final ImageView img3 = (ImageView) findViewById(R.id.x3x3_imageView_3);
        final ImageView img4 = (ImageView) findViewById(R.id.x3x3_imageView_4);
        final ImageView img5 = (ImageView) findViewById(R.id.x3x3_imageView_5);
        final ImageView img6 = (ImageView) findViewById(R.id.x3x3_imageView_6);
        final ImageView img7 = (ImageView) findViewById(R.id.x3x3_imageView_7);
        final ImageView img8 = (ImageView) findViewById(R.id.x3x3_imageView_8);
        final ImageView img9 = (ImageView) findViewById(R.id.x3x3_imageView_9);

        final EditText e1 = (EditText) findViewById(R.id.editText1);
        e1.setEnabled(false);

        Button home = (Button) findViewById(R.id.x3x3_Button1);
        Button reset = (Button) findViewById(R.id.x3x3_Button2);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_3x3.this, Lights_out.class));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Lights_3x3.this, Lights_3x3.class));
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

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
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

                    if (img4.getTag().equals("on")) {
                        img4.setImageResource(R.drawable.light_off);
                        img4.setTag("off");
                    } else {
                        img4.setImageResource(R.drawable.light_on);
                        img4.setTag("on");
                    }

                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
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

                    if (img1.getTag().equals("on")) {
                        img1.setImageResource(R.drawable.light_off);
                        img1.setTag("off");
                    } else {
                        img1.setImageResource(R.drawable.light_on);
                        img1.setTag("on");
                    }

                    if (img3.getTag().equals("on")) {
                        img3.setImageResource(R.drawable.light_off);
                        img3.setTag("off");
                    } else {
                        img3.setImageResource(R.drawable.light_on);
                        img3.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
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

                    if (img2.getTag().equals("on")) {
                        img2.setImageResource(R.drawable.light_off);
                        img2.setTag("off");
                    } else {
                        img2.setImageResource(R.drawable.light_on);
                        img2.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
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

                    if (img1.getTag().equals("on")) {
                        img1.setImageResource(R.drawable.light_off);
                        img1.setTag("off");
                    } else {
                        img1.setImageResource(R.drawable.light_on);
                        img1.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
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

                    if (img4.getTag().equals("on")) {
                        img4.setImageResource(R.drawable.light_off);
                        img4.setTag("off");
                    } else {
                        img4.setImageResource(R.drawable.light_on);
                        img4.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }

                    if (img5.getTag().equals("on")) {
                        img5.setImageResource(R.drawable.light_off);
                        img5.setTag("off");
                    } else {
                        img5.setImageResource(R.drawable.light_on);
                        img5.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
                    }

                    if (img3.getTag().equals("on")) {
                        img3.setImageResource(R.drawable.light_off);
                        img3.setTag("off");
                    } else {
                        img3.setImageResource(R.drawable.light_on);
                        img3.setTag("on");
                    }

                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }

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
                    count++;
                    e1.setText(String.valueOf(count));
                }

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img8.getTag().equals("on")) {
                        img8.setImageResource(R.drawable.light_off);
                        img8.setTag("off");
                    } else {
                        img8.setImageResource(R.drawable.light_on);
                        img8.setTag("on");
                    }

                    if (img7.getTag().equals("on")) {
                        img7.setImageResource(R.drawable.light_off);
                        img7.setTag("off");
                    } else {
                        img7.setImageResource(R.drawable.light_on);
                        img7.setTag("on");
                    }

                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    v.setEnabled(false);
                } else {
                    if (img9.getTag().equals("on")) {
                        img9.setImageResource(R.drawable.light_off);
                        img9.setTag("off");
                    } else {
                        img9.setImageResource(R.drawable.light_on);
                        img9.setTag("on");
                    }

                    if (img6.getTag().equals("on")) {
                        img6.setImageResource(R.drawable.light_off);
                        img6.setTag("off");
                    } else {
                        img6.setImageResource(R.drawable.light_on);
                        img6.setTag("on");
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

                if (img1.getTag().equals("off") && img2.getTag().equals("off") && img3.getTag().equals("off") && img4.getTag().equals("off") && img5.getTag().equals("off") && img6.getTag().equals("off") && img7.getTag().equals("off") && img8.getTag().equals("off") && img9.getTag().equals("off")) {
                    Toast.makeText(getApplicationContext(), "You WIN !!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    Notification noti = new Notification.Builder(getApplicationContext())
                            .setTicker("Ticker Title")
                            .setContentTitle("Content Title")
                            .setContentText("Notification content.")
                            .setSmallIcon(R.drawable.index)
                            .setContentIntent(pIntent).getNotification();
                    noti.flags=Notification.FLAG_AUTO_CANCEL;
                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, noti);
                    v.setEnabled(false);
                }
            }
        });
    }
}
