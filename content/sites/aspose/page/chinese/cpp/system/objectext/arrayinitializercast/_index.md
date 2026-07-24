---
title: "System::ObjectExt::ArrayInitializerCast 方法"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page 适用于 C++"
description: "System::ObjectExt::ArrayInitializerCast 方法。将数组的基本值进行转换（C# 会隐式完成，但 C++ 显然不会）。"
type: docs
weight: 100
url: /zh/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


转换数组的基本值（C# 会隐式完成，但 C++ 显然不会）。

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | 描述 |
| --- | --- |
| 至 | 目标类型。 |
| From | 源类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| args | 来自 ... | 要转换并推入目标数组的值。 |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## 另见

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
