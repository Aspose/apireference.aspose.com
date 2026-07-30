---
title: "System::ComponentModel::EnumConverter 类"
linktitle: "EnumConverter"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::EnumConverter 类。用于使使用 EnumConverter 的翻译代码能够编译的人造占位类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 700
url: /zh/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


用于使使用 EnumConverter 的翻译代码能够编译的人造占位类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | 检查类型是否可转换；未实现。 |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | 检查类型是否可转换；未实现。 |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | 执行实际的类型转换；未实现。 |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | 执行实际的类型转换；未实现。 |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI 信息。 |
| [get_EnumType](./get_enumtype/)() | 获取 [EnumConverter](./) 正在处理的枚举类型；未实现。 |
## 另见

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
