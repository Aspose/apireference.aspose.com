---
title: Geometry.SymDifference
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. इस ज्यमत और नर्दष्ट ज्यमत के बच एक सममत अंतर बनत है
type: docs
weight: 380
url: /hi/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

इस ज्यामिति और निर्दिष्ट ज्यामिति के बीच एक सममित अंतर बनाता है।

```csharp
public IGeometry SymDifference(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | सममित अंतर की गणना करने के लिए एक ज्यामिति। |

### प्रतिलाभ की मात्रा

एक ज्यामिति जो इस ज्यामिति और एक तर्क के सममित अंतर का प्रतिनिधित्व करती है। परिणाम ज्यामिति में बिंदु सेट होता है जो किसी एक ज्यामिति में मौजूद होता है लेकिन दोनों में मौजूद नहीं होता है।

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


