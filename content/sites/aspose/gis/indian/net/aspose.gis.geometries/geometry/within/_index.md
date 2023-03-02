---
title: Geometry.Within
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. नर्धरत करत है क यह ज्यमत नर्दष्ट सम के भतर है य नहं
type: docs
weight: 440
url: /hi/net/aspose.gis.geometries/geometry/within/
---
## Within(Extent) {#within}

निर्धारित करता है कि यह ज्यामिति निर्दिष्ट सीमा के भीतर है या नहीं।

```csharp
public bool Within(Extent extent)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| extent | Extent | सीमा। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति सीमा के भीतर है;`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |

### यह सभी देखें

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट ज्यामिति के भीतर है।

```csharp
public bool Within(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति के "स्थानिक रूप से" है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि परीक्षण करती है कि DE-9IM चौराहे मैट्रिक्स के संदर्भ में एक ज्यामिति दूसरे के भीतर है। यह विधि इसके बराबर है: DE-9IM और "स्थानिक रूप से भीतर" संबंध के बारे में अधिक जानकारी के लिए OpenGIS सरल सुविधाएँ विशिष्टता देखें।

```csharp
this.Relate(other, "T*F**F***");
```

### यह सभी देखें

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


