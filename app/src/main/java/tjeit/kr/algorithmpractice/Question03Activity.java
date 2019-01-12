package tjeit.kr.algorithmpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question03Activity extends BaseActivity {

    private android.widget.Button twoBtn;
    private android.widget.Button threeBtn;
    private android.widget.Button fourBtn;
    private android.widget.Button fiveBtn;
    private android.widget.Button sixBtn;
    private android.widget.Button sevenBtn;
    private android.widget.Button eightBtn;
    private android.widget.Button nineBtn;
    private android.widget.Button totalBtn;
    private android.widget.TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question03);

        bindViews();
        setupEvents();
        setValues();
    }



    @Override
    public void setupEvents() {
        View.OnClickListener guguListener = new View.OnClickListener() {

            //onClick(View v)의 v는 눌리는 값,  v가 가지는 태그를 조회하면 몇단인지 조회 가능
            @Override
            public void onClick(View v) {
                String danStr = v.getTag().toString();

                int dan = Integer.parseInt(danStr);

                String gugudanStr = "";

                for(int i=1; i<=9;i++){
                    gugudanStr += String.format("%d * %d = %d\n",dan,i,dan*i);
                }

                resultTxt.setText(gugudanStr);
            }
        };

        twoBtn.setOnClickListener(guguListener);
        threeBtn.setOnClickListener(guguListener);
        fourBtn.setOnClickListener(guguListener);
        fiveBtn.setOnClickListener(guguListener);
        sixBtn.setOnClickListener(guguListener);
        sevenBtn.setOnClickListener(guguListener);
        eightBtn.setOnClickListener(guguListener);
        nineBtn.setOnClickListener(guguListener);

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.resultTxt = (TextView) findViewById(R.id.resultTxt);
        this.totalBtn = (Button) findViewById(R.id.totalBtn);
        this.nineBtn = (Button) findViewById(R.id.nineBtn);
        this.eightBtn = (Button) findViewById(R.id.eightBtn);
        this.sevenBtn = (Button) findViewById(R.id.sevenBtn);
        this.sixBtn = (Button) findViewById(R.id.sixBtn);
        this.fiveBtn = (Button) findViewById(R.id.fiveBtn);
        this.fourBtn = (Button) findViewById(R.id.fourBtn);
        this.threeBtn = (Button) findViewById(R.id.threeBtn);
        this.twoBtn = (Button) findViewById(R.id.twoBtn);
    }
}
