---
title: GraphicsPath.Warp
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPath 方法. 長方形と平行四辺形で定義されたワープ変換をこれに適用しますGraphicsPath.
type: docs
weight: 350
url: /ja/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

長方形と平行四辺形で定義されたワープ変換をこれに適用します[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destPoints | PointF[] | の配列PointFによって定義される長方形が平行四辺形を定義する構造*srcRect* が変換されます。配列には、3 つまたは 4 つの要素を含めることができます。 配列に 3 つの要素が含まれている場合、平行四辺形の右下隅は最初の 3 つの点によって暗示されます。 |
| srcRect | RectangleF | あRectangleFによって定義される平行四辺形に変換される長方形を表す*destPoints*. |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

長方形と平行四辺形で定義されたワープ変換をこれに適用します[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destPoints | PointF[] | の配列PointFによって定義される長方形が平行四辺形を定義する構造*srcRect* が変換されます。配列には、3 つまたは 4 つの要素を含めることができます。 配列に 3 つの要素が含まれている場合、平行四辺形の右下隅は最初の 3 つの点によって暗示されます。 |
| srcRect | RectangleF | あRectangleFによって定義される平行四辺形に変換される長方形を表す*destPoints*. |
| matrix | Matrix | あ[`Matrix`](../../matrix/)パスに適用する幾何学的変換を指定します。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

長方形と平行四辺形で定義されたワープ変換をこれに適用します[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destPoints | PointF[] | の配列PointFによって定義される長方形が平行四辺形を定義する構造*srcRect* が変換されます。配列には 3 つまたは 4 つの要素を含めることができます. 配列に 3 つの要素が含まれる場合、平行四辺形の右下隅は最初の 3 つの点によって暗示されます. |
| srcRect | RectangleF | あRectangleFによって定義される平行四辺形に変換される長方形を表す*destPoints*. |
| matrix | Matrix | あ[`Matrix`](../../matrix/)パスに適用する幾何学的変換を指定します。 |
| warpMode | WarpMode | あ[`WarpMode`](../../warpmode/)このワープ操作でパースペクティブ モードとバイリニア モードのどちらを使用するかを指定する列挙。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* enum [WarpMode](../../warpmode/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

長方形と平行四辺形で定義されたワープ変換をこれに適用します[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destPoints | PointF[] | の配列PointFによって定義される長方形が平行四辺形を定義する構造*srcRect* が変換されます。配列には 3 つまたは 4 つの要素を含めることができます. 配列に 3 つの要素が含まれる場合、平行四辺形の右下隅は最初の 3 つの点によって暗示されます. |
| srcRect | RectangleF | あRectangleFによって定義される平行四辺形に変換される長方形を表す*destPoints*. |
| matrix | Matrix | あ[`Matrix`](../../matrix/)パスに適用する幾何学的変換を指定します。 |
| warpMode | WarpMode | あ[`WarpMode`](../../warpmode/)このワープ操作でパースペクティブ モードとバイリニア モードのどちらを使用するかを指定する列挙。 |
| flatness | Single | 結果のパスがどの程度平坦かを指定する 0 ～ 1 の値。詳細については、[`Flatten`](../flatten/)メソッド。 |

### 関連項目

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* enum [WarpMode](../../warpmode/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)


