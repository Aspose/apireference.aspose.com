---
title: "System::Collections::Generic::List κλάση"
linktitle: "Λίστα"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::List κλάση. Προκαταρκτική δήλωση λίστας σε C++."
type: docs
weight: 3300
url: /el/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Ειδικό για C++. |
| [Add](./add/)(const T\&) override | Προσθέτει στοιχείο στο τέλος της λίστας. |
| [AddInitializer](./addinitializer/)(int, const T *) | Προσθέτει στοιχεία στη λίστα· χρησιμοποιείται κατά τη μετάφραση αρχικοποιητών. |
| [AddRange](./addrange/)(IEnumerablePtr) | Προσθέτει όλα τα στοιχεία από τη συλλογή (ή από τον εαυτό της) στο τέλος της τρέχουσας λίστας. |
| [AsReadOnly](./asreadonly/)() | Λαμβάνει αναφορά μόνο για ανάγνωση σε αυτή τη συλλογή. |
| [begin](./begin/)() | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής. |
| [begin](./begin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής με const-προσδιορισμό. |
| [BinarySearch](./binarysearch/)(const T\&) const | Αναζητά το στοιχείο σε μια ταξινομημένη λίστα. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Αναζητά το στοιχείο σε μια ταξινομημένη λίστα. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Αναζητά το στοιχείο σε μια ταξινομημένη λίστα. |
| [cbegin](./cbegin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο με χαρακτηριστικό const της συλλογής. |
| [cend](./cend/)() const | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο με χαρακτηριστικό const πίσω από το τέλος της συλλογής. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το στοιχείο υπάρχει στη λίστα. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Δημιουργεί μια λίστα στοιχείων που έχουν μετατραπεί σε διαφορετικό τύπο. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Αντιγράφει τα στοιχεία της λίστας σε υπάρχοντα στοιχεία του πίνακα. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Αντιγράφει όλα τα στοιχεία σε υπάρχοντα στοιχεία του πίνακα. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Αντιγράφει στοιχεία ξεκινώντας από το καθορισμένο δείκτη σε υπάρχοντα στοιχεία του πίνακα. |
| [crbegin](./crbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο στο αντίστροφο). |
| [crend](./crend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο με const-προσδιορισμό πριν την αρχή της συλλογής. |
| [data](./data/)() | Λειτουργία πρόσβασης στη βασική δομή δεδομένων. |
| [data](./data/)() const | Λειτουργία πρόσβασης στη βασική δομή δεδομένων. |
| [end](./end/)() | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο πίσω από το τέλος της συλλογής. |
| [end](./end/)() const | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο πίσω από το τέλος της συλλογής με χαρακτηριστικό const. |
| [Exists](./exists/)(System::Predicate\<T\>) | Ελέγχει αν υπάρχει στοιχείο που ικανοποιεί συγκεκριμένο πρότυπο στη λίστα. |
| [Find](./find/)(System::Predicate\<T\>) | Αναζητά στοιχείο που ικανοποιεί συγκεκριμένο πρότυπο. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Αναζητά στοιχεία που ικανοποιούν συγκεκριμένο πρότυπο. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Αναζητά στοιχείο που ικανοποιεί συγκεκριμένο πρότυπο. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Αναζητά στοιχείο που ικανοποιεί συγκεκριμένο πρότυπο. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Αναζητά στοιχείο που ικανοποιεί συγκεκριμένο πρότυπο. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Αναζητά το τελευταίο στοιχείο που ικανοποιεί συγκεκριμένο πρότυπο. |
| [ForEach](./foreach/)(System::Action\<T\>) | Εφαρμόζει ενέργεια σε όλα τα στοιχεία της λίστας. |
| [get_Capacity](./get_capacity/)() const | Λαμβάνει τη τρέχουσα χωρητικότητα της λίστας. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων στην τρέχουσα λίστα. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή για επανάληψη μέσω των στοιχείων της λίστας. |
| [GetRange](./getrange/)(int, int) | Δημιουργεί τμήμα της λίστας. |
| [idx_get](./idx_get/)(int) const override | Λαμβάνει το στοιχείο σε συγκεκριμένη θέση. |
| [idx_set](./idx_set/)(int, T) override | Ορίζει το στοιχείο σε συγκεκριμένη θέση. |
| [IndexOf](./indexof/)(const T\&) const override | Λαμβάνει τον πρώτο δείκτη του συγκεκριμένου αντικειμένου. |
| [IndexOf](./indexof/)(const T\&, int) const | Αναζητά το συγκεκριμένο αντικείμενο στη λίστα. |
| [Insert](./insert/)(int, const T\&) override | Εισάγει το αντικείμενο στην καθορισμένη θέση. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Εισάγει το εύρος δεδομένων στην συγκεκριμένη θέση. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Αναζητά το καθορισμένο αντικείμενο και επιστρέφει τον μηδενικό δείκτη της τελευταίας εμφάνισης μέσα σε ολόκληρη τη λίστα. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Αναζητά το καθορισμένο αντικείμενο και επιστρέφει τον μηδενικό δείκτη της τελευταίας εμφάνισης εντός του εύρους των στοιχείων στη [List](./) που εκτείνεται από το πρώτο στοιχείο έως τον καθορισμένο δείκτη. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Αναζητά το καθορισμένο αντικείμενο και επιστρέφει τον μηδενικό δείκτη της τελευταίας εμφάνισης εντός του εύρους των στοιχείων στη [List](./) που περιέχει τον καθορισμένο αριθμό στοιχείων και τελειώνει στον καθορισμένο δείκτη. |
| [List](./list/)() | Δημιουργεί κενή λίστα. |
| [List](./list/)(int) | Δημιουργεί λίστα με προ-ορισμένη χωρητικότητα. |
| [List](./list/)(IEnumerablePtr) | Κατασκευαστής αντιγραφής. |
| [operator[]](./operator[]/)(int) | Συνάρτηση πρόσβασης. |
| [operator[]](./operator[]/)(int) const | Συνάρτηση πρόσβασης. |
| [rbegin](./rbegin/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής (πρώτο σε αντίστροφη σειρά). |
| [rbegin](./rbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο σε αντίστροφη σειρά). |
| [Remove](./remove/)(const T\&) override | Αφαιρεί την πρώτη εμφάνιση του συγκεκριμένου στοιχείου από τη λίστα. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Αφαιρεί όλα τα στοιχεία που ταιριάζουν με συγκεκριμένη συνθήκη. |
| [RemoveAt](./removeat/)(int) override | Αφαιρεί το στοιχείο στη συγκεκριμένη θέση. |
| [RemoveRange](./removerange/)(int, int) | Αφαιρεί τμήμα της λίστας. |
| [rend](./rend/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής. |
| [rend](./rend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής με const-προσδιορισμό. |
| [Reverse](./reverse/)() | Αντιστρέφει τη σειρά των στοιχείων ολόκληρης της λίστας. |
| [Reverse](./reverse/)(int, int) | Αντιστρέφει τη σειρά των στοιχείων του τμήματος της λίστας. |
| [set_Capacity](./set_capacity/)(int) | Ορίζει τη χωρητικότητα της λίστας. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Ταξινομεί τα στοιχεία στη λίστα. |
| [Sort](./sort/)() | Ταξινομεί τα στοιχεία στη λίτα χρησιμοποιώντας τον προεπιλεγμένο συγκριτή. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Ταξινομεί τα στοιχεία στο τμήμα της λίστας. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Ταξινομεί τα στοιχεία στη λίστα. |
| [ToArray](./toarray/)() const | Μετατρέπει τη λίστα σε πίνακα. |
| [TrimExcess](./trimexcess/)() | Ρυθμίζει τη χωρητικότητα της λίστας ώστε να ταιριάζει στο μέγεθός της. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Καθορίζει εάν κάθε στοιχείο στη συλλογή ταιριάζει με τις συνθήκες που ορίζονται από την καθορισμένη συνθήκη. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Τύπος διεπαφής. |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [const_reverse_iterator](./const_reverse_iterator/) | Τύπος σταθερού αντίστροφου επαναλήπτη. |
| [IEnumerablePtr](./ienumerableptr/) | Κοντέινερ που περιέχει στοιχεία του ίδιου τύπου που διατηρούμε. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) τύπος. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
| [ValueType](./valuetype/) | Αυτός ο τύπος. |
| [vector_t](./vector_t/) | Πληροφορίες RTTI. |
## Παρατηρήσεις


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Δημιουργήστε την πρώτη λίστα.
  auto list1 = MakeObject<List<int>>();

  // Συμπληρώστε την πρώτη λίστα.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // Ταξινομήστε την πρώτη λίστα.
  // Τα στοιχεία της πρώτης λίστας θα είναι: {-5, 1, 3, 8}
  list1->Sort();

  // Αφαιρέστε το στοιχείο στη θέση 2.
  // Τα στοιχεία της πρώτης λίστας θα είναι: {-5, 1, 8}
  list1->RemoveAt(2);

  // Εισάγετε το στοιχείο στη θέση 1.
  // Τα στοιχεία της πρώτης λίστας θα είναι: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // Δημιουργήστε τη δεύτερη λίστα.
  auto list2 = MakeObject<List<int>>();

  // Συμπληρώστε τη δεύτερη λίστα.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // Προσθέστε στοιχεία από τη δεύτερη λίστα στην πρώτη.
  list1->AddRange(list2);

  // Εκτυπώστε τα στοιχεία της πρώτης λίστας.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
