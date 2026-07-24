---
title: "System::Collections::Generic::KeyIterator class"
linktitle: "KeyIterator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::KeyIterator class. Επαναλήπτης Dictionary που παρέχει πρόσβαση στα κλειδιά σε C++."
type: docs
weight: 2800
url: /el/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
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
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Κατασκευαστής. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Κατασκευαστής. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Κατασκευαστής μετακίνησης. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Μετακινεί τον επαναλήπτη κατά τον καθορισμένο αριθμό βημάτων. |
| virtual [~KeyIterator](./~keyiterator/)() | Καταστροφέας. |

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
