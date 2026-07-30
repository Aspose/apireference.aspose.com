---
title: "System::Attribute::GetCustomAttribute 方法"
linktitle: "GetCustomAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Attribute::GetCustomAttribute 方法。返回指定类型应用于指定类型的自定义属性（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system/attribute/getcustomattribute/
---
## Attribute::GetCustomAttribute method


返回指定类型应用于指定类型的自定义属性。

```cpp
static Object::ptr System::Attribute::GetCustomAttribute(const TypeInfo &type, const TypeInfo &attributeType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 要检索的属性类型 |
| attributeType | const TypeInfo\& | 要检索的属性的类型 |

### ReturnValue

检索到的属性；如果指定的类型没有该属性，则返回 null。

## 另见

* Typedef [ptr](../../object/ptr/)
* Class [TypeInfo](../../typeinfo/)
* Class [Attribute](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
