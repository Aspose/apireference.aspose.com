---
title: "System::Net::IWebProxy κλάση"
linktitle: "IWebProxy"
second_title: "Aspose.Page για C++"
description: "System::Net::IWebProxy κλάση. Αυτό το interface χρησιμοποιείται για την υλοποίηση πρόσβασης μέσω διαμεσολαβητή στην κλάση WebRequest. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2700
url: /el/cpp/system.net/iwebproxy/
---
## IWebProxy class


Αυτή η διεπαφή χρησιμοποιείται για την υλοποίηση πρόσβασης μέσω διαμεσολαβητή στην κλάση [WebRequest](../webrequest/) class. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class IWebProxy : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | Πληροφορίες RTTI. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Επιστρέφει το URI του διαμεσολαβητή. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Επιστρέφει μια τιμή που υποδεικνύει αν ο διαμεσολαβητής δεν πρέπει να χρησιμοποιηθεί για τον καθορισμένο κεντρικό υπολογιστή. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Ορίζει διαπιστευτήρια για έλεγχο ταυτότητας στον διακομιστή διαμεσολάβησης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
