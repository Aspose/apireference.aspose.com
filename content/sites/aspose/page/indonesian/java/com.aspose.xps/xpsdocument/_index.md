---
title: "XpsDocument"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi entitas utama dokumen XPS yang menyediakan metode manipulasi untuk setiap elemen XPS."
type: docs
weight: 19
url: /id/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Kelas yang mengenkapsulasi entitas utama dokumen XPS yang menyediakan metode manipulasi untuk setiap elemen XPS.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Membuat dokumen XPS kosong dengan ukuran halaman default. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Membuka dokumen XPS yang ada yang terletak di  path . |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Memuat dokumen yang ada yang disimpan dalam  stream  sebagai dokumen XPS. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Menambahkan elemen konten (Canvas, Path, atau Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Menyisipkan elemen (Canvas, Path, atau Glyphs) ke halaman aktif pada posisi  index . |
| [<T>remove(T element)](#-T-remove-T-) | Menghapus elemen dari halaman aktif. |
| [addCanvas()](#addCanvas--) | Menambahkan kanvas baru ke halaman aktif. |
| [addDocument()](#addDocument--) | Menambahkan dokumen kosong dengan ukuran halaman default dan memilih dokumen yang ditambahkan sebagai aktif. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Menambahkan dokumen kosong dengan ukuran halaman default. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Menambahkan dokumen kosong dengan dimensi halaman pertama  width  dan  height  serta memilih dokumen yang ditambahkan sebagai aktif. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Menambahkan dokumen kosong dengan dimensi halaman pertama  width  dan  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Menambahkan glyph baru ke halaman aktif. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Menambahkan glyph baru ke halaman aktif. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Menambahkan entri outline ke dokumen. |
| [addPage()](#addPage--) | Menambahkan halaman kosong ke dokumen dengan ukuran halaman default. |
| [addPage(boolean activate)](#addPage-boolean-) | Menambahkan halaman kosong ke dokumen dengan ukuran halaman default. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Menambahkan halaman ke dokumen dan memilih halaman yang ditambahkan sebagai aktif. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Menambahkan halaman ke dokumen. |
| [addPage(float width, float height)](#addPage-float-float-) | Menambahkan halaman kosong ke dokumen dengan lebar  width  dan tinggi  height  yang ditentukan. |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Menambahkan halaman kosong ke dokumen dengan lebar  width  dan tinggi  height  yang ditentukan. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Menambahkan jalur baru ke halaman aktif. |
| [close()](#close--) | Membuang instance. |
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
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Membuat sumber daya font TrueType baru dari stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Membuat sumber daya font TrueType baru. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Membuat glyphs baru. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Membuat glyphs baru. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Membuat stop gradien baru. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Membuat stop gradien baru. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Membuat sumber daya profil ICC baru dari  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Membuat sumber daya profil ICC baru dari file profil ICC yang terletak di  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Membuat sumber daya gambar baru dari  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Membuat sumber daya gambar baru dari file gambar yang terletak di  imagePath . |
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
| [getActiveDocument()](#getActiveDocument--) | Mengembalikan nomor dokumen aktif. |
| [getActivePage()](#getActivePage--) | Mengembalikan nomor halaman aktif dalam dokumen aktif. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Mengembalikan jumlah dokumen di dalam paket XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Mendapatkan tiket cetak dokumen yang diindeks oleh  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Mengembalikan tiket cetak pekerjaan dokumen. |
| [getPage()](#getPage--) | Mengembalikan instance  XpsPage  untuk halaman aktif. |
| [getPageCount()](#getPageCount--) | Mengembalikan jumlah halaman dalam dokumen aktif. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Mendapatkan tiket cetak halaman yang diindeks oleh  pageIndex  dalam dokumen yang diindeks oleh  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Mengembalikan total jumlah halaman dalam semua dokumen di dalam dokumen XPS. |
| [getUtils()](#getUtils--) | Mendapatkan objek yang menyediakan utilitas di luar API manipulasi XPS formal. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Menyisipkan kanvas baru ke halaman aktif pada posisi  index . |
| [insertDocument(int index)](#insertDocument-int-) | Menyisipkan dokumen kosong dengan ukuran halaman default pada posisi  index  dan memilih dokumen yang disisipkan sebagai aktif. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Menyisipkan dokumen kosong dengan ukuran halaman default pada posisi  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Menyisipkan dokumen kosong dengan dimensi halaman pertama  width  dan  height  pada posisi  index  dan memilih dokumen yang disisipkan sebagai aktif. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Menyisipkan dokumen kosong dengan dimensi halaman pertama  width  dan  height  pada  index  posisi. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Menyisipkan glyph baru ke halaman aktif pada  index  posisi. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Menyisipkan glyph baru ke halaman aktif pada  index  posisi. |
| [insertPage(int index)](#insertPage-int-) | Menyisipkan halaman kosong ke dokumen dengan ukuran halaman default pada  index  posisi dan pilih halaman yang disisipkan sebagai aktif. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Menyisipkan halaman kosong ke dokumen dengan ukuran halaman default pada  index  posisi. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Menyisipkan halaman ke dokumen pada  index  posisi dan pilih halaman yang disisipkan sebagai aktif. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Menyisipkan halaman ke dokumen pada  index  posisi. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Menyisipkan halaman kosong ke dokumen dengan  width  dan  height  yang ditentukan pada  index  posisi dan pilih halaman yang disisipkan sebagai aktif. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Menyisipkan halaman kosong ke dokumen dengan  width  dan  height  yang ditentukan pada  index  posisi. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Menyisipkan path baru ke halaman aktif pada  index  posisi. |
| [isLicensed()](#isLicensed--) | Menunjukkan apakah lisensi produk Aspose.Page untuk Java diakses dan valid. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Menggabungkan beberapa file XPS menjadi satu dokumen XPS. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Menggabungkan beberapa file XPS menjadi satu dokumen XPS. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Menggabungkan dokumen XPS ke PDF menggunakan instance  Device . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Menggabungkan dokumen XPS ke PDF menggunakan instance  Device . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Menghapus elemen pada  index  posisi dari halaman aktif. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Menghapus dokumen pada  index  posisi. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Menghapus halaman dari dokumen. |
| [removePageAt(int index)](#removePageAt-int-) | Menghapus halaman dari dokumen pada  index  posisi. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Menyimpan dokumen menggunakan instance  Device . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Menyimpan dokumen XPS ke aliran. |
| [save(String path)](#save-java.lang.String-) | Menyimpan dokumen XPS ke file XPS yang terletak di  path . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Menyimpan dokumen ke file gambar. Direktori output dan nama file akan sama seperti dari file XPS input. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Menyimpan dokumen ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Menyimpan dokumen dalam format gambar bitmap sebagai array byte. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Menyimpan dokumen dalam format PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Menyimpan dokumen dalam format PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Menyimpan dokumen dalam format PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Menyimpan dokumen dalam format PostSscript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Memilih dokumen aktif untuk diedit. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Memilih halaman dokumen aktif untuk diedit. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Menautkan  printTicket  ke dokumen yang diindeks oleh  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Mengatur tiket cetak pekerjaan dokumen. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Menautkan  printTicket  ke halaman yang diindeks oleh  pageIndex  dalam dokumen yang diindeks oleh  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Membuat dokumen XPS kosong dengan ukuran halaman default.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Membuka dokumen XPS yang ada yang terletak di  path .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | java.lang.String | Lokasi dokumen. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Memuat dokumen yang ada yang disimpan dalam  stream  sebagai dokumen XPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.InputStream | Aliran dokumen. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Opsi pemuatan dokumen. |

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


Menyisipkan elemen (Canvas, Path, atau Glyphs) ke halaman aktif pada posisi  index .

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


Menghapus elemen dari halaman aktif.

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


Menambahkan kanvas baru ke halaman aktif.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Menambahkan dokumen kosong dengan ukuran halaman default dan memilih dokumen yang ditambahkan sebagai aktif.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Menambahkan dokumen kosong dengan ukuran halaman default.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aktifkan | boolean | Bendera yang menunjukkan apakah dokumen yang ditambahkan dipilih sebagai aktif. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Menambahkan dokumen kosong dengan dimensi halaman pertama  width  dan  height  serta memilih dokumen yang ditambahkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | Lebar halaman pertama. |
| tinggi | float | Tinggi halaman pertama. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Menambahkan dokumen kosong dengan dimensi halaman pertama  width  dan  height .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | Lebar halaman pertama. |
| tinggi | float | Tinggi halaman pertama. |
| aktifkan | boolean | Bendera yang menunjukkan apakah dokumen yang ditambahkan dipilih sebagai aktif. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Menambahkan glyph baru ke halaman aktif.

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


Menambahkan glyph baru ke halaman aktif.

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
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Menambahkan entri outline ke dokumen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| deskripsi | java.lang.String | Deskripsi entri. |
| outlineLevel | int | Tingkat outline. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Target entri. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Menambahkan halaman kosong ke dokumen dengan ukuran halaman default.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Menambahkan halaman kosong ke dokumen dengan ukuran halaman default.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aktifkan | boolean | Bendera yang menunjukkan apakah halaman yang ditambahkan dipilih sebagai aktif. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Menambahkan halaman ke dokumen dan memilih halaman yang ditambahkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Halaman yang akan ditambahkan. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Menambahkan halaman ke dokumen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Halaman yang akan ditambahkan. |
| aktifkan | boolean | Bendera yang menunjukkan apakah halaman yang ditambahkan dipilih sebagai aktif. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Menambahkan halaman kosong ke dokumen dengan lebar  width  dan tinggi  height  yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | Lebar halaman baru. |
| tinggi | float | Tinggi halaman baru. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Menambahkan halaman kosong ke dokumen dengan lebar  width  dan tinggi  height  yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | Lebar halaman baru. |
| tinggi | float | Tinggi halaman baru. |
| aktifkan | boolean | Bendera yang menunjukkan apakah halaman yang ditambahkan dipilih sebagai aktif. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Menambahkan jalur baru ke halaman aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Membuang instance.

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
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Membuat sumber daya font TrueType baru dari stream.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.InputStream | Aliran yang berisi profil ICC yang akan diambil sebagai sumber daya. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Membuat sumber daya font TrueType baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fontFamily | java.lang.String | Keluarga font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Gaya font. Lihat konstanta kelas  XpsFont  (yang merupakan bit flag) untuk nilai yang tersedia untuk digabungkan. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
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
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Membuat sumber daya profil ICC baru dari  stream .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.InputStream | Aliran yang berisi profil ICC yang akan diambil sebagai sumber daya. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Membuat sumber daya profil ICC baru dari file profil ICC yang terletak di  iccProfilePath .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Jalur ke profil ICC yang akan diambil sebagai sumber daya. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Membuat sumber daya gambar baru dari  stream .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.InputStream | Aliran yang berisi gambar yang akan diambil sebagai sumber daya. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Membuat sumber daya gambar baru dari file gambar yang terletak di  imagePath .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imagePath | java.lang.String | Jalur ke gambar yang akan diambil sebagai sumber daya. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
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
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Elemen XPS (Canvas, Path, atau Glyphs) untuk properti Visual dari kuas visual. |
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
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Mengembalikan nomor dokumen aktif.

**Returns:**
int - Nilai int.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Mengembalikan nomor halaman aktif dalam dokumen aktif.

**Returns:**
int - Nilai int.
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


Mengembalikan jumlah dokumen di dalam paket XPS.

**Returns:**
int - Jumlah dokumen di dalam paket XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Mendapatkan tiket cetak dokumen yang diindeks oleh  documentIndex .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| documentIndex | int | Indeks dokumen yang tiket cetaknya akan dikembalikan. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Mengembalikan tiket cetak pekerjaan dokumen.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Mengembalikan instance  XpsPage  untuk halaman aktif.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Mengembalikan jumlah halaman dalam dokumen aktif.

**Returns:**
int - Jumlah halaman dalam dokumen aktif.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Mendapatkan tiket cetak halaman yang diindeks oleh  pageIndex  dalam dokumen yang diindeks oleh  documentIndex .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| documentIndex | int | Indeks dokumen. |
| pageIndex | int | Indeks halaman yang tiket cetaknya akan dikembalikan. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
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


Menyisipkan kanvas baru ke halaman aktif pada posisi  index .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana kanvas baru harus disisipkan. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Menyisipkan dokumen kosong dengan ukuran halaman default pada posisi  index  dan memilih dokumen yang disisipkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana dokumen harus disisipkan. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Menyisipkan dokumen kosong dengan ukuran halaman default pada posisi  index .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana dokumen harus disisipkan. |
| aktifkan | boolean | Bendera yang menunjukkan apakah dokumen yang disisipkan dipilih sebagai aktif. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Menyisipkan dokumen kosong dengan dimensi halaman pertama  width  dan  height  pada posisi  index  dan memilih dokumen yang disisipkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana dokumen harus disisipkan. |
| lebar | float | Lebar halaman pertama. |
| tinggi | float | Tinggi halaman pertama. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Menyisipkan dokumen kosong dengan dimensi halaman pertama  width  dan  height  pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana dokumen harus disisipkan. |
| lebar | float | Lebar halaman pertama. |
| tinggi | float | Tinggi halaman pertama. |
| aktifkan | boolean | Bendera yang menunjukkan apakah dokumen yang disisipkan dipilih sebagai aktif. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Menyisipkan glyph baru ke halaman aktif pada  index  posisi.

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


Menyisipkan glyph baru ke halaman aktif pada  index  posisi.

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
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Menyisipkan halaman kosong ke dokumen dengan ukuran halaman default pada  index  posisi dan pilih halaman yang disisipkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus disisipkan. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Menyisipkan halaman kosong ke dokumen dengan ukuran halaman default pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus disisipkan. |
| aktifkan | boolean | Bendera yang menunjukkan apakah halaman yang disisipkan dipilih sebagai aktif. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Menyisipkan halaman ke dokumen pada  index  posisi dan pilih halaman yang disisipkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus ditambahkan. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Halaman yang akan disisipkan. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Menyisipkan halaman ke dokumen pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus ditambahkan. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Halaman yang akan disisipkan. |
| aktifkan | boolean | Bendera yang menunjukkan apakah halaman yang disisipkan dipilih sebagai aktif. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Menyisipkan halaman kosong ke dokumen dengan  width  dan  height  yang ditentukan pada  index  posisi dan pilih halaman yang disisipkan sebagai aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus disisipkan. |
| lebar | float | Lebar halaman baru. |
| tinggi | float | Tinggi halaman baru. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Menyisipkan halaman kosong ke dokumen dengan  width  dan  height  yang ditentukan pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus disisipkan. |
| lebar | float | Lebar halaman baru. |
| tinggi | float | Tinggi halaman baru. |
| aktifkan | boolean | Bendera yang menunjukkan apakah halaman yang disisipkan dipilih sebagai aktif. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Menyisipkan path baru ke halaman aktif pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana jalur baru harus disisipkan. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Menunjukkan apakah lisensi produk Aspose.Page untuk Java diakses dan valid.

**Returns:**
boolean - nilai boolean
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Menggabungkan beberapa file XPS menjadi satu dokumen XPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File XPS untuk digabungkan dengan dokumen ini. |
| outStream | java.io.OutputStream | Aliran keluaran tempat menyimpan dokumen XPS yang digabungkan. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Menggabungkan beberapa file XPS menjadi satu dokumen XPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File XPS untuk digabungkan dengan dokumen ini. |
| outXpsFilePath | java.lang.String | Jalur file XPS keluaran. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Menggabungkan dokumen XPS ke PDF menggunakan instance  Device .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Jalur file PDF keluaran. |
| filesForMerge | java.lang.String[] | File XPS untuk digabungkan dengan dokumen ini ke perangkat keluaran. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opsi penyimpanan dokumen. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Menggabungkan dokumen XPS ke PDF menggunakan instance  Device .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File XPS untuk digabungkan dengan dokumen ini ke perangkat keluaran. |
| pdfStream | java.io.OutputStream | Aliran keluaran untuk menulis PDF yang dihasilkan. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opsi penyimpanan dokumen. |

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


Menghapus elemen pada  index  posisi dari halaman aktif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana elemen harus dihapus. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Menghapus dokumen pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana dokumen harus dihapus. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Menghapus halaman dari dokumen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Halaman yang akan dihapus. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Menghapus halaman dari dokumen pada  index  posisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana halaman harus dihapus. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Menyimpan dokumen menggunakan instance  Device .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Instansi Device. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opsi penyimpanan dokumen. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Menyimpan dokumen XPS ke aliran.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.OutputStream | Aliran dokumen XPS yang akan disimpan ke dalam. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Menyimpan dokumen XPS ke file XPS yang terletak di  path .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | java.lang.String | Lokasi dokumen. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Menyimpan dokumen ke file gambar. Direktori output dan nama file akan sama dengan file XPS input. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". Jika dokumen diinisialisasi dengan aliran yang bukan FileInputStream, file gambar akan disimpan di folder saat ini dengan templat nama file default.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opsi untuk menyimpan dokumen dalam format gambar bitmap. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Menyimpan dokumen ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. Ekstensi file akan sesuai dengan format gambar dalam parameter "options".

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opsi untuk menyimpan dokumen dalam format gambar bitmap. |
| outDir | java.lang.String | Direktori output tempat file gambar akan disimpan. |
| fileNameTemplate | java.lang.String | Templat nama file untuk gambar (tanpa ekstensi). Jika file XPS input memiliki 1 halaman, itu akan menjadi nama file yang tepat, jika tidak "\_[n]", dimana "n" - nomor halaman mulai dari 1, akhiran akan ditambahkan ke ini. Ekstensi file akan sesuai dengan format gambar dalam parameter "option". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Menyimpan dokumen dalam format gambar bitmap sebagai array byte.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Opsi untuk menyimpan dokumen dalam format gambar bitmap. |

**Returns:**
byte[][][] - Array byte gambar yang dihasilkan. Dimensi pertama untuk dokumen internal dan dimensi kedua untuk halaman dalam dokumen internal.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Menyimpan dokumen dalam format PDF.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.OutputStream | Aliran untuk menulis file PDF output ke. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opsi untuk menyimpan dokumen dalam format PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Menyimpan dokumen dalam format PDF.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Jalur file PDF keluaran. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Opsi untuk menyimpan dokumen dalam format PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Menyimpan dokumen dalam format PS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.OutputStream | Aliran untuk menulis file PS output ke. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opsi untuk menyimpan dokumen dalam format PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Menyimpan dokumen dalam format PostSscript.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Jalur file PostScript output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Opsi untuk menyimpan dokumen dalam format PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Memilih dokumen aktif untuk diedit.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| documentNumber | int | Nomor dokumen. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Memilih halaman dokumen aktif untuk diedit.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pageNumber | int | Nomor halaman. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Menautkan  printTicket  ke dokumen yang diindeks oleh  documentIndex .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| documentIndex | int | Indeks dokumen yang akan dihubungkan dengan tiket cetak. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Tiket cetak yang akan dihubungkan. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Mengatur tiket cetak pekerjaan dokumen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Tiket cetak pekerjaan dokumen. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Menautkan  printTicket  ke halaman yang diindeks oleh  pageIndex  dalam dokumen yang diindeks oleh  documentIndex .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| documentIndex | int | Indeks dokumen. |
| pageIndex | int | Indeks halaman yang akan dihubungkan dengan tiket cetak. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Tiket cetak yang akan dihubungkan. |

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

