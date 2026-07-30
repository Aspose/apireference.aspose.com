---
title: "System::NullableUtils::GetUnderlyingType 方法"
linktitle: "GetUnderlyingType"
second_title: "Aspose.Font 适用于 C++"
description: "System::NullableUtils::GetUnderlyingType 方法。返回在 C++ 中指定可空类型的底层类型参数。"
type: docs
weight: 100
url: /zh/cpp/system/nullableutils/getunderlyingtype/
---
## NullableUtils::GetUnderlyingType method


返回指定可空类型的底层类型参数。

```cpp
static const System::TypeInfo & System::NullableUtils::GetUnderlyingType(const System::TypeInfo &nullableType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nullableType | const System::TypeInfo\& | 描述封闭泛型可空类型的 System.Type 对象。 |

### ReturnValue

如果 nullableType 参数是封闭的泛型可空类型，则为 nullableType 参数的类型参数；否则为 null。

## 另见

* Class [TypeInfo](../../typeinfo/)
* Class [NullableUtils](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
