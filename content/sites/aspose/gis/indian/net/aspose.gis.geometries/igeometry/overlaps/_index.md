---
title: IGeometry.Overlaps
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. नर्धरत करत है क क्य यह ज्यमत नर्दष्ट ज्यमत के सथ ओवरलैप हत है
type: docs
weight: 280
url: /hi/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति के साथ ओवरलैप होती है।

```csharp
public bool Overlaps(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति को "स्थानिक रूप से ओवरलैप" करती है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि क्या ज्यामिति DE-9IM चौराहे मैट्रिक्स के संदर्भ में ओवरलैप होती हैं। दो ज्यामिति ओवरलैप होती हैं यदि उनके पास कुछ हैं लेकिन सभी आंतरिक बिंदु सामान्य नहीं हैं और ज्यामिति के प्रतिच्छेदन का वही आयाम है जो स्वयं ज्यामिति का है। दो के लिएPoint ज्यामिति या दोSurface ज्यामिति यह विधि इसके बराबर है: दो के लिएLine ज्यामिति यह विधि इसके बराबर है: दो ज्यामितियों के लिए समान नहीं है[`Dimension`](../dimension/) यह तरीका हमेशा रिटर्न करता है`false`. DE-9IM और "स्थानिक रूप से ओवरलैप" संबंध के बारे में अधिक जानकारी के लिए OpenGIS सरल सुविधाएँ विशिष्टता देखें।

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### यह सभी देखें

* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


