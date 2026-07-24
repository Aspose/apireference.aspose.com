---
title: "System::Runtime::Serialization::FormatterConverter::Convert विधि"
linktitle: "Convert"
second_title: "Aspose.Page C++ के लिए"
description: "System::Runtime::Serialization::FormatterConverter::Convert विधि. C++ में RTTI जानकारी।"
type: docs
weight: 100
url: /hi/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI जानकारी।

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | System::SharedPtr\<Object\> | परिवर्तित किया जाने वाला ऑब्जेक्ट। |
| type | const TypeInfo\& | वह [System::TypeInfo](../../../system/typeinfo/) जिसमें मान को परिवर्तित किया जाना है। |

### ReturnValue

परिवर्तित मान।
## टिप्पणियाँ


मान को दिए गए [System::TypeInfo](../../../system/typeinfo/) में परिवर्तित करता है।
## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


मान को दिए गए [System::TypeCode](../../../system/typecode/) में परिवर्तित करता है।

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | System::SharedPtr\<Object\> | परिवर्तित किया जाने वाला ऑब्जेक्ट। |
| typeCode | TypeCode | वह [System::TypeCode](../../../system/typecode/) जिसमें मान को परिवर्तित किया जाना है। |

### ReturnValue

परिवर्तित मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
