---
title: "System::Drawing::FontConverter 类"
linktitle: "FontConverter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::FontConverter 类。将 Font 对象从一种数据类型转换为另一种数据类型。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 800
url: /zh/cpp/system.drawing/fontconverter/
---
## FontConverter class


将 [Font](../font/) 对象从一种数据类型转换为另一种数据类型。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FontConverter : public System::ComponentModel::TypeConverter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | 转换对象。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | 转换对象。 |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | 转换对象。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 将字符串转换为对象。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | 将对象转换为特定类型。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 将对象转换为特定类型。 |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 将对象转换为特定类型。 |
## 另见

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
