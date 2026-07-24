---
title: "System::Array::Copy method"
linktitle: "Kopiera"
second_title: "Aspose.Page för C++"
description: "System::Array::Copy method. Kopierar det angivna antalet element från källarrayen till destinationsarrayen i C++."
type: docs
weight: 4900
url: /sv/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Kopierar det angivna antalet element från källarrayen till destinationsarrayen.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Källarray |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayen med start vid det angivna indexet till den angivna positionen i destinationsarrayen.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
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

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayen med start vid det angivna indexet till den angivna positionen i destinationsarrayvyn.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarrayen |
| DstType | Typ av element i destinationsarrayvy |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Källarray |
| srcIndex | int64_t | Index i källarrayen som anger början på intervallet av objekt som ska kopieras |
| dstArray | System::Details::ArrayView\<DstType\> | Destinationsarrayvy |
| dstIndex | int64_t | Index i destinationsarrayvy där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayen med start vid det angivna indexet till den angivna positionen i destinationsarrayen på stacken.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarrayen |
| DstType | Typ av element i destinationsarray på stacken |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Källarray |
| srcIndex | int64_t | Index i källarrayen som anger början på intervallet av objekt som ska kopieras |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Destinationsarray på stacken |
| dstIndex | int64_t | Index i destinationsarray på stacken där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


Kopierar det angivna antalet element från källarrayen till destinationsarrayvyn.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Källarray |
| dstArray | System::Details::ArrayView\<DstType\> | Destinationsarrayvy |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


Kopierar det angivna antalet element från källarrayen till destinationsarrayen på stacken.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Källarray |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Destinationsarray på stacken |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayvyn med start vid det angivna indexet till den angivna positionen i destinationsarrayen på stacken.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarray på stacken |
| DstType | Typ av element i destinationsarray på stacken |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | Källarrayvy |
| srcIndex | int64_t | Index i källarrayvyn som anger början på intervallet av objekt att kopiera |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Destinationsarray på stacken |
| dstIndex | int64_t | Index i destinationsarray på stacken där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


Kopierar det angivna antalet element från källarrayvyn till destinationsarrayen.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Källarrayvy |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayvyn med start vid det angivna indexet till den angivna positionen i destinationsarrayen.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarrayvy |
| DstType | Typ av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Källarrayvy |
| srcIndex | int64_t | Index i källarrayvyn som anger början på intervallet av objekt att kopiera |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| dstIndex | int64_t | Index i destinationsarrayen där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayvyn med start vid det angivna indexet till den angivna positionen i destinationsarrayvyn.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarrayvy |
| DstType | Typ av element i destinationsarrayvy |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Källarrayvy |
| srcIndex | int64_t | Index i källarrayvyn som anger början på intervallet av objekt att kopiera |
| dstArray | System::Details::ArrayView\<DstType\> | Destinationsarrayvy |
| dstIndex | int64_t | Index i destinationsarrayvy där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


Kopierar det angivna antalet element från källarrayvyn till destinationsarrayvyn.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Källarrayvy |
| dstArray | System::Details::ArrayView\<DstType\> | Destinationsarrayvy |
| count | int64_t | Antalet element att kopiera |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Kopierar det angivna antalet element från källarrayen på stacken till destinationsarrayen.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Källarray på stacken |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayen på stacken med start vid det angivna indexet till den angivna positionen i destinationsarrayen.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarray på stacken |
| DstType | Typ av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Källarray på stacken |
| srcIndex | int64_t | Index i källarrayen på stacken som anger början på intervallet av objekt som ska kopieras |
| dstArray | const ArrayPtr\<DstType\>\& | Destinationsarray |
| dstIndex | int64_t | Index i destinationsarrayen där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Kopierar ett angivet antal element från källarrayen på stacken med start vid det angivna indexet till den angivna positionen i destinationsarrayen på stacken.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Beskrivning |
| --- | --- |
| SrcType | Typ av element i källarray på stacken |
| DstType | Typ av element i destinationsarray på stacken |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Källarray på stacken |
| srcIndex | int64_t | Index i källarrayen på stacken som anger början på intervallet av objekt som ska kopieras |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Destinationsarray på stacken |
| dstIndex | int64_t | Index i destinationsarray på stacken där kopierade objekt ska börja infogas |
| count | int64_t | Antalet element att kopiera |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


Kopierar det angivna antalet element från källarrayen på stacken till destinationsarrayen på stacken.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Källarray på stacken |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Destinationsarray på stacken |
| count | int64_t | Antalet element att kopiera |

## Se även

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
