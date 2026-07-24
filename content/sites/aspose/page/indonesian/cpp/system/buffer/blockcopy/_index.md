---
title: "metode System::Buffer::BlockCopy"
linktitle: "BlockCopy"
second_title: "Aspose.Page untuk C++"
description: "metode System::Buffer::BlockCopy. Menafsirkan dua array bertipe yang ditentukan sebagai array mentah byte dan menyalin data dari salah satunya ke yang lain dalam C++."
type: docs
weight: 100
url: /id/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari array sumber |
| TDst | Tipe elemen dari array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Array sumber |
| srcOffset | int | Offset byte dalam array sumber di mana penyalinan dimulai |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Array tujuan |
| dstOffset | int | Offset byte dalam array tujuan di mana data mulai disisipkan |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari array sumber |
| TDst | Tipe elemen dari tampilan array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Array sumber |
| srcOffset | int | Offset byte dalam array sumber di mana penyalinan dimulai |
| dst | const System::Details::ArrayView\<TDst\>\& | Tampilan array tujuan |
| dstOffset | int | Offset byte dalam tampilan array tujuan di mana mulai menyisipkan data |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari array sumber |
| TDst | Tipe elemen dari array stack tujuan |
| ND | Ukuran array stack tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Array sumber |
| srcOffset | int | Offset byte dalam array sumber di mana penyalinan dimulai |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Array stack tujuan |
| dstOffset | int | Offset byte dalam array stack tujuan di mana mulai menyisipkan data |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari tampilan array sumber |
| TDst | Tipe elemen dari array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Tampilan array sumber |
| srcOffset | int | Offset byte dalam tampilan array sumber tho di mana penyalinan dimulai |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Array tujuan |
| dstOffset | int | Offset byte dalam array tujuan di mana data mulai disisipkan |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari tampilan array sumber |
| TDst | Tipe elemen dari tampilan array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Tampilan array sumber |
| srcOffset | int | Offset byte dalam tampilan array sumber tho di mana penyalinan dimulai |
| dst | const System::Details::ArrayView\<TDst\>\& | Tampilan array tujuan |
| dstOffset | int | Offset byte dalam tampilan array tujuan di mana mulai menyisipkan data |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari array stack sumber |
| NS | Ukuran array stack sumber |
| TDst | Tipe elemen dari array tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Array stack sumber |
| srcOffset | int | Offset byte dalam array stack sumber tho di mana penyalinan dimulai |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Array tujuan |
| dstOffset | int | Offset byte dalam array tujuan di mana data mulai disisipkan |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Deskripsi |
| --- | --- |
| TSrc | Tipe elemen dari array stack sumber |
| NS | Ukuran array stack sumber |
| TDst | Tipe elemen dari array stack tujuan |
| ND | Ukuran array stack tujuan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Array stack sumber |
| srcOffset | int | Offset byte dalam array stack sumber tho di mana penyalinan dimulai |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Array stack tujuan |
| dstOffset | int | Offset byte dalam array stack tujuan di mana mulai menyisipkan data |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Menyalin sejumlah byte yang ditentukan dari buffer sumber ke buffer tujuan.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const uint8_t * | Penunjuk ke buffer sumber |
| srcOffset | int | Offset byte dalam buffer sumber di mana penyalinan dimulai |
| dst | uint8_t * | Penunjuk ke buffer tujuan |
| dstOffset | int | Offset byte dalam buffer tujuan di mana mulai menyisipkan data |
| count | int | Jumlah byte yang akan disalin |

## Lihat Juga

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
