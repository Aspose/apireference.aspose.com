---
title: "System::Collections::ObjectModel::Collection κλάση"
linktitle: "Συλλογή"
second_title: "Aspose.Page για C++"
description: "System::Collections::ObjectModel::Collection κλάση. Βασικός τύπος για γενική συλλογή. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.collections.objectmodel/collection/
---
## Collection class


Βασικός τύπος για γενική συλλογή. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const T\&) override | Προσθέτει τιμή στο δοχείο. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [Collection](./collection/)() | Δημιουργεί κενή συλλογή. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το στοιχείο υπάρχει στη συλλογή. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Αντιγράφει τα στοιχεία της συλλογής σε υπάρχοντα στοιχεία πίνακα. |
| [crbegin](./crbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο στο αντίστροφο). |
| [crend](./crend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο με const-προσδιορισμό πριν την αρχή της συλλογής. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων. |
| [get_Items](./get_items/)() | Πρόσβαση σε εσωτερική δομή δεδομένων. |
| [get_Items](./get_items/)() const | Πρόσβαση σε εσωτερική δομή δεδομένων. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή για επανάληψη μέσω της συλλογής. |
| [idx_get](./idx_get/)(int) const override | Λαμβάνει την τιμή στο καθορισμένο δείκτη. |
| [idx_set](./idx_set/)(int, T) override | Ορίζει την τιμή σε συγκεκριμένο δείκτη. |
| [IndexOf](./indexof/)(const T\&) const override | Αναζητά στοιχείο στη συλλογή. |
| [Insert](./insert/)(int, const T\&) override | Εισάγει το στοιχείο στη συγκεκριμένη θέση. |
| [operator[]](./operator[]/)(int) | Λαμβάνει την τιμή στο καθορισμένο δείκτη. |
| [operator[]](./operator[]/)(int) const | Λαμβάνει την τιμή στο καθορισμένο δείκτη. |
| [rbegin](./rbegin/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής (πρώτο σε αντίστροφη σειρά). |
| [rbegin](./rbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο σε αντίστροφη σειρά). |
| [Remove](./remove/)(const T\&) override | Αφαιρεί συγκεκριμένο στοιχείο. |
| [RemoveAt](./removeat/)(int) override | Αφαιρεί το στοιχείο σε συγκεκριμένη θέση. |
| [rend](./rend/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής. |
| [rend](./rend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής με const-προσδιορισμό. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Κάνει τους αποθηκευμένους δείκτες αδύναμους (εάν ισχύει). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Δείτε επίσης

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
