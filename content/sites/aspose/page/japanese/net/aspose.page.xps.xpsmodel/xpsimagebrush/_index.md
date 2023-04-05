---
title: Class XpsImageBrush
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsImageBrush クラス. ImageBrush プロパティ要素の機能をカプセル化するクラス. この要素は領域を画像で塗りつぶすために使用されます.
type: docs
weight: 3170
url: /ja/net/aspose.page.xps.xpsmodel/xpsimagebrush/
---
## XpsImageBrush class

ImageBrush プロパティ要素の機能をカプセル化するクラス. この要素は、領域を画像で塗りつぶすために使用されます.

```csharp
public sealed class XpsImageBrush : XpsTilingBrush
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Image](../../aspose.page.xps.xpsmodel/xpsimagebrush/image/) { get; } | ブラシに使用される画像リソースを返します。 |
| [ImageSource](../../aspose.page.xps.xpsmodel/xpsimagebrush/imagesource/) { get; } | 画像リソースの URI を返します。 |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | ブラシ塗りつぶしの均一な透明度を定義する値を返す/設定します. |
| [TileMode](../../aspose.page.xps.xpsmodel/xpstilingbrush/tilemode/) { get; set; } | 塗りつぶされたジオメトリでタイリングを実行する方法を指定する値を返す/設定します. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | ブラシの座標空間に適用されるマトリックス変換を返す/設定します。 Transform プロパティは、現在の有効なレンダリング transform と連結され、ブラシに対してローカルな有効なレンダリング変換を生成します。 brush のビューポートは、ローカルの効果的なレンダリング変換を使用して変換されます。 |
| [Viewbox](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewbox/) { get; set; } | ビューポートにマップされるブラシのソース コンテンツの領域を返す/設定します。 |
| [Viewport](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewport/) { get; set; } | 最初のブラシ タイルの位置とサイズを返す/設定します。後続のタイルは、タイル モードで指定されているように、このタイルに対して相対的に position になります。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsimagebrush/clone/)() | このイメージ ブラシを複製します。 |

### 関連項目

* class [XpsTilingBrush](../xpstilingbrush/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


