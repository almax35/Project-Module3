package com.alekseew.projectmodule3.model.service;

import com.alekseew.projectmodule3.model.entity.Language;


public class LanguageService {

    public static String getMessage(String language){
        if (language!=null) {
            Language l = Language.valueOf(language);
            switch (l)  {
                case C:return "R.I.P";
                case Java:return "Good choose";
                case Erlang:return "Strange choose";
                case Pascal:return "How old are you?";
                case Python:return "You can choose better";
                case JavaScript:return "Think again";
            }
        }
        else {
            return "choose language";
        }
        return "This language not support";
    }
}
