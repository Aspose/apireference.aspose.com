---
title: Class EncoderParameter
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Imaging.EncoderParameter कक्ष. एक छव एन्कडर के लए मन य मनं क सरण पस करने के लए प्रयुक्त हत है
type: docs
weight: 700
url: /hi/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

एक छवि एन्कोडर के लिए मान, या मानों की सरणी पास करने के लिए प्रयुक्त होता है।

```csharp
public sealed class EncoderParameter : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter` निर्दिष्ट के साथ वर्गEncoder object और एक अहस्ताक्षरित 8-बिट पूर्णांक। सेट करता हैValueType संपत्ति सेValueTypeByte , और सेट करता हैNumberOfValues गुण 1. |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और अहस्ताक्षरित 8-बिट पूर्णांकों की एक सरणी। सेट करता हैValueType संपत्ति कोValueTypeByte , और सेट करता हैNumberOfValues सरणी में तत्वों की संख्या के लिए गुण। |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और एक 64-बिट पूर्णांक। सेट करता हैValueType संपत्ति सेValueTypeLong (32 बिट), और the सेट करता हैNumberOfValues संपत्ति 1. |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और 64-बिट पूर्णांकों की एक सरणी। सेट करता हैValueType संपत्ति कोValueTypeLong (32-बिट), और set theNumberOfValues सरणी में तत्वों की संख्या के लिए गुण। |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और एक, 16-बिट पूर्णांक। सेट करता हैValueType संपत्ति सेValueTypeShort , और सेट करता हैNumberOfValues गुण 1. |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder ऑब्जेक्ट और 16-बिट पूर्णांकों की एक सरणी। सेट करता हैValueType संपत्ति कोValueTypeShort , और the सेट करता हैNumberOfValues सरणी में तत्वों की संख्या के लिए गुण। |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और एक वर्ण स्ट्रिंग। स्ट्रिंग को से पहले एक अशक्त-समाप्त ASCII स्ट्रिंग में परिवर्तित कर दिया जाता है, जिसमें इसे संग्रहीत किया जाता हैEncoderParameter वस्तु। सेट करता हैValueType संपत्ति कोValueTypeAscii , और सेट NumberOfValues NULL टर्मिनेटर सहित ASCII स्ट्रिंग की लंबाई की संपत्ति। |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और एक 8-बिट मान। सेट करता हैValueType संपत्ति सेValueTypeUndefined याValueTypeByte , और सेट करता हैNumberOfValues संपत्ति 1. |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और बाइट्स की एक सरणी। सेट करता हैValueType संपत्ति कोValueTypeUndefined या ValueTypeByte , और सेट करता हैNumberOfValues सरणी में तत्वों की संख्या के लिए गुण. |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoderऑब्जेक्ट और 32-बिट पूर्णांकों की एक जोड़ी। पूर्णांकों की जोड़ी एक अंश का प्रतिनिधित्व करती है, पहला पूर्णांक अंश है, और दूसरा पूर्णांक भाजक है। सेट करता हैValueType संपत्ति कोValueTypeRational , और सेट करता हैNumberOfValues संपत्ति 1. |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और 32-बिट पूर्णांकों की दो सरणियाँ। दो सरणियाँ भिन्नों की एक सरणी का प्रतिनिधित्व करती हैं। सेट करता हैValueType संपत्ति कोValueTypeRational , और सेट करता हैNumberOfValuesमें तत्वों की संख्या के लिए संपत्ति*numerator* सरणी, जो तत्वों की संख्या के समान होनी चाहिए*denominator* सरणी। |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder ऑब्जेक्ट और 64-बिट पूर्णांकों की एक जोड़ी। पूर्णांकों की जोड़ी पूर्णांकों की एक श्रेणी का प्रतिनिधित्व करती है, पहला पूर्णांक श्रेणी में सबसे छोटी संख्या है, और दूसरा पूर्णांक श्रेणी में सबसे बड़ी संख्या है। सेट करता हैValueType संपत्ति कोValueTypeLongRange , और सेट करता हैNumberOfValues संपत्ति 1. |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और 64-बिट पूर्णांकों की दो सरणियाँ। दो सरणियाँ एक सरणी पूर्णांक श्रेणियों का प्रतिनिधित्व करती हैं। सेट करता हैValueType संपत्ति कोValueTypeLongRange , और सेट करता हैNumberOfValuesमें तत्वों की संख्या के लिए संपत्ति*rangebegin* सरणी, जो तत्वों की संख्या के समान होनी चाहिए*rangeend* सरणी. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder ऑब्जेक्ट और तीन पूर्णांक जो मानों की संख्या निर्दिष्ट करते हैं, मानों का डेटा प्रकार, और इसमें संग्रहीत मानों के लिए सूचकEncoderParameter वस्तु. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder ऑब्जेक्ट और चार, 32-बिट पूर्णांक। चार पूर्णांक भिन्नों की एक श्रेणी का प्रतिनिधित्व करते हैं। पहले दो पूर्णांक सीमा में सबसे छोटे अंश का प्रतिनिधित्व करते हैं, और शेष दो पूर्णांक सीमा के सबसे बड़े अंश का प्रतिनिधित्व करते हैं। सेट करता हैValueType संपत्ति to ValueTypeRationalRange , और सेट NumberOfValues संपत्ति 1. |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | का एक नया उदाहरण प्रारंभ करता है`EncoderParameter`निर्दिष्ट के साथ वर्गEncoder वस्तु और 32-बिट पूर्णांकों की चार सरणियाँ। चार सरणियाँ एक सरणी परिमेय श्रेणी का प्रतिनिधित्व करती हैं।ValueType संपत्ति कोValueTypeRationalRange , और सेट करता हैNumberOfValues गुण in तत्वों की संख्या के लिए*numerator1* सरणी, जो अन्य तीन सरणियों में तत्वों की संख्या के समान होनी चाहिए। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | हो जाता है या सेट करता हैEncoder इससे जुड़ी वस्तुEncoderParameter वस्तु. Encoder ऑब्जेक्ट वैश्विक रूप से अद्वितीय पहचानकर्ता (GUID) को समाहित करता है जो श्रेणी निर्दिष्ट करता है (उदाहरण के लिएQuality ,ColorDepth , याCompression ) इसमें संग्रहीत पैरामीटर काEncoderParameter वस्तु. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | इसमें संग्रहीत मानों की सरणी में तत्वों की संख्या प्राप्त करता हैEncoderParameter वस्तु. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | इसके द्वारा उपयोग किए गए सभी संसाधनों को जारी करता हैEncoderParameter वस्तु. |

### यह सभी देखें

* नाम स्थान [System.Drawing.Imaging](../../system.drawing.imaging/)
* सभा [Aspose.Drawing](../../)


