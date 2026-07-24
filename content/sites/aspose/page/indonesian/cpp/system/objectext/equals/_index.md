---
title: "System::ObjectExt::Equals metode"
linktitle: "SamaDengan"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::Equals metode. Substitusi untuk panggilan C# Object.Equals yang bekerja untuk tipe apa pun dalam C++. Overload untuk literal string dengan perbandingan string dalam C++."
type: docs
weight: 700
url: /id/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Substitusi untuk panggilan C# [Object.Equals](../../object/equals/) yang bekerja untuk tipe apa pun dalam C++. Overload untuk literal string dengan perbandingan string.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parameter | Deskripsi |
| --- | --- |
| N | [String](../../string/) ukuran literal. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) literal. |
| another | String | [String](../../string/). |

### ReturnValue

Benar jika string cocok, salah jika tidak.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const double\& | Nilai titik mengambang LHS. |
| lain | const double\& | Nilai titik mengambang RHS. |

### ReturnValue

Benar jika **obj** dan **another** keduanya NaN atau sama, salah jika tidak.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const float\& | Nilai titik mengambang LHS. |
| lain | const float\& | Nilai titik mengambang RHS. |

### ReturnValue

Benar jika **obj** dan **another** keduanya NaN atau sama, salah jika tidak.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Pengganti untuk pemanggilan C# [Object.Equals](../../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk tipe smart pointer.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek pertama. |
| T2 | Tipe objek kedua. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | Objek pertama. |
| lain | const T2\& | Objek kedua. |

### ReturnValue

Benar jika objek dianggap sama, salah jika tidak.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Pengganti untuk pemanggilan C# [Object.Equals](../../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk tipe skalar.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek pertama. |
| T2 | Tipe objek kedua. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | Objek pertama. |
| lain | const T2\& | Objek kedua. |

### ReturnValue

Benar jika objek dianggap sama, salah jika tidak.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Pengganti untuk pemanggilan C# [Object.Equals](../../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk tipe struktur.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek pertama. |
| T2 | Tipe objek kedua. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T | Objek pertama. |
| lain | const T2\& | Objek kedua. |

### ReturnValue

Benar jika objek dianggap sama, salah jika tidak.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
