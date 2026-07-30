---
title: "System::Drawing::Drawing2D::PathData 类"
linktitle: "PathData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::PathData 类。包含表示路径的图形数据。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1100
url: /zh/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


包含表示路径的图形数据。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PathData : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Points](./get_points/)() | 返回包含构成路径的点的数组。 |
| [get_Types](./get_types/)() | 返回一个数组，其中包含指定 **Points** 数组中相应点类型的值。 |
| [PathData](./pathdata/)() | 构造一个空的 [PathData](./) 对象。 |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | 设置一个包含构成路径的点的数组。 |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | 设置一个数组，其中包含指定 **Points** 数组中相应点类型的值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
