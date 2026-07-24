---
title: "System::Collections::Generic::IDictionary κλάση"
linktitle: "IDictionary"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IDictionary κλάση. Interface για containers τύπου λεξικού. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα στη C++."
type: docs
weight: 2100
url: /el/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Interface για containers τύπου λεξικού. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Τύπος κλειδιού. |
| TValue | Τύπος τιμής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Προσθέτει ζεύγος κλειδί‑τιμή στο container. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Ελέγχει αν το container περιέχει το κλειδί. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Αντιγράφει τα περιεχόμενα του λεξικού σε υπάρχοντα στοιχεία του πίνακα. |
| virtual [get_Count](./get_count/)() const | Αποκαλύπτει τη μέθοδο μέλους get_Count. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Ελέγχει αν το μέγεθος της συλλογής είναι σταθερό. |
| [get_IsSynchronized](./get_issynchronized/)() const | Ελέγχει αν το container είναι ασφαλές για νήματα. |
| virtual [get_Keys](./get_keys/)() const | Πρόσβαση στη συλλογή κλειδιών. |
| virtual [get_Values](./get_values/)() const | Πρόσβαση στη συλλογή τιμών. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Επιστρέφει την τιμή αν βρεθεί· ή **Value()** διαφορετικά. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Επιστρέφει την τιμή αν βρεθεί· ή **defaultValue** διαφορετικά. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Επιστρέφει την τιμή αν βρεθεί· ή **null** διαφορετικά, έχει νόημα μόνο για τύπους αναφοράς. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Συνάρτηση getter. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Συνάρτηση setter. |
| virtual [Remove](./remove/)(const TKey\&) | Αφαιρεί το κλειδί από το δοχείο. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Αναζητά την τιμή και την ανακτά αν βρεθεί. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Πληροφορίες RTTI. |
| [KeyValuePairType](./keyvaluepairtype/) | Τύπος ζεύγους κλειδιού‑τιμής. |

## Δείτε επίσης

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
