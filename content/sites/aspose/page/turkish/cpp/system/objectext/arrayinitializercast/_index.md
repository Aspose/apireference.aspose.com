---
title: "System::ObjectExt::ArrayInitializerCast yöntemi"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::ArrayInitializerCast yöntemi. Dizi temel değerlerini C++'ta dönüştürür (C#'ta bu işlemi örtülü olarak yapar ancak C++'ta görünür şekilde yapılmaz)."
type: docs
weight: 100
url: /tr/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Dizi temel değerlerini dönüştürür (C# bunu otomatik yapar ancak C++ görünüşe göre yapmaz).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | Açıklama |
| --- | --- |
| To | Hedef tip. |
| From | Kaynak türler. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| args | Kaynak ... | Hedef diziye dönüştürülüp itilecek değerler. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
