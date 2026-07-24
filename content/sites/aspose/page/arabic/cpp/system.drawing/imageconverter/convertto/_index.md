---
title: "System::Drawing::ImageConverter::ConvertTo طريقة"
linktitle: "ConvertTo"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::ImageConverter::ConvertTo طريقة. يحوّل الكائن إلى نوع محدد في C++."
type: docs
weight: 200
url: /ar/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


يقوم بتحويل الكائن إلى نوع محدد.

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | معلومات سياق تحويل [Object](../../../system/object/) |
| الثقافة | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | الثقافة المستخدمة عند تحويل الكائنات |
| value | const System::SharedPtr\<System::Object\>\& | كائن للتحويل. |
| destinationType | const System::TypeInfo\& | نوع للتحويل إليه. |

### ReturnValue

الكائن المحول.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
