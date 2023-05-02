---
title: Graphics.DrawPie
second_title: Aspose.Drawing for .NET API リファレンス
description: Graphics 方法. RectangleF 構造体で指定された楕円と 2 つの放射状の線で定義される円グラフを描画します
type: docs
weight: 400
url: /ja/net/system.drawing/graphics/drawpie/
---
## DrawPie(Pen, RectangleF, float, float) {#drawpie_1}

RectangleF 構造体で指定された楕円と 2 つの放射状の線で定義される円グラフを描画します。

```csharp
public void DrawPie(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | パイの形の色、幅、スタイルを決定するペン。 |
| rect | RectangleF | パイ形状の元になる楕円を定義する、境界のrectangle を表す RectangleF 構造体。 |
| startAngle | Single | 軸から円グラフの最初の辺まで時計回りに測定された角度 (度単位)。 |
| sweepAngle | Single | startAngle パラメータ から円グラフの 2 番目の辺まで時計回りに測定された角度。 |

### 関連項目

* class [Pen](../../pen/)
* struct [RectangleF](../../rectanglef/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## DrawPie(Pen, float, float, float, float, float, float) {#drawpie}

座標ペア、幅、高さ、および 2 本の放射状線で指定された楕円によって定義されるパイ形状を描画します。

```csharp
public void DrawPie(Pen pen, float x, float y, float width, float height, float startAngle, 
    float sweepAngle)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | Penパイの形の色、幅、スタイルを決定します。 |
| x | Single | パイ形状の元になる楕円を定義する外接する四角形の左上隅の x 座標。 |
| y | Single | パイ形状の元となる楕円を定義する外接する四角形の左上隅の y 座標。 |
| width | Single | パイ形状の元になる楕円を定義する外接する四角形の幅。 |
| height | Single | パイ形状の元になる楕円を定義する外接する四角形の高さ。 |
| startAngle | Single | X 軸から円グラフの最初の辺まで時計回りに測定された角度 (度単位)。 |
| sweepAngle | Single | startAngle パラメーターから円グラフの 2 番目の辺までの角度 (度単位)。 |

### 関連項目

* class [Pen](../../pen/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)


