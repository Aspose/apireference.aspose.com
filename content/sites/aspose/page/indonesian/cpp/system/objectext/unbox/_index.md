---
title: "metode System::ObjectExt::Unbox"
linktitle: "Unbox"
second_title: "Aspose.Page untuk C++"
description: "metode System::ObjectExt::Unbox. Membuka tipe nilai setelah mengonversi ke Object. Implementasi untuk tipe enum dalam C++."
type: docs
weight: 1400
url: /id/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Membuka tipe nilai setelah mengonversi ke [Object](../../object/). Implementasi untuk tipe enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Enum](../../enum/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk dibuka. |

### ReturnValue

[Enum](../../enum/) value.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Membuka tipe nilai setelah mengonversi ke [Object](../../object/). Implementasi untuk tipe non-enum & non-nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk dibuka. |

### ReturnValue

Nilai yang dibuka.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Membuka tipe nilai setelah mengonversi ke [Object](../../object/). Implementasi untuk tipe non-enum & non-nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk dibuka. |

### ReturnValue

Nilai yang dibuka.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Membuka bungkus nilai string.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk dibuka |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Lihat Juga

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Membuka bungkus tipe enum menjadi integer.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe integer tujuan. |
| E | Tipe enum sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| e | E | Nilai yang akan dibongkar. |

### ReturnValue

Representasi integer dari enum.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Mengonversi tipe enum.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe enum tujuan. |
| E | Tipe enum sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| e | E | Nilai yang akan dibongkar. |

### ReturnValue

Nilai enum yang dikonversi.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
