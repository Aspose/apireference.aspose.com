---
title: "metode System::ExplicitCast"
linktitle: "CastEksplisit"
second_title: "Aspose.Page untuk C++"
description: "metode System::ExplicitCast. Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan ketika tipe sumber dan tipe hasil sama dalam C++."
type: docs
weight: 18500
url: /id/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan ketika tipe sumber dan tipe hasil sama.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan ketika diperlukan cast sederhana mirip konstruktor.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk pembungkus pengecualian.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
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

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk meng-cast objek menjadi pengecualian.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan ketika sumber dan hasil keduanya adalah smart pointer (tanpa expicit [SmartPtr<...>](../smartptr/) dalam tipe hasil).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan ketika sumber dan hasil keduanya adalah smart pointer (dengan expicit [SmartPtr<...>](../smartptr/) dalam tipe hasil).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk unboxing objek menjadi nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk membungkus nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk unboxing objek nullable.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk boxing enum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
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

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk menyalin tipe nilai ke heap ketika tipe nilai harus direferensikan sebagai smart pointer (dalam generik yang dibatasi dengan tipe antarmuka tetapi dipersonalisasi dengan struktur yang mengimplementasikan antarmuka ini).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk mendapatkan antarmuka dari tipe nilai.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk boxing umum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk boxing [System::String](../string/).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk unboxing antarmuka.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk unboxing umum.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk cast nullptr.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(const Source\&) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan untuk cast antar array.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
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
## System::ExplicitCast(Source) method


Mengubah tipe sumber menjadi tipe hasil menggunakan cast eksplisit. Digunakan ketika melakukan casting pointer mentah ke smart pointer.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | Deskripsi |
| --- | --- |
| Sumber | Tipe sumber. |
| Result | Tipe hasil. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | Source | [Object](../object/) untuk dikast. |

### ReturnValue

Hasil cast.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
