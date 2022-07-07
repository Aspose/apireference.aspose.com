---
title: XpsDocument
second_title: Aspose.Page for .NET API 参考
description: 封装 XPS 文档主要实体的类该类为任何 XPS 元素提供操作 方法
type: docs
weight: 390
url: /zh/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

封装 XPS 文档主要实体的类，该类为任何 XPS 元素提供操作 方法。

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [XpsDocument](xpsdocument#constructor)() | 创建具有默认页面大小的空 XPS 文档。 |
| [XpsDocument](xpsdocument#constructor_2)(string) | 打开位于*path*的现有 XPS 文档。 |
| [XpsDocument](xpsdocument#constructor_1)(Stream, LoadOptions) | 将存储在*stream*中的现有文档加载为 XPS 文档。 |
| [XpsDocument](xpsdocument#constructor_3)(string, LoadOptions) | 打开位于*path*的现有文档作为 XPS 文档。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument) { get; } | 获取活动文档编号。 |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage) { get; } | 获取活动文档中的活动页码。 |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount) { get; } | 返回 XPS 包内的文档数。 |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket) { get; set; } | 返回/设置文档的作业打印票 |
| [Page](../../aspose.page.xps/xpsdocument/page) { get; } | 返回活动页面的[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage)实例。 |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount) { get; } | 返回活动文档中的页数。 |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount) { get; } | 返回 XPS 文档内所有文档的总页数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add)(T) | 添加内容元素（画布、路径或字形） |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas)() | 将新画布添加到活动页面。 |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument)(bool) | 添加一个具有默认页面大小的空文档。 |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument_1)(float, float, bool) | 添加具有首页尺寸 *width*和*height*的空文档. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs)(XpsFont, float, float, float, string) | 将新字形添加到活动页面。 |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs_1)(string, float, FontStyle, float, float, string) | 将新字形添加到活动页面。 |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry)(string, int, XpsHyperlinkTarget) | 向文档添加大纲条目。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_1)(bool) | 使用默认页面大小向文档添加一个空白页面。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage)(XpsPage, bool) | 向文档添加页面。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_2)(float, float, bool) | 将一个空页面添加到具有指定 *width*和*height*的文档. |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath)(XpsPathGeometry) | 向活动页面添加新路径。 |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | 创建一个新的椭圆弧段。 |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas)() | 创建一个新的画布。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_5)(Color) | 创建新颜色。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_6)(string, params float[]) | 在基于 ICC 的颜色空间中创建新颜色。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor)(XpsIccProfile, params float[]) | 在基于 ICC 的颜色空间中创建新颜色。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_3)(float, float, float) | 在 scRGB 颜色空间中创建新颜色。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_1)(int, int, int) | 在 sRGB 颜色空间中创建新颜色。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_4)(float, float, float, float) | 在 scRGB 颜色空间中创建新颜色。 |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_2)(int, int, int, int) | 在 sRGB 颜色空间中创建新颜色。 |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont)(Stream) | 在流外创建新的 TrueType 字体资源。 |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont_1)(string, FontStyle) | 创建新的 TrueType 字体资源。 |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs)(XpsFont, float, float, float, string) | 创建新字形。 |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs_1)(string, float, FontStyle, float, float, string) | 创建新字形。 |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop_1)(Color, float) | 创建一个新的渐变色标。 |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop)(XpsColor, float) | 创建一个新的渐变色标。 |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile)(Stream) | 从*stream*创建一个新的 ICC 配置文件资源。 |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile_1)(string) | 从位于 *iccProfilePath*的 ICC 配置文件中创建新的 ICC 配置文件资源。 |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage)(Stream) | 从*stream*创建一个新的图像资源。 |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage_1)(string) | 从位于*imagePath*的图像文件中创建一个新的图像资源。 |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush_1)(string, RectangleF, RectangleF) | 创建一个新的图像画笔。 |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush)(XpsImage, RectangleF, RectangleF) | 创建一个新的图像画笔。 |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush_1)(PointF, PointF) | 创建一个新的线性渐变画笔。 |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | 创建一个新的线性渐变画笔。 |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix)(float, float, float, float, float, float) | 创建一个新的仿射变换矩阵。 |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath)(XpsPathGeometry) | 创建新路径。 |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure)(PointF, bool) | 创建一个新的路径图。 |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | 创建一个新的路径图。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry)() | 创建一个新的路径几何。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | 使用指定的路径图形列表创建新的路径几何。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_2)(string) | 创建一个以缩写形式指定的新路径几何。 |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment)(PointF[], bool) | 创建一组新的三次贝塞尔曲线。 |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment)(PointF[], bool) | 创建一个包含任意数量单个顶点的新多边形图形。 |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment)(PointF[], bool) | 使用指定的控制点从路径图中的前一个点通过一组 顶点创建一组新的二次贝塞尔曲线。 |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush_1)(PointF, PointF, float, float) | 创建一个新的径向渐变画笔。 |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | 创建一个新的径向渐变画笔。 |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush_1)(Color) | 创建一个新的纯色画笔。 |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush)(XpsColor) | 创建一个新的纯色画笔。 |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush)(XpsContentElement, RectangleF, RectangleF) | 创建一个新的视觉画笔。 |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose)() | 释放实例。 |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket)(int) | 返回由*documentIndex*索引的文档的打印票。 |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket)(int, int) | 返回索引的文档中*pageIndex* 索引的页面的打印票文档索引*documentIndex*。 |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert)(int, T) | 将元素（画布、路径或字形）插入到活动页面 在*index*位置。 |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas)(int) | 在*index*位置将新画布插入活动页面。 |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument)(int, bool) | 在*index*位置插入具有默认页面大小 的空文档。 |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument_1)(int, float, float, bool) | 插入具有首页尺寸 *width*和*height*的空文档在*index*位置。 |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs)(int, XpsFont, float, float, float, string) | 在*index*位置将新字形插入活动页面。 |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | 在*index*位置将新字形插入活动页面。 |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_1)(int, bool) | 在*index*位置以默认页面大小 在文档中插入一个空页面。 |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage)(int, XpsPage, bool) | 在*index*位置将页面插入文档。 |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_2)(int, float, float, bool) | 将一个空页面插入到具有指定 *width*和*height*的文档中在*index*位置。 |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath)(int, XpsPathGeometry) | 在*index*位置插入到活动页面的新路径。 |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge_1)(string[], Stream) | 将多个 XPS 文件合并到一个 XPS 文档中。 |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge)(string[], Device, SaveOptions) | 使用[`Device`](../../aspose.page/device)实例将 XPS 文档合并为 PDF。 |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove)(T) | 从活动页面中移除一个元素。 |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat)(int) | 从活动页面中删除*index*位置的元素。 |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat)(int) | 删除*index*位置的文档。 |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage)(XpsPage) | 从文档中删除页面。 |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat)(int) | 从文档中删除*index*位置的页面。 |
| [Save](../../aspose.page.xps/xpsdocument/save#save_1)(Stream) | 将 XPS 文档保存到流。 |
| [Save](../../aspose.page.xps/xpsdocument/save#save_2)(string) | 将 XPS 文档保存到位于*path*的 XPS 文件中。 |
| override [Save](../../aspose.page.xps/xpsdocument/save#save)(Device, SaveOptions) | 使用[`Device`](../../aspose.page/device)实例保存文档。 |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument)(int) | 选择一个活动文档进行编辑。 |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage)(int) | 选择活动文档页面进行编辑。 |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket)(int, DocumentPrintTicket) | 将*printTicket*链接到由*documentIndex*索引的文档。 |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket)(int, int, PagePrintTicket) | 将*printTicket*链接到文档中由*pageIndex* 索引的页面由*documentIndex*索引。 |

### 也可以看看

* class [Document](../../aspose.page/document)
* 命名空间 [Aspose.Page.XPS](../../aspose.page.xps)
* 部件 [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
