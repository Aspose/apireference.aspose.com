---
title: "System::EnumValues クラス"
linktitle: "EnumValues"
second_title: "C++ 用 Aspose.Page"
description: "System::EnumValues クラス。C++ における enum 型 E の列挙定数に関するメタ情報を提供します。"
type: docs
weight: 2300
url: /ja/cpp/system/enumvalues/
---
## EnumValues class


列挙型 **E** の列挙定数に関するメタ情報を提供します。

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| パラメーター | 説明 |
| --- | --- |
| E | 列挙型の型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [EnumValues](./enumvalues/)() | インスタンスを構築します。 |
| [GetNames](./getnames/)() const override | **E** のすべての名前を含む配列を返します。 |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | 指定された列挙体の定数名の配列を取得します。 |
| [GetUnderlyingType](./getunderlyingtype/)() const override | 指定された列挙体の基になる型を返します。 |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | 指定された列挙体の基になる型を返します。 |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | 指定された名前を持つ列挙定数のボックス化された値を返します。 |
| [GetValueOf](./getvalueof/)(long) const override | 指定された値を持つ列挙定数のボックス化された値を返します。 |
| [GetValues](./getvalues/)() const override | 列挙型 **E** のすべての値を含む配列を返します。 |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | 指定された列挙型のすべての値を含む配列を返します。 |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | 指定された名前を持つ、指定された列挙型の列挙定数の値を表すオブジェクトを返します。 |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | 指定された 64 ビット符号なし整数値を列挙メンバーに変換します。 |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | 整数値を持つ指定されたオブジェクトを列挙メンバーに変換します。 |
| virtual [~EnumValues](./~enumvalues/)() | デストラクタ。 |

## 参照

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
