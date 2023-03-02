---
title: IGeometry.Intersection
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. इस ज्यमत और नर्दष्ट ज्यमत के बच एक इंटरसेक्शन बनत है.
type: docs
weight: 260
url: /hi/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच एक इंटरसेक्शन बनाता है.

```csharp
public IGeometry Intersection(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | चौराहे की गणना करने के लिए एक ज्यामिति। |

### प्रतिलाभ की मात्रा

एक ज्यामिति जो इस ज्यामिति के प्रतिच्छेदन और एक तर्क का प्रतिनिधित्व करती है। परिणाम ज्यामिति में बिंदु सेट होता है जो इस ज्यामिति और तर्क दोनों में मौजूद होता है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *other* है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


