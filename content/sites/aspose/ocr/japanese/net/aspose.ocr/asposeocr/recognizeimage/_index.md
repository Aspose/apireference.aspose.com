---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 画像上のテキストを認識します.
type: docs
weight: 140
url: /ja/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

画像上のテキストを認識します.

```csharp
public string RecognizeImage(string fullPath)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |

### 戻り値

認識されたテキスト。

### 備考

自動画像スキュー補正とテキスト領域検出を使用します。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

画像上のテキストを認識します.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`RecognitionSettings`](../../recognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

画像上のテキストを認識します.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | イメージを含むメモリ ストリーム。 |

### 戻り値

認識されたテキスト。

### 備考

自動画像スキュー補正とテキスト領域検出を使用します。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

画像上のテキストを認識します.  指定可能画像認識[`RecognitionSettings`](../../recognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | イメージを含むメモリ ストリーム。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

画像上のテキストを認識します.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| imageData | Byte[] | バイト配列のデコードされたイメージ。 bitsPerPixel &gt; 1 に対して RGB 照明技術を使用します。 |
| width | Int32 | 画像の幅。 |
| height | Int32 | 画像の高さ。 |
| pixelFormat | PixelType | バイト、rgb、bgr、rgba をサポートします。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`RecognitionSettings`](../../recognitionsettings/) . 行デコードされたバイトデータをサポートします.

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

画像上のテキストを認識します.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| imageData | Color[] | Aspose.Drawing.Color 配列のデコードされた画像。 |
| width | Int32 | 画像の幅。 |
| height | Int32 | 画像の高さ。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`RecognitionSettings`](../../recognitionsettings/) . 行デコードされたバイトデータをサポートします.

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


