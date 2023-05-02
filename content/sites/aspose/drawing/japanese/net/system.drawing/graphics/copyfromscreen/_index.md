---
title: Graphics.CopyFromScreen
second_title: Aspose.Drawing for .NET API リファレンス
description: Graphics 方法. ピクセルの四角形に対応するカラー データのビット ブロック転送を画面からデバイスの描画面に実行しますGraphics.
type: docs
weight: 240
url: /ja/net/system.drawing/graphics/copyfromscreen/
---
## CopyFromScreen(Point, Point, Size) {#copyfromscreen_1}

ピクセルの四角形に対応するカラー データのビット ブロック転送を、画面からデバイスの描画面に実行します。Graphics.

```csharp
public void CopyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| upperLeftSource | Point | ソース四角形の左上隅の点。 |
| upperLeftDestination | Point | コピー先の四角形の左上隅のポイント。 |
| blockRegionSize | Size | 転送する領域のサイズ。 |

### 関連項目

* struct [Point](../../point/)
* struct [Size](../../size/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## CopyFromScreen(int, int, int, int, Size, CopyPixelOperation) {#copyfromscreen}

ピクセルの四角形に対応するカラー データのビット ブロック転送を、画面からデバイスの描画面に実行します。Graphics.

```csharp
public void CopyFromScreen(int sourceX, int sourceY, int destinationX, int destinationY, 
    Size blockRegionSize, CopyPixelOperation copyPixelOperation)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| sourceX | Int32 | ソース四角形の左上隅のポイントの x 座標。 |
| sourceY | Int32 | ソース四角形の左上隅のポイントの y 座標。 |
| destinationX | Int32 | コピー先の四角形の左上隅にあるポイントの x 座標。 |
| destinationY | Int32 | コピー先の四角形の左上隅にあるポイントの y 座標。 |
| blockRegionSize | Size | 転送する領域のサイズ。 |
| copyPixelOperation | CopyPixelOperation | 一つ[`CopyPixelOperation`](../../copypixeloperation/)値。 |

### 関連項目

* struct [Size](../../size/)
* enum [CopyPixelOperation](../../copypixeloperation/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## CopyFromScreen(Point, Point, Size, CopyPixelOperation) {#copyfromscreen_2}

ピクセルの四角形に対応するカラー データのビット ブロック転送を、画面からデバイスの描画面に実行します。Graphics.

```csharp
public void CopyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize, 
    CopyPixelOperation copyPixelOperation)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| upperLeftSource | Point | ソース四角形の左上隅の点。 |
| upperLeftDestination | Point | コピー先の四角形の左上隅のポイント。 |
| blockRegionSize | Size | 転送する領域のサイズ.. |
| copyPixelOperation | CopyPixelOperation | のね[`CopyPixelOperation`](../../copypixeloperation/)値。 |

### 関連項目

* struct [Point](../../point/)
* struct [Size](../../size/)
* enum [CopyPixelOperation](../../copypixeloperation/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)


