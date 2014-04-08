package view;
    
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import model.BeatModelInterface;

public class View implements ActionListener,  Observer, KeyListener {
	ModelInterface model; //Referencia al modelo
	ControllerInterface controller; //Referencia al controller
    //JFrame viewFrame;
    //JPanel viewPanel;
	//BeatBar beatBar;
	//JLabel bpmOutputLabel;
    //JFrame controlFrame;
    //JPanel controlPanel;
    //JLabel bpmLabel;
    //JTextField bpmTextField;
    //JButton setBPMButton;
    //JButton increaseBPMButton;
    //JButton decreaseBPMButton;
    //JMenuBar menuBar;
    //JMenu menu;
    //JMenuItem startMenuItem;
    //JMenuItem stopMenuItem;
		

    public DJView(ControllerInterface controller, ModelInterface model) {	
		this.controller = controller;
		this.model = model;		
		model.registerObserver((Observer)this);
    }
    
    public void createView() {
		// Create all Swing components here
        //viewPanel = new JPanel(new GridLayout(1, 2));
        //viewFrame = new JFrame("View");
        //viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //viewFrame.setSize(new Dimension(100, 80));
        //bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		//beatBar = new BeatBar();
		//beatBar.setValue(0);
        //JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		//bpmPanel.add(beatBar);
        //bpmPanel.add(bpmOutputLabel);
        //viewPanel.add(bpmPanel);
        //viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        //viewFrame.pack();
        //viewFrame.setVisible(true);
	}
  
  
    public void createControls() {
		// Create all Swing components here
        //JFrame.setDefaultLookAndFeelDecorated(true);
        //controlFrame = new JFrame("Control");
        //controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //controlFrame.setSize(new Dimension(100, 80));

        //controlPanel = new JPanel(new GridLayout(1, 2));

        //menuBar = new JMenuBar();
        //menu = new JMenu("DJ Control");
        //startMenuItem = new JMenuItem("Start");
        //menu.add(startMenuItem);
        //startMenuItem.addActionListener(new ActionListener() {
        //    public void actionPerformed(ActionEvent event) {
        //        controller.start();
        //    }
        //});
        //stopMenuItem = new JMenuItem("Stop");
        //menu.add(stopMenuItem); 
        //stopMenuItem.addActionListener(new ActionListener() {
        //    public void actionPerformed(ActionEvent event) {
        //        controller.stop();
        //    }
        //});
        //JMenuItem exit = new JMenuItem("Quit");
        //exit.addActionListener(new ActionListener() {
        //    public void actionPerformed(ActionEvent event) {
        //        System.exit(0);
        //    }
        //});

        //menu.add(exit);
        //menuBar.add(menu);
        //controlFrame.setJMenuBar(menuBar);

        //bpmTextField = new JTextField(2);
        //bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
        //setBPMButton = new JButton("Set");
        //setBPMButton.setSize(new Dimension(10,40));
        //increaseBPMButton = new JButton(">>");
        //decreaseBPMButton = new JButton("<<");
        //setBPMButton.addActionListener(this);
        //increaseBPMButton.addActionListener(this);
        //decreaseBPMButton.addActionListener(this);

        //JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

		//buttonPanel.add(decreaseBPMButton);
		//buttonPanel.add(increaseBPMButton);

        //JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        //enterPanel.add(bpmLabel);
        //enterPanel.add(bpmTextField);
        //JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        //insideControlPanel.add(enterPanel);
        //insideControlPanel.add(setBPMButton);
        //insideControlPanel.add(buttonPanel);
        //controlPanel.add(insideControlPanel);
        
        //bpmLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        //bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        //controlFrame.getRootPane().setDefaultButton(setBPMButton);
        //controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        //controlFrame.pack();
        //controlFrame.setVisible(true);
    }

	//public void enableStopMenuItem() {
    //	stopMenuItem.setEnabled(true);
	//}

	//public void disableStopMenuItem() {
    //	stopMenuItem.setEnabled(false);
	//}

	//public void enableStartMenuItem() {
    //	startMenuItem.setEnabled(true);
	//}

	//public void disableStartMenuItem() {
    //	startMenuItem.setEnabled(false);
	//}

    /* En cada una de las acciones, View llama a su Controller para realice cada una de las acciones*/
    /* En la relación entre el patrón View y el patrón Controller se utiliza el patrón Strategy, para que
     * la View pueda cambiar una estrategia de actuación por otra, cambiando de controller*/
    public void actionPerformed(ActionEvent event) {
		if (event.getSource() == setBPMButton) {
			int bpm = Integer.parseInt(bpmTextField.getText());
        	controller.setBPM(bpm);
		} else if (event.getSource() == increaseBPMButton) {
			controller.increaseBPM();
		} else if (event.getSource() == decreaseBPMButton) {
			controller.decreaseBPM();
		}
    }
    
    public void keyPressed(KeyEvent event){
    	//Si KeyEvent = Q
    		//controller.moverNaveAliadaArriba();
    	//Si KeyEvent = A
    		//controller.moverNaveAliadaAbajo();
    	//Si KeyEvent = O
			//controller.moverNaveAliadaIzquierda();
    	//Si KeyEvent = P
			//controller.moverNaveAliadaDerecha();
    	//Si KeyEvent = Espacio
    		//controller.dispararNaveAliada();
    	
    	
    }

	//public void updateBPM() {
	//	if (model != null) {
	//		int bpm = model.getBPM();
	//		if (bpm == 0) {
	//			if (bpmOutputLabel != null) {
    //   			bpmOutputLabel.setText("offline");
	//			}
	//		} else {
	//			if (bpmOutputLabel != null) {
    //    			bpmOutputLabel.setText("Current BPM: " + model.getBPM());
	//			}
	//		}
	//	}
	//}
  
	//public void updateBeat() {
	//	if (beatBar != null) {
	//		 beatBar.setValue(100);
	//	}
	//}
}
