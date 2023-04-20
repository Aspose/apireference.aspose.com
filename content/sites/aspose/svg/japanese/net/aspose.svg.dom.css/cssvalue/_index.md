---
title: Class CSSValue
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Css.CSSValue クラス. 単純または複雑な値を表します CSSValue オブジェクトはCSS プロパティのコンテキストでのみ発生します.
type: docs
weight: 490
url: /ja/net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

単純または複雑な値を表します。 CSSValue オブジェクトは、CSS プロパティのコンテキストでのみ発生します.

```csharp
public abstract class CSSValue : DOMObject
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | 現在の値の文字列表現. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | 値の型を定義するコード. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | 指定されたObjectこのインスタンスと等しい. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | を返しますStringこのインスタンスを表す. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | 演算子 ==. を実装します |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | 演算子 !=. を実装します |

## 田畑

| 名前 | 説明 |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | 値はカスタム値です。 |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | 値が継承され、cssText に「inherit」が含まれています。 |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | 値はプリミティブ値であり、CSSValue インターフェイスのこのインスタンスでバインディング固有のキャスト メソッドを使用することにより、CSSPrimitiveValue インターフェイスのインスタンスを取得できます。 |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | 値は CSSValue リストであり、CSSValueList インターフェイスのインスタンスは、CSSValue インターフェイスのこのインスタンスでバインディング固有のキャスト メソッドを使用して取得できます。 |

### 関連項目

* class [DOMObject](../../aspose.svg.dom/domobject/)
* 名前空間 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 組み立て [Aspose.SVG](../../)


