---
title: Class TemplateProcessor
second_title: .NET API 참조용 Aspose.OMR
description: Aspose.OMR.Api.TemplateProcessor 수업. 템플릿 및 이미지 처리 클래스.  이 클래스의 각 인스턴스는 단일 OMR 템플릿으로 작동합니다. 생성자에 지정된 템플릿의 이미지를 인식할 수 있습니다.
type: docs
weight: 30
url: /ko/net/aspose.omr.api/templateprocessor/
---
## TemplateProcessor class

템플릿 및 이미지 처리 클래스.  이 클래스의 각 인스턴스는 단일 OMR 템플릿으로 작동합니다. 생성자에 지정된 템플릿의 이미지를 인식할 수 있습니다.

```csharp
public class TemplateProcessor
```

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Recalculate](../../aspose.omr.api/templateprocessor/recalculate/)(RecognitionResult, int) | 미세 조정된 매개변수를 사용하여 인식 결과를 업데이트합니다. |
| [RecognizeFolder](../../aspose.omr.api/templateprocessor/recognizefolder/)(string, int) | folder 에서 이미지를 인식합니다. |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage)(MemoryStream, int) | 메모리 stream 에서 이미지 인식 중 |
| [RecognizeImage](../../aspose.omr.api/templateprocessor/recognizeimage/#recognizeimage_1)(string, int) | 이미지 인식 |
| [RecognizeMultiPageTemplate](../../aspose.omr.api/templateprocessor/recognizemultipagetemplate/)(string[], int) | 다중 페이지 템플릿 인식 |

### 예

```csharp
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
RecognitionResult result = templateProcessor.RecognizeImage(imagePath);
string csvResult = result.GetCsv();
```

### 또한보십시오

* 네임스페이스 [Aspose.OMR.Api](../../aspose.omr.api/)
* 집회 [Aspose.OMR](../../)


