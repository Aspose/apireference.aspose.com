---
title: "System::IComparable क्लास"
linktitle: "IComparable"
second_title: "Aspose.Page C++ के लिए"
description: "System::IComparable क्लास। दो ऑब्जेक्ट्स की तुलना करने वाला मेथड परिभाषित करता है। इस क्लास के ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके इंस्टैंस नहीं बनाएं, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 3300
url: /hi/cpp/system/icomparable/
---
## IComparable class


दो ऑब्जेक्ट्स की तुलना करने वाला मेथड परिभाषित करता है। इस क्लास के ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके इंस्टैंस नहीं बनाएं, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन आर्ग्यूमेंट के रूप में पास करें।

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वर्तमान ऑब्जेक्ट की तुलना में उपयोग होने वाले ऑब्जेक्ट्स का प्रकार |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | वर्तमान ऑब्जेक्ट की निर्दिष्ट ऑब्जेक्ट से तुलना करता है। |

## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
