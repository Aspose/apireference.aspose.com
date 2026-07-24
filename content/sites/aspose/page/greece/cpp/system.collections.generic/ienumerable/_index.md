---
title: "System::Collections::Generic::IEnumerable κλάση"
linktitle: "IEnumerable"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IEnumerable κλάση. Διεπαφή αντικειμένου που παρέχει enumerator στα περιεχόμενα στοιχεία σε C++."
type: docs
weight: 2200
url: /el/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Διεπαφή αντικειμένου που παρέχει enumerator στα περιεχόμενα στοιχεία.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [begin](./begin/)() | Λαμβάνει iterator που δείχνει στο πρώτο στοιχείο (εάν υπάρχει) της συλλογής. Αυτός ο iterator δεν μπορεί να χρησιμοποιηθεί για να αλλάξει ένα αναφερόμενο αντικείμενο επειδή το [GetEnumerator()](./getenumerator/) επιστρέφει ένα αντίγραφο-αντικείμενο του T. |
| [begin](./begin/)() const | Επιστρέφει επαναλήπτη που δείχνει στο πρώτο στοιχείο (εάν υπάρχει) της σταθερά-καθορισμένης εμφάνισης της συλλογής. |
| [cbegin](./cbegin/)() const | Επιστρέφει επαναλήπτη που δείχνει στο πρώτο σταθερά-καθορισμένο στοιχείο (εάν υπάρχει) της συλλογής. |
| [cend](./cend/)() const | Επιστρέφει επαναλήπτη που δείχνει αμέσως μετά το τελευταίο σταθερά-καθορισμένο στοιχείο (εάν υπάρχει) της συλλογής. |
| [end](./end/)() | Λαμβάνει iterator που δείχνει αμέσως μετά το τελευταίο στοιχείο (εάν υπάρχει) της συλλογής. Αυτός ο iterator δεν μπορεί να χρησιμοποιηθεί για να αλλάξει ένα αναφερόμενο αντικείμενο επειδή το [GetEnumerator()](./getenumerator/) επιστρέφει ένα αντίγραφο-αντικείμενο του T. |
| [end](./end/)() const | Λαμβάνει επαναλήπτη που δείχνει ακριβώς μετά το τελευταίο στοιχείο (αν υπάρχει) της const-qualified παρουσίασης της συλλογής. |
| virtual [GetEnumerator](./getenumerator/)() | Λαμβάνει τον ενομετρητή. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Εφαρμόζει μια συνάρτηση συσσωρευτή πάνω σε μια ακολουθία. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Καθορίζει εάν όλα τα στοιχεία μιας ακολουθίας ικανοποιούν μια συνθήκη. |
| [LINQ_Any](./linq_any/)() | Καθορίζει εάν μια ακολουθία περιέχει οποιαδήποτε στοιχεία. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Καθορίζει εάν υπάρχει κάποιο στοιχείο σε μια ακολουθία ή εάν ικανοποιεί μια συνθήκη. |
| [LINQ_Cast](./linq_cast/)() | Μετατρέπει τα στοιχεία στον καθορισμένο τύπο. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Συνενώνει δύο ακολουθίες. |
| [LINQ_Contains](./linq_contains/)(T) | Καθορίζει εάν μια ακολουθία περιέχει μια καθορισμένη τιμή. |
| [LINQ_Count](./linq_count/)() | Επιστρέφει τον αριθμό των στοιχείων στην ακολουθία (υπολογισμένο μέσω άμεσης καταμέτρησης). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Επιστρέφει τον αριθμό των στοιχείων στην ακολουθία που ικανοποιούν την καθορισμένη συνθήκη. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Επιστρέφει το στοιχείο σε έναν καθορισμένο δείκτη σε μια ακολουθία. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Επιστρέφει το στοιχείο σε έναν καθορισμένο δείκτη σε μια ακολουθία. |
| [LINQ_First](./linq_first/)() | Επιστρέφει το πρώτο στοιχείο μιας ακολουθίας. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Επιστρέφει το πρώτο στοιχείο μιας ακολουθίας που ικανοποιεί την καθορισμένη συνθήκη. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Επιστρέφει το πρώτο στοιχείο μιας ακολουθίας, ή μια προεπιλεγμένη τιμή εάν η ακολουθία είναι κενή. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Επιστρέφει το πρώτο στοιχείο της ακολουθίας που ικανοποιεί μια συνθήκη ή μια προεπιλεγμένη τιμή εάν δεν βρεθεί τέτοιο στοιχείο. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Ομαδοποιεί τα στοιχεία μιας ακολουθίας. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | Επιστρέφει το τελευταίο στοιχείο μιας ακολουθίας. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Επιστρέφει το τελευταίο στοιχείο μιας ακολουθίας, ή μια προεπιλεγμένη τιμή εάν η ακολουθία είναι κενή. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Καλεί μια συνάρτηση μετασχηματισμού σε κάθε στοιχείο μιας γενικής ακολουθίας και επιστρέφει τη μέγιστη προκύπτουσα τιμή. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Καλεί μια συνάρτηση μετασχηματισμού σε κάθε στοιχείο μιας γενικής ακολουθίας και επιστρέφει τη ελάχιστη προκύπτουσα τιμή. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Φιλτράρει τα στοιχεία της ακολουθίας βάσει του καθορισμένου τύπου. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Ταξινομεί τα στοιχεία μιας ακολουθίας σε αύξουσα σειρά σύμφωνα με τις τιμές κλειδιών που επιλέγονται από το keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Ταξινομεί τα στοιχεία μιας ακολουθίας σε φθίνουσα σειρά σύμφωνα με τις τιμές κλειδιών που επιλέγονται από το keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Αντιστρέφει τη σειρά των στοιχείων σε μια ακολουθία. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Μετασχηματίζει στοιχεία μιας ακολουθίας. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Μετασχηματίζει κάθε στοιχείο μιας ακολουθίας σε νέα μορφή ενσωματώνοντας το δείκτη του στοιχείου. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Προβάλλει κάθε στοιχείο μιας ακολουθίας και συνδυάζει τις προκύπτουσες ακολουθίες σε μία ακολουθία. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Επιστρέφει έναν καθορισμένο αριθμό συνεχόμενων στοιχείων από την αρχή μιας ακολουθίας. |
| [LINQ_ToArray](./linq_toarray/)() | Δημιουργεί έναν πίνακα από μια ακολουθία. |
| [LINQ_ToList](./linq_tolist/)() | Δημιουργεί ένα [List<T>](../list/) από μια ακολουθία. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Φιλτράρει μια ακολουθία βάσει του καθορισμένου προδιαγραφέα. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [IEnumeratorType](./ienumeratortype/) | Πληροφορίες RTTI. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Βασικός τύπος εσωτερικού επαναλήπτη. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Τύπος στοιχείου εσωτερικού επαναλήπτη. |

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
