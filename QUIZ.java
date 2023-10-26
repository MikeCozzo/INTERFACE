
public class QUIZ implements Measurable{

	   private int scores;

	   /**
	      Construct a country with name and area.
	      @param name country's name
	      @param area total area of country
	   */
	   public QUIZ(int scores)
	   {
	      this.scores = scores;
	   }

	   /**
	      Measurable interface method to retrieve measure.
	      @return the measured area
	   */
	   public double getMeasure()
	   {
	      return scores;
	   }
	}


