---
title: "System::Collections::Generic::ValueIterator κλάση"
linktitle: "ValueIterator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::ValueIterator κλάση. Επαναλήπτης Dictionary που παρέχει πρόσβαση στην τιμή σε C++."
type: docs
weight: 4800
url: /el/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| Parameter | Περιγραφή |
| --- | --- |
| Dict | [Dictionary](../dictionary/) κλάση. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| [DecrementIterator](./decrementiterator/)() override | Μετακινεί τον επαναλήπτη ένα βήμα προς τα πίσω. |
| [IncrementIterator](./incrementiterator/)() override | Μετακινεί τον επαναλήπτη ένα βήμα προς τα εμπρός. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Μετακινεί τον επαναλήπτη κατά τον καθορισμένο αριθμό βημάτων. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Κατασκευαστής. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Κατασκευαστής. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Κατασκευαστής μετακίνησης. |
| virtual [~ValueIterator](./~valueiterator/)() | Καταστροφέας. |

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
