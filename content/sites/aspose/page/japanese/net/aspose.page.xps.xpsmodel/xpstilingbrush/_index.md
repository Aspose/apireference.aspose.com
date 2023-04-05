---
title: Class XpsTilingBrush
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsTilingBrush クラス. タイリング ブラシ要素 VisualBrush および ImageBrush の共通機能をカプセル化するクラス
type: docs
weight: 3400
url: /ja/net/aspose.page.xps.xpsmodel/xpstilingbrush/
---
## XpsTilingBrush class

タイリング ブラシ要素 (VisualBrush および ImageBrush) の共通機能をカプセル化するクラス。

```csharp
public abstract class XpsTilingBrush : XpsTransformableBrush
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | ブラシ塗りつぶしの均一な透明度を定義する値を返す/設定します. |
| [TileMode](../../aspose.page.xps.xpsmodel/xpstilingbrush/tilemode/) { get; set; } | 塗りつぶされたジオメトリでタイリングを実行する方法を指定する値を返す/設定します. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | ブラシの座標空間に適用されるマトリックス変換を返す/設定します。 Transform プロパティは、現在の有効なレンダリング transform と連結され、ブラシに対してローカルな有効なレンダリング変換を生成します。 brush のビューポートは、ローカルの効果的なレンダリング変換を使用して変換されます。 |
| [Viewbox](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewbox/) { get; set; } | ビューポートにマップされるブラシのソース コンテンツの領域を返す/設定します。 |
| [Viewport](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewport/) { get; set; } | 最初のブラシ タイルの位置とサイズを返す/設定します。後続のタイルは、タイル モードで指定されているように、このタイルに対して相対的に position になります。 |

### 関連項目

* class [XpsTransformableBrush](../xpstransformablebrush/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


