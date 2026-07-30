---
title: "System::Array::ConstrainedCopy Methode"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Font für C++"
description: "System::Array::ConstrainedCopy Methode. Kopiert einen Bereich von Elementen aus einem System.Array, beginnend bei der angegebenen Quelle in C++."
type: docs
weight: 4700
url: /de/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Kopiert einen Bereich von Elementen aus einem [System.Array](../) beginnend bei der angegebenen Quelle.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschreibung |
| --- | --- |
| SrcType | Typ der Elemente im Quellarray |
| DstType | Typ der Elemente im Zielarray |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Quellarray |
| srcIndex | int64_t | Index im Quellarray, der den Beginn des zu kopierenden Elementsbereichs bezeichnet |
| dstArray | const ArrayPtr\<DstType\>\& | Zielarray |
| dstIndex | int64_t | Index im Zielarray, an dem das Einfügen der kopierten Elemente beginnt |
| count | int64_t | Die Anzahl der zu kopierenden Elemente |
## Hinweise


TEMPORÄRE ROHE IMPLEMENTIERUNG OHNE IRGENDEINE RÜCKGÄNGIG-OPERATIONEN!
## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
