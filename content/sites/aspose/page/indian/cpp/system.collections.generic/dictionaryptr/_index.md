---
title: "System::Collections::Generic::DictionaryPtr क्लास"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::DictionaryPtr क्लास। ऑपरेटर ओवरलोड के साथ डिक्शनरी पॉइंटर क्लास। यह प्रकार अन्य ऑब्जेक्ट की हटाने को प्रबंधित करने के लिए एक पॉइंटर है। इसे स्टैक पर आवंटित किया जाना चाहिए और C++ में फ़ंक्शनों को मान द्वारा या स्थिर संदर्भ द्वारा पास किया जाना चाहिए।"
type: docs
weight: 1300
url: /hi/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | कुंजी प्रकार। |
| V | वैल्यू टाइप। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | नल पॉइंटर को इनिशियलाइज़ करता है। |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | पॉइंटर प्रकार को परिवर्तित करता है। |
| [operator[]](./operator[]/)(const X\&) const | कुंजी प्रकार रूपांतरण के साथ काम करने के लिए एक्सेस ऑपरेटर। |
| [operator[]](./operator[]/)(const T\&) const | एक्सेस ऑपरेटर। |

## संबंधित देखें

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
