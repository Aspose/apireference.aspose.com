---
title: AsposeOcr.RecognizeInvoice
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. 請求書画像のテキストを認識します
type: docs
weight: 180
url: /ja/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

請求書画像のテキストを認識します。

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| settings | InvoiceRecognitionSettings | 認識設定[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

請求書画像のテキストを認識します。

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | レシート イメージを含むメモリ ストリーム。 |
| settings | InvoiceRecognitionSettings | 認識設定[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


