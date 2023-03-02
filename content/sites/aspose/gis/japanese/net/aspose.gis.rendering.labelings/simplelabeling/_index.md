---
title: Class SimpleLabeling
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling クラス. シンプルなラベリングではすべてのフィーチャにラベルが付けられます
type: docs
weight: 1700
url: /ja/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

シンプルなラベリングでは、すべてのフィーチャにラベルが付けられます。

```csharp
public class SimpleLabeling : Labeling
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | の新しいインスタンスを初期化します`SimpleLabeling`class. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | の新しいインスタンスを初期化します`SimpleLabeling`class. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | の新しいインスタンスを初期化します`SimpleLabeling`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | 機能を処理する前に、このラベル付けを構成するために使用されるコールバック. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | テキストの色を決定します。 |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | テキストのレンダリングに使用するフォント ファミリ。デフォルトはシステム依存の値です. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | テキストのサイズ. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | テキストに適用するスタイル. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | フィーチャ ジオメトリをラベリング用に変更されたものに置き換える方法を提供します。 このコールバックは、[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . デフォルトは`null`(フィーチャ ジオメトリをそのまま使用). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | テキストの周りの光輪 (ストローク) の色。 |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | テキストの周りのハロー (ストローク) のサイズ。 |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | ラベルのソースとして使用する属性名。次の場合は無視されます[`LabelExpression`](./labelexpression/)が設定されています. [`LabelAttribute`](./labelattribute/)また[`LabelExpression`](./labelexpression/)レンダリング前に設定する必要があります; InvalidOperationExceptionそれ以外の場合はスローされます. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | ラベル テキストをカスタマイズおよびフォーマットする方法を提供します。設定されている場合、オーバーライド[`LabelAttribute`](./labelattribute/). どちらか[`LabelAttribute`](./labelattribute/)また[`LabelExpression`](./labelexpression/)レンダリング前に設定する必要があります; InvalidOperationExceptionそれ以外の場合はスローされます. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | マルチパート ジオメトリのレンダリング動作を指定します。デフォルトはAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | ラベルの配置は、フィーチャのジオメトリに対して相対的にラベルを配置する方法を指定します。 |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | 他のラベルと重複した場合のこのラベルの優先度を示します。優先度の低いラベルはレンダリングされません。 デフォルトは 1000 です。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | このインスタンスを複製します。 |

### 関連項目

* class [Labeling](../labeling/)
* 名前空間 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 組み立て [Aspose.GIS](../../)


