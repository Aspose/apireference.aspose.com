---
title: "Aspose::Page::XPS::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsElement class. Η κλάδα ενσωματώνει κοινά χαρακτηριστικά στοιχείων XPS σε C++."
type: docs
weight: 900
url: /el/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Κλάση που ενσωματώνει κοινά χαρακτηριστικά στοιχείων [XPS](../../aspose.page.xps/).

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [begin](./begin/)() | Επιστρέφει επαναλήπτη που δείχνει στο πρώτο στοιχείο (εάν υπάρχει) της συλλογής. |
| [begin](./begin/)() const | Επιστρέφει επαναλήπτη που δείχνει στο πρώτο στοιχείο (εάν υπάρχει) της σταθερά-καθορισμένης εμφάνισης της συλλογής. |
| [cbegin](./cbegin/)() const | Επιστρέφει επαναλήπτη που δείχνει στο πρώτο σταθερά-καθορισμένο στοιχείο (εάν υπάρχει) της συλλογής. |
| [cend](./cend/)() const | Επιστρέφει επαναλήπτη που δείχνει αμέσως μετά το τελευταίο σταθερά-καθορισμένο στοιχείο (εάν υπάρχει) της συλλογής. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Λαμβάνει επαναλήπτη που δείχνει ακριβώς μετά το τελευταίο στοιχείο (αν υπάρχει) της συλλογής. |
| [end](./end/)() const | Λαμβάνει επαναλήπτη που δείχνει ακριβώς μετά το τελευταίο στοιχείο (αν υπάρχει) της const-qualified παρουσίασης της συλλογής. |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των θυγατρικών στοιχείων. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Υλοποίηση της διεπαφής [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/). |
| [idx_get](./idx_get/)(int32_t) | Παρέχει πρόσβαση στα παιδιά του στοιχείου με δείκτη *i*. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει επαναλήπτη που δείχνει το πρώτο στοιχείο (αν υπάρχει) της const-qualified παρουσίασης της συλλογής. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Επιστρέφει επαναλήπτη που δείχνει στο πρώτο στοιχείο (εάν υπάρχει) της συλλογής. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει επαναλήπτη που δείχνει ακριβώς μετά το τελευταίο στοιχείο (αν υπάρχει) της const-qualified παρουσίασης της συλλογής. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει επαναλήπτη που δείχνει ακριβώς μετά το τελευταίο στοιχείο (αν υπάρχει) της συλλογής. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [iterator_holder_type](./iterator_holder_type/) | Ένας τύπος συλλογής του οποίου οι τύποι επαναλήπτη χρησιμοποιούνται ως τύποι επαναλήπτη στην τρέχουσα συλλογή. |
| [virtualized_iterator](./virtualized_iterator/) | Τύπος εικονικοποίησης. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Τύπος εικονικοποιημένου στοιχείου. |
## Δείτε επίσης

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
