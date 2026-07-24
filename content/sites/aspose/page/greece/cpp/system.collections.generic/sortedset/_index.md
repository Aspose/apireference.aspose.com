---
title: "System::Collections::Generic::SortedSet κλάση"
linktitle: "SortedSet"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::SortedSet κλάση. Προώθηση δήλωσης της κλάσης SortedSet σε C++."
type: docs
weight: 4400
url: /el/cpp/system.collections.generic/sortedset/
---
## SortedSet class


Προώθηση δήλωσης της κλάσης [SortedSet](./).

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Max](./get_max/)() const | Αποκτά τη μέγιστη τιμή στο [SortedSet](./). |
| [SortedSet](./sortedset/)() | Πληροφορίες RTTI. |
| [SortedSet](./sortedset/)(int) | Δημιουργεί κενό σύνολο με καθορισμένη χωρητικότητα. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Δημιουργεί κενό σύνολο που χρησιμοποιεί το καθορισμένο συγκριτή ισότητας. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Δημιουργεί το [SortedSet](./) με βάση τις τιμές enumerable. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Τύπος βάζου. |
| [ThisPtr](./thisptr/) | Τύπος δείκτη. |
| [ThisType](./thistype/) | Τύπος εαυτού. |
## Παρατηρήσεις


Υλοποίηση ενός συνόλου διατεταγμένων αντικειμένων. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκύψουν σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
