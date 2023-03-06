---
title: Geometry.SpatiallyEquals
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. नर्धरत करत है क क्य यह ज्यमत स्थनक रूप से नर्दष्ट ज्यमत के बरबर है
type: docs
weight: 370
url: /hi/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

निर्धारित करता है कि क्या यह ज्यामिति स्थानिक रूप से निर्दिष्ट ज्यामिति के बराबर है।

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति निर्दिष्ट ज्यामिति के "स्थानिक रूप से बराबर" है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि DE-9IM इंटरसेक्शन मैट्रिक्स के संदर्भ में समानता का परीक्षण करती है। यह घटकों के क्रम पर निर्भर नहीं करता है (जैसे बहुभुज में आंतरिक रिंगों का क्रम), Z और M मान। मूल रूप से, यह परीक्षण करता है कि दो ज्यामिति दो आयामी स्थान पर प्रक्षेपित होने पर समान "स्थान" पर कब्जा कर लेती हैं। यह विधि इसके बराबर है: DE-9IM. के बारे में अधिक जानकारी के लिए OpenGIS सरल सुविधाएँ विशिष्टता देखें

```csharp
this.Relate(other, "T*F**FFF*");
```

### यह सभी देखें

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


