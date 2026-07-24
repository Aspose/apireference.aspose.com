---
title: "System::Drawing::Imaging::EncoderParameter वर्ग"
linktitle: "EncoderParameter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::EncoderParameter वर्ग. यह एक कंटेनर के रूप में कार्य करता है जिसका उपयोग छवि एन्कोडर को मान पास करने के लिए किया जाता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


छवि एन्कोडर को मान पास करने के लिए उपयोग किए जाने वाले कंटेनर के रूप में कार्य करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class EncoderParameter : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो एक भिन्न को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो पूर्णांक मानों की सीमा को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो भिन्नों की सीमा को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो मानों की सरणी को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो मानों की सरणी को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो मानों की सरणी को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो भिन्नों की सरणी को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | एक नया [EncoderParameter](./) वर्ग का उदाहरण बनाता है जो पूर्णांकों की सीमाओं की सरणी को दर्शाता है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | एक नई [EncoderParameter](./) क्लास की इंस्टेंस बनाता है जो भिन्नों की रेंजों की एरे का प्रतिनिधित्व करती है। |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | एक नई [EncoderParameter](./) क्लास की इंस्टेंस बनाता है जो निर्दिष्ट बफ़र से पढ़े गए निर्दिष्ट प्रकार के निर्दिष्ट संख्या के मानों का प्रतिनिधित्व करती है। |
| [get_Encoder](./get_encoder/)() const | वर्तमान [EncoderParameter](./) ऑब्जेक्ट से संबंधित [Encoder](../encoder/) ऑब्जेक्ट को लौटाता है। |
| [get_NumberOfValues](./get_numberofvalues/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मानों की संख्या को लौटाता है। |
| [get_Type](./get_type/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान(ओं) का प्रकार लौटाता है। |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | निर्दिष्ट [Encoder](../encoder/) ऑब्जेक्ट को वर्तमान [EncoderParameter](./) ऑब्जेक्ट के साथ जोड़ता है। |
| [~EncoderParameter](./~encoderparameter/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
