---
title: "System::Collections::Generic::SimpleEnumerator κλάση"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::SimpleEnumerator class. Κλάση επαναλήπτη για απλούς containers που κρατούν στοιχεία απευθείας χρησιμοποιώντας τις συναρτήσεις rbegin() και rend(). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3900
url: /el/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Κλάση επαναλήπτη για απλούς containers που κρατούν στοιχεία απευθείας χρησιμοποιώντας τις συναρτήσεις rbegin() και rend(). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parameter | Περιγραφή |
| --- | --- |
| Κοντέινερ | Τύπος κοντέινερ για επανάληψη. |
| Element | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| [get_Current](./get_current/)() const override | Λαμβάνει το στοιχείο 'current'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Δημιουργεί απλό επαναλήπτη. |

## Δείτε επίσης

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
