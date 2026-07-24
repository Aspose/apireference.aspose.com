---
title: "System::Collections::IListImplRefType κλάση"
linktitle: "IListImplRefType"
second_title: "Aspose.Page για C++"
description: "System::Collections::IListImplRefType κλάση. Σκελετός που υλοποιεί τη διεπαφή System::Collections::IList σε αντικείμενο System::Collections::Generic::List. Υλοποίηση για τύπους αναφοράς σε C++."
type: docs
weight: 1100
url: /el/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Σκελετός που υλοποιεί τη διεπαφή [System::Collections::IList](../ilist/) σε αντικείμενο [System::Collections::Generic::List](../../system.collections.generic/list/). Υλοποίηση για τύπους αναφοράς.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Προσθέτει στοιχείο στο τέλος της λίστας. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Μετατροπή αναφοράς τύπου σε τιμή αντικειμένου σε αντικείμενο. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Ελέγχει αν το στοιχείο υπάρχει στη λίστα. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) υλοποίηση μεθόδων. Λαμβάνει τον αριθμό των στοιχείων στη συλλογή. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) υλοποίηση. Επιστρέφει έναν επαναλήπτη που διασχίζει μια συλλογή. |
| [idx_get](./idx_get/)(int, int) const override | Λαμβάνει το στοιχείο στον καθορισμένο δείκτη. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Δημιουργεί νέα παρουσία αντικειμένου. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Λαμβάνει το δείκτη της πρώτης εμφάνισης του στοιχείου στο δοχείο. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Εισάγει στοιχείο στη συγκεκριμένη θέση, μετακινώντας τα άλλα στοιχεία. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Αφαιρεί την πρώτη εμφάνιση του συγκεκριμένου στοιχείου από τη λίστα. |
| [RemoveAt](./removeat/)(int) override | Αφαιρεί το στοιχείο στη συγκεκριμένη θέση. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Μετατροπή τιμής αντικειμένου σε συγκεκριμένη αναφορά τύπου. |
## Δείτε επίσης

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
