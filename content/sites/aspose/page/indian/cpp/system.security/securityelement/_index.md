---
title: "System::Security::SecurityElement क्लास"
linktitle: "SecurityElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::SecurityElement क्लास। सुरक्षा ऑब्जेक्ट को एन्कोड करने के लिए XML ऑब्जेक्ट मॉडल। लागू नहीं किया गया है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.security/securityelement/
---
## SecurityElement class


सुरक्षा ऑब्जेक्ट को एन्कोड करने के लिए XML ऑब्जेक्ट मॉडल। लागू नहीं किया गया है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class SecurityElement : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | टैग में एट्रिब्यूट जोड़ता है। |
| [AddChild](./addchild/)(SecurityElement) | चाइल्ड टैग जोड़ता है। |
| [Attribute](./attribute/)(const String\&) | एट्रिब्यूट मान प्राप्त करता है। |
| [Copy](./copy/)() | टैग की क्लोन बनाता है। |
| [Equal](./equal/)(SecurityElement) | पैरामीटर की समानता की जाँच करता है। |
| static [Escape](./escape/)(const String\&) | XML स्ट्रिंग में अक्षरों को एस्केप करता है। |
| static [FromString](./fromstring/)(const String\&) | XML कोड से एलिमेंट बनाता है। |
| [get_Attributes](./get_attributes/)() | टैग के एट्रिब्यूट प्राप्त करता है। |
| [get_Children](./get_children/)() | टैग के चाइल्ड ऑब्जेक्ट प्राप्त करता है। |
| [get_Tag](./get_tag/)() | टैग का नाम प्राप्त करता है। |
| [get_Text](./get_text/)() | टैग का आंतरिक टेक्स्ट प्राप्त करता है। |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | जाँचता है कि एट्रिब्यूट नाम वैध है या नहीं। |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | जाँचता है कि एट्रिब्यूट मान वैध है या नहीं। |
| static [IsValidTag](./isvalidtag/)(const String\&) | जाँचता है कि टैग वैध है या नहीं। |
| static [IsValidText](./isvalidtext/)(const String\&) | जाँचता है कि पाठ मान्य है। |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | नाम के आधार पर चाइल्ड टैग प्राप्त करता है। |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | टैग नाम के आधार पर चाइल्ड टैग का आंतरिक पाठ प्राप्त करता है। |
| [SecurityElement](./securityelement/)(const String\&) | निर्माता। |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | निर्माता। |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | टैग गुण सेट करता है। |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | टैग के चाइल्ड ऑब्जेक्ट सेट करता है। |
| [set_Tag](./set_tag/)(const String\&) | टैग का नाम सेट करता है। |
| [set_Text](./set_text/)(const String\&) | टैग का आंतरिक पाठ सेट करता है। |
| [ToString](./tostring/)() const override | टैग को स्ट्रिंग में बदलता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
