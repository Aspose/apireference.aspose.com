---
title: "System::Collections::Generic::SimpleEnumerator क्लास"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::SimpleEnumerator क्लास। सरल कंटेनरों के लिए इटररेटर क्लास जो तत्वों को सीधे rbegin() और rend() फ़ंक्शनों का उपयोग करके रखती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि यह रनटाइम त्रुटियों और/या असर्शन फॉल्ट्स का कारण बन सकता है। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 3900
url: /hi/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


सरल कंटेनरों के लिए इटररेटर क्लास जो तत्वों को सीधे rbegin() और rend() फ़ंक्शनों का उपयोग करके रखती है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि यह रनटाइम त्रुटियों और/या असर्शन फॉल्ट्स का कारण बन सकता है। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| पैरामीटर | विवरण |
| --- | --- |
| कंटेनर | इटररेट करने के लिए कंटेनर प्रकार। |
| Element | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| [get_Current](./get_current/)() const override | 'current' तत्व प्राप्त करता है। |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | सरल इटररेटर बनाता है। |

## संबंधित देखें

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
