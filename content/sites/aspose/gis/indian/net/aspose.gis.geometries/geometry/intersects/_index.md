---
title: Geometry.Intersects
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Geometry तरक. नर्धरत करत है क क्य यह ज्यमत नर्दष्ट सम क कटत है
type: docs
weight: 280
url: /hi/net/aspose.gis.geometries/geometry/intersects/
---
## Intersects(Extent) {#intersects}

निर्धारित करता है कि क्या यह ज्यामिति निर्दिष्ट सीमा को काटती है।

```csharp
public bool Intersects(Extent extent)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| extent | Extent | सीमा। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति सीमा को काटती है;`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |

### यह सभी देखें

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

निर्धारित करता है कि क्या यह ज्यामिति और एक निर्दिष्ट ज्यामिति प्रतिच्छेद करती है।

```csharp
public bool Intersects(IGeometry other)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | IGeometry | एक ज्यामिति। |

### प्रतिलाभ की मात्रा

`true` यदि यह ज्यामिति किसी अन्य ज्यामिति को "स्थानिक रूप से प्रतिच्छेद" करती है।`false` अन्यथा.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क है`null`. |
| ArgumentException | एक ज्यामिति इस तरह से अमान्य है कि संचालन समाप्त नहीं किया जा सकता है। |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of ज्यामिति समतुल्य नहीं हैं। आप उपयोग कर सकते हैं[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) ज्यामिति को समान स्थानिक संदर्भ प्रणाली में बदलने के लिए। |

### टिप्पणियों

यह विधि इसके बराबर है: यह का निषेध है[`Disjoint`](../../igeometry/disjoint/) . देखना[`Disjoint`](../../igeometry/disjoint/) अधिक जानकारी के लिए.

```csharp
!this.Disjoint(other);
```

### यह सभी देखें

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* नाम स्थान [Aspose.Gis.Geometries](../../geometry/)
* सभा [Aspose.GIS](../../../)


