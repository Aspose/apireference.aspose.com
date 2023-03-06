---
title: Class LabelingRule
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Rendering.Labelings.LabelingRule कक्ष. उपयगकर्त द्वर परभषत नयमRuleBasedLabeling .
type: docs
weight: 1630
url: /hi/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

उपयोगकर्ता द्वारा परिभाषित नियम[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | निर्धारित करता है कि "फ़िल्टर-नियम" को सुविधा पर लेबलिंग लागू करनी चाहिए या नहीं. यदि वापस आता है`true` लेबलिंग का उपयोग किया जाता है; अन्यथा, सुविधा छोड़ दी गई है. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | एक मान प्राप्त करता है जो बताता है कि यह नियम "अन्य-नियम" है या नहीं। |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | एक मान प्राप्त करता है जो बताता है कि यह नियम "फ़िल्टर-नियम" है या नहीं. |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | सुविधा पर लागू करने के लिए लेबलिंग. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | नया नियम बनाता है जो किसी विशेषता पर लेबलिंग लागू करता है जब भी यह किसी फ़िल्टर नियम से मेल नहीं खाता है। |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | नया नियम बनाता है जो फ़िल्टर पास करने पर विशेषता पर लेबलिंग लागू करता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* सभा [Aspose.GIS](../../)


