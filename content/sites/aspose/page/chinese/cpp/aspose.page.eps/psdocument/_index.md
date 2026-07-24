---
title: "Aspose::Page::EPS::PsDocument 类"
linktitle: "PsDocument"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument 类。此类在 C++ 中封装 PS/EPS 文档。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


此类封装了 PS/EPS 文档。

```cpp
class PsDocument : public Aspose::Page::Document
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 向当前图形状态添加裁剪。 |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 向当前图形状态添加裁剪，然后写入 \"newpath\" 操作符。这样做是为了避免此裁剪路径与后续路径（例如使用 \"charpath\" 操作符描边的字形）相交。 |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | 向当前图形状态添加裁剪矩形。 |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 根据给定字体的指定文本轮廓添加裁剪。 |
| [ClosePage](./closepage/)() | 完成当前页面。 |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | 将 Type 1 字体转换为 **TrueType**。转换后的 TTF 字体名称将与输入的 Type 1 字体相同，仅添加 \".ttf\" 扩展名。TTF 文件将保存到指定的输出目录。 |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | 将 Type 3 字体转换为 **TrueType**。转换后的 TTF 字体名称将与输入的 Type 3 字体文件相同，仅添加 \".ttf\" 扩展名。TTF 文件将保存到指定的输出目录。 |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | 将 Type 3 字体转换为 **TrueType** 流。 |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | 将给定的 [PsDocument](./) 裁剪为 [EPS](../) 文件。它会保存初始的 [EPS](../) 文件，并更新现有的 %BoundingBox，或创建新的。 |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | 将给定的 [PsDocument](./) 裁剪为 [EPS](../) 文件。它会保存初始的 [EPS](../) 文件，并更新现有的 %BoundingBox，或创建新的。 |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 绘制任意路径。 |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | 绘制弧线。 |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 绘制遮罩图像。 |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | 绘制图像。 |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | 绘制带背景的变换图像。 |
| [DrawLine](./drawline/)(double, double, double, double) | 绘制线段。 |
| [DrawOval](./drawoval/)(double, double, double, double) | 绘制椭圆。 |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 绘制多边形。 |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | 绘制多边形。 |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 绘制折线。 |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | 绘制折线。 |
| [DrawRect](./drawrect/)(double, double, double, double) | 绘制矩形。 |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | 绘制圆角矩形。 |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | 绘制变换后的透明图像。如果图像没有 Alpha 通道，则会以不透明图像绘制。 |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | 读取 [EPS](../) 文件并从 %BoundingBox 注释中提取 [EPS](../) 图像的边界框；如果不存在，则使用默认页面尺寸 (0, 0, 595, 842) 的边界。 |
| [ExtractEpsSize](./extractepssize/)() | 读取 [EPS](../) 文件并从 %BoundingBox 注释中提取 [EPS](../) 图像的尺寸；如果不存在，则使用默认页面尺寸 (595, 842)。 |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | 从 PS 文件中提取文本。仅当文本使用 Type 42 (**TrueType**) 字体或在其向量映射中包含 Type 42 字体的 Type 0 字体时才能提取。 |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 填充任意路径。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | 填充弧线。 |
| [FillOval](./filloval/)(double, double, double, double) | 填充椭圆。 |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 填充多边形。 |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | 填充多边形。 |
| [FillRect](./fillrect/)(double, double, double, double) | 填充矩形。 |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | 填充圆角矩形。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 通过填充字形内部来添加文本字符串。 |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 通过填充字形内部来添加文本字符串。 |
| [get_InputStream](./get_inputstream/)() | 使用流和加载选项初始化 [PsDocument](./)。 |
| [get_NumberOfPages](./get_numberofpages/)() const | 返回生成的 PDF 文档的页数。 |
| [GetPaint](./getpaint/)() | 获取当前图形状态的绘图对象。 |
| [GetStroke](./getstroke/)() | 设置当前图形状态的描边。 |
| [GetXmpMetadata](./getxmpmetadata/)() | 读取 PS/EPS 文件并提取 XmpMetdata（如果已存在），如果不存在则添加新的。 |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | 将 PS/EPS 文件合并到设备。 |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | 将 PS/EPS 文件合并到设备。 |
| [OpenPage](./openpage/)(float, float) | 创建新页面并将其设为当前页面。 |
| [OpenPage](./openpage/)(System::String) | 使用文档尺寸创建新页面并将其设为当前页面。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 通过绘制字形轮廓添加文本字符串。 |
| [PsDocument](./psdocument/)() | 初始化空的 [PsDocument](./)。此构造函数仅用于与 PostScript 文件无关的附加操作，例如转换字体。 |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | 使用已初始化的页面初始化空的 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 使用已初始化的页面初始化空的 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | 初始化空的 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | 初始化空的 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | 当预先知道 [Postscript](../../aspose.page.eps.postscript/) 文档页数时，初始化空的 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | 当预先知道 [Postscript](../../aspose.page.eps.postscript/) 文档页数时，初始化空的 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::String) | 使用输入的 PS/EPS 文件初始化 [PsDocument](./)。 |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | 使用 PS/EPS 文件流初始化 [PsDocument](./)。 |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | 将给定的 [PsDocument](./) 调整为 [EPS](../) 文件。此方法仅在提取 [EPS](../) 大小后使用。它保存初始的 [EPS](../) 文件，并使用更新的现有 %BoundingBox 或创建新的。还将设置 [Page](../../aspose.page/) 的变换矩阵。 |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | 将给定的 [PsDocument](./) 调整为 [EPS](../) 文件。此方法仅在提取 [EPS](../) 大小后使用。它保存初始的 [EPS](../) 文件，并使用更新的现有 %BoundingBox 或创建新的。还将设置 [Page](../../aspose.page/) 的变换矩阵。 |
| [Rotate](./rotate/)(float) | 在当前图形状态中添加围绕原点的逆时针旋转（旋转当前矩阵）。 |
| [Rotate](./rotate/)(int32_t) | 在当前图形状态中添加围绕原点的逆时针旋转（旋转当前矩阵）。 |
| [Save](./save/)(System::String) | 将给定的 [PsDocument](./) 保存为 [EPS](../) 文件。此方法仅在更新 [XMP](../../aspose.page.eps.xmp/) 元数据后使用。它保存初始的 [EPS](../) 文件，并使用更新的现有元数据或在调用 GetMetadata 方法时创建的新元数据。最后的情况下会添加所有必要的 PostScript 代码和 [EPS](../) 注释。 |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | 将给定的 [PsDocument](./) 保存到流中。此方法仅在更新 [XMP](../../aspose.page.eps.xmp/) 元数据后使用。它保存初始的 [EPS](../) 文件，并使用更新的现有元数据或在调用 GetMetadata 方法时创建的新元数据。最后的情况下会添加所有必要的 PostScript 代码和 [EPS](../) 注释。 |
| [Save](./save/)() | 将给定的 [PsDocument](./) 保存为 PS 或 [EPS](../) 文件。此方法仅在 [PsDocument](./) 从头创建时使用。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | 将 PS/EPS 文件保存为图像文件。输出目录和文件名将与输入的 PS 文件相同。文件扩展名将对应于 \"options\" 参数中的图像格式。如果文档是使用非 FileStream 的流初始化的，图像文件将保存在当前文件夹中，使用默认的文件名模板。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | 将 PS/EPS 文件保存为图像文件到指定目录，并使用指定的文件名。文件扩展名将对应于 \"options\" 参数中的图像格式。 |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | 将 PS/EPS 文件保存为图像字节数组。 |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | 将 PS/EPS 文件保存为 PDF 文件。 |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | 将 PS/EPS 文件保存为 PDF 流。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 将 PNG/JPEG/TIFF/BMP/GIF/EMF 图像从输入流保存到 [EPS](../) 输出流。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | 将 PNG/JPEG/TIFF/BMP/GIF/EMF 图像从文件保存到 [EPS](../) 文件。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | 将 Bitmap 对象保存到 [EPS](../) 文件。 |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 将 Bitmap 对象保存到 [EPS](../) 输出流。 |
| [Scale](./scale/)(float, float) | 在当前图形状态中添加缩放（缩放当前矩阵）。 |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | 使用流和加载选项初始化 [PsDocument](./)。 |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 设置页面设备参数（参见操作符 \"setpagedevice\" 的 PostScript 规范）。其中可能包括页面尺寸、颜色等。 |
| [SetPageSize](./setpagesize/)(float, float) | 设置页面尺寸。要在同一文档中创建不同尺寸的页面，请在此方法之后立即使用 [SetPageDevice](./setpagedevice/) 方法。 |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | 在当前图形状态中设置绘图。 |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | 设置当前图形状态的描边。 |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 将当前变换设置为此变换。 |
| [Shear](./shear/)(float, float) | 围绕一点逆时针旋转当前图形状态。 |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 向当前图形状态添加变换（将此矩阵与当前矩阵连接）。 |
| [Translate](./translate/)(float, float) | 向当前图形状态添加平移（平移当前矩阵）。 |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | 写入恢复当前图形状态的操作（参见 PostScript 规范中操作符 "grestore"）。 |
| [WriteGraphicsSave](./writegraphicssave/)() | 写入保存当前图形状态的操作（参见 PostScript 规范中操作符 "gsave"）。 |
## 另见

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
