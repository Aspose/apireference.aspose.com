---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters कक्ष. अनुमनत एसआरएस बनने के लए पैरमटर कुछ पैरमटर में डफल्ट हैं कुछ पैरमटर में उचत डफल्ट हैं इसलए आपक केवल उन्हें असइन करने क आवश्यकत नहं हैnull उन मपदंडं के लए एक डफ़ल्ट मन क उपयग कय जएग ProjectionMethodName औरBase डफ़ल्ट नहं है  आपक कुछ गैर असइन करन हगnull इस गुण के लए मूल्य
type: docs
weight: 2230
url: /hi/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

अनुमानित एसआरएस बनाने के लिए पैरामीटर। कुछ पैरामीटर में डिफॉल्ट हैं। कुछ पैरामीटर में उचित डिफॉल्ट हैं, इसलिए आपको केवल उन्हें असाइन करने की आवश्यकता नहीं है।`null` उन मापदंडों के लिए, एक डिफ़ॉल्ट मान का उपयोग किया जाएगा। [`ProjectionMethodName`](./projectionmethodname/) और[`Base`](./base/) डिफ़ॉल्ट नहीं है - आपको कुछ गैर असाइन करना होगा`null` इस गुण के लिए मूल्य।

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## गुण

| नाम | विवरण |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | अक्षों का क्रम। करने के लिए चूकXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | आधार भौगोलिक एसआरएस (एसआरएस जिस पर प्रक्षेपण लागू किया गया है)। आपको इस संपत्ति को नहीं पर सेट करना होगा`null` वैध एसआरएस बनाने के लिए मूल्य, इस संपत्ति में कोई डिफ़ॉल्ट नहीं है। |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | इस SRS में उपयोग की जाने वाली इकाइयाँ। डिफ़ॉल्ट है[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | अनुमानित एसआरएस का नाम। डिफ़ॉल्ट "अनाम" है। |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | प्रक्षेपण विधि का पहचानकर्ता। कोई डिफ़ॉल्ट मान नहीं है, आप इस पैरामीटर को नहीं पर सेट कर सकते हैं`null` मान, यदि आप प्रक्षेपण के लिए पहचानकर्ता संलग्न करना चाहते हैं। यदि आप ऐसा करते हैं - यह सुनिश्चित करने के लिए आप पर निर्भर है कि पहचानकर्ता लगातार प्रक्षेपण विधि नाम में है (जब आप इस संपत्ति को सेट करते हैं तो प्रक्षेपण विधि का नाम नहीं बदलेगा)। |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | प्रक्षेपण विधि का नाम। कोई डिफ़ॉल्ट नहीं है और आपको इस पैरामीटर को नहीं पर सेट करना होगा`null` मान, since अनुमानित SRS बिना किसी प्रक्षेपण नाम के बेकार है। |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | एक्सिस जो एक्स (क्षैतिज) आयाम का वर्णन करता है। पूर्व दिशा के साथ अक्ष के लिए चूक। |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | अक्ष जो Y (ऊर्ध्वाधर) आयाम का वर्णन करता है। उत्तर दिशा के साथ अक्ष के लिए चूक। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | इस SRS में प्रोजेक्शन पैरामीटर जोड़ता है। यदि ऐसे नाम वाला पैरामीटर पहले से जोड़ा गया था - इसे अपडेट करें. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | निर्दिष्ट नाम के साथ प्रोजेक्शन पैरामीटर प्राप्त करता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* सभा [Aspose.GIS](../../)


