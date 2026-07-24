---
title: "PageAPI"
second_title: "Aspose.Page for Java Referensi API"
description: "API modifikasi elemen Page."
type: docs
weight: 12
url: /id/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

API modifikasi elemen **Page**.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Menambahkan elemen konten (Canvas, Path, atau Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Menyisipkan elemen (Canvas, Path, atau Glyphs) ke halaman pada posisi indeks. |
| [<T>remove(T element)](#-T-remove-T-) | Menghapus elemen dari halaman. |
| [addCanvas()](#addCanvas--) | Menambahkan kanvas baru ke halaman. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Menambahkan glyphs baru ke halaman. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Menambahkan glyphs baru ke halaman. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Menambahkan entri outline ke dokumen. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Menambahkan path baru ke halaman. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Membuat segmen busur elips stroked baru. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Membuat segmen busur elips baru. |
| [createCanvas()](#createCanvas--) | Membuat kanvas baru. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Membuat warna baru dalam ruang warna scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Membuat warna baru dalam ruang warna scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Membuat warna baru dalam ruang warna sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Membuat warna baru dalam ruang warna sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Membuat warna baru. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Membuat warna baru dalam ruang warna berbasis ICC. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Membuat glyphs baru. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Membuat glyphs baru. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Membuat stop gradien baru. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Membuat stop gradien baru. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Membuat kuas gambar baru. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Membuat kuas gambar baru. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Membuat kuas gradien linear baru. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Membuat kuas gradien linear baru. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Membuat matriks transformasi affine baru. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Membuat path baru. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Membuat figur path terbuka baru. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Membuat figur path baru. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Membuat figur path terbuka baru. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Membuat figur path baru. |
| [createPathGeometry()](#createPathGeometry--) | Membuat geometri path baru. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Membuat geometri jalur baru yang ditentukan dengan bentuk singkat. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Membuat geometri jalur baru dengan daftar gambar jalur yang ditentukan. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Membuat satu set kurva B?zier kubik yang digores. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Membuat satu set kurva B?bezier kubik baru. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Membuat gambar poligonal yang digores baru yang berisi jumlah sembarang vertex individual. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Membuat gambar poligonal baru yang berisi jumlah sembarang vertex individual. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Membuat satu set kurva B?bezier kuadratik yang digores baru dari titik sebelumnya dalam gambar jalur melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Membuat satu set kurva B?bezier kuadratik baru dari titik sebelumnya dalam gambar jalur melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Membuat kuas gradien radial baru. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Membuat kuas gradien radial baru. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Membuat kuas warna solid baru. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Membuat kuas warna solid baru. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Membuat kuas visual baru. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Mengembalikan tinggi halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [getPageCount()](#getPageCount--) | Mengembalikan jumlah halaman dalam dokumen aktif. |
| [getTotalPageCount()](#getTotalPageCount--) | Mengembalikan total jumlah halaman dalam semua dokumen di dalam dokumen XPS. |
| [getUtils()](#getUtils--) | Mendapatkan objek yang menyediakan utilitas di luar API manipulasi XPS formal. |
| [getWidth()](#getWidth--) | Mengembalikan lebar halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Menyisipkan kanvas baru ke halaman pada posisi indeks. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Menyisipkan glyph baru ke halaman pada posisi indeks. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Menyisipkan glyph baru ke halaman pada posisi indeks. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Menyisipkan jalur baru ke halaman pada posisi indeks. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Menghapus elemen pada posisi indeks dari halaman. |
| [setHeight(float value)](#setHeight-float-) | Mengatur tinggi halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [setWidth(float value)](#setWidth-float-) | Mengatur lebar halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Menambahkan elemen konten (Canvas, Path, atau Glyphs)

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| elemen | T | Elemen yang akan ditambahkan. |

**Returns:**
T - Elemen yang ditambahkan.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Menyisipkan elemen (Canvas, Path, atau Glyphs) ke halaman pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana elemen harus disisipkan. |
| elemen | T | Elemen yang akan disisipkan. |

**Returns:**
T - Elemen yang disisipkan.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Menghapus elemen dari halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| elemen | T | Elemen yang akan dihapus. |

**Returns:**
T - Elemen yang dihapus.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Menambahkan kanvas baru ke halaman.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Menambahkan glyphs baru ke halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Sumber font. |
| fontRenderingEmSize | float | Ukuran font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat Y asal glif. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Menambahkan glyphs baru ke halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fontFamily | java.lang.String | Keluarga font. |
| fontRenderingEmSize | float | Ukuran font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Gaya font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat Y asal glif. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Menambahkan entri outline ke dokumen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| deskripsi | java.lang.String | Deskripsi entri. |
| outlineLevel | int | Tingkat outline. |
| targetPageNumber | int | Nomor halaman target. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Menambahkan path baru ke halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Membuat segmen busur elips stroked baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| titik | java.awt.geom.Point2D | Titik akhir dari busur elips. |
| ukuran | java.awt.geom.Dimension2D | Radius x dan y dari busur elips sebagai pasangan x,y. |
| rotationAngle | float | Menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini. |
| isLargeArc | boolean | Menentukan apakah busur digambar dengan penyapuan 180 derajat atau lebih. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Arah di mana busur digambar. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Membuat segmen busur elips baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| titik | java.awt.geom.Point2D | Titik akhir dari busur elips. |
| ukuran | java.awt.geom.Dimension2D | Radius x dan y dari busur elips sebagai pasangan x,y. |
| rotationAngle | float | Menunjukkan bagaimana elips diputar relatif terhadap sistem koordinat saat ini. |
| isLargeArc | boolean | Menentukan apakah busur digambar dengan penyapuan 180 derajat atau lebih. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Arah di mana busur digambar. |
| isStroked | boolean | Menentukan apakah goresan untuk segmen jalur ini digambar. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Membuat kanvas baru.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Membuat warna baru dalam ruang warna berbasis ICC.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | Sumber daya profil ICC. |
| components | float[] | Komponen warna. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Membuat warna baru dalam ruang warna scRGB.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| r | float | Komponen warna merah. |
| g | float | Komponen warna hijau. |
| b | float | Komponen warna biru. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Membuat warna baru dalam ruang warna scRGB.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | float | Komponen warna alfa. |
| r | float | Komponen warna merah. |
| g | float | Komponen warna hijau. |
| b | float | Komponen warna biru. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Membuat warna baru dalam ruang warna sRGB.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| r | int | Komponen warna merah. |
| g | int | Komponen warna hijau. |
| b | int | Komponen warna biru. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Membuat warna baru dalam ruang warna sRGB.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | int | Komponen warna alfa. |
| r | int | Komponen warna merah. |
| g | int | Komponen warna hijau. |
| b | int | Komponen warna biru. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Membuat warna baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| color | java.awt.Color | Instansi warna asli untuk warna RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Membuat warna baru dalam ruang warna berbasis ICC.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | java.lang.String | Jalur ke profil ICC. |
| components | float[] | Komponen warna. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Membuat glyphs baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Sumber font. |
| fontRenderingEmSize | float | Ukuran font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat Y asal glif. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Membuat glyphs baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fontFamily | java.lang.String | Keluarga font. |
| fontRenderingEmSize | float | Ukuran font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Gaya font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat Y asal glif. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Membuat stop gradien baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Warna henti gradien. |
| offset | float | Offset gradien. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Membuat stop gradien baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| color | java.awt.Color | Warna henti gradien. |
| offset | float | Offset gradien. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Membuat kuas gambar baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Sebuah sumber gambar. |
| viewbox | java.awt.geom.Rectangle2D | Posisi dan dimensi konten sumber kuas. |
| viewport | java.awt.geom.Rectangle2D | Wilayah dalam ruang koordinat kontainer dari ubin kuas utama yang (mungkin berulang kali) diterapkan untuk mengisi wilayah tempat kuas diterapkan |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Membuat kuas gambar baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imagePath | java.lang.String | Jalur ke gambar yang akan digunakan sebagai ubin kuas. |
| viewbox | java.awt.geom.Rectangle2D | Posisi dan dimensi konten sumber kuas. |
| viewport | java.awt.geom.Rectangle2D | Wilayah dalam ruang koordinat kontainer dari ubin kuas utama yang (mungkin berulang kali) diterapkan untuk mengisi wilayah tempat kuas diterapkan |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Membuat kuas gradien linear baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Titik awal gradien linier. |
| endPoint | java.awt.geom.Point2D | Titik akhir gradien linier. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Membuat kuas gradien linear baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Daftar titik henti gradien. |
| startPoint | java.awt.geom.Point2D | Titik awal gradien linier. |
| endPoint | java.awt.geom.Point2D | Titik akhir gradien linier. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Membuat matriks transformasi affine baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| m11 | float | Elemen 11. |
| m12 | float | Elemen 12. |
| m21 | float | Elemen 21. |
| m22 | float | Elemen 22. |
| m31 | float | Element 31. |
| m32 | float | Element 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Membuat path baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Membuat figur path terbuka baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Titik awal untuk segmen pertama dari gambar jalur. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Membuat figur path baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Titik awal untuk segmen pertama dari gambar jalur. |
| isClosed | boolean | Menentukan apakah jalur ditutup. Jika diatur ke true, goresan digambar "closed", yaitu titik terakhir pada segmen terakhir dari gambar jalur dihubungkan dengan titik yang ditentukan dalam atribut StartPoint, jika tidak goresan digambar "open", dan titik terakhir tidak terhubung ke titik awal. Hanya berlaku jika gambar jalur digunakan dalam elemen Path yang menentukan goresan. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Membuat figur path terbuka baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Titik awal untuk segmen pertama dari gambar jalur. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Daftar segmen jalur. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Membuat figur path baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Titik awal untuk segmen pertama dari gambar jalur. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Daftar segmen jalur. |
| isClosed | boolean | Menentukan apakah jalur ditutup. Jika diatur ke true, goresan digambar "closed", yaitu titik terakhir pada segmen terakhir dari gambar jalur dihubungkan dengan titik yang ditentukan dalam atribut StartPoint, jika tidak goresan digambar "open", dan titik terakhir tidak terhubung ke titik awal. Hanya berlaku jika gambar jalur digunakan dalam elemen Path yang menentukan goresan. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Membuat geometri path baru.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Membuat geometri jalur baru yang ditentukan dengan bentuk singkat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Bentuk singkat dari geometri jalur. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Membuat geometri jalur baru dengan daftar gambar jalur yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Daftar gambar jalur. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Membuat satu set kurva B?zier kubik yang digores.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Titik kontrol untuk beberapa segmen B?bezier. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Membuat satu set kurva B?bezier kubik baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Titik kontrol untuk beberapa segmen B?bezier. |
| isStroked | boolean | Menentukan apakah goresan untuk segmen jalur ini digambar. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Membuat gambar poligonal yang digores baru yang berisi jumlah sembarang vertex individual.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Sekumpulan koordinat untuk beberapa segmen yang mendefinisikan segmen poly line. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Membuat gambar poligonal baru yang berisi jumlah sembarang vertex individual.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Sekumpulan koordinat untuk beberapa segmen yang mendefinisikan segmen poly line. |
| isStroked | boolean | Menentukan apakah goresan untuk segmen jalur ini digambar. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Membuat satu set kurva B?bezier kuadratik yang digores baru dari titik sebelumnya dalam gambar jalur melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Titik kontrol untuk beberapa segmen kuadratik B?bezier. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Membuat satu set kurva B?bezier kuadratik baru dari titik sebelumnya dalam gambar jalur melalui sekumpulan vertex, menggunakan titik kontrol yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Titik kontrol untuk beberapa segmen kuadratik B?bezier. |
| isStroked | boolean | Menentukan apakah goresan untuk segmen jalur ini digambar. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Membuat kuas gradien radial baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Titik pusat gradien radial (yaitu, pusat elips). |
| gradientOrigin | java.awt.geom.Point2D | Titik asal gradien radial. |
| radiusX | float | Radius pada dimensi x dari elips yang mendefinisikan gradien radial. |
| radiusY | float | Radius pada dimensi y dari elips yang mendefinisikan gradien radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Membuat kuas gradien radial baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Daftar titik henti gradien. |
| center | java.awt.geom.Point2D | Titik pusat gradien radial (yaitu, pusat elips). |
| gradientOrigin | java.awt.geom.Point2D | Titik asal gradien radial. |
| radiusX | float | Radius pada dimensi x dari elips yang mendefinisikan gradien radial. |
| radiusY | float | Radius pada dimensi y dari elips yang mendefinisikan gradien radial. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Membuat kuas warna solid baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Warna untuk elemen yang diisi. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Membuat kuas warna solid baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| color | java.awt.Color | Warna untuk elemen yang diisi. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Membuat kuas visual baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Elemen XPS (Canvas, Path, atau Glyphs) untuk properti Visual dari visual brush. |
| viewbox | java.awt.geom.Rectangle2D | Posisi dan dimensi konten sumber kuas. |
| viewport | java.awt.geom.Rectangle2D | Wilayah dalam ruang koordinat kontainer dari ubin kuas utama yang (mungkin berulang kali) diterapkan untuk mengisi wilayah tempat kuas diterapkan |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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


Mengembalikan tinggi halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif.

**Returns:**
float - Tinggi halaman.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Mengembalikan jumlah halaman dalam dokumen aktif.

**Returns:**
int - Jumlah halaman dalam dokumen aktif.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Mengembalikan total jumlah halaman dalam semua dokumen di dalam dokumen XPS.

**Returns:**
int - Total jumlah halaman dalam semua dokumen di dalam dokumen XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Mendapatkan objek yang menyediakan utilitas di luar API manipulasi XPS formal.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Mengembalikan lebar halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif.

**Returns:**
float - Lebar halaman.
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


Menyisipkan kanvas baru ke halaman pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana kanvas baru harus disisipkan. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Menyisipkan glyph baru ke halaman pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana glyph baru harus disisipkan. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Sumber font. |
| fontSize | float | Ukuran font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat Y asal glif. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Menyisipkan glyph baru ke halaman pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana glyph baru harus disisipkan. |
| fontFamily | java.lang.String | Keluarga font. |
| fontSize | float | Ukuran font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Gaya font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat Y asal glif. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Menyisipkan jalur baru ke halaman pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana jalur baru harus disisipkan. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

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


Menghapus elemen pada posisi indeks dari halaman.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana elemen harus dihapus. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Mengatur tinggi halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Tinggi halaman. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Mengatur lebar halaman, dinyatakan sebagai angka real dalam satuan ruang koordinat efektif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Lebar halaman. |

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

