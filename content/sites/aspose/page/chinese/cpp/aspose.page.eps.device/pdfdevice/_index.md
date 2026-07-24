---
title: "Aspose::Page::EPS::Device::PdfDevice 类"
linktitle: "PdfDevice"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::Device::PdfDevice 类。此类封装了在 C++ 中将文档渲染为 PDF 的功能。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


此类封装文档渲染为 PDF 的过程。

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [AUTHOR](./author/)() | \"Author\" 属性值。 |
| static [BACKGROUND](./background/)() | \"Background\" 属性键。 |
| static [BACKGROUND_COLOR](./background_color/)() | \"Background color\" 属性键。 |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 使用给定形状进行裁剪。分派到 writeClip(Rectangle)、writeClip(RectangleF) 或 writeClip(Shape)。 |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | 裁剪矩形。调用 clip(Rectangle2D)。 |
| [ClosePage](./closepage/)() override | 在页面渲染后进行设备的必要准备。 |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | \"Compress\" 属性键。 |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | 创建此设备的副本。 |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | 释放图形上下文。如果在创建时 restoreOnDispose 为 true，将调用 writeGraphicsRestore()。 |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | 绘制路径。 |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | 绘制带有指定变换和背景的图像。 |
| [DrawString](./drawstring/)(System::String, double, double) override | 在给定点绘制字符串。 |
| static [EMBED_FONTS](./embed_fonts/)() | \"Embed font in document\" 属性键。 |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | \"What font type is used for embedding\" 属性键。 |
| static [EMIT_ERRORS](./emit_errors/)() | \"Emit errors\" 属性值。 |
| static [EMIT_WARNINGS](./emit_warnings/)() | \"Emit warnings\" 属性值。 |
| [EndDocument](./enddocument/)() override | 在文档渲染后进行设备的必要准备。 |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | 填充路径。 |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | \"Fit content to page\" 属性键。 |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | 当前页码。 |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | 在字符串周围绘制框架和横幅。该方法计算并返回在绘制字符串之前应设置文本光标的位置点。 |
| [get_OutputStream](./get_outputstream/)() override | 指定或返回输出流。 |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | 获取当前变换。 |
| [InitClip](./initclip/)() override | 初始化设备的剪裁区域。 |
| [InitPageNumbers](./initpagenumbers/)() override | 初始化要输出的页数。 |
| static [KEYWORDS](./keywords/)() | "Keywords"属性值。 |
| [OpenPage](./openpage/)(System::String) override | 在页面渲染之前进行设备的必要准备。 |
| [OpenPage](./openpage/)(float, float) override | 在每个页面渲染之前进行设备的必要准备。 |
| static [ORIENTATION](./orientation/)() | "Orientation"属性键。 |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins"属性键。 |
| static [PAGE_SIZE_](./page_size_/)() | "Page size"属性键。 |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | 使用输出流初始化 [PdfDevice](./) 的新实例。 |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | 使用输出流和指定的页面大小初始化 [PdfDevice](./) 的新实例。 |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | 克隆构造函数。使用现有设备初始化 [PdfDevice](./) 的新实例。 |
| [ReNew](./renew/)() override | 将设备重置为整个文档的初始状态。用于重置输出流。 |
| [ReNewForMerge](./renewformerge/)(bool) override | 在合并多个文档时，将设备重置为整个文档的初始状态。用于重置输出流。 |
| [Reset](./reset/)() override | 如果页面设备参数已设置，此方法允许将写入流返回到页面的起始位置。 |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | 绕 Z 轴旋转当前变换。调用 writeTransform(Transform)。使用正角度 θ 旋转会将点从正 x 轴方向旋转到正 y 轴方向。 |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | 缩放当前变换矩阵。调用 writeTransform(Transform)。 |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | 指定当前字体。 |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | 指定或返回输出流。 |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | 返回或指定当前画刷。 |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | 返回或指定当前笔画。 |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | 指定设备的剪裁区域。 |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | 指定当前变换。由于大多数输出格式不实现此功能，会计算 currentTransform 的逆变换并与要设置的变换相乘。然后通过调用 writeTransform(Transform) 将结果转发。 |
| [Shear](./shear/)(double, double) override | 对当前变换矩阵进行剪切。调用 writeTransform(Transform)。 |
| [StartDocument](./startdocument/)() override | 在开始渲染文档之前进行设备的必要准备。 |
| static [SUBJECT](./subject/)() | "Subject"属性值。 |
| static [TITLE](./title/)() | "Title"属性值。 |
| [ToString](./tostring/)() const override | 返回设备类型的名称。 |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | 变换当前的变换矩阵。调用 writeTransform(Transform)。 |
| [Translate](./translate/)(double, double) override | 平移当前的变换矩阵。调用 writeTransform(Transform)。 |
| static [TRANSPARENT](./transparent/)() | "Transparent" 属性键。 |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | 从其他多页设备更新页面参数。 |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" 属性键。 |
| [WriteBackground](./writebackground/)() override | 写出当前背景。 |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | 写出笔画的端帽。 |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | 写入注释。 |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | 写出笔画的虚线。 |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | 写出目录、文档信息、首选项，以及（因为我们仅使用单页输出）页面树。 |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | 写出笔画的连接方式。 |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | 写出上一次写入的绘画。它在写入绘画后执行图形恢复（"Q"）的情况下很有用。 |
| [WriteMiterLimit](./writemiterlimit/)(float) override | 写出笔画的斜接限制。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | 将绘画写为指定颜色。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | 将绘画写为指定渐变。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | 将绘画写为指定纹理。 |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | 写出绘画。 |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | 使用指定字体写出字符串。 |
| [WriteTrailer](./writetrailer/)() | 写出 PDF 文档的尾部。 |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 将给定的变换矩阵写入文件。 |
| [WriteWarning](./writewarning/)(System::String) override | 写出警告，默认输出到 System.err。 |
| [WriteWidth](./writewidth/)(float) override | 写出笔画的宽度。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [VERSION](./version/) | "Version" 属性键。 |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" 属性值。 |

## Deprecated
PdfDevice 类自 24.3 起已弃用。请改用 PsDocument 类中的 SaveAsPdf 方法。24.6 版本中此类将被完全隐藏

## 另见

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
