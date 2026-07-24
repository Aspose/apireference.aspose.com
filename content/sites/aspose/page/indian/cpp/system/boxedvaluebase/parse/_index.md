---
title: "System::BoxedValueBase::Parse मेथड"
linktitle: "Parse"
second_title: "Aspose.Page C++ के लिए"
description: "System::BoxedValueBase::Parse मेथड। निर्दिष्ट नाम के साथ निर्दिष्ट enumeration के constant के वैल्यू को C++ में बॉक्स करता है।"
type: docs
weight: 500
url: /hi/cpp/system/boxedvaluebase/parse/
---
## BoxedValueBase::Parse(const TypeInfo\&, const String\&) method


निर्दिष्ट नाम वाले enumeration के enumeration constant के मान को बॉक्स करता है।

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रकार | const TypeInfo\& | enumeration का प्रकार निर्दिष्ट करता है |
| str | const String\& | enumeration constant का नाम, जिसका वैल्यू बॉक्स किया जाना है |

### ReturnValue

निर्दिष्ट enumeration constant के बॉक्स्ड वैल्यू का प्रतिनिधित्व करने वाले ऑब्जेक्ट का shared pointer

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BoxedValueBase::Parse(const TypeInfo\&, const String\&, bool) method


निर्दिष्ट नाम वाले enumeration के enumeration constant के मान को बॉक्स करता है। एक पैरामीटर यह निर्धारित करता है कि enumeration constant के नाम को दर्शाने वाली स्ट्रिंग की व्याख्या करते समय केस को अनदेखा किया जाना चाहिए या नहीं।

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रकार | const TypeInfo\& | enumeration का प्रकार निर्दिष्ट करता है |
| str | const String\& | enumeration constant का नाम, जिसका वैल्यू बॉक्स किया जाना है |
| ignoreCase | bool | निर्दिष्ट करता है कि enumeration constant के नाम को दर्शाने वाली स्ट्रिंग की व्याख्या करते समय केस को अनदेखा किया जाना चाहिए या नहीं |

### ReturnValue

निर्दिष्ट enumeration constant के बॉक्स्ड वैल्यू का प्रतिनिधित्व करने वाले ऑब्जेक्ट का shared pointer

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
