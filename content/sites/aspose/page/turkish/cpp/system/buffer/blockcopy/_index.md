---
title: "System::Buffer::BlockCopy yöntemi"
linktitle: "BlockCopy"
second_title: "Aspose.Page için C++"
description: "System::Buffer::BlockCopy yöntemi. Belirtilen iki tipli diziyi ham bayt dizileri olarak yorumlar ve C++'ta birinden diğerine veri kopyalar."
type: docs
weight: 100
url: /tr/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak dizisinin öğelerinin türü |
| TDst | Hedef dizisinin öğelerinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Kaynak dizi |
| srcOffset | int | Kopyalamanın başladığı kaynak dizisindeki bir bayt ofseti |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Hedef dizi |
| dstOffset | int | Veri eklemeye başlanacak hedef dizisindeki bir bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak dizisinin öğelerinin türü |
| TDst | Hedef dizi görünümünün öğe türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Kaynak dizi |
| srcOffset | int | Kopyalamanın başladığı kaynak dizisindeki bir bayt ofseti |
| dst | const System::Details::ArrayView\<TDst\>\& | Hedef dizi görünümü |
| dstOffset | int | Veri eklemeye başlanacak hedef dizi görünümündeki bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak dizisinin öğelerinin türü |
| TDst | Hedef yığın dizisinin öğe türü |
| ND | Hedef yığın dizisinin boyutu |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Kaynak dizi |
| srcOffset | int | Kopyalamanın başladığı kaynak dizisindeki bir bayt ofseti |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Hedef yığın dizisi |
| dstOffset | int | Veri eklemeye başlanacak hedef yığın dizisindeki bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak dizi görünümünün öğe türü |
| TDst | Hedef dizisinin öğelerinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Kaynak dizi görünümü |
| srcOffset | int | Kopyalamanın başlayacağı tho kaynak dizi görünümündeki bayt ofseti |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Hedef dizi |
| dstOffset | int | Veri eklemeye başlanacak hedef dizisindeki bir bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak dizi görünümünün öğe türü |
| TDst | Hedef dizi görünümünün öğe türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Kaynak dizi görünümü |
| srcOffset | int | Kopyalamanın başlayacağı tho kaynak dizi görünümündeki bayt ofseti |
| dst | const System::Details::ArrayView\<TDst\>\& | Hedef dizi görünümü |
| dstOffset | int | Veri eklemeye başlanacak hedef dizi görünümündeki bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak yığın dizisinin öğe türü |
| NS | Kaynak yığın dizisinin boyutu |
| TDst | Hedef dizisinin öğelerinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Kaynak yığın dizisi |
| srcOffset | int | Kopyalamanın başlayacağı tho kaynak yığın dizisindeki bayt ofseti |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Hedef dizi |
| dstOffset | int | Veri eklemeye başlanacak hedef dizisindeki bir bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve verileri birinden diğerine kopyalar.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Açıklama |
| --- | --- |
| TSrc | Kaynak yığın dizisinin öğe türü |
| NS | Kaynak yığın dizisinin boyutu |
| TDst | Hedef yığın dizisinin öğe türü |
| ND | Hedef yığın dizisinin boyutu |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Kaynak yığın dizisi |
| srcOffset | int | Kopyalamanın başlayacağı tho kaynak yığın dizisindeki bayt ofseti |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Hedef yığın dizisi |
| dstOffset | int | Veri eklemeye başlanacak hedef yığın dizisindeki bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Belirtilen sayıda baytı kaynak arabellekten hedef arabelleğe kopyalar.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const uint8_t * | Kaynak tamponuna işaretçi |
| srcOffset | int | Kopyalamanın başlayacağı kaynak tamponundaki bayt ofseti |
| dst | uint8_t * | Hedef tamponuna işaretçi |
| dstOffset | int | Veri eklemeye başlanacak hedef tamponundaki bayt ofseti |
| count | int | Kopyalanacak bayt sayısı |

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
