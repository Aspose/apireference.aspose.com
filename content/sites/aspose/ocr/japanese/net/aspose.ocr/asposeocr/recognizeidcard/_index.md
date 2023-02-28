---
title: AsposeOcr.RecognizeIDCard
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. ID カードのテキストを認識します
type: docs
weight: 130
url: /ja/net/aspose.ocr/asposeocr/recognizeidcard/
---
## RecognizeIDCard(string, IDCardRecognitionSettings) {#recognizeidcard_1}

ID カードのテキストを認識します。

```csharp
public RecognitionResult RecognizeIDCard(string fullPath, IDCardRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullPath | String | 画像へのパス。 |
| settings | IDCardRecognitionSettings | 認識設定[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## RecognizeIDCard(MemoryStream, IDCardRecognitionSettings) {#recognizeidcard}

ID カードのテキストを認識します。

```csharp
public RecognitionResult RecognizeIDCard(MemoryStream stream, 
    IDCardRecognitionSettings settings = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | レシート イメージを含むメモリ ストリーム。 |
| settings | IDCardRecognitionSettings | 認識設定[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). |

### 戻り値

の[`RecognitionResult`](../../recognitionresult/)画像認識結果を持つオブジェクト。

### 備考

指定可能画像認識[`IDCardRecognitionSettings`](../../idcardrecognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。

### 関連項目

* class [RecognitionResult](../../recognitionresult/)
* class [IDCardRecognitionSettings](../../idcardrecognitionsettings/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


