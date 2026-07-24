---
title: "System::Security::Cryptography::SymmetricAlgorithm क्लास"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::SymmetricAlgorithm क्लास। एन्क्रिप्शन और डिक्रिप्शन के लिए समान कुंजी का उपयोग करने वाला सममित एल्गोरिदम बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 4900
url: /hi/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


सममित एल्गोरिदम जो एन्क्रिप्शन और डिक्रिप्शन के लिए समान कुंजी का उपयोग करता है, बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)(const String\&) | एल्गोरिदम इंस्टेंस बनाता है। |
| virtual [CreateDecryptor](./createdecryptor/)() | एल्गोरिदम ऑब्जेक्ट से जुड़े पैरामीटरों के साथ डिक्रिप्टर बनाता है। |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | स्पष्ट पैरामीटरों के साथ डिक्रिप्टर बनाता है। |
| virtual [CreateEncryptor](./createencryptor/)() | एल्गोरिदम ऑब्जेक्ट से जुड़े पैरामीटरों के साथ एन्क्रिप्टर बनाता है। |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | स्पष्ट पैरामीटरों के साथ एन्क्रिप्टर बनाता है। |
| virtual [GenerateIV](./generateiv/)() | एल्गोरिदम के लिए रैंडम प्रारंभिक मान उत्पन्न करता है। मौजूदा मान को अधिलेखित करता है (यदि कोई हो)। |
| virtual [GenerateKey](./generatekey/)() | एल्गोरिदम के लिए रैंडम कुंजी उत्पन्न करता है। मौजूदा कुंजी को अधिलेखित करता है (यदि कोई हो)। |
| virtual [get_BlockSize](./get_blocksize/)() | क्रिप्टोग्राफिक ऑपरेशन का ब्लॉक आकार प्राप्त करता है। |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | क्रिप्टोग्राफिक ऑपरेशन का फीडबैक आकार प्राप्त करता है। |
| virtual [get_IV](./get_iv/)() | क्रिप्टोग्राफिक ऑपरेशन का प्रारंभिक मान प्राप्त करता है। यदि अभी तक नहीं बना है तो नया बनाता है। |
| virtual [get_Key](./get_key/)() | क्रिप्टोग्राफिक ऑपरेशन की कुंजी प्राप्त करता है। यदि अभी तक नहीं बनी है तो नई बनाता है। |
| virtual [get_KeySize](./get_keysize/)() | क्रिप्टोग्राफिक ऑपरेशन की कुंजी का आकार प्राप्त करता है। |
| virtual [get_Mode](./get_mode/)() | क्रिप्टोग्राफिक ऑपरेशन का मोड प्राप्त करता है। |
| virtual [get_Padding](./get_padding/)() | क्रिप्टोग्राफिक ऑपरेशन का पैडिंग प्राप्त करता है। |
| virtual [set_BlockSize](./set_blocksize/)(int) | क्रिप्टोग्राफिक ऑपरेशन का ब्लॉक आकार सेट करता है। |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | क्रिप्टोग्राफिक ऑपरेशन का फीडबैक आकार सेट करता है। |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | क्रिप्टोग्राफिक ऑपरेशन का प्रारंभिक मान सेट करता है। |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | क्रिप्टोग्राफिक ऑपरेशन की कुंजी सेट करता है। |
| virtual [set_KeySize](./set_keysize/)(int) | क्रिप्टोग्राफिक ऑपरेशन की कुंजी का आकार सेट करता है। |
| virtual [set_Mode](./set_mode/)(CipherMode) | क्रिप्टोग्राफिक ऑपरेशन का मोड सेट करता है। |
| virtual [set_Padding](./set_padding/)(PaddingMode) | क्रिप्टोग्राफिक ऑपरेशन की पैडिंग सेट करता है। |
| [ValidKeySize](./validkeysize/)(int) | जाँचता है कि कुंजी का आकार वैध है या नहीं। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
