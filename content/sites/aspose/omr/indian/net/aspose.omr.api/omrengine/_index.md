---
title: Class OmrEngine
second_title: .NET API संदर्भ के लिए Aspose.OMR
description: Aspose.OMR.Api.OmrEngine कक्ष. OMR इंजन. टेम्प्लेट और इमेज प्रसेसंग क्लसेस और GUI घटकं के नर्मण क संभलत है
type: docs
weight: 20
url: /hi/net/aspose.omr.api/omrengine/
---
## OmrEngine class

OMR इंजन. टेम्प्लेट और इमेज प्रोसेसिंग क्लासेस और GUI घटकों के निर्माण को संभालता है।

```csharp
public class OmrEngine
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [OmrEngine](omrengine/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [GenerateJSONTemplate](../../aspose.omr.api/omrengine/generatejsontemplate/)(string, GlobalPageSettings, Encoding) | .json markup के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है |
| [GenerateJSONTemplateFromString](../../aspose.omr.api/omrengine/generatejsontemplatefromstring/)(string, GlobalPageSettings, ImageCollection) | JSON मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_5)(string, Encoding) | टेक्स्ट मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_6)(string[], ImageCollection) | मार्कअप लाइन की एक सरणी के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_1)(MemoryStream, ImageCollection, Encoding) | मेमोरीस्ट्रीम के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_3)(string, GlobalPageSettings, Encoding) | टेक्स्ट मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_4)(string, string[], Encoding) | टेक्स्ट मार्कअप के आधार पर एक टेम्प्लेट (.omr) और टेम्प्लेट इमेज बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_7)(string[], GlobalPageSettings, ImageCollection) | मार्कअप लाइन की एक सरणी के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate)(TemplateConfig, GlobalPageSettings, ImageCollection) | टेम्पलेट ऑब्जेक्ट के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है |
| [GenerateTemplate](../../aspose.omr.api/omrengine/generatetemplate/#generatetemplate_2)(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) | मेमोरीस्ट्रीम के आधार पर एक टेम्पलेट (.omr) और टेम्पलेट छवि बनाता है |
| [GetCorrectionControl](../../aspose.omr.api/omrengine/getcorrectioncontrol/)(TemplateProcessor) | बनाता है[`CorrectionControl`](../../aspose.omr.correctionui/correctioncontrol/) उदाहरण जो GUI. का उपयोग करके ओएमआर एपीआई के साथ काम करने की अनुमति देता है[`TemplateProcessor`](../templateprocessor/) एक पैरामीटर के रूप में और केवल निर्दिष्ट Template का उपयोग करके बनाई गई छवियों के साथ काम करता है |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor_1)(string) | बनाता है[`TemplateProcessor`](../templateprocessor/) उदाहरण जो निर्दिष्ट टेम्पलेट के साथ काम करने की अनुमति देता है. |
| [GetTemplateProcessor](../../aspose.omr.api/omrengine/gettemplateprocessor/#gettemplateprocessor)(MemoryStream, Encoding) | बनाता है[`TemplateProcessor`](../templateprocessor/) उदाहरण जो निर्दिष्ट टेम्पलेट के साथ काम करने की अनुमति देता है. |

### उदाहरण

```csharp
// टेम्पलेट प्रोसेसर प्राप्त करें
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
```

```csharp
// सुधार जीयूआई नियंत्रण प्राप्त करें
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.GetTemplateProcessor(templatePath);
CorrectionControl control = engine.GetCorrectionControl(templateProcessor);
```

```csharp
// टेम्प्लेट जनरेट करें
OmrEngine engine = new OmrEngine();
GenerationResult result = engine.GenerateTemplate(markupPath);
if(result.ErrorCode == 0)
{
    result.Save(folderPath, templateName);
}
```

### यह सभी देखें

* नाम स्थान [Aspose.OMR.Api](../../aspose.omr.api/)
* सभा [Aspose.OMR](../../)


