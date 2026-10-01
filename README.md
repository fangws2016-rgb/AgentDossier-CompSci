# Lab U2.8 — Secret Agent Dossier

**AP / IB Computer Science · Unit 2**

The agency has three facts about you: your name, your date of birth and your
email. Your program turns them into a classified dossier.

This lab is the three problems from the slides (initials, parse a date, email
domain) built into a single program that reads its own input. It uses every String
method on the AP Java Quick Reference except `split`:

`length()` · `indexOf()` · `substring(from)` · `substring(from, to)` · `equals()` · `compareTo()`

…plus `Integer.parseInt`, a `try`/`catch`, and your first two `if` statements.

---

## What it should do

```
=== AGENCY INTAKE ===
Full name (First Middle Last, or First Last): Regina Elizabeth Lee
Date of birth (YYYY-MM-DD): 2009-09-30
Email: rlee@bvsd.org

CLASSIFIED  -  AGENT DOSSIER
Agent initials:  REL
Born:            09/30/2009
Age (end 2026):  17
Agent ID:        rlee09
Clearance:       GRANTED - agency email verified
Filing check:    "Lee".compareTo("Gesell") = 5
Filed AFTER your handler, Agent Gesell.
```

And for an agent with two names and an outside email:

```
CLASSIFIED  -  AGENT DOSSIER
Agent initials:  MA
Born:            12/02/2008
Age (end 2026):  18
Agent ID:        madams08
Clearance:       DENIED - gmail.com is not an agency address
Filing check:    "Adams".compareTo("Gesell") = -6
Filed BEFORE your handler, Agent Gesell.
```

## How the starter works

Every line marked `TODO` **already compiles**, with a placeholder value such as `0`
or `""`. Replace the placeholder on the right of the `=` with real code. The
program runs from the start. It just prints nonsense until you fill it in.

Work the parts in order and **run after every part**.

| Part | What | Methods |
|---|---|---|
| 1 | The name → initials | `indexOf`, `substring`, **`if`** |
| 2 | The date → born, age, Agent ID | `substring`, `length`, `parseInt`, **`try`/`catch`** |
| 3 | The email → clearance | `indexOf`, `substring`, `equals`, **`if`** |
| 4 | The filing cabinet | `compareTo`, **`if`** |

The `if` statements are new. Their conditions are already written for you.
Your job is what goes *inside* each block. We come back to how `if` works in Unit 4.

## Test with more than yourself

A program that only works for your own name is not finished. Try at least:

- a three-name agent **and** a two-name agent
- an `@bvsd.org` email **and** one that is not

Then answer the five **debrief** questions in the comment at the bottom of
`SecretAgent.java`. They ask you to break your own program on purpose.

## Take It Further (extra credit)

Four extras are described at the bottom of `main`: a code name, a masked email, a
border that fits your name, and months to your next birthday. Do them **after**
Parts 1–4 work.

---
### Opening the project
### First — make your own copy

1. Open the template repository Mr. Gesell posted.
2. Click **Use this template → Create a new repository**. The owner is **you**.
3. Work in **your** repository from now on — never in the template.

Then pick **one** of the two ways to open it. Both are fine, and you can switch later — your work lives in
the repository, not in the editor.

### Option A — GitHub Codespaces (VS Code in your browser)
(Use of Codespaces is quite limited for free accounts - I would
reserve for when you need to work and cannot access IntelliJ
--for example on a Chromebook at home -- )
1. On **your** repository's page, click **Code → Codespaces → Create codespace on main**.
2. Wait for it to finish setting up. The first time is the slow one.
3. Open `SecretAgent.java`, write your code, and run it from the terminal:

  ```
  javac SecretAgent.java
  java SecretAgent
  ```

or click **Run** above `main`.

**Reopen the same codespace next time** — do not create a new one every period. Go to
**Code → Codespaces** and click the one that is already there. Creating a new one makes
you wait through the whole setup again for no reason.

### Option B — IntelliJ IDEA (installed on your computer)

1. Copy **your** repository's URL from the green **Code** button.
2. In IntelliJ: **File → New → Project from Version Control**, paste the URL, **Clone**.
3. If IntelliJ asks for a **Project SDK**, pick any Java 17 or newer entry in the list.
   If the list is empty, choose **Download JDK** and take the default it offers.
4. Open `SecretAgent.java` and click the green ▶ next to `main`.


### Committing your work

Either way, commit and push when you are done — pushing is what saves it.
In IntelliJ: **Git → Commit**, then **Git → Push**.
In Codespaces: the **Source Control** panel on the left, then **Commit** and **Sync**.
