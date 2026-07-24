---
title: "System::Array::CopyTo methode"
linktitle: "CopyTo"
second_title: "Aspose.Page voor C++"
description: "System::Array::CopyTo methode. Kopieert alle elementen van de huidige array naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument arrayIndex in C++."
type: docs
weight: 900
url: /nl/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Kopieert alle elementen van de huidige array naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Doelarray |
| arrayIndex | int | Index in de doelarray om te beginnen met het invoegen van gekopieerde items |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Kopieert alle elementen van de huidige array naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Beschrijving |
| --- | --- |
| DstType | Type van elementen in doelarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| dstIndex | int64_t | Index in de doelarray om te beginnen met het invoegen van gekopieerde items |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Kopieert een opgegeven aantal elementen van de huidige array beginnend bij de opgegeven positie naar de opgegeven doelarray. Elementen worden in de doelarray ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Beschrijving |
| --- | --- |
| DstType | Type van elementen in doelarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| srcIndex | int64_t | Index in de bronarray om te beginnen met het kopiëren van items |
| dstIndex | int64_t | Index in de doelarray om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Kopieert alle elementen van de huidige array naar de opgegeven doelarrayweergave. Elementen worden in de doelarrayweergave ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Beschrijving |
| --- | --- |
| DstType | Type van elementen in de doelarrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Doelarrayweergave |
| dstIndex | int64_t | Index in de doelarrayweergave om te beginnen met het invoegen van gekopieerde items |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Kopieert een opgegeven aantal elementen van de huidige array beginnend bij de opgegeven positie naar de opgegeven doelarrayweergave. Elementen worden in de doelarrayweergave ingevoegd beginnend bij de index die wordt opgegeven door het argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Beschrijving |
| --- | --- |
| DstType | Type van elementen in de doelarrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Doelarrayweergave |
| srcIndex | int64_t | Index in de bronarray om te beginnen met het kopiëren van items |
| dstIndex | int64_t | Index in de doelarrayweergave om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Aantal elementen om te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
