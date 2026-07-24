---
title: "System::Collections::Generic::BaseDictionary class"
linktitle: "BaseDictionary"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::BaseDictionary class. Υλοποιεί κοινό κώδικα για διάφορες δομές δεδομένων παρόμοιες με λεξικό (π.χ. Dictionary, SortedDictionary). Δεν πρέπει να χρησιμοποιείται άμεσα, εκτός από κληρονομικότητα κατά τον ορισμό containers. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε instance αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Υλοποιεί κοινό κώδικα για διάφορες δομές δεδομένων παρόμοιες με λεξικό (π.χ. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). Δεν πρέπει να χρησιμοποιείται άμεσα, εκτός από κληρονομικότητα κατά τον ορισμό containers. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε instance αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parameter | Περιγραφή |
| --- | --- |
| Map | Τύπος υποκείμενου χάρτη. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | Ειδικό για C++. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Προσθέτει ζεύγος κλειδί-τιμή στο λεξικό. |
| [BaseDictionary](./basedictionary/)() | Δημιουργεί κενή δομή δεδομένων. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Κατασκευαστής προώθησης για τη μεταβίβαση ορισμάτων στον κατασκευαστή του υποκείμενου χάρτη. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Κατασκευαστής αντιγραφής. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Κατασκευαστής αντιγραφής. |
| [begin](./begin/)() const | Επιστρέφει έναν επαναλήπτη προς το KVPair-wrapper για το στοιχείο κλειδί-τιμή του container. Υλοποιείται σε στυλ C# - ο επαναλήπτης πρέπει να επιστρέφει το αντικείμενο KVPair με τις διεπαφές get_Key() και get_Value(). Εάν το container είναι κενό, ο επιστρεφόμενος επαναλήπτης θα είναι ίσος με [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | Επιστρέφει έναν επαναλήπτη προς το πρώτο στοιχείο του container. Υλοποιείται σε στυλ STL. Εάν το container είναι κενό, ο επιστρεφόμενος επαναλήπτης θα είναι ίσος με [end()](../ienumerable/end/). |
| [cend](./cend/)() const | Επιστρέφει έναν επαναλήπτη προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του container. Υλοποιείται σε στυλ STL. Αυτό το στοιχείο λειτουργεί ως placeholder· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Ελέγχει αν το κλειδί υπάρχει στο λεξικό. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Ελέγχει αν η τιμή υπάρχει στο λεξικό. Χρησιμοποιεί τον τελεστή == για σύγκριση τιμών. |
| [data](./data/)() | Πρόσβαση στον υποκείμενο χώρο αποθήκευσης δεδομένων. |
| [data](./data/)() const | Πρόσβαση στον υποκείμενο χώρο αποθήκευσης δεδομένων. |
| [end](./end/)() const | Επιστρέφει έναν επαναλήπτη προς το KVPair-wrapper για το στοιχείο-κλειδί-τιμή που ακολουθεί το τελευταίο στοιχείο του δοχείου. Υλοποιείται σε στυλ C# - ο επαναλήπτης πρέπει να επιστρέφει το KVPair-object με τη διεπαφή get_Key() και get_Value(). Αυτό το στοιχείο λειτουργεί ως placeholder· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων. |
| virtual [GetEnumerator](./getenumerator/)() | Δημιουργεί μια παρουσία του enumerator, θα πρέπει να υλοποιηθεί από την υποκλάση. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Επιστρέφει την τιμή αν βρεθεί· ή **Value()** διαφορετικά. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Επιστρέφει την τιμή αν βρεθεί· ή **defaultValue** διαφορετικά. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Επιστρέφει την τιμή αν βρεθεί· ή **null** διαφορετικά. Έχει νόημα μόνο για τύπους αναφοράς. |
| [idx_get](./idx_get/)(const key_t\&) const override | Συνάρτηση getter με κλειδί. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Συνάρτηση setter με κλειδί. Τροποποιεί ή δημιουργεί στοιχείο. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Συνάρτηση πρόσβασης. |
| [Remove](./remove/)(const key_t\&) override | Αφαιρεί συγκεκριμένο κλειδί από το λεξικό. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Αναζητεί την τιμή με κλειδί και την ανακτά αν βρεθεί. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Υλοποιημένη διεπαφή. |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [KeyCollection](./keycollection/) | Βεβαιωθείτε ότι χρησιμοποιούμε τον σωστό allocator με τον υποκείμενο τύπο αποθήκευσης. |
| [KVPair](./kvpair/) | Τύπος ζεύγους κλειδιού-τιμής. |
| [map_t](./map_t/) | Εσωτερικός τύπος χάρτη. |
| [ValueCollection](./valuecollection/) | Συλλογή τιμών. |

## Δείτε επίσης

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
