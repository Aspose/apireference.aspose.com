---
title: Class Region
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Region クラス. 四角形とパスで構成されるグラフィック形状の内部を記述しますこのクラスは継承できません.
type: docs
weight: 1060
url: /ja/net/system.drawing/region/
---
## Region class

四角形とパスで構成されるグラフィック形状の内部を記述します。このクラスは継承できません.

```csharp
public sealed class Region : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Region](region/#constructor)() | の新しいインスタンスを初期化します`Region`class. |
| [Region](region/#constructor_1)(GraphicsPath) | の新しいインスタンスを初期化します`Region`指定されたクラスGraphicsPath. |
| [Region](region/#constructor_3)(Rectangle) | の新しいインスタンスを初期化します`Region`指定されたクラスRectangle構造体. |
| [Region](region/#constructor_4)(RectangleF) | の新しいインスタンスを初期化します`Region`指定されたクラスRectangleF構造体. |
| [Region](region/#constructor_2)(RegionData) | の新しいインスタンスを初期化します`Region`指定された data. からのクラス |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing/region/clone/)() | これの正確なコピーを作成しますRegion. |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | これを更新しますRegion指定された部分を含むGraphicsPathdos はこれと交差しませんRegion. |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | これを更新しますRegion指定された部分を含むRectangleこれと交差しない構造体 Region. |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | これを更新しますRegion指定された部分を含むRectangleFこれと交差しない構造体 Region. |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | これを更新しますRegion指定された部分を含むRegionこれと 交差しないものRegion. |
| [Dispose](../../system.drawing/region/dispose/)() | これによって使用されたすべてのリソースを解放しますRegion. |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | 指定されたRegionこれと同じですRegion指定された描画面の . |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | これを更新しますRegion指定された と交差しない内部の部分のみを含むGraphicsPath. |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | これを更新しますRegion指定された と交差しない内部の部分のみを含むRectangle構造体. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | これを更新しますRegion指定された と交差しない内部の部分のみを含むRectangleF構造体. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | これを更新しますRegion指定された と交差しない内部の部分のみを含むRegion. |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | を取得しますRectangleFこれを囲む長方形を表す構造体Region の描画面にGraphicsobject. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | を返しますRegionDataこれを説明する情報を表すRegion. |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | の配列を返しますRectangleFこれを近似する構造Region指定されたマトリックス変換が適用された後の . |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | これを更新しますRegion指定されたGraphicsPath. |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | これを更新しますRegion指定されたRectangle構造体. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | これを更新しますRegion指定された との交点にRectangleF構造体. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | これを更新しますRegion指定されたRegion. |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | これがRegion指定された描画面に空の内部があります. |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | これがRegion指定された描画面に無限の内部があります. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | 指定されたPoint構造はこの中に含まれていますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | 指定されたPointF構造はこの中に含まれていますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | 指定されたRectangle構造体は this に含まれていますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | 指定されたRectangleF構造体は within this に含まれていますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | 指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | 指定されたPoint構造はこの中に含まれていますRegion 指定されたGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | 指定されたPointF構造はこの中に含まれていますRegion 指定されたGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | 指定されたRectangle構造体は within this に含まれていますRegion指定されたGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | 指定されたRectangleF構造体は within this に含まれていますRegion指定されたGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | 指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion指定した using で描画した場合Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | 指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion指定された using 描画時のオブジェクトGraphicsobject. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | 指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | 指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | 指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion 指定されたGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | 指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion指定されたGraphics. |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | これを初期化しますRegion空の内部へ. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | これを初期化しますRegion無限の内部へのオブジェクト. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | これを変換しますRegion指定されたMatrix. |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | この座標をオフセットしますRegion指定された量によって. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | この座標をオフセットしますRegion指定された量によって. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | これを更新しますRegionそれ自体と指定されたものの結合にGraphicsPath. |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | これを更新しますRegionそれ自体と指定されたものの結合にRectangle構造体. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | これを更新しますRegionそれ自体と指定されたものの結合にRectangleF構造体. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | これを更新しますRegionそれ自体と指定されたものの結合にRegion. |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | これを更新しますRegion指定された the との和集合からそれ自体の交点を差し引いたものGraphicsPath. |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | これを更新しますRegion指定された the との和集合からそれ自体の交点を差し引いたものRectangle構造体. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | これを更新しますRegion指定された との和集合からそれ自体の交点を差し引いたものRectangleF構造体. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | これを更新しますRegion指定された the との和集合からそれ自体の交点を差し引いたものRegion. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


