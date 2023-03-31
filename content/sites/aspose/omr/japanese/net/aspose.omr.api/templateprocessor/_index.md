---
title: Class TemplateProcessor
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.Api.TemplateProcessor クラス. テンプレートと画像を処理するためのクラス  このクラスの各インスタンスは単一の OMR テンプレートで動作します コンストラクタで指定されたテンプレートのイメージを認識できます
type: docs
weight: 30
url: /ja/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

テンプレートと画像を処理するためのクラス。  このクラスの各インスタンスは、単一の OMR テンプレートで動作します。 コンストラクタで指定されたテンプレートのイメージを認識できます。

```csharp
public class TemplateProcessor
```

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | 微調整されたパラメーターを使用して認識結果を更新します。 |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | folder から画像を認識します |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | メモリストリームから画像認識中 |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | 画像認識 |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | 複数ページのテンプレートを認識します |

### 例

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### 関連項目

* 名前空間 [Aspose.OMR.Api](../../aspose.omr.api/)
* 組み立て [Aspose.OMR](../../)


