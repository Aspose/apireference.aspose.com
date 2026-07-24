---
title: "System::Security::SecureString क्लास"
linktitle: "SecureString"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::SecureString क्लास। Secure string, वह टेक्स्ट दर्शाता है जिसे गोपनीय रखा जाना चाहिए। यह क्लास आंतरिक डेटा को एन्क्रिप्ट नहीं करती। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.security/securestring/
---
## SecureString class


Secure string, वह टेक्स्ट दर्शाता है जिसे गोपनीय रखा जाना चाहिए। यह क्लास आंतरिक डेटा को एन्क्रिप्ट नहीं करती। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class SecureString : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | स्ट्रिंग के अंत में एक अक्षर जोड़ता है। |
| [Clear](./clear/)() | वर्तमान SecureString से सभी अक्षर हटाएँ। |
| [Copy](./copy/)() const | इस SecureString की एक प्रतिलिपि बनाता है। |
| [Dispose](./dispose/)() override | वर्तमान ऑब्जेक्ट द्वारा उपयोग किए गए सभी संसाधनों को मुक्त करें। |
| [get_Length](./get_length/)() const | इस सुरक्षित स्ट्रिंग में अक्षरों की संख्या प्राप्त करता है। |
| [InsertAt](./insertat/)(int32_t, char16_t) | निर्दिष्ट इंडेक्स पर एक अक्षर सम्मिलित करता है। |
| [IsReadOnly](./isreadonly/)() const | यह फ़्लैग प्राप्त करता है जो दर्शाता है कि यह ऑब्जेक्ट केवल-पढ़ने के लिए चिह्नित है या नहीं। |
| [MakeReadOnly](./makereadonly/)() | इस सुरक्षित स्ट्रिंग को केवल-पढ़ने योग्य बनाता है। |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | निर्दिष्ट स्थिति पर अक्षर को हटाता है। |
| [SecureString](./securestring/)() | RTTI जानकारी। |
| [SecureString](./securestring/)(const char16_t *, int32_t) | निर्माता। |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | निर्दिष्ट स्थिति पर मौजूदा अक्षर को बदलता है। |
| [ToUnsecureString](./tounsecurestring/)() const | इस सुरक्षित स्ट्रिंग की सामग्री को असुरक्षित [String](../../system/string/) ऑब्जेक्ट में कॉपी करता है। सावधानी से उपयोग करें। |
| [~SecureString](./~securestring/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
