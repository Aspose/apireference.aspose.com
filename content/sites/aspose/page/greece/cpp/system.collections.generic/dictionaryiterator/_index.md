---
title: "System::Collections::Generic::DictionaryIterator κλάση"
linktitle: "DictionaryIterator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::DictionaryIterator κλάση. Iterator λεξικού που παρέχει σημειογραφία KeyValuePair σε C++."
type: docs
weight: 1200
url: /el/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Parameter | Περιγραφή |
| --- | --- |
| Dict | [Dictionary](../dictionary/) κλάση. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| [DecrementIterator](./decrementiterator/)() override | Μετακινεί τον επαναλήπτη ένα βήμα προς τα πίσω. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Κατασκευαστής. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Κατασκευαστής. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Κατασκευαστής μετακίνησης. |
| [IncrementIterator](./incrementiterator/)() override | Μετακινεί τον επαναλήπτη ένα βήμα προς τα εμπρός. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Μετακινεί τον επαναλήπτη κατά τον καθορισμένο αριθμό βημάτων. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Καταστροφέας. |

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
