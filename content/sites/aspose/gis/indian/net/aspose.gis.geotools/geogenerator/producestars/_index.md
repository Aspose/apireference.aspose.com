---
title: GeoGenerator.ProduceStars
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GeoGenerator तरक. सतरं क एक सरण बनत है सभ एक नश्चत सम के भतर
type: docs
weight: 40
url: /hi/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

सितारों की एक सरणी बनाता है, सभी एक निश्चित सीमा के भीतर।

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | Extent | निर्दिष्ट क्षेत्र (देखें[`क्षेत्र`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | बहुभुज निर्माण विकल्प (देखें[`स्टारजेनरेटर विकल्प`](../../stargeneratoroptions/)) |

### प्रतिलाभ की मात्रा

सितारों की सरणी (गणना देखें[`Iबहुभुज`](../../../aspose.gis.geometries/ipolygon/))

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | तारों की संख्या एक से अधिक होनी चाहिए। |
| NullReferenceException | सीमा का एक मान होना चाहिए (NULL नहीं होना चाहिए) |
| ArgumentException | न्यूनतम और अधिकतम लंबाई असमान और 3 से अधिक होनी चाहिए |
| ArgumentException | अधिकतम लंबाई न्यूनतम से अधिक होनी चाहिए |

### यह सभी देखें

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* नाम स्थान [Aspose.Gis.GeoTools](../../geogenerator/)
* सभा [Aspose.GIS](../../../)


