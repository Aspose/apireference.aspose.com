---
title: Class FileDriver
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.FileDriver कक्ष. एक वशष्ट फ़इल आधरत प्ररूप के लए ड्रइवर
type: docs
weight: 180
url: /hi/net/aspose.gis/filedriver/
---
## FileDriver class

एक विशिष्ट फ़ाइल आधारित प्रारूप के लिए ड्राइवर।

```csharp
public abstract class FileDriver : Driver
```

## गुण

| नाम | विवरण |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | एक मान प्राप्त करता है जो दर्शाता है कि यह ड्राइवर डेटासेट बना सकता है या नहीं। |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह ड्राइवर सदिश परतें बना सकता है. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | एक मान प्राप्त करता है जो दर्शाता है कि यह ड्राइवर डेटासेट खोल सकता है या नहीं। |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह ड्राइवर सदिश परतें खोल सकता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | डेटासेट बनाता है। |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | डेटासेट बनाता है। |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | डेटासेट बनाता है। |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | डेटासेट बनाता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | संपादन के लिए एक परत खोलता है। |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | संपादन के लिए एक परत खोलता है। |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | डेटासेट खोलता है। |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | डेटासेट खोलता है। |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | डेटासेट खोलता है। |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | डेटासेट खोलता है। |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | परत को पढ़ने के लिए खोलता है. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | परत को पढ़ने के लिए खोलता है. |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | परत को पढ़ने के लिए खोलता है. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | परत को पढ़ने के लिए खोलता है. |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | निर्धारित करता है कि निर्दिष्ट स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित है या नहीं। |

### यह सभी देखें

* class [Driver](../driver/)
* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


