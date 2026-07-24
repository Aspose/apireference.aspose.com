---
title: "System::Buffer::BlockCopy-Methode"
linktitle: "BlockCopy"
second_title: "Aspose.Page für C++"
description: "System::Buffer::BlockCopy-Methode. Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen in C++."
type: docs
weight: 100
url: /de/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente des Quell-Arrays |
| TDst | Der Typ der Elemente des Ziel-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Das Quell-Array |
| srcOffset | int | Ein Byte-Offset im Quell-Array, an dem das Kopieren beginnt |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Das Ziel-Array |
| dstOffset | int | Ein Byte-Offset im Ziel-Array, an dem das Einfügen von Daten beginnen soll |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente des Quell-Arrays |
| TDst | Der Typ der Elemente der Ziel-Array-Ansicht |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Das Quell-Array |
| srcOffset | int | Ein Byte-Offset im Quell-Array, an dem das Kopieren beginnt |
| dst | const System::Details::ArrayView\<TDst\>\& | Die Ziel-Array-Ansicht |
| dstOffset | int | Ein Byte-Offset in der Ziel-Array-Ansicht, bei dem das Einfügen von Daten beginnt |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente des Quell-Arrays |
| TDst | Der Typ der Elemente des Ziel-Stack-Arrays |
| ND | Die Größe des Ziel-Stack-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Das Quell-Array |
| srcOffset | int | Ein Byte-Offset im Quell-Array, an dem das Kopieren beginnt |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Das Ziel-Stack-Array |
| dstOffset | int | Ein Byte-Offset im Ziel-Stack-Array, bei dem das Einfügen von Daten beginnt |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente der Quell-Array-Ansicht |
| TDst | Der Typ der Elemente des Ziel-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Die Quell-Array-Ansicht |
| srcOffset | int | Ein Byte-Offset in der Quell-Array-Ansicht, bei dem das Kopieren beginnt |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Das Ziel-Array |
| dstOffset | int | Ein Byte-Offset im Ziel-Array, an dem das Einfügen von Daten beginnen soll |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente der Quell-Array-Ansicht |
| TDst | Der Typ der Elemente der Ziel-Array-Ansicht |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Die Quell-Array-Ansicht |
| srcOffset | int | Ein Byte-Offset in der Quell-Array-Ansicht, bei dem das Kopieren beginnt |
| dst | const System::Details::ArrayView\<TDst\>\& | Die Ziel-Array-Ansicht |
| dstOffset | int | Ein Byte-Offset in der Ziel-Array-Ansicht, bei dem das Einfügen von Daten beginnt |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente des Quell-Stack-Arrays |
| NS | Die Größe des Quell-Stack-Arrays |
| TDst | Der Typ der Elemente des Ziel-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Das Quell-Stack-Array |
| srcOffset | int | Ein Byte-Offset im Quell-Stack-Array, bei dem das Kopieren beginnt |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Das Ziel-Array |
| dstOffset | int | Ein Byte-Offset im Ziel-Array, an dem das Einfügen von Daten beginnen soll |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Beschreibung |
| --- | --- |
| TSrc | Der Typ der Elemente des Quell-Stack-Arrays |
| NS | Die Größe des Quell-Stack-Arrays |
| TDst | Der Typ der Elemente des Ziel-Stack-Arrays |
| ND | Die Größe des Ziel-Stack-Arrays |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Das Quell-Stack-Array |
| srcOffset | int | Ein Byte-Offset im Quell-Stack-Array, bei dem das Kopieren beginnt |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Das Ziel-Stack-Array |
| dstOffset | int | Ein Byte-Offset im Ziel-Stack-Array, bei dem das Einfügen von Daten beginnt |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Kopiert eine angegebene Anzahl von Bytes vom Quellpuffer zum Zielpuffer.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const uint8_t * | Zeiger auf den Quell-Puffer |
| srcOffset | int | Ein Byte-Offset im Quell-Puffer, bei dem das Kopieren beginnt |
| dst | uint8_t * | Zeiger auf den Ziel-Puffer |
| dstOffset | int | Ein Byte-Offset im Ziel-Puffer, bei dem das Einfügen von Daten beginnt |
| count | int | Die Anzahl der zu kopierenden Bytes |

## Siehe auch

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
