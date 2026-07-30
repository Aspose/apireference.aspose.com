---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::ColorBlend class. 包含用于在多色渐变中进行颜色混合插值的颜色和位置数组。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 300
url: /zh/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


包含用于在多色渐变中进行颜色混合插值的颜色和位置数组。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ColorBlend : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ColorBlend](./colorblend/)() | 构造一个新的 [ColorBlend](./) 类实例。 |
| [ColorBlend](./colorblend/)(int) | 构造一个新的 [Blend](../blend/) 类实例。 |
| [get_Colors](./get_colors/)() | 返回一个颜色数组，用于在渐变的相应位置使用。 |
| [get_Positions](./get_positions/)() | 返回沿渐变的混合位置数组。 |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | 设置沿渐变在相应位置使用的颜色数组。 |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | 设置沿渐变的混合位置数组。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
