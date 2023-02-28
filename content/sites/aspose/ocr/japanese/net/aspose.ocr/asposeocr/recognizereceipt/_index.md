---
title: AsposeOcr.RecognizeReceipt
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 画像上のテキストを認識します.
type: docs
weight: 230
url: /ja/net/aspose.ocr/asposeocr/recognizereceipt/
---
## RecognizeReceipt(string, ReceiptRecognitionSettings) {#recognizereceipt_1}

画像上のテキストを認識します.

```csharp
public RecognitionResult RecognizeReceipt(string fullPath, 
    ReceiptRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| settings | ReceiptRecognitionSettings | 認識設定[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeReceipt(MemoryStream, ReceiptRecognitionSettings) {#recognizereceipt}

画像上のテキストを認識します.

```csharp
public RecognitionResult RecognizeReceipt(MemoryStream stream, 
    ReceiptRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | レシート イメージを含むメモリ ストリーム。 |
| settings | ReceiptRecognitionSettings | 認識設定[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


