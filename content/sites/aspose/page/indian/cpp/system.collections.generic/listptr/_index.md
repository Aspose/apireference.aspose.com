---
title: "System::Collections::Generic::ListPtr क्लास"
linktitle: "ListPtr"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::ListPtr क्लास। एक्सेस ऑपरेटरों के साथ सूची पॉइंटर। यह प्रकार अन्य ऑब्जेक्ट''स डिलीशन को प्रबंधित करने के लिए एक पॉइंटर है। इसे स्टैक पर आवंटित किया जाना चाहिए और C++ में फ़ंक्शनों को मान द्वारा या const रेफ़रेंस द्वारा पास किया जाना चाहिए।"
type: docs
weight: 3500
url: /hi/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | नल-पॉइंटर को प्रारंभ करता है। |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | निर्दिष्ट सूची के लिए पॉइंटर को प्रारंभ करता है। |
| [operator==](./operator==/)(std::nullptr_t) const | जाँचता है कि [List](../list/) पॉइंटर नल है या नहीं। |
| [operator[]](./operator[]/)(int) | एक्सेसर। |
| [operator[]](./operator[]/)(int) const | एक्सेसर। |
## संबंधित देखें

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
