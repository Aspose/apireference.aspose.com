---
title: "System::Collections::Generic::IEqualityComparer κλάση"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IEqualityComparer κλάση. Διεπαφή που παρέχει τρόπους σύγκρισης δύο αντικειμένων για ισότητα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2400
url: /el/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Διεπαφή που παρέχει τρόπους σύγκρισης δύο αντικειμένων για ισότητα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος που συγκρίνεται. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | Πληροφορίες RTTI. |
| virtual [GetHashCode](./gethashcode/)(T) const | Λαμβάνει τον κωδικό κατακερματισμού για κάποιο αντικείμενο. |

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
