---
title: "System::DynamicWeakPtr::Reference क्लास"
linktitle: "Reference"
second_title: "Aspose.Page C++ के लिए"
description: "System::DynamicWeakPtr::Reference क्लास। वह रेफ़रेंस क्लास जो सुनिश्चित करता है कि DynamicWeakPtr::Apply को कॉल किया जाए। उपयोग किया जाता है यदि DynamicWeakPtr को SmartPtr रेफ़रेंस पैरामीटर के रूप में फ़ंक्शन को पास किया जाता है जो C++ में इसे असाइन कर सकता है।"
type: docs
weight: 700
url: /hi/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | कन्वर्ज़न ऑपरेटर। यह अनुमति देता है कि [Reference](./) को उन संदर्भों में उपयोग किया जाए जहाँ [DynamicWeakPtr_](../dynamicweakptr_/) की आवश्यकता हो। |
| [Reference](./reference/)(DynamicWeakPtr_\&) | स्मार्ट पॉइंटर रेफ़रेंस बनाता है। |
| [Reference](./reference/)(Reference\&&) | स्मार्ट पॉइंटर रेफ़रेंस को मूव-कंस्ट्रक्ट करता है। |
| [~Reference](./~reference/)() | रेफ़रेंस को नष्ट करता है। रेफ़रेंस किए गए स्मार्ट पॉइंटर पर Apply() कॉल सुनिश्चित करता है। |
## संबंधित देखें

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
