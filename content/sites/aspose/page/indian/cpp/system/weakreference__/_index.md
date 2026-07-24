---
title: "System::WeakReference<> क्लास"
linktitle: "WeakReference<>"
second_title: "Aspose.Page C++ के लिए"
description: "System::WeakReference<> क्लास। एक कमजोर संदर्भ का प्रतिनिधित्व करता है, जो एक वस्तु को संदर्भित करता है जबकि उस वस्तु को C++ में हटाने की अनुमति देता है।"
type: docs
weight: 7800
url: /hi/cpp/system/weakreference__/
---
## WeakReference<> class


एक कमजोर रेफ़रेंस का प्रतिनिधित्व करता है, जो किसी ऑब्जेक्ट को संदर्भित करता है जबकि वह ऑब्जेक्ट अभी भी हटाया जा सकता है।

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | वर्तमान [WeakReference](../weakreference/) वस्तु द्वारा संदर्भित वस्तु हटाई गई है या नहीं, इसका संकेत प्राप्त करता है। |
| [get_Target](./get_target/)() const | वर्तमान [WeakReference](../weakreference/) वस्तु द्वारा संदर्भित वस्तु (लक्ष्य) प्राप्त करता है। |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | वर्तमान [WeakReference](../weakreference/) वस्तु द्वारा संदर्भित वस्तु (लक्ष्य) सेट करता है। |
| [WeakReference](./weakreference/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr से कन्स्ट्रक्टर। |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | [WeakReference](../weakreference/) क्लास का नया इंस्टेंस आरंभ करता है, जो निर्दिष्ट वस्तु को संदर्भित करता है। |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | [WeakReference](../weakreference/) क्लास का नया इंस्टेंस आरंभ करता है, जो निर्दिष्ट वस्तु को संदर्भित करता है। |
## संबंधित देखें

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
