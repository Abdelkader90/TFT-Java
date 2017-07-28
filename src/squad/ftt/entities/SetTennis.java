/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.entities;

/**
 *
 * @author hppro
 */
public class SetTennis {
    private int id;
    private int score1;
    private int score2;
    private Matchtennis match;
    
  public SetTennis(){
      
  }  

    public SetTennis(int score1, int score2, Matchtennis match) {
        this.score1=score1;
        this.score2=score2;
        this.match=match;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the score1
     */
    public int getScore1() {
        return score1;
    }

    /**
     * @param score1 the score1 to set
     */
    public void setScore1(int score1) {
        this.score1 = score1;
    }

    /**
     * @return the score2
     */
    public int getScore2() {
        return score2;
    }

    /**
     * @param score2 the score2 to set
     */
    public void setScore2(int score2) {
        this.score2 = score2;
    }

    /**
     * @return the match
     */
    public Matchtennis getMatch() {
        return match;
    }

    /**
     * @param match the match to set
     */
    public void setMatch(Matchtennis match) {
        this.match = match;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
