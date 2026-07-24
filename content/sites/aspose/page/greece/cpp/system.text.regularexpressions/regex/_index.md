---
title: "System::Text::RegularExpressions::Regex class"
linktitle: "Regex"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::Regex κλάση. Κανονική έκφραση που ακολουθεί σύνταξη παρόμοια με C#. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 800
url: /el/cpp/system.text.regularexpressions/regex/
---
## Regex class


Κανονική έκφραση που ακολουθεί σύνταξη παρόμοια με C#. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Regex : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Αποφεύγει ειδικούς χαρακτήρες ώστε η συμβολοσειρά να χρησιμοποιηθεί ως μέρος του προτύπου. |
| [get_MatchTimeout](./get_matchtimeout/)() | Επιστρέφει το χρονικό όριο αντιστοίχισης. |
| [get_Options](./get_options/)() | Επιστρέφει τις επιλογές της κανονικής έκφρασης. |
| [get_RightToLeft](./get_righttoleft/)() | Ελέγχει αν η αντιστοίχιση γίνεται σε λειτουργία δεξιά προς αριστερά. |
| [IsMatch](./ismatch/)(const String\&, int) | Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Ελέγχει αν η συμβολοσειρά ταιριάζει με το πρότυπο. |
| [Match](./match/)(const String\&) | Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά. |
| [Match](./match/)(const String\&, int, int) | Ταιριάζει την κανονική έκφραση με τη συμβολοσειρά. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Ταιριάζει τη συμβολοσειρά και το πρότυπο. |
| [Matches](./matches/)(const String\&, int) | Επιστρέφει όλες τις αντιστοιχίες της κανονικής έκφρασης σε δεδομένη συμβολοσειρά, κάνοντας επαναλαμβανόμενη αντιστοίχιση. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Επιστρέφει όλες τις αντιστοιχίες μεταξύ της συμβολοσειράς και του προτύπου. |
| [Regex](./regex/)() | Δημιουργεί κενή κανονική έκφραση. |
| [Regex](./regex/)(const String\&) | Κατασκευαστής. |
| [Regex](./regex/)(const String\&, RegexOptions) | Κατασκευαστής. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Κατασκευαστής. |
| [Replace](./replace/)(const String\&, const String\&) | Αντικαθιστά όλες τις αντιστοιχίες της κανονικής έκφρασης στη συμβολοσειρά με τη συμβολοσειρά αντικατάστασης. |
| [Replace](./replace/)(const String\&, const char_t *) | Αντικαθιστά όλες τις αντιστοιχίες της κανονικής έκφρασης στη συμβολοσειρά με τη συμβολοσειρά αντικατάστασης. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Αντικαθιστά όλες τις αντιστοιχίες της κανονικής έκφρασης στη συμβολοσειρά με τη συμβολοσειρά αντικατάστασης. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Αντικαθιστά όλες τις αντιστοιχίες της κανονικής έκφρασης στη συμβολοσειρά με τη συμβολοσειρά αντικατάστασης. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Αντικαθιστά όλες τις αντιστοιχίες σε συμβολοσειρά με αντικαταστάσεις που δημιουργούνται από delegate. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Αντικαθιστά όλες τις αντιστοιχίες σε συμβολοσειρά με αντικαταστάσεις που δημιουργούνται από delegate. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Αντικαθιστά όλες τις αντιστοιχίες σε συμβολοσειρά με αντικαταστάσεις που δημιουργούνται από delegate. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Αντικαθιστά όλες τις αντιστοιχίες σε συμβολοσειρά με αντικαταστάσεις που δημιουργούνται από delegate (στατική λειτουργία). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Αντικαθιστά όλες τις αντιστοιχίες της κανονικής έκφρασης στη συμβολοσειρά με τη συμβολοσειρά αντικατάστασης. |
| [Replace](./replace/)(const String\&, const String\&, int) | Αντικαθιστά υποσυμβολοσειρές σε συμβολοσειρά. Δεν έχει υλοποιηθεί. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Αντικαθιστά υποσυμβολοσειρές σε συμβολοσειρά. Δεν έχει υλοποιηθεί. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Αντικαθιστά αντιστοιχίες regex. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Αντικαθιστά αντιστοιχίες regex. |
| [Split](./split/)(const String\&) | Διαχωρίζει τη συμβολοσειρά με βάση τις αντιστοιχίες regex. |
| [Split](./split/)(const String\&, int) | Διαχωρίζει τη συμβολοσειρά με βάση τις αντιστοιχίες regex. |
| [Split](./split/)(const String\&, int, int) | Διαιρεί μια είσοδο συμβολοσειράς έναν καθορισμένο μέγιστο αριθμό φορών σε έναν πίνακα υποσυμβολοσειρών, στις θέσεις που ορίζονται από μια κανονική έκφραση που έχει καθοριστεί στον κατασκευαστή [Regex](./). Η αναζήτηση του προτύπου της κανονικής έκφρασης ξεκινά από μια καθορισμένη θέση χαρακτήρα στην είσοδο συμβολοσειράς. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Διαιρεί τη συμβολοσειρά με βάση regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Διαιρεί τη συμβολοσειρά με βάση regexp. |
| [ToString](./tostring/)() const override | Μετατρέπει το regex σε συμβολοσειρά. |
| static [Unescape](./unescape/)(const String\&) | Απο-διαφράζει ειδικούς χαρακτήρες σε συμβολοσειρά που χρησιμοποιείται ως μέρος του προτύπου. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Ειδική τιμή λήξης χρόνου για να απενεργοποιηθεί η διακοπή αντιστοίχισης λόγω λήξης χρόνου. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
