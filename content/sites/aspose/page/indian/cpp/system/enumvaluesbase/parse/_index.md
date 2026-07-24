---
title: "System::EnumValuesBase::Parse method"
linktitle: "Parse"
second_title: "Aspose.Page C++ के लिए"
description: "System::EnumValuesBase::Parse method. निर्दिष्ट enumeration प्रकार के enumeration constant के मान को दर्शाने वाला एक ऑब्जेक्ट लौटाता है, जिसका नाम निर्दिष्ट किया गया है, C++ में।"
type: docs
weight: 400
url: /hi/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


निर्दिष्ट नाम के साथ निर्दिष्ट enumeration प्रकार के enumeration स्थिरांक के मान का प्रतिनिधित्व करने वाला एक ऑब्जेक्ट लौटाता है।

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | const TypeInfo\& | [TypeInfo](../../typeinfo/) ऑब्जेक्ट जो लौटाने के लिए enumeration मान के प्रकार का प्रतिनिधित्व करता है। |
| str | const String\& | एन्यूम कॉन्स्टेंट का नाम |
| ignoreCase | bool | निर्दिष्ट करता है कि केस को एनम कॉन्स्टेंट के नाम की व्याख्या करते समय अनदेखा किया जाना चाहिए |

### ReturnValue

एक ऑब्जेक्ट जो enum constant के मान को दर्शाता है, जिसका नाम **str** में निर्दिष्ट है।

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
