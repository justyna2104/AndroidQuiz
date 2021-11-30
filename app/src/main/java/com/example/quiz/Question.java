package com.example.quiz;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
        public int questionId;
        public boolean trueAnswer;
        public Question(int questionId, boolean trueAnswer){
            this.questionId = questionId;
            this.trueAnswer = trueAnswer;
        }
}
