package com.example.ccmindtest1;

import javafx.scene.layout.AnchorPane;

public class Pane {
    public static void update_pane(AnchorPane A,TreeNode root){
        double last = Math.min(root.getLayoutY() + Draw.RecH / 2 - ROOT.LBlockLen / 2,root.getLayoutY() + Draw.RecH / 2 - ROOT.RBlockLen / 2);
        if(last<0){
            root.setLayoutY(root.getLayoutY()+Math.abs(last));
        }
        last=Math.min(250 + Draw.RecH / 2 - ROOT.LBlockLen / 2,250 + Draw.RecH / 2 - ROOT.RBlockLen / 2);
        System.out.println(root.getLayoutY()+" "+ROOT.LBlockLen / 2+" "+ROOT.RBlockLen / 2);
        if(last>0){
            root.setLayoutY(250);
        }
        last=Math.max(ROOT.LBlockLen / 2,ROOT.RBlockLen / 2);
        if(last>250){
            root.setLayoutY(last);
        }
        last=Math.max(root.getLayoutY() + Draw.RecH / 2 + ROOT.LBlockLen / 2,root.getLayoutY() + Draw.RecH / 2 + ROOT.RBlockLen / 2);
        A.setPrefHeight(last);
    }
}