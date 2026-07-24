---
title: "System::Collections::IEnumerator κλάση"
linktitle: "IEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Collections::IEnumerator κλάση. Διεπαφή του enumerator που μπορεί να χρησιμοποιηθεί για επανάληψη μέσω ορισμένων στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παράδειγμα αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.collections/ienumerator/
---
## IEnumerator class


Διεπαφή του enumerator που μπορεί να χρησιμοποιηθεί για επανάληψη μέσω ορισμένων στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παράδειγμα αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Current](./current/)() const | Επιστρέφει το τρέχον στοιχείο. |
| virtual [get_Current](./get_current/)() const | Επιστρέφει το τρέχον στοιχείο. |
| virtual [MoveNext](./movenext/)() | Μετακινεί τον απαριθμητή στο επόμενο στοιχείο. Εάν δεν έχει αναφερθεί προηγουμένως κανένα στοιχείο, ορίζει την αναφορά στο πρώτο διαθέσιμο στοιχείο. Εάν φτάσει στο τέλος του κοντέινερ, δεν κάνει τίποτα. |
| virtual [Reset](./reset/)() | Επαναφέρει τον enumerator στη θέση πριν το πρώτο στοιχείο. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ValueType](./valuetype/) | Πληροφορίες RTTI. |

## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
