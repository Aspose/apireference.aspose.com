---
title: "System::Object::Equals method"
linktitle: "SamaDengan"
second_title: "Aspose.Page untuk C++"
description: "System::Object::Equals method. Membandingkan objek menggunakan semantik C# Object.Equals dalam C++."
type: docs
weight: 300
url: /id/cpp/system/object/equals/
---
## Object::Equals(ptr) method


Membandingkan objek menggunakan semantik C# [Object.Equals](./).

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | ptr | [Object](../) untuk dibandingkan dengan yang saat ini. |

### ReturnValue

True jika objek dianggap sama dan false sebaliknya.

## Lihat Juga

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | double const\& | Nilai titik mengambang LHS. |
| objB | double const\& | Nilai titik mengambang RHS. |

### ReturnValue

Benar jika **objA** dan **objB** keduanya NaN atau sama, salah jika tidak.

## Lihat Juga

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | float const\& | Nilai titik mengambang LHS. |
| objB | float const\& | Nilai titik mengambang RHS. |

### ReturnValue

Benar jika **objA** dan **objB** keduanya NaN atau sama, salah jika tidak.

## Lihat Juga

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Membandingkan objek tipe referensi dengan gaya C#.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe objek pertama untuk dibandingkan. |
| T2 | Tipe objek kedua untuk dibandingkan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | T1 const\& | Objek pertama untuk dibandingkan. |
| objB | T2 const\& | Objek kedua untuk dibandingkan. |

### ReturnValue

Benar jika objek cocok baik berdasarkan referensi atau secara semantik (dengan perbandingan mirip [Object.Equals](./)), salah jika tidak.

## Lihat Juga

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Membandingkan objek tipe nilai dengan gaya C#.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe objek pertama untuk dibandingkan. |
| T2 | Tipe objek kedua untuk dibandingkan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objA | T1 const\& | Objek pertama untuk dibandingkan. |
| objB | T2 const\& | Objek kedua untuk dibandingkan. |

### ReturnValue

Benar jika objek dianggap sama oleh operator kesetaraan yang tersedia, salah jika tidak.

## Lihat Juga

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
