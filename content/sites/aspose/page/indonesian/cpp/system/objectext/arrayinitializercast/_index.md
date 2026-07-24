---
title: "Metode System::ObjectExt::ArrayInitializerCast"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::ArrayInitializerCast method. Mengonversi nilai fundamental array (yang C# lakukan secara implisit tetapi C++ tampaknya tidak) di C++."
type: docs
weight: 100
url: /id/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Mengonversi nilai fundamental array (yang dilakukan secara implisit oleh C# tetapi tampaknya tidak oleh C++).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | Deskripsi |
| --- | --- |
| Ke | Tipe target. |
| From | Tipe sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| args | Dari ... | Nilai-nilai yang akan dikonversi dan didorong ke array target. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
