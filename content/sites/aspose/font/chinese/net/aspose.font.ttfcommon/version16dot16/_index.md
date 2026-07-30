---
title: "类 Version16Dot16"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TtfCommon.Version16Dot16 类。表示 Version16Dot16 数据类型"
type: docs
weight: 970
url: /zh/net/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class

表示 Version16Dot16 数据类型。

```csharp
public class Version16Dot16 : ICloneable
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [Version16Dot16](version16dot16/#constructor)() | 构造函数 |
| [Version16Dot16](version16dot16/#constructor_1)(ushort, ushort) | 构造函数 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [MajorNumber](../../aspose.font.ttfcommon/version16dot16/majornumber/) { get; set; } | 获取或设置主版本号。该值仅在十六进制表示中有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：{0, 0, 80, 0}，其十六进制表示为 0x00005000。读取此版本自字体文件后，对象 `Version16Dot16` 的主版本号和次版本号分别为 0 和 20480。这些值的十六进制形式分别为 0x0000 和 0x5000。 |
| [MinorNumber](../../aspose.font.ttfcommon/version16dot16/minornumber/) { get; set; } | 获取或设置次版本号。该值仅在十六进制表示中有意义，例如实际字体文件中 'maxp' 的版本 0.5 为 4 字节：{0, 0, 80, 0}，其十六进制表示为 0x00005000。读取此版本自字体文件后，对象 `Version16Dot16` 的主版本号和次版本号分别为 0 和 20480。这些值的十六进制形式分别为 0x0000 和 0x5000。 |
| [RawBytes](../../aspose.font.ttfcommon/version16dot16/rawbytes/) { get; } | 获取 Version16Dot16 版本号的所有原始位，作为大小为 4 字节的字节数组。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| virtual [Clone](../../aspose.font.ttfcommon/version16dot16/clone/)() | 创建 `Version16Dot16` 对象的副本。 |
| override [ToString](../../aspose.font.ttfcommon/version16dot16/tostring/)() | 返回格式化的版本值字符串，例如 "0.5"、"1.1"、"3.0" 等。 |

### 另见

* namespace [Aspose.Font.TtfCommon](../../aspose.font.ttfcommon/)
* assembly [Aspose.Font](../../)


