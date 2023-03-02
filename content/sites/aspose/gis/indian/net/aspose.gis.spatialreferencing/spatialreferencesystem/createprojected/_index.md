---
title: SpatialReferenceSystem.CreateProjected
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystem तरक. कस्टम पैरमटर से अनुमनत SRS बनएं.
type: docs
weight: 380
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

कस्टम पैरामीटर से अनुमानित SRS बनाएं.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | बनाने के लिए पैरामीटर। |
| identifier | Identifier | पहचानकर्ता, जो एसआरएस से जुड़ा होगा। एक पहचानकर्ता संलग्न करने से अन्य SRS पैरामीटर संशोधित नहीं होंगे. पहचानकर्ता और SRS पैरामीटर की निरंतरता सुनिश्चित करना आप पर निर्भर है. |

### प्रतिलाभ की मात्रा

नया अनुमानित एसआरएस।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException | बेस एसआरएस पैरामीटर्स में है`null` . प्राचलों में प्रक्षेपण विधि है`null` . |

### यह सभी देखें

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* सभा [Aspose.GIS](../../../)


