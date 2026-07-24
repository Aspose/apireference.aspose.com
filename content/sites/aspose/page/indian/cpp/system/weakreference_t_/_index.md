---
title: "System::WeakReference< T > क्लास"
linktitle: "WeakReference< T >"
second_title: "Aspose.Page C++ के लिए"
description: "System::WeakReference< T > क्लास। एक कमजोर रेफ़रेंस का प्रतिनिधित्व करता है, जो एक ऑब्जेक्ट को रेफ़रेंस करता है जबकि C++ में उस ऑब्जेक्ट को हटाने की अनुमति देता है।"
type: docs
weight: 7700
url: /hi/cpp/system/weakreference_t_/
---
## WeakReference< T > class


एक कमजोर रेफ़रेंस का प्रतिनिधित्व करता है, जो किसी ऑब्जेक्ट को संदर्भित करता है जबकि वह ऑब्जेक्ट अभी भी हटाया जा सकता है।

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | रेफ़रेंस किए गए ऑब्जेक्ट का प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | जाँचता है कि रेफ़रेंस किया गया ऑब्जेक्ट null नहीं है। |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | रेफ़रेंस किए गए ऑब्जेक्ट की तुलना किसी अन्य इंस्टेंस [WeakReference](../weakreference/) क्लास से करता है। |
| [operator==](./operator==/)(std::nullptr_t) const | जाँचता है कि रेफ़रेंस किया गया ऑब्जेक्ट null है। |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | रेफ़रेंस किए गए ऑब्जेक्ट की तुलना किसी अन्य इंस्टेंस [WeakReference](../weakreference/) क्लास से करता है। |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | वर्तमान [WeakReference](../weakreference/) वस्तु द्वारा संदर्भित वस्तु (लक्ष्य) सेट करता है। |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | वर्तमान [WeakReference](../weakreference/) वस्तु द्वारा संदर्भित वस्तु (लक्ष्य) प्राप्त करता है। |
| [WeakReference](./weakreference/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr से कन्स्ट्रक्टर। |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | [WeakReference](../weakreference/) क्लास का नया इंस्टेंस आरंभ करता है, जो निर्दिष्ट वस्तु को संदर्भित करता है। |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | [WeakReference](../weakreference/) क्लास का नया इंस्टेंस आरंभ करता है, जो निर्दिष्ट वस्तु को संदर्भित करता है। |

## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
