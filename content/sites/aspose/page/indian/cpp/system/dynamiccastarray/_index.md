---
title: "System::DynamicCastArray मेथड"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page C++ के लिए"
description: "System::DynamicCastArray मेथड। निर्दिष्ट एरे के तत्वों को C++ में विभिन्न प्रकार में कास्ट करता है।"
type: docs
weight: 17900
url: /hi/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


निर्दिष्ट एरे के तत्वों को विभिन्न प्रकार में कास्ट करता है।

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| पैरामीटर | विवरण |
| --- | --- |
| को | निर्दिष्ट एरे के तत्वों को कास्ट करने के लिए प्रकार |
| From | जिस एरे के तत्वों को कास्ट किया जाना है, उनके तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| from | const SharedPtr\<Array\<From\>\>\& | कास्ट करने वाले तत्वों वाले एरे के लिए साझा पॉइंटर |

### ReturnValue

एक पॉइंटर जो एक नए एरे की ओर इशारा करता है जिसमें **To** प्रकार के तत्व होते हैं, जो **from** के तत्वों के बराबर होते हैं

## Deprecated
पिछली संगतता के लिए जोड़ा गया। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
