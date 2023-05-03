---
title: Region.IsVisible
second_title: Aspose.Drawing for .NET API リファレンス
description: Region 方法. 指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion.
type: docs
weight: 130
url: /ja/net/system.drawing/region/isvisible/
---
## IsVisible(float, float) {#isvisible_3}

指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion.

```csharp
public bool IsVisible(float x, float y)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Single | テストする点の x 座標。 |
| y | Single | テストするポイントの y 座標。 |

### 戻り値

指定されたポイントがこの範囲内に含まれている場合は trueRegion;それ以外の場合は false。

### 関連項目

* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(PointF) {#isvisible_9}

指定されたPointF構造はこの中に含まれていますRegion.

```csharp
public bool IsVisible(PointF point)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| point | PointF | のPointFテストする構造。 |

### 戻り値

真の場合*point*この中に含まれていますRegion;それ以外の場合は false。

### 関連項目

* struct [PointF](../../pointf/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(float, float, Graphics) {#isvisible_6}

指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion指定した using で描画した場合Graphics.

```csharp
public bool IsVisible(float x, float y, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Single | テストする点の x 座標。 |
| y | Single | テストするポイントの y 座標。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

指定されたポイントがこの範囲内に含まれている場合は trueRegion;それ以外の場合は false。

### 関連項目

* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(PointF, Graphics) {#isvisible_10}

指定されたPointF構造はこの中に含まれていますRegion 指定されたGraphics.

```csharp
public bool IsVisible(PointF point, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| point | PointF | のPointFテストする構造。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

真の場合*point*この中に含まれていますRegion;それ以外の場合は false。

### 関連項目

* struct [PointF](../../pointf/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float) {#isvisible_4}

指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion.

```csharp
public bool IsVisible(float x, float y, float width, float height)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Single | テストする四角形の左上隅の x 座標。 |
| y | Single | テストする四角形の左上隅の y 座標。 |
| width | Single | テストする四角形の幅。 |
| height | Single | テストする四角形の高さ。 |

### 戻り値

指定された長方形の一部が this 内に含まれている場合は trueRegion物体;それ以外の場合は false。

### 関連項目

* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF) {#isvisible_13}

指定されたRectangleF構造体は within this に含まれていますRegion.

```csharp
public bool IsVisible(RectangleF rect)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | RectangleF | のRectangleFテストする構造。 |

### 戻り値

のいずれかの部分の場合に true*rect*この中に含まれていますRegion; それ以外の場合は false。

### 関連項目

* struct [RectangleF](../../rectanglef/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(float, float, float, float, Graphics) {#isvisible_5}

指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion 指定されたGraphics.

```csharp
public bool IsVisible(float x, float y, float width, float height, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Single | テストする四角形の左上隅の x 座標。 |
| y | Single | テストする四角形の左上隅の y 座標。 |
| width | Single | テストする四角形の幅。 |
| height | Single | テストする四角形の高さ。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

指定された長方形の一部がこの中に含まれている場合は trueRegion; それ以外の場合は false。

### 関連項目

* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(RectangleF, Graphics) {#isvisible_14}

指定されたRectangleF構造体は within this に含まれていますRegion指定されたGraphics.

```csharp
public bool IsVisible(RectangleF rect, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | RectangleF | のRectangleFテストする構造。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

真の場合*rect*この中に含まれていますRegion; それ以外の場合は false。

### 関連項目

* struct [RectangleF](../../rectanglef/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(int, int, Graphics) {#isvisible_2}

指定したポイントがこの範囲内に含まれているかどうかをテストしますRegion指定された using 描画時のオブジェクトGraphicsobject.

```csharp
public bool IsVisible(int x, int y, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Int32 | テストする点の x 座標。 |
| y | Int32 | テストするポイントの y 座標。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

指定されたポイントがこの範囲内に含まれている場合は trueRegion;それ以外の場合は false。

### 関連項目

* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(Point) {#isvisible_7}

指定されたPoint構造はこの中に含まれていますRegion.

```csharp
public bool IsVisible(Point point)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| point | Point | のPointテストする構造。 |

### 戻り値

真の場合*point*この中に含まれていますRegion;それ以外の場合は false。

### 関連項目

* struct [Point](../../point/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(Point, Graphics) {#isvisible_8}

指定されたPoint構造はこの中に含まれていますRegion 指定されたGraphics.

```csharp
public bool IsVisible(Point point, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| point | Point | のPointテストする構造。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

真の場合*point*この中に含まれていますRegion;それ以外の場合は false。

### 関連項目

* struct [Point](../../point/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int) {#isvisible}

指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion.

```csharp
public bool IsVisible(int x, int y, int width, int height)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Int32 | テストする四角形の左上隅の x 座標。 |
| y | Int32 | テストする四角形の左上隅の y 座標。 |
| width | Int32 | テストする四角形の幅。 |
| height | Int32 | テストする四角形の高さ。 |

### 戻り値

指定された長方形の一部がこの中に含まれている場合は trueRegion; それ以外の場合は false。

### 関連項目

* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle) {#isvisible_11}

指定されたRectangle構造体は this に含まれていますRegion.

```csharp
public bool IsVisible(Rectangle rect)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Rectangle | のRectangleテストする構造。 |

### 戻り値

このメソッドは、*rect* within this に含まれていますRegion;それ以外の場合は false。

### 関連項目

* struct [Rectangle](../../rectangle/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(int, int, int, int, Graphics) {#isvisible_1}

指定された長方形の一部がこの中に含まれているかどうかをテストしますRegion指定されたGraphics.

```csharp
public bool IsVisible(int x, int y, int width, int height, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Int32 | テストする四角形の左上隅の x 座標。 |
| y | Int32 | テストする四角形の左上隅の y 座標。 |
| width | Int32 | テストする四角形の幅。 |
| height | Int32 | テストする四角形の高さ。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

指定された長方形の一部がこの中に含まれている場合は trueRegion; それ以外の場合は false。

### 関連項目

* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)

---

## IsVisible(Rectangle, Graphics) {#isvisible_12}

指定されたRectangle構造体は within this に含まれていますRegion指定されたGraphics.

```csharp
public bool IsVisible(Rectangle rect, Graphics g)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Rectangle | のRectangleテストする構造。 |
| g | Graphics | あGraphicsこれはグラフィック コンテキストを表します。 |

### 戻り値

のいずれかの部分の場合に true*rect* within this に含まれていますRegion;それ以外の場合は false。

### 関連項目

* struct [Rectangle](../../rectangle/)
* class [Graphics](../../graphics/)
* class [Region](../)
* 名前空間 [System.Drawing](../../region/)
* 組み立て [Aspose.Drawing](../../../)


