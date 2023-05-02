---
title: GraphicsPath.AddClosedCurve
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPath 方法. このパスに閉じた曲線を追加しますカーディナル スプライン曲線が使用されるのは曲線が配列内の各点を通過するためです.
type: docs
weight: 100
url: /ja/net/system.drawing.drawing2d/graphicspath/addclosedcurve/
---
## AddClosedCurve(PointF[]) {#addclosedcurve}

このパスに閉じた曲線を追加します。カーディナル スプライン曲線が使用されるのは、曲線が配列内の各点を通過するためです.

```csharp
public void AddClosedCurve(PointF[] points)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| points | PointF[] | の配列PointF曲線を定義する点を表す構造。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## AddClosedCurve(PointF[], float) {#addclosedcurve_1}

このパスに閉じた曲線を追加します。 曲線は配列内の各点を通過するため、カーディナル スプライン曲線が使用されます。

```csharp
public void AddClosedCurve(PointF[] points, float tension)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| points | PointF[] | 曲線を定義する点を表す PointF 構造体の配列。 |
| tension | Single | 曲線がポイント間で 曲げる量を指定する 0 から 1 までの値。0 は最小の曲線 (最も鋭い角) で、1 は最も滑らかな曲線です。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)


