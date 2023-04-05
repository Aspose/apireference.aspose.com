---
title: Class XpsPathGeometry
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry クラス. PathGeometry プロパティ要素の機能をカプセル化するクラス この要素にはFigures 属性または子 PathFigure 要素を持つ で指定された一連のパス図が含まれます
type: docs
weight: 3270
url: /ja/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

PathGeometry プロパティ要素の機能をカプセル化するクラス。 この要素には、Figures 属性または子 PathFigure 要素を持つ で指定された一連のパス図が含まれます。

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | geometry 形状の交差領域を結合して領域を形成する方法を指定する値を返す/設定します. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | 子パス図のリストを返します。 |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | ローカル マトリックス変換を確立するアフィン変換マトリックスを返す/設定します パス ジオメトリのすべての子要素と子孫要素に適用されます 塗りつぶし、クリッピング、またはストロークに使用されます. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | 最後のパス図の子セグメントのリストにパス セグメントを追加します。 |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | このパス ジオメトリを複製します。 |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | の子セグメントのリストにパス セグメントを挿入します の最後のパス図*index*位置. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | 最後のパス図の子セグメントのリストからパス セグメントを削除します。 |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | の子セグメントのリストからパス セグメントを削除します の最後のパス図*index*位置. |

### 関連項目

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


