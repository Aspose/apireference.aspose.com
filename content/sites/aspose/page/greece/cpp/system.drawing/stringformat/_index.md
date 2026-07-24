---
title: "Κλάση System::Drawing::StringFormat"
linktitle: "StringFormat"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Drawing::StringFormat. Περιλαμβάνει πληροφορίες διάταξης κειμένου, χειρισμούς εμφάνισης και χαρακτηριστικά OpenType. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2500
url: /el/cpp/system.drawing/stringformat/
---
## StringFormat class


Περιλαμβάνει πληροφορίες διάταξης κειμένου, χειρισμούς εμφάνισης και χαρακτηριστικά OpenType. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class StringFormat : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() | Επιστρέφει ένα ακριβές αντίγραφο του τρέχοντος αντικειμένου. |
| [get_Alignment](./get_alignment/)() const | Επιστρέφει μια τιμή που υποδεικνύει την οριζόντια στοίχιση της συμβολοσειράς. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Επιστρέφει μια τιμή που υποδεικνύει τη γλώσσα που χρησιμοποιείται όταν τα τοπικά ψηφία αντικαθίστανται με δυτικά ψηφία. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Επιστρέφει τη μέθοδο αντικατάστασης ψηφίων. |
| [get_FormatFlags](./get_formatflags/)() const | Επιστρέφει έναν δυαδικό συνδυασμό των [StringFormatFlags](../stringformatflags/) που καθορίζει τη μορφή συμβολοσειράς που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_GenericDefault](./get_genericdefault/)() | Επιστρέφει ένα αντικείμενο [StringFormat](./) που αντιπροσωπεύει μια γενική προεπιλεγμένη μορφή. |
| static [get_GenericTypographic](./get_generictypographic/)() | Επιστρέφει ένα αντικείμενο [StringFormat](./) που αντιπροσωπεύει μια γενική τυπογραφική μορφή. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Επιστρέφει την τιμή που υποδεικνύει πώς εμφανίζεται το πρόθεμα του συντομευτικού πλήκτρου. |
| [get_LineAlignment](./get_linealignment/)() const | Επιστρέφει μια τιμή που υποδεικνύει την κάθετη στοίχιση της συμβολοσειράς. |
| [get_Trimming](./get_trimming/)() const | Επιστρέφει μια τιμή που υποδεικνύει πώς περικόπτεται η συμβολοσειρά. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Λαμβάνει το μέγεθος του πίνακα [CharacterRange](../characterrange/). |
| [GetTabStops](./gettabstops/)(float\&) const | Επιστρέφει τις θέσεις των στηλοθετών για το τρέχον αντικείμενο [StringFormat](./). |
| [set_Alignment](./set_alignment/)(StringAlignment) | Ορίζει την οριζόντια στοίχιση της συμβολοσειράς. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Ορίζει τις σημαίες μορφής συμβολοσειράς. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Ορίζει την τιμή που καθορίζει πώς πρέπει να εμφανίζεται το πρόθεμα του συντομευτικού πλήκτρου. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Ορίζει την κάθετη στοίχιση της συμβολοσειράς. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Ορίζει μια τιμή που καθορίζει πώς περικόπτεται η συμβολοσειρά. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Ορίζει τη γλώσσα και τη μέθοδο αντικατάστασης ψηφίων. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Ορίζει έναν πίνακα αντικειμένων [CharacterRange](../characterrange/) που αντιπροσωπεύουν τις περιοχές χαρακτήρων που μετρήθηκαν με κλήση της μεθόδου MeasureCharacterRanges(). |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Ορίζει τις θέσεις των στηλοθετών για το τρέχον αντικείμενο [StringFormat](./). |
| [StringFormat](./stringformat/)() | Δημιουργεί μια νέα παρουσία της κλάσης [StringFormat](./). |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Δημιουργεί ένα νέο αντικείμενο της κλάσης [StringFormat](./) με τις καθορισμένες σημαίες μορφοποίησης και γλώσσα. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Κατασκευαστής αντιγραφής. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
