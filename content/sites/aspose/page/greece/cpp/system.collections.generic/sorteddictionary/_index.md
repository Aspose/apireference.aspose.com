---
title: "System::Collections::Generic::SortedDictionary κλάση"
linktitle: "SortedDictionary"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::SortedDictionary κλάση. Δήλωση προώθησης τύπου ταξινομημένου λεξικού σε C++."
type: docs
weight: 4000
url: /el/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Προαναγγελία τύπου ταξινομημένου λεξικού.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Λαμβάνει το [IComparer<TKey>](../icomparer/) που χρησιμοποιείται για την ταξινόμηση των στοιχείων του SortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Συνάρτηση πρόσβασης μοναδικού αντικειμένου. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον enumerator για επανάληψη μέσω του τρέχοντος λεξικού. |
| [rbegin](./rbegin/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής (πρώτο σε αντίστροφη σειρά). |
| [rbegin](./rbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο σε αντίστροφη σειρά). |
| [rend](./rend/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής. |
| [rend](./rend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής με const-προσδιορισμό. |
| [SortedDictionary](./sorteddictionary/)() | Δημιουργεί κενό λεξικό. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Δημιουργεί κενό λεξικό. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Κατασκευαστής αντιγραφής. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Κατασκευαστής αντιγραφής. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [const_reverse_iterator](./const_reverse_iterator/) | Τύπος σταθερού αντίστροφου επαναλήπτη. |
| [IEnumerablePtr](./ienumerableptr/) | Συλλογή ίδιων στοιχείων. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) τύπος. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [KeyCollection](./keycollection/) | Τύπος συλλογής κλειδιών. |
| [KVPair](./kvpair/) | Τύπος ζεύγους κλειδιού-τιμής. |
| [map_t](./map_t/) | Βασικός τύπος δεδομένων. |
| [Ptr](./ptr/) | Τύπος δείκτη. |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
| [this_t](./this_t/) | Τύπος εαυτού. |
| [ValueCollection](./valuecollection/) | Τύπος συλλογής τιμών. |
## Παρατηρήσεις


Κλάση ταξινομημένου λεξικού που τυλίγει το STL map. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
