---
title: Class XpsVisualBrush
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsVisualBrush クラス. VisualBrush プロパティ要素の機能をカプセル化するクラス. この要素は領域を描画で塗りつぶすために使用されます.
type: docs
weight: 3430
url: /ja/net/aspose.page.xps.xpsmodel/xpsvisualbrush/
---
## XpsVisualBrush class

VisualBrush プロパティ要素の機能をカプセル化するクラス. この要素は、領域を描画で塗りつぶすために使用されます.

```csharp
public sealed class XpsVisualBrush : XpsTilingBrush
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | ブラシ塗りつぶしの均一な透明度を定義する値を返す/設定します. |
| [TileMode](../../aspose.page.xps.xpsmodel/xpstilingbrush/tilemode/) { get; set; } | 塗りつぶされたジオメトリでタイリングを実行する方法を指定する値を返す/設定します. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | ブラシの座標空間に適用されるマトリックス変換を返す/設定します。 Transform プロパティは、現在の有効なレンダリング transform と連結され、ブラシに対してローカルな有効なレンダリング変換を生成します。 brush のビューポートは、ローカルの効果的なレンダリング変換を使用して変換されます。 |
| [Viewbox](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewbox/) { get; set; } | ビューポートにマップされるブラシのソース コンテンツの領域を返す/設定します。 |
| [Viewport](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewport/) { get; set; } | 最初のブラシ タイルの位置とサイズを返す/設定します。後続のタイルは、タイル モードで指定されているように、このタイルに対して相対的に position になります。 |
| [Visual](../../aspose.page.xps.xpsmodel/xpsvisualbrush/visual/) { get; } | ブラシのソース コンテンツの描画に使用されるパス、グリフ、またはキャンバス要素を返す/設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsvisualbrush/clone/)() | このビジュアル ブラシのクローンを作成します。 |
| [SetVisual](../../aspose.page.xps.xpsmodel/xpsvisualbrush/setvisual/)(XpsContentElement) | セット*visual*ビジュアル ブラシのビジュアル要素として. |

### 関連項目

* class [XpsTilingBrush](../xpstilingbrush/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


