---
title: "Aspose::Font::Ttf::TtfEncodingParameters class"
linktitle: "TtfEncodingParameters"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfEncodingParameters class. 表示 C++ 中的 TTF 编码参数。"
type: docs
weight: 500
url: /zh/cpp/aspose.font.ttf/ttfencodingparameters/
---
## TtfEncodingParameters class


表示 TTF 编码参数。

```cpp
class TtfEncodingParameters : public Aspose::Font::IEncodingParameters
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_PlatformId](./get_platformid/)() const | 获取 PlatformId 值。 |
| [get_PlatformSpecificId](./get_platformspecificid/)() const | 获取 PlatformSpecificId 值。 |
| [set_PlatformId](./set_platformid/)(uint16_t) | 设置 PlatformId 值。 |
| [set_PlatformSpecificId](./set_platformspecificid/)(uint16_t) | 设置 PlatformSpecificId 值。 |
| [TtfEncodingParameters](./ttfencodingparameters/)(uint16_t, uint16_t) | 初始化 [TtfEncodingParameters](./) 类的新实例。将 Platform Id、Platform-specific encoding id 作为参数。这些参数用于从主字体 CMap 表请求特殊的 CMap 子表，请参阅 OpenType [Font](../../aspose.font/font/) 文件规范中的表 'CMap'、'name'。 |
## 备注


应用于从 TTF [Font](../../aspose.font/font/) 请求特定编码。
## 另见

* Class [IEncodingParameters](../../aspose.font/iencodingparameters/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
