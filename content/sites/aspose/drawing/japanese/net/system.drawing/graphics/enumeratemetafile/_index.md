---
title: Graphics.EnumerateMetafile
second_title: Aspose.Drawing for .NET API リファレンス
description: Graphics 方法. 指定されたMetafileを一度に 1 つずつコールバック method に送信し指定した画像属性を使用して指定したポイントに表示します
type: docs
weight: 460
url: /ja/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつコールバック method に送信し、指定した画像属性を使用して指定したポイントに表示します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | PointF | [`PointF`](../../pointf/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | PointF | [`PointF`](../../pointf/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | PointF[] | 3 つの配列[`PointF`](../../pointf/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | Point | [`Point`](../../point/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | Point | [`Point`](../../point/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)、一度に 1 つずつ、指定された画像属性を使用して指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | Point | [`Point`](../../point/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

指定されたレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

指定されたレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

指定されたレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

指定されたレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | PointF | [`PointF`](../../pointf/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | PointF[] | 3 つの配列[`PointF`](../../pointf/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | Point[] | 3 つの配列[`Point`](../../point/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | Point[] | 3 つの配列[`Point`](../../point/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | Point[] | 3 つの配列[`Point`](../../point/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| unit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | Point[] | 3 つの配列[`Point`](../../point/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | Point[] | 3 つの配列[`Point`](../../point/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | PointF[] | 3 つの配列[`PointF`](../../pointf/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| unit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | PointF[] | 3 つの配列[`PointF`](../../pointf/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

S から選択された長方形のレコードを送信します。[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | PointF[] | 3 つの配列[`PointF`](../../pointf/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| unit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | PointF[] | 3 つの配列[`PointF`](../../pointf/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| unit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)、一度に 1 つずつ、指定された画像属性を使用して指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | Point | [`Point`](../../point/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| unit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | Point | [`Point`](../../point/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | Point | [`Point`](../../point/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

指定されたレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | Rectangle | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)、一度に 1 つずつ、指定された画像属性を使用して指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | PointF | [`PointF`](../../pointf/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| unit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | PointF | [`PointF`](../../pointf/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/) 、一度に 1 つずつ、指定されたポイントで表示するためのコールバック メソッドに送信します。

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoint | PointF | [`PointF`](../../pointf/)描画されるメタファイルの左上隅の位置を指定する構造体。 |
| srcRect | RectangleF | System.Drawing.RectangleF 構造体。メタファイルの左上隅を基準にして描画する部分を指定します。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

指定された[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された平行四辺形で表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destPoints | Point[] | 3 つの配列[`Point`](../../point/)描画されるメタファイルのサイズと場所を決定する平行四辺形を定義する構造。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

から選択された長方形のレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定された四角形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/)メタファイルの左上隅を基準にして描画する部分を指定する構造体。 |
| srcUnit | GraphicsUnit | のメンバー[`GraphicsUnit`](../../graphicsunit/)によって指定された四角形がメタファイルの部分を決定するために使用される測定単位を指定する列挙*srcRect*パラメータが含まれています。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

指定されたレコードを送信します[`Metafile`](../../../system.drawing.imaging/metafile/)を一度に 1 つずつ、指定されたイメージ属性を使用して指定された長方形に表示するためのコールバック メソッドに渡します。

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/)列挙する。 |
| destRect | Rectangle | [`Rectangle`](../../rectangle/)描画されるメタファイルの場所とサイズを指定する構造体。 |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/)メタファイル レコードの送信先メソッドを指定するデリゲート。 |
| callbackData | IntPtr | 必須だが無視される内部ポインター。合格できますZeroこのパラメータのために。 |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/)描画された画像の画像属性情報を指定します。 |

### 関連項目

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* 名前空間 [System.Drawing](../../graphics/)
* 組み立て [Aspose.Drawing](../../../)


