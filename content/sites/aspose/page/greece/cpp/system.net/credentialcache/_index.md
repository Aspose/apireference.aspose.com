---
title: "System::Net::CredentialCache κλάση"
linktitle: "CredentialCache"
second_title: "Aspose.Page για C++"
description: "System::Net::CredentialCache κλάση. Παρέχει την αποθήκευση διαπιστευτηρίων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.net/credentialcache/
---
## CredentialCache class


Παρέχει την αποθήκευση διαπιστευτηρίων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Προσθέτει τα καθορισμένα διαπιστευτήρια δικτύου στην cache. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Προσθέτει τα καθορισμένα διαπιστευτήρια δικτύου στην cache. |
| [CredentialCache](./credentialcache/)() | Δημιουργεί μια νέα παρουσία. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | Πληροφορίες RTTI. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Επιστρέφει τα διαπιστευτήρια δικτύου του τρέχοντος χρήστη ή της εφαρμογής. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Επιστρέφει διαπιστευτήρια για το καθορισμένο πρόθεμα URI και τον τύπο πιστοποίησης. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Επιστρέφει διαπιστευτήρια για το καθορισμένο όνομα κεντρικού υπολογιστή, θύρα και τύπο ελέγχου ταυτότητας. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Αφαιρεί τα διαπιστευτήρια δικτύου για το καθορισμένο πρόθεμα URI και τον τύπο πιστοποίησης. |
| [Remove](./remove/)(String, int32_t, String) | Αφαιρεί τα διαπιστευτήρια δικτύου για το καθορισμένο όνομα κεντρικού υπολογιστή, θύρα και τύπο πιστοποίησης. |
## Δείτε επίσης

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
