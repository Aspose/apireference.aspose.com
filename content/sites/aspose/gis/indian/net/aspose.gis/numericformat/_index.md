---
title: Class NumericFormat
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.NumericFormat कक्ष. NumericFormat टेक्स्ट में समन्य संख्यत्मक प्रकरं क प्ररूपत करने के लए उपयग कय जत है
type: docs
weight: 1290
url: /hi/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` टेक्स्ट में सामान्य संख्यात्मक प्रकारों को प्रारूपित करने के लिए उपयोग किया जाता है।

```csharp
public abstract class NumericFormat
```

## गुण

| नाम | विवरण |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | परिवर्तित करता है और यह सुनिश्चित करने का प्रयास करता है कि एक संख्यात्मक मान जो में परिवर्तित हो जाता है, एक स्ट्रिंग को उसी संख्यात्मक मान में वापस पार्स किया जाता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | बिना किसी वैज्ञानिक अंकन के किसी संख्या को निश्चित-बिंदु वाले टेक्स्ट में बदलता है. |
| static [General](../../aspose.gis/numericformat/general/)(int) | किसी संख्या को निश्चित-बिंदु या वैज्ञानिक संकेतन के अधिक कॉम्पैक्ट में परिवर्तित करता है, संख्या के प्रकार के आधार पर और एक सटीक विनिर्देशक मौजूद है या नहीं। उपयोग करने के लिए अनुशंसित. |

### टिप्पणियों

तीन प्रकार के होते हैं`NumericFormat` :  सामान्य - निश्चित-बिंदु या वैज्ञानिक संकेतन। अंकों की कुछ संख्या महत्वपूर्ण हैं। राउंडट्रिप - फिक्स्ड-पॉइंट या वैज्ञानिक संकेतन। अधिकतम अंक महत्वपूर्ण हैं। फ्लैट - फिक्स्ड-पॉइंट नोटेशन। अंकों की कुछ संख्या महत्वपूर्ण हैं। ए`NumericFormat` पर सेट किया जा सकता है[`IGeometry`](../../aspose.gis.geometries/igeometry/) के जरिए[`AsText`](../../aspose.gis.geometries/igeometry/astext/) ज्योमेट्री को इसके सुपरिचित पाठ (WKT) प्रतिनिधित्व में अनुवाद करते समय संख्यात्मक प्रारूप को निर्दिष्ट करने के लिए।

### यह सभी देखें

* नाम स्थान [Aspose.Gis](../../aspose.gis/)
* सभा [Aspose.GIS](../../)


