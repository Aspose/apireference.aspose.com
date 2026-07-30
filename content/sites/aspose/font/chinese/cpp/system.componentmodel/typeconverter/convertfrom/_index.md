---
title: "System::ComponentModel::TypeConverter::ConvertFrom 方法"
linktitle: "ConvertFrom"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::TypeConverter::ConvertFrom 方法。在 C++ 中转换对象。"
type: docs
weight: 200
url: /zh/cpp/system.componentmodel/typeconverter/convertfrom/
---
## TypeConverter::ConvertFrom(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) method


转换对象。

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertFrom(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) 转换上下文信息。 |
| 文化 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 在转换对象时使用的区域性。 |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 要转换的。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertFrom(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) method


将字符串转换为对象。

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertFrom(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::String &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) 转换上下文信息。 |
| 文化 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 在转换对象时使用的区域性。 |
| 值 | const System::String\& | 要转换的值。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../../../system/string/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertFrom(const System::SharedPtr\<System::Object\>\&) method


转换对象。

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertFrom(const System::SharedPtr<System::Object> &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 要转换的。 |

### ReturnValue

已转换的对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
