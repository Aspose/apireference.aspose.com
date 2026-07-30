---
title: "System::Drawing::Imaging::ColorPalette 类"
linktitle: "ColorPalette"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ColorPalette 类。表示组成调色板的 32 位 ARGB 颜色集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 400
url: /zh/cpp/system.drawing.imaging/colorpalette/
---
## ColorPalette class


表示组成调色板的 32 位 ARGB 颜色集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ColorPalette : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Entries](./get_entries/)() const | 返回由当前对象表示的 [Color](../../system.drawing/color/) 对象数组。 |
| [get_Flags](./get_flags/)() const | 返回一个值，指定应如何解释颜色数组中的颜色值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
