---
title: "System::Array::CopyTo metod"
linktitle: "CopyTo"
second_title: "Aspose.Page för C++"
description: "System::Array::CopyTo metod. Kopierar alla element i den aktuella arrayen till den angivna destinationsarrayen. Elementen infogas i destinationsarrayen med start vid det index som anges av argumentet arrayIndex i C++."
type: docs
weight: 900
url: /sv/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Kopierar alla element i den aktuella arrayen till den angivna destinationsarrayen. Elementen infogas i destinationsarrayen med start vid det index som anges av argumentet arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Destinationsarray |
| arrayIndex | int | Index i destinationsarrayen där kopierade objekt ska börja infogas |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Kopierar alla element i den aktuella arrayen till den angivna destinationsarrayen. Elementen infogas i destinationsarrayen med start vid index som anges av argumentet dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Beskrivning |
| --- | --- |
| DstType | Typ av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| dstIndex | int64_t | Index i destinationsarrayen där kopierade objekt ska börja infogas |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Kopierar ett angivet antal element från den aktuella arrayen med start på en angiven position till den angivna destinationsarrayen. Elementen infogas i destinationsarrayen med start vid index som anges av argumentet dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Beskrivning |
| --- | --- |
| DstType | Typ av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| srcIndex | int64_t | Index i källarrayen där kopieringen av objekt ska börja |
| dstIndex | int64_t | Index i destinationsarrayen där kopierade objekt ska börja infogas |
| count | int64_t | Antal element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Kopierar alla element i den aktuella arrayen till den angivna destinationsarrayvyn. Elementen infogas i destinationsarrayvyn med start vid index som anges av argumentet dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Beskrivning |
| --- | --- |
| DstType | Typ av element i destinationsarrayvy |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Destinationsarrayvy |
| dstIndex | int64_t | Index i destinationsarrayvy där kopierade objekt ska börja infogas |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Kopierar ett angivet antal element från den aktuella arrayen med start på en angiven position till den angivna destinationsarrayvyn. Elementen infogas i destinationsarrayvyn med start vid index som anges av argumentet dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Beskrivning |
| --- | --- |
| DstType | Typ av element i destinationsarrayvy |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Destinationsarrayvy |
| srcIndex | int64_t | Index i källarrayen där kopieringen av objekt ska börja |
| dstIndex | int64_t | Index i destinationsarrayvy där kopierade objekt ska börja infogas |
| count | int64_t | Antal element att kopiera |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
