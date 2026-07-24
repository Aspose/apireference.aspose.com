---
title: "System::Collections::Generic::ICollection class"
linktitle: "ICollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::ICollection class. Διεπαφή συλλογής στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1900
url: /el/cpp/system.collections.generic/icollection/
---
## ICollection class


Διεπαφή συλλογής στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Προσθέτει στοιχείο στη συλλογή. |
| virtual [Clear](./clear/)() | Διαγράφει όλα τα στοιχεία από τη συλλογή. |
| virtual [Contains](./contains/)(const T\&) const | Ελέγχει αν το στοιχείο υπάρχει στη συλλογή. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Αντιγράφει όλα τα στοιχεία της συλλογής σε υπάρχοντα στοιχεία του πίνακα. |
| virtual [get_Count](./get_count/)() const | Λαμβάνει τον αριθμό των στοιχείων στη συλλογή. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Ελέγχει αν η συλλογή είναι μόνο για ανάγνωση. |
| [get_SyncRoot](./get_syncroot/)() const | Λαμβάνει το αντικείμενο μέσω του οποίου συγχρονίζεται η συλλογή. |
| [ICollection](./icollection/)() | Προεπιλεγμένος κατασκευαστής. |
| [ICollection](./icollection/)(const ICollection\&) | Κατασκευαστής αντιγραφής. |
| [ICollection](./icollection/)(ICollection\&&) | Κατασκευαστής μετακίνησης. |
| [operator=](./operator=/)(ICollection\&&) | Τελεστής ανάθεσης μετακίνησης. |
| [operator=](./operator=/)(const ICollection\&) | Τελεστής ανάθεσης μετακίνησης. |
| virtual [Remove](./remove/)(const T\&) | Διαγράφει το στοιχείο από τη συλλογή. |
| virtual [~ICollection](./~icollection/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ThisType](./thistype/) | Όνομα τύπου συλλογής. |
| [ValueType](./valuetype/) | Πληροφορίες RTTI. |

## Δείτε επίσης

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
