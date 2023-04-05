---
title: Class PdfDevice
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.EPS.Device.PdfDevice कक्ष. यह वर्ग दस्तवेज़ क PDF में प्रस्तुत करने क समहत करत है
type: docs
weight: 60
url: /hi/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

यह वर्ग दस्तावेज़ को PDF में प्रस्तुत करने को समाहित करता है।

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | का नया उदाहरण शुरू करता है`PdfDevice` आउटपुट स्ट्रीम के साथ. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | का नया उदाहरण शुरू करता है`PdfDevice`आउटपुट स्ट्रीम और पृष्ठ के निर्दिष्ट आकार के साथ। |

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | पृष्ठ की वर्तमान पृष्ठभूमि लौटाता है या निर्दिष्ट करता है। |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | रिटर्न या वर्तमान वर्ण परिवर्तन निर्दिष्ट करता है। |
| [Creator](../../aspose.page/device/creator/) { get; set; } | परिणामी डिवाइस आउटपुट के निर्माता को लौटाता है या निर्दिष्ट करता है। |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | वर्तमान पृष्ठ संख्या। |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | वर्तमान फ़ॉन्ट निर्दिष्ट करता है। |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | इंगित करता है कि डिवाइस प्रत्यक्ष आरजीबी मोड का उपयोग करता है, जो कि आरजीबी है। |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | इंगित करता है कि Aspose.Page लाइब्रेरी का यह उदाहरण लाइसेंसीकृत है या नहीं. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | वर्तमान अपारदर्शिता लौटाता है या निर्दिष्ट करता है। |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | वर्तमान अपारदर्शिता मास्क लौटाता है या निर्दिष्ट करता है। |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | आउटपुट स्ट्रीम निर्दिष्ट या वापस करता है। |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | वर्तमान पेंट देता है या निर्दिष्ट करता है। |
| [Properties](../../aspose.page/device/properties/) { get; set; } | मेटाडेटा सहित डिवाइस गुण। |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | रेंडरिंग प्रक्रिया के प्रबंधन के लिए विकल्प. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | पृष्ठ का आकार देता है या निर्दिष्ट करता है। |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | वर्तमान स्ट्रोक देता है या निर्दिष्ट करता है। |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | वर्तमान टेक्स्ट रेंडरिंग मोड लौटाता है या निर्दिष्ट करता है। |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | वर्तमान टेक्स्ट स्ट्रोक चौड़ाई लौटाता है या निर्दिष्ट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | पेज रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | इस डिवाइस की कॉपी बनाता है. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | ग्राफिक्स संदर्भ का निपटान करता है। यदि निर्माण पर रिस्टोरऑनडिस्पोज सही था, राइटग्राफिक्सरिस्टोर () को कॉल किया जाएगा। |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | एक रास्ता बनाता है। |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | एक चाप बनाता है। |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | निर्दिष्ट परिवर्तन और पृष्ठभूमि के साथ एक छवि बनाता है। |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | एक रेखा खंड बनाता है। |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | अंडाकार बनाता है. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | एक बहुभुज बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | एक पॉलीलाइन बनाता है। |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | एक आयत बनाता है। |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | एक गोल आयत बनाता है। |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | दिए गए बिंदु पर एक स्ट्रिंग बनाता है। |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | दस्तावेज़ प्रस्तुत किए जाने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | एक रास्ता भरता है। |
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
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | वर्तमान रूपांतरण प्राप्त करता है। |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | डिवाइस की क्लिप को इनिशियलाइज़ करता है। |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | आउटपुट के लिए पृष्ठों की संख्या आरंभ करता है। |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | बूलियन संपत्ति का मान प्राप्त करता है। |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | पेज रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | प्रत्येक पेज रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | संपूर्ण दस्तावेज़ के लिए डिवाइस को प्रारंभिक अवस्था में रीसेट करें। आउटपुट स्ट्रीम को रीसेट करने के लिए उपयोग किया जाता है। |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | यदि पेज डिवाइस पैरामीटर सेट किए जाएंगे तो यह विधि राइटिंग स्ट्रीम को पेज की शुरुआत में वापस लाने की अनुमति देती है। |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | वर्तमान परिवर्तन को Z-अक्ष पर घुमाएं। राइटट्रांसफॉर्म (ट्रांसफॉर्म) को कॉल करता है। |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | वर्तमान परिवर्तन मैट्रिक्स को एक बिंदु के चारों ओर घुमाएं। |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | वर्तमान परिवर्तन मैट्रिक्स को स्केल करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | डिवाइस की क्लिप निर्दिष्ट करता है। |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | वर्तमान परिवर्तन निर्दिष्ट करता है। चूंकि अधिकांश आउटपुट स्वरूप इस कार्यक्षमता को लागू नहीं करते हैं, इसलिए के व्युत्क्रम परिवर्तन की गणना की जाती है और सेट किए जाने के लिए the परिवर्तन से गुणा किया जाता है। इसके बाद परिणाम को कॉल द्वारा राइटट्रांसफॉर्म (ट्रांसफॉर्म) के लिए भेजा जाता है। |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | वर्तमान रूपांतरण मैट्रिक्स को शियर करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | दस्तावेज़ का प्रतिपादन शुरू करने से पहले डिवाइस की आवश्यक तैयारी करता है। |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | डिवाइस प्रकार का नाम लौटाता है। |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | वर्तमान रूपांतरण मैट्रिक्स को रूपांतरित करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | वर्तमान परिवर्तन मैट्रिक्स का अनुवाद करता है। कॉल राइटट्रांसफॉर्म (ट्रांसफॉर्म) . |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | अन्य मल्टी-पेजेड डिवाइस से पेज पैरामीटर अपडेट करता है। |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | एक टिप्पणी लिखता है। |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | "लेखक" संपत्ति मूल्य। |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | "पृष्ठभूमि" संपत्ति कुंजी। |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | "पृष्ठभूमि रंग" संपत्ति कुंजी। |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | "संपीड़ित" संपत्ति कुंजी। |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | "दस्तावेज़ में फ़ॉन्ट एम्बेड करें" गुण कुंजी। |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | संपत्ति कुंजी "एम्बेडिंग के लिए किस फ़ॉन्ट प्रकार का उपयोग किया जाता है"। |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | "उत्सर्जित त्रुटियां" संपत्ति मूल्य। |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | "एमिट चेतावनियां" संपत्ति मूल्य। |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | "पृष्ठ के लिए सामग्री फ़िट करें" गुण कुंजी। |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | "कीवर्ड" संपत्ति मूल्य। |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | "ओरिएंटेशन" संपत्ति कुंजी। |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | "पृष्ठ मार्जिन" संपत्ति कुंजी। |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | "पृष्ठ आकार" संपत्ति कुंजी। |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | "विषय" संपत्ति मूल्य। |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | "शीर्षक" संपत्ति मूल्य। |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | "पारदर्शी" संपत्ति कुंजी। |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | "संस्करण" संपत्ति कुंजी। |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | "एडोब एक्रोबैट रीडर का संस्करण" संपत्ति मूल्य। |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | "छवियों का प्रारूप" संपत्ति कुंजी। |

### यह सभी देखें

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* नाम स्थान [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* सभा [Aspose.Page](../../)


