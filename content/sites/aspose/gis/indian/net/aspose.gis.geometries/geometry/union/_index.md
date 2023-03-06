---
title: Geometry.Union
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. इस ज्यमत और नर्दष्ट ज्यमत क जड़त है
type: docs
weight: 430
url: /hi/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

इस ज्यामिति और निर्दिष्ट ज्यामिति को जोड़ता है।

```csharp
public IGeometry Union(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | के साथ एकजुट करने के लिए एक ज्यामिति। |

### प्रतिलाभ की मात्रा

एक ज्यामिति जो इस ज्यामिति और एक तर्क के मिलन का प्रतिनिधित्व करती है। परिणाम ज्यामिति में बिंदु सेट होता है जो इस ज्यामिति में या एक तर्क में मौजूद होता है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *other* है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### यह सभी देखें

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


