---
title: "System::Security::Cryptography::Pkcs::CmsSigner κλάση"
linktitle: "CmsSigner"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner κλάση. Παρέχει API για την υπογραφή αντικειμένων χρησιμοποιώντας CMS. Δεν υπογράφει αντικείμενα από μόνο του, χρησιμοποιήστε την κλάση SignedCMS για αυτό. Δεν έχει υλοποιηθεί. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject() . Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε ως όρισμα σε συναρτήσεις σε C++."
type: docs
weight: 100
url: /el/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


Παρέχει API για την υπογραφή αντικειμένων χρησιμοποιώντας CMS. Δεν υπογράφει αντικείμενα από μόνο του, χρησιμοποιήστε την κλάση SignedCMS για αυτό. Δεν έχει υλοποιηθεί. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε ως όρισμα σε συναρτήσεις.

```cpp
class CmsSigner : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | Αρχικοποιεί τον υπογράφοντα με πιστοποιητικό X509. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | Λαμβάνει τον αλγόριθμο κατακερματισμού που χρησιμοποιείται με την υπογραφή. |
| [get_IncludeOption](./get_includeoption/)() const | Ελέγχει ποια πιστοποιητικά από την αλυσίδα θα συμπεριληφθούν στην υπογραφή. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | Ορίζει τον αλγόριθμο κατακερματισμού που χρησιμοποιείται με την υπογραφή. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | Καθορίζει ποια πιστοποιητικά από την αλυσίδα θα συμπεριληφθούν στην υπογραφή. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
