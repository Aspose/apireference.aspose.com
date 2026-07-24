---
title: "System::Collections::Generic::_ValueCollection class"
linktitle: "_ValueCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::_ValueCollection class. Συλλογή των τιμών του Dictionary''. Αναφέρεται στη συλλογή, δεν αντιγράφει τίποτα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Συλλογή των τιμών του [Dictionary](../dictionary/). Αναφέρεται στη συλλογή, δεν αντιγράφει τίποτα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Αρχικοποιεί τη συλλογή που αναφέρεται στο συγκεκριμένο λεξικό. |
| [Contains](./contains/)(const TValue\&) const override | Ελέγχει αν το στοιχείο υπάρχει στο δοχείο. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον επαναλήπτη που διατρέχει τις τιμές. |
| [idx_get](./idx_get/)(int) const override | Εφαρμόζει τη μέθοδο [IList](../ilist/). Δεν υποστηρίζεται. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [TValue](./tvalue/) | Τύπος τιμής. |

## Δείτε επίσης

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
