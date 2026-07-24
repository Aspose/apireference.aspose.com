---
title: "System::Attribute::GetCustomAttribute メソッド"
linktitle: "GetCustomAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Attribute::GetCustomAttribute メソッド。指定された型に適用された特定の型のカスタム属性を C++ で返します。"
type: docs
weight: 100
url: /ja/cpp/system/attribute/getcustomattribute/
---
## Attribute::GetCustomAttribute method


指定された型に適用された、指定されたタイプのカスタム属性を返します。

```cpp
static Object::ptr System::Attribute::GetCustomAttribute(const TypeInfo &type, const TypeInfo &attributeType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 型 | const TypeInfo\& | 取得対象の型属性 |
| attributeType | const TypeInfo\& | 取得する属性のタイプ |

### ReturnValue

取得された属性、または指定されたタイプがその属性を持っていない場合は null

## 参照

* Typedef [ptr](../../object/ptr/)
* Class [TypeInfo](../../typeinfo/)
* Class [Attribute](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
