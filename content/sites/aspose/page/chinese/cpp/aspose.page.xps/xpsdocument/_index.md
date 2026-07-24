---
title: "Aspose::Page::XPS::XpsDocument 类"
linktitle: "XpsDocument"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument 类。该类封装了 XPS 文档的主要实体，提供对任何 XPS 元素的操作方法，适用于 C++。"
type: docs
weight: 400
url: /zh/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


封装了 [XPS](../) 文档的主要实体的类，提供对任何 [XPS](../) 元素的操作方法。

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(T) | 添加一个内容元素（Canvas、Path 或 Glyphs）。 |
| [AddCanvas](./addcanvas/)() | 向活动页面添加一个新画布。 |
| [AddDocument](./adddocument/)(bool) | 添加一个具有默认页面尺寸的空文档。 |
| [AddDocument](./adddocument/)(float, float, bool) | 添加一个空文档，其第一页尺寸为 *width* 和 *height*。 |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 向活动页面添加新的字形。 |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 向活动页面添加新的字形。 |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | 向文档添加大纲条目。 |
| [AddPage](./addpage/)(bool) | 向文档添加一个具有默认页面尺寸的空页。 |
| [AddPage](./addpage/)(float, float, bool) | 向文档添加一个空页，指定 *width* 和 *height*。 |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | 向文档添加一页。 |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 向活动页面添加一条新路径。 |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | 创建一个新的椭圆弧段。 |
| [CreateCanvas](./createcanvas/)() | 创建一个新的 canvas。 |
| [CreateColor](./createcolor/)(System::Drawing::Color) | 创建一种新颜色。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | 在 sRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | 在 sRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(float, float, float, float) | 在 scRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(float, float, float) | 在 scRGB 颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | 在基于 ICC 的颜色空间中创建一种新颜色。 |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | 在基于 ICC 的颜色空间中创建一种新颜色。 |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | 创建一个新的 **TrueType** 字体资源。 |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | 从流创建一个新的 **TrueType** 字体资源。 |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | 创建新的 glyphs。 |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 创建新的 glyphs。 |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | 创建一个新的渐变停止点。 |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | 创建一个新的渐变停止点。 |
| [CreateIccProfile](./createiccprofile/)(System::String) | 从位于 *iccProfilePath* 的 ICC 配置文件创建一个新的 ICC 配置文件资源。 |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | 从 *stream* 创建一个新的 ICC 配置文件资源。 |
| [CreateImage](./createimage/)(System::String) | 从位于 *imagePath* 的图像文件创建一个新的图像资源。 |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | 从 *stream* 创建一个新的图像资源。 |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 创建一个新的图像画刷。 |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | 创建一个新的图像画刷。 |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | 创建一个新的线性渐变画刷。 |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | 创建一个新的线性渐变画刷。 |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | 创建一个新的仿射变换矩阵。 |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 创建一个新的路径。 |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | 创建一个新的路径图形。 |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | 创建一个新的路径图形。 |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | 创建一个使用简写形式指定的新的路径几何体。 |
| [CreatePathGeometry](./createpathgeometry/)() | 创建一个新的路径几何体。 |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | 创建一个包含指定路径图形列表的新的路径几何体。 |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 创建一组新的三次贝塞尔曲线。 |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 创建一个包含任意数量独立顶点的新的多边形绘图。 |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | 创建一组新的二次贝塞尔曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。 |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | 创建一个新的径向渐变画刷。 |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | 创建一个新的径向渐变画刷。 |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | 创建一个新的纯色画刷。 |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | 创建一个新的纯色画刷。 |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | 创建一个新的视觉画刷。 |
| [Dispose](./dispose/)() override | 释放该实例。 |
| [get_ActiveDocument](./get_activedocument/)() | 获取活动文档的编号。 |
| [get_ActivePage](./get_activepage/)() | 获取活动文档中活动页面的编号。 |
| [get_DocumentCount](./get_documentcount/)() | 返回 [XPS](../) 包中包含的文档数量。 |
| [get_JobPrintTicket](./get_jobprintticket/)() | 返回/设置文档的作业打印票据。 |
| [get_Page](./get_page/)() | 返回活动页面的 [XpsPage](../) 实例。 |
| [get_PageCount](./get_pagecount/)() | 返回活动文档中的页数。 |
| [get_TotalPageCount](./get_totalpagecount/)() | 返回 [XPS](../) 文档中所有文档的页面总数。 |
| [get_Utils](./get_utils/)() const | 获取提供超出正式 [XPS](../) 操作 API 的实用功能的对象。 |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | 返回由 *documentIndex* 索引的文档的打印票据。 |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | 返回在由 *documentIndex* 索引的文档中，由 *pageIndex* 索引的页面的打印票据。 |
| [Insert](./insert/)(int32_t, T) | 在 *index* 位置向活动页面插入一个元素（Canvas、Path 或 Glyphs）。 |
| [InsertCanvas](./insertcanvas/)(int32_t) | 在 *index* 位置向活动页面插入一个新 Canvas。 |
| [InsertDocument](./insertdocument/)(int32_t, bool) | 在 *index* 位置插入一个具有默认页面尺寸的空文档。 |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | 在 *index* 位置插入一个空文档，其首页尺寸为 *width* 和 *height*。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | 在 *index* 位置向活动页面插入新的 Glyphs。 |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | 在 *index* 位置向活动页面插入新的 Glyphs。 |
| [InsertPage](./insertpage/)(int32_t, bool) | 在 *index* 位置向文档插入一个具有默认页面尺寸的空页面。 |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | 在 *index* 位置向文档插入一个具有指定 *width* 和 *height* 的空页面。 |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | 在 *index* 位置向文档插入一个页面。 |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | 在 *index* 位置向活动页面插入一个新 Path。 |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | 将多个 [XPS](../) 文件合并为一个 [XPS](../) 文档。 |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | 将多个 [XPS](../) 文件合并为一个 [XPS](../) 文档。 |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | 使用 [Device](../) 实例将 [XPS](../) 文档合并为 PDF。 |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | 使用 [Device](../) 实例将 [XPS](../) 文档合并为 PDF。 |
| [Remove](./remove/)(T) | 从活动页面移除一个元素。 |
| [RemoveAt](./removeat/)(int32_t) | 从活动页面的 *index* 位置移除一个元素。 |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | 在 *index* 位置移除一个文档。 |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | 从文档中移除一个页面。 |
| [RemovePageAt](./removepageat/)(int32_t) | 在 *index* 位置从文档中移除一个页面。 |
| [Save](./save/)(System::String) | 将 [XPS](../) 文档保存到位于 *path* 的 [XPS](../) 文件。 |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | 将 [XPS](../) 文档保存到流。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | 将文档保存为图像文件。输出目录和文件名将与输入的 [XPS](../) 文件相同。文件扩展名将对应于 "options" 参数中的图像格式。如果文档是使用非 FileStream 的流初始化的，图像文件将保存到当前文件夹，使用默认的文件名模板。 |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | 将文档保存为图像文件到指定目录，并使用指定的文件名。文件扩展名将对应于 "options" 参数中的图像格式。 |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | 以位图图像格式将文档保存为字节数组。 |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | 以 PDF 格式保存文档。 |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | 以 PDF 格式保存文档。 |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | 以 PS 格式保存文档。 |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | 以 PS 格式保存文档。 |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | 选择一个活动文档进行编辑。 |
| [SelectActivePage](./selectactivepage/)(int32_t) | 选择一个活动文档页面进行编辑。 |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | 返回/设置文档的作业打印票据。 |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | 将 *printTicket* 链接到由 *documentIndex* 索引的文档。 |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | 将 *printTicket* 链接到由 *pageIndex* 索引的页面，该页面位于由 *documentIndex* 索引的文档中。 |
| [XpsDocument](./xpsdocument/)() | 创建空的 [XPS](../) 文档，使用默认页面大小。 |
| [XpsDocument](./xpsdocument/)(System::String) | 打开位于 *path* 的现有 [XPS](../) 文档。 |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | 将位于 *path* 的现有文档作为 [XPS](../) 文档打开。 |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | 将存储在 *stream* 中的现有文档加载为 [XPS](../) 文档。 |
## 另见

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
