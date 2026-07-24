---
title: "System::ComponentModel::TypeConverter::ConvertTo طريقة"
linktitle: "ConvertTo"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::TypeConverter::ConvertTo طريقة. يحول الكائن إلى نوع محدد في C++."
type: docs
weight: 500
url: /ar/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


يقوم بتحويل الكائن إلى نوع محدد.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) معلومات سياق التحويل. |
| الثقافة | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | الثقافة المستخدمة عند تحويل الكائنات. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) للتحويل. |
| destinationType | const System::TypeInfo\& | النوع للتحويل إليه. |

### ReturnValue

الكائن المحول.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


يقوم بتحويل الكائن إلى نوع محدد.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) للتحويل. |
| destinationType | const System::TypeInfo\& | النوع للتحويل إليه. |

### ReturnValue

الكائن المحول.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
