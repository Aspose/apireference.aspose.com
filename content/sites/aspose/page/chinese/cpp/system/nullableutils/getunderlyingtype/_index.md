---
title: "System::NullableUtils::GetUnderlyingType method"
linktitle: "GetUnderlyingType"
second_title: "Aspose.Page 适用于 C++"
description: "System::NullableUtils::GetUnderlyingType method. 返回 C++ 中指定可空类型的底层类型参数。"
type: docs
weight: 100
url: /zh/cpp/system/nullableutils/getunderlyingtype/
---
## NullableUtils::GetUnderlyingType method


返回指定可空类型的底层类型参数。

```cpp
static const System::TypeInfo & System::NullableUtils::GetUnderlyingType(const System::TypeInfo &nullableType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| nullableType | const System::TypeInfo\& | 一个描述封闭泛型可空类型的 System.Type 对象。 |

### ReturnValue

如果 nullableType 参数是封闭的泛型可空类型，则返回 nullableType 参数的类型参数；否则返回 null

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [NullableUtils](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
