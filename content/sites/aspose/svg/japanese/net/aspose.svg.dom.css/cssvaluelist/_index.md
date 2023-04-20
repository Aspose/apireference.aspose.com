---
title: Class CSSValueList
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Css.CSSValueList クラス. CSSValueList インターフェイスはCSS 値の順序付けられたコレクションの抽象化を提供します
type: docs
weight: 500
url: /ja/net/aspose.svg.dom.css/cssvaluelist/
---
## CSSValueList class

CSSValueList インターフェイスは、CSS 値の順序付けられたコレクションの抽象化を提供します。

```csharp
public class CSSValueList : CSSValue, ICSSValueList, IEnumerable<CSSValue>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [CSSValueList](cssvaluelist/#constructor)() | の新しいインスタンスを初期化します`CSSValueList` class. |
| [CSSValueList](cssvaluelist/#constructor_1)(params CSSValue[]) | の新しいインスタンスを初期化します`CSSValueList` class. |
| [CSSValueList](cssvaluelist/#constructor_2)(IEnumerable&lt;CSSValue&gt;) | の新しいインスタンスを初期化します`CSSValueList` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| override [CSSText](../../aspose.svg.dom.css/cssvaluelist/csstext/) { get; set; } | 現在の値の文字列表現. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | 値の型を定義するコード. |
| [Item](../../aspose.svg.dom.css/cssvaluelist/item/) { get; } | を取得します[`CSSValue`](../cssvalue/)指定されたインデックスで. |
| [Length](../../aspose.svg.dom.css/cssvaluelist/length/) { get; } | リスト内の CSSValues の数。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | 指定されたObjectこのインスタンスと等しい. |
| [GetEnumerator](../../aspose.svg.dom.css/cssvaluelist/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvaluelist/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | を返しますStringこのインスタンスを表す. |

### 関連項目

* class [CSSValue](../cssvalue/)
* interface [ICSSValueList](../icssvaluelist/)
* 名前空間 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 組み立て [Aspose.SVG](../../)


