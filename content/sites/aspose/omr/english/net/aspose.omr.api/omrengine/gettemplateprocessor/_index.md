---
title: GetTemplateProcessor
second_title: Aspose.OMR for .NET API Reference
description: Creates the TemplateProcessoraspose.omr.api/templateprocessor instance that allows working with specified template.
type: docs
weight: 50
url: /net/aspose.omr.api/omrengine/gettemplateprocessor/
---
## GetTemplateProcessor(MemoryStream, Encoding, FormValidationLogic) {#gettemplateprocessor}

Creates the [`TemplateProcessor`](../../templateprocessor) instance that allows working with specified template.

```csharp
public TemplateProcessor GetTemplateProcessor(MemoryStream templateContent, Encoding textEncoding, 
    FormValidationLogic logic = FormValidationLogic.Ignore)
```

| Parameter | Type | Description |
| --- | --- | --- |
| templateContent | MemoryStream | Memory stream with template text content |
| textEncoding | Encoding | Template content encoding |
| logic | FormValidationLogic | Enum that controls behavior in case one of template validation rule is broken |

### Return Value

The [`TemplateProcessor`](../../templateprocessor) instance

### See Also

* class [TemplateProcessor](../../templateprocessor)
* enum [FormValidationLogic](../../../aspose.omr.recognition.enums/formvalidationlogic)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

---

## GetTemplateProcessor(string, FormValidationLogic) {#gettemplateprocessor_1}

Creates the [`TemplateProcessor`](../../templateprocessor) instance that allows working with specified template.

```csharp
public TemplateProcessor GetTemplateProcessor(string templatePath, 
    FormValidationLogic logic = FormValidationLogic.Ignore)
```

| Parameter | Type | Description |
| --- | --- | --- |
| templatePath | String | The path to the OMR template file |
| logic | FormValidationLogic | Enum that controls behavior in case one of template validation rule is broken |

### Return Value

The [`TemplateProcessor`](../../templateprocessor) instance

### See Also

* class [TemplateProcessor](../../templateprocessor)
* enum [FormValidationLogic](../../../aspose.omr.recognition.enums/formvalidationlogic)
* class [OmrEngine](../../omrengine)
* namespace [Aspose.OMR.Api](../../omrengine)
* assembly [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
