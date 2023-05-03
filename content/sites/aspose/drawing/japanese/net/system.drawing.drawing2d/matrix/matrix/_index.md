---
title: Matrix.Matrix
second_title: Aspose.Drawing for .NET API リファレンス
description: Matrix コンストラクタ. Matrix クラスの新しいインスタンスを単位行列として初期化します
type: docs
weight: 10
url: /ja/net/system.drawing.drawing2d/matrix/matrix/
---
## Matrix() {#constructor}

Matrix クラスの新しいインスタンスを単位行列として初期化します。

```csharp
public Matrix()
```

### 関連項目

* class [Matrix](../)
* 名前空間 [System.Drawing.Drawing2D](../../matrix/)
* 組み立て [Aspose.Drawing](../../../)

---

## Matrix(float, float, float, float, float, float) {#constructor_1}

指定された要素で Matrix クラスの新しいインスタンスを初期化します。

```csharp
public Matrix(float m11, float m12, float m21, float m22, float dx, float dy)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| m11 | Single | 新しい Matrix の最初の行と最初の列の値。 |
| m12 | Single | 新しい Matrix の最初の行と 2 番目の列の値。 |
| m21 | Single | 新しい Matrix の 2 行目の 1 列目の値。 |
| m22 | Single | 新しい Matrix の 2 行目の 2 列目の値。 |
| dx | Single | 新しい Matrix の 3 行目の 1 列目の値。 |
| dy | Single | 新しい Matrix の 3 行目の 2 列目の値。 |

### 関連項目

* class [Matrix](../)
* 名前空間 [System.Drawing.Drawing2D](../../matrix/)
* 組み立て [Aspose.Drawing](../../../)

---

## Matrix(Rectangle, Point[]) {#constructor_2}

の新しいインスタンスを初期化します[`Matrix`](../)指定された長方形と点の配列によって定義される幾何学的変換へのクラス.

```csharp
public Matrix(Rectangle rect, Point[] plgpts)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Rectangle | あRectangle変換する四角形を表す構造体。 |
| plgpts | Point[] | 3 つの配列Point四角形の左上隅、右上隅、左下隅が変換される平行四辺形の点を表す構造体。平行四辺形の右下隅は、最初の 3 つの隅によって暗示されます。 |

### 関連項目

* struct [Rectangle](../../../system.drawing/rectangle/)
* struct [Point](../../../system.drawing/point/)
* class [Matrix](../)
* 名前空間 [System.Drawing.Drawing2D](../../matrix/)
* 組み立て [Aspose.Drawing](../../../)

---

## Matrix(RectangleF, PointF[]) {#constructor_3}

の新しいインスタンスを初期化します[`Matrix`](../)指定された長方形と点の配列によって定義される幾何学的変換へのクラス.

```csharp
public Matrix(RectangleF rect, PointF[] plgpts)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | RectangleF | あRectangleF変換する四角形を表す構造体。 |
| plgpts | PointF[] | 3 つの配列PointF四角形の左上隅、右上隅、左下隅が変換される平行四辺形の点を表す構造体。平行四辺形の右下隅は、最初の 3 つの隅によって暗示されます。 |

### 関連項目

* struct [RectangleF](../../../system.drawing/rectanglef/)
* struct [PointF](../../../system.drawing/pointf/)
* class [Matrix](../)
* 名前空間 [System.Drawing.Drawing2D](../../matrix/)
* 組み立て [Aspose.Drawing](../../../)


