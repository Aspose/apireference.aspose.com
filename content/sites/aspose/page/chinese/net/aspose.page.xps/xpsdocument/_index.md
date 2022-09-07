---
title: XpsDocument
second_title: Aspose.Page for .NET API 参考
description: 封装 XPS 文档主要实体的类为任何 XPS 元素提供操作 方法
type: docs
weight: 410
url: /zh/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

封装 XPS 文档主要实体的类，为任何 XPS 元素提供操作 方法。

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [XpsDocument](xpsdocument#constructor)() | 创建具有默认页面大小的空 XPS 文档。 |
| [XpsDocument](xpsdocument#constructor_2)(string) | 打开位于*path*. |
| [XpsDocument](xpsdocument#constructor_1)(Stream, LoadOptions) | 加载存储在*stream*作为 XPS 文档。 |
| [XpsDocument](xpsdocument#constructor_3)(string, LoadOptions) | 打开位于*path*作为 XPS 文档。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument) { get; } | 获取活动文档编号。 |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage) { get; } | 获取活动文档中的活动页码。 |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount) { get; } | 返回 XPS 包内的文档数。 |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket) { get; set; } | 返回/设置文档的作业打印票 |
| [Page](../../aspose.page.xps/xpsdocument/page) { get; } | 返回一个[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage)活动页面的实例。 |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount) { get; } | 返回活动文档中的页数。 |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount) { get; } | 返回 XPS 文档中所有文档的总页数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add)(T) | 添加内容元素（画布、路径或字形） |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas)() | 将新画布添加到活动页面。 |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument)(bool) | 添加一个具有默认页面大小的空文档。 |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument_1)(float, float, bool) | 添加具有第一页尺寸的空文档 *width*和*height*. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs)(XpsFont, float, float, float, string) | 将新字形添加到活动页面。 |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs_1)(string, float, FontStyle, float, float, string) | 将新字形添加到活动页面。 |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry)(string, int, XpsHyperlinkTarget) | 向文档添加大纲条目。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_1)(bool) | 使用默认页面大小向文档添加一个空白页面。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage)(XpsPage, bool) | 向文档添加页面。 |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_2)(float, float, bool) | 将一个空页面添加到具有指定 的文档中*width*和*height*. |
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
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont_1)(string, FontStyle) | 创建一个新的 TrueType 字体资源。 |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs)(XpsFont, float, float, float, string) | 创建新字形。 |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs_1)(string, float, FontStyle, float, float, string) | 创建新字形。 |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop_1)(Color, float) | 创建一个新的渐变色标。 |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop)(XpsColor, float) | 创建一个新的渐变色标。 |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile)(Stream) | 创建一个新的 ICC 配置文件资源*stream*. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile_1)(string) | 从位于 的 ICC 配置文件文件中创建新的 ICC 配置文件资源*iccProfilePath*. |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage)(Stream) | 创建一个新的图像资源*stream*. |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage_1)(string) | 从位于*imagePath*. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush_1)(string, RectangleF, RectangleF) | 创建一个新的图像画笔。 |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush)(XpsImage, RectangleF, RectangleF) | 创建一个新的图像画笔。 |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush_1)(PointF, PointF) | 创建一个新的线性渐变画笔。 |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | 创建一个新的线性渐变画笔。 |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix)(float, float, float, float, float, float) | 创建一个新的仿射变换矩阵。 |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath)(XpsPathGeometry) | 创建一个新路径。 |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure)(PointF, bool) | 创建一个新的路径图。 |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | 创建一个新的路径图。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry)() | 创建一个新的路径几何图形。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | 使用指定的路径图形列表创建一个新的路径几何图形。 |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_2)(string) | 创建一个以缩写形式指定的新路径几何图形。 |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment)(PointF[], bool) | 创建一组新的三次贝塞尔曲线。 |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment)(PointF[], bool) | 创建一个包含任意数量单个顶点的新多边形图形。 |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment)(PointF[], bool) | 使用指定的控制点从路径图中的前一个点通过顶点集 创建一组新的二次贝塞尔曲线。 |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush_1)(PointF, PointF, float, float) | 创建一个新的径向渐变画笔。 |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | 创建一个新的径向渐变画笔。 |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush_1)(Color) | 创建一个新的纯色画笔。 |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush)(XpsColor) | 创建一个新的纯色画笔。 |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush)(XpsContentElement, RectangleF, RectangleF) | 创建一个新的视觉画笔。 |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose)() | 处理实例。 |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket)(int) | 返回由索引的文档的打印票*documentIndex*. |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket)(int, int) | 返回由索引的页面的打印票*pageIndex* 在被索引的文档中*documentIndex*. |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert)(int, T) | 将元素（画布、路径或字形）插入到活动页面 at*index*位置. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas)(int) | 在活动页面中插入一个新画布*index*位置. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument)(int, bool) | 在默认页面大小 处插入一个空文档*index*位置. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument_1)(int, float, float, bool) | 插入具有第一页尺寸的空文档 *width*和*height*在*index*位置. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs)(int, XpsFont, float, float, float, string) | 在活动页面中插入新字形*index*位置. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | 在活动页面中插入新字形*index*位置. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_1)(int, bool) | 在文档中插入一个空白页面，默认页面大小为 *index*位置. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage)(int, XpsPage, bool) | 在文档中插入一个页面*index*位置. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_2)(int, float, float, bool) | 将一个空白页插入到具有指定 的文档中*width*和*height*在*index*位置. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath)(int, XpsPathGeometry) | 在以下位置插入到活动页面的新路径*index*位置. |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge_1)(string[], Stream) | 将多个 XPS 文件合并到一个 XPS 文档中。 |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge)(string[], Device, SaveOptions) | 使用[`Device`](../../aspose.page/device)实例. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove)(T) | 从活动页面中删除一个元素。 |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat)(int) | 删除一个元素*index*活动页面的位置。 |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat)(int) | 删除一个文档*index*位置. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage)(XpsPage) | 从文档中删除一个页面。 |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat)(int) | 从文档中删除一页*index*位置. |
| [Save](../../aspose.page.xps/xpsdocument/save#save_1)(Stream) | 将 XPS 文档保存到流中。 |
| [Save](../../aspose.page.xps/xpsdocument/save#save_2)(string) | 将 XPS 文档保存到位于*path*. |
| override [Save](../../aspose.page.xps/xpsdocument/save#save)(Device, SaveOptions) | 使用[`Device`](../../aspose.page/device)实例. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument)(int) | 选择一个活动文档进行编辑。 |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage)(int) | 选择一个活动文档页面进行编辑。 |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket)(int, DocumentPrintTicket) | 链接*printTicket*到索引的文档*documentIndex*. |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket)(int, int, PagePrintTicket) | 链接*printTicket*到索引的页面*pageIndex* 在被索引的文档中*documentIndex*. |

### 也可以看看

* class [Document](../../aspose.page/document)
* 命名空间 [Aspose.Page.XPS](../../aspose.page.xps)
* 部件 [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
