---
title: "System::ComponentModel::TypeConverter::ConvertTo मेथड"
linktitle: "ConvertTo"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::TypeConverter::ConvertTo मेथड. ऑब्जेक्ट को विशिष्ट प्रकार में C++ में परिवर्तित करता है।"
type: docs
weight: 500
url: /hi/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


वस्तु को विशिष्ट प्रकार में परिवर्तित करता है।

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) रूपांतरण संदर्भ जानकारी। |
| संस्कृति | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | ऑब्जेक्ट्स को परिवर्तित करते समय उपयोग करने वाली संस्कृति। |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) को परिवर्तित करने के लिए। |
| destinationType | const System::TypeInfo\& | जिस प्रकार में परिवर्तित करना है। |

### ReturnValue

परिवर्तित ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


वस्तु को विशिष्ट प्रकार में परिवर्तित करता है।

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) को परिवर्तित करने के लिए। |
| destinationType | const System::TypeInfo\& | जिस प्रकार में परिवर्तित करना है। |

### ReturnValue

परिवर्तित ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
