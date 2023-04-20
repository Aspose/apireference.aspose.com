---
title: Interface ICSSRuleList
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Css.ICSSRuleList インターフェース. CSSRuleList インターフェイスはCSS ルールの順序付けられたコレクションの抽象化を提供します
type: docs
weight: 630
url: /ja/net/aspose.svg.dom.css/icssrulelist/
---
## ICSSRuleList interface

CSSRuleList インターフェイスは、CSS ルールの順序付けられたコレクションの抽象化を提供します。

```csharp
public interface ICSSRuleList : IEnumerable<ICSSRule>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Item](../../aspose.svg.dom.css/icssrulelist/item/) { get; } | item() メソッドによって CSS ルールを取得するために使用されます (http://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSRuleList)。このコレクション内の順序は、CSS スタイル シート内のルールの順序を表します。 index がリスト内のルールの数以上の場合、これは null. を返します。 |
| [Length](../../aspose.svg.dom.css/icssrulelist/length/) { get; } | リスト内の CSSRules の数。有効な子ルール インデックスの範囲は、0 から長さ 1 までです。 |

### 関連項目

* interface [ICSSRule](../icssrule/)
* 名前空間 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 組み立て [Aspose.SVG](../../)


