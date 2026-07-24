---
title: "System::Collections::Specialized::StringCollection κλάση"
linktitle: "StringCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::Specialized::StringCollection κλάση. Καταχωρημένη λίστα συμβολοσειρών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() . Ποτέ μην δημιουργείτε ένα αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


Καταχωρημένη λίστα συμβολοσειρών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::String\&) | Προσθέτει τιμή στο τέλος της λίστας. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Προσθέτει στοιχεία στο container. |
| [begin](./begin/)() | Επιστρέφει έναν iterator προς το πρώτο στοιχείο του container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator θα είναι ίσος με [end()](./end/). |
| [begin](./begin/)() const | Επιστρέφει έναν iterator προς το πρώτο στοιχείο του const‑qualified container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator θα είναι ίσος με [end()](./end/). |
| [cbegin](./cbegin/)() const | Επιστρέφει έναν iterator προς το πρώτο const‑qualified στοιχείο του container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator θα είναι ίσος με [cend()](./cend/). |
| [cend](./cend/)() const | Επιστρέφει έναν iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [Clear](./clear/)() | Διαγράφει όλα τα στοιχεία. |
| [Contains](./contains/)(const System::String\&) const | Ελέγχει αν μια συγκεκριμένη συμβολοσειρά υπάρχει στο container. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Αντιγράφει στοιχεία σε υπάρχοντα στοιχεία του array. |
| [crbegin](./crbegin/)() const | Επιστρέφει έναν reverse iterator προς το πρώτο στοιχείο του reversed container. Αντιστοιχεί στο τελευταίο στοιχείο του non‑reversed container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator είναι ίσος με [crend()](./crend/). |
| [crend](./crend/)() const | Επιστρέφει έναν reverse iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του reversed container. Αντιστοιχεί στο στοιχείο που προηγείται του πρώτου στοιχείου του non‑reversed container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [data](./data/)() | Πρόσβαση σε εσωτερική δομή δεδομένων. |
| [data](./data/)() const | Πρόσβαση σε εσωτερική δομή δεδομένων. |
| [end](./end/)() | Επιστρέφει έναν iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [end](./end/)() const | Επιστρέφει έναν iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του const‑qualified container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [get_Count](./get_count/)() const | Λαμβάνει τον αριθμό των στοιχείων στη συλλογή. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον enumerator που διατρέχει την τρέχουσα συλλογή. |
| [idx_get](./idx_get/)(int) const | Λαμβάνει την τιμή στη συγκεκριμένη θέση. |
| [idx_set](./idx_set/)(int, const System::String\&) | Ορίζει την τιμή στη συγκεκριμένη θέση. |
| [IndexOf](./indexof/)(const System::String\&) const | Αναζητά συγκεκριμένη συμβολοσειρά στο δοχείο. |
| [Insert](./insert/)(int, const System::String\&) | Εισάγει συγκεκριμένη τιμή στο δοχείο. |
| [operator[]](./operator[]/)(int) | Συνάρτηση πρόσβασης. |
| [rbegin](./rbegin/)() | Επιστρέφει έναν αντίστροφο επαναλήπτη στο πρώτο στοιχείο του αντιστραμμένου δοχείου. Αντιστοιχεί στο τελευταίο στοιχείο του μη αντιστραμμένου δοχείου. Εάν το δοχείο είναι κενό, ο επιστρεφόμενος επαναλήπτης είναι ίσος με [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Επιστρέφει έναν αντίστροφο επαναλήπτη στο πρώτο στοιχείο του αντιστραμμένου δοχείου. Αντιστοιχεί στο τελευταίο στοιχείο του μη αντιστραμμένου δοχείου. Εάν το δοχείο είναι κενό, ο επιστρεφόμενος επαναλήπτης είναι ίσος με [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | Αφαιρεί την πρώτη εμφάνιση της συγκεκριμένης συμβολοσειράς. |
| [RemoveAt](./removeat/)(int) | Αφαιρεί το στοιχείο στη συγκεκριμένη θέση. |
| [rend](./rend/)() | Επιστρέφει έναν reverse iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του reversed container. Αντιστοιχεί στο στοιχείο που προηγείται του πρώτου στοιχείου του non‑reversed container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [rend](./rend/)() const | Επιστρέφει έναν reverse iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του reversed container. Αντιστοιχεί στο στοιχείο που προηγείται του πρώτου στοιχείου του non‑reversed container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [StringCollection](./stringcollection/)() | Δημιουργεί κενή συλλογή συμβολοσειρών. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [const_reverse_iterator](./const_reverse_iterator/) | Τύπος σταθερού αντίστροφου επαναλήπτη. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
