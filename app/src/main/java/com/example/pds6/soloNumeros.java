package com.example.pds6;
import android.text.InputFilter;
import android.text.Spanned;



    public class soloNumeros implements InputFilter {
        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            for (int i = start; i < end; i++) {
                char c = source.charAt(i);
                if (!isAllowedCharacter(c)) {
                    return "";  // Invalid character, reject input
                }
            }
            return null; // Accept input
        }

        private boolean isAllowedCharacter(char c) {
            // Allow only digits and the '-' symbol
            return Character.isDigit(c) || c == '-';
        }
    }


