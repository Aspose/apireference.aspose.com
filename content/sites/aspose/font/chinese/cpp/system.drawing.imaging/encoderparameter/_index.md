---
title: "System::Drawing::Imaging::EncoderParameter 类"
linktitle: "EncoderParameter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::EncoderParameter 类。用作向图像编码器传递值的容器。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


用作向图像编码器传递值的容器。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EncoderParameter : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | 构造一个新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | 构造一个新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | 构造一个新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | 构造一个新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | 构造一个新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | 构造一个表示分数的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | 构造一个表示整数值范围的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | 构造一个表示分数范围的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | 构造一个新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | 构造一个表示值数组的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | 构造一个表示值数组的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | 构造一个表示值数组的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | 构造一个表示分数数组的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | 构造一个表示整数范围数组的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | 构造一个表示分数范围数组的新的 [EncoderParameter](./) 类实例。 |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | 构造一个新的 [EncoderParameter](./) 类实例，表示从指定缓冲区读取的指定类型的指定数量的值。 |
| [get_Encoder](./get_encoder/)() const | 返回与当前 [EncoderParameter](./) 对象关联的 [Encoder](../encoder/) 对象。 |
| [get_NumberOfValues](./get_numberofvalues/)() const | 返回当前对象表示的值的数量。 |
| [get_Type](./get_type/)() const | 返回当前对象表示的值的类型。 |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | 将指定的 [Encoder](../encoder/) 对象与当前的 [EncoderParameter](./) 对象关联。 |
| [~EncoderParameter](./~encoderparameter/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
