---
title: Bitmap.Bitmap
second_title: Aspose.Drawing for .NET API リファレンス
description: Bitmap コンストラクタ. の新しいインスタンスを初期化しますBitmap指定されたサイズのクラス.
type: docs
weight: 10
url: /ja/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたサイズのクラス.

```csharp
public Bitmap(int width, int height)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| width | Int32 | 新しい Bitmap の幅 (ピクセル単位)。 |
| height | Int32 | 新しい Bitmap の高さ (ピクセル単位)。 |

### 備考

現時点でサポートされている唯一の内部ビットマップ形式は、`PixelFormat.Format32bppPArgb`.

### 関連項目

* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたファイルのクラス.

```csharp
public Bitmap(string filename)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filename | String | ビットマップ ファイルの名前。 |

### 関連項目

* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたファイルのクラス.

```csharp
public Bitmap(string filename, bool useIcm)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filename | String | ビットマップ ファイルの名前。 |
| useIcm | Boolean | これに色補正を使用する場合は trueBitmap;それ以外の場合は false。 |

### 関連項目

* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたデータストリームからのクラス.

```csharp
public Bitmap(Stream stream)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | Stream | 画像の読み込みに使用されるデータ ストリーム。 |

### 関連項目

* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたデータストリームからのクラス.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | Stream | 画像の読み込みに使用されるデータ ストリーム。 |
| useIcm | Boolean | `真実`これに色補正を使用するにはBitmap;さもないと、`間違い`. |

### 関連項目

* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたサイズとフォーマットのクラス.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| width | Int32 | 新しい画像の幅 (ピクセル単位)Bitmap. |
| height | Int32 | 新しいオブジェクトの高さ (ピクセル単位)Bitmap. |
| format | PixelFormat | のPixelFormat new の列挙Bitmap. |

### 関連項目

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

の新しいインスタンスを初期化します[`Bitmap`](../)指定されたサイズとピクセル データを持つクラス.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| width | Int32 | 新しい画像の幅 (ピクセル単位)Bitmap. |
| height | Int32 | 新しいオブジェクトの高さ (ピクセル単位)Bitmap. |
| stride | Int32 | 1 つのスキャン ラインの先頭と次のスキャン ラインの間のバイト オフセットは、4 の倍数である必要があります。 |
| format | PixelFormat | のPixelFormat new の列挙Bitmap. |
| data | Int32[] | ピクセルデータ。 |

### 関連項目

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

の新しいインスタンスを初期化します[`Bitmap`](../)指定された既存のイメージからのクラス.

```csharp
public Bitmap(Image original)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| original | Image | のImageそこから新しいものを作成するBitmap. |

### 関連項目

* class [Image](../../image/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

の新しいインスタンスを初期化します[`Bitmap`](../)指定された既存のイメージのクラス。指定されたサイズにスケーリングされます。

```csharp
public Bitmap(Image original, Size newSize)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| original | Image | のImageそこから新しいものを作成するBitmap |
| newSize | Size | のSize新しいサイズを表す構造Bitmap. |

### 関連項目

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

の新しいインスタンスを初期化します[`Bitmap`](../)指定された既存のイメージのクラス、 が指定されたサイズにスケーリングされます。

```csharp
public Bitmap(Image original, int width, int height)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| original | Image | のImageそこから新しいものを作成するBitmap. |
| width | Int32 | 新しい画像の幅 (ピクセル単位)Bitmap. |
| height | Int32 | 新しいオブジェクトの高さ (ピクセル単位)Bitmap. |

### 関連項目

* class [Image](../../image/)
* class [Bitmap](../)
* 名前空間 [System.Drawing](../../bitmap/)
* 組み立て [Aspose.Drawing](../../../)


