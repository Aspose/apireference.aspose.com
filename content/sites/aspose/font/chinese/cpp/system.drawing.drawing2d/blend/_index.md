---
title: "System::Drawing::Drawing2D::Blend 类"
linktitle: "Blend"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::Blend 类。表示 LinearGradientBrush 对象的混合模式。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 200
url: /zh/cpp/system.drawing.drawing2d/blend/
---
## Blend class


表示 [LinearGradientBrush](../lineargradientbrush/) 对象的混合模式。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Blend : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Blend](./blend/)() | 构造一个新的 [Blend](./) 类实例。 |
| [Blend](./blend/)(int) | 构造一个新的 [Blend](./) 类实例。 |
| [get_Factors](./get_factors/)() const | 返回渐变的混合因子数组。 |
| [get_Positions](./get_positions/)() const | 返回渐变的混合位置数组。 |
| [set_Factors](./set_factors/)(const ArrayPtr\<float\>\&) | 设置渐变的混合因子数组。 |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | 设置渐变的混合位置数组。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
