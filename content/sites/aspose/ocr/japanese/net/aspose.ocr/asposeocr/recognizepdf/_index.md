---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. スキャンした PDF からテキストを認識します 画像を抽出します.  指定機能でpdfファイルを認識DocumentRecognitionSettings. スキャンした PDF のみをサポートしますサーチャブル PDF をサポートしていません
type: docs
weight: 220
url: /ja/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

スキャンした PDF からテキストを認識します (画像を抽出します).  指定機能でpdfファイルを認識[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). スキャンした PDF のみをサポートします。サーチャブル PDF をサポートしていません。

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのフルパス。 |
| settings | DocumentRecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

スキャンした PDF からテキストを認識します (画像を抽出します).  指定機能でpdfファイルを認識[`RecognitionSettings`](../../recognitionsettings/). スキャンした PDF のみをサポートします。サーチャブル PDF をサポートしていません。

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | PDF ファイルを使用したメモリ ストリーム。 |
| settings | DocumentRecognitionSettings | 認識設定。 |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


