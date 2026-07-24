---
title: "System::Array::ConstrainedCopy methode"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page voor C++"
description: "System::Array::ConstrainedCopy methode. Kopieert een bereik van elementen van een System.Array beginnend bij de opgegeven bron in C++."
type: docs
weight: 4700
url: /nl/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Kopieert een bereik van elementen van een [System.Array](../) beginnend bij de opgegeven bron.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarray |
| DstType | Type van elementen in doelarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Bronarray |
| srcIndex | int64_t | Index in de bronarray die het begin van het bereik van items aangeeft die gekopieerd moeten worden |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| dstIndex | int64_t | Index in de doelarray om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Het aantal elementen om te kopiëren |
## Opmerkingen


TIJDELIJKE RUWE IMPLEMENTATIE ZONDER ENIGE ONAFGEWERKTE!
## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
