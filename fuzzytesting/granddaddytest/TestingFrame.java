/*
	This simple extension of the java.awt.Frame class
	contains all the elements necessary to act as the
	main window of an application.
 */
package fuzzytesting.granddaddytest;

import java.awt.*;
import java.beans.PropertyVetoException;
import java.net.URL;
import nrc.fuzzy.*;

import symantec.itools.awt.TabPanel;
import symantec.itools.awt.ImageButton;
import java.beans.PropertyVetoException;

import symantec.itools.multimedia.ImageViewer;
import symantec.itools.awt.RadioButtonGroupPanel;
import symantec.itools.awt.Label3D;
import symantec.itools.awt.BorderPanel;
public class TestingFrame extends Frame
{

	public TestingFrame()
	{
		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		
		//{{INIT_CONTROLS
		setLayout(null);
		setVisible(false);
		setSize(944,682);
		setBackground(new Color(12632256));
		openFileDialog1 = new java.awt.FileDialog(this);
		openFileDialog1.setMode(FileDialog.LOAD);
		openFileDialog1.setTitle("Open");
		//$$ openFileDialog1.move(0,600);
		panelFuzzyValueViewer = new java.awt.Panel();
		panelFuzzyValueViewer.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		panelFuzzyValueViewer.setBounds(672,96,230,160);
		add(panelFuzzyValueViewer);
		tabPanel1 = new symantec.itools.awt.TabPanel();
		try {
			java.lang.String[] tempString = new java.lang.String[7];
			tempString[0] = new java.lang.String("FuzzyValue 1 ");
			tempString[1] = new java.lang.String("FuzzyValue 2");
			tempString[2] = new java.lang.String("NOT FuzzyValue 1");
			tempString[3] = new java.lang.String("NOT FuzzyValue 2");
			tempString[4] = new java.lang.String("Union");
			tempString[5] = new java.lang.String("Intersection");
			tempString[6] = new java.lang.String("Sum");
			tabPanel1.setPanelLabels(tempString);
		}
		catch(java.beans.PropertyVetoException e) { }
		tabPanel1.setBounds(24,12,624,660);
		add(tabPanel1);
		labelFV1 = new java.awt.Label("Fuzzy Value 1:");
		labelFV1.setBounds(672,348,84,24);
		labelFV1.setFont(new Font("Dialog", Font.BOLD, 12));
		add(labelFV1);
		labelFV2 = new java.awt.Label("Fuzzy Value 2:");
		labelFV2.setBounds(672,384,84,24);
		labelFV2.setFont(new Font("Dialog", Font.BOLD, 12));
		add(labelFV2);
		textFieldFV1 = new java.awt.TextField();
		textFieldFV1.setBounds(756,348,150,26);
		add(textFieldFV1);
		textFieldFV2 = new java.awt.TextField();
		textFieldFV2.setBounds(756,384,150,26);
		add(textFieldFV2);
		label8 = new java.awt.Label("Fuzzy Value #");
		label8.setBounds(720,60,80,20);
		label8.setFont(new Font("Dialog", Font.BOLD, 12));
		add(label8);
		labelFuzzyValueNumber = new java.awt.Label("");
		labelFuzzyValueNumber.setBounds(804,60,26,20);
		add(labelFuzzyValueNumber);
		borderPanel1 = new symantec.itools.awt.BorderPanel();
		try {
			borderPanel1.setBevelStyle(symantec.itools.awt.BorderPanel.BEVEL_RAISED);
		}
		catch(java.beans.PropertyVetoException e) { }
		try {
			borderPanel1.setPaddingTop(6);
		}
		catch(java.beans.PropertyVetoException e) { }
		borderPanel1.setLayout(null);
		borderPanel1.setBounds(648,36,274,288);
		add(borderPanel1);
		imageButtonNextValue = new symantec.itools.awt.ImageButton();
		try {
			imageButtonNextValue.setImageURL(FileAndUrlResolution.getFileUrl("graphics/arrowR.gif"));
		}
		catch(java.beans.PropertyVetoException e) { }
		imageButtonNextValue.setBounds(146,216,40,32);
		borderPanel1.add(imageButtonNextValue);
		imageButtonPrevValue = new symantec.itools.awt.ImageButton();
		try {
			imageButtonPrevValue.setImageURL(FileAndUrlResolution.getFileUrl("graphics/new_left_arrow.gif"));
		}
		catch(java.beans.PropertyVetoException e) { }
		imageButtonPrevValue.setBounds(86,216,40,32);
		borderPanel1.add(imageButtonPrevValue);
		borderPanel2 = new symantec.itools.awt.BorderPanel();
		try {
			borderPanel2.setBevelStyle(symantec.itools.awt.BorderPanel.BEVEL_RAISED);
		}
		catch(java.beans.PropertyVetoException e) { }
		try {
			borderPanel2.setPaddingTop(6);
		}
		catch(java.beans.PropertyVetoException e) { }
		borderPanel2.setLayout(null);
		borderPanel2.setBounds(648,336,276,145);
		add(borderPanel2);
		submitButton = new java.awt.Button();
		submitButton.setLabel("Enter");
		submitButton.setBounds(14,79,85,37);
		submitButton.setFont(new Font("Dialog", Font.BOLD, 16));
		submitButton.setBackground(new Color(12632256));
		borderPanel2.add(submitButton);
		nextPairButton = new java.awt.Button();
		nextPairButton.setLabel("Load Next Pair");
		nextPairButton.setBounds(110,79,132,38);
		nextPairButton.setFont(new Font("Dialog", Font.BOLD, 16));
		nextPairButton.setBackground(new Color(12632256));
		borderPanel2.add(nextPairButton);
		borderPanel3 = new symantec.itools.awt.BorderPanel();
		try {
			borderPanel3.setBevelStyle(symantec.itools.awt.BorderPanel.BEVEL_RAISED);
		}
		catch(java.beans.PropertyVetoException e) { }
		try {
			borderPanel3.setPaddingTop(8);
		}
		catch(java.beans.PropertyVetoException e) { }
		borderPanel3.setLayout(null);
		borderPanel3.setBounds(648,480,276,132);
		add(borderPanel3);
		resultsVerifiedButton = new java.awt.Button();
		resultsVerifiedButton.setLabel("Test Verified");
		resultsVerifiedButton.setBounds(38,12,180,38);
		resultsVerifiedButton.setFont(new Font("Dialog", Font.BOLD, 16));
		resultsVerifiedButton.setBackground(new Color(12632256));
		borderPanel3.add(resultsVerifiedButton);
		resultsVerifiedButton.setEnabled(false);
		testResultsButton = new java.awt.Button();
		testResultsButton.setLabel("Show Test Results");
		testResultsButton.setBounds(38,60,180,37);
		testResultsButton.setFont(new Font("Dialog", Font.BOLD, 16));
		testResultsButton.setBackground(new Color(12632256));
		borderPanel3.add(testResultsButton);
		presetTestsButton = new java.awt.Button();
		presetTestsButton.setLabel("Run Preset Tests");
		presetTestsButton.setBounds(696,624,180,37);
		presetTestsButton.setFont(new Font("Dialog", Font.BOLD, 16));
		presetTestsButton.setBackground(new Color(12632256));
		add(presetTestsButton);
		setTitle("A Basic Application");
		//}}
		
		//{{INIT_MENUS
		mainMenuBar = new java.awt.MenuBar();
		menu1 = new java.awt.Menu("File");
		miNew = new java.awt.MenuItem("New");
		miNew.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_N,false));
		menu1.add(miNew);
		miOpen = new java.awt.MenuItem("Open...");
		miOpen.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_O,false));
		menu1.add(miOpen);
		miSave = new java.awt.MenuItem("Save");
		miSave.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_S,false));
		menu1.add(miSave);
		miSaveAs = new java.awt.MenuItem("Save As...");
		menu1.add(miSaveAs);
		menu1.addSeparator();
		miExit = new java.awt.MenuItem("Exit");
		menu1.add(miExit);
		mainMenuBar.add(menu1);
		menu2 = new java.awt.Menu("Edit");
		miCut = new java.awt.MenuItem("Cut");
		miCut.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_X,false));
		menu2.add(miCut);
		miCopy = new java.awt.MenuItem("Copy");
		miCopy.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_C,false));
		menu2.add(miCopy);
		miPaste = new java.awt.MenuItem("Paste");
		miPaste.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_V,false));
		menu2.add(miPaste);
		mainMenuBar.add(menu2);
		menu3 = new java.awt.Menu("Help");
		mainMenuBar.setHelpMenu(menu3);
		miAbout = new java.awt.MenuItem("About..");
		menu3.add(miAbout);
		mainMenuBar.add(menu3);
		setMenuBar(mainMenuBar);
		//$$ mainMenuBar.move(0,564);
		//}}
		
		//{{REGISTER_LISTENERS
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		miOpen.addActionListener(lSymAction);
		miAbout.addActionListener(lSymAction);
		miExit.addActionListener(lSymAction);
		//}}

		standardTitleFont = new Font("Helvetica", Font.PLAIN, 14);
		smallTitleFont = new Font("Helvetica", Font.PLAIN, 10);
		smallLabelFont = new Font("Helvetica", Font.PLAIN, 8);
		    
		graphs = new GraphHandler[NUMBER_OF_FUZZYVALUES];
		alphaGraphs = new GraphHandler[NUMBER_OF_FUZZYVALUES][NUMBER_OF_CUT_TYPES][NUMBER_OF_CUT_LEVELS];
		info = new InfoPanel[NUMBER_OF_FUZZYVALUES];
		
		for(int i=0; i < NUMBER_OF_FUZZYVALUES; i++){
		    graphs[i] = new GraphHandler(MAIN_GRAPH_WIDTH, MAIN_GRAPH_HEIGHT);
		    graphs[i].setBounds( 0, 0, MAIN_GRAPH_WIDTH, MAIN_GRAPH_HEIGHT);
		    
		    switch(i){
		        case FV1: case FV2: 
		            graphs[i].setXAxisTitleText("FuzzyValue (blue)", standardTitleFont);
		            break;
		        case NOT_FV1: case NOT_FV2:
		            graphs[i].setXAxisTitleText("FuzzyValue (blue), NOT FuzzyValue (red)", standardTitleFont);
		            break;
		        case UNION:    
		            graphs[i].setXAxisTitleText("FuzzyValue 1 (blue), FuzzyValue 2 (cyan), Union(red)", standardTitleFont);
		            break;
				case INTERSECTION:    
					graphs[i].setXAxisTitleText("FuzzyValue 1 (blue), FuzzyValue 2 (cyan), Intersection(red)", standardTitleFont);
					break;
				case SUM:    
					graphs[i].setXAxisTitleText("FuzzyValue 1 (blue), FuzzyValue 2 (cyan), Sum (red)", standardTitleFont);
					break;
		    }         

            graphs[i].setYAxisTitleText("Membership Values", standardTitleFont);

    		symantec.itools.awt.TabPanel tabPanel = new symantec.itools.awt.TabPanel();
    		try {
    			java.lang.String[] tempString = new java.lang.String[3];
    			tempString[0] = new java.lang.String("AlphaCut @ 0.0");
    			tempString[1] = new java.lang.String("AlphaCut @ midPoint");
    			tempString[2] = new java.lang.String("AlphaCut @ 1.0");
    			tabPanel.setPanelLabels(tempString);
    		}
    		catch(java.beans.PropertyVetoException e) { }
    		tabPanel.setBounds(0,0,ALPHA_TPANEL_WIDTH,ALPHA_TPANEL_HEIGHT);
            
            for(int j=0; j<NUMBER_OF_CUT_LEVELS; j++){
                Panel alphaPanel = new Panel(new GridLayout(1,2));
                
                for(int k=0; k<NUMBER_OF_CUT_TYPES; k++){
                    alphaGraphs[i][k][j] = new GraphHandler(ALPHA_GRAPH_WIDTH,ALPHA_GRAPH_HEIGHT);
                    alphaGraphs[i][k][j].setBounds(ALPHA_GRAPH_WIDTH*k,0,ALPHA_GRAPH_WIDTH,ALPHA_GRAPH_HEIGHT);
                    
                    switch(k){
                        case WEAK_CUT: 
                            alphaGraphs[i][k][j].setXAxisTitleText("WEAK Cut (red)", smallTitleFont);
        		            break;
        		        case STRONG_CUT:
                            alphaGraphs[i][k][j].setXAxisTitleText("STRONG Cut (red)", smallTitleFont);
        		            break;
        		    }        

                    alphaGraphs[i][k][j].setYAxisTitleText("Membership Values", smallTitleFont);
                    alphaGraphs[i][k][j].setLabelFont(smallLabelFont);
                    
                    alphaPanel.add(alphaGraphs[i][k][j]);
                }

                tabPanel.addTabPanel(tabPanel.getPanelLabel(j), true, alphaPanel);
            }    
                
		    info[i] = new InfoPanel();
		    info[i].setBounds( 0, 0, INFOPANEL_WIDTH, INFOPANEL_HEIGHT);
		    
		    Panel panel = new Panel();
		    panel.add(graphs[i]);
		    panel.add(info[i]);
		    panel.add(tabPanel);

		    tabPanel1.addTabPanel(tabPanel1.getPanelLabel(i), true, panel);
		}    
		
		fuzzyValueViewer = new GraphHandler(widthFuzzyValueViewer, heightFuzzyValueViewer);
		fuzzyValueViewer.setBounds( 0, 0, widthFuzzyValueViewer, heightFuzzyValueViewer);
		fuzzyValueViewer.setXAxisTitleText("FuzzyValue (blue)", smallTitleFont);
        fuzzyValueViewer.setYAxisTitleText("Membership Values", smallTitleFont);
        fuzzyValueViewer.setLabelFont(smallLabelFont);
		panelFuzzyValueViewer.add(fuzzyValueViewer);
				
    	nextArrow = FileAndUrlResolution.getFileUrl("graphics/right_arrow.gif");
    	prevArrow = FileAndUrlResolution.getFileUrl("graphics/left_arrow.gif");
    	thumbsUp = FileAndUrlResolution.getFileUrl("graphics/thumbsup.gif");
    	thumbsDown = FileAndUrlResolution.getFileUrl("graphics/thumbsdown.gif");

	}
	
	public TestingFrame(String title)
	{
		this();
		setTitle(title);
	}
	
    /**
     * Shows or hides the component depending on the boolean flag b.
     * @param b  if true, show the component; otherwise, hide the component.
     * @see java.awt.Component#isVisible
     */
    public void setVisible(boolean b)
	{
		if(b)
		{
			setLocation(50, 50);
		}	
		super.setVisible(b);
	}
	
	public void addNotify()
	{
		// Record the size of the window prior to calling parents addNotify.
		Dimension d = getSize();
		
		super.addNotify();
	
		if (fComponentsAdjusted)
			return;
	
		// Adjust components according to the insets
		setSize(insets().left + insets().right + d.width, insets().top + insets().bottom + d.height);
		Component components[] = getComponents();
		for (int i = 0; i < components.length; i++)
		{
			Point p = components[i].getLocation();
			p.translate(insets().left, insets().top);
			components[i].setLocation(p);
		}
		fComponentsAdjusted = true;
	}
	
	// Used for addNotify check.
	boolean fComponentsAdjusted = false;
	
	//{{DECLARE_CONTROLS
	java.awt.FileDialog openFileDialog1;
	java.awt.Panel panelFuzzyValueViewer;
	symantec.itools.awt.TabPanel tabPanel1;
	java.awt.Label labelFV1;
	java.awt.Label labelFV2;
	java.awt.TextField textFieldFV1;
	java.awt.TextField textFieldFV2;
	java.awt.Label label8;
	java.awt.Label labelFuzzyValueNumber;
	symantec.itools.awt.BorderPanel borderPanel1;
	symantec.itools.awt.ImageButton imageButtonNextValue;
	symantec.itools.awt.ImageButton imageButtonPrevValue;
	symantec.itools.awt.BorderPanel borderPanel2;
	java.awt.Button submitButton;
	java.awt.Button nextPairButton;
	symantec.itools.awt.BorderPanel borderPanel3;
	java.awt.Button resultsVerifiedButton;
	java.awt.Button testResultsButton;
	java.awt.Button presetTestsButton;
	//}}
	
	//{{DECLARE_MENUS
	java.awt.MenuBar mainMenuBar;
	java.awt.Menu menu1;
	java.awt.MenuItem miNew;
	java.awt.MenuItem miOpen;
	java.awt.MenuItem miSave;
	java.awt.MenuItem miSaveAs;
	java.awt.MenuItem miExit;
	java.awt.Menu menu2;
	java.awt.MenuItem miCut;
	java.awt.MenuItem miCopy;
	java.awt.MenuItem miPaste;
	java.awt.Menu menu3;
	java.awt.MenuItem miAbout;
	//}}
	
	//MY ADDITIONS
	GraphHandler fuzzyValueViewer;

	GraphHandler[] graphs;
	GraphHandler[][][] alphaGraphs;
	InfoPanel[] info;
	
    Font standardTitleFont;
    Font smallTitleFont;
	Font smallLabelFont;
		
	URL prevArrow, nextArrow;
	URL thumbsUp, thumbsDown;
	
	static final int FV1 = 0;
	static final int FV2 = 1;
	static final int NOT_FV1 = 2;
	static final int NOT_FV2 = 3;
	static final int UNION = 4;
	static final int INTERSECTION = 5;
	static final int SUM = 6;
	
	static final int NUMBER_OF_FUZZYVALUES = 7;
	
    static final int WEAK_CUT = 0;
    static final int STRONG_CUT = 1;
    
    static final int NUMBER_OF_CUT_LEVELS = 3;
    
    static final int ZERO = 0;
    static final int MID = 1;
    static final int ONE = 2;
    
    static final int NUMBER_OF_CUT_TYPES = 2;
    
	static int widthFuzzyValueViewer = 230;
	static int heightFuzzyValueViewer = 160;

	static final int MAIN_GRAPH_WIDTH = 600;
	static final int MAIN_GRAPH_HEIGHT = 320;
	
	static final int ALPHA_GRAPH_WIDTH = 220;
	static final int ALPHA_GRAPH_HEIGHT = 200;
	
	static final int ALPHA_TPANEL_WIDTH = 480;
	static final int ALPHA_TPANEL_HEIGHT = 250;
	
	static final int INFOPANEL_WIDTH = 110;
	static final int INFOPANEL_HEIGHT = 250;
	
	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == TestingFrame.this)
				Frame1_WindowClosing(event);
		}
	}
	
	void Frame1_WindowClosing(java.awt.event.WindowEvent event)
	{
		setVisible(false);	// hide the Frame
		dispose();			// free the system resources
		System.exit(0);		// close the application
	}
	
	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == miOpen)
				miOpen_Action(event);
			else if (object == miAbout)
				miAbout_Action(event);
			else if (object == miExit)
				miExit_Action(event);
		}
	}
	
	void miAbout_Action(java.awt.event.ActionEvent event)
	{
		//{{CONNECTION
		// Action from About Create and show as modal
		(new AboutDialog(this, true)).setVisible(true);
		//}}
	}
	
	void miExit_Action(java.awt.event.ActionEvent event)
	{
		//{{CONNECTION
		// Action from Exit Create and show as modal
		(new QuitDialog(this, true)).setVisible(true);
		//}}
	}
	
	void miOpen_Action(java.awt.event.ActionEvent event)
	{
		//{{CONNECTION
		// Action from Open... Show the OpenFileDialog
		int		defMode			= openFileDialog1.getMode();
		String	defTitle		= openFileDialog1.getTitle();
		String defDirectory	= openFileDialog1.getDirectory();
		String defFile			= openFileDialog1.getFile();

		openFileDialog1 = new java.awt.FileDialog(this, defTitle, defMode);
		openFileDialog1.setDirectory(defDirectory);
		openFileDialog1.setFile(defFile);
		openFileDialog1.setVisible(true);
		//}}
	}
	
	/************************************************************************
	 *
	 * INTERACTION METHODS
	 *
	 ************************************************************************/
	void setFuzzyValueNumber(int i)
	{
        labelFuzzyValueNumber.setText(""+i);
	}
	 
	void seeNextFuzzyValue(double[] a)
	{
	    fuzzyValueViewer.setGraph(a);
	}   
	
	String getFV1TextField()
	{
	    return(textFieldFV1.getText());
	}   

	String getFV2TextField(){
	    return(textFieldFV2.getText());
	}   

	void setFV1TextField(String s)
	{
	    textFieldFV1.setText(s);
	}   

	void setFV2TextField(String s)
	{
	    textFieldFV2.setText(s);
	}   
	
	ImageButton getNextValueButton()
	{
	    return(imageButtonNextValue);
	}   

	ImageButton getPrevValueButton()
	{
	    return(imageButtonPrevValue);
	}   
	
	Button getSubmitButton()
	{
	    return(submitButton);
	}
	
	Button getResultsVerifiedButton()
	{
	    return(resultsVerifiedButton);
	}    
	
	Button getTestResultsButton()
	{
	    return(testResultsButton);
	}    
	
	Button getNextPairButton()
	{
	    return(nextPairButton);
	}    
	
	Button getRunTestsButton()
	{
	    return(presetTestsButton);
	}    
	
    /*****************************
     * HAVING TO DO WITH TAB PANEL
     *****************************/
	
	void setEmptyIndicator(boolean isEmpty, int i){
        try {
    	    if(isEmpty) info[i].imageViewerEmpty.setImageURL(thumbsUp);
    	    else        info[i].imageViewerEmpty.setImageURL(thumbsDown);
    	} catch(PropertyVetoException e){
    	    System.out.println("" + e.getMessage());
    	}    
	}    
	
	void setConvexIndicator(boolean isConvex, int i){
        try {
    	    if(isConvex) info[i].imageViewerConvex.setImageURL(thumbsUp);
    	    else         info[i].imageViewerConvex.setImageURL(thumbsDown);
    	} catch(PropertyVetoException e){
    	    System.out.println("" + e.getMessage());
    	}    
	}    
	
	void setNormalIndicator(boolean isNormal, int i){
        try {
    	    if(isNormal) info[i].imageViewerNormal.setImageURL(thumbsUp);
    	    else         info[i].imageViewerNormal.setImageURL(thumbsDown);
    	} catch(PropertyVetoException e){
    	    System.out.println("" + e.getMessage());
    	}    
	}    
	
    TextField getFVTextField(int i){
        return((i == 1) ? textFieldFV1 : textFieldFV2);  
    }
    
    void setMaxMin(String maxMin, int i){
        info[i].setMaxMinLabel(maxMin);
    }
    
    void setAlphaCut(nrc.fuzzy.FuzzyValue value, 
                     nrc.fuzzy.FuzzyValue alpha, int whichFV, int cutType, int cutLevel){
                        
        alphaGraphs[whichFV][cutType][cutLevel].setGraph(value, alpha); 
    }
    
    void displayFuzzyValues(nrc.fuzzy.FuzzyValue[] fvs){
        graphs[FV1].setGraph(fvs[FV1]);
        graphs[FV2].setGraph(fvs[FV2]);
        graphs[NOT_FV1].setGraph(fvs[FV1], fvs[NOT_FV1]);
        graphs[NOT_FV2].setGraph(fvs[FV2], fvs[NOT_FV2]);
        graphs[UNION].setGraph(fvs[FV1], fvs[FV2], fvs[UNION]);
		graphs[INTERSECTION].setGraph(fvs[FV1], fvs[FV2], fvs[INTERSECTION]);
		graphs[SUM].setGraph(fvs[FV1], fvs[FV2], fvs[SUM]);
    }    
}
