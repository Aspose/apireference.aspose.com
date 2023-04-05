---
title: Class ImageDevice
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.EPS.Device.ImageDevice कक्ष. यह वर्ग दस्तवेज़ क छव में प्रस्तुत करने क समहत करत है
type: docs
weight: 40
url: /hi/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

यह वर्ग दस्तावेज़ को छवि में प्रस्तुत करने को समाहित करता है।

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | का नया उदाहरण शुरू करता है`ImageDevice` . |
| [ImageDevice](imagedevice/#constructor_1)(ImageFormat) | का नया उदाहरण शुरू करता है`ImageDevice` निर्दिष्ट छवि प्रारूप के साथ. |
| [ImageDevice](imagedevice/#constructor_2)(Size) | का नया उदाहरण शुरू करता है`ImageDevice` पृष्ठ के निर्दिष्ट आकार के साथ. |
| [ImageDevice](imagedevice/#constructor_3)(Size, ImageFormat) | का नया उदाहरण शुरू करता है`ImageDevice` एक पृष्ठ और छवि प्रारूप के निर्दिष्ट आकार के साथ। |

## गुण

| नाम | विवरण |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background/) { get; set; } | इंगित करता है कि डिवाइस प्रत्यक्ष आरजीबी मोड का उपयोग करता है, जो कि आरजीबी है। |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm/) { get; set; } | रिटर्न या वर्तमान वर्ण परिवर्तन निर्दिष्ट करता है। |
| [Creator](../../aspose.page.eps.device/imagedevice/creator/) { get; set; } | परिणामी डिवाइस आउटपुट के निर्माता को लौटाता है या निर्दिष्ट करता है। |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber/) { get; } | वर्तमान पृष्ठ संख्या। |
| override [Font](../../aspose.page.eps.device/imagedevice/font/) { get; set; } | रिटर्न या वर्तमान फ़ॉन्ट निर्दिष्ट करता है। |
| [Format](../../aspose.page.eps.device/imagedevice/format/) { get; } | छवि प्रारूप। |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes/) { get; } | बाइट्स में परिणामी छवियां लौटाता है, एक पृष्ठ के लिए एक बाइट सरणी। |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb/) { get; } | इंगित करता है कि डिवाइस प्रत्यक्ष आरजीबी मोड का उपयोग करता है, जो कि आरजीबी है। |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | इंगित करता है कि Aspose.Page लाइब्रेरी का यह उदाहरण लाइसेंसीकृत है या नहीं. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity/) { get; set; } | पृष्ठ की वर्तमान पृष्ठभूमि लौटाता है या निर्दिष्ट करता है। |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | वर्तमान अपारदर्शिता मास्क लौटाता है या निर्दिष्ट करता है। |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint/) { get; set; } | वर्तमान पेंट देता है या निर्दिष्ट करता है। |
| [Properties](../../aspose.page/device/properties/) { get; set; } | मेटाडेटा सहित डिवाइस गुण। |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions/) { set; } | रेंडरिंग प्रक्रिया के प्रबंधन के लिए विकल्प. |
| override [Size](../../aspose.page.eps.device/imagedevice/size/) { get; set; } | पृष्ठ का आकार देता है या निर्दिष्ट करता है। |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke/) { get; set; } | वर्तमान स्ट्रोक देता है या निर्दिष्ट करता है। |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode/) { get; set; } | वर्तमान टेक्स्ट रेंडरिंग मोड लौटाता है या निर्दिष्ट करता है। |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth/) { get; set; } | वर्तमान टेक्स्ट स्ट्रोक चौड़ाई लौटाता है या निर्दिष्ट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage/)() | पेज रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| override [Create](../../aspose.page.eps.device/imagedevice/create/)() | इस डिवाइस की कॉपी बनाता है. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose/)() | डिवाइस का निपटान करता है। |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw/)(GraphicsPath) | एक रास्ता बनाता है। |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | एक चाप बनाता है। |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage/)(Bitmap, Matrix, Color) | निर्दिष्ट परिवर्तन और पृष्ठभूमि के साथ एक छवि बनाता है। |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | एक रेखा खंड बनाता है। |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | अंडाकार बनाता है. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | एक आयत बनाता है। |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | एक गोल आयत बनाता है। |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring/)(string, double, double) | दिए गए बिंदु पर एक स्ट्रिंग बनाता है। |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument/)() | दस्तावेज़ प्रस्तुत किए जाने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill/)(GraphicsPath) | एक रास्ता भरता है। |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | चाप भरता है. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | अंडाकार भरता है. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | एक पोलिगोन भरता है. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | एक पोलिगोन भरता है. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | एक आयत भरता है. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | एक गोल आयत भरता है. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty/#getproperty)(string) | स्ट्रिंग गुण का मान प्राप्त करता है. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor/#getpropertycolor)(string) | रंग गुण का मान प्राप्त करता है. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble/#getpropertydouble)(string) | दोगुनी संपत्ति का मान प्राप्त करता है। (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint/#getpropertyint)(string) | पूर्णांक गुण का मान प्राप्त करता है. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins/#getpropertymargins)(string) | मार्जिन संपत्ति का मूल्य प्राप्त करता है। (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle/#getpropertyrectangle)(string) | आयत संपत्ति का मान प्राप्त करता है। (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize/#getpropertysize)(string) | आकार गुण का मान प्राप्त करता है. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform/)() | वर्तमान रूपांतरण प्राप्त करता है। |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip/)() | डिवाइस की एक क्लिप प्रारंभ करता है। |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers/)() | आउटपुट के लिए पृष्ठों की संख्या आरंभ करता है। |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty/#isproperty)(string) | बूलियन संपत्ति का मान प्राप्त करता है। (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage_1)(string) | पेज रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage/#openpage)(float, float) | प्रत्येक पेज रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew/)() | पूरे दस्तावेज़ के लिए डिवाइस को शुरुआती स्थिति में रीसेट करें. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset/)() | किसी पृष्ठ के लिए डिवाइस को प्रारंभिक अवस्था में रीसेट करें. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate/#rotate)(double) | वर्तमान रूपांतरण मैट्रिक्स को Z-अक्ष पर घुमाएं। राइटट्रांसफॉर्म (ट्रांसफॉर्म) को कॉल करता है। |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | वर्तमान परिवर्तन मैट्रिक्स को एक बिंदु के चारों ओर घुमाएं। |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale/)(double, double) | वर्तमान परिवर्तन मैट्रिक्स को स्केल करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip/)(GraphicsPath) | क्लिप आकार। |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform/)(Matrix) | वर्तमान परिवर्तन निर्दिष्ट करता है। |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear/)(double, double) | वर्तमान रूपांतरण मैट्रिक्स को शियर करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument/)() | दस्तावेज़ का प्रतिपादन शुरू करने से पहले डिवाइस की आवश्यक तैयारी करता है। |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring/)() | डिवाइस प्रकार का नाम लौटाता है। |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform/)(Matrix) | वर्तमान रूपांतरण मैट्रिक्स को रूपांतरित करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate/)(double, double) | वर्तमान परिवर्तन मैट्रिक्स का अनुवाद करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters/)(IMultiPageDevice) | अन्य मल्टी-पेजेड डिवाइस से पेज पैरामीटर अपडेट करता है। |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment/)(string) | एक टिप्पणी लिखता है। |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background/) | "पृष्ठभूमि" संपत्ति कुंजी। |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color/) | "पृष्ठभूमि रंग" संपत्ति कुंजी। |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts/) | "दस्तावेज़ में फ़ॉन्ट एम्बेड करें" गुण कुंजी। |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors/) | "उत्सर्जित त्रुटियां" संपत्ति मूल्य। |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings/) | "एमिट चेतावनियां" संपत्ति मूल्य। |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page/) | "पृष्ठ के लिए सामग्री फ़िट करें" गुण कुंजी। |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation/) | "ओरिएंटेशन" संपत्ति कुंजी। |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins/) | "पृष्ठ मार्जिन" संपत्ति कुंजी। |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size/) | "पृष्ठ आकार" संपत्ति कुंजी। |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer/) | "निर्माता" संपत्ति मूल्य। |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent/) | "पारदर्शी" संपत्ति कुंजी। |

### यह सभी देखें

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* नाम स्थान [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* सभा [Aspose.Page](../../)


