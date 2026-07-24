---
title: "System::TypeInfo::IsDefined メソッド"
linktitle: "IsDefined"
second_title: "C++ 用 Aspose.Page"
description: "System::TypeInfo::IsDefined method. 実装されていません。指定された型またはその派生型の属性がこのメンバーに適用されているかどうかを示します（C++）。"
type: docs
weight: 4400
url: /ja/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


未実装です。指定された型またはその派生型の属性がこのメンバーに適用されているかどうかを示します。

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 検索対象となるカスタム属性の型です。検索には派生型も含まれます。 |
| inherit | bool | 属性を検索するためにこのメンバーの継承チェーンを検索する場合は true、そうでなければ false。このパラメーターはプロパティとイベントでは無視されます。 |

### ReturnValue

attributeType またはその派生型のインスタンスがこのメンバーに1つ以上適用されている場合は true、そうでなければ false。

## 参照

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
