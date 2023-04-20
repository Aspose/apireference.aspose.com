---
title: Interface IDevice
second_title: .NET API संदर्भ के लिए Aspose.SVG
description: Aspose.Svg.Rendering.IDevice इंटरफेस. पथ पठ और छवयं जैसे ग्रफक तत्वं के कस्टम प्रतपदन क समर्थन करने वले तरकं और गुणं क परभषत करत है
type: docs
weight: 2810
url: /hi/net/aspose.svg.rendering/idevice/
---
## IDevice interface

पथ, पाठ और छवियों जैसे ग्राफिक तत्वों के कस्टम प्रतिपादन का समर्थन करने वाले तरीकों और गुणों को परिभाषित करता है।

```csharp
public interface IDevice : IDisposable
```

## गुण

| नाम | विवरण |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext/) { get; } | ग्राफिक संदर्भ प्राप्त करता है। |
| [Options](../../aspose.svg.rendering/idevice/options/) { get; } | रेंडरिंग विकल्प प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect/)(RectangleF) | एक पूर्ण उपपथ के रूप में वर्तमान पथ में एक आयत जोड़ता है। |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument/)(Document) | दस्तावेज़ का प्रतिपादन शुरू करता है। |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement/)(Element, RectangleF) | तत्व का प्रतिपादन शुरू करता है। |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage/)(SizeF) | नए पेज की रेंडरिंग शुरू करता है। |
| [Clip](../../aspose.svg.rendering/idevice/clip/)(FillMode) | भरने के क्षेत्र को निर्धारित करने के लिए फिलमोड नियम का उपयोग करके वर्तमान क्लिपिंग पथ को वर्तमान पथ से काटकर संशोधित करता है। यह विधि वर्तमान पथ को समाप्त करती है। |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath/)() | वर्तमान बिंदु से उपपथ के प्रारंभिक बिंदु तक एक सीधी रेखा खंड जोड़कर वर्तमान उपपथ को बंद करता है। यदि वर्तमान उपपथ पहले से ही बंद है, तो "ClosePath" कुछ नहीं करता है। यह ऑपरेटर वर्तमान उपपथ को समाप्त कर देता है। वर्तमान पथ में एक और खंड जोड़ने से एक नया उपपथ शुरू होता है, भले ही नया खंड "क्लोजपाथ" विधि द्वारा पहुंचे समापन बिंदु पर शुरू होता है। |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto/)(PointF, PointF, PointF) | एक घन बेज़ियर वक्र को वर्तमान पथ में जोड़ता है। वक्र वर्तमान बिंदु से बिंदु pt3, तक pt1 और pt2 को बेज़ियर नियंत्रण बिंदुओं के रूप में उपयोग करता है। नया वर्तमान बिंदु pt3. है |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage/)(byte[], ImageType, RectangleF) | निर्दिष्ट छवि बनाता है। |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument/)() | दस्तावेज़ का प्रतिपादन समाप्त करता है। |
| [EndElement](../../aspose.svg.rendering/idevice/endelement/)(Element) | तत्व का प्रतिपादन समाप्त करता है। |
| [EndPage](../../aspose.svg.rendering/idevice/endpage/)() | वर्तमान पृष्ठ का प्रतिपादन समाप्त करता है। |
| [Fill](../../aspose.svg.rendering/idevice/fill/)(FillMode) | वर्तमान पथ से घिरे पूरे क्षेत्र को भरता है। यदि पथ में कई डिस्कनेक्ट किए गए उपपथ होते हैं, तो यह सभी उपपथों के अंदर भरता है, को एक साथ माना जाता है। यह विधि वर्तमान पथ को समाप्त करती है। |
| [FillText](../../aspose.svg.rendering/idevice/filltext/)(string, PointF) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट स्थान पर भरता है। |
| [Flush](../../aspose.svg.rendering/idevice/flush/)() | सभी डेटा को आउटपुट स्ट्रीम में फ़्लश करता है. |
| [LineTo](../../aspose.svg.rendering/idevice/lineto/)(PointF) | वर्तमान बिंदु से बिंदु (पीटी) तक एक सीधी रेखा खंड जोड़ता है। नया वर्तमान बिंदु pt. है |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto/)(PointF) | किसी भी कनेक्टिंग लाइन सेगमेंट को छोड़ते हुए, वर्तमान बिंदु को पैरामीटर pt के निर्देशांक में ले जाकर एक नया उपपथ शुरू करता है। यदि वर्तमान पथ में पिछली पथ निर्माण विधि भी "MoveTo" थी, तो नई "MoveTo" इसे ओवरराइड कर देती है; पिछले "मूव टू" ऑपरेशन का कोई अवशेष पथ में नहीं रहता है। |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext/)() | पूरे ग्राफिक्स संदर्भ को स्टैक से पॉप करके उसके पूर्व मान पर पुनर्स्थापित करता है। |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext/)() | स्टैक पर संपूर्ण ग्राफ़िक्स संदर्भ की एक प्रति पुश करता है. |
| [Stroke](../../aspose.svg.rendering/idevice/stroke/)() | वर्तमान पथ के साथ एक रेखा को स्ट्रोक करता है। स्ट्रोक की गई रेखा पथ में प्रत्येक सीधे या घुमावदार खंड का अनुसरण करती है, इसके समानांतर भुजाओं वाले खंड पर केंद्रित होती है। पथ के प्रत्येक उपपथ को अलग से व्यवहार किया जाता है। यह विधि वर्तमान पथ को समाप्त करती है। |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill/)(FillMode) | स्ट्रोक और वर्तमान पथ भरें। यह विधि वर्तमान पथ को समाप्त करती है। |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext/)(string, PointF) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट स्थान पर स्ट्रोक करता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* सभा [Aspose.SVG](../../)


