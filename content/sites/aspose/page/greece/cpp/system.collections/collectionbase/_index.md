---
title: "System::Collections::CollectionBase κλάση"
linktitle: "CollectionBase"
second_title: "Aspose.Page για C++"
description: "System::Collections::CollectionBase κλάση. Παρέχει μια αφηρημένη βασική κλάση για μια ισχυρά τυποποιημένη συλλογή σε C++."
type: docs
weight: 300
url: /el/cpp/system.collections/collectionbase/
---
## CollectionBase class


Παρέχει μια αφηρημένη βασική κλάση για μια συλλογή με ισχυρή τυποποίηση.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος των στοιχείων της συλλογής |
## Nested classes

* Class [ListImpl](./listimpl/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clear](./clear/)() | Αφαιρεί όλα τα αντικείμενα από την παρουσία της συλλογής. Αυτή η μέθοδος δεν μπορεί να παρακαμφθεί. |
| [get_Capacity](./get_capacity/)() | Επιστρέφει τον αριθμό των στοιχείων που μπορεί να περιέχει η συλλογή. |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των στοιχείων που περιέχονται στην παρουσία της συλλογής. Αυτή η μέθοδος δεν μπορεί να παρακαμφθεί. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει έναν απαριθμητή που διατρέχει την παρουσία της συλλογής. |
| [RemoveAt](./removeat/)(int32_t) | Αφαιρεί το στοιχείο στο καθορισμένο δείκτη της παρουσίας της συλλογής. Αυτή η μέθοδος δεν είναι παρακαμφτέα. |
| [set_Capacity](./set_capacity/)(int32_t) | Ορίζει τον αριθμό των στοιχείων που μπορεί να περιέχει η συλλογή. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |

## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
