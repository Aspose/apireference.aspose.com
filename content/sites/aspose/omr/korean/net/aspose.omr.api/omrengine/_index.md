---
title: Class OmrEngine
second_title: .NET API 참조용 Aspose.OMR
description: Aspose.OMR.Api.OmrEngine 수업. OMR 엔진. 템플릿 및 이미지 처리 클래스와 GUI 구성 요소 생성을 처리합니다.
type: docs
weight: 20
url: /ko/net/aspose.omr.api/omrengine/
---
## OmrEngine class

OMR 엔진. 템플릿 및 이미지 처리 클래스와 GUI 구성 요소 생성을 처리합니다.

```csharp
public class OmrEngine
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [OmrEngine](omrengine/)() | 기본 생성자입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | .json markup 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다. |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | JSON 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | 텍스트 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | 마크업 lines 의 배열을 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다. |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | MemoryStream 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다. |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | 텍스트 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | 텍스트 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성 |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | 마크업 lines 의 배열을 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다. |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | Template object 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다. |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | MemoryStream 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다. |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | 생성[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) GUI를 사용하여 OMR API로 작업할 수 있는 인스턴스. 소요[`TemplateProcessor`](../templateprocessor/) 매개변수로 지정되며 지정된 template 를 사용하여 생성된 이미지에서만 작동합니다. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | 생성[`TemplateProcessor`](../templateprocessor/) 지정된 template. 작업을 허용하는 인스턴스 |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | 생성[`TemplateProcessor`](../templateprocessor/) 지정된 template. 작업을 허용하는 인스턴스 |

### 예

```csharp
// 템플릿 프로세서 가져오기
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// 보정 GUI 제어를 얻습니다.
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// 템플릿 생성
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### 또한보십시오

* 네임스페이스 [Aspose.OMR.Api](../../aspose.omr.api/)
* 집회 [Aspose.OMR](../../)


