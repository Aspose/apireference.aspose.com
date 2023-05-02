---
title: GraphicsPath.GetBounds
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPath 方法. これを囲む四角形を返しますGraphicsPath.
type: docs
weight: 260
url: /ja/net/system.drawing.drawing2d/graphicspath/getbounds/
---
## GetBounds() {#getbounds}

これを囲む四角形を返しますGraphicsPath.

```csharp
public RectangleF GetBounds()
```

### 戻り値

あRectangleFこれは、bounds this の四角形を表しますGraphicsPath.

### 関連項目

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## GetBounds(Matrix) {#getbounds_1}

これを囲む四角形を返しますGraphicsPathこのパスが 指定されたMatrix.

```csharp
public RectangleF GetBounds(Matrix matrix)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| matrix | Matrix | のMatrixこれは、境界矩形が計算される前に、このパスに適用される変換 を指定します. このパスは永続的に変換されません。変換は、外接する四角形を計算する process 中にのみ使用されます。 |

### 戻り値

あRectangleFこれは、bounds this の四角形を表しますGraphicsPath.

### 関連項目

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## GetBounds(Matrix, Pen) {#getbounds_2}

これを囲む四角形を返しますGraphicsPath現在のパスが 指定されたMatrix指定されたPen.

```csharp
public RectangleF GetBounds(Matrix matrix, Pen pen)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| matrix | Matrix | のMatrix境界矩形が計算される前に、この path に適用される変換を指定します。このパスは永続的に変換されるわけではありません。 変換は、外接する四角形を計算するプロセス中にのみ使用されます。 |
| pen | Pen | のPenを描くためにGraphicsPath. |

### 戻り値

あRectangleFthis を囲む四角形を表すGraphicsPath.

### 関連項目

* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)


