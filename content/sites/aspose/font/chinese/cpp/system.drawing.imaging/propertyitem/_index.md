---
title: "System::Drawing::Imaging::PropertyItem 类"
linktitle: "PropertyItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::PropertyItem 类。表示要包含在图像文件中的元数据属性。此类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1400
url: /zh/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


表示要包含在图像文件中的元数据属性。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数进行分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PropertyItem : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Id](./get_id/)() const | 返回当前对象所表示属性的 ID。 |
| [get_Len](./get_len/)() const | 返回当前对象所表示属性的字节长度。 |
| [get_Type](./get_type/)() const | 返回当前对象所表示属性的类型（以字节为单位）。 |
| [get_Value](./get_value/)() const | 返回当前对象表示的属性的值（单位：字节）。 |
| [PropertyItem](./propertyitem/)() | 构造一个新的 [PropertyItem](./) 类实例。 |
| [set_Id](./set_id/)(int32_t) | 设置当前对象表示的属性的 ID。 |
| [set_Len](./set_len/)(int32_t) | 设置当前对象表示的属性的长度（单位：字节）。 |
| [set_Type](./set_type/)(int16_t) | 设置当前对象表示的属性的类型（单位：字节）。 |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | 设置当前对象表示的属性的类型（单位：字节）。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
