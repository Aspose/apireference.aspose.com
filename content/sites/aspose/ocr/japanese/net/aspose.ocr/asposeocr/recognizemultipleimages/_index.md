---
title: AsposeOcr.RecognizeMultipleImages
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. リストから複数の画像を認識します.  アーカイブとフォルダはサポートされていません. 処理される画像の最大量は 20 です. GIFPNGJPEGBMPTIFFJFIF をサポートしています.
type: docs
weight: 200
url: /ja/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

リストから複数の画像を認識します.  アーカイブとフォルダはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートしています.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| files | List`1 | 画像へのフル パス。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

の配列[`RecognitionResult`](../../recognitionresult/)処理された各画像の認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

デフォルト設定でリストから複数の画像を認識します.  アーカイブとフォルダはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートしています.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| files | List`1 | 画像へのフル パス。 |

### 戻り値

の配列[`RecognitionResult`](../../recognitionresult/)処理された各画像の認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

ZIP アーカイブまたはフォルダーから圧縮された複数の画像を認識します。  ネストされたアーカイブとフォルダーはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | zip アーカイブ (.zip 拡張子を含む) または画像を含むフォルダーへのフル パス。 |
| settings | RecognitionSettings | 認識設定。 |

### 戻り値

の配列[`RecognitionResult`](../../recognitionresult/)処理された各画像の認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

ZIP アーカイブまたはデフォルト設定のフォルダーから圧縮された複数の画像を認識します。  ネストされたアーカイブとフォルダーはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | zip アーカイブ (.zip 拡張子を含む) または画像を含むフォルダーへのフル パス。 |

### 戻り値

の配列[`RecognitionResult`](../../recognitionresult/)処理された各画像の認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


