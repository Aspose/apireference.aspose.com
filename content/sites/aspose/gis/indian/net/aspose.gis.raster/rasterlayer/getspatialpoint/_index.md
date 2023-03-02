---
title: RasterLayer.GetSpatialPoint
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: RasterLayer तरक. नर्दष्ट स्तंभ और पंक्त क स्थनक नर्देशंक में परवर्तत करत है
type: docs
weight: 150
url: /hi/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

निर्दिष्ट स्तंभ और पंक्ति को स्थानिक निर्देशांक में परिवर्तित करता है।

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| cellX | Int32 | स्तंभ (x-निर्देशांक) के लिए मान। नंबरिंग 0 से शुरू होती है। |
| cellY | Int32 | पंक्ति के लिए मान (y-निर्देशांक)। नंबरिंग 0 से शुरू होती है। |

### प्रतिलाभ की मात्रा

स्तंभ और पंक्ति दिए गए ऊपरी बाएँ कोने का x-निर्देशांक लौटाता है।

### टिप्पणियों

यदि कोई भी पैरामीटर रेखापुंज के संबंधित आयाम की सीमा से बाहर हो जाता है, यह रेखापुंज के बाहर निर्देशांक लौटाएगा यह मानते हुए कि रेखापुंज का ग्रिड रेखापुंज की सीमा के बाहर लागू है।

### यह सभी देखें

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* नाम स्थान [Aspose.Gis.Raster](../../rasterlayer/)
* सभा [Aspose.GIS](../../../)


