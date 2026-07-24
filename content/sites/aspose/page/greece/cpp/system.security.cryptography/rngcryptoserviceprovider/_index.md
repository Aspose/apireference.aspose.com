---
title: "System::Security::Cryptography::RNGCryptoServiceProvider κλάση"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider κλάση. Γεννήτρια τυχαίων αριθμών που ακολουθεί τη λογική CSP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3300
url: /el/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Γεννήτρια τυχαίων αριθμών που ακολουθεί τη λογική CSP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Γεμίζει τα υπάρχοντα στοιχεία του πίνακα με τυχαία bytes. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Γεμίζει τα στοιχεία της υπάρχουσας προβολής πίνακα με τυχαία bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Γεμίζει τα υπάρχοντα στοιχεία του πίνακα με τυχαία μη μηδενικά bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Γεμίζει τα στοιχεία της υπάρχουσας προβολής πίνακα με τυχαία μη μηδενικά bytes. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Κατασκευαστής. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
