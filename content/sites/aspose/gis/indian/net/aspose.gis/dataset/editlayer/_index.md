---
title: Dataset.EditLayer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Dataset तरक. संपदन के लए नर्दष्ट नम वल परत खलत है.
type: docs
weight: 90
url: /hi/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

संपादन के लिए निर्दिष्ट नाम वाली परत खोलता है.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | संपादित करने के लिए परत का नाम। |
| options | DriverOptions | खुले विकल्प। |
| spatialReferenceSystem | SpatialReferenceSystem | नई ज्यामिति के लिए स्थानिक संदर्भ प्रणाली। |

### प्रतिलाभ की मात्रा

संपादन के लिए परत खोली गई।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentException | निर्दिष्ट नाम वाली परत मौजूद नहीं है; विकल्प ऑब्जेक्ट में इस डेटासेट के लिए गलत प्रकार है। |
| ArgumentException | इस डेटासेट के लिए विकल्प ऑब्जेक्ट का प्रकार गलत है। |
| ArgumentNullException | नाम है`null`. |
| [GisException](../../gisexception/) | परत से सुविधा पढ़ने में त्रुटि. |
| IOException | एक I/O त्रुटि हुई। |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* नाम स्थान [Aspose.Gis](../../dataset/)
* सभा [Aspose.GIS](../../../)


