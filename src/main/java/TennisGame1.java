import java.util.Objects;

public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final int matchPoint = 2;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, this.player1Name))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String[] scoreResults = new String[]{"Love","Fifteen","Thirty"};
        int diffScore = Math.abs(m_score1-m_score2);
        if (isAll()) {
            return scoreResults[m_score1] + "-" + "All";
        }
        if (isDeuce()) {
            return "Deuce";
        }
        if ((m_score1>=4 || m_score2>=4) && diffScore == 1)
        {
            return playerComparisons("Advantage ");
        }
        if ((m_score1>=4 || m_score2>=4) && diffScore >= 2)
        {
            return playerComparisons("Win for ");
        }
        return scoreResults[m_score1]+"-"+scoreResults[m_score2];

    }

    private String playerComparisons(String scoreName) {
        StringBuilder score = new StringBuilder(scoreName);
        if (m_score1 > m_score2) {
            score.append(this.player1Name);
        } else score.append(this.player2Name);
        return score.toString();
    }

    private boolean isDeuce() {
        return m_score1 == m_score2 && m_score1 > matchPoint;
    }

    private boolean isAll() {
        return m_score1 == m_score2 && m_score1 < matchPoint;
    }
}
