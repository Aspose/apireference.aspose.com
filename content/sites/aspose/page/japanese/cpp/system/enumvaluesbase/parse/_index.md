---
title: "System::EnumValuesBase::Parse メソッド"
linktitle: "Parse"
second_title: "C++ 用 Aspose.Page"
description: "System::EnumValuesBase::Parse メソッド。指定された列挙型の指定された名前を持つ列挙定数の値を表すオブジェクトを C++ で返します。"
type: docs
weight: 400
url: /ja/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


指定された名前を持つ、指定された列挙型の列挙定数の値を表すオブジェクトを返します。

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | const TypeInfo\& | 返す列挙値の型を表す [TypeInfo](../../typeinfo/) オブジェクト |
| str | const String\& | 列挙定数の名前 |
| ignoreCase | bool | 列挙定数の名前を解釈する際に大文字小文字を無視すべきかを指定します |

### ReturnValue

名前が **str** で指定された列挙定数の値を表すオブジェクトです。

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
