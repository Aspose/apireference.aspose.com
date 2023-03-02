---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: FileDriver तरक. नर्धरत करत है क नर्दष्ट स्थनक संदर्भ प्रणल ड्रइवर द्वर समर्थत है य नहं
type: docs
weight: 100
url: /hi/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

निर्धारित करता है कि निर्दिष्ट स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित है या नहीं।

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | स्थानिक संदर्भ प्रणाली। |

### प्रतिलाभ की मात्रा

बूलियन मान, यह दर्शाता है कि क्या निर्दिष्ट स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित है। `null` किसी भी ड्राइवर द्वारा समर्थित माना जाता है।

### टिप्पणियों

यदि स्थानिक संदर्भ प्रणाली समर्थित नहीं है, और आप इसे पास करते हैं[`CreateLayer`](../createlayer/) विधि, एNotSupportedException फेंक दिया जाएगा.

### यह सभी देखें

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)


