---
title: "System::Collections::Generic::LinkedListNode वर्ग"
linktitle: "LinkedListNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::LinkedListNode वर्ग। लिंक्ड लिस्ट का नोड। यह std::list के इटरेटर के ऊपर एक रैपर को लागू करता है जो लिंक्ड लिस्ट में लिपटा हुआ है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3200
url: /hi/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


लिंक्ड लिस्ट का नोड। यह std::list के इटरेटर के ऊपर एक रैपर को लागू करता है जो लिंक्ड लिस्ट में लिपटा हुआ है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | संग्रहीत वैल्यू प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_List](./get_list/)() const | समावेशी सूची प्राप्त करता है। |
| [get_Next](./get_next/)() const | अगला नोड प्राप्त करता है। |
| [get_Previous](./get_previous/)() const | पिछले नोड को प्राप्त करता है। |
| [get_Value](./get_value/)() const | संग्रहीत मान को प्राप्त करता है। |
| [LinkedListNode](./linkedlistnode/)(const T\&) | निर्माता। |
| [set_Value](./set_value/)(const T\&) | संग्रहीत मान को सेट करता है। |

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
