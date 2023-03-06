---
title: IGeometry.Touches
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. नर्धरत करत है क क्य यह ज्यमत और नर्दष्ट ज्यमत स्पर्श करते हैं.
type: docs
weight: 360
url: /hi/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

निर्धारित करता है कि क्या यह ज्यामिति और निर्दिष्ट ज्यामिति स्पर्श करते हैं.

```csharp
public bool Touches(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति को "स्थानिक रूप से स्पर्श" करती है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि DE-9IM इंटरसेक्शन मैट्रिक्स के संदर्भ में ज्यामिति एक-दूसरे को स्पर्श करती हैं या नहीं। दो ज्यामिति एक-दूसरे को स्पर्श करती हैं यदि उनके पास कम से कम एक सीमा बिंदु उभयनिष्ठ है, लेकिन कोई आंतरिक बिंदु नहीं है। यानी: दो[`LineString`](../../linestring/)एक दूसरे को स्पर्श करते हैं यदि वे एक समापन बिंदु साझा करते हैं, लेकिन एक खंड साझा नहीं करते हैं, दो बहुभुज एक दूसरे को स्पर्श करते हैं यदि वे बाहरी या आंतरिक रिंग का हिस्सा साझा करते हैं, लेकिन उनके आंतरिक ओवरलैप नहीं होते हैं। यह विधि इसके बराबर है: DE-9IM और "स्थानिक रूप से स्पर्श" संबंध के बारे में अधिक जानकारी के लिए OpenGIS सरल सुविधाएँ विशिष्टता देखें।

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


