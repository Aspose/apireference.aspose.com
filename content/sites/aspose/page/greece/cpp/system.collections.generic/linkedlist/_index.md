---
title: "System::Collections::Generic::LinkedList κλάση"
linktitle: "LinkedList"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::LinkedList κλάση. Προκαταρκτική δήλωση LinkedList σε C++."
type: docs
weight: 3100
url: /el/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής που περιέχεται. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const T\&) override | Προσθέτει **element** στο τέλος της λίστας. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Προσθέτει **element** μετά το **node** της λίστας. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Προσθέτει **newNode** μετά το **node** της λίστας. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Προσθέτει **element** πριν το **node** της λίστας. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Προσθέτει **newNode** πριν το **node** της λίστας. |
| [AddFirst](./addfirst/)(const T\&) | Προσθέτει **element** στην αρχή της λίστας. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Προσθέτει **newNode** στην αρχή της λίστας. |
| [AddLast](./addlast/)(const T\&) | Προσθέτει **element** στο τέλος της λίστας. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Προσθέτει **newNode** στο τέλος της λίστας. |
| [begin](./begin/)() | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής. |
| [begin](./begin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο της συλλογής με const-προσδιορισμό. |
| [cbegin](./cbegin/)() const | Λαμβάνει επαναλήπτη στο πρώτο στοιχείο με χαρακτηριστικό const της συλλογής. |
| [cend](./cend/)() const | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο με χαρακτηριστικό const πίσω από το τέλος της συλλογής. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία στη λίστα. |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το **element** υπάρχει στη λίστα. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Αντιγράφει τα δεδομένα του container σε υπάρχοντα στοιχεία του πίνακα. |
| [crbegin](./crbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο στο αντίστροφο). |
| [crend](./crend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο με const-προσδιορισμό πριν την αρχή της συλλογής. |
| [end](./end/)() | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο πίσω από το τέλος της συλλογής. |
| [end](./end/)() const | Λαμβάνει επαναλήπτη για ένα ανύπαρκτο στοιχείο πίσω από το τέλος της συλλογής με χαρακτηριστικό const. |
| [Find](./find/)(const T\&) const | Εκτελεί αναζήτηση προς τα εμπρός του **element** στη λίστα. |
| [FindLast](./findlast/)(const T\&) const | Εκτελεί αναζήτηση προς τα πίσω του **element** στη λίστα. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων στη λίτα. |
| [get_First](./get_first/)() const | Λαμβάνει δείκτη στο πρώτο στοιχείο της λίστας. |
| [get_Last](./get_last/)() const | Λαμβάνει δείκτη στο τελευταίο στοιχείο της λίστας. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει enumerator για επανάληψη μέσω της τρέχουσας [LinkedList](./). |
| [LinkedList](./linkedlist/)() | Δημιουργεί κενή [LinkedList](./). |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Κατασκευαστής αντιγραφής. |
| [rbegin](./rbegin/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής (πρώτο σε αντίστροφη σειρά). |
| [rbegin](./rbegin/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη στο τελευταίο στοιχείο της συλλογής με const-προσδιορισμό (πρώτο σε αντίστροφη σειρά). |
| [Remove](./remove/)(const T\&) override | Αφαιρεί την πρώτη εμφάνιση του καθορισμένου **element** από τη λίστα. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Αφαιρεί κόμβο από τη λίστα. |
| [RemoveFirst](./removefirst/)() | Αφαιρεί τον πρώτο κόμβο από τη λίστα. |
| [RemoveLast](./removelast/)() | Αφαιρεί τον τελευταίο κόμβο από τη λίστα. |
| [rend](./rend/)() | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής. |
| [rend](./rend/)() const | Λαμβάνει έναν αντίστροφο επαναλήπτη για ένα μη υπάρχον στοιχείο πριν από την αρχή της συλλογής με const-προσδιορισμό. |
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
| [list_t](./list_t/) | Βασικός τύπος δεδομένων. |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
## Παρατηρήσεις


Κοντέινερ συνδεδεμένης λίστας. Υλοποιεί μια περιτύλιξη πάνω από το std::list. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Δημιουργήστε ένα αντίγραφο της κλάσης LinkedList.
  auto list = MakeObject<LinkedList<int>>();

  // Γεμίστε τη συνδεδεμένη λίστα.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Εκτυπώστε τα στοιχεία της συνδεδεμένης λίστας.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
