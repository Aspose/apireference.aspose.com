---
title: "Κλάση System::Collections::Generic::ISet"
linktitle: "ISet"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Collections::Generic::ISet. Διεπαφή συλλογής που περιέχει ένα σύνολο μοναδικών στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2700
url: /el/cpp/system.collections.generic/iset/
---
## ISet class


Διεπαφή συλλογής που περιέχει ένα σύνολο μοναδικών στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Αφαιρεί ομάδα στοιχείων. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Αφαιρεί στοιχεία που δεν υπάρχουν σε διαφορετικό υποδοχέα. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Ελέγχει αν το τρέχον σύνολο είναι αυστηρό υποσύνολο του άλλου υποδοχέα. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Ελέγχει αν το τρέχον σύνολο είναι αυστηρό υπερσύνολο του άλλου υποδοχέα. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Ελέγχει αν το τρέχον σύνολο είναι υποσύνολο του άλλου υποδοχέα. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Ελέγχει αν το τρέχον σύνολο είναι υπερσύνολο του άλλου υποδοχέα. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Ελέγχει αν το σύνολο επικαλύπτεται με το άλλο υποδοχέα. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Ελέγχει αν το σύνολο και ο υποδοχέας περιέχουν τα ίδια στοιχεία. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | Υπολογίζει τη συμμετρική εξαίρεση δύο υποδοχέων. Αφαιρεί όλα τα στοιχεία που είναι παρόντα και στους δύο υποδοχείς, αλλά ταυτόχρονα προσθέτει όλα τα στοιχεία που είναι παρόντα στο **other**, αλλά όχι στο τρέχον σύνολο. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Προσθέτει στοιχεία από την καθορισμένη συλλογή που δεν υπάρχουν ακόμη στο τρέχον σύνολο. |
| virtual [~ISet](./~iset/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Πληροφορίες RTTI. |

## Δείτε επίσης

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
