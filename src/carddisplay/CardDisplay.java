
package carddisplay;

import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author Francis
 */
public class CardDisplay extends JPanel {
    enum Suit{Diamonds, Spades, Hearts, Clubs };
    enum Face{King, Queen, Ace, Jack, Ten, Nine, Eight, Seven, Six, Five, Four, Three, Two};
    
    public class SuitFace{
        Suit suit;
        Face face;
        
        public SuitFace(Suit st, Face f){
            this.suit = st;
            this.face = f;
        }
        
        public Suit getSuit(){
            return suit;
        }
        
        public Face getFace(){
            return face;
        }
        
        @Override
        public boolean equals(Object obj){
            if(!(obj instanceof SuitFace)){
                return false;
            }
            SuitFace sf = (SuitFace)obj;
            return suit.equals(sf.getSuit())&& face.equals(sf.getFace());
        }
        
        @Override
        public int hashCode(){
            return suit.hashCode() + face.hashCode();
        }
    }
    public class CardChooserControl extends JPanel{
        JComboBox suitBox ;
        JComboBox faceBox;
        
        public CardChooserControl(){
            this.suitBox = new JComboBox(Suit.values());
            this.faceBox = new JComboBox(Face.values());
        }
    }
    public class CardImagePanel extends JPanel{
        BufferedImage img;
        
        public CardImagePanel(){
            super(true);
            this.img = null;
        }
        public void setImage(BufferedImage image){
            this.img = image;
        }
        
        public BufferedImage getImage(){
            return this.img;
        }
    }
    
    public CardDisplay(){
        super(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
