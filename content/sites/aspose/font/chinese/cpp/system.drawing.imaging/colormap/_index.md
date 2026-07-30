---
title: "System::Drawing::Imaging::ColorMap 类"
linktitle: "ColorMap"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ColorMap 类。表示用于转换颜色的映射。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 200
url: /zh/cpp/system.drawing.imaging/colormap/
---
## ColorMap class


表示用于转换颜色的映射。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ColorMap : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_NewColor](./get_newcolor/)() const | 返回表示要转换到的颜色的新 [Color](../../system.drawing/color/) 对象。 |
| [get_OldColor](./get_oldcolor/)() const | 返回表示要被转换的颜色的旧 [Color](../../system.drawing/color/) 对象。 |
| [set_NewColor](./set_newcolor/)(const Color\&) | 设置表示要转换到的颜色的新 [Color](../../system.drawing/color/) 对象。 |
| [set_OldColor](./set_oldcolor/)(const Color\&) | 设置表示要被转换的颜色的旧 [Color](../../system.drawing/color/) 对象。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
