---
title: Graphics.DrawBezier
second_title: Aspose.Drawing for .NET API リファレンス
description: Graphics 方法. 4 つの PointF 構造体で定義されたベジェ スプラインを描画します
type: docs
weight: 270
url: /ja/net/system.drawing/graphics/drawbezier/
---
## DrawBezier(Pen, PointF, PointF, PointF, PointF) {#drawbezier_1}

4 つの PointF 構造体で定義されたベジェ スプラインを描画します。

```csharp
public void DrawBezier(Pen pen, PointF pt1, PointF pt2, PointF pt3, PointF pt4)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | 曲線の色、幅、スタイルを決定するペン。 |
| pt1 | PointF | 曲線の始点を表す PointF 構造体。 |
| pt2 | PointF | 曲線の最初の制御点を表す PointF 構造体。 |
| pt3 | PointF | 曲線の 2 番目の制御点を表す PointF 構造体。 |
| pt4 | PointF | 曲線の終点を表す PointF 構造体。 |

### 関連項目

* class [Pen](../../pen/)
* struct [PointF](../../pointf/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## DrawBezier(Pen, float, float, float, float, float, float, float, float) {#drawbezier}

点を表す 4 つの順序付けられた座標のペアによって定義されるベジエ スプラインを描画します。

```csharp
public void DrawBezier(Pen pen, float x1, float y1, float x2, float y2, float x3, float y3, 
    float x4, float y4)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | 曲線の色、幅、スタイルを決定するペン。 |
| x1 | Single | 曲線の始点の x 座標。 |
| y1 | Single | 曲線の始点の y 座標。 |
| x2 | Single | 曲線の最初の制御点の x 座標。 |
| y2 | Single | 曲線の最初の制御点の y 座標。 |
| x3 | Single | 曲線の 2 番目の制御点の x 座標。 |
| y3 | Single | 曲線の 2 番目の制御点の y 座標。 |
| x4 | Single | 曲線の終点の x 座標。 |
| y4 | Single | 曲線の終点の y 座標。 |

### 関連項目

* class [Pen](../../pen/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)


