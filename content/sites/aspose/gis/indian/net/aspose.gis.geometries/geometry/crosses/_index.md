---
title: Geometry.Crosses
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. नर्धरत करत है क क्य यह ज्यमत और एक नर्दष्ट ज्यमत क्रस.
type: docs
weight: 170
url: /hi/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

निर्धारित करता है कि क्या यह ज्यामिति और एक निर्दिष्ट ज्यामिति क्रॉस.

```csharp
public bool Crosses(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति को "स्थानिक रूप से पार" करती है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि क्या ज्यामितीय DE-9IM इंटरसेक्शन मैट्रिक्स के संदर्भ में क्रॉस हैं। दो ज्यामिति एक-दूसरे को काटती हैं यदि उनमें कुछ हैं लेकिन सभी आंतरिक बिंदु समान नहीं हैं और चौराहे का आयाम कम है तो कम से कम एक का आयाम ज्यामिति. वह है: दो[`LineString`](../../linestring/) एस क्रॉस, अगर वे एक 'एक्स' अक्षर, एक लाइनस्ट्रिंग और ए बनाते हैं[`Polygon`](../../polygon/) क्रॉस अगर लाइनस्ट्रिंग एक बहुभुज के आंतरिक भाग से गुजरती है। DE-9IM और "स्थानिक रूप से क्रॉस" संबंध के बारे में अधिक जानकारी के लिए OpenGIS सरल सुविधाएँ विशिष्टता देखें।

### यह सभी देखें

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


