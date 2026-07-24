---
title: "System::Array::ConstrainedCopy μέθοδος"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page για C++"
description: "System::Array::ConstrainedCopy μέθοδος. Αντιγράφει μια περιοχή στοιχείων από ένα System.Array που ξεκινά από την καθορισμένη πηγή σε C++."
type: docs
weight: 4700
url: /el/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Αντιγράφει μια περιοχή στοιχείων από ένα [System.Array](../) που ξεκινά από την καθορισμένη πηγή.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος των στοιχείων στον πηγαίο πίνακα |
| DstType | Τύπος των στοιχείων στον προοριστικό πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα που καθορίζει την αρχή της περιοχής των στοιχείων προς αντιγραφή |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| dstIndex | int64_t | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |
## Παρατηρήσεις


ΠΡΟΣΩΡΙΝΗ ΑΓΚΥΡΗ ΥΛΟΠΟΙΗΣΗ ΧΩΡΙΣ ΚΑΜΙΑ ΑΝΑΚΑΤΑΣΤΑΣΗ!
## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
