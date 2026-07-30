---
title: "System::Drawing::SolidBrush 类"
linktitle: "SolidBrush"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::SolidBrush 类。表示单色画刷。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 2400
url: /zh/cpp/system.drawing/solidbrush/
---
## SolidBrush class


表示单色画刷。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SolidBrush : public System::Drawing::Brush
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 创建当前对象的副本。 |
| [get_Color](./get_color/)() const | 返回此画刷的颜色。 |
| [set_Color](./set_color/)(Color) | 设置此画刷的颜色。 |
| [SolidBrush](./solidbrush/)(const Color\&) | 构造一个新的 [SolidBrush](./) 对象，并使用指定的颜色进行初始化。 |
## 另见

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
