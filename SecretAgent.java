import java.util.Scanner;

/**
 * Lab U2.8 - Secret Agent Dossier
 * AP / IB Computer Science  .  Unit 2
 *
 * The agency has three facts about you. Turn them into a dossier.
 *
 * You will use every String method on the AP Quick Reference except split:
 *   length()  indexOf()  substring(from)  substring(from, to)  equals()  compareTo()
 * plus Integer.parseInt, a try/catch, and your first two if statements.
 *
 * HOW THE STARTER WORKS
 *   Every line marked TODO already compiles, with a placeholder value.
 *   Replace the placeholder on the RIGHT of the = with real code.
 *   Run it after every part. It runs from the start - it just says nonsense.
 *
 * @author  (your name here)
 */
public class SecretAgent {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // The agency's settings. You do not need to change these.
        String agencyDomain = "bvsd.org";
        String handler      = "Gesell";

        // ---- Intake: already done for you ---------------------------------
        // All three are read with nextLine(), so they are all Strings -
        // even the date. Turning text into a number is Part 2's job.
        System.out.println("=== AGENCY INTAKE ===");
        System.out.print("Full name (First Middle Last, or First Last): ");
        String fullName = keyboard.nextLine();
        System.out.print("Date of birth (YYYY-MM-DD): ");
        String dob = keyboard.nextLine();
        System.out.print("Email: ");
        String email = keyboard.nextLine();

        System.out.println();
        System.out.println("CLASSIFIED  -  AGENT DOSSIER");


        // ==== PART 1 - THE NAME  (Problem  from slides) =====================
        // Find a delimiter with indexOf. Cut at it with substring.
        // Repeat on what is left.
        //
        //   "Regina Elizabeth Lee"   first = "Regina"
        //                            rest  = "Elizabeth Lee"
        //   Now look for a space INSIDE rest.

        int firstSpace  = 0;     // TODO: where is the first space in fullName?
        String first    = "";    // TODO: everything before it
        String rest     = "";    // TODO: everything after it
        int secondSpace = 0;     // TODO: where is the space inside rest?

        // NOT a TODO - leave these three lines alone.
        // They are declared HERE, before the if, so they still exist after it.
        // The if below is where they get their real values.
        String middle   = "";
        String last     = "";
        String initials = "";

        // YOUR FIRST if STATEMENT.
        // indexOf gives back -1 when it cannot find what you asked for.
        // So if there is no space inside rest, this agent has no middle name.
        // Java runs the first block if the condition is true, the second if not.
        // Fill in both blocks. Each one must set last and initials.

        if (secondSpace == -1) {
            // Two names, e.g. "Maya Adams".  rest is the last name.
            // TODO: last = ...
            // TODO: initials = ...          -> "MA"

        } else {
            // Three names, e.g. "Regina Elizabeth Lee".
            // TODO: middle = ...            everything in rest before the space
            // TODO: last = ...              everything in rest after the space
            // TODO: initials = ...          -> "REL"

        }

        System.out.println("Agent initials:  " + initials);


        // ==== PART 2 - THE DATE OF BIRTH  (Problem 2 from slides) ===========
        // "2009-09-30"  - the positions never move. Draw the index grid.
        //
        // Everything that needs the date lives INSIDE the try block.
        // If any line in it throws, Java jumps straight to the matching catch.

        try {
            String year  = "";   // TODO: substring
            String month = "";   // TODO: substring
            String day   = "";   // TODO: substring
            int birthYear = Integer.parseInt(year);

            // TODO: print   Born: 09/30/2009 (month/day/year)

            // TODO: print   Age(end 2026): 17 (2026 - birthYear)

            // TODO: build and print the Agent ID:
            //       first initial + last name, both lowercase, then the last
            //       TWO characters of year.     "R" + "Lee" + "09" -> rlee09
            //       Use year.length() to find where the last two start.
            //       use toLowerCase()

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("DATE OF BIRTH:   CORRUPTED - too short for YYYY-MM-DD");
        } catch (NumberFormatException e) {
            System.out.println("DATE OF BIRTH:   CORRUPTED - not a number where one belongs");
        }


        // ==== PART 3 - THE EMAIL  (Problem 3 from slides) ===================
        // The domain is everything AFTER the @.

        int at        = 0;     // TODO: where is the @ ?
        String domain = "";    // TODO: everything after it   (think about the + 1)

        // TODO: YOUR SECOND if STATEMENT - change this to use equals, not ==.
        if (domain == (agencyDomain)) {
            // TODO: print   Clearance:       GRANTED - agency email verified

        } else {
            // TODO: print   Clearance:       DENIED - gmail.com is not an agency address
            //       (use the real domain, not the word gmail.com)

        }


        // ==== PART 4 - THE FILING CABINET ===================================
        // Agents are filed alphabetically by last name.
        // compareTo gives a negative number if last comes BEFORE handler.

        int order = 0;         // TODO: compare last to handler with compareTo

        System.out.println("Filing check:    \"" + last + "\".compareTo(\"" + handler + "\") = " + order);

        if (order < 0) {
            // TODO: print   Filed BEFORE your handler, Agent Gesell.

        } else {
            // TODO: print   Filed AFTER your handler, Agent Gesell.

        }


        // ==== TAKE IT FURTHER - extra credit, do these LAST =================
        // TIF 1  Code name: move the first letter of the first name to the
        //        end and add "ay".          Regina -> eginaRay
        // TIF 2  Masked contact: first letter of the email, then ***@ and
        //        the domain.                r***@bvsd.org
        // TIF 3  A border that fits the name. Start from a long String of
        //        = signs like like String border = "=======================" and cut
		//        it to fullName.length() + 4. Print it above
        //        and below the name, at the very top of the dossier.
        // TIF 4  Months to next birthday, counted from October:
        //        (birthMonth - 10 + 12) % 12    - you need parseInt again.
        //        Where does this line have to go, and why?
    }
}

/* ==== DEBRIEF - answer in this comment, then push ========================

   Run your finished program once for each of these. Say what happened
   and WHY, in a sentence or two each.

   1. Date of birth  2009-9-30        Which catch ran? Why that one?

   2. Date of birth  Sept 30 2009     Which catch ran? Why that one?

   3. Email with no @:  rleebvsd.org
      Did it crash? What did the dossier say, and is it telling the truth?

   4. Change domain.equals(agencyDomain) back to  domain == agencyDomain
      and run it with a correct bvsd.org email. What happens? Why?
      (Then change it back again.)

   5. Type your last name all in lowercase. Where were you filed? Why?

   ======================================================================= */
