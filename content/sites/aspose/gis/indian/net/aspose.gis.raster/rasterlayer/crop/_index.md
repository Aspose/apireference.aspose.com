---
title: RasterLayer.Crop
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: RasterLayer तरक. रेखपुंज परत क आकर रूप और बैंड मस्क क उपयग करके कटत है
type: docs
weight: 110
url: /hi/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

रेखापुंज परत को आकार रूप (और बैंड मास्क) का उपयोग करके काटता है।

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| geometry | IGeometry | ज्यामिति ने आकार रूप का प्रतिनिधित्व किया। |
| masks | Double[] | फसल परत के लिए मुखौटा |

### प्रतिलाभ की मात्रा

क्रॉप की गई रास्टर परत। यदि कोई चौराहा नहीं मिला तो रिटर्न मिलता है`null`.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | तर्क शून्य नहीं हो सकता। पैरामीटर नाम: ज्यामिति। |
| NotSupportedException | तर्क बहुभुज या सतह से अलग नहीं हो सकता। पैरामीटर नाम: ज्यामिति। |
| InvalidOperationException | मूल परत अन्य CropRasterLayer नहीं हो सकती। |
| [GisException](../../../aspose.gis/gisexception/) | परत को क्रॉप करते समय त्रुटि। |

### यह सभी देखें

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* नाम स्थान [Aspose.Gis.Raster](../../rasterlayer/)
* सभा [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

बैंड मास्क का उपयोग करके रेखापुंज परत को काटता है).

```csharp
public RasterLayer Crop(double[] masks)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| masks | Double[] | फसल परत के लिए मुखौटा |

### प्रतिलाभ की मात्रा

क्रॉप की गई रास्टर परत। यदि कोई चौराहा नहीं मिला तो रिटर्न मिलता है`null`.

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| InvalidOperationException |  |

### यह सभी देखें

* class [RasterLayer](../)
* नाम स्थान [Aspose.Gis.Raster](../../rasterlayer/)
* सभा [Aspose.GIS](../../../)


