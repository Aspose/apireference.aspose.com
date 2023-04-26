---
title: HyperlinkCollector.CollectHyperlinks
second_title: Aspose.Page for .NET API リファレンス
description: HyperlinkCollector 方法. すべての種類のハイパーリンクを含む XPS 要素を収集します
type: docs
weight: 10
url: /ja/net/aspose.page.xps.features/hyperlinkcollector/collecthyperlinks/
---
## CollectHyperlinks(XpsDocument) {#collecthyperlinks}

すべての種類のハイパーリンクを含む XPS 要素を収集します。

```csharp
public static ICollection<XpsHyperlinkElement> CollectHyperlinks(XpsDocument document)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| document | XpsDocument | XPS ドキュメント。 |

### 戻り値

ハイパーリンクされた XPS 要素を含むコレクション。

### 関連項目

* class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* class [HyperlinkCollector](../)
* 名前空間 [Aspose.Page.XPS.Features](../../hyperlinkcollector/)
* 組み立て [Aspose.Page](../../../)

---

## CollectHyperlinks&lt;T&gt;(XpsDocument) {#collecthyperlinks_1}

特定の種類のハイパーリンクを含む XPS 要素を収集します。

```csharp
public static ICollection<XpsHyperlinkElement> CollectHyperlinks<T>(XpsDocument document)
    where T : XpsHyperlinkTarget
```

| パラメータ | 説明 |
| --- | --- |
| T | ハイパーリンク ターゲット オブジェクトの型。 |
| document | XPS ドキュメント。 |

### 戻り値

ハイパーリンクされた XPS 要素を含むコレクション。

### 関連項目

* class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* class [XpsHyperlinkTarget](../../../aspose.page.xps.xpsmodel/xpshyperlinktarget/)
* class [HyperlinkCollector](../)
* 名前空間 [Aspose.Page.XPS.Features](../../hyperlinkcollector/)
* 組み立て [Aspose.Page](../../../)


