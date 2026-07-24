---
title: "System::Collections::Generic::BaseSet κλάση"
linktitle: "BaseSet"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε την κλάση System::Collections::Generic::BaseSet σε C++."
type: docs
weight: 800
url: /el/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Ειδικό για C++. |
| [Add](./add/)(const T\&) override | Προσθέτει στοιχείο στο σύνολο. |
| [begin](./begin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής με const-προσδιορισμό. |
| [cbegin](./cbegin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο με χαρακτηριστικό const της συλλογής. |
| [cend](./cend/)() const | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο με χαρακτηριστικό const πίσω από το τέλος της συλλογής. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία στο σύνολο. |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το στοιχείο υπάρχει στο σύνολο. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Αντιγράφει τα περιεχόμενα του hash σε υπάρχοντα στοιχεία του πίνακα. |
| [data](./data/)() | Πρόσβαση στη βασική δομή δεδομένων. |
| [data](./data/)() const | Πρόσβαση στη βασική δομή δεδομένων. |
| [end](./end/)() const | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο πίσω από το τέλος της συλλογής με χαρακτηριστικό const. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων στο σύνολο. |
| [GetEnumerator](./getenumerator/)() override | Δημιουργεί τον επαναλήπτη. |
| [Remove](./remove/)(const T\&) override | Αφαιρεί το στοιχείο από το σύνολο. |
| [TryAdd](./tryadd/)(const T\&) | Προσθέτει στοιχείο στο σύνολο. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Υλοποιημένη διεπαφή. |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [IEnumerablePtr](./ienumerableptr/) | Δείκτης διεπαφής Enumerable. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) δείκτης. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [set_t](./set_t/) | Βασικός τύπος δεδομένων. |
| [ThisPtr](./thisptr/) | Τύπος δείκτη. |
| [ThisType](./thistype/) | Τύπος εαυτού. |
| [ValueType](./valuetype/) | Τύπος τιμής. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
