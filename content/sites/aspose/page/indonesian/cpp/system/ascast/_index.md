---
title: "Metode System::AsCast"
linktitle: "AsCast"
second_title: "Aspose.Page untuk C++"
description: "Metode System::AsCast. Mengubah tipe sumber menjadi tipe hasil menggunakan cast operator ''as''. Digunakan ketika cast sederhana seperti konstruktor diperlukan dalam C++."
type: docs
weight: 13500
url: /id/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast operator 'as'. Digunakan ketika cast sederhana seperti konstruktor diperlukan.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan ketika tipe sumber dan tipe hasil sama.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk pembungkus pengecualian.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast. Mengembalikan nullptr jika tidak ada konversi yang tersedia.

## Lihat Juga

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk mengcast objek ke pengecualian.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast. Mengembalikan nullptr jika tidak ada konversi yang tersedia.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan ketika sumber dan hasil keduanya merupakan smart pointer.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast. Mengembalikan nullptr jika tidak ada konversi yang tersedia.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan ketika sumber dan hasil keduanya merupakan smart pointer (dengan [SmartPtr<...>](../smartptr/) eksplisit dalam tipe hasil).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast. Mengembalikan nullptr jika tidak ada konversi yang tersedia.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk unboxing objek ke nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast. Mengembalikan nullable kosong jika tidak ada konversi yang tersedia.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Unboxing tidak valid ke tipe non-objek.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Selalu mengembalikan null.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Unboxing tidak valid ke tipe non-objek.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Selalu mengembalikan null.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk boxing objek nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk boxing objek umum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk boxing objek umum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk unboxing string.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk kasus nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Mencast tipe sumber ke tipe hasil menggunakan cast operator 'as'. Digunakan untuk mengcast antar array.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast. Mengembalikan nullptr jika tidak ada konversi untuk anggota array mana pun yang tersedia.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
