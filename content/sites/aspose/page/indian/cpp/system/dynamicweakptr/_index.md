---
title: "System::DynamicWeakPtr क्लास"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page C++ के लिए"
description: "System::DynamicWeakPtr क्लास। स्मार्ट पॉइंटर क्लास जो संग्रहीत ऑब्जेक्ट के टेम्प्लेट आर्ग्यूमेंट्स के पॉइंटर मोड को ट्रैक करता है और प्रत्येक असाइनमेंट के बाद उन्हें अपडेट करता है। यह प्रकार अन्य ऑब्जेक्ट की डिलीशन को प्रबंधित करने के लिए एक पॉइंटर है। इसे स्टैक पर अलोकेट किया जाना चाहिए और C++ में फ़ंक्शन्स को वैल्यू या कॉन्स्ट रेफ़रेंस द्वारा पास किया जाना चाहिए।"
type: docs
weight: 2200
url: /hi/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


स्मार्ट पॉइंटर क्लास जो संग्रहीत ऑब्जेक्ट के टेम्प्लेट आर्ग्युमेंट्स के पॉइंटर मोड्स को ट्रैक करता है और प्रत्येक असाइनमेंट के बाद उन्हें अपडेट करता है। यह प्रकार अन्य ऑब्जेक्ट की डिलीशन को प्रबंधित करने के लिए एक पॉइंटर है। इसे स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शन्स को वैल्यू या कॉन्स्ट रेफ़रेंस द्वारा पास किया जाना चाहिए।

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| Pointee | टाइप। |
| trunkMode | स्मार्ट पॉइंटर स्वयं का मोड, शेयरड या वीक। |
| weakLeafs | संग्रहीत टाइप के टेम्प्लेट आर्ग्यूमेंट्स के इंडेक्स जिन्हें वीक पॉइंटर मोड पर सेट किया जाना चाहिए। |
## Nested classes

* Class [Reference](./reference/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | नल स्मार्ट पॉइंटर बनाता है। |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | दिए गए ऑब्जेक्ट की ओर इशारा करने वाला स्मार्ट पॉइंटर बनाता है। |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | स्मार्ट पॉइंटर को कॉपी-कंस्ट्रक्ट करता है। |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | स्मार्ट पॉइंटर को कॉपी-कंस्ट्रक्ट करता है। |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | स्मार्ट पॉइंटर को कॉपी-कंस्ट्रक्ट करता है। |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | स्मार्ट पॉइंटर को मूव-कंस्ट्रक्ट करता है। |
| [operator=](./operator=/)(SmartPtr_\&&) | स्मार्ट पॉइंटर को मूव-असाइन करता है। |
| [operator=](./operator=/)(const SmartPtr_\&) | स्मार्ट पॉइंटर को कॉपी-असाइन करता है। |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | स्मार्ट पॉइंटर को कॉपी-असाइन करता है। |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | स्मार्ट पॉइंटर को असाइन करता है। |
| [operator=](./operator=/)(std::nullptr_t) | स्मार्ट पॉइंटर को नल सेट करता है। |
| [operator==](./operator==/)(std::nullptr_t) const | जाँचता है कि स्मार्ट पॉइंटर null है या नहीं। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | सेल्फ टाइप एलियास। |
| [Pointee_](./pointee_/) | संदर्भित प्रकार। |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) बेसक्लास एलियास। |

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
