---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Page για C++"
description: "System::Net::NetworkCredential class. Παρέχει διαπιστευτήρια για τα σχήματα ελέγχου ταυτότητας βάσει κωδικού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2900
url: /el/cpp/system.net/networkcredential/
---
## NetworkCredential class


Παρέχει διαπιστευτήρια για τα σχήματα ελέγχου ταυτότητας βάσει κωδικού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Domain](./get_domain/)() | Αποκτά το domain που επαληθεύει τα διαπιστευτήρια. |
| [get_Password](./get_password/)() | Αποκτά τον κωδικό πρόσβασης. |
| [get_UserName](./get_username/)() | Πληροφορίες RTTI. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Επιστρέφει διαπιστευτήρια για το καθορισμένο URI και τον τύπο ελέγχου ταυτότητας. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Επιστρέφει διαπιστευτήρια για το καθορισμένο όνομα κεντρικού υπολογιστή, θύρα και τύπο ελέγχου ταυτότητας. |
| [NetworkCredential](./networkcredential/)() | Δημιουργεί μια νέα παρουσία. |
| [NetworkCredential](./networkcredential/)(String, String) | Δημιουργεί μια νέα παρουσία. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Δημιουργεί μια νέα παρουσία. |
| [set_Domain](./set_domain/)(String) | Ορίζει το domain που επαληθεύει τα διαπιστευτήρια. |
| [set_Password](./set_password/)(String) | Ορίζει τον κωδικό πρόσβασης. |
| [set_UserName](./set_username/)(String) | Ορίζει το όνομα χρήστη. |
## Δείτε επίσης

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
