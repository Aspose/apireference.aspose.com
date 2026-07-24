---
title: "Metode System::setter_post_decrement_wrap"
linktitle: "setter_post_decrement_wrap"
second_title: "Aspose.Page untuk C++"
description: "Metode System::setter_post_decrement_wrap. Penerjemah menerjemahkan ekspresi post-decrement C#''s post-decrement expressions targeting instance''s property that has setter and getter defined, menjadi pemanggilan fungsi ini (overload untuk getter const) dalam C++."
type: docs
weight: 37600
url: /id/cpp/system/setter_post_decrement_wrap/
---
## System::setter_post_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Penerjemah menerjemahkan ekspresi post-decrement C#'s post-decrement expressions targeting instance's property that has setter and getter defined, menjadi pemanggilan fungsi ini (overload untuk getter const).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe properti. |
| Host | - kelas dari instance yang akan dimodifikasi |
| HostConstGet | - Host itu sendiri, atau tipe dasar-nya, tempat getter properti didefinisikan |
| HostSet | - Host itu sendiri, atau tipe dasar-nya, tempat setter properti didefinisikan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| host | Host *const | Instance untuk memanggil getter dan setter. |
| pGetter | T(HostConstGet::*)() const | Pointer fungsi yang menunjuk ke fungsi getter properti |
| pSetter | void(HostSet::*)(T) | Penunjuk fungsi yang menunjuk ke fungsi setter properti |

### ReturnValue

Nilai properti sebelum diinkrementasi

## Lihat Juga

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Penerjemah menerjemahkan ekspresi post-decrement C#'s post-decrement expressions targeting instance's property that has setter and getter defined, menjadi pemanggilan fungsi ini (overload untuk getter non-const).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe properti. |
| Host | - kelas dari instance yang akan dimodifikasi |
| HostGet | - Host itu sendiri, atau tipe dasar-nya, tempat getter properti didefinisikan |
| HostSet | - Host itu sendiri, atau tipe dasar-nya, tempat setter properti didefinisikan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| host | Host *const | Instance untuk memanggil getter dan setter. |
| pGetter | T(HostGet::*)() | Pointer fungsi yang menunjuk ke fungsi getter properti |
| pSetter | void(HostSet::*)(T) | Penunjuk fungsi yang menunjuk ke fungsi setter properti |

### ReturnValue

Nilai properti sebelum diinkrementasi

## Lihat Juga

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_decrement_wrap(T(*)(), void(*)(T)) method


Penerjemah menerjemahkan ekspresi post-decrement C#'s post-decrement expressions targeting class' property that has setter and getter defined, menjadi pemanggilan fungsi ini.

```cpp
template<typename T> T System::setter_post_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe properti |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pGetter | T(*)() | Penunjuk fungsi yang menunjuk ke fungsi bebas getter properti |
| pSetter | void(*)(T) | Penunjuk fungsi yang menunjuk ke fungsi bebas setter properti |

### ReturnValue

Nilai properti sebelum diinkrementasi

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
