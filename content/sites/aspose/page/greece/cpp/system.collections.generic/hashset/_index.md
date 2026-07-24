---
title: "System::Collections::Generic::HashSet κλάση"
linktitle: "HashSet"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::HashSet κλάση. Προκαταρκτική δήλωση της κλάσης HashSet σε C++."
type: docs
weight: 1700
url: /el/cpp/system.collections.generic/hashset/
---
## HashSet class


Προκαταρκτική δήλωση της κλάσης [HashSet](./).

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [HashSet](./hashset/)() | Πληροφορίες RTTI. |
| [HashSet](./hashset/)(int) | Δημιουργεί κενό σύνολο με καθορισμένη χωρητικότητα. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Δημιουργεί κενό σύνολο που χρησιμοποιεί το καθορισμένο συγκριτή ισότητας. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Δημιουργεί hashset βασισμένο σε επαναληπτικές τιμές. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Βασικός τύπος. |
| [ThisPtr](./thisptr/) | Τύπος δείκτη. |
| [ThisType](./thistype/) | Τύπος εαυτού. |
## Παρατηρήσεις


Υλοποίηση συνόλου βασισμένη σε κατακερματισμό. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
