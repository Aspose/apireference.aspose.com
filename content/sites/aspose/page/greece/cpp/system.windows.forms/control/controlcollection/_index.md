---
title: "System::Windows::Forms::Control::ControlCollection class"
linktitle: "ControlCollection"
second_title: "Aspose.Page για C++"
description: "System::Windows::Forms::Control::ControlCollection class. Συλλογή ελέγχων. Δεν έχει υλοποιηθεί σε C++."
type: docs
weight: 200
url: /el/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Συλλογή ελέγχων. Δεν έχει υλοποιηθεί.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Προσθέτει έλεγχο στη συλλογή. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Προσθέτει πολλούς ελέγχους στη συλλογή. |
| [Clear](./clear/)() override | Διαγράφει όλους τους ελέγχους από τη συλλογή. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Ελέγχει αν υπάρχει συγκεκριμένος έλεγχος στη συλλογή. |
| virtual [ContainsKey](./containskey/)(System::String) const | Ελέγχει αν υπάρχει έλεγχος με συγκεκριμένο όνομα στη συλλογή. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Κατασκευαστής. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Αντιγράφει τα περιεχόμενα της συλλογής σε υπάρχοντα στοιχεία πίνακα. |
| [Find](./find/)(const System::String\&, bool) const | Αναζητά τον ονομασμένο έλεγχο στη συλλογή. Προαιρετικά ελέγχει τις συλλογές των περιεχόμενων ελέγχων αναδρομικά. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των ελέγχων στη συλλογή. |
| [get_Owner](./get_owner/)() const | Λαμβάνει τον έλεγχο ιδιοκτήτη της συλλογής. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Αναζητά συγκεκριμένο έλεγχο. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Αναζητά συγκεκριμένο έλεγχο. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή για επανάληψη μέσω της συλλογής. |
| [idx_get](./idx_get/)(int) const override | Πρόσβαση κατά δείκτη. |
| virtual [idx_get](./idx_get/)(System::String) const | Πρόσβαση κατά όνομα. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Πρόσβαση κατά δείκτη. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | Πρόσβαση κατά όνομα. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Αναζητά το στοιχείο ελέγχου στη συλλογή. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Αναζητά το ονομασμένο στοιχείο ελέγχου στη συλλογή. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Εισάγει το στοιχείο ελέγχου στη συλλογή. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Αφαιρεί το στοιχείο ελέγχου από τη συλλογή. |
| [RemoveAt](./removeat/)(int) override | Αφαιρεί το στοιχείο ελέγχου από τη συλλογή. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Αφαιρεί το στοιχείο ελέγχου από τη συλλογή. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Μετακινεί το στοιχείο ελέγχου σε νέα θέση. |
## Δείτε επίσης

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
