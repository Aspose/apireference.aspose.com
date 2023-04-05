---
title: Class Device
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.Device कक्ष. यह क्लस डक्यूमेंट क अमूर्त डवइस में रेंडर करने के लए एनकैप्सुलेट करत है डक्यूमेंट क रेंडरंग पेज दर पेज क जत है
type: docs
weight: 20
url: /hi/net/aspose.page/device/
---
## Device class

यह क्लास डॉक्यूमेंट को अमूर्त डिवाइस में रेंडर करने के लिए एनकैप्सुलेट करती है। डॉक्यूमेंट की रेंडरिंग पेज दर पेज की जाती है।

```csharp
public abstract class Device
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Device](device/)(Size) | प्रारंभ करता है`Device` एक पृष्ठ के आकार के साथ. |

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | पृष्ठ की वर्तमान पृष्ठभूमि लौटाता है या निर्दिष्ट करता है। |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | रिटर्न या वर्तमान वर्ण परिवर्तन निर्दिष्ट करता है। |
| [Creator](../../aspose.page/device/creator/) { get; set; } | परिणामी डिवाइस आउटपुट के निर्माता को लौटाता है या निर्दिष्ट करता है। |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | रिटर्न या वर्तमान फ़ॉन्ट निर्दिष्ट करता है। |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | इंगित करता है कि डिवाइस प्रत्यक्ष आरजीबी मोड का उपयोग करता है, जो कि आरजीबी है। |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | इंगित करता है कि Aspose.Page लाइब्रेरी का यह उदाहरण लाइसेंसीकृत है या नहीं. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | वर्तमान अपारदर्शिता लौटाता है या निर्दिष्ट करता है। |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | वर्तमान अपारदर्शिता मास्क लौटाता है या निर्दिष्ट करता है। |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | वर्तमान पेंट देता है या निर्दिष्ट करता है। |
| [Properties](../../aspose.page/device/properties/) { get; set; } | मेटाडेटा सहित डिवाइस गुण। |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | रेंडरिंग प्रक्रिया के प्रबंधन के लिए विकल्प. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | पृष्ठ का आकार देता है या निर्दिष्ट करता है। |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | वर्तमान स्ट्रोक देता है या निर्दिष्ट करता है। |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | वर्तमान टेक्स्ट रेंडरिंग मोड लौटाता है या निर्दिष्ट करता है। |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | वर्तमान टेक्स्ट स्ट्रोक चौड़ाई लौटाता है या निर्दिष्ट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | इस डिवाइस की कॉपी बनाता है. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | डिवाइस का निपटान करता है। |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | एक रास्ता बनाता है। |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | एक चाप बनाता है। |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | निर्दिष्ट परिवर्तन और पृष्ठभूमि के साथ एक छवि बनाता है। |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | एक रेखा खंड बनाता है। |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | अंडाकार बनाता है. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | एक आयत बनाता है। |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | एक गोल आयत बनाता है। |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | दिए गए बिंदु पर एक स्ट्रिंग बनाता है। |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | दस्तावेज़ प्रस्तुत किए जाने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | एक रास्ता भरता है। |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | चाप भरता है. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | अंडाकार भरता है. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | एक पोलिगोन भरता है. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | एक पोलिगोन भरता है. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | एक आयत भरता है. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | एक गोल आयत भरता है. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | स्ट्रिंग गुण का मान प्राप्त करता है. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | रंग गुण का मान प्राप्त करता है. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | दोगुनी संपत्ति का मान प्राप्त करता है। |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | पूर्णांक गुण का मान प्राप्त करता है. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | मार्जिन संपत्ति का मूल्य प्राप्त करता है। |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | आयत संपत्ति का मान प्राप्त करता है। |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | आकार गुण का मान प्राप्त करता है. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | वर्तमान परिवर्तन हो जाता है। |
| virtual [InitClip](../../aspose.page/device/initclip/)() | डिवाइस की क्लिप को इनिशियलाइज़ करता है। |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | बूलियन संपत्ति का मान प्राप्त करता है। |
| virtual [ReNew](../../aspose.page/device/renew/)() | संपूर्ण दस्तावेज़ के लिए डिवाइस को प्रारंभिक अवस्था में रीसेट करें। आउटपुट स्ट्रीम को रीसेट करने के लिए उपयोग किया जाता है। |
| virtual [Reset](../../aspose.page/device/reset/)() | किसी पृष्ठ के लिए डिवाइस को प्रारंभिक अवस्था में रीसेट करें. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | वर्तमान परिवर्तन मैट्रिक्स को घुमाएं। राइटट्रांसफॉर्म (ट्रांसफॉर्म) को कॉल करता है। |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | वर्तमान परिवर्तन मैट्रिक्स को एक बिंदु के चारों ओर घुमाएं। |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | वर्तमान परिवर्तन मैट्रिक्स को स्केल करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | डिवाइस की क्लिप निर्दिष्ट करता है। |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | वर्तमान परिवर्तन निर्दिष्ट करता है। |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | वर्तमान रूपांतरण मैट्रिक्स को शियर करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | दस्तावेज़ का प्रतिपादन शुरू करने से पहले डिवाइस की आवश्यक तैयारी करता है। |
| override [ToString](../../aspose.page/device/tostring/)() | डिवाइस प्रकार का नाम लौटाता है। |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | वर्तमान रूपांतरण मैट्रिक्स को रूपांतरित करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | वर्तमान परिवर्तन मैट्रिक्स का अनुवाद करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | एक टिप्पणी लिखता है। |

## खेत

| नाम | विवरण |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | वर्तमान डिवाइस संस्करण। |

### यह सभी देखें

* नाम स्थान [Aspose.Page](../../aspose.page/)
* सभा [Aspose.Page](../../)


