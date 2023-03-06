---
title: Class FileGdbDriver
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Formats.FileGdb.FileGdbDriver कक्ष. ESRI फ़इल जयडेटबेस प्ररूप के लए एक ड्रइवर
type: docs
weight: 260
url: /hi/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

ESRI फ़ाइल जियोडेटाबेस प्रारूप के लिए एक ड्राइवर।

```csharp
public sealed class FileGdbDriver : FileDriver
```

## गुण

| नाम | विवरण |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets/) { get; } | एक मान प्राप्त करता है जो दर्शाता है कि यह ड्राइवर डेटासेट बना सकता है या नहीं। |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह ड्राइवर सदिश परतें बना सकता है. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets/) { get; } | एक मान प्राप्त करता है जो दर्शाता है कि यह ड्राइवर डेटासेट खोल सकता है या नहीं। |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह ड्राइवर सदिश परतें खोल सकता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | डेटासेट बनाता है। |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | डेटासेट बनाता है। |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | डेटासेट बनाता है। |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_2)(AbstractPath, FileGdbOptions) | डेटासेट बनाता है। |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | डेटासेट बनाता है। |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_5)(string, FileGdbOptions) | डेटासेट बनाता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_8)(string, FileGdbOptions) | एक परत बनाता है और नई सुविधाओं को जोड़ने के लिए इसे खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | एक परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | एक परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | एक परत बनाता है और इसे जोड़ने के लिए खोलता है। |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | संपादन के लिए एक परत खोलता है। |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | संपादन के लिए एक परत खोलता है। |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | डेटासेट खोलता है। |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | डेटासेट खोलता है। |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | डेटासेट खोलता है। |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_2)(AbstractPath, FileGdbOptions) | डेटासेट खोलता है। |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | डेटासेट खोलता है। |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_5)(string, FileGdbOptions) | डेटासेट खोलता है। |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | परत को पढ़ने के लिए खोलता है. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | परत को पढ़ने के लिए खोलता है. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | पढ़ने के लिए एक परत खोलता है. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_2)(AbstractPath, FileGdbOptions) | पढ़ने के लिए एक परत खोलता है. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | परत को पढ़ने के लिए खोलता है. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_5)(string, FileGdbOptions) | पढ़ने के लिए एक परत खोलता है. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | निर्धारित करता है कि निर्दिष्ट स्थानिक संदर्भ प्रणाली ड्राइवर द्वारा समर्थित है या नहीं। |

### यह सभी देखें

* class [FileDriver](../../aspose.gis/filedriver/)
* नाम स्थान [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* सभा [Aspose.GIS](../../)


