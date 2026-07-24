---
title: "System::ObjectExt::CoalesceInternal metode"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::CoalesceInternal metode. Implementasi terjemahan operator ''??'' untuk tipe non-nullable. Overload untuk kasus jika RT2 dapat dikonversi ke RT1 dalam C++."
type: docs
weight: 600
url: /id/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implementasi terjemahan operator '??' untuk tipe non-nullable. Overload untuk kasus jika RT2 dapat dikonversi ke RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Deskripsi |
| --- | --- |
| T0 | Tipe nilai LHS. |
| T1 | Tipe lambda yang membungkus ekspresi RHS. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | RT1 | nilai LHS. |
| func | F | ekspresi RHS. |

### ReturnValue

Jika nilai LHS tidak null, mengembalikan LHS, jika tidak menghitung ekspresi RHS dan mengembalikan hasilnya.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
