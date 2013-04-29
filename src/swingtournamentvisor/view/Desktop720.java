package swingtournamentvisor.view;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Desktop720 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Desktop720() {
        initComponents();
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getSize());
        int wdwLeft = screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height - windowSize.height;
        pack();
        setLocation(wdwLeft, wdwTop);
        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
                cursorImg, new Point(0, 0), "blank cursor");
        getContentPane().setCursor(blankCursor);

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public JLabel getAddons() {
        return addons;
    }

    public JLabel getAddonsLabel() {
        return prizesLabel;
    }

    public JLabel getAnte() {
        return ante;
    }

    public JLabel getAnteLabel() {
        return anteLabel;
    }

    public JLabel getBb() {
        return bb;
    }

    public JLabel getBbLabel() {
        return bbLabel;
    }

    public JPanel getBlindsPanel() {
        return blindsPanel;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public JLabel getBreakIn() {
        return breakIn;
    }

    public JLabel getBreakInLabel() {
        return breakInLabel;
    }

    public JLabel getBuyins() {
        return buyins;
    }

    public JLabel getBuyinsLabel() {
        return buyinsLabel;
    }

    public JLabel getChipsAverageLabel() {
        return chipsAverageLabel;
    }

    public JLabel getFirst() {
        return secondPos;
    }

    public JLabel getjLabel1() {
        return backgroudLabel;
    }

    public JLabel getAnnuncement() {
        return announcement;
    }

    public JPanel getLeftPanel() {
        return leftPanel;
    }

    public JLabel getLevel() {
        return level;
    }

    public JLabel getLevelLabel() {
        return levelLabel;
    }

    public JLabel getFirstMoney() {
        return firstMoney;
    }

    public ArrayList<JLabel> getMoneyList() {
       return new ArrayList<>(Arrays.asList(secondMoney, thirdMoney, forthMoney, fifthMoney, sixthMoney));
       
    }

    public JLabel getPlayed() {
        return played;
    }

    public JLabel getPlayedLabel() {
        return playedLabel;
    }

    public JLabel getNextLevel() {
        return nextLevel;
    }

    public JLabel getNextLevelLabel() {
        return nextLevelLabel;
    }

    public JLabel getLivePlayers() {
        return livePlayers;
    }

    public JLabel getChipsAverage() {
        return chipsAverage;
    }

    public JLabel getPlayersLabel() {
        return playersLabel;
    }

    public ArrayList<JLabel> getPosList() {
        return new ArrayList<>(Arrays.asList(secondPos, thirdPos, forthPos, fifthPos, sixthPos));
    }

    public JLabel getRebuys() {
        return rebuys;
    }

    public JLabel getRebuysLabel() {
        return rebuysLabel;
    }

    public JLabel getSb() {
        return sb;
    }

    public JLabel getSbLabel() {
        return sbLabel;
    }

    public JLabel getSubName() {
        return subName;
    }

    public JPanel getSummary() {
        return summary;
    }

    public JLabel getTime() {
        return time;
    }

    public JLabel getBreakLabel(){
        return breakLabel;
    }
    
    public JPanel getTimePanel() {
        return timePanel;
    }

    public JPanel getTitlePane() {
        return titlePane;
    }

    public JPanel getBackgroundPane() {
        return backgroundPane;
    }

    public JLabel getAnnouncement() {
        return announcement;
    }

    public JLabel getBackgroudLabel() {
        return backgroudLabel;
    }
    
    public JLabel getTournamentName() {
        return tournamentName;
    }

    public JLabel getFifthMoney() {
        return fifthMoney;
    }

    public JLabel getForthMoney() {
        return forthMoney;
    }

    public JLabel getSecondMoney() {
        return secondMoney;
    }

    public JLabel getSixthMoney() {
        return sixthMoney;
    }

    public JLabel getThirdMoney() {
        return thirdMoney;
    }
    
    public JPanel getPausePanel(){
        return pausePanel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        leftPanel = new javax.swing.JPanel();
        levelLabel = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        playedLabel = new javax.swing.JLabel();
        played = new javax.swing.JLabel();
        breakInLabel = new javax.swing.JLabel();
        breakIn = new javax.swing.JLabel();
        buyinsLabel = new javax.swing.JLabel();
        buyins = new javax.swing.JLabel();
        rebuysLabel = new javax.swing.JLabel();
        rebuys = new javax.swing.JLabel();
        prizesLabel = new javax.swing.JLabel();
        addons = new javax.swing.JLabel();
        thirdMoney = new javax.swing.JLabel();
        secondPos = new javax.swing.JLabel();
        fifthPos = new javax.swing.JLabel();
        firstPos = new javax.swing.JLabel();
        thirdPos = new javax.swing.JLabel();
        sixthPos = new javax.swing.JLabel();
        forthPos = new javax.swing.JLabel();
        firstMoney = new javax.swing.JLabel();
        forthMoney = new javax.swing.JLabel();
        fifthMoney = new javax.swing.JLabel();
        sixthMoney = new javax.swing.JLabel();
        secondMoney = new javax.swing.JLabel();
        addonsLabel1 = new javax.swing.JLabel();
        titlePane = new javax.swing.JPanel();
        tournamentName = new javax.swing.JLabel();
        subName = new javax.swing.JLabel();
        timePanel = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        blindsPanel = new javax.swing.JPanel();
        anteLabel = new javax.swing.JLabel();
        ante = new javax.swing.JLabel();
        sbLabel = new javax.swing.JLabel();
        sb = new javax.swing.JLabel();
        bbLabel = new javax.swing.JLabel();
        bb = new javax.swing.JLabel();
        summary = new javax.swing.JPanel();
        playersLabel = new javax.swing.JLabel();
        nextLevel = new javax.swing.JLabel();
        chipsAverageLabel = new javax.swing.JLabel();
        nextLevelLabel = new javax.swing.JLabel();
        livePlayers = new javax.swing.JLabel();
        chipsAverage = new javax.swing.JLabel();
        announcement = new javax.swing.JLabel();
        pausePanel = new javax.swing.JPanel();
        breakLabel = new javax.swing.JLabel();
        backgroundPane = new javax.swing.JPanel();
        backgroudLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("Visor"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(null);

        leftPanel.setOpaque(false);
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        levelLabel.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(255, 255, 255));
        levelLabel.setText("LEVEL");
        leftPanel.add(levelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, 60));

        level.setFont(new java.awt.Font("Exo", 1, 60)); // NOI18N
        level.setForeground(new java.awt.Color(255, 255, 255));
        level.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        level.setText("0");
        leftPanel.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 120, 60));

        playedLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        playedLabel.setForeground(new java.awt.Color(255, 255, 255));
        playedLabel.setText("PLAYED");
        leftPanel.add(playedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 45));

        played.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        played.setForeground(new java.awt.Color(255, 255, 255));
        played.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        played.setText("00:00");
        leftPanel.add(played, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 45));

        breakInLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        breakInLabel.setForeground(new java.awt.Color(255, 255, 255));
        breakInLabel.setText("BREAK IN");
        leftPanel.add(breakInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 45));

        breakIn.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        breakIn.setForeground(new java.awt.Color(255, 255, 255));
        breakIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        breakIn.setText("00:00");
        leftPanel.add(breakIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, 45));

        buyinsLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        buyinsLabel.setForeground(new java.awt.Color(255, 255, 255));
        buyinsLabel.setText("BUY-INS");
        leftPanel.add(buyinsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, 45));

        buyins.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        buyins.setForeground(new java.awt.Color(255, 255, 255));
        buyins.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buyins.setText("0");
        leftPanel.add(buyins, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, 45));

        rebuysLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        rebuysLabel.setForeground(new java.awt.Color(255, 255, 255));
        rebuysLabel.setText("REBUY-REE");
        leftPanel.add(rebuysLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 45));

        rebuys.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        rebuys.setForeground(new java.awt.Color(255, 255, 255));
        rebuys.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rebuys.setText("0");
        leftPanel.add(rebuys, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, 45));

        prizesLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        prizesLabel.setForeground(new java.awt.Color(255, 255, 255));
        prizesLabel.setText("PRIZES");
        leftPanel.add(prizesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 45));

        addons.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        addons.setForeground(new java.awt.Color(255, 255, 255));
        addons.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addons.setText("0");
        leftPanel.add(addons, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 120, 45));

        thirdMoney.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        thirdMoney.setForeground(new java.awt.Color(255, 255, 255));
        thirdMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thirdMoney.setText("0 €");
        leftPanel.add(thirdMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 160, 40));

        secondPos.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        secondPos.setForeground(new java.awt.Color(255, 255, 255));
        secondPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondPos.setText("2º");
        leftPanel.add(secondPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, 40));

        fifthPos.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        fifthPos.setForeground(new java.awt.Color(255, 255, 255));
        fifthPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fifthPos.setText("5º");
        leftPanel.add(fifthPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 40));

        firstPos.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        firstPos.setForeground(new java.awt.Color(255, 255, 255));
        firstPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstPos.setText("1º");
        leftPanel.add(firstPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 40));

        thirdPos.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        thirdPos.setForeground(new java.awt.Color(255, 255, 255));
        thirdPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thirdPos.setText("3º");
        leftPanel.add(thirdPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 120, 40));

        sixthPos.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        sixthPos.setForeground(new java.awt.Color(255, 255, 255));
        sixthPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sixthPos.setText("6º");
        leftPanel.add(sixthPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 120, 40));

        forthPos.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        forthPos.setForeground(new java.awt.Color(255, 255, 255));
        forthPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        forthPos.setText("4º");
        leftPanel.add(forthPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 120, 40));

        firstMoney.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        firstMoney.setForeground(new java.awt.Color(255, 255, 255));
        firstMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstMoney.setText("0 €");
        leftPanel.add(firstMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, 40));

        forthMoney.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        forthMoney.setForeground(new java.awt.Color(255, 255, 255));
        forthMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        forthMoney.setText("0 €");
        leftPanel.add(forthMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 160, 40));

        fifthMoney.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        fifthMoney.setForeground(new java.awt.Color(255, 255, 255));
        fifthMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fifthMoney.setText("0 €");
        leftPanel.add(fifthMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 160, 40));

        sixthMoney.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        sixthMoney.setForeground(new java.awt.Color(255, 255, 255));
        sixthMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sixthMoney.setText("0 €");
        leftPanel.add(sixthMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 160, 40));

        secondMoney.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        secondMoney.setForeground(new java.awt.Color(255, 255, 255));
        secondMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondMoney.setText("0 €");
        leftPanel.add(secondMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 160, 40));

        addonsLabel1.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        addonsLabel1.setForeground(new java.awt.Color(255, 255, 255));
        addonsLabel1.setText("ADDONS");
        leftPanel.add(addonsLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 45));

        getContentPane().add(leftPanel);
        leftPanel.setBounds(0, 90, 310, 630);

        titlePane.setOpaque(false);
        titlePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tournamentName.setFont(new java.awt.Font("Exo", 1, 60)); // NOI18N
        tournamentName.setForeground(new java.awt.Color(255, 255, 255));
        tournamentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tournamentName.setText("Name");
        tournamentName.setRequestFocusEnabled(false);
        titlePane.add(tournamentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        subName.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        subName.setForeground(new java.awt.Color(255, 255, 255));
        subName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subName.setText("subName");
        titlePane.add(subName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 30));

        getContentPane().add(titlePane);
        titlePane.setBounds(0, 0, 1280, 80);

        timePanel.setOpaque(false);
        timePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("CPTMono", 1, 325)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("00:00");
        time.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        time.setRequestFocusEnabled(false);
        timePanel.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 960, 330));

        getContentPane().add(timePanel);
        timePanel.setBounds(320, 90, 960, 320);

        bottomPanel.setOpaque(false);
        bottomPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blindsPanel.setOpaque(false);
        blindsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anteLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        anteLabel.setForeground(new java.awt.Color(255, 255, 255));
        anteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anteLabel.setText("ANTE");
        blindsPanel.add(anteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));

        ante.setFont(new java.awt.Font("Exo", 1, 45)); // NOI18N
        ante.setForeground(new java.awt.Color(255, 255, 255));
        ante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ante.setText("0");
        blindsPanel.add(ante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 50));

        sbLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        sbLabel.setForeground(new java.awt.Color(255, 255, 255));
        sbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sbLabel.setText("SB");
        blindsPanel.add(sbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 320, 30));

        sb.setFont(new java.awt.Font("Exo", 1, 45)); // NOI18N
        sb.setForeground(new java.awt.Color(255, 255, 255));
        sb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sb.setText("0");
        blindsPanel.add(sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 320, 50));

        bbLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        bbLabel.setForeground(new java.awt.Color(255, 255, 255));
        bbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbLabel.setText("BB");
        blindsPanel.add(bbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 320, 30));

        bb.setFont(new java.awt.Font("Exo", 1, 45)); // NOI18N
        bb.setForeground(new java.awt.Color(255, 255, 255));
        bb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bb.setText("0");
        blindsPanel.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 320, 50));

        bottomPanel.add(blindsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));

        summary.setOpaque(false);
        summary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playersLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        playersLabel.setForeground(new java.awt.Color(255, 255, 255));
        playersLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playersLabel.setText("PLAYERS");
        summary.add(playersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 160, 40));

        nextLevel.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        nextLevel.setForeground(new java.awt.Color(255, 255, 255));
        nextLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        summary.add(nextLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 440, 40));

        chipsAverageLabel.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        chipsAverageLabel.setForeground(new java.awt.Color(255, 255, 255));
        chipsAverageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chipsAverageLabel.setText("CHIPS AVERAGE");
        summary.add(chipsAverageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 250, 40));

        nextLevelLabel.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        nextLevelLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextLevelLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextLevelLabel.setText("NEXT LEVEL");
        summary.add(nextLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 250, 40));

        livePlayers.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        livePlayers.setForeground(new java.awt.Color(255, 255, 255));
        livePlayers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        livePlayers.setText("0/0");
        summary.add(livePlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 40));

        chipsAverage.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        chipsAverage.setForeground(new java.awt.Color(255, 255, 255));
        chipsAverage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chipsAverage.setText("0");
        summary.add(chipsAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 240, 40));

        bottomPanel.add(summary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 960, 120));

        announcement.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        announcement.setForeground(new java.awt.Color(255, 255, 255));
        announcement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bottomPanel.add(announcement, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 870, 60));

        pausePanel.setOpaque(false);

        breakLabel.setFont(new java.awt.Font("Exo", 0, 60)); // NOI18N
        breakLabel.setForeground(new java.awt.Color(255, 255, 255));
        breakLabel.setText("BREAK TIME");
        pausePanel.add(breakLabel);

        bottomPanel.add(pausePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 960, 100));

        getContentPane().add(bottomPanel);
        bottomPanel.setBounds(320, 410, 960, 310);

        backgroundPane.setOpaque(false);
        backgroundPane.setLayout(new java.awt.GridBagLayout());

        backgroudLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingtournamentvisor/view/viewerBack720.jpg"))); // NOI18N
        backgroudLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        backgroundPane.add(backgroudLabel, gridBagConstraints);

        getContentPane().add(backgroundPane);
        backgroundPane.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addons;
    private javax.swing.JLabel addonsLabel1;
    private javax.swing.JLabel announcement;
    private javax.swing.JLabel ante;
    private javax.swing.JLabel anteLabel;
    private javax.swing.JLabel backgroudLabel;
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JLabel bb;
    private javax.swing.JLabel bbLabel;
    private javax.swing.JPanel blindsPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel breakIn;
    private javax.swing.JLabel breakInLabel;
    private javax.swing.JLabel breakLabel;
    private javax.swing.JLabel buyins;
    private javax.swing.JLabel buyinsLabel;
    private javax.swing.JLabel chipsAverage;
    private javax.swing.JLabel chipsAverageLabel;
    private javax.swing.JLabel fifthMoney;
    private javax.swing.JLabel fifthPos;
    private javax.swing.JLabel firstMoney;
    private javax.swing.JLabel firstPos;
    private javax.swing.JLabel forthMoney;
    private javax.swing.JLabel forthPos;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel level;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel livePlayers;
    private javax.swing.JLabel nextLevel;
    private javax.swing.JLabel nextLevelLabel;
    private javax.swing.JPanel pausePanel;
    private javax.swing.JLabel played;
    private javax.swing.JLabel playedLabel;
    private javax.swing.JLabel playersLabel;
    private javax.swing.JLabel prizesLabel;
    private javax.swing.JLabel rebuys;
    private javax.swing.JLabel rebuysLabel;
    private javax.swing.JLabel sb;
    private javax.swing.JLabel sbLabel;
    private javax.swing.JLabel secondMoney;
    private javax.swing.JLabel secondPos;
    private javax.swing.JLabel sixthMoney;
    private javax.swing.JLabel sixthPos;
    private javax.swing.JLabel subName;
    private javax.swing.JPanel summary;
    private javax.swing.JLabel thirdMoney;
    private javax.swing.JLabel thirdPos;
    private javax.swing.JLabel time;
    private javax.swing.JPanel timePanel;
    private javax.swing.JPanel titlePane;
    private javax.swing.JLabel tournamentName;
    // End of variables declaration//GEN-END:variables
}
