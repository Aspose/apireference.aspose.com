---
title: "System::ObjectExt::ArrayInitializerCast metodu"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::ArrayInitializerCast metodu. C++'ta dizi temel değerlerini (C#'ın otomatik olarak yaptığı ancak C++'ın yapmadığı) dönüştürür."
type: docs
weight: 100
url: /tr/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Dizi temel değerlerini dönüştürür (C# bunu örtük olarak yapar ancak C++ muhtemelen yapmaz).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parametre | Açıklama |
| --- | --- |
| Şu | Hedef tip. |
| From | Kaynak tipleri. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| args | Kaynak ... | Hedef diziye dönüştürülüp itilecek değerler. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
