---
title: "PsDocument"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas ini mengenkapsulasi dokumen PS/EPS."
type: docs
weight: 16
url: /id/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Kelas ini mengenkapsulasi dokumen PS/EPS.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PsDocument()](#PsDocument--) | Menginisialisasi PsDocument kosong dengan halaman yang diinisialisasi. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Menginisialisasi PsDocument kosong dengan halaman yang diinisialisasi. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Menginisialisasi PsDocument kosong dengan halaman yang diinisialisasi. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Menginisialisasi PsDocument kosong. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Menginisialisasi PsDocument kosong. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Menginisialisasi PsDocument kosong ketika jumlah halaman dokumen Postscript diketahui sebelumnya. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Menginisialisasi PsDocument kosong ketika jumlah halaman dokumen Postscript diketahui sebelumnya. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Menginisialisasi PsDocument dengan file PS/EPS masukan. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Menginisialisasi PsDocument dengan aliran file PS/EPS. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Menambahkan klip ke keadaan grafis saat ini. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Menambahkan klip ke keadaan grafis saat ini dan kemudian menulis operator "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Menambahkan persegi pemotongan ke keadaan grafis saat ini. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Menambahkan klip dari kontur teks yang diberikan dalam font yang diberikan. |
| [closePage()](#closePage--) | Menyelesaikan halaman saat ini. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Mengonversi font Type 1 ke TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Mengonversi font Type 3 ke TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Mengonversi font Type 3 ke TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Memotong PsDocument yang diberikan sebagai file EPS. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Menggambar jalur sembarang. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Menggambar gambar yang dimask. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Menggambar sebuah gambar. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Menggambar gambar yang diubah dengan latar belakang. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Menggambar gambar transparan yang diubah dengan latar belakang. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Membaca file EPS dan mengekstrak kotak pembatas gambar EPS dari komentar %%BoundingBox atau batas untuk ukuran halaman default (0, 0, 595, 842) jika tidak ada. |
| [extractEpsSize()](#extractEpsSize--) | Membaca file EPS dan mengekstrak ukuran gambar EPS dari komentar %%BoundingBox atau ukuran halaman default (595, 842) jika tidak ada. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Mengekstrak teks dari file PS. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Isi jalur sembarang. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Menambahkan string teks dengan mengisi interior glif. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Menambahkan string teks dengan mengisi interior glif. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Mendapatkan jumlah halaman dalam dokumen PDF yang dihasilkan. |
| [getPaint()](#getPaint--) | Mendapatkan paint dalam keadaan grafik saat ini. |
| [getStroke()](#getStroke--) | Mendapatkan stroke dalam keadaan grafik saat ini. |
| [getXmpMetadata()](#getXmpMetadata--) | Membaca file PS/EPS dan mengekstrak XmpMetadata jika sudah ada atau menambahkan yang baru jika tidak ada. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Menunjukkan apakah lisensi produk Aspose.Page untuk Java diakses dan valid. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Menggabungkan file PS/EPS ke perangkat. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Menggabungkan file PS/EPS ke perangkat. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Menggabungkan file PS/EPS ke perangkat. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Membuat halaman baru dan menjadikannya halaman saat ini. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Membuat halaman baru dengan ukuran dokumen dan menjadikannya halaman saat ini. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Menambahkan string teks dengan menggambar kontur glif. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Menambahkan string teks dengan menggambar kontur glif. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Mengubah ukuran PsDocument yang diberikan sebagai file EPS. |
| [rotate(float angleRadians)](#rotate-float-) | Menambahkan rotasi berlawanan arah jarum jam sekitar asal ke keadaan grafik saat ini (memutar matriks saat ini). |
| [rotate(int angleDegrees)](#rotate-int-) | Menambahkan rotasi berlawanan arah jarum jam sekitar asal ke keadaan grafik saat ini (memutar matriks saat ini). |
| [save()](#save--) | Menyimpan PsDocument yang diberikan sebagai file PS atau EPS. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Menyimpan file PS/EPS ke perangkat. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Menyimpan PsDocument yang diberikan ke aliran. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Menyimpan PsDocument yang diberikan sebagai file EPS. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Menyimpan file PS/EPS ke file gambar. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Menyimpan file PS/EPS ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Menyimpan file PS/EPS ke array byte gambar. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Menyimpan file PS/EPS ke aliran PDF output. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Menyimpan file PS/EPS ke file PDF. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Menyimpan objek BufferedImage ke file EPS. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Menyimpan objek BufferedImage ke file EPS. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Menyimpan gambar PNG/JPEG/BMP/GIF dari aliran masukan ke aliran keluaran EPS. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Menyimpan gambar PNG/JPEG/BMP/GIF dari file ke file EPS. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Menambahkan skala ke keadaan grafik saat ini (skala matriks saat ini). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Menentukan aliran masukan. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Mengatur parameter perangkat halaman (lihat operator "setpagedevice" pada spesifikasi PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Mengatur ukuran halaman. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Mengatur cat pada keadaan grafik saat ini. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Mengatur goresan pada keadaan grafik saat ini. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Mengatur transformasi saat ini menjadi ini. |
| [shear(float shx, float shy)](#shear-float-float-) | Menambahkan transformasi geser ke keadaan grafik saat ini (geser matriks saat ini). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Menambahkan transformasi ke keadaan grafik saat ini (menggabungkan matriks ini dengan yang saat ini). |
| [translate(float x, float y)](#translate-float-float-) | Menambahkan translasi ke keadaan grafik saat ini (mentranslasi matriks saat ini). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Menulis pemulihan keadaan grafik saat ini (lihat spesifikasi PostScript pada operator "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Menulis penyimpanan keadaan grafik saat ini (lihat spesifikasi PostScript pada operator "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Menginisialisasi PsDocument kosong dengan halaman yang diinisialisasi. Konstruktor ini hanya digunakan untuk operasi tambahan yang tidak terkait dengan file PostScript, misalnya mengonversi font.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Menginisialisasi PsDocument kosong dengan halaman yang diinisialisasi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Jalur file PS/EPS output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Menginisialisasi PsDocument kosong dengan halaman yang diinisialisasi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| psStream | java.io.OutputStream | Aliran tempat menyimpan file PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Menginisialisasi PsDocument kosong.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Jalur file PS/EPS output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| multipaged | boolean | Jika false halaman tidak akan diinisialisasi. Dalam kasus ini inisialisasi halaman harus dilakukan melalui pemanggilan eksplisit "openPage(width, height)". |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Menginisialisasi PsDocument kosong.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| psStream | java.io.OutputStream | Aliran tempat menyimpan file PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| multipaged | boolean | Jika false halaman tidak akan diinisialisasi. Dalam kasus ini inisialisasi halaman harus dilakukan melalui pemanggilan eksplisit "openPage(width, height)". |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Menginisialisasi PsDocument kosong ketika jumlah halaman dokumen Postscript diketahui sebelumnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Jalur file PS/EPS output. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| numberOfPages | int | Jumlah halaman dalam dokumen PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Menginisialisasi PsDocument kosong ketika jumlah halaman dokumen Postscript diketahui sebelumnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| psStream | java.io.OutputStream | Aliran tempat menyimpan file PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Sekumpulan parameter yang mengontrol penyimpanan file PostScript. |
| numberOfPages | int | Jumlah halaman dalam dokumen PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Menginisialisasi PsDocument dengan file PS/EPS masukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| psFilePath | java.lang.String | Jalur file PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Menginisialisasi PsDocument dengan aliran file PS/EPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| psStream | java.io.InputStream | Aliran file PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Menambahkan klip ke keadaan grafis saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | java.awt.Shape | Jalur pemotongan. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Menambahkan klip ke keadaan grafik saat ini dan kemudian menulis operator "newpath". Hal ini diperlukan untuk menghindari konfluensi jalur pemotongan ini dengan beberapa jalur berikutnya seperti glif yang digambar dengan operator "charpath".

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| s | java.awt.Shape | Jalur pemotongan. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Menambahkan persegi pemotongan ke keadaan grafis saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | Persegi panjang pemotongan. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Menambahkan klip dari kontur teks yang diberikan dalam font yang diberikan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks. |
| font | java.awt.Font | Font. |
| x | float | Koordinat X posisi teks. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Menyelesaikan halaman saat ini.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Mengonversi font Type 1 ke TrueType. Nama file TTF yang dikonversi akan sama dengan font Type 1 input dengan ekstensi ".ttf". File TTF akan disimpan ke direktori output yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Jalur file font Type 1.. |
| outputDir | java.lang.String | Direktori output tempat menyimpan font TrueType yang dihasilkan. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Mengonversi font Type 3 ke TrueType. File TTF akan disimpan ke aliran output yang disediakan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Jalur file font Type 3. |
| outputStream | java.io.OutputStream | Aliran output tempat menyimpan font TrueType yang dihasilkan. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Mengonversi font Type 3 ke TrueType. Nama file TTF yang dikonversi akan sama dengan font Type 3 input dengan ekstensi ".ttf". File TTF akan disimpan ke direktori output yang ditetapkan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Jalur file font Type 3.. |
| outputDir | java.lang.String | Direktori output tempat menyimpan font TrueType yang dihasilkan. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Memotong PsDocument yang diberikan sebagai file EPS. Ini menyimpan file EPS awal dengan %%BoundingBox yang ada diperbarui atau membuat yang baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Kotak potong (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Menggambar jalur sembarang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| shape | java.awt.Shape | Jalur untuk mengisi. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Menggambar gambar yang dimask.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | Gambar untuk digambar. Harus dalam format gambar RGB 24bpp. |
| alphaMask1bpp | java.awt.image.BufferedImage | Masker gambar. Harus dalam format gambar 1bpp. |
| transform | java.awt.geom.AffineTransform | Matriks untuk mentransformasi gambar. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Menggambar sebuah gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Gambar untuk digambar. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Menggambar gambar yang diubah dengan latar belakang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Gambar untuk digambar. |
| transform | java.awt.geom.AffineTransform | Matriks untuk mentransformasi gambar. |
| bkg | java.awt.Color | Latar belakang untuk gambar. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Gambar transparan yang ditransformasi dengan latar belakang. Jika gambar tidak memiliki saluran Alpha, gambar akan digambar sebagai gambar buram.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Gambar untuk digambar. |
| transform | java.awt.geom.AffineTransform | Matriks untuk mentransformasi gambar. |
| transparencyThreshold | int | Ambang batas yang menentukan nilai transparansi mana piksel akan dianggap sepenuhnya transparan. Semua nilai di bawah ambang batas ini akan dianggap sepenuhnya buram. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Membaca file EPS dan mengekstrak kotak pembatas gambar EPS dari komentar %%BoundingBox atau batas untuk ukuran halaman default (0, 0, 595, 842) jika tidak ada.

**Returns:**
int[] - Kotak pembatas gambar EPS.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Membaca file EPS dan mengekstrak ukuran gambar EPS dari komentar %%BoundingBox atau ukuran halaman default (595, 842) jika tidak ada.

**Returns:**
java.awt.Dimension - Ukuran gambar EPS.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Mengekstrak teks dari file PS. Hanya berfungsi untuk teks yang ditulis dengan font TrueType (Tipe 42) atau font komposit (Tipe 0) yang terdiri dari font TrueType.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opsi penyimpanan. |
| startPage | int | Halaman dari mana secara inklusif memulai ekstraksi teks. |
| endPage | int | Halaman yang secara inklusif akan diekstrak teksnya. |

**Returns:**
java.lang.String - Teks yang terdapat dalam halaman yang dipilih dari file PS.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Isi jalur sembarang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| shape | java.awt.Shape | Jalur untuk mengisi. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fillPaint | java.awt.Paint | Isian yang digunakan untuk melukis interior glif. |
| strokePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fillPaint | java.awt.Paint | Isian yang digunakan untuk melukis interior glif. |
| strokePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. advances Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| advances | float[] |  |
| font | java.awt.Font | Font sistem yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fillPaint | java.awt.Paint | Isian yang digunakan untuk melukis interior glif. |
| strokePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Menambahkan string teks dengan mengisi interior glif dan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| font | java.awt.Font | Font sistem yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fillPaint | java.awt.Paint | Isian yang digunakan untuk melukis interior glif. |
| strokePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fill | java.awt.Paint | Isian yang digunakan untuk melukis glif. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fill | java.awt.Paint | Isian yang digunakan untuk melukis glif. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| font | java.awt.Font | Font sistem yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| font | java.awt.Font | Font yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fill | java.awt.Paint | Isian yang digunakan untuk melukis glif. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| font | java.awt.Font | Font sistem yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Menambahkan string teks dengan mengisi interior glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| font | java.awt.Font | Font yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| fill | java.awt.Paint | Isian yang digunakan untuk melukis glif. |

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


Mendapatkan jumlah halaman dalam dokumen PDF yang dihasilkan.

**Returns:**
int - jumlah halaman.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Mendapatkan paint dalam keadaan grafik saat ini.

**Returns:**
java.awt.Paint - Cat warna saat ini.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Mendapatkan stroke dalam keadaan grafik saat ini.

**Returns:**
java.awt.Stroke - Garis stroke saat ini.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Membaca file PS/EPS dan mengekstrak XmpMetadata jika sudah ada atau menambahkan yang baru jika tidak ada.

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


Menunjukkan apakah lisensi produk Aspose.Page untuk Java diakses dan valid.

**Returns:**
boolean - nilai boolean
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Menggabungkan file PS/EPS ke perangkat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | File PS/EPS untuk digabungkan dengan file ini ke perangkat output. |
| device | [Device](../../com.aspose.page/device) | Perangkat keluaran. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Berisi flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Menggabungkan file PS/EPS ke perangkat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Aliran PDF output. |
| filesForMerge | java.lang.String[] | File PS/EPS untuk digabungkan dengan file ini ke perangkat output. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Berisi flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Menggabungkan file PS/EPS ke perangkat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Jalur file PDF output. |
| filesForMerge | java.lang.String[] | File PS/EPS untuk digabungkan dengan file ini ke perangkat output. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Berisi flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

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


Membuat halaman baru dan menjadikannya halaman saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | Lebar halaman baru. |
| tinggi | float | Tinggi halaman baru. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Membuat halaman baru dengan ukuran dokumen dan menjadikannya halaman saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pageName | java.lang.String | Nama halaman baru. Jika null, nama halaman akan menjadi nomor urut halaman. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| outlinePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont yang akan digunakan untuk menggambar teks. Bisa digunakan dengan font khusus yang berada di folder khusus. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| outlinePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| font | java.awt.Font | Font sistem yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| advances | float[] | Array lebar glif. Panjangnya harus sesuai dengan jumlah glif dalam string. |
| font | java.awt.Font | Font yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| outlinePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| font | java.awt.Font | Font sistem yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Menambahkan string teks dengan menggambar kontur glif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| text | java.lang.String | Teks yang akan ditambahkan. |
| font | java.awt.Font | Font yang akan digunakan untuk menggambar teks. |
| x | float | Koordinat X untuk asal teks. |
| y | float | Koordinat Y untuk asal teks. |
| outlinePaint | java.awt.Paint | java.awt.Paint yang digunakan untuk melukis kontur glif. Bisa berupa subclass apa pun dari kelas java.awt.Paint di JDK. |
| stroke | java.awt.Stroke | Garis yang digunakan untuk menggambar kontur glif. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Mengubah ukuran PsDocument yang diberikan menjadi file EPS. Metode ini hanya digunakan setelah mengekstrak ukuran EPS. Ia menyimpan file EPS awal dengan %%BoundingBox yang ada diperbarui atau yang baru akan dibuat. Matriks transformasi halaman juga akan diatur.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Ukuran baru gambar EPS dalam satuan yang ditetapkan. |
| units | [Units](../../com.aspose.page/units) | Satuan dari ukuran baru. Bisa berupa poin, inci, milimeter, sentimeter, dan persentase dari ukuran awal. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Menambahkan rotasi berlawanan arah jarum jam sekitar asal ke keadaan grafik saat ini (memutar matriks saat ini).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angleRadians | float | Sudut rotasi dalam radian. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Menambahkan rotasi berlawanan arah jarum jam sekitar asal ke keadaan grafik saat ini (memutar matriks saat ini).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angleDegrees | int | Sudut rotasi dalam derajat. |

### save() {#save--}
```
public void save()
```


Menyimpan PsDocument yang diberikan sebagai file PS atau EPS. Metode ini hanya digunakan ketika PsDocument dibuat dari awal.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Menyimpan file PS/EPS ke perangkat.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Perangkat keluaran. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Berisi flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Menyimpan PsDocument yang diberikan ke aliran. Metode ini hanya digunakan setelah memperbarui metadata XMP. Ia menyimpan file EPS awal dengan metadata yang ada diperbarui atau yang baru dibuat saat memanggil metode getMetadata. Dalam kasus terakhir semua kode PostScript yang diperlukan dan komentar EPS ditambahkan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Aliran file EPS output. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Menyimpan PsDocument yang diberikan sebagai file EPS. Metode ini hanya digunakan setelah memperbarui metadata XMP. Ia menyimpan file EPS awal dengan metadata yang ada diperbarui atau yang baru dibuat saat memanggil metode getMetadata. Dalam kasus terakhir semua kode PostScript yang diperlukan dan komentar EPS ditambahkan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Sebuah jalur file EPS output.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Menyimpan file PS/EPS ke file gambar. Direktori output dan nama file akan sama dengan file PS input. Ekstensi file akan sesuai dengan format gambar dalam parameter "options". Jika dokumen diinisialisasi dengan aliran yang tidak berasal dari FileInputStream, file gambar akan disimpan di folder saat ini dengan templat nama file default.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Berisi parameter yang diperlukan untuk menyimpan gambar dan flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Menyimpan file PS/EPS ke file gambar ke direktori yang ditentukan dengan nama file yang ditentukan. Ekstensi file akan sesuai dengan format gambar dalam parameter "options".

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Berisi parameter yang diperlukan untuk menyimpan gambar dan flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |
| outDir | java.lang.String | Direktori output tempat file gambar akan disimpan. |
| fileNameTemplate | java.lang.String | Templat nama file untuk gambar (tanpa ekstensi). Jika file PS/EPS input memiliki 1 halaman, itu akan menjadi tepat nama file, jika tidak "\_[n]", dimana "n" - nomor halaman mulai dari 0, sufiks akan ditambahkan ke ini. Ekstensi file akan sesuai dengan format gambar dalam parameter "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Menyimpan file PS/EPS ke array byte gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Berisi parameter yang diperlukan untuk menyimpan gambar dan flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

**Returns:**
byte[][] - Byte gambar. Satu array byte untuk satu halaman.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Menyimpan file PS/EPS ke aliran PDF output.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Aliran PDF output. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Berisi flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Menyimpan file PS/EPS ke file PDF.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Jalur file PDF output. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Berisi flag yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Menyimpan objek BufferedImage ke file EPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Gambar. |
| epsStream | java.io.OutputStream | Aliran output EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Berisi parameter yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Menyimpan objek BufferedImage ke file EPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Gambar. |
| epsFilePath | java.lang.String | Jalur file EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Berisi parameter yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Menyimpan gambar PNG/JPEG/BMP/GIF dari aliran masukan ke aliran keluaran EPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageStream | java.io.InputStream | Aliran input gambar. |
| epsStream | java.io.OutputStream | Aliran output EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Berisi parameter yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Menyimpan gambar PNG/JPEG/BMP/GIF dari file ke file EPS.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFilePath | java.lang.String | Jalur file gambar. |
| epsFilePath | java.lang.String | Jalur file EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Berisi parameter yang menentukan keluaran kesalahan yang dilempar selama konversi. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Menambahkan skala ke keadaan grafik saat ini (skala matriks saat ini).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xScale | float | Skala pada sumbu X. |
| yScale | float | Skala pada sumbu Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Menentukan aliran masukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| is | java.io.InputStream | Aliran input file PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Mengatur parameter perangkat halaman (lihat operator "setpagedevice" pada spesifikasi PostScript). Di antaranya dapat berupa ukuran halaman dan warna, dll.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Parameter halaman. Dalam kamus ini dapat berisi ukuran halaman dan warna, dll. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Mengatur ukuran halaman. Untuk membuat halaman dengan ukuran berbeda dalam satu dokumen gunakan metode  setPageDevice  tepat setelah metode ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | Lebar halaman dalam file PostScript yang dihasilkan. |
| tinggi | float | Tinggi halaman dalam file PostScript yang dihasilkan. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Mengatur cat pada keadaan grafik saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| paint | java.awt.Paint | Paint. Itu dapat berupa subclass apa pun dari kelas  Paint  yang ada di JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Mengatur goresan pada keadaan grafik saat ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| stroke | java.awt.Stroke | Stroke. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Mengatur transformasi saat ini menjadi ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Transformasi. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Menambahkan transformasi geser ke keadaan grafik saat ini (geser matriks saat ini).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| shx | float | Shear pada sumbu X. |
| shy | float | Shear pada sumbu Y. |

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


Menambahkan transformasi ke keadaan grafik saat ini (menggabungkan matriks ini dengan yang saat ini).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Transformasi. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Menambahkan translasi ke keadaan grafik saat ini (mentranslasi matriks saat ini).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | float | Translasi ke arah X. |
| y | float | Translasi ke arah Y. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Menulis pemulihan keadaan grafik saat ini (lihat spesifikasi PostScript pada operator "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Menulis penyimpanan keadaan grafik saat ini (lihat spesifikasi PostScript pada operator "gsave").

