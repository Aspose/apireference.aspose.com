---
title: "Metode System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Page untuk C++"
description: "Metode System::setter_wrap. Overload untuk fungsi setter instance dengan konversi tipe dalam C++."
type: docs
weight: 38200
url: /id/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Overload untuk fungsi setter instance dengan konversi tipe.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai. |
| T2 | Tipe yang diharapkan oleh fungsi setter. |
| Host | Tipe instance. |
| HostSet | - Host itu sendiri, atau tipe dasarnya, tempat setter properti didefinisikan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| host | Host *const | [Object](../object/) untuk memanggil fungsi setter untuk. |
| pSetter | void(HostSet::*)(T2) | Referensi fungsi setter. |
| value | T | Nilai yang akan diatur. |

### ReturnValue

atur nilai.

## Lihat Juga

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Overload untuk fungsi setter statis dengan konversi tipe.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai. |
| T2 | Tipe yang diharapkan oleh fungsi setter. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pSetter | void(*)(T2) | Referensi fungsi setter statis. |
| value | T | Nilai yang akan diatur. |

### ReturnValue

atur nilai.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
