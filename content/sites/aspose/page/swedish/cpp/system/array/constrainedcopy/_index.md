---
title: "System::Array::ConstrainedCopy metod"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page för C++"
description: "System::Array::ConstrainedCopy metod. Kopierar ett intervall av element från en System.Array som börjar vid den angivna källan i C++."
type: docs
weight: 4700
url: /sv/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Kopierar ett intervall av element från en [System.Array](../) som börjar vid den angivna källan.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarrayen |
| DstType | Typ av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Källarray |
| srcIndex | int64_t | Index i källarrayen som anger början på intervallet av objekt som ska kopieras |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| dstIndex | int64_t | Index i destinationsarrayen där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |
## Anmärkningar


TILLFÄLLIG RÅ IMPLEMENTERING UTAN NÅGRA ÅTGÄRDER!
## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
