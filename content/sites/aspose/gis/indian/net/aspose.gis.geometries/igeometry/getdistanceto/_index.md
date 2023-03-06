---
title: IGeometry.GetDistanceTo
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. इस ज्यमत और नर्दष्ट ज्यमत के बच न्यूनतम दूर क गणन करत है
type: docs
weight: 230
url: /hi/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच न्यूनतम दूरी की गणना करता है।

```csharp
public double GetDistanceTo(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | दूरी खोजने के लिए एक ज्यामिति। |

### प्रतिलाभ की मात्रा

यदि दोनों ज्यामिति नहीं हैं[`IsEmpty`](../isempty/) - ज्यामिति के निकटतम बिंदुओं के बीच की दूरी। यदि कम से कम एक ज्यामिति खाली है -1 लौटाया जाता है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


