---
title: TemplateProcessor.RecognizeImage
second_title: Aspose.OMR for .NET API リファレンス
description: TemplateProcessor 方法. 画像認識
type: docs
weight: 30
url: /ja/net/aspose.omr.api/templateprocessor/recognizeimage/
---
## RecognizeImage(string, int) {#recognizeimage_1}

画像認識

```csharp
public RecognitionResult RecognizeImage(string imagePath, int recognitionThreshold = -100)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| imagePath | String | 認識する画像へのパス |
| recognitionThreshold | Int32 | (オプション) 範囲内の認識しきい値 (0..100)。 しきい値を超えて塗りつぶされた要素のみが塗りつぶされたものとしてカウントされます。 |

### 戻り値

認識結果

### 関連項目

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* 名前空間 [Aspose.OMR.Api](../../templateprocessor/)
* 組み立て [Aspose.OMR](../../../)

---

## RecognizeImage(MemoryStream, int) {#recognizeimage}

メモリストリームから画像認識中

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, int recognitionThreshold = -100)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | イメージのメモリ ストリーム。 |
| recognitionThreshold | Int32 | (オプション) 範囲内の認識しきい値 (0..100)。 しきい値を超えて塗りつぶされた要素のみが塗りつぶされたものとしてカウントされます。 |

### 戻り値

認識結果

### 関連項目

* class [RecognitionResult](../../../aspose.omr.model/recognitionresult/)
* class [TemplateProcessor](../)
* 名前空間 [Aspose.OMR.Api](../../templateprocessor/)
* 組み立て [Aspose.OMR](../../../)


