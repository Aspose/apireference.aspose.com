---
title: "System::Drawing::FontConverter::ConvertTo method"
linktitle: "ConvertTo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::FontConverter::ConvertTo method. 在 C++ 中将对象转换为特定类型。"
type: docs
weight: 200
url: /zh/cpp/system.drawing/fontconverter/convertto/
---
## FontConverter::ConvertTo(const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


将对象转换为特定类型。

```cpp
System::SharedPtr<System::Object> System::Drawing::FontConverter::ConvertTo(const System::SharedPtr<ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| context | const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) 转换上下文信息。 |
| 文化 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 在转换对象时使用的区域性。 |
| 值 | const System::SharedPtr\<System::Object\>\& | 要转换的对象。 |
| destinationType | const System::TypeInfo\& | 要转换到的类型。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FontConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## FontConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


将对象转换为特定类型。

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) 转换上下文信息。 |
| 文化 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 在转换对象时使用的区域性。 |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 要转换的。 |
| destinationType | const System::TypeInfo\& | 要转换到的类型。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FontConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## FontConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


将对象转换为特定类型。

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 要转换的。 |
| destinationType | const System::TypeInfo\& | 要转换到的类型。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FontConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
