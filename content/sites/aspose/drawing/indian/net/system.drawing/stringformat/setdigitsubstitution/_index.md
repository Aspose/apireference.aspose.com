---
title: StringFormat.SetDigitSubstitution
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: StringFormat तरक. स्थनय अंकं क पश्चम अंकं के लए प्रतस्थपत कए जने पर उपयग क जने वल भष और वध क नर्दष्ट करत है
type: docs
weight: 140
url: /hi/net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

स्थानीय अंकों को पश्चिमी अंकों के लिए प्रतिस्थापित किए जाने पर उपयोग की जाने वाली भाषा और विधि को निर्दिष्ट करता है।

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| language | Int32 | एक राष्ट्रीय भाषा समर्थन (NLS) भाषा पहचानकर्ता जो उस भाषा की पहचान करता है जिसका उपयोग तब किया जाएगा जब स्थानीय अंकों को पश्चिमी अंकों के लिए प्रतिस्थापित किया जाएगा। आप पास कर सकते हैंLCID a की संपत्तिCultureInfo एनएलएस भाषा पहचानकर्ता के रूप में ऑब्जेक्ट. उदाहरण के लिए, मान लीजिए कि आप एक बनाते हैंCultureInfo ऑब्जेक्ट by स्ट्रिंग पास कर रहा है`"एआर-ईजी"` एक के लिएCultureInfo कंस्ट्रक्टर. यदि आप पास करते हैंLCID उस की संपत्तिCultureInfo वस्तु के साथTraditional को Int32,StringDigitSubstitute) विधि, तो प्रदर्शन समय पर अरबी-इंडिक अंकों को पश्चिमी अंकों के लिए प्रतिस्थापित किया जाएगा। |
| substitute | StringDigitSubstitute | का एक तत्वStringDigitSubstitute गणना जो निर्दिष्ट करती है कि अंक कैसे प्रदर्शित होते हैं। |

### यह सभी देखें

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* नाम स्थान [System.Drawing](../../stringformat/)
* सभा [Aspose.Drawing](../../../)


