---
title: GeoGenerator.ProducePoints
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GeoGenerator तरक. नर्दष्ट क्षेत्र से संबंधत बंदुओं क एक सरण बनत है
type: docs
weight: 20
url: /hi/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

निर्दिष्ट क्षेत्र से संबंधित बिंदुओं की एक सरणी बनाता है।

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | Extent | निर्दिष्ट क्षेत्र (देखें[`क्षेत्र`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | बिंदु निर्माण विकल्प (देखें[`प्वाइंटजेनरेटर विकल्प`](../../pointgeneratoroptions/)). |

### प्रतिलाभ की मात्रा

अंकों की सरणी (गणना देखें[`Iज्यामिति`](../../../aspose.gis.geometries/igeometry/)).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | अंकों की संख्या एक से अधिक होनी चाहिए। |
| NullReferenceException | सीमा का एक मान होना चाहिए (शून्य नहीं होना चाहिए)। |

### यह सभी देखें

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* नाम स्थान [Aspose.Gis.GeoTools](../../geogenerator/)
* सभा [Aspose.GIS](../../../)


