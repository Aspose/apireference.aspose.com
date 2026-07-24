---
title: "TextDevice"
second_title: "Aspose.Page for Java Referensi API"
description: 
type: docs
weight: 13
url: /id/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Versi perangkat saat ini. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Menggambar jalur. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Menggambar busur. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Menggambar segmen garis. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Menggambar oval. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Menggambar poligon. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Menggambar poligon. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Menggambar polilin. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Menggambar polilin. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Menggambar persegi panjang. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Menggambar persegi panjang bulat. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Mengisi jalur. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Mengisi busur. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Mengisi oval. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Mengisi poligon. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Mengisi poligon. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Mengisi persegi panjang. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Menggambar persegi panjang bulat. |
| [getBackground()](#getBackground--) | Mendapatkan latar belakang saat ini dari halaman. |
| [getCharTM()](#getCharTM--) | Mendapatkan transformasi karakter saat ini. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Mendapatkan pembuat output perangkat yang dihasilkan. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Mendapatkan font saat ini. |
| [getOpacity()](#getOpacity--) | Mendapatkan opasitas saat ini. |
| [getOpacityMask()](#getOpacityMask--) | Mendapatkan masker opasitas saat ini. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Mendapatkan cat saat ini. |
| [getProperties()](#getProperties--) | Mendapatkan properti perangkat termasuk metadata. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Mendapatkan nilai properti string. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Mendapatkan nilai properti warna. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Mendapatkan nilai properti double. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Mendapatkan nilai properti integer. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Mendapatkan nilai properti margin. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Mendapatkan nilai properti matriks. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Mendapatkan nilai properti persegi panjang. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Mendapatkan nilai properti ukuran. |
| [getSaveOptions()](#getSaveOptions--) | Mengembalikan opsi penyimpanan. |
| [getSize()](#getSize--) | Mendapatkan ukuran halaman. |
| [getStroke()](#getStroke--) | Mendapatkan goresan saat ini. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Mendapatkan mode render teks saat ini. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Mendapatkan lebar goresan teks saat ini. |
| [getTransform()](#getTransform--) | Mendapatkan transformasi saat ini. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Menginisialisasi klip perangkat. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Mendapatkan nilai properti boolean. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Memutar matriks transformasi saat ini. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Memutar matriks transformasi saat ini sekitar suatu titik. |
| [scale(double x, double y)](#scale-double-double-) | Menskalakan matriks transformasi saat ini. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Menentukan latar belakang halaman saat ini. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Menentukan transformasi karakter. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Menentukan klip perangkat. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Menentukan pembuat output perangkat yang dihasilkan. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Menentukan font. |
| [setOpacity(float opacity)](#setOpacity-float-) | Menentukan opasitas. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Menentukan masker opasitas. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Menentukan cat. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Menentukan properti perangkat termasuk metadata. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Menentukan opsi untuk mengelola proses render. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Menentukan goresan. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Menentukan mode render teks. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Menentukan lebar goresan teks. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Menentukan transformasi saat ini. |
| [shear(double shx, double shy)](#shear-double-double-) | Menerapkan geseran pada matriks transformasi saat ini. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Mentransformasi matriks transformasi saat ini. |
| [translate(double x, double y)](#translate-double-double-) | Menerapkan translasi pada matriks transformasi saat ini. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Menulis komentar. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Menulis string dengan font yang ditentukan. |
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


Versi perangkat saat ini.

### closePage() {#closePage--}
```
public void closePage()
```


Melakukan persiapan yang diperlukan pada perangkat setelah halaman dirender.

### create() {#create--}
```
public Device create()
```


Membuat salinan perangkat ini.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Membuang perangkat.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Menggambar jalur.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | java.awt.Shape | Jalur yang akan digambar. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Menggambar busur.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X pusat busur. |
| y | float | Koordinat Y pusat busur. |
| lebar | float | Lebar persegi panjang yang mengelilingi. |
| tinggi | float | Tinggi persegi panjang yang mengelilingi. |
| startAngle | float | Sudut awal busur. |
| arcAngle | float | Sudut busur. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Menggambar gambar dengan transformasi dan latar belakang yang ditetapkan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Gambar yang akan digambar. |
| transform | java.awt.geom.AffineTransform | Transformasi. |
| bkg | java.awt.Color | Warna latar belakang. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Menggambar segmen garis.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x1 | float | Koordinat X awal segmen. |
| y1 | float | Koordinat Y awal segmen. |
| x2 | float | Koordinat X akhir segmen. |
| y2 | float | Koordinat Y akhir segmen. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Menggambar oval.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X pusat oval. |
| y | float | Koordinat Y dari pusat oval. |
| lebar | float | Lebar persegi panjang yang mengelilingi. |
| tinggi | float | Tinggi persegi panjang yang mengelilingi. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Menggambar poligon.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xPoints | float[] | Koordinat X dari titik-titik. |
| yPoints | float[] | Koordinat Y dari titik-titik. |
| nPoints | int | Jumlah titik. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Menggambar poligon.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xPoints | int[] | Koordinat X dari titik-titik. |
| yPoints | int[] | Koordinat Y dari titik-titik. |
| nPoints | int | Jumlah titik. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Menggambar polilin.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xPoints | float[] | Koordinat X dari titik-titik. |
| yPoints | float[] | Koordinat Y dari titik-titik. |
| nPoints | int | Jumlah titik. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Menggambar polilin.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xPoints | int[] | Koordinat X dari titik-titik. |
| yPoints | int[] | Koordinat Y dari titik-titik. |
| nPoints | int | Jumlah titik. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Menggambar persegi panjang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X dari sudut kiri atas persegi panjang. |
| y | float | Koordinat Y dari sudut kiri atas persegi panjang. |
| lebar | float | Lebar persegi panjang. |
| tinggi | float | Tinggi persegi panjang. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Menggambar persegi panjang bulat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X dari sudut kiri atas persegi panjang. |
| y | float | Koordinat Y dari sudut kiri atas persegi panjang. |
| lebar | float | Lebar persegi panjang. |
| tinggi | float | Tinggi persegi panjang. |
| arcWidth | float | Lebar persegi panjang yang mengelilingi busur yang membulatkan sudut persegi panjang. |
| arcHeight | float | Tinggi persegi panjang yang mengelilingi busur yang membulatkan sudut persegi panjang. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Menggambar string pada titik yang diberikan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Melakukan persiapan yang diperlukan pada perangkat setelah dokumen dirender.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Mengisi jalur.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | java.awt.Shape | Jalur yang akan diisi. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Mengisi busur.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X pusat busur. |
| y | float | Koordinat Y pusat busur. |
| lebar | float | Lebar persegi panjang yang mengelilingi. |
| tinggi | float | Tinggi persegi panjang yang mengelilingi. |
| startAngle | float | Sudut awal busur. |
| arcAngle | float | Sudut busur. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Mengisi oval.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X pusat oval. |
| y | float | Koordinat Y dari pusat oval. |
| lebar | float | Lebar persegi panjang yang mengelilingi. |
| tinggi | float | Tinggi persegi panjang yang mengelilingi. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Mengisi poligon.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xPoints | float[] | Koordinat X dari titik-titik. |
| yPoints | float[] | Koordinat Y dari titik-titik. |
| nPoints | int | Jumlah titik. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Mengisi poligon.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xPoints | int[] | Koordinat X dari titik-titik. |
| yPoints | int[] | Koordinat Y dari titik-titik. |
| nPoints | int | Jumlah titik. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Mengisi persegi panjang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X dari sudut kiri atas persegi panjang. |
| y | float | Koordinat Y dari sudut kiri atas persegi panjang. |
| lebar | float | Lebar persegi panjang. |
| tinggi | float | Tinggi persegi panjang. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Menggambar persegi panjang bulat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Koordinat X dari sudut kiri atas persegi panjang. |
| y | float | Koordinat Y dari sudut kiri atas persegi panjang. |
| lebar | float | Lebar persegi panjang. |
| tinggi | float | Tinggi persegi panjang. |
| arcWidth | float | Lebar persegi panjang yang mengelilingi busur yang membulatkan sudut persegi panjang. |
| arcHeight | float | Tinggi persegi panjang yang mengelilingi busur yang membulatkan sudut persegi panjang. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Mendapatkan latar belakang saat ini dari halaman.

**Returns:**
java.awt.Color - Latar belakang saat ini dari halaman
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Mendapatkan transformasi karakter saat ini.

**Returns:**
java.awt.geom.AffineTransform - Transformasi karakter saat ini.
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


Mendapatkan pembuat output perangkat yang dihasilkan.

**Returns:**
java.lang.String - Nilai pembuat.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Mendapatkan nomor halaman saat ini.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Mendapatkan font saat ini.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Mendapatkan opasitas saat ini.

**Returns:**
float - Opasitas saat ini.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Mendapatkan masker opasitas saat ini.

**Returns:**
java.awt.Paint - Masker opasitas saat ini.
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


Mendapatkan cat saat ini.

**Returns:**
java.awt.Paint - Cat warna saat ini.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Mendapatkan properti perangkat termasuk metadata.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Mendapatkan nilai properti string.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
java.lang.String - Nilai properti.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Mendapatkan nilai properti warna.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
java.awt.Color - Nilai properti.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Mendapatkan nilai properti double.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
double - Nilai properti.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Mendapatkan nilai properti integer.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
int - Nilai properti.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Mendapatkan nilai properti margin.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
java.awt.Insets - Nilai properti.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Mendapatkan nilai properti matriks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
java.awt.geom.AffineTransform - Nilai properti.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Mendapatkan nilai properti persegi panjang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
java.awt.Rectangle - Nilai properti.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Mendapatkan nilai properti ukuran.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
java.awt.Dimension - Nilai properti.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Mengembalikan opsi penyimpanan.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Mendapatkan ukuran halaman.

**Returns:**
java.awt.Dimension - Ukuran halaman.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Mendapatkan goresan saat ini.

**Returns:**
java.awt.Stroke - Garis stroke saat ini.
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
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Mendapatkan mode render teks saat ini.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Mendapatkan lebar goresan teks saat ini.

**Returns:**
float - Lebar goresan teks saat ini.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Mendapatkan transformasi saat ini.

**Returns:**
java.awt.geom.AffineTransform - Transformasi saat ini.
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


Menginisialisasi klip perangkat.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Menginisialisasi jumlah halaman yang akan dirender.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Menunjukkan apakah perangkat menggunakan mode RGB langsung, yaitu RGB.

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


Mendapatkan nilai properti boolean.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kunci | java.lang.String | Nama properti. |

**Returns:**
boolean - Nilai properti.
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


Melakukan persiapan yang diperlukan pada perangkat sebelum merender halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float |  |
| tinggi | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Melakukan persiapan yang diperlukan pada perangkat sebelum merender halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| judul | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Atur ulang perangkat ke keadaan awal untuk seluruh dokumen. Digunakan untuk mengatur ulang aliran keluaran.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Atur ulang perangkat ke keadaan awal untuk sebuah halaman.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Putar matriks transformasi saat ini. Memanggil writeTransform(Transform). Memutar dengan sudut theta positif memutar titik pada sumbu x positif menuju sumbu y positif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| theta | double | Sudut dalam radian yang akan diputar. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Memutar matriks transformasi saat ini sekitar suatu titik.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| theta | double | Sebuah sudut rotasi dalam radian. |
| x | double | Koordinat X dari titik. |
| y | double | Koordinat Y dari titik. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Menskalakan matriks transformasi saat ini. Memanggil writeTransform(Transform).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | double | Skala pada sumbu X. |
| y | double | Skala pada sumbu Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Menentukan latar belakang halaman saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| latar belakang | java.awt.Color | Latar belakang halaman. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Menentukan transformasi karakter.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters transformasi. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Menentukan klip perangkat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| clipPath | java.awt.Shape | Jalur pemotongan. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Menentukan pembuat output perangkat yang dihasilkan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pencipta | java.lang.String | Nilai pencipta. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Menentukan font.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Sebuah font. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Menentukan opasitas.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| opasitas | float | Opasitas. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Menentukan masker opasitas.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Masker opasitas. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Menentukan cat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| paint | java.awt.Paint | Cat. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Menentukan properti perangkat termasuk metadata.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Properti perangkat. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Menentukan opsi untuk mengelola proses render.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opsi untuk mengelola proses rendering. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Menentukan ukuran halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Menentukan goresan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stroke | java.awt.Stroke | Garis. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Menentukan mode render teks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Mode rendering teks. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Menentukan lebar goresan teks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| textStrokeWidth | float | Lebar garis teks. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Menentukan transformasi saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Sebuah transformasi.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Menerapkan shear pada matriks transformasi saat ini. Memanggil writeTransform(Transform).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| shx | double | Shear pada sumbu X. |
| shy | double | Shear pada sumbu Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Melakukan persiapan yang diperlukan pada perangkat sebelum memulai rendering dokumen.

### toString() {#toString--}
```
public String toString()
```


Mengembalikan nama tipe perangkat.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Mentransformasi matriks transformasi saat ini. Memanggil writeTransform(Transform).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transformasi yang akan diterapkan. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Menerapkan translasi pada matriks transformasi saat ini. Memanggil writeTransform(Transform).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | double | Translasi pada sumbu X. |
| y | double | Translasi pada sumbu Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Memperbarui parameter halaman dari perangkat multi-halaman lainnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
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
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Menulis komentar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| komentar | java.lang.String | Komentar yang akan ditulis. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Menulis string dengan font yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Font yang ditentukan. |
| str | java.lang.String | String tersebut. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| peringatan | java.lang.String |  |

