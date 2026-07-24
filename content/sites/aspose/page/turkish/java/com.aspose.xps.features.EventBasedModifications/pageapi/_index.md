---
title: "PageAPI"
second_title: "Java için Aspose.Page API Referansı"
description: "Sayfa öğesi değiştirme API'si."
type: docs
weight: 12
url: /tr/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

The **Page** öğe değiştirme API'si.
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Bir içerik öğesi (Canvas, Path veya Glyphs) ekler |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Sayfaya (Canvas, Path veya Glyphs) öğesini  index  konumunda ekler. |
| [<T>remove(T element)](#-T-remove-T-) | Sayfadan bir öğeyi kaldırır. |
| [addCanvas()](#addCanvas--) | Sayfaya yeni bir canvas ekler. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Sayfaya yeni glyph'ler ekler. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Sayfaya yeni glyph'ler ekler. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Belgeye bir taslak girişi ekler. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Sayfaya yeni bir yol ekler. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Yeni bir kenarlı eliptik yay segmenti oluşturur. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Yeni bir eliptik yay segmenti oluşturur. |
| [createCanvas()](#createCanvas--) | Yeni bir canvas oluşturur. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | scRGB renk uzayında yeni bir renk oluşturur. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | scRGB renk uzayında yeni bir renk oluşturur. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | sRGB renk uzayında yeni bir renk oluşturur. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | sRGB renk uzayında yeni bir renk oluşturur. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Yeni bir renk oluşturur. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ICC tabanlı renk uzayında yeni bir renk oluşturur. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Yeni glyph'ler oluşturur. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Yeni glyph'ler oluşturur. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Yeni bir degrade durağı oluşturur. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Yeni bir degrade durağı oluşturur. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Yeni bir görüntü fırçası oluşturur. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Yeni bir görüntü fırçası oluşturur. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Yeni bir doğrusal degrade fırçası oluşturur. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Yeni bir doğrusal degrade fırçası oluşturur. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Yeni bir afin dönüşüm matrisi oluşturur. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Yeni bir yol oluşturur. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Yeni bir açık yol figürü oluşturur. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Yeni bir yol şekli oluşturur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Yeni bir açık yol figürü oluşturur. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Yeni bir yol şekli oluşturur. |
| [createPathGeometry()](#createPathGeometry--) | Yeni bir yol geometrisi oluşturur. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Kısaltılmış biçimle belirtilen yeni bir yol geometrisi oluşturur. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Belirtilen yol şekilleri listesiyle yeni bir yol geometrisi oluşturur. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Yeni bir kenarlı kübik B?zier eğrileri kümesi oluşturur. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Yeni bir kübik B?zier eğrileri kümesi oluşturur. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | İstediği sayıda bireysel köşe içeren yeni bir kenarlı çokgen çizim oluşturur. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | İsteğe bağlı sayıda tekil köşe içeren yeni bir çokgen çizim oluşturur. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Yol figüründeki önceki noktadan bir dizi köşe üzerinden, belirtilen kontrol noktalarını kullanarak yeni bir kenarlı ikinci dereceli B?zier eğrileri kümesi oluşturur. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Yol figüründeki önceki noktadan bir dizi köşe üzerinden, belirtilen kontrol noktalarını kullanarak yeni bir ikinci dereceli B?zier eğrileri kümesi oluşturur. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Yeni bir radyal degrade fırçası oluşturur. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Yeni bir radyal degrade fırçası oluşturur. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Yeni bir katı renk fırçası oluşturur. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Yeni bir katı renk fırçası oluşturur. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Yeni bir görsel fırça oluşturur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Sayfanın yüksekliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak döndürür. |
| [getPageCount()](#getPageCount--) | Etkin belgedeki sayfa sayısını döndürür. |
| [getTotalPageCount()](#getTotalPageCount--) | XPS belgesi içindeki tüm belgelerdeki toplam sayfa sayısını döndürür. |
| [getUtils()](#getUtils--) | Resmi XPS manipülasyon API'sinin ötesinde yardımcı araçlar sağlayan nesneyi alır. |
| [getWidth()](#getWidth--) | Sayfanın genişliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak döndürür. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Sayfaya yeni bir canvas'ı  index  konumunda ekler. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Sayfaya yeni glyph'leri  index  konumunda ekler. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Sayfaya yeni glyph'leri  index  konumunda ekler. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Sayfaya yeni bir yolu  index  konumunda ekler. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Sayfadan  index  konumundaki bir öğeyi kaldırır. |
| [setHeight(float value)](#setHeight-float-) | Sayfanın yüksekliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak ayarlar. |
| [setWidth(float value)](#setWidth-float-) | Sayfanın genişliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Bir içerik öğesi (Canvas, Path veya Glyphs) ekler

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| öğe | T | Eklenecek öğe. |

**Returns:**
T - Eklenen öğe.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Sayfaya (Canvas, Path veya Glyphs) öğesini  index  konumunda ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Bir  element  eklenmesi gereken konum. |
| öğe | T | Eklenecek öğe. |

**Returns:**
T - Eklenen öğe.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Sayfadan bir öğeyi kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| öğe | T | Kaldırılacak öğe. |

**Returns:**
T - Kaldırılan öğe.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Sayfaya yeni bir canvas ekler.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Sayfaya yeni glyph'ler ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Yazı tipi kaynağı. |
| fontRenderingEmSize | float | Yazı tipi boyutu. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin Y koordinat başlangıcı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Sayfaya yeni glyph'ler ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontFamily | java.lang.String | Yazı tipi ailesi. |
| fontRenderingEmSize | float | Yazı tipi boyutu. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Yazı tipi stili. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin Y koordinat başlangıcı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Belgeye bir taslak girişi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| açıklama | java.lang.String | Giriş açıklaması. |
| outlineLevel | int | Taslak seviyesi. |
| targetPageNumber | int | Hedef sayfa numarası. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Sayfaya yeni bir yol ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Yolun geometrisi. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Yeni bir kenarlı eliptik yay segmenti oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nokta | java.awt.geom.Point2D | Eliptik yayının son noktası. |
| size | java.awt.geom.Dimension2D | Eliptik yayının x ve y yarıçapı, x,y çifti olarak. |
| rotationAngle | float | Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösterir. |
| isLargeArc | boolean | Yayın 180 veya daha büyük bir açıyla çizilip çizilmediğini belirler. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Yayın çizildiği yön. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Yeni bir eliptik yay segmenti oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nokta | java.awt.geom.Point2D | Eliptik yayının son noktası. |
| size | java.awt.geom.Dimension2D | Eliptik yayının x ve y yarıçapı, x,y çifti olarak. |
| rotationAngle | float | Elipsin mevcut koordinat sistemine göre nasıl döndürüldüğünü gösterir. |
| isLargeArc | boolean | Yayın 180 veya daha büyük bir açıyla çizilip çizilmediğini belirler. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Yayın çizildiği yön. |
| isStroked | boolean | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Yeni bir canvas oluşturur.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ICC tabanlı renk uzayında yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC profil kaynağı. |
| bileşenler | float[] | Renk bileşenleri. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


scRGB renk uzayında yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| r | float | Kırmızı renk bileşeni. |
| g | float | Yeşil renk bileşeni. |
| b | float | Mavi renk bileşeni. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


scRGB renk uzayında yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | float | Alfa renk bileşeni. |
| r | float | Kırmızı renk bileşeni. |
| g | float | Yeşil renk bileşeni. |
| b | float | Mavi renk bileşeni. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


sRGB renk uzayında yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| r | int | Kırmızı renk bileşeni. |
| g | int | Yeşil renk bileşeni. |
| b | int | Mavi renk bileşeni. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


sRGB renk uzayında yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | int | Alfa renk bileşeni. |
| r | int | Kırmızı renk bileşeni. |
| g | int | Yeşil renk bileşeni. |
| b | int | Mavi renk bileşeni. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| renk | java.awt.Color | RGB rengi için yerel bir renk örneği. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ICC tabanlı renk uzayında yeni bir renk oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | java.lang.String | ICC profile yolu. |
| bileşenler | float[] | Renk bileşenleri. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Yeni glyph'ler oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Yazı tipi kaynağı. |
| fontRenderingEmSize | float | Yazı tipi boyutu. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin Y koordinat başlangıcı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Yeni glyph'ler oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fontFamily | java.lang.String | Yazı tipi ailesi. |
| fontRenderingEmSize | float | Yazı tipi boyutu. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Yazı tipi stili. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin Y koordinat başlangıcı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Yeni bir degrade durağı oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Degrade durak noktasının rengi. |
| offset | float | Degrade ofseti. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Yeni bir degrade durağı oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| renk | java.awt.Color | Degrade durak noktasının rengi. |
| offset | float | Degrade ofseti. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Yeni bir görüntü fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Bir görüntü kaynağı. |
| viewbox | java.awt.geom.Rectangle2D | Fırçanın kaynak içeriğinin konumu ve boyutları. |
| görünüm alanı | java.awt.geom.Rectangle2D | Fırçanın uygulandığı bölgeyi doldurmak için (muhtemelen tekrar tekrar) uygulanan birincil fırça döşemesinin bulunduğu kapsayıcı koordinat uzayındaki bölge. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Yeni bir görüntü fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imagePath | java.lang.String | Fırça döşemesi olarak kullanılacak görüntünün yolu. |
| viewbox | java.awt.geom.Rectangle2D | Fırçanın kaynak içeriğinin konumu ve boyutları. |
| görünüm alanı | java.awt.geom.Rectangle2D | Fırçanın uygulandığı bölgeyi doldurmak için (muhtemelen tekrar tekrar) uygulanan birincil fırça döşemesinin bulunduğu kapsayıcı koordinat uzayındaki bölge. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Yeni bir doğrusal degrade fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Doğrusal degrade'nin başlangıç noktası. |
| endPoint | java.awt.geom.Point2D | Doğrusal degrade'nin bitiş noktası. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Yeni bir doğrusal degrade fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Degrade duraklarının listesi. |
| startPoint | java.awt.geom.Point2D | Doğrusal degrade'nin başlangıç noktası. |
| endPoint | java.awt.geom.Point2D | Doğrusal degrade'nin bitiş noktası. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Yeni bir afin dönüşüm matrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| m11 | float | Eleman 11. |
| m12 | float | Eleman 12. |
| m21 | float | Eleman 21. |
| m22 | float | Eleman 22. |
| m31 | float | Eleman 31. |
| m32 | float | Eleman 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Yeni bir yol oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Yolun geometrisi. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Yeni bir açık yol figürü oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Yol figürünün ilk segmenti için başlangıç noktası. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Yeni bir yol şekli oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Yol figürünün ilk segmenti için başlangıç noktası. |
| isClosed | boolean | Yolun kapalı olup olmadığını belirtir. true olarak ayarlanırsa, çizgi "closed" (kapalı) olarak çizilir, yani yol figürünün son segmentindeki son nokta StartPoint özniteliğinde belirtilen nokta ile bağlanır; aksi takdirde çizgi "open" (açık) olarak çizilir ve son nokta başlangıç noktasına bağlanmaz. Yalnızca yol figürü bir stroke belirten Path öğesinde kullanıldığında uygulanır. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Yeni bir açık yol figürü oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Yol figürünün ilk segmenti için başlangıç noktası. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Yol segmentlerinin listesi. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Yeni bir yol şekli oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Yol figürünün ilk segmenti için başlangıç noktası. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Yol segmentlerinin listesi. |
| isClosed | boolean | Yolun kapalı olup olmadığını belirtir. true olarak ayarlanırsa, çizgi "closed" (kapalı) olarak çizilir, yani yol figürünün son segmentindeki son nokta StartPoint özniteliğinde belirtilen nokta ile bağlanır; aksi takdirde çizgi "open" (açık) olarak çizilir ve son nokta başlangıç noktasına bağlanmaz. Yalnızca yol figürü bir stroke belirten Path öğesinde kullanıldığında uygulanır. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Yeni bir yol geometrisi oluşturur.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Kısaltılmış biçimle belirtilen yeni bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Yol geometrisinin kısaltılmış biçimi. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Belirtilen yol şekilleri listesiyle yeni bir yol geometrisi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Yol şekillerinin listesi. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Yeni bir kenarlı kübik B?zier eğrileri kümesi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Birden fazla B?bezier segmenti için kontrol noktaları. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Yeni bir kübik B?zier eğrileri kümesi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Birden fazla B?bezier segmenti için kontrol noktaları. |
| isStroked | boolean | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


İstediği sayıda bireysel köşe içeren yeni bir kenarlı çokgen çizim oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Poliçizgi segmentini tanımlayan birden çok segment için bir koordinat kümesi. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


İsteğe bağlı sayıda tekil köşe içeren yeni bir çokgen çizim oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Poliçizgi segmentini tanımlayan birden çok segment için bir koordinat kümesi. |
| isStroked | boolean | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Yol figüründeki önceki noktadan bir dizi köşe üzerinden, belirtilen kontrol noktalarını kullanarak yeni bir kenarlı ikinci dereceli B?zier eğrileri kümesi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Birden fazla ikinci dereceli B?bezier segmenti için kontrol noktaları. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Yol figüründeki önceki noktadan bir dizi köşe üzerinden, belirtilen kontrol noktalarını kullanarak yeni bir ikinci dereceli B?zier eğrileri kümesi oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| noktalar | java.awt.geom.Point2D[] | Birden fazla ikinci dereceli B?bezier segmenti için kontrol noktaları. |
| isStroked | boolean | Bu yol segmentinin çizgisinin çizilip çizilmediğini belirtir. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Yeni bir radyal degrade fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| merkez | java.awt.geom.Point2D | Radyal degrade'nin merkez noktası (yani elipsin merkezi). |
| gradientOrigin | java.awt.geom.Point2D | Radyal degrade'nin başlangıç noktası. |
| radiusX | float | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı. |
| radiusY | float | Radial gradyanı tanımlayan elipsin y boyutundaki yarıçap. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Yeni bir radyal degrade fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Degrade duraklarının listesi. |
| merkez | java.awt.geom.Point2D | Radyal degrade'nin merkez noktası (yani elipsin merkezi). |
| gradientOrigin | java.awt.geom.Point2D | Radyal degrade'nin başlangıç noktası. |
| radiusX | float | Radyal degradeyi tanımlayan elipsin x boyutundaki yarıçapı. |
| radiusY | float | Radial gradyanı tanımlayan elipsin y boyutundaki yarıçap. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Yeni bir katı renk fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Dolu öğeler için renk. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Yeni bir katı renk fırçası oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| renk | java.awt.Color | Dolu öğeler için renk. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Yeni bir görsel fırça oluşturur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Visual özelliği için görsel fırçanın XPS öğesi (Canvas, Path veya Glyphs). |
| viewbox | java.awt.geom.Rectangle2D | Fırçanın kaynak içeriğinin konumu ve boyutları. |
| görünüm alanı | java.awt.geom.Rectangle2D | Fırçanın uygulandığı bölgeyi doldurmak için (muhtemelen tekrar tekrar) uygulanan birincil fırça döşemesinin bulunduğu kapsayıcı koordinat uzayındaki bölge. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
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


Sayfanın yüksekliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak döndürür.

**Returns:**
float - Sayfanın yüksekliği.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Etkin belgedeki sayfa sayısını döndürür.

**Returns:**
int - Etkin belgede sayfa sayısı.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


XPS belgesi içindeki tüm belgelerdeki toplam sayfa sayısını döndürür.

**Returns:**
int - XPS belgesi içindeki tüm belgelerdeki toplam sayfa sayısı.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Resmi XPS manipülasyon API'sinin ötesinde yardımcı araçlar sağlayan nesneyi alır.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Sayfanın genişliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak döndürür.

**Returns:**
float - Sayfanın genişliği.
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


Sayfaya yeni bir canvas'ı  index  konumunda ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni bir kanvasın eklenmesi gereken konum. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Sayfaya yeni glyph'leri  index  konumunda ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni gliflerin eklenmesi gereken konum. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Yazı tipi kaynağı. |
| fontSize | float | Yazı tipi boyutu. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin Y koordinat başlangıcı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Sayfaya yeni glyph'leri  index  konumunda ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni gliflerin eklenmesi gereken konum. |
| fontFamily | java.lang.String | Yazı tipi ailesi. |
| fontSize | float | Yazı tipi boyutu. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Yazı tipi stili. |
| originX | float | Gliflerin X koordinat başlangıcı. |
| originY | float | Gliflerin Y koordinat başlangıcı. |
| unicodeString | java.lang.String | Yazdırılacak dize. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Sayfaya yeni bir yolu  index  konumunda ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Yeni bir yolun eklenmesi gereken konum. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Yolun geometrisi. |

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


Sayfadan  index  konumundaki bir öğeyi kaldırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| indeks | int | Öğenin kaldırılması gereken konum. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Sayfanın yüksekliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Sayfanın yüksekliği. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Sayfanın genişliğini, etkili koordinat uzayının birimlerinde gerçek sayı olarak ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | float | Sayfanın genişliği. |

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

