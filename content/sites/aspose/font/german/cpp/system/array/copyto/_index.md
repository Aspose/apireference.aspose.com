---
title: "System::Array::CopyTo Methode"
linktitle: "CopyTo"
second_title: "Aspose.Font für C++"
description: "System::Array::CopyTo Methode. Kopiert alle Elemente des aktuellen Arrays in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend bei dem durch das Argument arrayIndex angegebenen Index in C++."
type: docs
weight: 900
url: /de/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Kopiert alle Elemente des aktuellen Arrays in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend beim durch das Argument arrayIndex angegebenen Index.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Zielarray |
| arrayIndex | int | Index im Zielarray, an dem das Einfügen der kopierten Elemente beginnt |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Kopiert alle Elemente des aktuellen Arrays in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend beim durch das Argument dstIndex angegebenen Index.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Beschreibung |
| --- | --- |
| DstType | Typ der Elemente im Zielarray |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Zielarray |
| dstIndex | int64_t | Index im Zielarray, an dem das Einfügen der kopierten Elemente beginnt |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Kopiert eine angegebene Anzahl von Elementen aus dem aktuellen Array, beginnend bei der angegebenen Position, in das angegebene Zielarray. Elemente werden in das Zielarray eingefügt, beginnend beim durch das Argument dstIndex angegebenen Index.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Beschreibung |
| --- | --- |
| DstType | Typ der Elemente im Zielarray |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Zielarray |
| srcIndex | int64_t | Index im Quellarray, an dem das Kopieren der Elemente beginnt |
| dstIndex | int64_t | Index im Zielarray, an dem das Einfügen der kopierten Elemente beginnt |
| count | int64_t | Anzahl der zu kopierenden Elemente |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Kopiert alle Elemente des aktuellen Arrays in die angegebene Ziel-Array-Ansicht. Elemente werden in die Ziel-Array-Ansicht eingefügt, beginnend beim durch das Argument dstIndex angegebenen Index.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Beschreibung |
| --- | --- |
| DstType | Typ der Elemente in der Ansicht des Zielarrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Ziel-Array-Ansicht |
| dstIndex | int64_t | Index in der Ziel-Array-Ansicht, an dem das Einfügen kopierter Elemente beginnt |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Kopiert eine angegebene Anzahl von Elementen aus dem aktuellen Array, beginnend an der angegebenen Position, in die angegebene Ziel-Array-Ansicht. Elemente werden in die Ziel-Array-Ansicht eingefügt, beginnend bei dem Index, der durch das Argument dstIndex angegeben ist.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Beschreibung |
| --- | --- |
| DstType | Typ der Elemente in der Ansicht des Zielarrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Ziel-Array-Ansicht |
| srcIndex | int64_t | Index im Quellarray, an dem das Kopieren der Elemente beginnt |
| dstIndex | int64_t | Index in der Ziel-Array-Ansicht, an dem das Einfügen kopierter Elemente beginnt |
| count | int64_t | Anzahl der zu kopierenden Elemente |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
