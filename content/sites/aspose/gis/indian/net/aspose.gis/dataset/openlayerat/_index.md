---
title: Dataset.OpenLayerAt
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Dataset तरक. पढ़ने के लए नर्दष्ट सूचकंक पर परत खलत है
type: docs
weight: 120
url: /hi/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

पढ़ने के लिए निर्दिष्ट सूचकांक पर परत खोलता है।

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| index | Int32 | खोलने के लिए परत का सूचकांक। |
| options | DriverOptions | खुले विकल्प। |

### प्रतिलाभ की मात्रा

परत पढ़ने के लिए खुल गई।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentException | इस डेटासेट के लिए विकल्प ऑब्जेक्ट का प्रकार गलत है। |
| ArgumentOutOfRangeException | सूचकांक सीमा से बाहर है |
| ArgumentException | इस डेटासेट के लिए विकल्प ऑब्जेक्ट का प्रकार गलत है। |
| [GisException](../../gisexception/) | परत से सुविधा पढ़ने में त्रुटि. |
| IOException | एक I/O त्रुटि हुई। |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* नाम स्थान [Aspose.Gis](../../dataset/)
* सभा [Aspose.GIS](../../../)


