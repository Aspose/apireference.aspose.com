---
title: "Метод System::ObjectExt::ArrayInitializerCast"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page для C++"
description: "Метод System::ObjectExt::ArrayInitializerCast. Преобразует базовые значения массива (что C# делает неявно, а C++ очевидно не делает) в C++."
type: docs
weight: 100
url: /ru/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Преобразует фундаментальные значения массивов (что C# делает неявно, а C++ очевидно не делает).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Параметр | Описание |
| --- | --- |
| К | Тип назначения. |
| From | Типы источника. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | От ... | Значения для преобразования и помещения в целевой массив. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
