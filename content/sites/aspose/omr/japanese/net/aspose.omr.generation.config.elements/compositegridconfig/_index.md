---
title: Class CompositeGridConfig
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig クラス. グリッド要素 バブルの配列を生成します塗りつぶされた各バブルは複合値の 1 つのシンボルを表します マークされたすべてのシンボルは単一の値 に連結されます
type: docs
weight: 120
url: /ja/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

グリッド要素。 バブルの配列を生成します。塗りつぶされた各バブルは、複合値の 1 つのシンボルを表します マークされたすべてのシンボルは、単一の値 に連結されます

```csharp
public class CompositeGridConfig : BaseConfig
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | 泡の種類 |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | 要素が複数列の親で描画される場合 - 位置を表します. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | グリッド内の列の量。各列は、結果の単一のシンボルを表します value Amount は、[`ExtraRow`](./extrarow/)列数 |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | このグリッドの名前を表示する必要があります |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | デフォルト値の上に配置される列固有の値 -[`Values`](./values/) . 2 次元配列として表示されます。 最初の行。 2 番目 - 列. 各文字列は、バブル内のテキストを表します. 文字列が null の場合、バブルは配置されません. 列の数は、[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | グリッド配置、page のどこにグリッドを描画するかを示します |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | グリッドの向き: 水平または垂直。子要素の配置方法を示します |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | 四角枠 color |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | 四角枠 size |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | grid の開始時に描画する要素のタイプを示します |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | グリッドの名前。認識 で識別子として使用 |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | 自身の軸を中心としたグリッド要素の回転を記述します。 "90" - CompositeGrid を 90 度回転します "-90" - ComopositeGrid を -90 度回転します |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | omr 要素のタイプ。 JSON シリアル化の必須フィールド. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | 各列で可能な記号を説明する文字列のコレクション。 列固有の値が配置されます[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | ページ上のグリッド X 位置、alignment を上書き |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | ページ上のグリッド Y 位置、alignment を上書き |

## 田畑

| 名前 | 説明 |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | 泡の大きさ |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | 行間の余白 |

### 関連項目

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* 名前空間 [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* 組み立て [Aspose.OMR](../../)


