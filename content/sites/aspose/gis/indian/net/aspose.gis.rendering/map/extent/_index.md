---
title: Map.Extent
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Map संपत्त. प्रस्तुत करने के लए मनचत्र क सम नर्दष्ट करत है यद सेट कय गय हैnull  सभ परतं में सभ ज्यमत क शमल करने के लए रेंडरंग के दरन सम क गणन क जत है
type: docs
weight: 40
url: /hi/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

प्रस्तुत करने के लिए मानचित्र की सीमा निर्दिष्ट करता है। यदि सेट किया गया है`null` , सभी परतों में सभी ज्यामिति को शामिल करने के लिए रेंडरिंग के दौरान सीमा की गणना की जाती है।

```csharp
public Extent Extent { get; set; }
```

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) है`false`.[`Width`](../../../aspose.gis/extent/width/) कम या शून्य के बराबर है।[`Height`](../../../aspose.gis/extent/height/) कम या शून्य के बराबर है।[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) है`null`. |

### टिप्पणियों

यदि विस्तार की स्थानिक संदर्भ प्रणाली मानचित्र की स्थानिक संदर्भ प्रणाली के बराबर नहीं है, तो प्रतिपादन के दौरान सीमा को लक्षित स्थानिक संदर्भ प्रणाली में परिवर्तित किया जा रहा है।

### यह सभी देखें

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* नाम स्थान [Aspose.Gis.Rendering](../../map/)
* सभा [Aspose.GIS](../../../)


