package mestertate.srru.ac.th.myofficer2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by SODA on 20/7/2561.
 */

public class MyAlert {

    //Explicit
    private Context context;
    private String titleString, messageString;

    public MyAlert(Context context,
                   String titleString,
                   String messageString) {
        this.context = context;
        this.titleString = titleString;
        this.messageString = messageString;
    }

    public void  myDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setIcon(R.drawable.mario);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();

    }

}   //Main Class
