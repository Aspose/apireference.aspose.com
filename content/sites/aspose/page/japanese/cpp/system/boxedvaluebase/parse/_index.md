---
title: "System::BoxedValueBase::Parse メソッド"
linktitle: "Parse"
second_title: "C++ 用 Aspose.Page"
description: "System::BoxedValueBase::Parse メソッド。指定された列挙型の指定された名前を持つ列挙定数の値を C++ でボックス化します。"
type: docs
weight: 500
url: /ja/cpp/system/boxedvaluebase/parse/
---
## BoxedValueBase::Parse(const TypeInfo\&, const String\&) method


指定された列挙体の指定された名前を持つ列挙定数の値をボックス化します。

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 型 | const TypeInfo\& | 列挙型の型を指定します |
| str | const String\& | ボックス化する列挙定数の名前 |

### ReturnValue

指定された列挙定数のボックス化された値を表すオブジェクトへの共有ポインタ

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BoxedValueBase::Parse(const TypeInfo\&, const String\&, bool) method


指定された列挙体の指定された名前を持つ列挙定数の値をボックス化します。パラメータは、列挙定数名を表す文字列を解釈する際に大文字小文字を無視するかどうかを指定します。

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 型 | const TypeInfo\& | 列挙型の型を指定します |
| str | const String\& | ボックス化する列挙定数の名前 |
| ignoreCase | bool | 列挙定数名を表す文字列を解釈する際に大文字小文字を無視するかどうかを指定します |

### ReturnValue

指定された列挙定数のボックス化された値を表すオブジェクトへの共有ポインタ

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
