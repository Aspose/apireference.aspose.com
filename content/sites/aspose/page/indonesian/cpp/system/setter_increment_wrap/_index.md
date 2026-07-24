---
title: "Metode System::setter_increment_wrap"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page untuk C++"
description: "Metode System::setter_increment_wrap. Penerjemah menerjemahkan ekspresi increment C#''s yang menargetkan properti kelas yang memiliki setter dan getter yang didefinisikan, menjadi pemanggilan fungsi ini dalam C++."
type: docs
weight: 37400
url: /id/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Penerjemah menerjemahkan ekspresi increment C#'s yang menargetkan properti kelas yang memiliki setter dan getter yang didefinisikan, menjadi pemanggilan fungsi ini.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe properti |
| Host | - kelas dari instance yang akan dimodifikasi |
| HostGet | - Host itu sendiri, atau tipe dasar-nya, tempat getter properti didefinisikan |
| HostSet | - Host itu sendiri, atau tipe dasar-nya, tempat setter properti didefinisikan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| host | Host *const | Pointer ke objek yang propertinya akan diinkrementasi |
| pGetter | T(HostGet::*)() | Pointer fungsi yang menunjuk ke metode getter properti |
| pSetter | void(HostSet::*)(T) | Pointer fungsi yang menunjuk ke metode setter properti |

### ReturnValue

Nilai properti yang diinkrementasi

## Lihat Juga

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Penerjemah menerjemahkan ekspresi increment C#'s yang menargetkan properti kelas yang memiliki setter dan getter yang didefinisikan, menjadi pemanggilan fungsi ini.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe properti |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pGetter | T(*)() | Penunjuk fungsi yang menunjuk ke fungsi bebas getter properti |
| pSetter | void(*)(T) | Penunjuk fungsi yang menunjuk ke fungsi bebas setter properti |

### ReturnValue

Nilai properti yang diinkrementasi

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
