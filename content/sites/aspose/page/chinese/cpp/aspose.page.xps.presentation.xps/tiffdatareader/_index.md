---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader 类"
linktitle: "TiffDataReader"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader 类。该类用于读取 TIFF 图像文件目录（IFD）中的数据。它帮助读取 TIFF 分辨率并在 C++ 中检查 TIFF 的符合性。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


此类用于读取 TIFF 图像文件目录（IFD）中的数据。它有助于读取 TIFF 分辨率并检查 TIFF 合规性。

```cpp
class TiffDataReader : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | 返回 TIFF 图像高度。如果高度为 0，则返回默认值（100）。 |
| [get_ImageWidth](./get_imagewidth/)() | 返回 TIFF 图像宽度。如果宽度为 0，则返回默认值（100）。 |
| [get_ImageXResolution](./get_imagexresolution/)() const | 返回 TIFF 图像的 X 分辨率。 |
| [get_ImageYResolution](./get_imageyresolution/)() const | 返回 TIFF 图像的 Y 分辨率。 |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | 如果 TIFF 图像符合 [XPS](../../aspose.page.xps/) 规范并且可以直接插入到 [XPS](../../aspose.page.xps/) 文档中，则返回 true。 |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | 该格式的文档位于 Aspose.Words\\Doc 中。 |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | 初始化 [TiffDataReader](./) 类的新实例。 |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | 初始化 [TiffDataReader](./) 类的新实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
