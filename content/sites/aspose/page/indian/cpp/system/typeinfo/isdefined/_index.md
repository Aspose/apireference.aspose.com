---
title: "System::TypeInfo::IsDefined मेथड"
linktitle: "IsDefined"
second_title: "Aspose.Page C++ के लिए"
description: "System::TypeInfo::IsDefined मेथड। लागू नहीं किया गया। दर्शाता है कि निर्दिष्ट प्रकार या उसके व्युत्पन्न प्रकारों के एक या अधिक एट्रिब्यूट इस सदस्य पर C++ में लागू किए गए हैं।"
type: docs
weight: 4400
url: /hi/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


अमल में नहीं। दर्शाता है कि क्या निर्दिष्ट प्रकार या उसके व्युत्पन्न प्रकारों के एक या अधिक गुण इस सदस्य पर लागू होते हैं।

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| attributeType | const TypeInfo\& | खोजे जाने वाले कस्टम एट्रिब्यूट का प्रकार। खोज में व्युत्पन्न प्रकार भी शामिल हैं। |
| inherit | bool | यदि true है तो इस सदस्य की विरासत श्रृंखला में एट्रिब्यूट खोजे जाएंगे; अन्यथा false। यह पैरामीटर प्रॉपर्टीज़ और इवेंट्स के लिए अनदेखा किया जाता है। |

### ReturnValue

यदि इस सदस्य पर attributeType या उसके किसी भी व्युत्पन्न प्रकार के एक या अधिक इंस्टेंस लागू किए गए हों तो true; अन्यथा false।

## संबंधित देखें

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
