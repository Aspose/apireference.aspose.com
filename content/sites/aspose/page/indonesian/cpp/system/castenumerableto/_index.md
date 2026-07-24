---
title: "Metode System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page untuk C++"
description: "Metode System::CastEnumerableTo. Melakukan casting eksplisit elemen dari objek enumerable yang ditentukan ke tipe berbeda dalam C++."
type: docs
weight: 15500
url: /id/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Melakukan casting eksplisit elemen dari objek enumerable yang ditentukan ke tipe berbeda.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Ke | Tipe untuk melakukan cast statis pada elemen objek enumerable. |
| From | Tipe objek enumerable |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| enumerable | const From\& | Objek Enumerable yang berisi elemen-elemen untuk dikonversi |

### ReturnValue

Pointer ke koleksi baru yang berisi elemen dengan tipe **To** yang setara dengan elemen-elemen dari **enumerable**

## Lihat Juga

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Melakukan casting eksplisit elemen dari objek enumerable yang ditentukan ke tipe berbeda.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Ke | Tipe untuk melakukan cast statis pada elemen objek enumerable. |
| From | Tipe objek enumerable |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| enumerable | const From\& | is pewaris objek Enumerable dengan metode get_Count yang didefinisikan dan berisi elemen-elemen untuk dikonversi |

### ReturnValue

Pointer ke koleksi baru yang berisi elemen dengan tipe **To** yang setara dengan elemen-elemen dari **enumerable**

## Lihat Juga

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
