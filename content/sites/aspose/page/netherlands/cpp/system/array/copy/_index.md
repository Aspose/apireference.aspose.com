---
title: "System::Array::Copy methode"
linktitle: "Kopiëren"
second_title: "Aspose.Page voor C++"
description: "System::Array::Copy-methode. Kopieert het opgegeven aantal elementen van de bronarray naar de doelarray in C++."
type: docs
weight: 4900
url: /nl/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Kopieert het opgegeven aantal elementen van de bronarray naar de doelarray.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Bronarray |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarray beginnend bij de opgegeven index naar de opgegeven positie in de doelarray.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
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

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarray beginnend bij de opgegeven index naar de opgegeven positie in de doelarrayweergave.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarray |
| DstType | Type van elementen in de doelarrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Bronarray |
| srcIndex | int64_t | Index in de bronarray die het begin van het bereik van items aangeeft die gekopieerd moeten worden |
| dstArray | System::Details::ArrayView\<DstType\> | Doelarrayweergave |
| dstIndex | int64_t | Index in de doelarrayweergave om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarray beginnend bij de opgegeven index naar de opgegeven positie in de doelarray op de stack.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarray |
| DstType | Type van elementen in doelarray op de stack |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Bronarray |
| srcIndex | int64_t | Index in de bronarray die het begin van het bereik van items aangeeft die gekopieerd moeten worden |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Doelarray op de stack |
| dstIndex | int64_t | Index in de doelarray op de stack waarop gekopieerde items worden ingevoegd |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


Kopieert het opgegeven aantal elementen van de bronarray naar de doel‑array‑view.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Bronarray |
| dstArray | System::Details::ArrayView\<DstType\> | Doelarrayweergave |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


Kopieert het opgegeven aantal elementen van de bronarray naar de doelarray op de stack.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Bronarray |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Doelarray op de stack |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarrayweergave beginnend bij de opgegeven index naar de opgegeven positie in de doelarray op de stack.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarray op de stack |
| DstType | Type van elementen in doelarray op de stack |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | Bronarrayweergave |
| srcIndex | int64_t | Index in de bronarrayweergave die het begin van het bereik van te kopiëren items aangeeft |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Doelarray op de stack |
| dstIndex | int64_t | Index in de doelarray op de stack waarop gekopieerde items worden ingevoegd |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


Kopieert het opgegeven aantal elementen van de bron‑array‑view naar de doelarray.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Bronarrayweergave |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarrayweergave beginnend bij de opgegeven index naar de opgegeven positie in de doelarray.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarrayweergave |
| DstType | Type van elementen in doelarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Bronarrayweergave |
| srcIndex | int64_t | Index in de bronarrayweergave die het begin van het bereik van te kopiëren items aangeeft |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| dstIndex | int64_t | Index in de doelarray om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarrayweergave beginnend bij de opgegeven index naar de opgegeven positie in de doelarrayweergave.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarrayweergave |
| DstType | Type van elementen in de doelarrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Bronarrayweergave |
| srcIndex | int64_t | Index in de bronarrayweergave die het begin van het bereik van te kopiëren items aangeeft |
| dstArray | System::Details::ArrayView\<DstType\> | Doelarrayweergave |
| dstIndex | int64_t | Index in de doelarrayweergave om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


Kopieert het opgegeven aantal elementen van de bron‑array‑view naar de doel‑array‑view.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Bronarrayweergave |
| dstArray | System::Details::ArrayView\<DstType\> | Doelarrayweergave |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Kopieert het opgegeven aantal elementen van de bronarray op de stack naar de doelarray.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Bronarray op de stack |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarray op de stack beginnend bij de opgegeven index naar de opgegeven positie in de doelarray.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarray op de stack |
| DstType | Type van elementen in doelarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Bronarray op de stack |
| srcIndex | int64_t | Index in de bronarray op de stack die het begin van het bereik van te kopiëren items aangeeft |
| dstArray | const ArrayPtr\<DstType\>\& | Doelarray |
| dstIndex | int64_t | Index in de doelarray om te beginnen met het invoegen van gekopieerde items |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Kopieert een opgegeven aantal elementen van de bronarray op de stack beginnend bij de opgegeven index naar de opgegeven positie in de doelarray op de stack.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| SrcType | Type van elementen in bronarray op de stack |
| DstType | Type van elementen in doelarray op de stack |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Bronarray op de stack |
| srcIndex | int64_t | Index in de bronarray op de stack die het begin van het bereik van te kopiëren items aangeeft |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Doelarray op de stack |
| dstIndex | int64_t | Index in de doelarray op de stack waarop gekopieerde items worden ingevoegd |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


Kopieert het opgegeven aantal elementen van de bronarray op de stack naar de doelarray op de stack.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Bronarray op de stack |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Doelarray op de stack |
| count | int64_t | Het aantal elementen om te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
