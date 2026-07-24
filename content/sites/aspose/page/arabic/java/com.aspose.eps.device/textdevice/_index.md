---
title: "TextDevice"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: 
type: docs
weight: 13
url: /ar/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## الحقول

| حقل | الوصف |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | إصدار الجهاز الحالي. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | يرسم مسارًا. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | يرسم قوسًا. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | يرسم صورة مع التحويل المعين والخلفية. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | يرسم قطعة خط. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | يرسم شكلًا بيضاويًا. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | يرسم مضلعًا. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | يرسم مضلعًا. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | يرسم خطًا متعدد النقاط. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | يرسم خطًا متعدد النقاط. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | يرسم مستطيلًا. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | يرسم مستطيلًا مستديرًا. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | يملأ مسارًا. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | يملأ قوسًا. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | يملأ بيضاويًا. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | يملأ مضلعًا. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | يملأ مضلعًا. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | يملأ مستطيلًا. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | يرسم مستطيلًا مستديرًا. |
| [getBackground()](#getBackground--) | يحصل على الخلفية الحالية للصفحة. |
| [getCharTM()](#getCharTM--) | يحصل على تحويل الأحرف الحالي. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | يحصل على منشئ مخرجات الجهاز الناتجة. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | يحصل على الخط الحالي. |
| [getOpacity()](#getOpacity--) | يحصل على الشفافية الحالية. |
| [getOpacityMask()](#getOpacityMask--) | يحصل على قناع الشفافية الحالي. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | يحصل على الطلاء الحالي. |
| [getProperties()](#getProperties--) | يحصل على خصائص الجهاز بما في ذلك البيانات الوصفية. |
| [getProperty(String key)](#getProperty-java.lang.String-) | يحصل على قيمة خاصية سلسلة. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | يحصل على قيمة خاصية لون. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | يحصل على قيمة خاصية مزدوجة. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | يحصل على قيمة خاصية عدد صحيح. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | يحصل على قيمة خاصية الهوامش. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | يحصل على قيمة خاصية مصفوفة. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | يحصل على قيمة خاصية مستطيل. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | يحصل على قيمة خاصية حجم. |
| [getSaveOptions()](#getSaveOptions--) | يعيد خيارات الحفظ. |
| [getSize()](#getSize--) | يحصل على حجم الصفحة. |
| [getStroke()](#getStroke--) | يحصل على الحد الحالي. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | يحصل على وضع عرض النص الحالي. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | يحصل على عرض خط النص الحالي. |
| [getTransform()](#getTransform--) | يحصل على التحويل الحالي. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | يُهيئ القص للجهاز. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | يحصل على قيمة الخاصية المنطقية. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | دوّر مصفوفة التحويل الحالية. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | دوّر مصفوفة التحويل الحالية حول نقطة. |
| [scale(double x, double y)](#scale-double-double-) | يقوم بتغيير مقياس مصفوفة التحويل الحالية. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | يحدد الخلفية الحالية للصفحة. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | يحدد تحويل الأحرف. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | يحدد القص للجهاز. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | يحدد منشئ مخرجات الجهاز الناتجة. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | يحدد خطًا. |
| [setOpacity(float opacity)](#setOpacity-float-) | يحدد الشفافية. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | يحدد قناع الشفافية. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | يحدد طلاءً. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | يحدد خصائص الجهاز بما في ذلك البيانات الوصفية. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | يحدد خيارات إدارة عملية العرض. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | يحدد خطًا. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | يحدد وضع عرض النص. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | يحدد عرض خط النص. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | يحدد التحويل الحالي. |
| [shear(double shx, double shy)](#shear-double-double-) | يقوم بعمل قص مائل لمصفوفة التحويل الحالية. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | يحوّل مصفوفة التحويل الحالية. |
| [translate(double x, double y)](#translate-double-double-) | يُترجم مصفوفة التحويل الحالية. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | يكتب تعليقًا. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | يكتب سلسلة باستخدام الخط المحدد. |
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


إصدار الجهاز الحالي.

### closePage() {#closePage--}
```
public void closePage()
```


يقوم بالتحضير اللازم للجهاز بعد أن تم عرض الصفحة.

### create() {#create--}
```
public Device create()
```


ينشئ نسخة من هذا الجهاز.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


يفرغ الجهاز.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


يرسم مسارًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| path | java.awt.Shape | مسار يتم رسمه. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


يرسم قوسًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X لمركز القوس. |
| y | float | الإحداثي Y لمركز القوس. |
| width | float | عرض المستطيل المحيط. |
| height | float | ارتفاع المستطيل المحيط. |
| startAngle | float | زاوية البداية للقوس. |
| arcAngle | float | زاوية القوس. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


يرسم صورة مع التحويل المعين والخلفية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | صورة يتم رسمها. |
| transform | java.awt.geom.AffineTransform | تحويل. |
| bkg | java.awt.Color | لون الخلفية. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


يرسم قطعة خط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x1 | float | الإحداثي X لبداية الجزء. |
| y1 | float | الإحداثي Y لبداية الجزء. |
| x2 | float | الإحداثي X لنهاية الجزء. |
| y2 | float | الإحداثي Y لنهاية الجزء. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


يرسم شكلًا بيضاويًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X لمركز الشكل البيضاوي. |
| y | float | الإحداثي Y لمركز الشكل البيضاوي. |
| width | float | عرض المستطيل المحيط. |
| height | float | ارتفاع المستطيل المحيط. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


يرسم مضلعًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xPoints | float[] | الإحداثيات X للنقاط. |
| yPoints | float[] | الإحداثي Y للنقاط. |
| nPoints | int | عدد النقاط. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


يرسم مضلعًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xPoints | int[] | الإحداثيات X للنقاط. |
| yPoints | int[] | الإحداثي Y للنقاط. |
| nPoints | int | عدد النقاط. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


يرسم خطًا متعدد النقاط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xPoints | float[] | الإحداثيات X للنقاط. |
| yPoints | float[] | الإحداثي Y للنقاط. |
| nPoints | int | عدد النقاط. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


يرسم خطًا متعدد النقاط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xPoints | int[] | الإحداثيات X للنقاط. |
| yPoints | int[] | الإحداثي Y للنقاط. |
| nPoints | int | عدد النقاط. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


يرسم مستطيلًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X للزاوية العلوية اليسرى للمستطيل. |
| y | float | الإحداثي Y للزاوية العلوية اليسرى للمستطيل. |
| width | float | عرض المستطيل. |
| height | float | ارتفاع المستطيل. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


يرسم مستطيلًا مستديرًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X للزاوية العلوية اليسرى للمستطيل. |
| y | float | الإحداثي Y للزاوية العلوية اليسرى للمستطيل. |
| width | float | عرض المستطيل. |
| height | float | ارتفاع المستطيل. |
| arcWidth | float | عرض المستطيل المحيط بالقوس الذي يحد زاوية المستطيل. |
| arcHeight | float | ارتفاع المستطيل المحيط بالقوس الذي يحد زاوية المستطيل. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


يرسم سلسلة في النقطة المحددة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


يقوم بالإعدادات اللازمة للجهاز بعد أن يتم عرض المستند.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


يملأ مسارًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| path | java.awt.Shape | مسار للتعبئة. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


يملأ قوسًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X لمركز القوس. |
| y | float | الإحداثي Y لمركز القوس. |
| width | float | عرض المستطيل المحيط. |
| height | float | ارتفاع المستطيل المحيط. |
| startAngle | float | زاوية البداية للقوس. |
| arcAngle | float | زاوية القوس. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


يملأ بيضاويًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X لمركز الشكل البيضاوي. |
| y | float | الإحداثي Y لمركز الشكل البيضاوي. |
| width | float | عرض المستطيل المحيط. |
| height | float | ارتفاع المستطيل المحيط. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


يملأ مضلعًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xPoints | float[] | الإحداثيات X للنقاط. |
| yPoints | float[] | الإحداثي Y للنقاط. |
| nPoints | int | عدد النقاط. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


يملأ مضلعًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| xPoints | int[] | الإحداثيات X للنقاط. |
| yPoints | int[] | الإحداثي Y للنقاط. |
| nPoints | int | عدد النقاط. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


يملأ مستطيلًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X للزاوية العلوية اليسرى للمستطيل. |
| y | float | الإحداثي Y للزاوية العلوية اليسرى للمستطيل. |
| width | float | عرض المستطيل. |
| height | float | ارتفاع المستطيل. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


يرسم مستطيلًا مستديرًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | float | الإحداثي X للزاوية العلوية اليسرى للمستطيل. |
| y | float | الإحداثي Y للزاوية العلوية اليسرى للمستطيل. |
| width | float | عرض المستطيل. |
| height | float | ارتفاع المستطيل. |
| arcWidth | float | عرض المستطيل المحيط بالقوس الذي يحد زاوية المستطيل. |
| arcHeight | float | ارتفاع المستطيل المحيط بالقوس الذي يحد زاوية المستطيل. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


يحصل على الخلفية الحالية للصفحة.

**Returns:**
java.awt.Color - الخلفية الحالية للصفحة
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


يحصل على تحويل الأحرف الحالي.

**Returns:**
java.awt.geom.AffineTransform - التحويل الحالي للأحرف.
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


يحصل على منشئ مخرجات الجهاز الناتجة.

**Returns:**
java.lang.String - قيمة المنشئ.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


يحصل على رقم الصفحة الحالي.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


يحصل على الخط الحالي.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


يحصل على الشفافية الحالية.

**Returns:**
float - الشفافية الحالية.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


يحصل على قناع الشفافية الحالي.

**Returns:**
java.awt.Paint - قناع الشفافية الحالي.
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


يحصل على الطلاء الحالي.

**Returns:**
java.awt.Paint - الطلاء الحالي.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


يحصل على خصائص الجهاز بما في ذلك البيانات الوصفية.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


يحصل على قيمة خاصية سلسلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.lang.String - قيمة الخاصية.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


يحصل على قيمة خاصية لون.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Color - قيمة الخاصية.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


يحصل على قيمة خاصية مزدوجة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
double - قيمة الخاصية.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


يحصل على قيمة خاصية عدد صحيح.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
int - قيمة الخاصية.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


يحصل على قيمة خاصية الهوامش.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Insets - قيمة الخاصية.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


يحصل على قيمة خاصية مصفوفة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.geom.AffineTransform - قيمة الخاصية.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


يحصل على قيمة خاصية مستطيل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Rectangle - قيمة الخاصية.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


يحصل على قيمة خاصية حجم.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
java.awt.Dimension - قيمة الخاصية.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


يعيد خيارات الحفظ.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


يحصل على حجم الصفحة.

**Returns:**
java.awt.Dimension - حجم الصفحة.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


يحصل على الحد الحالي.

**Returns:**
java.awt.Stroke - الخط الحالي.
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


يحصل على وضع عرض النص الحالي.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


يحصل على عرض خط النص الحالي.

**Returns:**
float - عرض خط النص الحالي.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


يحصل على التحويل الحالي.

**Returns:**
java.awt.geom.AffineTransform - التحويل الحالي.
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


يُهيئ القص للجهاز.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


يُهيئ عدد الصفحات التي سيتم عرضها.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


يشير إلى ما إذا كان الجهاز يستخدم وضع RGB المباشر، أي RGB.

**Returns:**
منطقي
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
منطقي
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


يحصل على قيمة الخاصية المنطقية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المفتاح | java.lang.String | اسم الخاصية. |

**Returns:**
boolean - قيمة الخاصية.
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


يقوم بالتحضير الضروري للجهاز قبل عرض الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| width | float |  |
| height | float |  |

**Returns:**
منطقي
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


يقوم بالتحضير الضروري للجهاز قبل عرض الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| العنوان | java.lang.String |  |

**Returns:**
منطقي
### renew() {#renew--}
```
public void renew()
```


إعادة ضبط الجهاز إلى الحالة الأولية للمستند بأكمله. يُستخدم لإعادة ضبط تدفق الإخراج.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| المستند الرئيسي | منطقي |  |

### reset() {#reset--}
```
public void reset()
```


إعادة ضبط الجهاز إلى الحالة الأولية لصفحة.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| zeroPageNumbers | منطقي |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


دوّر مصفوفة التحويل الحالية. يستدعي writeTransform(Transform). تدوير بمقدار زاوية موجبة theta يدور النقاط على المحور x الموجب نحو المحور y الموجب.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| theta | double | زاوية بالراديان للدوران. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


دوّر مصفوفة التحويل الحالية حول نقطة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| theta | double | زاوية دوران بالراديان. |
| x | double | الإحداثي X للنقطة. |
| y | double | إحداثي Y للنقطة. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


يقوم بتكبير مصفوفة التحويل الحالية. يستدعي writeTransform(Transform).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | double | مقياس في المحور X. |
| y | double | مقياس في المحور Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


يحدد الخلفية الحالية للصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| خلفية | java.awt.Color | خلفية الصفحة. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


يحدد تحويل الأحرف.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters تحويل. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


يحدد القص للجهاز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| clipPath | java.awt.Shape | مسار قص. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


يحدد منشئ مخرجات الجهاز الناتجة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| منشئ | java.lang.String | قيمة المنشئ. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


يحدد خطًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | خط. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


يحدد الشفافية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الشفافية | float | شفافية. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


يحدد قناع الشفافية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| قناع الشفافية | java.awt.Paint | قناع شفافية. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


يحدد طلاءً.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| paint | java.awt.Paint | طلاء. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


يحدد خصائص الجهاز بما في ذلك البيانات الوصفية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | خصائص الجهاز. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


يحدد خيارات إدارة عملية العرض.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | خيارات لإدارة عملية العرض. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


يحدد حجم الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الحجم | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


يحدد خطًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| stroke | java.awt.Stroke | حد. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


يحدد وضع عرض النص.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | وضع عرض النص. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


يحدد عرض خط النص.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| عرض خط النص | float | عرض خط النص. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


يحدد التحويل الحالي.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | تحويل.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


يقص المصفوفة التحويلية الحالية. يستدعي writeTransform(Transform).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| shx | double | قص في المحور X. |
| shy | double | قص في المحور Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


يقوم بالتحضير اللازم للجهاز قبل بدء عرض المستند.

### toString() {#toString--}
```
public String toString()
```


يعيد اسم نوع الجهاز.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


يحول المصفوفة التحويلية الحالية. يستدعي writeTransform(Transform).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | التحويل المراد تطبيقه. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


ينقل المصفوفة التحويلية الحالية. يستدعي writeTransform(Transform).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| x | double | ترجمة في المحور X. |
| y | double | ترجمة في المحور Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


يقوم بتحديث معلمات الصفحة من جهاز متعدد الصفحات آخر.

**Parameters:**
| معامل | نوع | الوصف |
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


يكتب تعليقًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| تعليق | java.lang.String | تعليق ليتم كتابته. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


يكتب سلسلة باستخدام الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | الخط المحدد. |
| str | java.lang.String | السلسلة. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| تحذير | java.lang.String |  |

