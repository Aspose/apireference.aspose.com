---
title: Class ImageDevice
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.Presentation.Image.ImageDevice कक्ष. क्लस इनकैप्सुलेटंग इमेज कंपज़ंग डवइस
type: docs
weight: 360
url: /hi/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

क्लास इनकैप्सुलेटिंग इमेज कंपोज़िंग डिवाइस।

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | नया उदाहरण बनाता है। |
| [ImageDevice](imagedevice/#constructor_1)(Size) | निर्दिष्ट मीडिया आकार के साथ नया उदाहरण बनाता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | पृष्ठभूमि का रंग प्राप्त/सेट करता है। |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | रिटर्न या वर्तमान वर्ण परिवर्तन निर्दिष्ट करता है। |
| [Creator](../../aspose.page/device/creator/) { get; set; } | परिणामी डिवाइस आउटपुट के निर्माता को लौटाता है या निर्दिष्ट करता है। |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | दस्तावेज़ के भीतर वर्तमान पृष्ठ की पूर्ण संख्या लौटाता है। |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | वर्तमान विभाजन के भीतर वर्तमान पृष्ठ की सापेक्ष संख्या लौटाता है। |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | वर्तमान फ़ॉन्ट प्राप्त/सेट करता है। |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | इंगित करता है कि डिवाइस प्रत्यक्ष आरजीबी मोड का उपयोग करता है, जो कि आरजीबी है। |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | इंगित करता है कि Aspose.Page लाइब्रेरी का यह उदाहरण लाइसेंसीकृत है या नहीं. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | अपारदर्शिता प्राप्त/सेट करता है. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | अपारदर्शिता मास्क के लिए ब्रश प्राप्त/सेट करता है। मास्क पेंट या स्ट्राइक पर लागू होता है. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | पथ भरने के लिए ब्रश प्राप्त/सेट करता है। |
| [Properties](../../aspose.page/device/properties/) { get; set; } | मेटाडेटा सहित डिवाइस गुण। |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | परिणामी छवियों को बाइट सरणी देता है। पहला आयाम आंतरिक दस्तावेज़ों के लिए है और दूसरा आंतरिक दस्तावेज़ों के पृष्ठों के लिए है। |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | सेव ऑप्शन को इनिशियलाइज़ करता है। |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | डिवाइस मीडिया आकार प्राप्त/सेट करता है। |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | पथ आरेखित करने के लिए स्ट्रोक प्राप्त/सेट करता है. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | वर्तमान टेक्स्ट रेंडरिंग मोड लौटाता है या निर्दिष्ट करता है। |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | वर्तमान टेक्स्ट स्ट्रोक चौड़ाई लौटाता है या निर्दिष्ट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | पृष्ठ पूरा करता है। |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | दस्तावेज़ विभाजन को पूरा किया। |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | इस डिवाइस इंस्टेंस के आधार पर डिवाइस का एक नया उदाहरण बनाता है। इस डिवाइस की ग्राफिक्स स्थिति लिखता है, यानी बनाता हैApsCanvas उदाहरण (ओं) संबंधित रेंडरट्रांसफॉर्म और क्लिप गुणों के साथ। |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | इस डिवाइस इंस्टेंस को डिस्पोज करता है। इस डिवाइस इंस्टेंस ग्राफ़िक्स स्थिति को अंतिम रूप देता है, यानी एपीएस रचना संदर्भ को स्विच करता हैApsCanvas इस डिवाइस की ग्राफ़िक्स स्थिति से उच्च स्तर काApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | निर्दिष्ट पथ बनाता है। |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | एक चाप बनाता है। |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | निर्दिष्ट परिवर्तन और पृष्ठभूमि के साथ एक छवि बनाता है। |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | एक रेखा खंड बनाता है। |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | अंडाकार बनाता है. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | एक आयत बनाता है। |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | एक गोल आयत बनाता है। |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | निर्दिष्ट स्थान पर एक स्ट्रिंग बनाता है। |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | दस्तावेज़ को पूरा करता है। |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | निर्दिष्ट पथ भरता है। |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | चाप भरता है. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | अंडाकार भरता है. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | एक पोलिगोन भरता है. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | एक पोलिगोन भरता है. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | एक आयत भरता है. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | एक गोल आयत भरता है. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | स्ट्रिंग गुण का मान प्राप्त करता है. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | रंग गुण का मान प्राप्त करता है. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | दोगुनी संपत्ति का मान प्राप्त करता है। |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | पूर्णांक गुण का मान प्राप्त करता है. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | मार्जिन संपत्ति का मूल्य प्राप्त करता है। |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | आयत संपत्ति का मान प्राप्त करता है। |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | आकार गुण का मान प्राप्त करता है. |
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | वर्तमान परिवर्तन मैट्रिक्स लौटाता है। |
| virtual [InitClip](../../aspose.page/device/initclip/)() | डिवाइस की क्लिप को इनिशियलाइज़ करता है। |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | आउटपुट के लिए पृष्ठों की संख्या आरंभ करता है। |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | बूलियन संपत्ति का मान प्राप्त करता है। |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | निर्दिष्ट शीर्षक के साथ एक नया पृष्ठ प्रारंभ करता है। |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | निर्दिष्ट चौड़ाई और ऊंचाई के साथ एक नया पृष्ठ प्रारंभ करता है। |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | एक नया दस्तावेज़ विभाजन शुरू करता है। |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | डिवाइस को शुरुआती स्थिति में सेट करता है. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | डिवाइस को रीसेट करता है। |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | वर्तमान परिवर्तन मैट्रिक्स के मूल के बारे में दक्षिणावर्त घुमाव लागू करता है। |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | वर्तमान परिवर्तन मैट्रिक्स को एक बिंदु के चारों ओर घुमाएं। |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | निर्दिष्ट स्केल वेक्टर को वर्तमान परिवर्तन मैट्रिक्स पर लागू करता है। |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | निर्दिष्ट पथ को वर्तमान क्लिप पथ में जोड़ता है. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | वर्तमान परिवर्तन मैट्रिक्स सेट करता है। |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | निर्दिष्ट कतरनी वेक्टर को वर्तमान परिवर्तन मैट्रिक्स पर लागू करता है। |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | दस्तावेज़ प्रारंभ करता है। |
| override [ToString](../../aspose.page/device/tostring/)() | डिवाइस प्रकार का नाम लौटाता है। |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | वर्तमान परिवर्तन मैट्रिक्स को निर्दिष्ट द्वारा गुणा करता हैMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | निर्दिष्ट अनुवाद वेक्टर को वर्तमान परिवर्तन मैट्रिक्स पर लागू करता है। |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | वर्तमान पृष्ठ पैरामीटर अपडेट करता है। |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | एक टिप्पणी लिखता है। |

### यह सभी देखें

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* नाम स्थान [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* सभा [Aspose.Page](../../)


