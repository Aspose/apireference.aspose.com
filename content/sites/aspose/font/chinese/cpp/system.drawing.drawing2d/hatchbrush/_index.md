---
title: "System::Drawing::Drawing2D::HatchBrush 类"
linktitle: "HatchBrush"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::HatchBrush 类。表示具有网格样式、前景色和背景色的矩形画刷。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 800
url: /zh/cpp/system.drawing.drawing2d/hatchbrush/
---
## HatchBrush class


表示具有网格样式、前景色和背景色的矩形画刷。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HatchBrush : public System::Drawing::Brush
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 创建当前对象的精确副本。 |
| [get_BackgroundColor](./get_backgroundcolor/)() const | 返回指示此画刷背景颜色的值。 |
| [get_ForegroundColor](./get_foregroundcolor/)() const | 返回指示此画刷前景颜色的值。 |
| [get_HatchStyle](./get_hatchstyle/)() const | 返回指示此画刷网格样式的值。 |
| [HatchBrush](./hatchbrush/)(HatchStyle, Color, Color) | RTTI 信息。 |
## 另见

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
