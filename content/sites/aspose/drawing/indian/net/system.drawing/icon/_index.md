---
title: Class Icon
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Icon कक्ष. वंडज आइकन क प्रतनधत्व करत है ज एक छट बटमैप छव है जसक उपयग कस वस्तु क प्रतनधत्व करने के लए कय जत है आइकनं क परदर्श बटमैप्स के रूप में मन ज सकत है हलंक उनक आकर सस्टम द्वर नर्धरत कय जत है
type: docs
weight: 570
url: /hi/net/system.drawing/icon/
---
## Icon class

विंडोज आइकन का प्रतिनिधित्व करता है, जो एक छोटी बिटमैप छवि है जिसका उपयोग किसी वस्तु का प्रतिनिधित्व करने के लिए किया जाता है। आइकनों को पारदर्शी बिटमैप्स के रूप में माना जा सकता है, हालांकि उनका आकार सिस्टम द्वारा निर्धारित किया जाता है।

```csharp
public sealed class Icon : ICloneable, IDisposable, ISerializable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Icon](icon/#constructor_2)(Stream) | का एक नया उदाहरण प्रारंभ करता है`Icon` निर्दिष्ट डेटा स्ट्रीम से वर्ग। |
| [Icon](icon/#constructor_5)(string) | का एक नया उदाहरण प्रारंभ करता है`Icon` वर्ग निर्दिष्ट फ़ाइल नाम से. |
| [Icon](icon/#constructor_1)(Icon, Size) | का एक नया उदाहरण प्रारंभ करता है`Icon` वर्ग और आइकन का एक संस्करण खोजने का प्रयास करता है जो अनुरोधित आकार से मेल खाता है। |
| [Icon](icon/#constructor_4)(Stream, Size) | का एक नया उदाहरण प्रारंभ करता है`Icon` निर्दिष्ट स्ट्रीम से निर्दिष्ट आकार का वर्ग। |
| [Icon](icon/#constructor_7)(string, Size) | का एक नया उदाहरण प्रारंभ करता है`Icon` निर्दिष्ट फ़ाइल से निर्दिष्ट आकार का वर्ग। |
| [Icon](icon/#constructor_8)(Type, string) | का एक नया उदाहरण प्रारंभ करता है`Icon` निर्दिष्ट असेंबली में संसाधन से वर्ग। |
| [Icon](icon/#constructor)(Icon, int, int) | का एक नया उदाहरण प्रारंभ करता है`Icon` वर्ग और आइकन का एक संस्करण खोजने का प्रयास करता है जो अनुरोधित आकार से मेल खाता है.. |
| [Icon](icon/#constructor_3)(Stream, int, int) | का एक नया उदाहरण प्रारंभ करता है`Icon` वर्ग निर्दिष्ट डेटा स्ट्रीम से और निर्दिष्ट चौड़ाई और ऊंचाई के साथ। |
| [Icon](icon/#constructor_6)(string, int, int) | का एक नया उदाहरण प्रारंभ करता है`Icon` निर्दिष्ट फ़ाइल से निर्दिष्ट चौड़ाई और ऊंचाई के साथ वर्ग . |

## गुण

| नाम | विवरण |
| --- | --- |
| [Handle](../../system.drawing/icon/handle/) { get; } | इसके लिए हैंडल प्राप्त करता हैIcon . यह हैंडल की कॉपी नहीं है; इसे खाली मत करो. |
| [Height](../../system.drawing/icon/height/) { get; } | इसकी ऊंचाई प्राप्त करता हैIcon . |
| [Size](../../system.drawing/icon/size/) { get; } | इसका आकार प्राप्त करता हैIcon . |
| [Width](../../system.drawing/icon/width/) { get; } | इसकी चौड़ाई प्राप्त करता हैIcon . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [ExtractAssociatedIcon](../../system.drawing/icon/extractassociatedicon/)(string) | एक छवि का एक आइकन प्रतिनिधित्व देता है जो निर्दिष्ट फ़ाइल में निहित है। |
| static [FromHandle](../../system.drawing/icon/fromhandle/)(IntPtr) | एक GDI+ बनाता हैIcon निर्दिष्ट विंडोज हैंडल से एक आइकन (एचआईसीओएन) तक . |
| [Clone](../../system.drawing/icon/clone/)() | क्लोन करता हैIcon , डुप्लीकेट इमेज बनाना. |
| [Dispose](../../system.drawing/icon/dispose/)() | अप्रबंधित संसाधनों को मुक्त करने, जारी करने या रीसेट करने से संबंधित एप्लिकेशन-परिभाषित कार्य करता है। |
| [Save](../../system.drawing/icon/save/)(Stream) | इसे सहेजता हैIcon निर्दिष्ट आउटपुट के लिएStream . |
| [ToBitmap](../../system.drawing/icon/tobitmap/)() | इसे परिवर्तित करता हैIcon एक जीडीआई + के लिएBitmap . |
| override [ToString](../../system.drawing/icon/tostring/)() | एक मानव-पठनीय स्ट्रिंग प्राप्त करता है जो इसका वर्णन करता हैIcon . |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


