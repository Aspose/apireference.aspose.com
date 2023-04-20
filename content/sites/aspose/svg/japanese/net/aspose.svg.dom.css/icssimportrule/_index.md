---
title: Interface ICSSImportRule
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Css.ICSSImportRule インターフェース. CSSImportRule インターフェイスはCSS スタイル シート内の import ルールを表します import ルールは他のスタイル シートからスタイル ルールをインポートするために使用されます
type: docs
weight: 560
url: /ja/net/aspose.svg.dom.css/icssimportrule/
---
## ICSSImportRule interface

CSSImportRule インターフェイスは、CSS スタイル シート内の @import ルールを表します。 @import ルールは、他のスタイル シートからスタイル ルールをインポートするために使用されます。

```csharp
public interface ICSSImportRule : ICSSRule
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Href](../../aspose.svg.dom.css/icssimportrule/href/) { get; } | インポートするスタイル シートの場所。この属性には、URI の前後に「url(...)」指定子が含まれません。 |
| [Media](../../aspose.svg.dom.css/icssimportrule/media/) { get; } | このスタイル シートを使用できるメディア タイプのリスト。 |
| [StyleSheet](../../aspose.svg.dom.css/icssimportrule/stylesheet/) { get; } | ロードされている場合、このルールによって参照されるスタイル シート。スタイル シートがまだ読み込まれていない場合、または読み込まれない場合 (たとえば、スタイル シートがユーザー エージェントによってサポートされていないメディア タイプ用である場合)、この属性の値は null です。 |

### 関連項目

* interface [ICSSRule](../icssrule/)
* 名前空間 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 組み立て [Aspose.SVG](../../)


