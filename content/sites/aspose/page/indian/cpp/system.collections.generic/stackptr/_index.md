---
title: "System::Collections::Generic::StackPtr क्लास"
linktitle: "StackPtr"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::StackPtr क्लास। स्टैक पॉइंटर। यह प्रकार अन्य ऑब्जेक्ट''स डिलीशन को प्रबंधित करने के लिए एक पॉइंटर है। इसे स्टैक पर आवंटित किया जाना चाहिए और C++ में फ़ंक्शनों को मान द्वारा या const रेफ़रेंस द्वारा पास किया जाना चाहिए।"
type: docs
weight: 4700
url: /hi/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [StackPtr](./stackptr/)() | नल पॉइंटर बनाता है। |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | विशिष्ट स्टैक को संदर्भित करने वाला पॉइंटर बनाता है। |

## संबंधित देखें

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
