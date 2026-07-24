---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::SmartPtrInfo class. एक सर्विस क्लास जो SmartPtr की सामग्री को अंतिम प्रकार को जाने बिना टेस्ट और बदलती है। गैर्बेज कलेक्शन और लूप रेफ़रेंसेज़ डिटेक्शन आदि के लिए उपयोगी है। इसे ''pointer to pointer'' के रूप में सोचें। हम SmartPtr के बेसटाइप का उपयोग नहीं कर सकते क्योंकि वह मौजूद नहीं है; इसके बजाय, हम C++ में इस ''info'' क्लास का उपयोग करते हैं।"
type: docs
weight: 5600
url: /hi/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


एक सर्विस क्लास जो [SmartPtr](../smartptr/) की सामग्री को अंतिम प्रकार को जाने बिना टेस्ट और बदलता है। गैर्बेज कलेक्शन और लूप रेफ़रेंसेज़ डिटेक्शन आदि के लिए उपयोगी है। इसे 'pointer to pointer' के रूप में सोचें। हम [SmartPtr](../smartptr/) के बेसटाइप का उपयोग नहीं कर सकते क्योंकि वह मौजूद नहीं है; इसके बजाय, हम इस 'info' क्लास का उपयोग करते हैं।

```cpp
class SmartPtrInfo
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | रॉ ऑब्जेक्ट को प्राप्त करता है जिसका रेफ़रेंसेड पॉइंटर इशारा करता है। |
| [getObject](./getobject/)() const | ऑब्जेक्ट को प्राप्त करता है जिसका रेफ़रेंसेड पॉइंटर इशारा करता है। |
| [getOwned](./getowned/)() const | ऑब्जेक्ट के ओन्ड पॉइंटर को प्राप्त करता है। |
| [operator bool](./operatorbool/)() const | जाँचता है कि info ऑब्जेक्ट नॉन-नल पॉइंटर की ओर इशारा करता है या नहीं। |
| [operator!](./operator!/)() const | जाँचता है कि info ऑब्जेक्ट नॉन-नल पॉइंटर की ओर इशारा नहीं करता है। |
| [operator->](./operator-_/)() const | रेफ़रेंसेड पॉइंटर द्वारा इशारा किए गए [Object](../object/) की मेथड्स को कॉल करने की अनुमति देता है। |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | कम-तुलना करता है दो जानकारी वस्तुओं द्वारा संदर्भित पॉइंटर्स के मानों की। |
| [SmartPtrInfo](./smartptrinfo/)() | खाली [SmartPtrInfo](./) ऑब्जेक्ट बनाता है। |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | विशिष्ट स्मार्ट पॉइंटर की जानकारी के साथ [SmartPtrInfo](./) ऑब्जेक्ट बनाता है। |
## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
