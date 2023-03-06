---
title: Class Dataset
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Dataset कक्ष. एक डेटसेट क संग्रह हैVectorLayer उदहरण.
type: docs
weight: 80
url: /hi/net/aspose.gis/dataset/
---
## Dataset class

एक डेटासेट का संग्रह है[`VectorLayer`](../vectorlayer/) उदाहरण.

```csharp
public abstract class Dataset : IDisposable
```

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह डेटासेट सदिश परतें बना सकता है. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह डेटासेट सदिश परतों को हटा सकता है. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | हो जाता है[`Driver`](./driver/) जिसने इस डेटासेट को तत्काल बनाया। |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | इस डेटासेट में परतों की संख्या प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | डेटासेट बनाता है। |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | डेटासेट बनाता है। |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | डेटासेट बनाता है। |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | डेटासेट बनाता है। |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | डेटासेट खोलता है। |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | डेटासेट खोलता है। |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | डेटासेट खोलता है। |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | डेटासेट खोलता है। |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | डेटासेट खोलता है। |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | एक नई सदिश परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | एक नई सदिश परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | एक नई सदिश परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | निर्दिष्ट नाम के साथ एक नई वेक्टर परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | निर्दिष्ट नाम के साथ एक नई वेक्टर परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [Dispose](../../aspose.gis/dataset/dispose/)() | द्वारा उपयोग किए गए संसाधनों को जारी करता है`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | संपादन के लिए निर्दिष्ट नाम वाली परत खोलता है. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | निर्दिष्ट इंडेक्स पर परत का नाम प्राप्त करता है। |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | निर्दिष्ट नाम वाली परत को पढ़ने के लिए खोलता है. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | पढ़ने के लिए निर्दिष्ट सूचकांक पर परत खोलता है। |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | निर्दिष्ट नाम के साथ वेक्टर परत को हटाता है। |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | निर्दिष्ट इंडेक्स पर वेक्टर लेयर को हटाता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


