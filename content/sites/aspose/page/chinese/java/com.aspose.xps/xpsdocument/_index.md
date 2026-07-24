---
title: "XpsDocument"
second_title: "Aspose.Page for Java API 参考"
description: "封装 XPS 文档主要实体的类，提供对任何 XPS 元素的操作方法。"
type: docs
weight: 19
url: /zh/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

封装 XPS 文档主要实体的类，提供对任何 XPS 元素的操作方法。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | 创建具有默认页面大小的空 XPS 文档。 |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | 打开位于路径的现有 XPS 文档。 |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | 将存储在流中的现有文档加载为 XPS 文档。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | 添加内容元素（Canvas、Path 或 Glyphs） |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | 在索引位置向活动页面插入元素（Canvas、Path 或 Glyphs）。 |
| [<T>remove(T element)](#-T-remove-T-) | 从活动页面移除元素。 |
| [addCanvas()](#addCanvas--) | 向活动页面添加新画布。 |
| [addDocument()](#addDocument--) | 添加具有默认页面大小的空文档并将其设为活动文档。 |
| [addDocument(boolean activate)](#addDocument-boolean-) | 添加具有默认页面大小的空文档。 |
| [addDocument(float width, float height)](#addDocument-float-float-) | 添加具有首页宽度和高度的空文档并将其设为活动文档。 |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | 添加一个空文档，第一页的尺寸为 width 和 height。 |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 向活动页添加新字形。 |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 向活动页添加新字形。 |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | 向文档添加大纲条目。 |
| [addPage()](#addPage--) | 向文档添加一个使用默认页面大小的空页。 |
| [addPage(boolean activate)](#addPage-boolean-) | 向文档添加一个使用默认页面大小的空页。 |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | 向文档添加页面并将添加的页面设为活动页面。 |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | 向文档添加页面。 |
| [addPage(float width, float height)](#addPage-float-float-) | 向文档添加一个指定宽度 width 和高度 height 的空页。 |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | 向文档添加一个指定宽度 width 和高度 height 的空页。 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | 向活动页添加新路径。 |
| [close()](#close--) | 释放该实例。 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | 创建一个新的描边椭圆弧段。 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | 创建一个新的椭圆弧段。 |
| [createCanvas()](#createCanvas--) | 创建一个新的画布。 |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | 在基于 ICC 的色彩空间中创建新颜色。 |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | 在 scRGB 色彩空间中创建新颜色。 |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | 在 scRGB 色彩空间中创建新颜色。 |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | 在 sRGB 色彩空间中创建新颜色。 |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | 在 sRGB 色彩空间中创建新颜色。 |
| [createColor(Color color)](#createColor-java.awt.Color-) | 创建新颜色。 |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | 在基于 ICC 的色彩空间中创建新颜色。 |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | 从流创建新的 TrueType 字体资源。 |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | 创建新的 TrueType 字体资源。 |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 创建新字形。 |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 创建新字形。 |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | 创建新的渐变停止点。 |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | 创建新的渐变停止点。 |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | 从流创建新的 ICC 配置文件资源。 |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | 从位于 iccProfilePath 的 ICC 配置文件创建新的 ICC 配置文件资源。 |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | 从流创建新的图像资源。 |
| [createImage(String imagePath)](#createImage-java.lang.String-) | 从位于 imagePath 的图像文件创建新的图像资源。 |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 创建新的图像画刷。 |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 创建新的图像画刷。 |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | 创建新的线性渐变画刷。 |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | 创建新的线性渐变画刷。 |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | 创建新的仿射变换矩阵。 |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | 创建新的路径。 |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | 创建新的开放路径图形。 |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | 创建新的路径图形。 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | 创建新的开放路径图形。 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | 创建新的路径图形。 |
| [createPathGeometry()](#createPathGeometry--) | 创建新的路径几何体。 |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | 创建一个使用简写形式指定的新路径几何体。 |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | 创建一个使用指定路径图形列表的新路径几何体。 |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | 创建一组新的描边立方 B?zier 曲线。 |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | 创建一组新的立方 B?zier 曲线。 |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | 创建一个包含任意数量单个顶点的新的描边多边形绘图。 |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | 创建一个包含任意数量单个顶点的新的多边形绘图。 |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | 创建一组新的描边二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。 |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | 创建一组新的二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。 |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 创建一个新的径向渐变画刷。 |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 创建一个新的径向渐变画刷。 |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | 创建一个新的纯色画刷。 |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | 创建一个新的纯色画刷。 |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 创建一个新的可视画刷。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | 返回活动文档的编号。 |
| [getActivePage()](#getActivePage--) | 返回活动文档中活动页的页码。 |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | 返回 XPS 包中文档的数量。 |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | 获取索引为 documentIndex 的文档的打印票据。 |
| [getJobPrintTicket()](#getJobPrintTicket--) | 返回文档的作业打印票据。 |
| [getPage()](#getPage--) | 返回活动页的 XpsPage 实例。 |
| [getPageCount()](#getPageCount--) | 返回活动文档中的页数。 |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | 获取索引为 documentIndex 的文档中索引为 pageIndex 的页面的打印票据。 |
| [getTotalPageCount()](#getTotalPageCount--) | 返回 XPS 文档中所有文档的总页数。 |
| [getUtils()](#getUtils--) | 获取提供超出正式 XPS 操作 API 的实用功能的对象。 |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | 在索引位置 index 将新画布插入活动页。 |
| [insertDocument(int index)](#insertDocument-int-) | 在索引位置 index 插入一个默认页面大小的空文档，并将插入的文档设为活动文档。 |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | 在索引位置 index 插入一个默认页面大小的空文档。 |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | 在索引位置 index 插入一个第一页尺寸为 width 和 height 的空文档，并将插入的文档设为活动文档。 |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | 在  index  位置插入一个空文档，首页尺寸为  width  和  height  。 |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 在  index  位置向活动页插入新的字形。 |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 在  index  位置向活动页插入新的字形。 |
| [insertPage(int index)](#insertPage-int-) | 在  index  位置插入一个空页，使用默认页面大小，并将插入的页面设为活动页。 |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | 在  index  位置插入一个空页，使用默认页面大小。 |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | 在  index  位置向文档插入一个页面，并将插入的页面设为活动页。 |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | 在  index  位置向文档插入一个页面。 |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | 在  index  位置插入一个空页，指定  width  和  height  ，并将插入的页面设为活动页。 |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | 在  index  位置插入一个空页，指定  width  和  height  。 |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | 在  index  位置向活动页插入一条新路径。 |
| [isLicensed()](#isLicensed--) | 指示是否已访问并且有效的 Aspose.Page for Java 产品许可证。 |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | 将多个 XPS 文件合并为一个 XPS 文档。 |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | 将多个 XPS 文件合并为一个 XPS 文档。 |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | 使用  Device  实例将 XPS 文档合并为 PDF。 |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | 使用  Device  实例将 XPS 文档合并为 PDF。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | 在  index  位置从活动页移除一个元素。 |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | 在  index  位置移除一个文档。 |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | 从文档中移除一页。 |
| [removePageAt(int index)](#removePageAt-int-) | 在  index  位置从文档中移除一页。 |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | 使用  Device  实例保存文档。 |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | 将 XPS 文档保存到流。 |
| [save(String path)](#save-java.lang.String-) | 将 XPS 文档保存到位于  path  的 XPS 文件。 |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | 将文档保存为图像文件。输出目录和文件名将与输入的 XPS 文件相同。 |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | 将文档保存为图像文件到指定目录，并使用指定的文件名。 |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | 以位图图像格式将文档保存为字节数组。 |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | 以 PDF 格式保存文档。 |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | 以 PDF 格式保存文档。 |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 以 PS 格式保存文档。 |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 以 PostScript 格式保存文档。 |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | 选择一个活动文档进行编辑。 |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | 选择一个活动文档页面进行编辑。 |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | 将  printTicket  链接到由  documentIndex  索引的文档。 |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | 设置文档的作业打印票据。 |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | 将  printTicket  链接到文档（由  documentIndex  索引）中由  pageIndex  索引的页面。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


创建具有默认页面大小的空 XPS 文档。

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


打开位于路径的现有 XPS 文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| path | java.lang.String | 文档的位置。 |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


将存储在流中的现有文档加载为 XPS 文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.InputStream | 文档流。 |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | 文档加载选项。 |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


添加内容元素（Canvas、Path 或 Glyphs）

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 元素 | T | 要添加的元素。 |

**Returns:**
T - 已添加的元素。
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


在索引位置向活动页面插入元素（Canvas、Path 或 Glyphs）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入元素的位置。 |
| 元素 | T | 要插入的元素。 |

**Returns:**
T - 已插入的元素。
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


从活动页面移除元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 元素 | T | 要删除的元素。 |

**Returns:**
T - 已删除的元素。
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


向活动页面添加新画布。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


添加具有默认页面大小的空文档并将其设为活动文档。

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


添加具有默认页面大小的空文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 激活 | boolean | 标志，指示是否将添加的文档设为活动。 |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


添加具有首页宽度和高度的空文档并将其设为活动文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 第一页的宽度。 |
| 高度 | float | 第一页的高度。 |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


添加一个空文档，第一页的尺寸为 width 和 height。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 第一页的宽度。 |
| 高度 | float | 第一页的高度。 |
| 激活 | boolean | 标志，指示是否将添加的文档设为活动。 |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


向活动页添加新字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 字体资源。 |
| fontRenderingEmSize | float | 字体大小。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


向活动页添加新字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFamily | java.lang.String | 字体族。 |
| fontRenderingEmSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


向文档添加大纲条目。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| description | java.lang.String | 条目描述。 |
| outlineLevel | int | 大纲级别。 |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | 入口目标。 |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


向文档添加一个使用默认页面大小的空页。

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


向文档添加一个使用默认页面大小的空页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 激活 | boolean | 标志，指示是否将添加的页面设为活动。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


向文档添加页面并将添加的页面设为活动页面。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 要添加的页面。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


向文档添加页面。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 要添加的页面。 |
| 激活 | boolean | 标志，指示是否将添加的页面设为活动。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


向文档添加一个指定宽度 width 和高度 height 的空页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 新页面的宽度。 |
| 高度 | float | 新页面的高度。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


向文档添加一个指定宽度 width 和高度 height 的空页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 新页面的宽度。 |
| 高度 | float | 新页面的高度。 |
| 激活 | boolean | 标志，指示是否将添加的页面设为活动。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


向活动页添加新路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


释放该实例。

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


创建一个新的描边椭圆弧段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| point | java.awt.geom.Point2D | 椭圆弧的终点。 |
| 大小 | java.awt.geom.Dimension2D | 椭圆弧的 x 和 y 半径，以 x,y 对的形式。 |
| rotationAngle | float | 指示椭圆相对于当前坐标系的旋转方式。 |
| isLargeArc | boolean | 确定弧线的扫掠是否为 180 度或更大。 |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 弧线绘制的方向。 |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


创建一个新的椭圆弧段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| point | java.awt.geom.Point2D | 椭圆弧的终点。 |
| 大小 | java.awt.geom.Dimension2D | 椭圆弧的 x 和 y 半径，以 x,y 对的形式。 |
| rotationAngle | float | 指示椭圆相对于当前坐标系的旋转方式。 |
| isLargeArc | boolean | 确定弧线的扫掠是否为 180 度或更大。 |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 弧线绘制的方向。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


创建一个新的画布。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


在基于 ICC 的色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC 配置文件资源。 |
| components | float[] | 颜色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


在 scRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| r | float | 红色分量。 |
| g | float | 绿色分量。 |
| b | float | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


在 scRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | float | Alpha 颜色分量。 |
| r | float | 红色分量。 |
| g | float | 绿色分量。 |
| b | float | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


在 sRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| r | int | 红色分量。 |
| g | int | 绿色分量。 |
| b | int | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


在 sRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | int | Alpha 颜色分量。 |
| r | int | 红色分量。 |
| g | int | 绿色分量。 |
| b | int | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | java.awt.Color | RGB 颜色的本机颜色实例。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


在基于 ICC 的色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| path | java.lang.String | ICC 配置文件的路径。 |
| components | float[] | 颜色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


从流创建新的 TrueType 字体资源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.InputStream | 包含要作为资源使用的 ICC 配置文件的流。 |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


创建新的 TrueType 字体资源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFamily | java.lang.String | 字体系列。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。请参阅  XpsFont  类常量（它们是位标志），了解可组合的取值。 |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


创建新字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 字体资源。 |
| fontRenderingEmSize | float | 字体大小。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


创建新字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFamily | java.lang.String | 字体族。 |
| fontRenderingEmSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


创建新的渐变停止点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 渐变停止颜色。 |
| 偏移量 | float | 渐变偏移量。 |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


创建新的渐变停止点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | java.awt.Color | 渐变停止颜色。 |
| 偏移量 | float | 渐变偏移量。 |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


从流创建新的 ICC 配置文件资源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.InputStream | 包含要作为资源使用的 ICC 配置文件的流。 |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


从位于 iccProfilePath 的 ICC 配置文件创建新的 ICC 配置文件资源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| iccProfilePath | java.lang.String | 作为资源使用的 ICC 配置文件的路径。 |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


从流创建新的图像资源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.InputStream | 包含要作为资源使用的图像的流。 |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


从位于 imagePath 的图像文件创建新的图像资源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 图像路径 | java.lang.String | 作为资源使用的图像的路径。 |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


创建新的图像画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | 图像资源。 |
| 视图框 | java.awt.geom.Rectangle2D | 画笔源内容的位置和尺寸。 |
| 视口 | java.awt.geom.Rectangle2D | 在包含坐标空间中，主画笔瓦片的区域（可能会重复）被用于填充画笔所应用的区域。 |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


创建新的图像画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 图像路径 | java.lang.String | 用作画笔瓦片的图像路径。 |
| 视图框 | java.awt.geom.Rectangle2D | 画笔源内容的位置和尺寸。 |
| 视口 | java.awt.geom.Rectangle2D | 在包含坐标空间中，主画笔瓦片的区域（可能会重复）被用于填充画笔所应用的区域。 |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


创建新的线性渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 线性渐变的起始点。 |
| 结束点 | java.awt.geom.Point2D | 线性渐变的结束点。 |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


创建新的线性渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 渐变停止点 | java.util.List<com.aspose.xps.XpsGradientStop> | 渐变停止点的列表。 |
| 起始点 | java.awt.geom.Point2D | 线性渐变的起始点。 |
| 结束点 | java.awt.geom.Point2D | 线性渐变的结束点。 |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


创建新的仿射变换矩阵。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| m11 | float | 元素 11。 |
| m12 | float | 元素 12。 |
| m21 | float | 元素 21。 |
| m22 | float | 元素 22。 |
| m31 | float | 元素 31。 |
| m32 | float | 元素 32。 |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


创建新的路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


创建新的开放路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


创建新的路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |
| isClosed | boolean | 指定路径是否闭合。如果设置为 true，则描边以 "closed" 方式绘制，即路径图形最后一个段的最后一点会连接到 StartPoint 属性指定的点；否则描边以 "open" 方式绘制，最后一点不会连接到起始点。仅在路径图形用于指定描边的 Path 元素时适用。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


创建新的开放路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 路径段的列表。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


创建新的路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 路径段的列表。 |
| isClosed | boolean | 指定路径是否闭合。如果设置为 true，则描边以 "closed" 方式绘制，即路径图形最后一个段的最后一点会连接到 StartPoint 属性指定的点；否则描边以 "open" 方式绘制，最后一点不会连接到起始点。仅在路径图形用于指定描边的 Path 元素时适用。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


创建新的路径几何体。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


创建一个使用简写形式指定的新路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | 路径几何的简写形式。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


创建一个使用指定路径图形列表的新路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | 路径图形的列表。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


创建一组新的描边立方 B?zier 曲线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个 B?bezier 段的控制点。 |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


创建一组新的立方 B?zier 曲线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个 B?bezier 段的控制点。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


创建一个包含任意数量单个顶点的新的描边多边形绘图。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 定义折线段的多个段的坐标集合。 |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


创建一个包含任意数量单个顶点的新的多边形绘图。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 定义折线段的多个段的坐标集合。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


创建一组新的描边二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个二次 B?bezier 段的控制点。 |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


创建一组新的二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个二次 B?bezier 段的控制点。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


创建一个新的径向渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 径向渐变的中心点（即椭圆的中心）。 |
| gradientOrigin | java.awt.geom.Point2D | 径向渐变的起始点。 |
| radiusX | float | 定义径向渐变的椭圆在 x 维度上的半径。 |
| radiusY | float | 定义径向渐变的椭圆在 y 维度上的半径。 |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


创建一个新的径向渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 渐变停止点 | java.util.List<com.aspose.xps.XpsGradientStop> | 渐变停止点的列表。 |
| center | java.awt.geom.Point2D | 径向渐变的中心点（即椭圆的中心）。 |
| gradientOrigin | java.awt.geom.Point2D | 径向渐变的起始点。 |
| radiusX | float | 定义径向渐变的椭圆在 x 维度上的半径。 |
| radiusY | float | 定义径向渐变的椭圆在 y 维度上的半径。 |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


创建一个新的纯色画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 填充元素的颜色。 |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


创建一个新的纯色画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | java.awt.Color | 填充元素的颜色。 |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


创建一个新的可视画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | 用于视觉刷子 Visual 属性的 XPS 元素（Canvas、Path 或 Glyphs）。 |
| 视图框 | java.awt.geom.Rectangle2D | 画笔源内容的位置和尺寸。 |
| 视口 | java.awt.geom.Rectangle2D | 在包含坐标空间中，主画笔瓦片的区域（可能会重复）被用于填充画笔所应用的区域。 |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


返回活动文档的编号。

**Returns:**
int - 整数值。
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


返回活动文档中活动页的页码。

**Returns:**
int - 整数值。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


返回 XPS 包中文档的数量。

**Returns:**
int - XPS 包内的文档数量。
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


获取索引为 documentIndex 的文档的打印票据。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| documentIndex | int | 要返回其打印票据的文档索引。 |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


返回文档的作业打印票据。

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


返回活动页的 XpsPage 实例。

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


返回活动文档中的页数。

**Returns:**
int - 活动文档中的页数。
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


获取索引为 documentIndex 的文档中索引为 pageIndex 的页面的打印票据。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| documentIndex | int | 文档的索引。 |
| pageIndex | int | 要返回其打印票据的页面索引。 |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


返回 XPS 文档中所有文档的总页数。

**Returns:**
int - XPS 文档中所有文档的总页数。
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


获取提供超出正式 XPS 操作 API 的实用功能的对象。

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


在索引位置 index 将新画布插入活动页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Canvas 的位置。 |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


在索引位置 index 插入一个默认页面大小的空文档，并将插入的文档设为活动文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入文档的位置。 |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


在索引位置 index 插入一个默认页面大小的空文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入文档的位置。 |
| 激活 | boolean | 指示是否将插入的文档设为活动的标志。 |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


在索引位置 index 插入一个第一页尺寸为 width 和 height 的空文档，并将插入的文档设为活动文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入文档的位置。 |
| 宽度 | float | 第一页的宽度。 |
| 高度 | float | 第一页的高度。 |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


在  index  位置插入一个空文档，首页尺寸为  width  和  height  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入文档的位置。 |
| 宽度 | float | 第一页的宽度。 |
| 高度 | float | 第一页的高度。 |
| 激活 | boolean | 指示是否将插入的文档设为活动的标志。 |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


在  index  位置向活动页插入新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Glyphs 的位置。 |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 字体资源。 |
| fontSize | float | 字体大小。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


在  index  位置向活动页插入新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Glyphs 的位置。 |
| fontFamily | java.lang.String | 字体族。 |
| fontSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


在  index  位置插入一个空页，使用默认页面大小，并将插入的页面设为活动页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入页面的位置。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


在  index  位置插入一个空页，使用默认页面大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入页面的位置。 |
| 激活 | boolean | 指示是否将插入的页面设为活动的标志。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


在  index  位置向文档插入一个页面，并将插入的页面设为活动页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应添加页面的位置。 |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 要插入的页面。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


在  index  位置向文档插入一个页面。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应添加页面的位置。 |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 要插入的页面。 |
| 激活 | boolean | 指示是否将插入的页面设为活动的标志。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


在  index  位置插入一个空页，指定  width  和  height  ，并将插入的页面设为活动页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入页面的位置。 |
| 宽度 | float | 新页面的宽度。 |
| 高度 | float | 新页面的高度。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


在  index  位置插入一个空页，指定  width  和  height  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入页面的位置。 |
| 宽度 | float | 新页面的宽度。 |
| 高度 | float | 新页面的高度。 |
| 激活 | boolean | 指示是否将插入的页面设为活动的标志。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


在  index  位置向活动页插入一条新路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Path 的位置。 |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


指示是否已访问并且有效的 Aspose.Page for Java 产品许可证。

**Returns:**
boolean - 布尔值
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


将多个 XPS 文件合并为一个 XPS 文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 用于与此文档合并的 XPS 文件。 |
| outStream | java.io.OutputStream | 保存合并后 XPS 文档的输出流。 |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


将多个 XPS 文件合并为一个 XPS 文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 用于与此文档合并的 XPS 文件。 |
| outXpsFilePath | java.lang.String | 输出 XPS 文件路径。 |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


使用  Device  实例将 XPS 文档合并为 PDF。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 输出 PDF 文件路径。 |
| filesForMerge | java.lang.String[] | 用于将此文档合并到输出设备的 XPS 文件。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | 文档保存选项。 |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


使用  Device  实例将 XPS 文档合并为 PDF。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 用于将此文档合并到输出设备的 XPS 文件。 |
| pdfStream | java.io.OutputStream | 写入生成的 PDF 的输出流。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | 文档保存选项。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


在  index  位置从活动页移除一个元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应删除元素的位置。 |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


在  index  位置移除一个文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应删除文档的位置。 |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


从文档中移除一页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | 要删除的页面。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


在  index  位置从文档中移除一页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应删除页面的位置。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


使用  Device  实例保存文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | 该  Device  实例。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 文档保存选项。 |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


将 XPS 文档保存到流。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.OutputStream | 要保存的 XPS 文档流。 |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


将 XPS 文档保存到位于  path  的 XPS 文件。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| path | java.lang.String | 文档的位置。 |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


将文档保存为图像文件。输出目录和文件名将与输入 XPS 文件相同。文件扩展名将对应于 \"options\" 参数中的图像格式。如果文档是使用非 FileInputStream 的流初始化的，图像文件将保存在当前文件夹中，使用默认的文件名模板。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | 以位图图像格式保存文档的选项。 |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


将文档保存为图像文件到指定目录并使用指定的文件名。文件扩展名将对应于 \"options\" 参数中的图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | 以位图图像格式保存文档的选项。 |
| outDir | java.lang.String | 图像文件将被保存的输出目录。 |
| fileNameTemplate | java.lang.String | 图像的文件名模板（不含扩展名）。如果输入的 XPS 文件为单页，则文件名即为该文件名；否则为 \"\\_[n]\"，其中 \"n\" 为从 1 开始的页码，后缀将追加到此。文件扩展名将对应于 \"option\" 参数中的图像格式。 |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


以位图图像格式将文档保存为字节数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | 以位图图像格式保存文档的选项。 |

**Returns:**
byte[][][] - 生成的图像字节数组。第一维表示内部文档，第二维表示内部文档中的页面。
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


以 PDF 格式保存文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.OutputStream | 用于写入输出 PDF 文件的流。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | 以 PDF 格式保存文档的选项。 |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


以 PDF 格式保存文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 输出 PDF 文件路径。 |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | 以 PDF 格式保存文档的选项。 |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


以 PS 格式保存文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.OutputStream | 用于写入输出 PS 文件的流。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 以 PS 格式保存文档的选项。 |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


以 PostScript 格式保存文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 输出 PostScript 文件路径。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 以 PDF 格式保存文档的选项。 |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


选择一个活动文档进行编辑。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| documentNumber | int | 文档编号。 |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


选择一个活动文档页面进行编辑。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pageNumber | int | 页码。 |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


将  printTicket  链接到由  documentIndex  索引的文档。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| documentIndex | int | 要链接打印票据的文档索引。 |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | 要链接的打印票据。 |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


设置文档的作业打印票据。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | 文档的作业打印票据。 |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


将  printTicket  链接到文档（由  documentIndex  索引）中由  pageIndex  索引的页面。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| documentIndex | int | 文档的索引。 |
| pageIndex | int | 要链接打印票据的页面索引。 |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | 要链接的打印票据。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

