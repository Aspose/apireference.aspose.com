---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> क्लास"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page C++ के लिए"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> क्लास। डेलीगेट्स का एक संग्रह दर्शाता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या संदर्भ द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 4500
url: /hi/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


डेलीगेट्स का एक संग्रह दर्शाता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या संदर्भ द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) क्लास का उपयोग न करें।

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| पैरामीटर | विवरण |
| --- | --- |
| ReturnType | संग्रह में प्रत्येक डेलीगेट द्वारा संकेतित इनवोक करने योग्य इकाइयों का रिटर्न टाइप |
| ArgumentTypes | संग्रह में प्रत्येक डेलीगेट द्वारा संकेतित इनवोक करने योग्य इकाइयों की आर्ग्युमेंट सूची |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | लागू नहीं किया गया। |
| [connect](./connect/)(Callback) | निर्दिष्ट डेलीगेट को संग्रह में जोड़ता है। |
| [connect](./connect/)(std::function\<R(Args...)>) | निर्दिष्ट फ़ंक्शन ऑब्जेक्ट को डेलीगेट संग्रह में जोड़ता है। फ़ंक्शन ऑब्जेक्ट को संग्रह में जोड़ने से पहले [Callback](./callback/) डेलीगेट टाइप में परिवर्तित किया जाता है। |
| [connect](./connect/)(MulticastDelegate\&) | निर्दिष्ट MulticastDelegate ऑब्जेक्ट को डेलीगेट संग्रह में जोड़ता है। |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट गैर-स्थैतिक मेथड को डेलीगेट संग्रह में जोड़ता है। |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट गैर-स्थैतिक मेथड को डेलीगेट संग्रह में जोड़ता है। |
| [disconnect](./disconnect/)(Callback) | निर्दिष्ट डेलीगेट को डेलीगेट संग्रह से हटाता है। |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट गैर-स्थैतिक मेथड को डेलीगेट संग्रह से हटाता है। |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट गैर-स्थैतिक मेथड को डेलीगेट संग्रह से हटाता है। |
| [disconnect](./disconnect/)(MulticastDelegate\&) | निर्दिष्ट MulticastDelegate ऑब्जेक्ट को डेलीगेट संग्रह से हटाता है। |
| [disconnect_all_slots](./disconnect_all_slots/)() | डेलीगेट संग्रह से सभी डेलीगेट्स को हटाता है। |
| [empty](./empty/)() const | निर्धारित करता है कि डेलीगेट संग्रह खाली है या नहीं। |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | लागू नहीं किया गया। |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | डेलीगेट्स संग्रह में वर्तमान में मौजूद सभी डेलीगेट्स को कॉल करता है। डेलीगेट्स को उसी क्रम में कॉल किया जाता है जिसमें वे संग्रह में जोड़े गए थे। डेलीगेट्स के निष्पादन के दौरान यह मेथड ब्लॉक करता है। |
| [IsNull](./isnull/)() const | निर्धारित करता है कि डेलीगेट संग्रह खाली है या नहीं। |
| [MulticastDelegate](./multicastdelegate/)() | एक खाली संग्रह बनाता है। |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | डिफ़ॉल्ट कन्स्ट्रक्टर के बराबर। |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | डेलीगेट संग्रह की एक शैलो कॉपी करता है। |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | मूविंग कंस्ट्रक्टर। |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | एक इंस्टेंस बनाता है और निर्दिष्ट डेलीगेट को डेलीगेट्स संग्रह में रखता है। |
| [MulticastDelegate](./multicastdelegate/)(T) | एक इंस्टेंस बनाता है और निर्दिष्ट मान को डेलीगेट्स संग्रह में रखता है। |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | एक इंस्टेंस बनाता है और निर्दिष्ट मान को डेलीगेट्स संग्रह में रखता है। |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | निर्धारित करता है कि डेलीगेट संग्रह खाली नहीं है या नहीं। |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | निर्धारित करता है कि MulticastDelegate के दो इंस्टेंस - वर्तमान ऑब्जेक्ट और निर्दिष्ट ऑब्जेक्ट - असमान हैं या नहीं। |
| [operator()](./operator()/)(ArgumentTypes...) const | डेलीगेट्स संग्रह में वर्तमान में मौजूद सभी डेलीगेट्स को कॉल करता है। डेलीगेट्स को उसी क्रम में कॉल किया जाता है जैसा कि उन्हें संग्रह में जोड़ा गया था। ऑपरेटर डेलीगेट्स के निष्पादित होने तक ब्लॉक रहता है। |
| [operator+=](./operator+=/)(Callback) | निर्दिष्ट डेलीगेट को संग्रह में जोड़ता है। |
| [operator-=](./operator-=/)(Callback) | निर्दिष्ट डेलीगेट को डेलीगेट संग्रह से हटाता है। |
| [operator=](./operator=/)(const MulticastDelegate\&) | निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए डेलीगेट्स संग्रह को वर्तमान ऑब्जेक्ट को असाइन करता है। परिणामस्वरूप दोनों ऑब्जेक्ट एक ही डेलीगेट्स संग्रह की ओर संकेत करते हैं। |
| [operator=](./operator=/)(MulticastDelegate\&&) | मूविंग असाइनमेंट ऑपरेटर। |
| [operator==](./operator==/)(const std::nullptr_t\&) const | निर्धारित करता है कि डेलीगेट संग्रह खाली है या नहीं। |
| [operator==](./operator==/)(const MulticastDelegate\&) const | निर्धारित करता है कि MulticastDelegate के दो इंस्टेंस - वर्तमान ऑब्जेक्ट और निर्दिष्ट ऑब्जेक्ट - समान हैं या नहीं। |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | खाली (वास्तव में कुछ नहीं कॉल करने वाले) सम्मिलित कॉलबैक्स को साफ़ करता है। |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | MulticastDelegate क्लास टाइप जानकारी का प्रतिनिधित्व करने वाले [TypeInfo](../typeinfo/) ऑब्जेक्ट का रेफ़रेंस लौटाता है। |
| [~MulticastDelegate](./~multicastdelegate/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Callback](./callback/) | MulticastDelegate क्लास द्वारा प्रतिनिधित्व किए गए डेलीगेट्स का प्रकार। |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
