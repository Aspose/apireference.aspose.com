---
title: AsposeOcr.RecognizePassport
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. パスポートのテキストを認識します
type: docs
weight: 210
url: /ja/net/aspose.ocr/asposeocr/recognizepassport/
---
## RecognizePassport(string, PassportRecognitionSettings) {#recognizepassport_1}

パスポートのテキストを認識します。

```csharp
public RecognitionResult RecognizePassport(string fullPath, 
    PassportRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| settings | PassportRecognitionSettings | 認識設定[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`PassportRecognitionSettings`](../../passportrecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizePassport(MemoryStream, PassportRecognitionSettings) {#recognizepassport}

パスポートのテキストを認識します。

```csharp
public RecognitionResult RecognizePassport(MemoryStream stream, 
    PassportRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | レシート イメージを含むメモリ ストリーム。 |
| settings | PassportRecognitionSettings | 認識設定[`PassportRecognitionSettings`](../../passportrecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`PassportRecognitionSettings`](../../passportrecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [PassportRecognitionSettings](../../passportrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


