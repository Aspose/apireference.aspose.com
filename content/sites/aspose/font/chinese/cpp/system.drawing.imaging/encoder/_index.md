---
title: "System::Drawing::Imaging::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::Encoder 类。表示与一组图像编码器参数关联的 GUID。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.drawing.imaging/encoder/
---
## Encoder class


表示与一组图像编码器参数关联的 GUID。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Encoder : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | 构造一个新的 [Encoder](./) 类实例。 |
| [get_Guid](./get_guid/)() const | 返回一个 GUID，指定当前对象所表示的一组图像编码器参数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | 一个表示色度表参数类别的 [Encoder](./) 类实例。 |
| static [ColorDepth](./colordepth/) | 一个表示颜色深度参数类别的 [Encoder](./) 类实例。 |
| static [Compression](./compression/) | 一个表示压缩参数类别的 [Encoder](./) 类实例。 |
| static [LuminanceTable](./luminancetable/) | 一个表示亮度表参数类别的 [Encoder](./) 类实例。 |
| static [Quality](./quality/) | 一个表示质量参数类别的 [Encoder](./) 类实例。 |
| static [RenderMethod](./rendermethod/) | 一个表示渲染方法参数类别的 [Encoder](./) 类实例。 |
| static [SaveFlag](./saveflag/) | 一个表示保存标志参数类别的 [Encoder](./) 类实例。 |
| static [ScanMethod](./scanmethod/) | 一个表示扫描方法参数类别的 [Encoder](./) 类实例。 |
| static [Transformation](./transformation/) | 一个表示变换参数类别的 [Encoder](./) 类实例。 |
| static [Version](./version/) | 一个表示版本参数类别的 [Encoder](./) 类实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
