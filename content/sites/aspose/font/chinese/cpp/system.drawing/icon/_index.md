---
title: "System::Drawing::Icon 类"
linktitle: "Icon"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Icon 类。表示 Windows 图标。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1100
url: /zh/cpp/system.drawing/icon/
---
## Icon class


表示一个 [Windows](../../system.windows/) 图标。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Icon : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Height](./get_height/)() const | 返回图标的高度。 |
| [get_Width](./get_width/)() const | 返回图标的宽度。 |
| [Icon](./icon/)(const String\&) | 构造一个新的 [Icon](./) 类实例，该实例表示来自指定文件的图标。 |
| [ToBitmap](./tobitmap/)() | 将当前对象转换为 [Bitmap](../bitmap/) 对象。 |
| virtual [~Icon](./~icon/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
