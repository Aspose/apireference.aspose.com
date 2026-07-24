---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Globalization::StringInfo. Διαχωριστής για επανάληψη μέσω τμημάτων της συμβολοσειράς. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2400
url: /el/cpp/system.globalization/stringinfo/
---
## StringInfo class


Διαχωριστής για επανάληψη μέσω τμημάτων της συμβολοσειράς. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class StringInfo : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Επιστρέφει τον αριθμό των στοιχείων κειμένου στο αντικείμενο [StringInfo](./). |
| [get_String](./get_string/)() const | Επιστρέφει την τιμή του αντικειμένου [StringInfo](./). |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Επιστρέφει το πρώτο στοιχείο στη συγκεκριμένη συμβολοσειρά. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Επιστρέφει το στοιχείο στη συγκεκριμένη θέση της καθορισμένης συμβολοσειράς. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Δημιουργεί έναν απαριθμητή για επανάληψη μέσω των χαρακτήρων της συμβολοσειράς. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Δημιουργεί έναν απαριθμητή για επανάληψη μέσω των χαρακτήρων της συμβολοσειράς, ξεκινώντας από τη συγκεκριμένη θέση. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Επιστρέφει τους δείκτες των βασικών χαρακτήρων, των υψηλών surrogate και των χαρακτήρων ελέγχου. |
| [set_String](./set_string/)(const String\&) | Ορίζει την τιμή του αντικειμένου [StringInfo](./). |
| [StringInfo](./stringinfo/)() | Πληροφορίες RTTI. |
| [StringInfo](./stringinfo/)(const String\&) | Κατασκευαστής. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Επιστρέφει το υποσύνολο κειμενικών στοιχείων από το καθορισμένο στοιχείο κειμένου έως το τελευταίο στοιχείο κειμένου. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Επιστρέφει το υποσύνολο κειμενικών στοιχείων από το καθορισμένο στοιχείο κειμένου έως τον καθορισμένο αριθμό στοιχείων κειμένου. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
