---
title: GeoConvert.TryParsePointText
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: GeoConvert तरक. नर्देशंक वल स्ट्रंग क IPoint ऑब्जेक्ट में कनवर्ट करत है. वपस मन दर्शत है क रूपंतरण सफल हुआ य वफल.
type: docs
weight: 30
url: /hi/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

निर्देशांक वाली स्ट्रिंग को IPoint ऑब्जेक्ट में कनवर्ट करता है. वापसी मान दर्शाता है कि रूपांतरण सफल हुआ या विफल.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| text | String | एक स्ट्रिंग जिसमें कन्वर्ट करने के लिए निर्देशांक होते हैं। |
| point | IPoint& | जब यह विधि वापस आती है, तो रूपांतरण सफल होने पर पार्स किए गए निर्देशांक के साथ आईपॉइंट ऑब्जेक्ट होता है, या रूपांतरण विफल होने पर शून्य होता है। |

### प्रतिलाभ की मात्रा

सही है अगर टेक्स्ट सफलतापूर्वक पार्स किया गया था, अन्यथा गलत।

### टिप्पणियों

उदाहरण: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### यह सभी देखें

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* नाम स्थान [Aspose.Gis](../../geoconvert/)
* सभा [Aspose.GIS](../../../)


