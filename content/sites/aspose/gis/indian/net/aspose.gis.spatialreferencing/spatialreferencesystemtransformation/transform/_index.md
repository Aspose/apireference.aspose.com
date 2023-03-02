---
title: SpatialReferenceSystemTransformation.Transform
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: SpatialReferenceSystemTransformation तरक. स्थनक संदर्भ प्रणल क लक्षत करने के लए स्रत स्थनक संदर्भ प्रणल से ज्यमत क रूपंतरत करत है
type: docs
weight: 40
url: /hi/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

स्थानिक संदर्भ प्रणाली को लक्षित करने के लिए स्रोत स्थानिक संदर्भ प्रणाली से ज्यामिति को रूपांतरित करता है।

```csharp
public Geometry Transform(IGeometry geometry)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| geometry | IGeometry | बदलने के लिए ज्यामिति। |

### प्रतिलाभ की मात्रा

लक्ष्य स्थानिक संदर्भ प्रणाली में नई ज्यामिति।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | ज्यामिति है`null` . |
| ArgumentException | ज्यामिति[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) क्या नहीं है`null` और के बराबर नहीं है[`Source`](../source/) |
| [TransformationException](../../transformationexception/) | परिवर्तन विफल रहा। |

### यह सभी देखें

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* नाम स्थान [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* सभा [Aspose.GIS](../../../)


