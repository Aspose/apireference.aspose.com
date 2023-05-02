---
title: GraphicsPath.AddCurve
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPath 方法. 現在の Figure にスプライン曲線を追加しますカーディナル スプライン曲線が使用されるのは曲線が配列内の各点を通過するためです.
type: docs
weight: 110
url: /ja/net/system.drawing.drawing2d/graphicspath/addcurve/
---
## AddCurve(Point[]) {#addcurve_3}

現在の Figure にスプライン曲線を追加します。カーディナル スプライン曲線が使用されるのは、曲線が配列内の各点を通過するためです.

```csharp
public void AddCurve(Point[] points)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| points | Point[] | の配列Point曲線を定義する点を表す構造。 |

### 関連項目

* struct [Point](../../../system.drawing/point/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## AddCurve(PointF[]) {#addcurve}

現在の Figure にスプライン曲線を追加します。カーディナル スプライン曲線が使用されるのは、曲線が配列内の各点を通過するためです.

```csharp
public void AddCurve(PointF[] points)
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

## AddCurve(PointF[], float) {#addcurve_2}

現在の図にスプライン曲線を追加します。

```csharp
public void AddCurve(PointF[] points, float tension)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| points | PointF[] | 曲線を定義する点を表す PointF 構造体の配列。 |
| tension | Single | コントロール ポイント間で曲線が曲がる量を指定する値。 1 より大きい値を指定すると、予測できない結果が生じます。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## AddCurve(PointF[], int, int, float) {#addcurve_1}

現在の図にスプライン曲線を追加します。

```csharp
public void AddCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| points | PointF[] | の配列PointF曲線を定義する点を表す構造。 |
| offset | Int32 | 要素のインデックス*points*曲線の最初の点として使用される配列。 |
| numberOfSegments | Int32 | 曲線の描画に使用されるセグメントの数。セグメントは、2 点を結ぶ線と考えることができます。 |
| tension | Single | コントロール ポイント間で曲線が曲がる量を指定する値。 1 より大きい値を指定すると、予期しない結果が生じます。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)


