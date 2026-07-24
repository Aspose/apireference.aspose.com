---
title: "System::Reflection::MemberInfo::GetCustomAttributes メソッド"
linktitle: "GetCustomAttributes"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::MemberInfo::GetCustomAttributes メソッド。現在のオブジェクトが表す型に適用されたすべてのカスタム属性を表すオブジェクトを含む配列を返します（C++）。"
type: docs
weight: 700
url: /ja/cpp/system.reflection/memberinfo/getcustomattributes/
---
## MemberInfo::GetCustomAttributes(bool) const method


現在のオブジェクトが表す型に適用されたすべてのカスタム属性を表すオブジェクトを含む配列を返します。

```cpp
ArrayPtr<SharedPtr<Object>> System::Reflection::MemberInfo::GetCustomAttributes(bool inherit=false) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| inherit | bool | 継承された属性もチェックするかどうか。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [MemberInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## MemberInfo::GetCustomAttributes(const TypeInfo\&, bool) const method


現在のオブジェクトが表す型に適用されたすべてのカスタム属性を表すオブジェクトを含む配列を返します。

```cpp
ArrayPtr<SharedPtr<Object>> System::Reflection::MemberInfo::GetCustomAttributes(const TypeInfo &attributeType, bool inherit=false) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 検索する属性の型。 |
| inherit | bool | 継承された属性もチェックするかどうか。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [MemberInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
