---
title: "System::Attribute::GetCustomAttribute 方法"
linktitle: "GetCustomAttribute"
second_title: "Aspose.Page 适用于 C++"
description: "System::Attribute::GetCustomAttribute 方法。返回在 C++ 中应用于指定类型的指定类型的自定义属性。"
type: docs
weight: 100
url: /zh/cpp/system/attribute/getcustomattribute/
---
## Attribute::GetCustomAttribute method


返回指定类型上应用的指定类型的自定义属性。

```cpp
static Object::ptr System::Attribute::GetCustomAttribute(const TypeInfo &type, const TypeInfo &attributeType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 类型 | const TypeInfo\& | 要检索的类型属性 |
| attributeType | const TypeInfo\& | 要检索的属性类型 |

### ReturnValue

检索到的属性，若指定类型没有该属性则为 null。

## 另见

* Typedef [ptr](../../object/ptr/)
* Class [TypeInfo](../../typeinfo/)
* Class [Attribute](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
