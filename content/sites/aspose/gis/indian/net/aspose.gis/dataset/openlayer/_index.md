---
title: Dataset.OpenLayer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Dataset तरक. नर्दष्ट नम वल परत क पढ़ने के लए खलत है.
type: docs
weight: 110
url: /hi/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

निर्दिष्ट नाम वाली परत को पढ़ने के लिए खोलता है.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | खोली जाने वाली परत का नाम. |
| options | DriverOptions | खुले विकल्प। |

### प्रतिलाभ की मात्रा

परत पढ़ने के लिए खुल गई।

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
* class [Dataset](../)
* नाम स्थान [Aspose.Gis](../../dataset/)
* सभा [Aspose.GIS](../../../)


