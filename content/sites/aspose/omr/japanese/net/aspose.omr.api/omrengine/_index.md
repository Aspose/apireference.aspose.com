---
title: Class OmrEngine
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.Api.OmrEngine クラス. OMR エンジン. テンプレートおよび画像処理クラスと GUI コンポーネントの作成を処理します.
type: docs
weight: 20
url: /ja/net/aspose.omr.api/omrengine/
---
## OmrEngine class

OMR エンジン. テンプレートおよび画像処理クラスと GUI コンポーネントの作成を処理します.

```csharp
public class OmrEngine
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [OmrEngine](omrengine/)() | デフォルトのコンストラクター。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | .json マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | JSON マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | テキスト マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | マークアップ行の配列に基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | テンプレート (.omr) とテンプレート イメージを MemoryStream に基づいて作成します。 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | テキスト マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | テキスト マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | マークアップ行の配列に基づいてテンプレート (.omr) とテンプレート イメージを作成します |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | テンプレート object に基づいてテンプレート (.omr) とテンプレート イメージを作成します。 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | テンプレート (.omr) とテンプレート イメージを MemoryStream に基づいて作成します。 |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | を作成します[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/)GUI を使用して OMR API を操作できるインスタンス。 [`TemplateProcessor`](../templateprocessor/)パラメータとして指定され、指定された template を使用して作成された画像でのみ機能します |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | を作成します[`TemplateProcessor`](../templateprocessor/)指定されたテンプレートを使用できるインスタンス. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | を作成します[`TemplateProcessor`](../templateprocessor/)指定されたテンプレートを使用できるインスタンス. |

### 例

```csharp
// テンプレート プロセッサを取得します
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// 修正 GUI コントロールを取得
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// テンプレートを生成
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### 関連項目

* 名前空間 [Aspose.OMR.Api](../../aspose.omr.api/)
* 組み立て [Aspose.OMR](../../)


