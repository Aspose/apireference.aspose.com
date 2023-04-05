---
title: Class PsDocument
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.EPS.PsDocument कक्ष. यह वर्ग पएस/ईपएस दस्तवेजं क संपुटत करत है
type: docs
weight: 140
url: /hi/net/aspose.page.eps/psdocument/
---
## PsDocument class

यह वर्ग पीएस/ईपीएस दस्तावेजों को संपुटित करता है।

```csharp
public sealed class PsDocument : Document
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | प्रारंभ करता है`PsDocument` PS/EPS फ़ाइल की एक धारा के साथ. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | खाली आरंभ करता है`PsDocument` प्रारंभिक पृष्ठ के साथ. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | खाली आरंभ करता है`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | खाली आरंभ करता है`PsDocument` जब पोस्टस्क्रिप्ट दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो. |

## गुण

| नाम | विवरण |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | परिणामी PDF दस्तावेज़ में पृष्ठों की संख्या लौटाता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | वर्तमान ग्राफिक्स स्थिति में क्लिप जोड़ता है और "न्यूपाथ" ऑपरेटर लिखता है। इस क्लिपिंग पथ के संगम के से बचने के लिए करना आवश्यक है और कुछ बाद के पथ जैसे कि "चारपाथ" ऑपरेटर के साथ उल्लिखित ग्लिफ़। |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | क्लिपिंग आयत को वर्तमान ग्राफ़िक्स स्थिति में जोड़ता है. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | वर्तमान पृष्ठ पूर्ण करें. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | एक मनमाना रास्ता बनाएं। |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | नकाबपोश चित्र बनाएं. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | छवि बनाएं। |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | पृष्ठभूमि के साथ रूपांतरित छवि बनाएं। |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | मनमाना पथ भरें. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | ग्लिफ़ के अंदरूनी हिस्से को भरकर और ग्लिफ़ की रूपरेखा बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | ग्लिफ़ के अंदरूनी हिस्से को भरकर और ग्लिफ़ की रूपरेखा बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | ग्लिफ़ के अंदरूनी हिस्से को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | ग्लिफ़ के अंदरूनी हिस्से को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | वर्तमान ग्राफिक्स स्थिति का पेंट प्राप्त करता है। |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | वर्तमान ग्राफिक्स स्थिति का स्ट्रोक प्राप्त करता है। |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | PS/EPS फ़ाइल पढ़ता है और XmpMetdata निकालता है यदि यह पहले से मौजूद है या यदि यह मौजूद नहीं है तो नया जोड़ें। |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | पीएस/ईपीएस फाइलों को डिवाइस में मर्ज करता है। |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | नया पृष्ठ बनाता है और इसे वर्तमान पृष्ठ बनाता है. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | ग्लिफ़ की रूपरेखा बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | ग्लिफ़ की रूपरेखा बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | वर्तमान ग्राफ़िक्स स्थिति में रोटेशन जोड़ता है (वर्तमान मैट्रिक्स को घुमाएं) |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | बचत दी गई`PsDocument` ईपीएस फ़ाइल के रूप में। इस विधि का उपयोग केवल तभी किया जाता है जब PsDocument स्क्रैच से बनाया गया हो। |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | बचत दी गई`PsDocument` ईपीएस फ़ाइल के रूप में। इस विधि का उपयोग केवल XMP मेटाडेटा को अपडेट करने के बाद किया जाता है। यह प्रारंभिक EPS फ़ाइल को अपडेट किए गए मौजूदा मेटाडेटा या GetMetadata विधि को कॉल करते समय बनाए गए नए के साथ सहेजता है। अंतिम मामले में सभी आवश्यक पोस्टस्क्रिप्ट कोड और EPS टिप्पणियाँ जोड़ी जाती हैं। |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | पीएस/ईपीएस फाइल को डिवाइस में सेव करता है। |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | वर्तमान ग्राफ़िक्स स्थिति में स्केल जोड़ता है (स्केल करेंट मैट्रिक्स). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | पेज डिवाइस पैरामीटर सेट करता है (ऑपरेटर "सेटपेजडिवाइस" पोस्टस्क्रिप्ट स्पेसिफिकेशन देखें)। इनमें पेज साइज और कलर आदि हो सकते हैं। |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | पृष्ठ आकार सेट करता है। एक दस्तावेज़ में विभिन्न आकारों वाले पृष्ठ बनाने के लिए उपयोग करें[`SetPageDevice`](./setpagedevice/) विधि इस विधि के बाद। |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | पेंट को वर्तमान ग्राफिक्स स्थिति में सेट करता है। |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | वर्तमान ग्राफिक्स स्थिति में स्ट्रोक सेट करता है। |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | वर्तमान ग्राफिक्स स्थिति में कतरनी परिवर्तन जोड़ता है (वर्तमान मैट्रिक्स कतरनी)। |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | वर्तमान ग्राफिक्स स्थिति में परिवर्तन जोड़ता है (इस मैट्रिक्स को वर्तमान के साथ जोड़ता है)। |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | वर्तमान ग्राफिक्स स्थिति में अनुवाद जोड़ता है (वर्तमान मैट्रिक्स का अनुवाद करता है) . |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | वर्तमान ग्राफिक्स स्थिति को पुनर्स्थापित करने के लिए लिखता है (ऑपरेटर "ग्रेस्टोर" पर पोस्टस्क्रिप्ट विनिर्देश देखें)। |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | वर्तमान ग्राफिक्स स्थिति की बचत लिखता है (ऑपरेटर "जीएसएवी" पर पोस्टस्क्रिप्ट विनिर्देश देखें)। |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | बिटमैप ऑब्जेक्ट को ईपीएस आउटपुट स्ट्रीम में सहेजता है। |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | बिटमैप ऑब्जेक्ट को ईपीएस फ़ाइल में सहेजता है। |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | इनपुट स्ट्रीम से EPS आउटपुट स्ट्रीम में PNG/JPEG/TIFF/BMP/GIF/EMF इमेज सेव करता है। |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | फ़ाइल से EPS फ़ाइल में PNG/JPEG/TIFF/BMP/GIF/EMF छवि सहेजता है। |

### यह सभी देखें

* class [Document](../../aspose.page/document/)
* नाम स्थान [Aspose.Page.EPS](../../aspose.page.eps/)
* सभा [Aspose.Page](../../)


