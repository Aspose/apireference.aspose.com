---
title: AsposeOcr.RecognizeDjvu
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 複数ページの DJVU 画像からテキストを認識します  DJVUファイルを認識して指定可能DocumentRecognitionSettings. DJVU のみをサポートします他の画像タイプはサポートしていません.
type: docs
weight: 120
url: /ja/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

複数ページの DJVU 画像からテキストを認識します。  DJVUファイルを認識して指定可能[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). DJVU のみをサポートします。他の画像タイプはサポートしていません.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

複数ページの DJVU 画像からテキストを認識します。  DJVUファイルを認識して指定可能[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). DJVU のみをサポートします。他の画像タイプはサポートしていません.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | DJVU ファイルを含むメモリ ストリーム。 |
| settings | DocumentRecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を含むオブジェクトのリスト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


