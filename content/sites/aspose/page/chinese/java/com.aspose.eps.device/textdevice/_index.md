---
title: "TextDevice"
second_title: "Aspose.Page for Java API 参考"
description: 
type: docs
weight: 13
url: /zh/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## 字段

| 字段 | 描述 |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | 当前设备版本。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | 绘制路径。 |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | 绘制弧线。 |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | 绘制带有指定变换和背景的图像。 |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | 绘制线段。 |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | 绘制椭圆。 |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | 绘制多边形。 |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | 绘制多边形。 |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | 绘制折线。 |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | 绘制折线。 |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | 绘制矩形。 |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | 绘制圆角矩形。 |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | 填充路径。 |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | 填充弧线。 |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | 填充椭圆。 |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | 填充多边形。 |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | 填充多边形。 |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | 填充矩形。 |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | 绘制圆角矩形。 |
| [getBackground()](#getBackground--) | 获取页面的当前背景。 |
| [getCharTM()](#getCharTM--) | 获取当前字符变换。 |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | 获取结果设备输出的创建者。 |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | 获取当前字体。 |
| [getOpacity()](#getOpacity--) | 获取当前不透明度。 |
| [getOpacityMask()](#getOpacityMask--) | 获取当前不透明度遮罩。 |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | 获取当前画笔。 |
| [getProperties()](#getProperties--) | 获取包括元数据的设备属性。 |
| [getProperty(String key)](#getProperty-java.lang.String-) | 获取字符串属性的值。 |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | 获取颜色属性的值。 |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | 获取双精度属性的值。 |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | 获取整数属性的值。 |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | 获取边距属性的值。 |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | 获取矩阵属性的值。 |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | 获取矩形属性的值。 |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | 获取大小属性的值。 |
| [getSaveOptions()](#getSaveOptions--) | 返回保存选项。 |
| [getSize()](#getSize--) | 获取页面的尺寸。 |
| [getStroke()](#getStroke--) | 获取当前描边。 |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | 获取当前文本渲染模式。 |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | 获取当前文本笔画宽度。 |
| [getTransform()](#getTransform--) | 获取当前变换。 |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | 初始化设备的裁剪区域。 |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | 获取布尔属性的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | 旋转当前变换矩阵。 |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | 围绕一点旋转当前变换矩阵。 |
| [scale(double x, double y)](#scale-double-double-) | 缩放当前变换矩阵。 |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | 指定页面的当前背景。 |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | 指定字符变换。 |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | 指定设备的裁剪区域。 |
| [setCreator(String creator)](#setCreator-java.lang.String-) | 指定生成的设备输出的创建者。 |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | 指定字体。 |
| [setOpacity(float opacity)](#setOpacity-float-) | 指定不透明度。 |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | 指定不透明度遮罩。 |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | 指定绘画。 |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | 指定设备属性，包括元数据。 |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | 指定用于管理渲染过程的选项。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | 指定笔画。 |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | 指定文本渲染模式。 |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | 指定文本笔画宽度。 |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | 指定当前变换。 |
| [shear(double shx, double shy)](#shear-double-double-) | 剪切当前变换矩阵。 |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | 变换当前变换矩阵。 |
| [translate(double x, double y)](#translate-double-double-) | 平移当前变换矩阵。 |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | 写入注释。 |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | 使用指定字体写出字符串。 |
| [writeWarning(String warning)](#writeWarning-java.lang.String-) |  |
### TextDevice() {#TextDevice--}
```
public TextDevice()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


### VERSION {#VERSION}
```
public static String VERSION
```


当前设备版本。

### closePage() {#closePage--}
```
public void closePage()
```


在页面渲染后对设备进行必要的准备。

### create() {#create--}
```
public Device create()
```


创建此设备的副本。

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


释放设备。

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


绘制路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| path | java.awt.Shape | 要绘制的路径。 |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


绘制弧线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 弧中心的 X 坐标。 |
| y | float | 弧中心的 Y 坐标。 |
| 宽度 | float | 外接矩形的宽度。 |
| 高度 | float | 外接矩形的高度。 |
| startAngle | float | 弧的起始角度。 |
| arcAngle | float | 弧的角度。 |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


绘制带有指定变换和背景的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | 要绘制的图像。 |
| transform | java.awt.geom.AffineTransform | 变换。 |
| bkg | java.awt.Color | 背景颜色。 |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


绘制线段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x1 | float | 线段起点的 X 坐标。 |
| y1 | float | 线段起点的 Y 坐标。 |
| x2 | float | 线段终点的 X 坐标。 |
| y2 | float | 线段终点的 Y 坐标。 |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


绘制椭圆。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 椭圆中心的 X 坐标。 |
| y | float | 椭圆中心的 Y 坐标。 |
| 宽度 | float | 外接矩形的宽度。 |
| 高度 | float | 外接矩形的高度。 |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


绘制多边形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xPoints | float[] | 点的 X 坐标。 |
| yPoints | float[] | 点的 Y 坐标。 |
| nPoints | int | 点的数量。 |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


绘制多边形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xPoints | int[] | 点的 X 坐标。 |
| yPoints | int[] | 点的 Y 坐标。 |
| nPoints | int | 点的数量。 |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


绘制折线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xPoints | float[] | 点的 X 坐标。 |
| yPoints | float[] | 点的 Y 坐标。 |
| nPoints | int | 点的数量。 |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


绘制折线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xPoints | int[] | 点的 X 坐标。 |
| yPoints | int[] | 点的 Y 坐标。 |
| nPoints | int | 点的数量。 |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


绘制矩形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 矩形左上角的 X 坐标。 |
| y | float | 矩形左上角的 Y 坐标。 |
| 宽度 | float | 矩形的宽度。 |
| 高度 | float | 矩形的高度。 |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


绘制圆角矩形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 矩形左上角的 X 坐标。 |
| y | float | 矩形左上角的 Y 坐标。 |
| 宽度 | float | 矩形的宽度。 |
| 高度 | float | 矩形的高度。 |
| arcWidth | float | 圆弧外接矩形的宽度。 |
| arcHeight | float | 圆弧外接矩形的高度。 |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


在给定点绘制字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


在文档渲染后进行设备的必要准备。

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


填充路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| path | java.awt.Shape | 要填充的路径。 |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


填充弧线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 弧中心的 X 坐标。 |
| y | float | 弧中心的 Y 坐标。 |
| 宽度 | float | 外接矩形的宽度。 |
| 高度 | float | 外接矩形的高度。 |
| startAngle | float | 弧的起始角度。 |
| arcAngle | float | 弧的角度。 |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


填充椭圆。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 椭圆中心的 X 坐标。 |
| y | float | 椭圆中心的 Y 坐标。 |
| 宽度 | float | 外接矩形的宽度。 |
| 高度 | float | 外接矩形的高度。 |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


填充多边形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xPoints | float[] | 点的 X 坐标。 |
| yPoints | float[] | 点的 Y 坐标。 |
| nPoints | int | 点的数量。 |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


填充多边形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xPoints | int[] | 点的 X 坐标。 |
| yPoints | int[] | 点的 Y 坐标。 |
| nPoints | int | 点的数量。 |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


填充矩形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 矩形左上角的 X 坐标。 |
| y | float | 矩形左上角的 Y 坐标。 |
| 宽度 | float | 矩形的宽度。 |
| 高度 | float | 矩形的高度。 |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


绘制圆角矩形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | float | 矩形左上角的 X 坐标。 |
| y | float | 矩形左上角的 Y 坐标。 |
| 宽度 | float | 矩形的宽度。 |
| 高度 | float | 矩形的高度。 |
| arcWidth | float | 圆弧外接矩形的宽度。 |
| arcHeight | float | 圆弧外接矩形的高度。 |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


获取页面的当前背景。

**Returns:**
java.awt.Color - 页面当前的背景。
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


获取当前字符变换。

**Returns:**
java.awt.geom.AffineTransform - 当前字符的变换。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


获取结果设备输出的创建者。

**Returns:**
java.lang.String - 创建者值。
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


获取当前页码。

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


获取当前字体。

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


获取当前不透明度。

**Returns:**
float - 当前不透明度。
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


获取当前不透明度遮罩。

**Returns:**
java.awt.Paint - 当前不透明度掩码。
### getPages() {#getPages--}
```
public List<String> getPages()
```




**Returns:**
java.util.List<java.lang.String>
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


获取当前画笔。

**Returns:**
java.awt.Paint - 当前画笔。
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


获取包括元数据的设备属性。

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


获取字符串属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.lang.String - 属性值。
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


获取颜色属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Color - 属性值。
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


获取双精度属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
double - 属性值。
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


获取整数属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
int - 属性值。
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


获取边距属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Insets - 属性值。
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


获取矩阵属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.geom.AffineTransform - 属性值。
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


获取矩形属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Rectangle - 属性值。
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


获取大小属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
java.awt.Dimension - 属性值。
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


返回保存选项。

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


获取页面的尺寸。

**Returns:**
java.awt.Dimension - 页面大小。
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


获取当前描边。

**Returns:**
java.awt.Stroke - 当前笔画。
### getText() {#getText--}
```
public String getText()
```




**Returns:**
java.lang.String
### getText(int startPage, int endPage) {#getText-int-int-}
```
public String getText(int startPage, int endPage)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


获取当前文本渲染模式。

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


获取当前文本笔画宽度。

**Returns:**
float - 当前文本笔画宽度。
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


获取当前变换。

**Returns:**
java.awt.geom.AffineTransform - 当前变换。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


初始化设备的裁剪区域。

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


初始化要渲染的页数。

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


指示设备是否使用直接 RGB 模式，即 RGB。

**Returns:**
boolean
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


获取布尔属性的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 键 | java.lang.String | 属性的名称。 |

**Returns:**
boolean - 属性值。
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
public boolean openPage(float width, float height)
```


在页面渲染之前对设备进行必要的准备。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 宽度 | float |  |
| 高度 | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


在页面渲染之前对设备进行必要的准备。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标题 | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


将设备重置为整个文档的初始状态。用于重置输出流。

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 主文档 | boolean |  |

### reset() {#reset--}
```
public void reset()
```


将设备重置为页面的初始状态。

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 零页码 | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


旋转当前变换矩阵。调用 writeTransform(Transform)。使用正角度 theta 进行旋转会将点从正 x 轴方向旋转向正 y 轴方向。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| theta | double | 要旋转的弧度角度。 |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


围绕一点旋转当前变换矩阵。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| theta | double | 弧度制的旋转角度。 |
| x | double | 点的 X 坐标。 |
| y | double | 点的 Y 坐标。 |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


缩放当前的变换矩阵。调用 writeTransform(Transform)。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | double | X 轴的缩放。 |
| y | double | Y 轴的缩放。 |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


指定页面的当前背景。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 背景 | java.awt.Color | 页面的背景。 |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


指定字符变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421字符变换。 |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


指定设备的裁剪区域。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| clipPath | java.awt.Shape | 裁剪路径。 |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


指定生成的设备输出的创建者。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 创建者 | java.lang.String | 创建者值。 |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


指定字体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | 字体。 |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


指定不透明度。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 不透明度 | float | 不透明度。 |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


指定不透明度遮罩。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| opacityMask | java.awt.Paint | 不透明度蒙版。 |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


指定绘画。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| paint | java.awt.Paint | 绘图。 |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


指定设备属性，包括元数据。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | 设备属性。 |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


指定用于管理渲染过程的选项。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | 用于管理渲染过程的选项。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


指定页面大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


指定笔画。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stroke | java.awt.Stroke | 描边。 |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


指定文本渲染模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | 文本渲染模式。 |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


指定文本笔画宽度。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| textStrokeWidth | float | 文本描边宽度。 |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


指定当前变换。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | 一个变换.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


剪切当前变换矩阵。调用 writeTransform(Transform)。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| shx | double | X 轴方向的剪切。 |
| shy | double | Y 轴方向的剪切。 |

### startDocument() {#startDocument--}
```
public void startDocument()
```


在开始渲染文档之前，对设备进行必要的准备。

### toString() {#toString--}
```
public String toString()
```


返回设备类型的名称。

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


变换当前变换矩阵。调用 writeTransform(Transform)。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | 要应用的变换。 |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


平移当前变换矩阵。调用 writeTransform(Transform)。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | double | X 轴方向的平移。 |
| y | double | Y 轴方向的平移。 |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


从其他多页设备更新页面参数。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) |  |

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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


写入注释。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 注释 | java.lang.String | 要写入的注释。 |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


使用指定字体写出字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | 指定的字体。 |
| str | java.lang.String | 该字符串。 |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 警告 | java.lang.String |  |

