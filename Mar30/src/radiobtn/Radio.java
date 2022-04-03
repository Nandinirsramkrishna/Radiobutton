package radiobtn;

import java.awt.*;
import java.awt.event.*;
  public class Radio{
  public static void main(String[] args) {
  Frame fm=new Frame("RedioButton Group");
  Label la=new Label("What is your choice:");
  fm.setLayout(new GridLayout(0, 1));
  CheckboxGroup cg1=new CheckboxGroup();
  fm.add(la);
  fm.add(new Checkbox("MATH", cg1, true));
  fm.add(new Checkbox("PHYSICS", cg1, false));
  fm.add(new Checkbox("CHEMISTRY", cg1, false));
  fm.add(new Checkbox("ENGLISH", cg1, false));
  fm.setSize(250,200);
  fm.setVisible(true);
  fm.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  System.exit(0);
  }
  });
  }
}

