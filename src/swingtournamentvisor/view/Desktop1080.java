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


public class Desktop1080 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Desktop1080() {
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
        return addonsLabel;
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

    public JLabel getMoneyFirst() {
        return thirdMoney;
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
        addonsLabel = new javax.swing.JLabel();
        addons = new javax.swing.JLabel();
        thirdMoney = new javax.swing.JLabel();
        secondPos = new javax.swing.JLabel();
        fifthPos = new javax.swing.JLabel();
        firstPos = new javax.swing.JLabel();
        thirdPos = new javax.swing.JLabel();
        sixthPos = new javax.swing.JLabel();
        forthPos = new javax.swing.JLabel();
        moneyFirst1 = new javax.swing.JLabel();
        forthMoney = new javax.swing.JLabel();
        fifthMoney = new javax.swing.JLabel();
        sixthMoney = new javax.swing.JLabel();
        secondMoney = new javax.swing.JLabel();
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
        backgroundPane = new javax.swing.JPanel();
        backgroudLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 22, 1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setName("Visor"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        leftPanel.setOpaque(false);
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        levelLabel.setFont(new java.awt.Font("Exo", 1, 52)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("swingtournamentvisor/bundles/Bundle_en_EN"); // NOI18N
        levelLabel.setText(bundle.getString("Desktop.levelLabel.text")); // NOI18N
        leftPanel.add(levelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 60));

        level.setFont(new java.awt.Font("Exo", 1, 60)); // NOI18N
        level.setForeground(new java.awt.Color(255, 255, 255));
        level.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        level.setText("0");
        leftPanel.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, 60));

        playedLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        playedLabel.setForeground(new java.awt.Color(255, 255, 255));
        playedLabel.setText(bundle.getString("Desktop.playedLabel.text")); // NOI18N
        leftPanel.add(playedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 45));

        played.setFont(new java.awt.Font("Exo", 1, 52)); // NOI18N
        played.setForeground(new java.awt.Color(255, 255, 255));
        played.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        played.setText(bundle.getString("Desktop1080.rebuys.text")); // NOI18N
        leftPanel.add(played, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 160, 45));

        breakInLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        breakInLabel.setForeground(new java.awt.Color(255, 255, 255));
        breakInLabel.setText(bundle.getString("Desktop.breakInLabel.text")); // NOI18N
        breakInLabel.setToolTipText(bundle.getString("breakin.text")); // NOI18N
        leftPanel.add(breakInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, 45));

        breakIn.setFont(new java.awt.Font("Exo", 1, 52)); // NOI18N
        breakIn.setForeground(new java.awt.Color(255, 255, 255));
        breakIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        breakIn.setText(bundle.getString("Desktop1080.rebuys.text")); // NOI18N
        leftPanel.add(breakIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 150, 45));

        buyinsLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        buyinsLabel.setForeground(new java.awt.Color(255, 255, 255));
        buyinsLabel.setText(bundle.getString("Desktop.buyinsLabel.text")); // NOI18N
        leftPanel.add(buyinsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 45));

        buyins.setFont(new java.awt.Font("Exo", 1, 52)); // NOI18N
        buyins.setForeground(new java.awt.Color(255, 255, 255));
        buyins.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buyins.setText(bundle.getString("Desktop1080.rebuys.text")); // NOI18N
        leftPanel.add(buyins, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 120, 45));

        rebuysLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        rebuysLabel.setForeground(new java.awt.Color(255, 255, 255));
        rebuysLabel.setText(bundle.getString("Desktop.rebuysLabel.text")); // NOI18N
        leftPanel.add(rebuysLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 45));

        rebuys.setFont(new java.awt.Font("Exo", 1, 52)); // NOI18N
        rebuys.setForeground(new java.awt.Color(255, 255, 255));
        rebuys.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rebuys.setText(bundle.getString("Desktop1080.rebuys.text")); // NOI18N
        leftPanel.add(rebuys, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 120, 45));

        addonsLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        addonsLabel.setForeground(new java.awt.Color(255, 255, 255));
        addonsLabel.setText(bundle.getString("Desktop.addonsLabel.text")); // NOI18N
        leftPanel.add(addonsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 190, 45));

        addons.setFont(new java.awt.Font("Exo", 1, 52)); // NOI18N
        addons.setForeground(new java.awt.Color(255, 255, 255));
        addons.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addons.setText(bundle.getString("Desktop1080.rebuys.text")); // NOI18N
        leftPanel.add(addons, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 120, 45));

        thirdMoney.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        thirdMoney.setForeground(new java.awt.Color(255, 255, 255));
        thirdMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thirdMoney.setText("0");
        leftPanel.add(thirdMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, 160, 40));

        secondPos.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        secondPos.setForeground(new java.awt.Color(255, 255, 255));
        secondPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondPos.setText("Xº");
        leftPanel.add(secondPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 150, 40));

        fifthPos.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        fifthPos.setForeground(new java.awt.Color(255, 255, 255));
        fifthPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fifthPos.setText("Xº");
        leftPanel.add(fifthPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 810, 150, 40));

        firstPos.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        firstPos.setForeground(new java.awt.Color(255, 255, 255));
        firstPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstPos.setText("1º");
        leftPanel.add(firstPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 150, 40));

        thirdPos.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        thirdPos.setForeground(new java.awt.Color(255, 255, 255));
        thirdPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        thirdPos.setText("Xº");
        leftPanel.add(thirdPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 150, 40));

        sixthPos.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        sixthPos.setForeground(new java.awt.Color(255, 255, 255));
        sixthPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sixthPos.setText("Xº");
        leftPanel.add(sixthPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, 150, 40));

        forthPos.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        forthPos.setForeground(new java.awt.Color(255, 255, 255));
        forthPos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        forthPos.setText("Xº");
        leftPanel.add(forthPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 150, 40));

        moneyFirst1.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        moneyFirst1.setForeground(new java.awt.Color(255, 255, 255));
        moneyFirst1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        moneyFirst1.setText("0");
        leftPanel.add(moneyFirst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 160, 40));

        forthMoney.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        forthMoney.setForeground(new java.awt.Color(255, 255, 255));
        forthMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        forthMoney.setText("0");
        leftPanel.add(forthMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 760, 160, 40));

        fifthMoney.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        fifthMoney.setForeground(new java.awt.Color(255, 255, 255));
        fifthMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fifthMoney.setText("0");
        leftPanel.add(fifthMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 810, 160, 40));

        sixthMoney.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        sixthMoney.setForeground(new java.awt.Color(255, 255, 255));
        sixthMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sixthMoney.setText("0");
        leftPanel.add(sixthMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 860, 160, 40));

        secondMoney.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        secondMoney.setForeground(new java.awt.Color(255, 255, 255));
        secondMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondMoney.setText("0");
        leftPanel.add(secondMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, 160, 40));

        getContentPane().add(leftPanel);
        leftPanel.setBounds(0, 130, 470, 900);

        titlePane.setOpaque(false);
        titlePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tournamentName.setFont(new java.awt.Font("Exo", 1, 60)); // NOI18N
        tournamentName.setForeground(new java.awt.Color(255, 255, 255));
        tournamentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tournamentName.setRequestFocusEnabled(false);
        titlePane.add(tournamentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 70));

        subName.setFont(new java.awt.Font("Exo", 1, 26)); // NOI18N
        subName.setForeground(new java.awt.Color(255, 255, 255));
        subName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subName.setText(bundle.getString("Desktop1080.subName.text")); // NOI18N
        titlePane.add(subName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1920, 40));

        getContentPane().add(titlePane);
        titlePane.setBounds(0, 0, 1920, 110);

        timePanel.setOpaque(false);
        timePanel.setLayout(null);

        time.setFont(new java.awt.Font("CPTMono", 1, 450)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText(bundle.getString("Desktop1080.time.text")); // NOI18N
        time.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        time.setAlignmentY(-0.0F);
        time.setRequestFocusEnabled(false);
        timePanel.add(time);
        time.setBounds(5, 6, 1430, 420);

        getContentPane().add(timePanel);
        timePanel.setBounds(480, 110, 1440, 430);

        bottomPanel.setOpaque(false);
        bottomPanel.setLayout(null);

        blindsPanel.setOpaque(false);
        blindsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anteLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        anteLabel.setForeground(new java.awt.Color(255, 255, 255));
        anteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anteLabel.setText(bundle.getString("Desktop1080.anteLabel.text")); // NOI18N
        blindsPanel.add(anteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 443, 30));

        ante.setFont(new java.awt.Font("Exo", 1, 55)); // NOI18N
        ante.setForeground(new java.awt.Color(255, 255, 255));
        ante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ante.setText("0");
        blindsPanel.add(ante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 443, 50));

        sbLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        sbLabel.setForeground(new java.awt.Color(255, 255, 255));
        sbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sbLabel.setText(bundle.getString("Desktop.sbLabel.text")); // NOI18N
        blindsPanel.add(sbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 443, 30));

        sb.setFont(new java.awt.Font("Exo", 1, 55)); // NOI18N
        sb.setForeground(new java.awt.Color(255, 255, 255));
        sb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sb.setText("0");
        blindsPanel.add(sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 443, 50));

        bbLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        bbLabel.setForeground(new java.awt.Color(255, 255, 255));
        bbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbLabel.setText(bundle.getString("Desktop.bbLabel.text")); // NOI18N
        blindsPanel.add(bbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 443, 30));

        bb.setFont(new java.awt.Font("Exo", 1, 55)); // NOI18N
        bb.setForeground(new java.awt.Color(255, 255, 255));
        bb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bb.setText("0");
        blindsPanel.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 443, 50));

        bottomPanel.add(blindsPanel);
        blindsPanel.setBounds(50, 70, 1330, 90);

        summary.setOpaque(false);
        summary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playersLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        playersLabel.setForeground(new java.awt.Color(255, 255, 255));
        playersLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playersLabel.setText(bundle.getString("Desktop.playersLabel.text")); // NOI18N
        summary.add(playersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 160, 40));

        nextLevel.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        nextLevel.setForeground(new java.awt.Color(255, 255, 255));
        nextLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        summary.add(nextLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 440, 60));

        chipsAverageLabel.setFont(new java.awt.Font("Exo", 1, 36)); // NOI18N
        chipsAverageLabel.setForeground(new java.awt.Color(255, 255, 255));
        chipsAverageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chipsAverageLabel.setText(bundle.getString("Desktop.chipsAverageLabel.text")); // NOI18N
        summary.add(chipsAverageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 250, 40));

        nextLevelLabel.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        nextLevelLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextLevelLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextLevelLabel.setText(bundle.getString("Desktop.nextLevelLabel.text")); // NOI18N
        summary.add(nextLevelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 250, 40));

        livePlayers.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        livePlayers.setForeground(new java.awt.Color(255, 255, 255));
        livePlayers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        livePlayers.setText(bundle.getString("Desktop.livePlayers.text")); // NOI18N
        summary.add(livePlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 40));

        chipsAverage.setFont(new java.awt.Font("Exo", 1, 48)); // NOI18N
        chipsAverage.setForeground(new java.awt.Color(255, 255, 255));
        chipsAverage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chipsAverage.setText("0");
        summary.add(chipsAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 240, 40));

        bottomPanel.add(summary);
        summary.setBounds(50, 220, 1330, 120);

        announcement.setFont(new java.awt.Font("Exo", 1, 40)); // NOI18N
        announcement.setForeground(new java.awt.Color(255, 255, 255));
        announcement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bottomPanel.add(announcement);
        announcement.setBounds(50, 380, 1330, 110);

        getContentPane().add(bottomPanel);
        bottomPanel.setBounds(480, 540, 1440, 490);

        backgroundPane.setOpaque(false);
        backgroundPane.setLayout(new java.awt.GridBagLayout());

        backgroudLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingtournamentvisor/view/viewerBack1080.jpg"))); // NOI18N
        backgroudLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        backgroundPane.add(backgroudLabel, gridBagConstraints);

        getContentPane().add(backgroundPane);
        backgroundPane.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addons;
    private javax.swing.JLabel addonsLabel;
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
    private javax.swing.JLabel buyins;
    private javax.swing.JLabel buyinsLabel;
    private javax.swing.JLabel chipsAverage;
    private javax.swing.JLabel chipsAverageLabel;
    private javax.swing.JLabel fifthMoney;
    private javax.swing.JLabel fifthPos;
    private javax.swing.JLabel firstPos;
    private javax.swing.JLabel forthMoney;
    private javax.swing.JLabel forthPos;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel level;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel livePlayers;
    private javax.swing.JLabel moneyFirst1;
    private javax.swing.JLabel nextLevel;
    private javax.swing.JLabel nextLevelLabel;
    private javax.swing.JLabel played;
    private javax.swing.JLabel playedLabel;
    private javax.swing.JLabel playersLabel;
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
