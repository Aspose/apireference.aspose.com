---
title: Geometry.CoveredBy
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. नर्धरत करत है क क्य यह ज्यमत नर्दष्ट ज्यमत द्वर कवर क गई है
type: docs
weight: 150
url: /hi/net/aspose.gis.geometries/geometry/coveredby/
---
## Geometry.CoveredBy method

निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति द्वारा कवर की गई है।

```csharp
public bool CoveredBy(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true`यदि यह ज्यामिति किसी अन्य ज्यामिति द्वारा "स्थानिक रूप से आच्छादित" है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि DE-9IM चौराहे मैट्रिक्स के संदर्भ में एक ज्यामिति दूसरे द्वारा कवर की गई है या नहीं। यह विधि इसके बराबर है:

```csharp
other.Covers(this);
```

### यह सभी देखें

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


