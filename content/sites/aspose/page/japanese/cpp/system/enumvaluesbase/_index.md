---
title: "System::EnumValuesBase クラス"
linktitle: "EnumValuesBase"
second_title: "C++ 用 Aspose.Page"
description: "System::EnumValuesBase クラス。C++ における列挙型のメタ情報を表すクラスの基底クラスです。"
type: docs
weight: 2400
url: /ja/cpp/system/enumvaluesbase/
---
## EnumValuesBase class


列挙型のメタ情報を表すクラスの基底クラスです。

```cpp
class EnumValuesBase
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [GetNames](./getnames/)(const TypeInfo\&) | 指定された列挙体の定数名の配列を取得します。 |
| static [GetUnderlyingType](./getunderlyingtype/)(const TypeInfo\&) | 指定された列挙体の基になる型を返します。 |
| static [GetValues](./getvalues/)(const TypeInfo\&) | 指定された列挙型のすべての値を含む配列を返します。 |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | 指定された名前を持つ、指定された列挙型の列挙定数の値を表すオブジェクトを返します。 |
| static [ToObject](./toobject/)(const TypeInfo\&, uint64_t) | 指定された 64 ビット符号なし整数値を列挙メンバーに変換します。 |
| static [ToObject](./toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | 整数値を持つ指定されたオブジェクトを列挙メンバーに変換します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
