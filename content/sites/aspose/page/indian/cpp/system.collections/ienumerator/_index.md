---
title: "System::Collections::IEnumerator क्लास"
linktitle: "IEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::IEnumerator क्लास। एन्यूमरेटर का इंटरफ़ेस जो कुछ तत्वों के माध्यम से इटरेट करने के लिए उपयोग किया जा सकता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.collections/ienumerator/
---
## IEnumerator class


एन्यूमरेटर का इंटरफ़ेस जो कुछ तत्वों के माध्यम से इटरेट करने के लिए उपयोग किया जा सकता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Current](./current/)() const | वर्तमान तत्व प्राप्त करता है। |
| virtual [get_Current](./get_current/)() const | वर्तमान तत्व प्राप्त करता है। |
| virtual [MoveNext](./movenext/)() | एनेमरेटर को अगले तत्व पर ले जाता है। यदि पहले कोई तत्व संदर्भित नहीं था, तो उपलब्ध पहले तत्व को संदर्भित करता है। यदि कंटेनर के अंत तक पहुँचा गया, तो कुछ नहीं करता। |
| virtual [Reset](./reset/)() | एन्यूमरेटर को पहले तत्व से पहले की स्थिति पर रीसेट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ValueType](./valuetype/) | RTTI जानकारी। |

## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
