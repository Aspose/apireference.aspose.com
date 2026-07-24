---
title: "System::Buffer::BlockCopy-metod"
linktitle: "BlockCopy"
second_title: "Aspose.Page för C++"
description: "System::Buffer::BlockCopy-metod. Tolkar två angivna typade arrayer som råa byte-arrayer och kopierar data från den ena till den andra i C++."
type: docs
weight: 100
url: /sv/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källarrayen |
| TDst | Typen av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Källarrayen |
| srcOffset | int | En byte-förskjutning i källarrayen där kopieringen startar |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Destinationsarrayen |
| dstOffset | int | En byte-förskjutning i destinationsarrayen där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källarrayen |
| TDst | Typen av element i destinationsarrayvyn |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Källarrayen |
| srcOffset | int | En byte-förskjutning i källarrayen där kopieringen startar |
| dst | const System::Details::ArrayView\<TDst\>\& | Den destinationsarrayvyn |
| dstOffset | int | En byteoffset i destinationsarrayvyn där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källarrayen |
| TDst | Typen av element i destinationsstackarrayen |
| ND | Storleken på destinationsstackarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Källarrayen |
| srcOffset | int | En byte-förskjutning i källarrayen där kopieringen startar |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Den destinationsstackarrayen |
| dstOffset | int | En byteoffset i destinationsstackarrayen där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källarrayvyn |
| TDst | Typen av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Den källarrayvyn |
| srcOffset | int | En byteoffset i källarrayvyn där kopieringen startar |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Destinationsarrayen |
| dstOffset | int | En byte-förskjutning i destinationsarrayen där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källarrayvyn |
| TDst | Typen av element i destinationsarrayvyn |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Den källarrayvyn |
| srcOffset | int | En byteoffset i källarrayvyn där kopieringen startar |
| dst | const System::Details::ArrayView\<TDst\>\& | Den destinationsarrayvyn |
| dstOffset | int | En byteoffset i destinationsarrayvyn där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källstackarrayen |
| NS | Storleken på källstackarrayen |
| TDst | Typen av element i destinationsarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Den källstackarrayen |
| srcOffset | int | En byteoffset i källstackarrayen där kopieringen startar |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Destinationsarrayen |
| dstOffset | int | En byte-förskjutning i destinationsarrayen där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Tolkar två angivna typade arrayer som råa bytearrayer och kopierar data från den ena till den andra.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Beskrivning |
| --- | --- |
| TSrc | Typen av element i källstackarrayen |
| NS | Storleken på källstackarrayen |
| TDst | Typen av element i destinationsstackarrayen |
| ND | Storleken på destinationsstackarrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Den källstackarrayen |
| srcOffset | int | En byteoffset i källstackarrayen där kopieringen startar |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Den destinationsstackarrayen |
| dstOffset | int | En byteoffset i destinationsstackarrayen där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Kopierar ett angivet antal byte från källbuffert till destinationsbuffert.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| src | const uint8_t * | Pekare till källbufferten |
| srcOffset | int | En byteoffset i källbufferten där kopieringen startar |
| dst | uint8_t * | Pekare till destinationsbufferten |
| dstOffset | int | En byteoffset i destinationsbufferten där data ska börja infogas |
| count | int | Antalet byte att kopiera |

## Se även

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
