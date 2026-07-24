---
title: "System::Collections::IListImplValueType κλάση"
linktitle: "IListImplValueType"
second_title: "Aspose.Page για C++"
description: "System::Collections::IListImplValueType κλάση. Κώδικας-πρότυπο που υλοποιεί το interface System::Collections::IList σε αντικείμενο System::Collections::Generic::List. Υλοποίηση για τύπους τιμών σε C++."
type: docs
weight: 1200
url: /el/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


Κώδικας-πρότυπο που υλοποιεί το interface [System::Collections::IList](../ilist/) σε αντικείμενο [System::Collections::Generic::List](../../system.collections.generic/list/). Υλοποίηση για τύπους τιμών.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Προσθέτει στοιχείο στο τέλος της λίστας. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Ελέγχει αν το στοιχείο υπάρχει στη λίστα. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) υλοποίηση μεθόδων. Λαμβάνει τον αριθμό των στοιχείων στη συλλογή. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) υλοποίηση. Επιστρέφει έναν επαναλήπτη που διασχίζει μια συλλογή. |
| [idx_get](./idx_get/)(int, int) const override | Λαμβάνει το στοιχείο στον καθορισμένο δείκτη. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | Δημιουργεί νέα παρουσία αντικειμένου. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Λαμβάνει το δείκτη της πρώτης εμφάνισης του στοιχείου στο δοχείο. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Εισάγει στοιχείο στη συγκεκριμένη θέση, μετακινώντας τα άλλα στοιχεία. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Αφαιρεί την πρώτη εμφάνιση του συγκεκριμένου στοιχείου από τη λίστα. |
| [RemoveAt](./removeat/)(int) override | Αφαιρεί το στοιχείο στη συγκεκριμένη θέση. |
## Δείτε επίσης

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
