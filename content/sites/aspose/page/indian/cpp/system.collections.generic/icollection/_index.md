---
title: "System::Collections::Generic::ICollection क्लास"
linktitle: "ICollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::ICollection क्लास। तत्वों के संग्रह का इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि यह रनटाइम त्रुटियों और/या असर्शन फॉल्ट्स का कारण बन सकता है। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 1900
url: /hi/cpp/system.collections.generic/icollection/
---
## ICollection class


तत्वों के संग्रह का इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि यह रनटाइम त्रुटियों और/या असर्शन फॉल्ट्स का कारण बन सकता है। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Add](./add/)(const T\&) | संग्रह में तत्व जोड़ता है। |
| virtual [Clear](./clear/)() | संग्रह से सभी तत्व हटाता है। |
| virtual [Contains](./contains/)(const T\&) const | जाँचता है कि तत्व संग्रह में मौजूद है या नहीं। |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | सभी संग्रह तत्वों को मौजूदा एरे तत्वों में कॉपी करता है। |
| virtual [get_Count](./get_count/)() const | संग्रह में तत्वों की संख्या प्राप्त करता है। |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | जाँचता है कि कलेक्शन रीड‑ओनली है या नहीं। |
| [get_SyncRoot](./get_syncroot/)() const | संग्रह के माध्यम से सिंक्रनाइज़ किया जा रहा वस्तु प्राप्त करता है। |
| [ICollection](./icollection/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [ICollection](./icollection/)(const ICollection\&) | कॉपी कंस्ट्रक्टर। |
| [ICollection](./icollection/)(ICollection\&&) | मूव कंस्ट्रक्टर। |
| [operator=](./operator=/)(ICollection\&&) | मूव असाइनमेंट ऑपरेटर। |
| [operator=](./operator=/)(const ICollection\&) | मूव असाइनमेंट ऑपरेटर। |
| virtual [Remove](./remove/)(const T\&) | संग्रह से तत्व हटाता है। |
| virtual [~ICollection](./~icollection/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ThisType](./thistype/) | संग्रह प्रकार का नाम। |
| [ValueType](./valuetype/) | RTTI जानकारी। |

## संबंधित देखें

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
