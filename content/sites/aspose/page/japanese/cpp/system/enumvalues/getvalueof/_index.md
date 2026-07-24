---
title: "System::EnumValues::GetValueOf メソッド"
linktitle: "GetValueOf"
second_title: "C++ 用 Aspose.Page"
description: "System::EnumValues::GetValueOf メソッド。C++ で指定された名前を持つ列挙定数のボックス化された値を返します。"
type: docs
weight: 500
url: /ja/cpp/system/enumvalues/getvalueof/
---
## EnumValues::GetValueOf(const String\&, bool) const method


指定された名前を持つ列挙定数のボックス化された値を返します。

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(const String &str, bool ignoreCase) const override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 列挙定数の名前 |
| ignoreCase | bool | 列挙定数の名前を解釈する際に大文字小文字を無視すべきかを指定します |

### ReturnValue

名前が **str** で指定された列挙定数のボックス化された値です。

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValues::GetValueOf(long) const method


指定された値を持つ列挙定数のボックス化された値を返します。

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(long val) const override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| val | long | 列挙定数の値 |

### ReturnValue

値が **str** で指定された列挙定数のボックス化された値です。

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
