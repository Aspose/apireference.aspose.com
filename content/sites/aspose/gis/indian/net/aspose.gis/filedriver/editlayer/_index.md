---
title: FileDriver.EditLayer
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: FileDriver तरक. संपदन के लए एक परत खलत है
type: docs
weight: 70
url: /hi/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

संपादन के लिए एक परत खोलता है।

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | String | फ़ाइल का पथ। |
| options | DriverOptions | चालक-विशिष्ट विकल्प। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| ArgumentNullException | पथ है`null`. |
| [GisException](../../gisexception/) | फ़ाइल से सुविधा पढ़ने में त्रुटि। |
| IOException | एक I/O त्रुटि हुई। |

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

संपादन के लिए एक परत खोलता है।

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | AbstractPath | फ़ाइल का पथ। |
| options | DriverOptions | चालक-विशिष्ट विकल्प। |

### प्रतिलाभ की मात्रा

का एक उदाहरण[`VectorLayer`](../../vectorlayer/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentException | विकल्प ऑब्जेक्ट में इस ड्राइवर के लिए गलत प्रकार है। |
| ArgumentNullException | पथ है`null`. |
| [GisException](../../gisexception/) | फ़ाइल से सुविधा पढ़ने में त्रुटि। |
| NotSupportedException | ड्राइवर परतों को संपादित नहीं कर सकता। |
| IOException | एक I/O त्रुटि हुई। |

### टिप्पणियों

ड्राइवर सभी सुविधाओं के साथ एक आंतरिक परत बनाता है। लेकिन हमारे पास RAM के बजाय डिस्क स्थान का उपयोग करने का विकल्प है। संसाधनों के अधिक इष्टतम उपयोग के लिए ड्राइवर हैं (विशिष्ट ड्राइवर दस्तावेज़ देखें)। साथ ही ड्राइवर एक परत को संपादित कर सकता है यदि यह परतें बना और खोल सकता है।

### यह सभी देखें

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* नाम स्थान [Aspose.Gis](../../filedriver/)
* सभा [Aspose.GIS](../../../)


