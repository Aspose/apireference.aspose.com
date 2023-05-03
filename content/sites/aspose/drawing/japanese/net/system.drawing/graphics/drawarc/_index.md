---
title: Graphics.DrawArc
second_title: Aspose.Drawing for .NET API リファレンス
description: Graphics 方法. RectangleF 構造体で指定された楕円の一部を表す円弧を描画します
type: docs
weight: 260
url: /ja/net/system.drawing/graphics/drawarc/
---
## DrawArc(Pen, RectangleF, float, float) {#drawarc_1}

RectangleF 構造体で指定された楕円の一部を表す円弧を描画します。

```csharp
public void DrawArc(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | 弧の色、幅、スタイルを決定するペン。 |
| rect | RectangleF | 楕円の境界を定義する RectangleF 構造体。 |
| startAngle | Single | 軸から円弧の始点まで時計回りに測定した角度 (度単位)。 |
| sweepAngle | Single | startAngle パラメーターから円弧の終点まで時計回りに測定された角度 (度単位)。 |

### 関連項目

* class [Pen](../../pen/)
* struct [RectangleF](../../rectanglef/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## DrawArc(Pen, float, float, float, float, float, float) {#drawarc}

座標、幅、および高さのペアで指定された楕円の一部を表す円弧を描画します。

```csharp
public void DrawArc(Pen pen, float x, float y, float width, float height, float startAngle, 
    float sweepAngle)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | 弧の色、幅、スタイルを決定するペン。 |
| x | Single | 楕円を定義する四角形の左上隅の x 座標。 |
| y | Single | 楕円を定義する四角形の左上隅の y 座標。 |
| width | Single | 楕円を定義する長方形の幅。 |
| height | Single | 楕円を定義する長方形の高さ。 |
| startAngle | Single | 軸から円弧の始点まで時計回りに測定した角度 (度単位)。 |
| sweepAngle | Single | startAngle パラメーターから円弧の終点まで時計回りに測定された角度 (度単位)。 |

### 関連項目

* class [Pen](../../pen/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)


