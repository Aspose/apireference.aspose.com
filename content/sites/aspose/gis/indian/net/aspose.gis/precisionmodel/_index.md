---
title: Class PrecisionModel
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.PrecisionModel कक्ष. PrecisionModel एक नर्देशंक में कई महत्वपूर्ण अंक नर्दष्ट करत है
type: docs
weight: 1310
url: /hi/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` एक निर्देशांक में कई महत्वपूर्ण अंक निर्दिष्ट करता है।

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## गुण

| नाम | विवरण |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | एक सटीक सटीक मॉडल लौटाता है। सटीक सटीक मॉडल के अनुसार दोहरे मान में सभी अंक महत्वपूर्ण होते हैं। |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | एक मान प्राप्त करता है जो इंगित करता है कि यह सटीक मॉडल सटीक है या नहीं। |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | एक मान प्राप्त करता है जो इंगित करता है कि यह सटीक मॉडल गोलाकार है या नहीं। |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | एक सटीक मॉडल में कई महत्वपूर्ण अंक प्राप्त करता है यदि यह गोल है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | राउंडिंग सटीक मॉडल देता है। राउंडिंग सटीक मॉडल के अनुसार केवल सीमित संख्या में अंक महत्वपूर्ण होते हैं। |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | इंगित करता है कि क्या वर्तमान वस्तु उसी प्रकार की दूसरी वस्तु के बराबर है। |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | इंगित करता है कि क्या वर्तमान वस्तु उसी प्रकार की दूसरी वस्तु के बराबर है। |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | डिफ़ॉल्ट हैश फ़ंक्शन के रूप में कार्य करता है। |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | ऑपरेटर लागू करता है ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | ऑपरेटर को लागू करता है!=. |

### टिप्पणियों

प्रेसिजनमॉडल दो प्रकार के होते हैं:  एकदम सही`PrecisionModel` (सभी अंक महत्वपूर्ण हैं); गोल`PrecisionModel` (अंकों की कुछ संख्या महत्वपूर्ण हैं)। ए`PrecisionModel` पर सेट किया जा सकता है[`VectorLayer`](../vectorlayer/) के जरिए[`DriverOptions`](../driveroptions/) ज्यामितीय लिखते या पढ़ते समय निर्देशांक को गोल करने के लिए।

### यह सभी देखें

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


