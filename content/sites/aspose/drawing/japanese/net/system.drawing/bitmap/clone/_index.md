---
title: Bitmap.Clone
second_title: Aspose.Drawing for .NET API リファレンス
description: Bitmap 方法. このセクションのコピーを作成しますBitmapによって定義されますRectanglestructure および指定されたPixelFormat列挙.
type: docs
weight: 100
url: /ja/net/system.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

このセクションのコピーを作成しますBitmapによって定義されますRectanglestructure および指定されたPixelFormat列挙.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Rectangle | この部分を定義しますBitmapto copy. 座標はこれを基準にしていますBitmap. |
| format | PixelFormat | を指定しますPixelFormatthe 宛先の列挙Bitmap. |

### 戻り値

新しいBitmapこのメソッドが作成するもの。

### 関連項目

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

このセクションのコピーを作成しますBitmap指定されたPixelFormat列挙.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | RectangleF | この部分を定義しますBitmapコピーする。 |
| format | PixelFormat | を指定しますPixelFormat宛先の列挙Bitmap. |

### 戻り値

のBitmapこのメソッドが作成するもの。

### 例外

| 例外 | 調子 |
| --- | --- |
| OutOfMemoryException | *rect*ソース ビットマップの範囲外です。 |
| ArgumentException | 高さまたは幅*rect*は 0 です。 |

### 関連項目

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)


