---
title: "System::ComponentModel::TypeConverter::ConvertTo 方法"
linktitle: "ConvertTo"
second_title: "Aspose.Page 适用于 C++"
description: "System::ComponentModel::TypeConverter::ConvertTo 方法。将对象转换为特定类型（在 C++ 中）。"
type: docs
weight: 500
url: /zh/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


将对象转换为特定类型。

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) 转换上下文信息。 |
| 区域性 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 在转换对象时使用的区域性。 |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 用于转换。 |
| destinationType | const System::TypeInfo\& | 要转换成的类型。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


将对象转换为特定类型。

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 用于转换。 |
| destinationType | const System::TypeInfo\& | 要转换成的类型。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
