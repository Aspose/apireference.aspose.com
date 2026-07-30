---
title: "System::Drawing::Imaging::FrameDimension 类"
linktitle: "FrameDimension"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::FrameDimension 类。提供获取图像帧维度的属性。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 800
url: /zh/cpp/system.drawing.imaging/framedimension/
---
## FrameDimension class


提供获取图像帧维度的属性。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FrameDimension : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(FrameDimensionPtr) | 确定指定的 [FrameDimension](./) 对象是否等同于当前对象。 |
| [FrameDimension](./framedimension/)(const System::Guid\&) | 构造一个新的 [FrameDimension](./) 对象，并使用指定的 GUID 对其进行初始化。 |
| [get_Guid](./get_guid/)() const | 返回与当前对象关联的 GUID。 |
| static [get_Page](./get_page/)() | 返回页面维度。 |
| static [get_Resolution](./get_resolution/)() | 返回分辨率维度。 |
| static [get_Time](./get_time/)() | 返回时间维度。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
