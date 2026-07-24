---
title: "System::Windows::Forms::IButtonControl class"
linktitle: "IButtonControl"
second_title: "Aspose.Page C++ के लिए"
description: "System::Windows::Forms::IButtonControl class. एक डमी क्लास जो IButtonControl इंटरफ़ेस का उपयोग करने वाले अनुवादित कोड को संकलनीय बनाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.windows.forms/ibuttoncontrol/
---
## IButtonControl class


एक डमी क्लास जो [IButtonControl](./) इंटरफ़ेस का उपयोग करने वाले अनुवादित कोड को संकलनीय बनाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class IButtonControl : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_DialogResult](./get_dialogresult/)() | RTTI जानकारी। |
| virtual [NotifyDefault](./notifydefault/)(bool) | नियंत्रण को डिफ़ॉल्ट या गैर-डिफ़ॉल्ट बनाता है। |
| virtual [PerformClick](./performclick/)() | बटन पर क्लिक करता है। |
| virtual [set_DialogResult](./set_dialogresult/)(DialogResult) | बटन से संबंधित डायलॉग परिणाम सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Windows::Forms](../)
* Library [Aspose.Page for C++](../../)
