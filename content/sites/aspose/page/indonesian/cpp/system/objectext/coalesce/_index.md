---
title: "Metode System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::Coalesce method. Implementasi terjemahan operator ''??'' untuk tipe nullable di C++."
type: docs
weight: 500
url: /id/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implementasi terjemahan operator '??' untuk tipe nullable.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | Deskripsi |
| --- | --- |
| T0 | Tipe nilai LHS. |
| T1 | Tipe lambda yang membungkus ekspresi RHS. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | System::Nullable\<T0\> | nilai LHS. |
| func | T1 | ekspresi RHS. |

### ReturnValue

Jika nilai LHS tidak null, mengembalikan LHS, jika tidak menghitung ekspresi RHS dan mengembalikan hasilnya.

## Lihat Juga

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implementasi terjemahan operator '??' untuk tipe non-nullable.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | Deskripsi |
| --- | --- |
| T0 | Tipe nilai LHS. |
| T1 | Tipe lambda yang membungkus ekspresi RHS. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | T0 | nilai LHS. |
| func | T1 | ekspresi RHS. |

### ReturnValue

Jika nilai LHS tidak null, mengembalikan LHS, jika tidak menghitung ekspresi RHS dan mengembalikan hasilnya.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
