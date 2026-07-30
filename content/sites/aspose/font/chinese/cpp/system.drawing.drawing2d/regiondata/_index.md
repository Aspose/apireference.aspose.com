---
title: "System::Drawing::Drawing2D::RegionData class"
linktitle: "RegionData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::RegionData class. 包含定义区域的数据。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1300
url: /zh/cpp/system.drawing.drawing2d/regiondata/
---
## RegionData class


包含定义区域的数据。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RegionData : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Data](./get_data/)() | 返回一个包含定义区域数据的字节数组。 |
| [RegionData](./regiondata/)(const ArrayPtr\<uint8_t\>\&) | 构造一个新的 [RegionData](./) 类实例，并使用指定的数据进行初始化。 |
| [set_Data](./set_data/)(const ArrayPtr\<uint8_t\>\&) | 为当前对象设置区域数据。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
