---
title: GeoGenerator.ProduceLines
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GeoGenerator तरक. एक द गई यदृच्छक वस्तुओं क संख्य के सथ एक नय IlineString एन्युमरेटर बनत है सभ एक नश्चत सम के भतर
type: docs
weight: 10
url: /hi/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

एक दी गई यादृच्छिक वस्तुओं की संख्या के साथ एक नया IlineString एन्युमरेटर बनाता है, सभी एक निश्चित सीमा के भीतर।

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | Extent | निर्दिष्ट क्षेत्र (देखें[`क्षेत्र`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | रेखा निर्माण विकल्प (देखें[`लाइन जेनरेटर विकल्प`](../../linegeneratoroptions/)) |

### प्रतिलाभ की मात्रा

लाइनों की सरणी (की गणना देखें[`IlineString`](../../../aspose.gis.geometries/ilinestring/))

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentOutOfRangeException | पंक्तियों की संख्या एक से अधिक होनी चाहिए। |
| NullReferenceException | सीमा का एक मान होना चाहिए (NULL नहीं होना चाहिए) |

### यह सभी देखें

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* नाम स्थान [Aspose.Gis.GeoTools](../../geogenerator/)
* सभा [Aspose.GIS](../../../)


