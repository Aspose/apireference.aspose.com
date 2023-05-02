---
title: Class StringFormat
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.StringFormat कक्ष. टेक्स्ट लेआउट जनकर जैसे संरेखण अभवन्यस और टैब स्टप डस्प्ले मैनपुलेशन जैसे इलप्सस प्रवष्ट और रष्ट्रय अंक प्रतस्थपन और ओपनटइप सुवधओं क समहत करत है इस वर्ग क इनहेरट नहं कय ज सकत.
type: docs
weight: 1130
url: /hi/net/system.drawing/stringformat/
---
## StringFormat class

टेक्स्ट लेआउट जानकारी (जैसे संरेखण, अभिविन्यास और टैब स्टॉप) डिस्प्ले मैनीपुलेशन (जैसे इलिप्सिस प्रविष्टि और राष्ट्रीय अंक प्रतिस्थापन) और ओपनटाइप सुविधाओं को समाहित करता है। इस वर्ग को इनहेरिट नहीं किया जा सकता.

```csharp
public sealed class StringFormat : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`StringFormat` वर्ग. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | का एक नया उदाहरण प्रारंभ करता है`StringFormat` class निर्दिष्ट मौजूदा सेStringFormat वस्तु. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | का एक नया उदाहरण प्रारंभ करता है`StringFormat`निर्दिष्ट के साथ वर्गStringFormatFlags गणना. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | का एक नया उदाहरण प्रारंभ करता है`StringFormat` निर्दिष्ट के साथ वर्ग[`StringFormatFlags`](../stringformatflags/) गणना और भाषा. |

## गुण

| नाम | विवरण |
| --- | --- |
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | एक सामान्य डिफ़ॉल्ट प्राप्त करता हैStringFormat वस्तु. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | एक सामान्य टाइपोग्राफ़िक प्राप्त करता हैStringFormat वस्तु. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | वर्टिकल प्लेन पर टेक्स्ट अलाइनमेंट जानकारी प्राप्त या सेट करता है। |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | उस भाषा को प्राप्त करता है जिसका उपयोग तब किया जाता है जब स्थानीय अंकों को पश्चिमी अंकों के लिए प्रतिस्थापित किया जाता है। |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | अंक प्रतिस्थापन के लिए उपयोग की जाने वाली विधि प्राप्त करता है। |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | हो जाता है या सेट करता हैStringFormatFlags गणना जिसमें स्वरूपण जानकारी है। |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | हो जाता है या सेट करता हैHotkeyPrefixइसके लिए वस्तुStringFormat वस्तु. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | क्षैतिज तल पर रेखा संरेखण प्राप्त या सेट करता है। |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | हो जाता है या सेट करता हैStringTrimming इसके लिए गणनाStringFormat वस्तु. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | इसकी सटीक प्रति बनाता है`StringFormat` वस्तु। |
| [Dispose](../../system.drawing/stringformat/dispose/)() | इसके द्वारा उपयोग किए गए सभी संसाधनों को जारी करता हैStringFormat वस्तु. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | इसके लिए टैब स्टॉप प्राप्त करता हैStringFormat वस्तु. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | स्थानीय अंकों को पश्चिमी अंकों के लिए प्रतिस्थापित किए जाने पर उपयोग की जाने वाली भाषा और विधि को निर्दिष्ट करता है। |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | की एक सरणी निर्दिष्ट करता हैCharacterRange संरचनाएं जो कॉल द्वारा मापे गए वर्णों की श्रेणी का प्रतिनिधित्व करती हैंMeasureCharacterRanges विधि. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | इसके लिए टैब स्टॉप सेट करता हैStringFormat वस्तु. |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


