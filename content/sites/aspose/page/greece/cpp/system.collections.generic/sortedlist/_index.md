---
title: "Κλάση System::Collections::Generic::SortedList"
linktitle: "SortedList"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Collections::Generic::SortedList. Ταξινομημένη λίστα που περιβάλλει τη δομή FlatMap. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 4200
url: /el/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Ταξινομημένη λίστα που περιβάλλει τη δομή FlatMap. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Τύπος κλειδιού. |
| TValue | Τύπος τιμής. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [crbegin](./crbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο στο αντίστροφο). |
| [crend](./crend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο με const-προσδιορισμό πριν την αρχή της συλλογής. |
| [get_Capacity](./get_capacity/)() const | Λαμβάνει τη τρέχουσα χωρητικότητα της λίστας. |
| virtual [get_Keys](./get_keys/)() const | Πρόσβαση στη συλλογή κλειδιών. |
| virtual [get_Values](./get_values/)() const | Πρόσβαση στη συλλογή τιμών. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή που διατρέχει την τρέχουσα λίστα. |
| [IndexOfKey](./indexofkey/)(TKey) const | Αναζητά συγκεκριμένο κλειδί. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Αναζητά συγκεκριμένη τιμή. |
| [rbegin](./rbegin/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής (πρώτο σε αντίστροφη σειρά). |
| [rbegin](./rbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο σε αντίστροφη σειρά). |
| [RemoveAt](./removeat/)(int) | Αφαιρεί το στοιχείο στη συγκεκριμένη θέση. |
| [rend](./rend/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής. |
| [rend](./rend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής με const-προσδιορισμό. |
| [set_Capacity](./set_capacity/)(int) | Ορίζει τη χωρητικότητα της τρέχουσας λίστας. |
| [SortedList](./sortedlist/)() | Δημιουργεί κενή λίστα. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Δημιουργεί κενή λίστα. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Κατασκευαστής αντιγραφής. |
| [SortedList](./sortedlist/)(const map_t\&) | Κατασκευαστής αντιγραφής. |
| [SortedList](./sortedlist/)(int) | Δημιουργεί κενή λίστα. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [const_reverse_iterator](./const_reverse_iterator/) | Τύπος σταθερού αντίστροφου επαναλήπτη. |
| [IEnumerablePtr](./ienumerableptr/) | Συλλογή του ίδιου τύπου ζευγών. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) τύπος. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [KeyCollection](./keycollection/) | Τύπος συλλογής κλειδιών. |
| [KVPair](./kvpair/) | Τύπος ζεύγους κλειδιού‑τιμής. |
| [map_t](./map_t/) | Βασικός τύπος δεδομένων. |
| [Ptr](./ptr/) | Τύπος δείκτη. |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
| [this_t](./this_t/) | Αυτός ο τύπος. |
| [ValueCollection](./valuecollection/) | Τύπος συλλογής τιμών. |

## Δείτε επίσης

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
