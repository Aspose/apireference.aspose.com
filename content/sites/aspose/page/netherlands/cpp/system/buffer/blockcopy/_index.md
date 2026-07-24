---
title: "System::Buffer::BlockCopy methode"
linktitle: "BlockCopy"
second_title: "Aspose.Page voor C++"
description: "System::Buffer::BlockCopy methode. Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere in C++."
type: docs
weight: 100
url: /nl/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type van de elementen van de bron-array |
| TDst | Het type van de elementen van de bestemmings-array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | De bron-array |
| srcOffset | int | Een byte-offset in de bronarray waarop het kopiëren begint |
| dst | const SharedPtr\<Array\<TDst\>\>\& | De doelarray |
| dstOffset | int | Een byte-offset in de doelarray waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type van de elementen van de bron-array |
| TDst | Het type elementen van de doelarrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | De bron-array |
| srcOffset | int | Een byte-offset in de bronarray waarop het kopiëren begint |
| dst | const System::Details::ArrayView\<TDst\>\& | De doelarrayweergave |
| dstOffset | int | Een byte-offset in de doelarrayweergave waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type van de elementen van de bron-array |
| TDst | Het type elementen van de doelstackarray |
| ND | De grootte van de doelstackarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | De bron-array |
| srcOffset | int | Een byte-offset in de bronarray waarop het kopiëren begint |
| dst | const System::Details::StackArray\<TDst, ND\>\& | De doelstackarray |
| dstOffset | int | Een byte-offset in de doelstackarray waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type elementen van de bronarrayweergave |
| TDst | Het type van de elementen van de bestemmings-array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | De bronarrayweergave |
| srcOffset | int | Een byte-offset in de bronarrayweergave waarop het kopiëren begint |
| dst | const SharedPtr\<Array\<TDst\>\>\& | De doelarray |
| dstOffset | int | Een byte-offset in de doelarray waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type elementen van de bronarrayweergave |
| TDst | Het type elementen van de doelarrayweergave |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | De bronarrayweergave |
| srcOffset | int | Een byte-offset in de bronarrayweergave waarop het kopiëren begint |
| dst | const System::Details::ArrayView\<TDst\>\& | De doelarrayweergave |
| dstOffset | int | Een byte-offset in de doelarrayweergave waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type elementen van de bronstackarray |
| NS | De grootte van de bronstackarray |
| TDst | Het type van de elementen van de bestemmings-array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | De bronstap-array |
| srcOffset | int | Een byte-offset in de tho bronstap-array waarop het kopiëren begint |
| dst | const SharedPtr\<Array\<TDst\>\>\& | De doelarray |
| dstOffset | int | Een byte-offset in de doelarray waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Beschrijving |
| --- | --- |
| TSrc | Het type elementen van de bronstackarray |
| NS | De grootte van de bronstackarray |
| TDst | Het type elementen van de doelstackarray |
| ND | De grootte van de doelstackarray |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | De bronstap-array |
| srcOffset | int | Een byte-offset in de tho bronstap-array waarop het kopiëren begint |
| dst | const System::Details::StackArray\<TDst, ND\>\& | De doelstackarray |
| dstOffset | int | Een byte-offset in de doelstackarray waarop het invoegen van gegevens begint |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Kopieert een opgegeven aantal bytes van de bronbuffer naar de doelbuffer.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| src | const uint8_t * | Pointer naar de bronbuffer |
| srcOffset | int | Een byte-offset in de bronbuffer waarop het kopiëren begint |
| dst | uint8_t * | Pointer naar de bestemmingsbuffer |
| dstOffset | int | Een byte-offset in de bestemmingsbuffer waarop data moet worden ingevoegd |
| count | int | Het aantal bytes om te kopiëren |

## Zie ook

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
