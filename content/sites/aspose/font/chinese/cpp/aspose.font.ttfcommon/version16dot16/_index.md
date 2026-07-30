---
title: "Aspose::Font::TtfCommon::Version16Dot16 类"
linktitle: "Version16Dot16"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfCommon::Version16Dot16 类。表示 C++ 中的 Version16Dot16 数据类型。"
type: docs
weight: 100
url: /zh/cpp/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class


表示 [Version16Dot16](./) 数据类型。

```cpp
class Version16Dot16 : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 创建 [Version16Dot16](./) 对象的副本。 |
| [get_MajorNumber](./get_majornumber/)() const | 获取主版本号。该值仅在十六进制表示下有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：{0, 0, 80, 0}，其十六进制表示为 0x00005000。读取该版本后，对象 [Version16Dot16](./) 的主版本号和次版本号分别为 0 和 20480。这些值的十六进制形式分别为 0x0000 和 0x5000。 |
| [get_MinorNumber](./get_minornumber/)() const | 获取次版本号。该值仅在十六进制表示下有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：{0, 0, 80, 0}，其十六进制表示为 0x00005000。读取该版本后，对象 [Version16Dot16](./) 的主版本号和次版本号分别为 0 和 20480。这些值的十六进制形式分别为 0x0000 和 0x5000。 |
| [get_RawBytes](./get_rawbytes/)() | 获取 [Version16Dot16](./) 版本号的所有原始位，作为大小为 4 字节的字节数组。 |
| [set_MajorNumber](./set_majornumber/)(uint16_t) | 设置主版本号。该值仅在十六进制表示下有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：{0, 0, 80, 0}，其十六进制表示为 0x00005000。读取该版本后，对象 [Version16Dot16](./) 的主版本号和次版本号分别为 0 和 20480。这些值的十六进制形式分别为 0x0000 和 0x5000。 |
| [set_MinorNumber](./set_minornumber/)(uint16_t) | 设置次版本号。该值仅在十六进制表示下有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：{0, 0, 80, 0}，其十六进制表示为 0x00005000。读取该版本后，对象 [Version16Dot16](./) 的主版本号和次版本号分别为 0 和 20480。这些值的十六进制形式分别为 0x0000 和 0x5000。 |
| [ToString](./tostring/)() const override | 返回格式化的版本字符串，例如 "0.5"、"1.1"、"3.0" 等。 |
| [Version16Dot16](./version16dot16/)() | 构造函数。 |
| [Version16Dot16](./version16dot16/)(uint16_t, uint16_t) | 构造函数。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::TtfCommon](../)
* Library [Aspose.Font for C++](../../)
