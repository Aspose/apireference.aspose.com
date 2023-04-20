---
title: Class GraphicContext
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Rendering.GraphicContext クラス. 現在のグラフィック コントロール パラメータを保持します これらのパラメータはグラフィック オペレータが実行されるグローバル フレームワークを定義します
type: docs
weight: 2800
url: /ja/net/aspose.svg.rendering/graphiccontext/
---
## GraphicContext class

現在のグラフィック コントロール パラメータを保持します。 これらのパラメータは、グラフィック オペレータが実行されるグローバル フレームワークを定義します。

```csharp
public class GraphicContext : ICloneable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [GraphicContext](graphiccontext/)() | の新しいインスタンスを初期化します`GraphicContext` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | 文字間隔を設定または取得します。 |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | パスの内部を塗りつぶすために使用されるブラシ オブジェクトを設定または取得します。 |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | テキストのレンダリングに使用される True Type フォント オブジェクトを設定または取得します。 |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | テキストのフォント サイズを設定または取得します。 |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | テキストのフォント スタイルを設定または取得します。 |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | ストロークされた開いたパスの端点の形状を指定するコードを設定または取得します。 |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | 現在の破線パターンの位相オフセットを設定または取得します。 |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | パスがストロークされるときに使用される破線パターンの説明を設定または取得します。 |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | のセットは、ストローク パスの破線のスタイルを取得します。 |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | ストローク パスの接続されたセグメント間のジョイントの形状を指定するコードを設定または取得します。 |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | ストロークするパスの太さを設定または取得します。 |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | ストローク パスの留め継ぎ線結合の最大長を設定または取得します。 このパラメータは、線分が鋭角で結合するときに生成される「スパイク」の長さを制限します. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | ストローク パスに使用されるブラシ オブジェクトを設定または取得します。 |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | を取得します[`TextInfo`](../textinfo/)レンダリングされたテキストに関する情報を含むオブジェクト. |
| virtual [TransformationMatrix](../../aspose.svg.rendering/graphiccontext/transformationmatrix/) { get; set; } | 変換行列を設定または取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| virtual [Clone](../../aspose.svg.rendering/graphiccontext/clone/)() | 既存のインスタンスと同じプロパティ値を持つ GraphicContext クラスの新しいインスタンスを作成します。 |
| virtual [Transform](../../aspose.svg.rendering/graphiccontext/transform/)(Matrix) | 指定された行列を乗算して、現在の変換行列を変更します。 |

### 関連項目

* 名前空間 [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* 組み立て [Aspose.SVG](../../)


