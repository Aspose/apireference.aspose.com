---
title: "Κλάση System::Globalization::IdnMapping"
linktitle: "IdnMapping"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Globalization::IdnMapping. Το IdnMapping χρησιμοποιείται για τη μετατροπή ονομάτων σε Punycode. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1300
url: /el/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει δύο αντικείμενα [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Επιστρέφει τη σημαία που υποδεικνύει εάν χρησιμοποιούνται μη εκχωρημένα σημεία κώδικα στις λειτουργίες. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Επιστρέφει τη σημαία που υποδεικνύει εάν χρησιμοποιούνται τυπικές συμβάσεις ονοματοδοσίας στις λειτουργίες. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) όνομα τομέα Unicode σε ισοδύναμο ASCII. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) όνομα τομέα Unicode σε ισοδύναμο ASCII. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) όνομα τομέα Unicode σε ισοδύναμο ASCII. |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει τον κωδικό κατακερματισμού για το τρέχον αντικείμενο [IdnMapping](./). |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) όνομα τομέα ASCII σε ισοδύναμο Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) όνομα τομέα ASCII σε ισοδύναμο Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) όνομα τομέα ASCII σε ισοδύναμο Unicode. |
| [IdnMapping](./idnmapping/)() | Πληροφορίες RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Ορίζει τη σημαία που υποδεικνύει εάν τα μη εκχωρημένα σημεία κώδικα χρησιμοποιούνται σε λειτουργίες. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Ορίζει τη σημαία που υποδεικνύει εάν χρησιμοποιούνται τυπικές συμβάσεις ονοματοδοσίας σε λειτουργίες. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
