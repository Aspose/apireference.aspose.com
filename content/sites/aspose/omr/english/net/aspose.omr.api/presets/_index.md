---
title: Presets
second_title: Aspose.OMR for .NET API Reference
description: Provides shorthand commands for rapid generation and recognition of OMR forms with predefined design. This API enables form creation without needing to learn Aspose.OMR markup languages and form recognition without a pattern file. For advanced control over form design and recognition use OmrEngine./omrengine
type: docs
weight: 1000
url: /net/aspose.omr.api/presets/
---
## Presets class

Provides shorthand commands for rapid generation and recognition of OMR forms with predefined design. This API enables form creation without needing to learn Aspose.OMR markup languages and form recognition without a pattern file. For advanced control over form design and recognition, use [`OmrEngine`](../omrengine)

```csharp
public static class Presets
```

## Methods

| Name | Description |
| --- | --- |
| static [CreateBubbleSheet](../../aspose.omr.api/presets/createbubblesheet)(string, int, int, int, string, BubbleType, BubbleSize, GlobalPageSettings) | Generates a simple bubble sheet with an optional title. |
| static [CreateSurvey](../../aspose.omr.api/presets/createsurvey)(string, string, GlobalPageSettings, params ChoiceBoxConfig[]) | Combine questions into a simple survey. |
| static [CreateSurveyQuestion](../../aspose.omr.api/presets/createsurveyquestion)(string, params string[]) | Create a question with a variable number of answers. Used in !:CreateSurvey(string, GlobalPageSettings, ChoiceBoxConfig[]) |
| static [RecognizeBubbleSheet](../../aspose.omr.api/presets/recognizebubblesheet)(string, int, int, int, string, BubbleType, BubbleSize, GlobalPageSettings) | Recognize the bubble sheet generated with [`CreateBubbleSheet`](./createbubblesheet) method. To maintain consistency in form recognition, provide the same parameters as those in the [`CreateBubbleSheet`](./createbubblesheet) method. |
| static [RecognizeSurvey](../../aspose.omr.api/presets/recognizesurvey)(string, string, GlobalPageSettings, params ChoiceBoxConfig[]) | Recognize a survey generated with [`CreateSurvey`](./createsurvey) method. To maintain consistency in form recognition, provide the same parameters as those in the [`CreateSurvey`](./createsurvey) method. |

### See Also

* namespace [Aspose.OMR.Api](../../aspose.omr.api)
* assembly [Aspose.OMR](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
