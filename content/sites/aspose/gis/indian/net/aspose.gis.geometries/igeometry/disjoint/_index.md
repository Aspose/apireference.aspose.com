---
title: IGeometry.Disjoint
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. नर्धरत करत है क क्य यह ज्यमत नर्दष्ट ज्यमत से अलग है
type: docs
weight: 180
url: /hi/net/aspose.gis.geometries/igeometry/disjoint/
---
## IGeometry.Disjoint method

निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति से अलग है।

```csharp
public bool Disjoint(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति से "स्थानिक रूप से अलग" है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि क्या ज्यामितीय DE-9IM इंटरसेक्शन मैट्रिक्स के संदर्भ में असंयुक्त हैं। मूल रूप से, यह परीक्षण करता है कि दो ज्यामितीयों में कोई सामान्य बिंदु नहीं है। यह विधि इसके बराबर है: DE-9IM. के बारे में अधिक जानकारी के लिए OpenGIS सरल सुविधाएँ विशिष्टता देखें

```csharp
this.Relate(other, "FF*FF****");
```

### यह सभी देखें

* method [Intersects](../intersects/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


