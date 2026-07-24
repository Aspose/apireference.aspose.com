---
title: "System::Array::Enumerator κλάση"
linktitle: "Απαριθμητής"
second_title: "Aspose.Page για C++"
description: "System::Array::Enumerator κλάση. Υλοποιεί τη διεπαφή IEnumerator που επιτρέπει την αρίθμηση των στοιχείων ενός αντικειμένου Array. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 6800
url: /el/cpp/system/array/enumerator/
---
## Enumerator class


Υλοποιεί τη διεπαφή IEnumerator που επιτρέπει την αρίθμηση των στοιχείων ενός αντικειμένου [Array](../). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Δημιουργεί ένα νέο αντικείμενο [Enumerator](./) που αντιπροσωπεύει τον καθορισμένο πίνακα. |
| [get_Current](./get_current/)() const override | Επιστρέφει ένα αντίγραφο του τρέχοντος στοιχείου. |
| [MoveNext](./movenext/)() override | Ελέγχει αν ο δείκτης του τρέχοντος στοιχείου δεν δείχνει στο τελευταίο στοιχείο του πίνακα και τον προχωράει αν δεν το κάνει. |
| [Reset](./reset/)() override | Επαναφέρει τον δείκτη του τρέχοντος στοιχείου. |
| virtual [~Enumerator](./~enumerator/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
