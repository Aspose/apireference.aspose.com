---
title: "System::Drawing::Imaging::EncoderParameters class"
linktitle: "EncoderParameters"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::EncoderParameters 类。表示 EncoderParameter 对象的数组。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言错误。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 700
url: /zh/cpp/system.drawing.imaging/encoderparameters/
---
## EncoderParameters class


表示一个由 [EncoderParameter](../encoderparameter/) 对象组成的数组。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言错误。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EncoderParameters : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EncoderParameters](./encoderparameters/)(int) | 构造一个新的 [EncoderParameters](./) 类实例。 |
| [get_Param](./get_param/)() const | 返回当前 [EncoderParameters](./) 对象所表示的 [EncoderParameter](../encoderparameter/) 对象数组。 |
| [set_Param](./set_param/)(const System::ArrayPtr\<EncoderParameterPtr\>\&) | 将一个 [EncoderParameter](../encoderparameter/) 对象数组分配给当前的 [EncoderParameters](./) 对象。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
