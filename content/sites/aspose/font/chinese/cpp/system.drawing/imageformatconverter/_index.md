---
title: "System::Drawing::ImageFormatConverter 类"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::ImageFormatConverter 类。将 ImageFormat 对象从一种数据类型转换为另一种数据类型。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1400
url: /zh/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


将 ImageFormat 对象从一种数据类型转换为另一种数据类型。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | 转换对象。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | 转换对象。 |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | 转换对象。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 将字符串转换为对象。 |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | 将对象转换为特定类型。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 将对象转换为特定类型。 |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 将对象转换为特定类型。 |
| [ImageFormatConverter](./imageformatconverter/)() | 构造一个新的 [ImageFormatConverter](./) 实例。 |
## 另见

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
