---
title: AsposeOcr.SaveMultipageDocument
second_title: Aspose.OCR for .NET API リファレンス
description: AsposeOcr 方法. RecognitionResult オブジェクトのリストから複数ページのドキュメントを取得できます
type: docs
weight: 250
url: /ja/net/aspose.ocr/asposeocr/savemultipagedocument/
---
## SaveMultipageDocument(string, SaveFormat, List&lt;RecognitionResult&gt;) {#savemultipagedocument_1}

RecognitionResult オブジェクトのリストから複数ページのドキュメントを取得できます

```csharp
public static void SaveMultipageDocument(string fullFileName, SaveFormat saveFormat, 
    List<RecognitionResult> results)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| fullFileName | String | 認識結果を選択した形式で保存するためのパスを含むファイル名。 |
| saveFormat | SaveFormat | ドキュメント形式 (Docx、Txt、Pdf)。 |
| results | List`1 | 一覧[`RecognitionResult`](../../recognitionresult/)オブジェクト。 |

### 関連項目

* enum [SaveFormat](../../saveformat/)
* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)

---

## SaveMultipageDocument(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) {#savemultipagedocument}

RecognitionResult オブジェクトのリストから複数ページのドキュメントを取得できます

```csharp
public static void SaveMultipageDocument(MemoryStream stream, SaveFormat saveFormat, 
    List<RecognitionResult> results)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | 認識結果を選択した形式で保存するための MemoryStream。 |
| saveFormat | SaveFormat | ドキュメント形式 (Docx、Txt、Pdf)。 |
| results | List`1 | 一覧[`RecognitionResult`](../../recognitionresult/)オブジェクト。 |

### 関連項目

* enum [SaveFormat](../../saveformat/)
* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* 名前空間 [Aspose.OCR](../../asposeocr/)
* 組み立て [Aspose.OCR](../../../)


