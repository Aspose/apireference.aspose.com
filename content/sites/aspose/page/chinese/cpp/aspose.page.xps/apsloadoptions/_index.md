---
title: "Aspose::Page::XPS::ApsLoadOptions 类"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::ApsLoadOptions 类。C++ 中的 APS 文档加载选项。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


APS 文档加载选项。

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | 创建选项的新实例。 |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | 一个取值范围为 0 到 255 的整数，低于该值的包含 alpha 值的图像像素将被视为完全透明。PostScript 不支持透明度，但可以在彩色图像上应用显式遮罩，使部分像素完全不透明，部分像素完全透明。透明度阈值用于在原始图像和 PostScript 结果之间寻找最佳相似度。默认值为 255。 |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | 一个取值范围为 0 到 255 的整数，低于该值的包含 alpha 值的图像像素将被视为完全透明。PostScript 不支持透明度，但可以在彩色图像上应用显式遮罩，使部分像素完全不透明，部分像素完全透明。透明度阈值用于在原始图像和 PostScript 结果之间寻找最佳相似度。默认值为 255。 |
## 另见

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
