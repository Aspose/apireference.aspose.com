---
title: "Aspose::Page::XPS::ApsLoadOptions::set_TransparencyThreshold 方法"
linktitle: "set_TransparencyThreshold"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::ApsLoadOptions::set_TransparencyThreshold 方法。 一个整数值，范围为 0 到 255，低于该值的包含 alpha 值的图像像素将被视为完全透明。PostScript 不支持透明度，但可以在彩色图像上应用显式遮罩，使某些像素完全不透明，而另一些像素完全透明。透明阈值用于在原始图像和 PostScript 结果之间寻找最佳相似度。默认值在 C++ 中为 255。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.xps/apsloadoptions/set_transparencythreshold/
---
## ApsLoadOptions::set_TransparencyThreshold method


一个取值范围为 0 到 255 的整数，低于该值的包含 alpha 值的图像像素将被视为完全透明。PostScript 不支持透明度，但可以在彩色图像上应用显式遮罩，使部分像素完全不透明，部分像素完全透明。透明度阈值用于在原始图像和 PostScript 结果之间寻找最佳相似度。默认值为 255。

```cpp
void Aspose::Page::XPS::ApsLoadOptions::set_TransparencyThreshold(int32_t value)
```

## 另见

* Class [ApsLoadOptions](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
