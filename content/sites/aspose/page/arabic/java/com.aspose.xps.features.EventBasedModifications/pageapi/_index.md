---
title: "PageAPI"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "واجهة برمجة تطبيقات تعديل عنصر الصفحة."
type: docs
weight: 12
url: /ar/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

واجهة برمجة تطبيقات تعديل العنصر **Page**.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | يضيف عنصر محتوى (Canvas، Path، أو Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | يدرج عنصرًا (Canvas، Path، أو Glyphs) إلى الصفحة في موضع الفهرس. |
| [<T>remove(T element)](#-T-remove-T-) | يزيل عنصرًا من الصفحة. |
| [addCanvas()](#addCanvas--) | يضيف canvas جديد إلى الصفحة. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | يضيف glyphs جديدة إلى الصفحة. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | يضيف glyphs جديدة إلى الصفحة. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | يضيف مدخل مخطط إلى المستند. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | يضيف مسارًا جديدًا إلى الصفحة. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | ينشئ مقطع قوس إهليلجي مُحدَّد بالخط. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | ينشئ مقطع قوس إهليلجي جديد. |
| [createCanvas()](#createCanvas--) | ينشئ canvas جديد. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | ينشئ لونًا جديدًا في مساحة اللون scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | ينشئ لونًا جديدًا في مساحة اللون sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | ينشئ لونًا جديدًا. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | ينشئ glyphs جديدة. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | ينشئ glyphs جديدة. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | ينشئ نقطة تدرج جديدة. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | ينشئ نقطة تدرج جديدة. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | ينشئ فرشاة صورة جديدة. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | ينشئ فرشاة صورة جديدة. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | ينشئ فرشاة تدرج خطية جديدة. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | ينشئ فرشاة تدرج خطية جديدة. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | ينشئ مصفوفة تحويل افينية جديدة. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | ينشئ مسارًا جديدًا. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | ينشئ شكل مسار مفتوح جديد. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | ينشئ شكل مسار جديد. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | ينشئ شكل مسار مفتوح جديد. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | ينشئ شكل مسار جديد. |
| [createPathGeometry()](#createPathGeometry--) | ينشئ هندسة مسار جديدة. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | ينشئ هندسة مسار جديدة محددة بصيغة مختصرة. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | ينشئ هندسة مسار جديدة مع قائمة محددة من أشكال المسار. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | ينشئ مجموعة جديدة من المنحنيات المكعبة المتحددة B?zier. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | ينشئ مجموعة جديدة من المنحنيات المكعبة B?zier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | ينشئ رسمًا متعدد الأضلاع محددًا يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | ينشئ رسمًا متعدد الأضلاع يحتوي على عدد عشوائي من الرؤوس الفردية. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | ينشئ مجموعة جديدة من المنحنيات التربيعية المتحددة B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | ينشئ مجموعة جديدة من المنحنيات التربيعية B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | ينشئ فرشاة تدرج شعاعي جديدة. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | ينشئ فرشاة لون صلب جديدة. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | ينشئ فرشاة لون صلب جديدة. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | ينشئ فرشاة بصرية جديدة. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | يعيد ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [getPageCount()](#getPageCount--) | يعيد عدد الصفحات في المستند النشط. |
| [getTotalPageCount()](#getTotalPageCount--) | يعيد إجمالي عدد الصفحات في جميع المستندات داخل مستند XPS. |
| [getUtils()](#getUtils--) | يحصل على الكائن الذي يوفر أدوات تتجاوز واجهة برمجة تطبيقات معالجة XPS الرسمية. |
| [getWidth()](#getWidth--) | يعيد عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | يدرج لوحة قماشية جديدة إلى الصفحة في الموضع  index  . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | يدرج رموزًا جديدة إلى الصفحة في الموضع  index  . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | يدرج رموزًا جديدة إلى الصفحة في الموضع  index  . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | يدرج مسارًا جديدًا إلى الصفحة في الموضع  index  . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | يزيل عنصرًا في الموضع  index  من الصفحة. |
| [setHeight(float value)](#setHeight-float-) | يضبط ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [setWidth(float value)](#setWidth-float-) | يضبط عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


يضيف عنصر محتوى (Canvas، Path، أو Glyphs)

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| عنصر | T | العنصر المراد إضافته. |

**Returns:**
T - العنصر المضاف.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


يدرج عنصرًا (Canvas، Path، أو Glyphs) إلى الصفحة في موضع الفهرس.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج العنصر فيه. |
| عنصر | T | العنصر المراد إدراجه. |

**Returns:**
T - العنصر المُدرج.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


يزيل عنصرًا من الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| عنصر | T | العنصر المراد إزالته. |

**Returns:**
T - العنصر المُزال.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


يضيف canvas جديد إلى الصفحة.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


يضيف glyphs جديدة إلى الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | مورد الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


يضيف glyphs جديدة إلى الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontFamily | java.lang.String | عائلة الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


يضيف مدخل مخطط إلى المستند.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| وصف | java.lang.String | وصف الإدخال. |
| outlineLevel | int | مستوى المخطط. |
| targetPageNumber | int | رقم الصفحة المستهدفة. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


يضيف مسارًا جديدًا إلى الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


ينشئ مقطع قوس إهليلجي مُحدَّد بالخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | java.awt.geom.Point2D | نقطة النهاية للقوس الإهليلجي. |
| الحجم | java.awt.geom.Dimension2D | نصف القطر x و y للقوس الإهليلجي كزوج x,y. |
| rotationAngle | float | يحدد كيفية دوران الإهليلج بالنسبة إلى نظام الإحداثيات الحالي. |
| isLargeArc | منطقي | يحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | الاتجاه الذي يُرسم فيه القوس. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


ينشئ مقطع قوس إهليلجي جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة | java.awt.geom.Point2D | نقطة النهاية للقوس الإهليلجي. |
| الحجم | java.awt.geom.Dimension2D | نصف القطر x و y للقوس الإهليلجي كزوج x,y. |
| rotationAngle | float | يحدد كيفية دوران الإهليلج بالنسبة إلى نظام الإحداثيات الحالي. |
| isLargeArc | منطقي | يحدد ما إذا كان القوس يُرسم بزاوية 180 درجة أو أكثر. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | الاتجاه الذي يُرسم فيه القوس. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


ينشئ canvas جديد.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | مورد ملف تعريف ICC. |
| components | float[] | مكوّنات اللون. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


ينشئ لونًا جديدًا في مساحة اللون scRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| r | float | مكوّن اللون الأحمر. |
| g | float | مكوّن اللون الأخضر. |
| b | float | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


ينشئ لونًا جديدًا في مساحة اللون scRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | float | مكوّن اللون ألفا. |
| r | float | مكوّن اللون الأحمر. |
| g | float | مكوّن اللون الأخضر. |
| b | float | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


ينشئ لونًا جديدًا في مساحة اللون sRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| r | int | مكوّن اللون الأحمر. |
| g | int | مكوّن اللون الأخضر. |
| b | int | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


ينشئ لونًا جديدًا في مساحة اللون sRGB.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| a | int | مكوّن اللون ألفا. |
| r | int | مكوّن اللون الأحمر. |
| g | int | مكوّن اللون الأخضر. |
| b | int | مكوّن اللون الأزرق. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


ينشئ لونًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | java.awt.Color | مثيل لون أصلي للون RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| path | java.lang.String | المسار إلى ملف تعريف ICC. |
| components | float[] | مكوّنات اللون. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


ينشئ glyphs جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | مورد الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


ينشئ glyphs جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontFamily | java.lang.String | عائلة الخط. |
| fontRenderingEmSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


ينشئ نقطة تدرج جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | لون نقطة إيقاف التدرج. |
| الإزاحة | float | إزاحة التدرج. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


ينشئ نقطة تدرج جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | java.awt.Color | لون نقطة إيقاف التدرج. |
| الإزاحة | float | إزاحة التدرج. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


ينشئ فرشاة صورة جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | مورد صورة. |
| صندوق العرض | java.awt.geom.Rectangle2D | الموضع والأبعاد لمحتوى مصدر الفرشاة. |
| منطقة العرض | java.awt.geom.Rectangle2D | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


ينشئ فرشاة صورة جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار الصورة | java.lang.String | المسار إلى الصورة لاستخدامها كبلاطة فرشاة. |
| صندوق العرض | java.awt.geom.Rectangle2D | الموضع والأبعاد لمحتوى مصدر الفرشاة. |
| منطقة العرض | java.awt.geom.Rectangle2D | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


ينشئ فرشاة تدرج خطية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للتدرج الخطي. |
| نقطة النهاية | java.awt.geom.Point2D | نقطة النهاية للتدرج الخطي. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


ينشئ فرشاة تدرج خطية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقاط التوقف للتدرج | java.util.List<com.aspose.xps.XpsGradientStop> | قائمة نقاط التوقف للتدرج. |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للتدرج الخطي. |
| نقطة النهاية | java.awt.geom.Point2D | نقطة النهاية للتدرج الخطي. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


ينشئ مصفوفة تحويل افينية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| m11 | float | العنصر 11. |
| m12 | float | العنصر 12. |
| m21 | float | العنصر 21. |
| m22 | float | العنصر 22. |
| m31 | float | العنصر 31. |
| m32 | float | العنصر 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


ينشئ مسارًا جديدًا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


ينشئ شكل مسار مفتوح جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


ينشئ شكل مسار جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |
| isClosed | منطقي | يحدد ما إذا كان المسار مغلقًا. إذا تم تعيينه إلى true، يتم رسم الخط "closed"، أي أن النقطة الأخيرة في القطعة الأخيرة من شكل المسار يتم ربطها بالنقطة المحددة في الخاصية StartPoint، وإلا يتم رسم الخط "open"، ولا يتم ربط النقطة الأخيرة بنقطة البداية. ينطبق ذلك فقط إذا تم استخدام شكل المسار داخل عنصر Path يحدد خطًا. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


ينشئ شكل مسار مفتوح جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | قائمة بقطع المسار. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


ينشئ شكل مسار جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة البداية | java.awt.geom.Point2D | نقطة البداية للقطعة الأولى من شكل المسار. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | قائمة بقطع المسار. |
| isClosed | منطقي | يحدد ما إذا كان المسار مغلقًا. إذا تم تعيينه إلى true، يتم رسم الخط "closed"، أي أن النقطة الأخيرة في القطعة الأخيرة من شكل المسار يتم ربطها بالنقطة المحددة في الخاصية StartPoint، وإلا يتم رسم الخط "open"، ولا يتم ربط النقطة الأخيرة بنقطة البداية. ينطبق ذلك فقط إذا تم استخدام شكل المسار داخل عنصر Path يحدد خطًا. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


ينشئ هندسة مسار جديدة.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


ينشئ هندسة مسار جديدة محددة بصيغة مختصرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | الصيغة المختصرة لهندسة المسار. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


ينشئ هندسة مسار جديدة مع قائمة محددة من أشكال المسار.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | قائمة بأشكال المسار. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


ينشئ مجموعة جديدة من المنحنيات المكعبة المتحددة B?zier.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


ينشئ مجموعة جديدة من المنحنيات المكعبة B?zier.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


ينشئ رسمًا متعدد الأضلاع محددًا يحتوي على عدد عشوائي من الرؤوس الفردية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | مجموعة من الإحداثيات للقطع المتعددة التي تُعرّف مقطع الخط المتعدد. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


ينشئ رسمًا متعدد الأضلاع يحتوي على عدد عشوائي من الرؤوس الفردية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | مجموعة من الإحداثيات للقطع المتعددة التي تُعرّف مقطع الخط المتعدد. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


ينشئ مجموعة جديدة من المنحنيات التربيعية المتحددة B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier تربيعية. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


ينشئ مجموعة جديدة من المنحنيات التربيعية B?zier من النقطة السابقة في شكل المسار عبر مجموعة من الرؤوس، باستخدام نقاط التحكم المحددة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | نقاط التحكم لعدة قطع B?bezier تربيعية. |
| isStroked | منطقي | يحدد ما إذا كان الحد لهذا الجزء من المسار يُرسم. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


ينشئ فرشاة تدرج شعاعي جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| center | java.awt.geom.Point2D | نقطة المركز للتدرج الشعاعي (أي مركز القطع الناقص). |
| gradientOrigin | java.awt.geom.Point2D | نقطة الأصل للتدرج الشعاعي. |
| radiusX | float | نصف القطر في البُعد السيني للإهليلج الذي يحدد التدرج الشعاعي. |
| radiusY | float | نصف القطر في البُعد الصادي للإهليلج الذي يحدد التدرج الشعاعي. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


ينشئ فرشاة تدرج شعاعي جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| نقاط التوقف للتدرج | java.util.List<com.aspose.xps.XpsGradientStop> | قائمة نقاط التوقف للتدرج. |
| center | java.awt.geom.Point2D | نقطة المركز للتدرج الشعاعي (أي مركز القطع الناقص). |
| gradientOrigin | java.awt.geom.Point2D | نقطة الأصل للتدرج الشعاعي. |
| radiusX | float | نصف القطر في البُعد السيني للإهليلج الذي يحدد التدرج الشعاعي. |
| radiusY | float | نصف القطر في البُعد الصادي للإهليلج الذي يحدد التدرج الشعاعي. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


ينشئ فرشاة لون صلب جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | اللون للعناصر المملوءة. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


ينشئ فرشاة لون صلب جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| color | java.awt.Color | اللون للعناصر المملوءة. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


ينشئ فرشاة بصرية جديدة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | عنصر XPS (Canvas, Path, أو Glyphs) لخاصية Visual لفرشاة بصرية. |
| صندوق العرض | java.awt.geom.Rectangle2D | الموضع والأبعاد لمحتوى مصدر الفرشاة. |
| منطقة العرض | java.awt.geom.Rectangle2D | المنطقة في مساحة الإحداثيات المحتوية لبلاطة الفرشاة الأساسية التي تُطبق (ربما بشكل متكرر) لملء المنطقة التي تُطبق عليها الفرشاة |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


يعيد ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Returns:**
float - ارتفاع الصفحة.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


يعيد عدد الصفحات في المستند النشط.

**Returns:**
int - عدد الصفحات في المستند النشط.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


يعيد إجمالي عدد الصفحات في جميع المستندات داخل مستند XPS.

**Returns:**
int - إجمالي عدد الصفحات في جميع المستندات داخل مستند XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


يحصل على الكائن الذي يوفر أدوات تتجاوز واجهة برمجة تطبيقات معالجة XPS الرسمية.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


يعيد عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Returns:**
float - عرض الصفحة.
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


يدرج لوحة قماشية جديدة إلى الصفحة في الموضع  index  .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج لوحة رسم جديدة فيه. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


يدرج رموزًا جديدة إلى الصفحة في الموضع  index  .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج رموز جديدة فيه. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | مورد الخط. |
| fontSize | float | حجم الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


يدرج رموزًا جديدة إلى الصفحة في الموضع  index  .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج رموز جديدة فيه. |
| fontFamily | java.lang.String | عائلة الخط. |
| fontSize | float | حجم الخط. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | نمط الخط. |
| originX | float | إحداثي X لأصل الحروف. |
| originY | float | إحداثي Y لأصل الحروف. |
| unicodeString | java.lang.String | السلسلة التي سيتم طباعتها. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


يدرج مسارًا جديدًا إلى الصفحة في الموضع  index  .

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إدراج مسار جديد فيه. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | هندسة المسار. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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


يزيل عنصرًا في الموضع  index  من الصفحة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| فهرس | int | الموضع الذي يجب إزالة العنصر منه. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


يضبط ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | ارتفاع الصفحة. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


يضبط عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | عرض الصفحة. |

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

