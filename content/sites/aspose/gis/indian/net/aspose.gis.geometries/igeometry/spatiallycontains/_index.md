---
title: IGeometry.SpatiallyContains
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: IGeometry तरक. नर्धरत करत है क क्य इस ज्यमत में स्थनक रूप से नर्दष्ट ज्यमत है
type: docs
weight: 310
url: /hi/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

निर्धारित करता है कि क्या इस ज्यामिति में स्थानिक रूप से निर्दिष्ट ज्यामिति है।

```csharp
public bool SpatiallyContains(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true`यदि यह ज्यामिति एक और ज्यामिति "स्थानिक रूप से समाहित" है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि DE-9IM इंटरसेक्शन मैट्रिक्स के संदर्भ में एक ज्यामिति में दूसरा है या नहीं। यह विधि इसके बराबर है:

```csharp
other.Within(this);
```

### यह सभी देखें

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../igeometry/)
* सभा [Aspose.GIS](../../../)


