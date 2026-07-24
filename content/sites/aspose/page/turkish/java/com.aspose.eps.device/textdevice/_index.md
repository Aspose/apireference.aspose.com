---
title: "TextDevice"
second_title: "Java için Aspose.Page API Referansı"
description: 
type: docs
weight: 13
url: /tr/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Mevcut cihaz sürümü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Bir yolu çizer. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Bir yay çizer. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Atanan dönüşüm ve arka plan ile bir görüntü çizer. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Bir çizgi segmenti çizer. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Bir oval çizer. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Bir çokgen çizer. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Bir çokgen çizer. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Bir çoklu çizgi çizer. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Bir çoklu çizgi çizer. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Bir dikdörtgen çizer. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Yuvarlak köşeli bir dikdörtgen çizer. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Bir yolu doldurur. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Bir yay doldurur. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Bir oval doldurur. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Bir çokgeni doldurur. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Bir çokgeni doldurur. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Bir dikdörtgen doldurur. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Yuvarlak köşeli bir dikdörtgen çizer. |
| [getBackground()](#getBackground--) | Sayfanın mevcut arka planını alır. |
| [getCharTM()](#getCharTM--) | Mevcut karakter dönüşümünü alır. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Sonuçlanan cihaz çıktısının oluşturucusunu alır. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Mevcut yazı tipini alır. |
| [getOpacity()](#getOpacity--) | Mevcut opaklığı alır. |
| [getOpacityMask()](#getOpacityMask--) | Mevcut opaklık maskesini alır. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Mevcut boyamayı alır. |
| [getProperties()](#getProperties--) | Meta veriler dahil cihaz özelliklerini alır. |
| [getProperty(String key)](#getProperty-java.lang.String-) | String özelliğinin değerini alır. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Color özelliğinin değerini alır. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Double özelliğinin değerini alır. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Integer özelliğinin değerini alır. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Margins özelliğinin değerini alır. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Matris özelliğinin değerini alır. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Dikdörtgen özelliğinin değerini alır. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Boyut özelliğinin değerini alır. |
| [getSaveOptions()](#getSaveOptions--) | Kaydetme seçeneklerini döndürür. |
| [getSize()](#getSize--) | Sayfanın boyutunu alır. |
| [getStroke()](#getStroke--) | Geçerli çizgiyi alır. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Geçerli metin renderleme modunu alır. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Geçerli metin çizgi genişliğini alır. |
| [getTransform()](#getTransform--) | Mevcut dönüşümü alır. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Cihazın kırpmasını başlatır. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Boolean özelliğinin değerini alır. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Geçerli dönüşüm matrisini döndür. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Geçerli dönüşüm matrisini bir nokta etrafında döndür. |
| [scale(double x, double y)](#scale-double-double-) | Geçerli dönüşüm matrisini ölçeklendir. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Sayfanın geçerli arka planını belirtir. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Karakter dönüşümünü belirtir. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Cihazın kırpmasını belirtir. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Ortaya çıkan cihaz çıktısının oluşturucusunu belirtir. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Bir yazı tipini belirtir. |
| [setOpacity(float opacity)](#setOpacity-float-) | Saydamlığı belirtir. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Bir saydamlık maskesini belirtir. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Bir boyamayı belirtir. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Meta veriler dahil cihaz özelliklerini belirtir. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Renderleme sürecini yönetmek için seçenekleri belirtir. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Bir çizgiyi belirtir. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Metin renderleme modunu belirtir. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Metin çizgi genişliğini belirtir. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Geçerli dönüşümü belirtir. |
| [shear(double shx, double shy)](#shear-double-double-) | Mevcut dönüşüm matrisini kırpar. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Mevcut dönüşüm matrisini dönüştürür. |
| [translate(double x, double y)](#translate-double-double-) | Mevcut dönüşüm matrisini kaydırır. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Bir yorum yazar. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Belirtilen font ile dizeyi yazar. |
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


Mevcut cihaz sürümü.

### closePage() {#closePage--}
```
public void closePage()
```


Sayfa render edildikten sonra cihazın gerekli hazırlığını yapar.

### create() {#create--}
```
public Device create()
```


Bu cihazın bir kopyasını oluşturur.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Cihazı serbest bırakır.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Bir yolu çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | java.awt.Shape | Çizilecek bir yol. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Bir yay çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Yayın merkezinin X koordinatı. |
| y | float | Yayın merkezinin Y koordinatı. |
| width | float | Çevreleyen dikdörtgenin genişliği. |
| height | float | Çevreleyen dikdörtgenin yüksekliği. |
| startAngle | float | Yayın başlangıç açısı. |
| arcAngle | float | Yayın açısı. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Atanan dönüşüm ve arka plan ile bir görüntü çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görüntü | java.awt.image.BufferedImage | Çizilecek bir görüntü. |
| dönüşüm | java.awt.geom.AffineTransform | Bir dönüşüm. |
| bkg | java.awt.Color | Bir arka plan rengi. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Bir çizgi segmenti çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x1 | float | Segmentin başlangıcının X koordinatı. |
| y1 | float | Segmentin başlangıcının Y koordinatı. |
| x2 | float | Segmentin sonunun X koordinatı. |
| y2 | float | Segmentin sonunun Y koordinatı. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Bir oval çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Ovalin merkezinin X koordinatı. |
| y | float | Ovalin merkezinin Y koordinatı. |
| width | float | Çevreleyen dikdörtgenin genişliği. |
| height | float | Çevreleyen dikdörtgenin yüksekliği. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Bir çokgen çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xPoints | float[] | Noktaların X koordinatları. |
| yPoints | float[] | Noktaların Y koordinatı. |
| nPoints | int | Nokta sayısı. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Bir çokgen çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xPoints | int[] | Noktaların X koordinatları. |
| yPoints | int[] | Noktaların Y koordinatı. |
| nPoints | int | Nokta sayısı. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Bir çoklu çizgi çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xPoints | float[] | Noktaların X koordinatları. |
| yPoints | float[] | Noktaların Y koordinatı. |
| nPoints | int | Nokta sayısı. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Bir çoklu çizgi çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xPoints | int[] | Noktaların X koordinatları. |
| yPoints | int[] | Noktaların Y koordinatı. |
| nPoints | int | Nokta sayısı. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Bir dikdörtgen çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Dikdörtgenin sol üst köşesinin X koordinatı. |
| y | float | Dikdörtgenin sol üst köşesinin Y koordinatı. |
| width | float | Dikdörtgenin genişliği. |
| height | float | Dikdörtgenin bir yüksekliği. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Yuvarlak köşeli bir dikdörtgen çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Dikdörtgenin sol üst köşesinin X koordinatı. |
| y | float | Dikdörtgenin sol üst köşesinin Y koordinatı. |
| width | float | Dikdörtgenin genişliği. |
| height | float | Dikdörtgenin bir yüksekliği. |
| arcWidth | float | Yayının, dikdörtgenin bir açısını yuvarlayan çevreleyen dikdörtgeninin bir genişliği. |
| arcHeight | float | Yayının, dikdörtgenin bir açısını yuvarlayan çevreleyen dikdörtgeninin bir yüksekliği. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Verilen noktada bir dize çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Belge render edildikten sonra cihazın gerekli hazırlığını yapar.

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Bir yolu doldurur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | java.awt.Shape | Doldurulacak bir yol. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Bir yay doldurur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Yayın merkezinin X koordinatı. |
| y | float | Yayın merkezinin Y koordinatı. |
| width | float | Çevreleyen dikdörtgenin genişliği. |
| height | float | Çevreleyen dikdörtgenin yüksekliği. |
| startAngle | float | Yayın başlangıç açısı. |
| arcAngle | float | Yayın açısı. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Bir oval doldurur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Ovalin merkezinin X koordinatı. |
| y | float | Ovalin merkezinin Y koordinatı. |
| width | float | Çevreleyen dikdörtgenin genişliği. |
| height | float | Çevreleyen dikdörtgenin yüksekliği. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Bir çokgeni doldurur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xPoints | float[] | Noktaların X koordinatları. |
| yPoints | float[] | Noktaların Y koordinatı. |
| nPoints | int | Nokta sayısı. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Bir çokgeni doldurur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xPoints | int[] | Noktaların X koordinatları. |
| yPoints | int[] | Noktaların Y koordinatı. |
| nPoints | int | Nokta sayısı. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Bir dikdörtgen doldurur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Dikdörtgenin sol üst köşesinin X koordinatı. |
| y | float | Dikdörtgenin sol üst köşesinin Y koordinatı. |
| width | float | Dikdörtgenin genişliği. |
| height | float | Dikdörtgenin bir yüksekliği. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Yuvarlak köşeli bir dikdörtgen çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | Dikdörtgenin sol üst köşesinin X koordinatı. |
| y | float | Dikdörtgenin sol üst köşesinin Y koordinatı. |
| width | float | Dikdörtgenin genişliği. |
| height | float | Dikdörtgenin bir yüksekliği. |
| arcWidth | float | Yayının, dikdörtgenin bir açısını yuvarlayan çevreleyen dikdörtgeninin bir genişliği. |
| arcHeight | float | Yayının, dikdörtgenin bir açısını yuvarlayan çevreleyen dikdörtgeninin bir yüksekliği. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Sayfanın mevcut arka planını alır.

**Returns:**
java.awt.Color - Sayfanın mevcut arka planı
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Mevcut karakter dönüşümünü alır.

**Returns:**
java.awt.geom.AffineTransform - Mevcut karakter dönüşümü.
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


Sonuçlanan cihaz çıktısının oluşturucusunu alır.

**Returns:**
java.lang.String - Bir oluşturucu değeri.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Mevcut sayfa numarasını alır.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Mevcut yazı tipini alır.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Mevcut opaklığı alır.

**Returns:**
float - Mevcut opaklık.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Mevcut opaklık maskesini alır.

**Returns:**
java.awt.Paint - Mevcut opaklık maskesi.
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


Mevcut boyamayı alır.

**Returns:**
java.awt.Paint - Mevcut boya.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Meta veriler dahil cihaz özelliklerini alır.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


String özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
java.lang.String - Özellik değeri.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Color özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
java.awt.Color - Özellik değeri.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Double özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
double - Özellik değeri.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Integer özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
int - Özellik değeri.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Margins özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
java.awt.Insets - Özellik değeri.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Matris özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
java.awt.geom.AffineTransform - Özellik değeri.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Dikdörtgen özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
java.awt.Rectangle - Özellik değeri.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Boyut özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
java.awt.Dimension - Özellik değeri.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Kaydetme seçeneklerini döndürür.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Sayfanın boyutunu alır.

**Returns:**
java.awt.Dimension - Sayfanın boyutu.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Geçerli çizgiyi alır.

**Returns:**
java.awt.Stroke - Mevcut çizgi.
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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Geçerli metin renderleme modunu alır.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Geçerli metin çizgi genişliğini alır.

**Returns:**
float - Mevcut metin çizgi kalınlığı.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Mevcut dönüşümü alır.

**Returns:**
java.awt.geom.AffineTransform - Mevcut dönüşüm.
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


Cihazın kırpmasını başlatır.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Render edilecek sayfa sayısını başlatır.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Cihazın doğrudan RGB modunu, yani RGB'yi kullanıp kullanmadığını gösterir.

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


Boolean özelliğinin değerini alır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | java.lang.String | Özelliğin adı. |

**Returns:**
boolean - Özellik değeri.
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


Sayfa işlenmeden önce cihazın gerekli hazırlığını yapar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | float |  |
| height | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Sayfa işlenmeden önce cihazın gerekli hazırlığını yapar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| başlık | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Cihazı tüm belge için başlangıç durumuna sıfırlar. Çıktı akışını sıfırlamak için kullanılır.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Sayfa için cihazı başlangıç durumuna sıfırla.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Mevcut dönüşüm matrisini döndür. writeTransform(Transform) metodunu çağırır. Pozitif theta açısı ile döndürmek, pozitif x eksenindeki noktaları pozitif y eksenine doğru döndürür.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| theta | double | Döndürülecek açı (radyan cinsinden). |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Geçerli dönüşüm matrisini bir nokta etrafında döndür.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| theta | double | Radyan cinsinden bir dönüş açısı. |
| x | double | Noktanın X koordinatı. |
| y | double | Noktanın Y koordinatı. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Mevcut dönüşüm matrisini ölçeklendirir. writeTransform(Transform) çağrılır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | double | X ekseninde bir ölçek. |
| y | double | Y ekseninde bir ölçek. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Sayfanın geçerli arka planını belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| background | java.awt.Color | Sayfanın arka planı. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Karakter dönüşümünü belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421karakter dönüşümü. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Cihazın kırpmasını belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| clipPath | java.awt.Shape | Bir kırpma yolu. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Ortaya çıkan cihaz çıktısının oluşturucusunu belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| creator | java.lang.String | Bir oluşturucu değeri. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Bir yazı tipini belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | A font. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Saydamlığı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| opacity | float | Bir opaklık. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Bir saydamlık maskesini belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Bir opaklık maskesi. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Bir boyamayı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| boya | java.awt.Paint | A paint. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Meta veriler dahil cihaz özelliklerini belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Cihaz özellikleri. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Renderleme sürecini yönetmek için seçenekleri belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Renderleme sürecini yönetmek için seçenekler. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Sayfanın boyutunu belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Bir çizgiyi belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stroke | java.awt.Stroke | Bir çizgi. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Metin renderleme modunu belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Metin renderleme modu. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Metin çizgi genişliğini belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| textStrokeWidth | float | Metin çizgi genişliği. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Geçerli dönüşümü belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dönüşüm | java.awt.geom.AffineTransform | Bir dönüşüm.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Mevcut dönüşüm matrisini kaydırır. writeTransform(Transform) çağrılır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| shx | double | X ekseninde bir kaydırma. |
| shy | double | Y ekseninde bir kaydırma. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Belge işlenmeye başlamadan önce cihazın gerekli hazırlığını yapar.

### toString() {#toString--}
```
public String toString()
```


Cihaz türünün adını döndürür.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Geçerli dönüşüm matrisini dönüştürür. writeTransform(Transform) metodunu çağırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dönüşüm | java.awt.geom.AffineTransform | Uygulanacak dönüşüm. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Geçerli dönüşüm matrisini çevirir. writeTransform(Transform) metodunu çağırır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | double | X ekseninde çeviri. |
| y | double | Y ekseninde çeviri. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Diğer çok sayfalı cihazdan sayfa parametrelerini günceller.

**Parameters:**
| Parametre | Tür | Açıklama |
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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Bir yorum yazar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yorum | java.lang.String | Yazılacak bir yorum. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Belirtilen font ile dizeyi yazar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Belirtilen yazı tipi. |
| str | java.lang.String | Dize. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| uyarı | java.lang.String |  |

