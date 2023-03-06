---
title: Class FileGdbCoordinatePrecisionGrid
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid कक्ष. एक FileGDB परत के अंदर सटक समन्वय ग्रड
type: docs
weight: 250
url: /hi/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

एक FileGDB परत के अंदर सटीक समन्वय ग्रिड।

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## गुण

| नाम | विवरण |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | एम निर्देशांक की उत्पत्ति प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | M निर्देशांक का पैमाना प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | एक्स निर्देशांक की उत्पत्ति प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | X और Y निर्देशांक का पैमाना प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | वाई निर्देशांक की उत्पत्ति प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Z निर्देशांक की उत्पत्ति प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Z निर्देशांक का पैमाना प्राप्त या सेट करता है। अगर सेट है`null` डिफ़ॉल्ट प्रयोग किया जाता है. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | नया बनाता है`फ़ाइल जीडीबी समन्वय प्रेसिजन ग्रिड` जैसे कि एक आयत के भीतर सभी मान प्रदर्शित करने योग्य हैं। |

### टिप्पणियों

निर्देशांक सटीक ग्रिड FileGDB परत में निर्देशांक के मान्य डोमेन और रिज़ॉल्यूशन को परिभाषित करता है। उत्पत्ति अंतरिक्ष में सटीक ग्रिड को समन्वयित करने के लिए पथ को परिभाषित करता है। स्केल रिज़ॉल्यूशन को परिभाषित करता है (बड़ा स्केल है, अधिक सटीक मान लिखे गए हैं)। सटीक ग्रिड निर्देशांक के लिए मानों की मान्य सीमा निर्दिष्ट करता है: में प्रत्येक निर्देशांक[`VectorLayer`](../../aspose.gis/vectorlayer/)इस सीमा के भीतर होना चाहिए। निर्देशांक जो सीमा के बाहर हैं, बाद में पढ़ने में त्रुटि का कारण बन सकते हैं और आर्कजीआईएस द्वारा गलत संसाधित किया जाएगा। यदि आप कोई गुण निर्दिष्ट नहीं करते हैं (उन्हें रखें)`null` ) डिफ़ॉल्ट मानों का उपयोग किया जाएगा. डिफ़ॉल्ट मानों पर निर्भर करता है[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) की[`VectorLayer`](../../aspose.gis/vectorlayer/) . भौगोलिक के लिए[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) डिफ़ॉल्ट हैं: अनुमान के लिए[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) डिफ़ॉल्ट हैं: कहाँ`XY सहिष्णुता` ,`ZTolerance` और`एमसहिष्णुता` से मान हैं[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### यह सभी देखें

* नाम स्थान [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* सभा [Aspose.GIS](../../)


