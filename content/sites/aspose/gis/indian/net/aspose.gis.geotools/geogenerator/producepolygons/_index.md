---
title: GeoGenerator.ProducePolygons
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GeoGenerator तरक. एक नश्चत संख्य में रैंडम आइटम्स के सथ एक नय आईपलगन एन्युमरेटर बनत है सभ एक नश्चत सम के भतर
type: docs
weight: 30
url: /hi/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

एक निश्चित संख्या में रैंडम आइटम्स के साथ एक नया आईपोलीगॉन एन्युमरेटर बनाता है, सभी एक निश्चित सीमा के भीतर।

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | Extent | निर्दिष्ट क्षेत्र (देखें[`क्षेत्र`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | बहुभुज निर्माण विकल्प (देखें[`बहुभुज जनरेटर विकल्प`](../../polygongeneratoroptions/)) |

### प्रतिलाभ की मात्रा

बहुभुजों की सरणी (की गणना देखें[`Iबहुभुज`](../../../aspose.gis.geometries/ipolygon/))

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | बहुभुजों की संख्या एक से अधिक होनी चाहिए। |
| NullReferenceException | सीमा का एक मान होना चाहिए (NULL नहीं होना चाहिए) |
| ArgumentException | न्यूनतम और अधिकतम लंबाई असमान और 0 से अधिक होनी चाहिए |
| ArgumentException | अधिकतम लंबाई न्यूनतम से अधिक होनी चाहिए |

### यह सभी देखें

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* नाम स्थान [Aspose.Gis.GeoTools](../../geogenerator/)
* सभा [Aspose.GIS](../../../)


