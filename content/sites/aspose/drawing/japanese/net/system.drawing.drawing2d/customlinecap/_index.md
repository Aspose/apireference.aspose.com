---
title: Class CustomLineCap
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.CustomLineCap クラス. カスタムのユーザー定義のライン キャップをカプセル化します
type: docs
weight: 200
url: /ja/net/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class

カスタムのユーザー定義のライン キャップをカプセル化します。

```csharp
public class CustomLineCap : ICloneable, IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [CustomLineCap](customlinecap/#constructor)(GraphicsPath, GraphicsPath) | の新しいインスタンスを初期化します`CustomLineCap`指定されたアウトラインと塗りつぶしを持つクラス. |
| [CustomLineCap](customlinecap/#constructor_1)(GraphicsPath, GraphicsPath, LineCap) | の新しいインスタンスを初期化します`CustomLineCap`指定された 既存のクラスLineCap指定されたアウトラインと塗りつぶしを持つ列挙. |
| [CustomLineCap](customlinecap/#constructor_2)(GraphicsPath, GraphicsPath, LineCap, float) | の新しいインスタンスを初期化します`CustomLineCap`指定された 既存のクラスLineCap指定されたアウトライン、塗りつぶし、およびインセットを持つ列挙. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [BaseCap](../../system.drawing.drawing2d/customlinecap/basecap/) { get; set; } | を取得または設定しますLineCapこれの列挙CustomLineCapベースです. |
| [BaseInset](../../system.drawing.drawing2d/customlinecap/baseinset/) { get; set; } | キャップとラインの間の距離を取得または設定します。 |
| [StrokeJoin](../../system.drawing.drawing2d/customlinecap/strokejoin/) { get; set; } | を取得または設定しますLineJoin行を構成する方法を決定する列挙型 thisCustomLineCapオブジェクトが結合されています. |
| [WidthScale](../../system.drawing.drawing2d/customlinecap/widthscale/) { get; set; } | これをスケーリングする量を取得または設定しますCustomLineCapの幅に関する Class オブジェクトPenobject. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/customlinecap/clone/)() | これの正確なコピーを作成しますCustomLineCap. |
| [Dispose](../../system.drawing.drawing2d/customlinecap/dispose/)() | これによって使用されたすべてのリソースを解放しますCustomLineCapobject. |
| [GetStrokeCaps](../../system.drawing.drawing2d/customlinecap/getstrokecaps/)(out LineCap, out LineCap) | このカスタムキャップを構成する線の開始と終了に使用されるキャップを取得します. |
| [SetStrokeCaps](../../system.drawing.drawing2d/customlinecap/setstrokecaps/)(LineCap, LineCap) | このカスタム キャップを構成する線の開始と終了に使用するキャップを設定します。 |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


