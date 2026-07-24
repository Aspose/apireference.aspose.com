---
title: "System::Security::Cryptography::RandomNumberGenerator κλάση"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RandomNumberGenerator κλάση. Αφηρημένη κλάση για γεννήτριες τυχαίων αριθμών από την οποία κληρονομούν. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε ως όρισμα σε συναρτήσεις στην C++."
type: docs
weight: 2600
url: /el/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Αφηρημένη κλάση για γεννήτριες τυχαίων αριθμών από την οποία κληρονομούν. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε ως όρισμα σε συναρτήσεις.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)() | Δημιουργεί ένα στιγμιότυπο της προεπιλεγμένης υλοποίησης μιας κρυπτογραφικής γεννήτριας τυχαίων αριθμών που μπορεί να χρησιμοποιηθεί για τη δημιουργία τυχαίων δεδομένων. Δεν έχει υλοποιηθεί. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Γεμίζει τα υπάρχοντα στοιχεία του πίνακα με τυχαία bytes. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Γεμίζει το υπάρχον τμήμα του πίνακα με τυχαία bytes. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Γεμίζει τα στοιχεία της υπάρχουσας προβολής πίνακα με τυχαία bytes. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Γεμίζει το τμήμα της υπάρχουσας προβολής πίνακα με τυχαία bytes. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Γεμίζει τα στοιχεία του υπάρχοντος πίνακα στοίβας με τυχαία bytes. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Γεμίζει το τμήμα του υπάρχοντος πίνακα στοίβας με τυχαία bytes. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Γεμίζει τα υπάρχοντα στοιχεία του πίνακα με τυχαία μη μηδενικά bytes. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Γεμίζει τα στοιχεία της υπάρχουσας προβολής πίνακα με τυχαία μη μηδενικά bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Γεμίζει τα στοιχεία του υπάρχοντος πίνακα στοίβας με τυχαία μη μηδενικά bytes. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
