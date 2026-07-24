---
title: "System::ICustomFormatter::Format मेथड"
linktitle: "फ़ॉर्मेट"
second_title: "Aspose.Page C++ के लिए"
description: "System::ICustomFormatter::Format मेथड। निर्दिष्ट फ़ॉर्मेट का उपयोग करके C++ में वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व लौटाता है।"
type: docs
weight: 100
url: /hi/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट का उपयोग करके लौटाता है।

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ॉर्मेट | System::String | स्ट्रिंग फ़ॉर्मेट |
| arg | System::SharedPtr\<System::Object\> | फ़ॉर्मेट किए जाने वाला ऑब्जेक्ट |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | फ़ॉर्मेटिंग जानकारी प्रदान करने वाला ऑब्जेक्ट |

### ReturnValue

फ़ॉर्मेट और **formatProvider** द्वारा निर्दिष्ट फ़ॉर्मेट के अनुसार स्वरूपित **arg** की स्ट्रिंग प्रतिनिधित्व

## संबंधित देखें

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
