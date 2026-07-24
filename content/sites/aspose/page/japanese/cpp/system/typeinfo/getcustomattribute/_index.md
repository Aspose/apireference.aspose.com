---
title: "System::TypeInfo::GetCustomAttribute メソッド"
linktitle: "GetCustomAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::TypeInfo::GetCustomAttribute メソッド。C++ で、指定された型を持ち、現在のオブジェクトが表す型に適用されたカスタム属性を検索します。"
type: docs
weight: 3000
url: /ja/cpp/system/typeinfo/getcustomattribute/
---
## TypeInfo::GetCustomAttribute method


現在のオブジェクトが表す型に適用され、指定された型を持つカスタム属性を検索します。

```cpp
ObjectPtr System::TypeInfo::GetCustomAttribute(const TypeInfo &attributeType) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 検索対象の属性の型を表す[TypeInfo](../)オブジェクトへの定数参照 |

### ReturnValue

見つかった属性を表すオブジェクトへのポインタ、または検索条件に一致する属性が見つからなかった場合はヌルポインタ

## 参照

* Class [SmartPtr](../../smartptr/)
* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
