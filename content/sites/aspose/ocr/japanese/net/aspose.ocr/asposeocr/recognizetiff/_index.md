---
title: AsposeOcr.RecognizeTiff
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 複数ページの TIFF 画像からテキストを認識します  指定できるTIFFファイルを認識DocumentRecognitionSettings. TIFF TIF のみをサポートします他の画像タイプはサポートしていません.
type: docs
weight: 240
url: /ja/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

複数ページの TIFF 画像からテキストを認識します。  指定できるTIFFファイルを認識[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). TIFF (TIF) のみをサポートします。他の画像タイプはサポートしていません.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのフルパス。 |
| settings | DocumentRecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を含むオブジェクトのリスト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

複数ページの TIFF 画像からテキストを認識します。  指定できるTIFFファイルを認識[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). TIFF (TIF) のみをサポートします。他の画像タイプはサポートしていません.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | TIFF ファイルを含むメモリ ストリーム。 |
| settings | DocumentRecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を含むオブジェクトのリスト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


