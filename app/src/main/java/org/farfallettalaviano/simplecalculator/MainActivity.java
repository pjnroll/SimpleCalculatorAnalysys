package org.farfallettalaviano.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.farfallettalaviano.simplecalculator.utils.Operations;
import org.farfallettalaviano.simplecalculator.utils.Utils;


public class MainActivity extends Activity {
    final static String LOG_TAG = "MainScreen";

    private TextView mTxtVal1;
    private TextView mTxtOp;
    private TextView mTxtVal2;
    private TextView mTxtResult;

    private TextView mTxtFocused;

    private double mVal1;
    private double mVal2;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* TextViews ***********************************************************************/
        mTxtVal1 = Utils.findViewById(this, R.id.txtVal1);
        mTxtOp = Utils.findViewById(this, R.id.txtOp);
        mTxtVal2 = Utils.findViewById(this, R.id.txtVal2);
        mTxtResult = Utils.findViewById(this, R.id.txtResult);

        /*
         * Set mTxtVal1 as the first View with the focus
         */
        mTxtFocused = mTxtVal1;

        OnClickListener txtListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof TextView) {
                    mTxtFocused = (TextView) v;
                }
            }
        };
        mTxtVal1.setOnClickListener(txtListener);
        mTxtOp.setOnClickListener(txtListener);
        mTxtVal2.setOnClickListener(txtListener);

        /* Numbers' Buttons ****************************************************************/
        Button mBtn0 = Utils.findViewById(this, R.id.btn0);
        Button mBtn1 = Utils.findViewById(this, R.id.btn1);
        Button mBtn2 = Utils.findViewById(this, R.id.btn2);
        Button mBtn3 = Utils.findViewById(this, R.id.btn3);
        Button mBtn4 = Utils.findViewById(this, R.id.btn4);
        Button mBtn5 = Utils.findViewById(this, R.id.btn5);
        Button mBtn6 = Utils.findViewById(this, R.id.btn6);
        Button mBtn7 = Utils.findViewById(this, R.id.btn7);
        Button mBtn8 = Utils.findViewById(this, R.id.btn8);
        Button mBtn9 = Utils.findViewById(this, R.id.btn9);
        Button mBtnPlusMinus = Utils.findViewById(this, R.id.btnPlusMinus);
        Button mBtnDot = Utils.findViewById(this, R.id.btnDot);

        OnClickListener btnNumberListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTxtFocused != null && mTxtFocused.getId() != R.id.txtOp) {
                    switch (v.getId()) {
                        case (R.id.btn0):
                            mTxtFocused.setText(String.format("%s0", mTxtFocused.getText()));
                            break;

                        case (R.id.btn1):
                            mTxtFocused.setText(String.format("%s1", mTxtFocused.getText()));
                            break;

                        case (R.id.btn2):
                            mTxtFocused.setText(String.format("%s2", mTxtFocused.getText()));
                            break;

                        case (R.id.btn3):
                            mTxtFocused.setText(String.format("%s3", mTxtFocused.getText()));
                            break;

                        case (R.id.btn4):
                            mTxtFocused.setText(String.format("%s4", mTxtFocused.getText()));
                            break;

                        case (R.id.btn5):
                            mTxtFocused.setText(String.format("%s5", mTxtFocused.getText()));
                            break;

                        case (R.id.btn6):
                            mTxtFocused.setText(String.format("%s6", mTxtFocused.getText()));
                            break;

                        case (R.id.btn7):
                            mTxtFocused.setText(String.format("%s7", mTxtFocused.getText()));
                            break;

                        case (R.id.btn8):
                            mTxtFocused.setText(String.format("%s8", mTxtFocused.getText()));
                            break;

                        case (R.id.btn9):
                            mTxtFocused.setText(String.format("%s9", mTxtFocused.getText()));
                            break;

                        case (R.id.btnPlusMinus):
                            if (!mTxtFocused.getText().equals("")) {
                                String s = mTxtFocused.getText().toString();
                                double val = Double.parseDouble(s);
                                mTxtFocused.setText(String.valueOf(-val));
                            }
                            break;

                        case (R.id.btnDot):
                            if (!mTxtFocused.getText().toString().contains("."))
                                mTxtFocused.setText(String.format("%s.", mTxtFocused.getText()));
                            break;

                        default:
                            break;
                    }
                }
            }
        };

        mBtn0.setOnClickListener(btnNumberListener);
        mBtn1.setOnClickListener(btnNumberListener);
        mBtn2.setOnClickListener(btnNumberListener);
        mBtn3.setOnClickListener(btnNumberListener);
        mBtn4.setOnClickListener(btnNumberListener);
        mBtn5.setOnClickListener(btnNumberListener);
        mBtn6.setOnClickListener(btnNumberListener);
        mBtn7.setOnClickListener(btnNumberListener);
        mBtn8.setOnClickListener(btnNumberListener);
        mBtn9.setOnClickListener(btnNumberListener);
        mBtnPlusMinus.setOnClickListener(btnNumberListener);
        mBtnDot.setOnClickListener(btnNumberListener);

        /* Delete Button *******************************************************************/
        Button btnDelete = Utils.findViewById(this, R.id.btnDelete);
        btnDelete.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTxtFocused != null) {
                    int len = mTxtFocused.getText().length();
                    if (len > 0) {
                        String text = mTxtFocused.getText().toString();
                        text = text.substring(0, len-1);
                        mTxtFocused.setText(text);
                    }
                }
            }
        });

        /* Operations' Buttons *************************************************************/
        Button mBtnAdd = Utils.findViewById(this, R.id.btnAdd);
        Button mBtnSubtract = Utils.findViewById(this, R.id.btnSubtract);
        Button mBtnMultiply = Utils.findViewById(this, R.id.btnMultiply);
        Button mBtnDivide = Utils.findViewById(this, R.id.btnDivide);

        View.OnClickListener btnOpsListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case (R.id.btnAdd):
                        mTxtOp.setText(R.string.add);
                        break;

                    case (R.id.btnSubtract):
                        mTxtOp.setText(R.string.subtract);
                        break;

                    case (R.id.btnMultiply):
                        mTxtOp.setText(R.string.multiply);
                        break;

                    case (R.id.btnDivide):
                        mTxtOp.setText(R.string.divide);
                        break;

                    default:
                        break;
                }
                mTxtFocused = mTxtVal2;
            }
        };

        mBtnAdd.setOnClickListener(btnOpsListener);
        mBtnSubtract.setOnClickListener(btnOpsListener);
        mBtnMultiply.setOnClickListener(btnOpsListener);
        mBtnDivide.setOnClickListener(btnOpsListener);

        /* Result Button *******************************************************************/
        Button mBtnResult = Utils.findViewById(this, R.id.btnResult);

        /*
          This listener understands which operation will be executed
         */
        mBtnResult.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = 0f;

                switch (mTxtOp.getText().toString()) {
                    case ("+"):
                        result = addValues();
                        break;

                    case ("-"):
                        result = subtractValues();
                        break;

                    case ("x"):
                        result = multiplyValues();
                        break;

                    case ("/"):
                        result = divideValues();
                        break;

                    default:
                        mTxtResult.setText(R.string.err_missing_op);
                        break;
                }

                if (result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY) {
                    String s;
                    if (result == Double.NEGATIVE_INFINITY) {
                        s = getString(R.string.err_missing_val);
                    } else {
                        s = getString(R.string.err_divide_by_zero);
                    }
                    mTxtResult.setText(s);
                } else if (!mTxtOp.getText().equals(""))
                    mTxtResult.setText(String.valueOf(result));
            }
        });
    }

    /**
     * This method adds the numbers in their TextViews
     * @return result
     */
    public double addValues () {
        double toRet;
        try {
            mVal1 = Double.valueOf(mTxtVal1.getText().toString());
            mVal2 = Double.valueOf(mTxtVal2.getText().toString());

            toRet = Operations.add(mVal1, mVal2);
        } catch (NumberFormatException ne) {
            Log.e(LOG_TAG, "Empty values");

            toRet = Double.NEGATIVE_INFINITY;
        }
        return toRet;
    }

    /**
     * This method subtracts the numbers in their TextViews
     * @return result
     */
    public double subtractValues () {
        double toRet;
        try {
            mVal1 = Double.valueOf(mTxtVal1.getText().toString());
            mVal2 = Double.valueOf(mTxtVal2.getText().toString());

            toRet = Operations.subtract(mVal1, mVal2);
        } catch (NumberFormatException ne) {
            Log.e(LOG_TAG, "Empty values");

            toRet = Double.NEGATIVE_INFINITY;
        }
        return toRet;
    }

    /**
     * This method multiplies the numbers in their TextViews
     * @return result
     */
    public double multiplyValues () {
        double toRet;
        try {
            mVal1 = Double.valueOf(mTxtVal1.getText().toString());
            mVal2 = Double.valueOf(mTxtVal2.getText().toString());

            toRet = Operations.multiply(mVal1, mVal2);
        } catch (NumberFormatException ne) {
            Log.e(LOG_TAG, "Empty values");

            toRet = Double.NEGATIVE_INFINITY;
        }
        return toRet;
    }

    /**
     * This method divides the numbers in their TextViews
     * @return result
     */
    public double divideValues () {
        double toRet;
        try {
            mVal1 = Double.valueOf(mTxtVal1.getText().toString());
            mVal2 = Double.valueOf(mTxtVal2.getText().toString());
            if (Double.compare(mVal2, 0.0d) == 0)
                throw new ArithmeticException();

            toRet = Operations.divide(mVal1, mVal2);
        } catch (NumberFormatException ne) {
            Log.e(LOG_TAG, "Empty values");

            toRet = Double.NEGATIVE_INFINITY;
        } catch (ArithmeticException ae) {
            Log.e(LOG_TAG, "Divide by 0");

            toRet = Double.POSITIVE_INFINITY;
        }
        return toRet;
    }
}