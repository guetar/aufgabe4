
/**
 *
 * @author Matthias
 */
public class Repeated<P> extends Container<P> {
    //IV: scalefactor>0

    private double scalefactor;

    //VB: container!=null; container[0]!=null; scalefactor>0
    //NB: this.container!=null; this.container[0]!=null; this.scalefactor>0
    public Repeated(P[][] container, double scalefactor) {
        super(container);
        this.scalefactor = scalefactor;
    }

    //VB: factor>0
    @Override
    public void scale(double factor) {
        this.scalefactor = this.scalefactor * factor;
    }

    //NB: return
    @Override
    public String toString() {
        String ret = "";
        int maxwidth = 0;
        int maxheight = 0;
        int scwidth = (scalefactor > 1) ? this.getWidth() : (int) Math.ceil(scalefactor * this.getWidth());
        int scheight = (scalefactor > 1) ? this.getHeight() : (int) Math.ceil(scalefactor * this.getHeight());
        //Laenge und Breite bestimmen
        for (int x = 0; x < scwidth; x++) {
            for (int y = 0; y < scheight; y++) {
                String[] lines = getBox(x, y).toString().split("\n");
                maxheight = Math.max(maxheight, lines.length);
                maxwidth = Math.max(maxwidth, lines[0].length());
            }

        }
        String[] lines = new String[scheight * maxheight];
        //zu kleine Elemente mit Leerzeichen auffuellen
        for (int x = 0; x < scwidth; x++) {
            for (int y = 0; y < scheight; y++) {
                String[] elementlines = getBox(x, y).toString().split("\n");

                for (int i = 0; i < maxheight; i++) {
                    if (i < elementlines.length) {
                        if (lines[y * maxheight + i] == null) {
                            lines[y * maxheight + i] = elementlines[i];
                        } else {
                            lines[y * maxheight + i] += elementlines[i];
                        }

                        while (lines[y * maxheight + i].length() < maxwidth) {
                            lines[y * maxheight + i] += " ";
                        }
                    } else {
                        //Leerzeilen
                        lines[y * maxheight + i] = new String(new char[maxwidth]).replace("\0", " ");
                    }
                }



            }
        }

        scwidth = (int) Math.ceil(scalefactor * this.getWidth());
        scheight = (int) Math.ceil(scalefactor * this.getHeight());
        for (int i = 0; i < lines.length; i++) {
            String line = new String(lines[i]);
            //komplette Zeile an Zeile anhaengen
            for (int j = 1; j < (int) scalefactor; j++) {
                lines[i] += line;
            }
            if (scalefactor > 1 && scalefactor % 1 != 0) {
                //teilweise Zeile an Zeile anhaengen
                lines[i] += line.substring(0, (int) Math.round(getWidth() * maxwidth * (scalefactor - 1)));
            }
        }

        for (int i = 0; i < lines.length; i++) {
            ret += lines[i];
            ret += "\n";
        }

        //Zeilen dem Skalierungsfaktor entsprechend kopieren
        for (int i = 0; i < lines.length * (scalefactor - 1); i++) {
            ret += lines[i];
            ret += "\n";
        }


        return ret;
    }
}
