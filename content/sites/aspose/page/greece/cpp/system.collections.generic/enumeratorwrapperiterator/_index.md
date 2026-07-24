---
title: "System::Collections::Generic::EnumeratorWrapperIterator κλάση"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator κλάση. Iterator που τυλίγει τον προ-δημιουργημένο enumerator και ανακατευθύνει όλες τις κλήσεις σε αυτόν σε C++."
type: docs
weight: 1500
url: /el/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iterator που τυλίγει τον προ-δημιουργημένο enumerator και ανακατευθύνει όλες τις κλήσεις σε αυτόν.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parameter | Περιγραφή |
| --- | --- |
| Element | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Κλωνοποιεί τον τρέχοντα επαναλήπτη. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Μετακινεί το iterator ένα βήμα μπροστά. Πρέπει να ενημερώσει τα m_is_end και m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Ελέγχει αν δύο iterators δείχνουν στο ίδιο στοιχείο. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Καταστροφέας. |

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
