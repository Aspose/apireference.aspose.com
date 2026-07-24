---
title: "PsDocument"
second_title: "Aspose.Page for Java API 参考"
description: "此类封装 PS/EPS 文档。"
type: docs
weight: 16
url: /zh/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

此类封装 PS/EPS 文档。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PsDocument()](#PsDocument--) | 使用已初始化的页面初始化空的  PsDocument  。 |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 使用已初始化的页面初始化空的  PsDocument  。 |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 使用已初始化的页面初始化空的  PsDocument  。 |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | 初始化空的  PsDocument  。 |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | 初始化空的  PsDocument  。 |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | 当预先知道 Postscript 文档页数时，初始化空的  PsDocument  。 |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | 当预先知道 Postscript 文档页数时，初始化空的  PsDocument  。 |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | 使用输入的 PS/EPS 文件初始化  PsDocument  。 |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | 使用 PS/EPS 文件流初始化  PsDocument  。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | 向当前图形状态添加裁剪。 |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | 向当前图形状态添加裁剪，然后写入 "newpath" 操作符。 |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | 向当前图形状态添加裁剪矩形。 |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | 从给定字体的给定文本轮廓添加裁剪。 |
| [closePage()](#closePage--) | 完成当前页面。 |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | 将 Type 1 字体转换为 TrueType。 |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | 将 Type 3 字体转换为 TrueType。 |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | 将 Type 3 字体转换为 TrueType。 |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | 将给定的  PsDocument  裁剪为 EPS 文件。 |
| [draw(Shape shape)](#draw-java.awt.Shape-) | 绘制任意路径。 |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | 绘制蒙版图像。 |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | 绘制图像。 |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | 绘制带背景的变换图像。 |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | 绘制带背景的透明变换图像。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | 读取 EPS 文件并从 %%BoundingBox 注释中提取 EPS 图像的边界框，若不存在则使用默认页面尺寸 (0, 0, 595, 842) 的边界。 |
| [extractEpsSize()](#extractEpsSize--) | 读取 EPS 文件并从 %%BoundingBox 注释中提取 EPS 图像的尺寸，若不存在则使用默认页面尺寸 (595, 842)。 |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | 从 PS 文件中提取文本。 |
| [fill(Shape shape)](#fill-java.awt.Shape-) | 填充任意路径。 |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | 通过填充字形内部并绘制字形轮廓来添加文本字符串。 |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | 通过填充字形内部来添加文本字符串。 |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | 通过填充字形内部来添加文本字符串。 |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | 获取生成的 PDF 文档的页数。 |
| [getPaint()](#getPaint--) | 获取当前图形状态中的绘画属性。 |
| [getStroke()](#getStroke--) | 获取当前图形状态中的描边属性。 |
| [getXmpMetadata()](#getXmpMetadata--) | 读取 PS/EPS 文件并提取 XmpMetdata（如果已存在），如果不存在则添加新的。 |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | 指示是否已访问并且有效的 Aspose.Page for Java 产品许可证。 |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | 将 PS/EPS 文件合并到设备。 |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | 将 PS/EPS 文件合并到设备。 |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | 将 PS/EPS 文件合并到设备。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | 创建新页面并将其设为当前页面。 |
| [openPage(String pageName)](#openPage-java.lang.String-) | 创建与文档尺寸相同的新页面并将其设为当前页面。 |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | 通过绘制字形轮廓来添加文本字符串。 |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | 通过绘制字形轮廓来添加文本字符串。 |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | 将给定的 PsDocument 调整大小为 EPS 文件。 |
| [rotate(float angleRadians)](#rotate-float-) | 在当前图形状态中添加围绕原点的逆时针旋转（旋转当前矩阵）。 |
| [rotate(int angleDegrees)](#rotate-int-) | 在当前图形状态中添加围绕原点的逆时针旋转（旋转当前矩阵）。 |
| [save()](#save--) | 将给定的 PsDocument 保存为 PS 或 EPS 文件。 |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | 将 PS/EPS 文件保存到设备。 |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | 将给定的 PsDocument 保存到流中。 |
| [save(String outEpsFilePath)](#save-java.lang.String-) | 将给定的 PsDocument 保存为 EPS 文件。 |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | 将 PS/EPS 文件保存为图像文件。 |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | 将 PS/EPS 文件保存为图像文件到指定目录并使用指定的文件名。 |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | 将 PS/EPS 文件保存为图像字节数组。 |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | 将 PS/EPS 文件保存到输出 PDF 流。 |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | 将 PS/EPS 文件保存为 PDF 文件。 |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 将 BufferedImage 对象保存为 EPS 文件。 |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 将 BufferedImage 对象保存为 EPS 文件。 |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | 将 PNG/JPEG/BMP/GIF 图像从输入流保存到 EPS 输出流。 |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | 将 PNG/JPEG/BMP/GIF 图像从文件保存为 EPS 文件。 |
| [scale(float xScale, float yScale)](#scale-float-float-) | 向当前图形状态添加缩放（缩放当前矩阵）。 |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | 指定输入流。 |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | 设置页面设备参数（参见操作符 "setpagedevice" 的 PostScript 规范）。 |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | 设置页面尺寸。 |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | 在当前图形状态中设置绘图。 |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | 在当前图形状态中设置描边。 |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | 将当前变换设置为此变换。 |
| [shear(float shx, float shy)](#shear-float-float-) | 向当前图形状态添加剪切变换（剪切当前矩阵）。 |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | 向当前图形状态添加变换（将此矩阵与当前矩阵连接）。 |
| [translate(float x, float y)](#translate-float-float-) | 向当前图形状态添加平移（平移当前矩阵）。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | 写入恢复当前图形状态的操作（参见 PostScript 规范中操作符 "grestore"）。 |
| [writeGraphicsSave()](#writeGraphicsSave--) | 写入保存当前图形状态的操作（参见 PostScript 规范中操作符 "gsave"）。 |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


初始化一个空的 PsDocument 并带有已初始化的页面。此构造函数仅用于与 PostScript 文件无关的额外操作，例如转换字体。

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


使用已初始化的页面初始化空的  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 输出 PS/EPS 文件路径。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 一组控制 PostScript 文件保存的参数。 |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


使用已初始化的页面初始化空的  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| psStream | java.io.OutputStream | 用于保存 PS/EPS 文件的流。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 一组控制 PostScript 文件保存的参数。 |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


初始化空的  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 输出 PS/EPS 文件路径。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 一组控制 PostScript 文件保存的参数。 |
| multipaged | boolean | 如果为 false，页面将不会被初始化。在这种情况下，页面初始化应通过显式的 "openPage(width, height)" 调用来完成。 |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


初始化空的  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| psStream | java.io.OutputStream | 用于保存 PS/EPS 文件的流。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 一组控制 PostScript 文件保存的参数。 |
| multipaged | boolean | 如果为 false，页面将不会被初始化。在这种情况下，页面初始化应通过显式的 "openPage(width, height)" 调用来完成。 |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


当预先知道 Postscript 文档页数时，初始化空的  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPsFilePath | java.lang.String | 输出 PS/EPS 文件路径。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 一组控制 PostScript 文件保存的参数。 |
| numberOfPages | int | PostScript 文档中的页数。 |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


当预先知道 Postscript 文档页数时，初始化空的  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| psStream | java.io.OutputStream | 用于保存 PS/EPS 文件的流。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 一组控制 PostScript 文件保存的参数。 |
| numberOfPages | int | PostScript 文档中的页数。 |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


使用输入的 PS/EPS 文件初始化  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS 文件路径。 |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


使用 PS/EPS 文件流初始化  PsDocument  。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| psStream | java.io.InputStream | PS/EPS 文件的流。 |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


向当前图形状态添加裁剪。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | java.awt.Shape | 剪裁路径。 |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


向当前图形状态添加剪裁，然后写入 "newpath" 操作符。这样做是为了避免此剪裁路径与后续路径（例如使用 "charpath" 操作符描边的字形）相交。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | java.awt.Shape | 剪裁路径。 |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


向当前图形状态添加裁剪矩形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 矩形 | java.awt.geom.Rectangle2D.Float | 剪裁矩形。 |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


从给定字体的给定文本轮廓添加裁剪。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 文本。 |
| 字体 | java.awt.Font | 字体。 |
| x | float | 文本位置的 X 坐标。 |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


完成当前页面。

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


将 Type 1 字体转换为 TrueType。转换后的 TTF 字体文件名将与输入的 Type 1 字体相同，只是扩展名为 ".ttf"。TTF 文件将保存到指定的输出目录。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Type 1 字体文件路径.. |
| outputDir | java.lang.String | 保存生成的 TrueType 字体的输出目录。 |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


将 Type 3 字体转换为 TrueType。TTF 文件将保存到提供的输出流。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 字体文件路径。 |
| outputStream | java.io.OutputStream | 保存生成的 TrueType 字体的输出流。 |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


将 Type 3 字体转换为 TrueType。转换后的 TTF 字体文件名将与输入的 Type 3 字体相同，只是扩展名为 ".ttf"。TTF 文件将保存到指定的输出目录。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 字体文件路径.. |
| outputDir | java.lang.String | 保存生成的 TrueType 字体的输出目录。 |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


将给定的 PsDocument 裁剪为 EPS 文件。它会保存初始的 EPS 文件，并更新已有的 %%BoundingBox，或创建新的。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | 裁剪框 (x0, y0, x, y)。 |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


绘制任意路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| shape | java.awt.Shape | 用于填充的路径。 |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


绘制蒙版图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | 要绘制的图像。必须是 24bpp RGB 图像格式。 |
| alphaMask1bpp | java.awt.image.BufferedImage | 图像掩码。必须是 1bpp 图像格式。 |
| transform | java.awt.geom.AffineTransform | 用于变换图像的矩阵。 |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


绘制图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 要绘制的图像。 |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


绘制带背景的变换图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 要绘制的图像。 |
| transform | java.awt.geom.AffineTransform | 用于变换图像的矩阵。 |
| bkg | java.awt.Color | 图像的背景。 |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


绘制带背景的变换透明图像。如果图像没有 Alpha 通道，则会以不透明图像绘制。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 要绘制的图像。 |
| transform | java.awt.geom.AffineTransform | 用于变换图像的矩阵。 |
| transparencyThreshold | int | 一个阈值，用于定义从哪个透明度值开始像素被解释为完全透明。低于此阈值的所有值将被解释为完全不透明。 |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


读取 EPS 文件并从 %%BoundingBox 注释中提取 EPS 图像的边界框，若不存在则使用默认页面尺寸 (0, 0, 595, 842) 的边界。

**Returns:**
int[] - EPS 图像的边界框。
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


读取 EPS 文件并从 %%BoundingBox 注释中提取 EPS 图像的尺寸，若不存在则使用默认页面尺寸 (595, 842)。

**Returns:**
java.awt.Dimension - EPS 图像的尺寸。
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


从 PS 文件中提取文本。仅适用于使用 TrueType 字体（Type 42）或由 TrueType 字体组成的复合字体（Type 0）编写的文本。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 保存选项。 |
| startPage | int | 从该页（含）开始提取文本的页码。 |
| endPage | int | 要包含在内提取文本的页面。 |

**Returns:**
java.lang.String - 包含在所选页面的 PS 文件中的文本。
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


填充任意路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| shape | java.awt.Shape | 用于填充的路径。 |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


通过填充字形内部并绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fillPaint | java.awt.Paint | 用于绘制字形内部的填充。 |
| strokePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


通过填充字形内部并绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fillPaint | java.awt.Paint | 用于绘制字形内部的填充。 |
| strokePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


通过填充字形内部并绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。advances 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| advances | float[] |  |
| 字体 | java.awt.Font | 将用于绘制文本的系统字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fillPaint | java.awt.Paint | 用于绘制字形内部的填充。 |
| strokePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


通过填充字形内部并绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| 字体 | java.awt.Font | 将用于绘制文本的系统字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fillPaint | java.awt.Paint | 用于绘制字形内部的填充。 |
| strokePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fill | java.awt.Paint | 用于绘制字形的填充。 |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fill | java.awt.Paint | 用于绘制字形的填充。 |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| 字体 | java.awt.Font | 将用于绘制文本的系统字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| 字体 | java.awt.Font | 将用于绘制文本的字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fill | java.awt.Paint | 用于绘制字形的填充。 |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| 字体 | java.awt.Font | 将用于绘制文本的系统字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


通过填充字形内部来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| 字体 | java.awt.Font | 将用于绘制文本的字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| fill | java.awt.Paint | 用于绘制字形的填充。 |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


获取生成的 PDF 文档的页数。

**Returns:**
int - 页面数量。
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


获取当前图形状态中的绘画属性。

**Returns:**
java.awt.Paint - 当前画笔。
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


获取当前图形状态中的描边属性。

**Returns:**
java.awt.Stroke - 当前笔画。
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


读取 PS/EPS 文件并提取 XmpMetdata（如果已存在），如果不存在则添加新的。

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


指示是否已访问并且有效的 Aspose.Page for Java 产品许可证。

**Returns:**
boolean - 布尔值
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


将 PS/EPS 文件合并到设备。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | 用于与此文件合并到输出设备的 PS/EPS 文件。 |
| device | [Device](../../com.aspose.page/device) | 输出设备。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 包含指定转换期间抛出错误输出的标志。 |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


将 PS/EPS 文件合并到设备。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | 输出 PDF 流。 |
| filesForMerge | java.lang.String[] | 用于与此文件合并到输出设备的 PS/EPS 文件。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 包含指定转换期间抛出错误输出的标志。 |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


将 PS/EPS 文件合并到设备。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 输出 PDF 文件路径。 |
| filesForMerge | java.lang.String[] | 用于与此文件合并到输出设备的 PS/EPS 文件。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 包含指定转换期间抛出错误输出的标志。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public void openPage(float width, float height)
```


创建新页面并将其设为当前页面。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 新页面的宽度。 |
| 高度 | float | 新页面的高度。 |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


创建与文档尺寸相同的新页面并将其设为当前页面。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pageName | java.lang.String | 新页面的名称。如果为 null，页面的名称将是页面的顺序号。 |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| outlinePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont 将用于绘制文本。它可以与位于自定义文件夹中的自定义字体一起使用。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| outlinePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| 字体 | java.awt.Font | 将用于绘制文本的系统字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| advances | float[] | 字形宽度的数组。其长度必须与字符串中的字形数量相匹配。 |
| 字体 | java.awt.Font | 将用于绘制文本的字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| outlinePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| 字体 | java.awt.Font | 将用于绘制文本的系统字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


通过绘制字形轮廓来添加文本字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文本 | java.lang.String | 要添加的文本。 |
| 字体 | java.awt.Font | 将用于绘制文本的字体。 |
| x | float | 文本起点的 X 坐标。 |
| y | float | 文本起点的 Y 坐标。 |
| outlinePaint | java.awt.Paint | 用于绘制字形轮廓的 java.awt.Paint。可以是 JDK 中 java.awt.Paint 类的任何子类。 |
| stroke | java.awt.Stroke | 用于绘制字形轮廓的笔画。 |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


调整给定的 PsDocument 为 EPS 文件的大小。此方法仅在提取 EPS 大小后使用。它会保存带有更新的现有 %%BoundingBox 的初始 EPS 文件，或创建新的。页面变换矩阵也将被设置。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | 以指定单位表示的 EPS 图像的新尺寸。 |
| units | [Units](../../com.aspose.page/units) | 新尺寸的单位。可以是点、英寸、毫米、厘米以及初始尺寸的百分比。 |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


在当前图形状态中添加围绕原点的逆时针旋转（旋转当前矩阵）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angleRadians | float | 以弧度表示的旋转角度。 |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


在当前图形状态中添加围绕原点的逆时针旋转（旋转当前矩阵）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| angleDegrees | int | 以度数表示的旋转角度。 |

### save() {#save--}
```
public void save()
```


将给定的 PsDocument 保存为 PS 或 EPS 文件。此方法仅在 PsDocument 从头创建时使用。

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


将 PS/EPS 文件保存到设备。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | 输出设备。 |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 包含指定转换期间抛出错误输出的标志。 |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


将给定的 PsDocument 保存到流中。此方法仅在更新 XMP 元数据后使用。它会保存带有更新的现有元数据的初始 EPS 文件，或在调用 getMetadata 方法时创建新的。在后一种情况下，会添加所有必要的 PostScript 代码和 EPS 注释。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| epsStream | java.io.OutputStream | 输出 EPS 文件的流。 |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


将给定的 PsDocument 保存为 EPS 文件。此方法仅在更新 XMP 元数据后使用。它会保存带有更新的现有元数据的初始 EPS 文件，或在调用 getMetadata 方法时创建新的。在后一种情况下，会添加所有必要的 PostScript 代码和 EPS 注释。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | 一个输出 EPS 文件路径.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


将 PS/EPS 文件保存为图像文件。输出目录和文件名将与输入的 PS 文件相同。文件扩展名将对应于 "options" 参数中的图像格式。如果文档是使用非 FileInputStream 派生的流初始化的，图像文件将保存在当前文件夹中，使用默认的文件名模板。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 包含保存图像所需的参数以及指定转换期间抛出错误输出的标志。 |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


将 PS/EPS 文件保存为图像文件，保存到指定目录并使用指定文件名。文件扩展名将对应于 "options" 参数中的图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 包含保存图像所需的参数以及指定转换期间抛出错误输出的标志。 |
| outDir | java.lang.String | 图像文件将被保存的输出目录。 |
| fileNameTemplate | java.lang.String | 图像的文件名模板（不含扩展名）。如果输入的 PS/EPS 文件为单页，则恰好为文件名；否则为 "\_[n]"，其中 "n" 为从 0 开始的页码，后缀将追加到此。文件扩展名将对应于 "option" 参数中的图像格式。 |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


将 PS/EPS 文件保存为图像字节数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | 包含保存图像所需的参数以及指定转换期间抛出错误输出的标志。 |

**Returns:**
byte[][] - 图像字节。每页一个字节数组。
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


将 PS/EPS 文件保存到输出 PDF 流。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | 输出 PDF 流。 |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | 包含指定转换期间抛出错误输出的标志。 |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


将 PS/EPS 文件保存为 PDF 文件。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | 输出 PDF 文件路径。 |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | 包含指定转换期间抛出错误输出的标志。 |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


将 BufferedImage 对象保存为 EPS 文件。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 图像。 |
| epsStream | java.io.OutputStream | EPS 输出流。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 包含指定转换期间抛出错误输出的参数。 |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


将 BufferedImage 对象保存为 EPS 文件。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 图像。 |
| epsFilePath | java.lang.String | EPS 文件路径。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 包含指定转换期间抛出错误输出的参数。 |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


将 PNG/JPEG/BMP/GIF 图像从输入流保存到 EPS 输出流。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageStream | java.io.InputStream | 图像输入流。 |
| epsStream | java.io.OutputStream | EPS 输出流。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 包含指定转换期间抛出错误输出的参数。 |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


将 PNG/JPEG/BMP/GIF 图像从文件保存为 EPS 文件。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFilePath | java.lang.String | 图像文件路径。 |
| epsFilePath | java.lang.String | EPS 文件路径。 |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | 包含指定转换期间抛出错误输出的参数。 |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


向当前图形状态添加缩放（缩放当前矩阵）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xScale | float | X 轴的比例。 |
| yScale | float | Y 轴的比例。 |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


指定输入流。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| is | java.io.InputStream | PS/EPS 文件的输入流。 |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


设置页面设备参数（参见操作符 "setpagedevice" PostScript 规范）。其中可能包括页面尺寸、颜色等。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | 页面的参数。此字典中可以包含页面大小、颜色等。 |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


设置页面大小。要在同一文档中创建不同尺寸的页面，请在此方法之后立即使用  setPageDevice  方法。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float | 生成的 PostScript 文件中页面的宽度。 |
| 高度 | float | 生成的 PostScript 文件中页面的高度。 |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


在当前图形状态中设置绘图。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| paint | java.awt.Paint | 绘图对象。它可以是 JDK 中存在的 Paint 类的任何子类。 |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


在当前图形状态中设置描边。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stroke | java.awt.Stroke | 描边。 |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


将当前变换设置为此变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | 变换。 |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


向当前图形状态添加剪切变换（剪切当前矩阵）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| shx | float | X 轴的剪切。 |
| shy | float | Y 轴的剪切。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


向当前图形状态添加变换（将此矩阵与当前矩阵连接）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | 变换。 |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


向当前图形状态添加平移（平移当前矩阵）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | X 方向的平移。 |
| y | float | Y 方向的平移。 |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


写入恢复当前图形状态的操作（参见 PostScript 规范中操作符 "grestore"）。

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


写入保存当前图形状态的操作（参见 PostScript 规范中操作符 "gsave"）。

