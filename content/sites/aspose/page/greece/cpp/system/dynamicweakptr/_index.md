---
title: "Κλάση System::DynamicWeakPtr"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page για C++"
description: "Κλάση System::DynamicWeakPtr. Κλάση έξυπνου δείκτη που παρακολουθεί τις λειτουργίες δεικτών των παραμέτρων προτύπου του αποθηκευμένου αντικειμένου και τις ενημερώνει μετά από κάθε ανάθεση. Αυτός ο τύπος είναι δείκτης για τη διαχείριση της διαγραφής άλλων αντικειμένων. Θα πρέπει να εκχωρείται στη στοίβα και να περνάει σε συναρτήσεις είτε με τιμή είτε με σταθερή αναφορά σε C++."
type: docs
weight: 2200
url: /el/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Κλάση έξυπνου δείκτη που παρακολουθεί τις λειτουργίες δεικτών των παραμέτρων προτύπου του αποθηκευμένου αντικειμένου και τις ενημερώνει μετά από κάθε ανάθεση. Αυτός ο τύπος είναι δείκτης για τη διαχείριση της διαγραφής άλλου αντικειμένου. Πρέπει να κατανεμηθεί στη στοίβα και να περάσει στις συναρτήσεις είτε με τιμή είτε με σταθερή αναφορά.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| Pointee | τύπος. |
| trunkMode | Λειτουργία του έξυπνου δείκτη, κοινόχρηστη ή αδύναμη. |
| weakLeafs | Δείκτες των παραμέτρων προτύπου του αποθηκευμένου τύπου που πρέπει να οριστούν σε αδύναμη λειτουργία δείκτη. |
## Nested classes

* Class [Reference](./reference/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Δημιουργεί μηδενικό έξυπνο δείκτη. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Δημιουργεί έξυπνο δείκτη που δείχνει στο δοσμένο αντικείμενο. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Δημιουργεί αντίγραφο έξυπνου δείκτη. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Δημιουργεί αντίγραφο έξυπνου δείκτη. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Δημιουργεί αντίγραφο έξυπνου δείκτη. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Δημιουργεί μετακίνηση έξυπνου δείκτη. |
| [operator=](./operator=/)(SmartPtr_\&&) | Αναθέτει μετακίνηση σε έξυπνο δείκτη. |
| [operator=](./operator=/)(const SmartPtr_\&) | Αναθέτει αντίγραφο σε έξυπνο δείκτη. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Αναθέτει αντίγραφο σε έξυπνο δείκτη. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Αναθέτει έξυπνο δείκτη. |
| [operator=](./operator=/)(std::nullptr_t) | Ορίζει τον έξυπνο δείκτη σε μηδέν. |
| [operator==](./operator==/)(std::nullptr_t) const | Ελέγχει εάν ο έξυπνος δείκτης είναι null. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Ψευδώνυμο τύπου εαυτού. |
| [Pointee_](./pointee_/) | Τύπος που δείχνει. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) ψευδώνυμο βασικής κλάσης. |

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
