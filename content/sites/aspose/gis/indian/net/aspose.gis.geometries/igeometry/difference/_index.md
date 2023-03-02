---
title: IGeometry.Difference
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. नर्दष्ट ज्यमत क इस ज्यमत से घटत है
type: docs
weight: 170
url: /hi/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

निर्दिष्ट ज्यामिति को इस ज्यामिति से घटाता है।

```csharp
public IGeometry Difference(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | घटाने के लिए एक ज्यामिति। |

### प्रतिलाभ की मात्रा

एक ज्यामिति जो इस ज्यामिति और एक तर्क के अंतर को दर्शाती है। परिणाम ज्यामिति में बिंदु सेट होता है जो इस ज्यामिति में मौजूद होता है लेकिन एक तर्क में मौजूद नहीं होता है।

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


