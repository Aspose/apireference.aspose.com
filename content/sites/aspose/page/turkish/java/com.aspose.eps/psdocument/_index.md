---
title: "PsDocument"
second_title: "Java için Aspose.Page API Referansı"
description: "Bu sınıf PS/EPS belgelerini kapsüller."
type: docs
weight: 16
url: /tr/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Bu sınıf PS/EPS belgelerini kapsüller.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PsDocument()](#PsDocument--) | Boş  PsDocument  önceden başlatılmış sayfa ile başlatır. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Boş  PsDocument  önceden başlatılmış sayfa ile başlatır. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Boş  PsDocument  önceden başlatılmış sayfa ile başlatır. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Boş  PsDocument  başlatır. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Boş  PsDocument  başlatır. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Boş  PsDocument  Postscript belge sayfalarının sayısı önceden bilindiğinde başlatır. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Boş  PsDocument  Postscript belge sayfalarının sayısı önceden bilindiğinde başlatır. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | PsDocument  bir giriş PS/EPS dosyasıyla başlatır. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | PsDocument  bir PS/EPS dosyası akışıyla başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Mevcut grafik durumuna kırpma ekler. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Mevcut grafik durumuna kırpma ekler ve ardından "newpath" operatörünü yazar. |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Mevcut grafik durumuna kırpma dikdörtgeni ekler. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Verilen yazı tipindeki verilen metnin taslağından kırpma ekler. |
| [closePage()](#closePage--) | Mevcut sayfayı tamamla. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Type 1 yazı tipini TrueType'a dönüştürür. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Type 3 yazı tipini TrueType'a dönüştürür. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Type 3 yazı tipini TrueType'a dönüştürür. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Verilen  PsDocument  EPS dosyası olarak kırpar. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Keyfi bir yol çizer. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Maskeli görüntü çizer. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Bir görüntü çizer. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Arka planlı dönüştürülmüş görüntü çizer. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Arka planlı dönüştürülmüş şeffaf görüntüyü çizer. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | EPS dosyasını okur ve EPS görüntüsünün sınırlayıcı kutusunu %%BoundingBox yorumundan veya mevcut değilse varsayılan sayfa boyutu (0, 0, 595, 842) sınırlarından çıkarır. |
| [extractEpsSize()](#extractEpsSize--) | EPS dosyasını okur ve EPS görüntüsünün boyutunu %%BoundingBox yorumundan veya mevcut değilse varsayılan sayfa boyutu (595, 842) üzerinden çıkarır. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | PS dosyasından metin çıkarır. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Keyfi bir yolu doldur. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Oluşan PDF belgesindeki sayfa sayısını alır. |
| [getPaint()](#getPaint--) | Mevcut grafik durumundaki boyamayı alır. |
| [getStroke()](#getStroke--) | Mevcut grafik durumundaki çizgiyi alır. |
| [getXmpMetadata()](#getXmpMetadata--) | PS/EPS dosyasını okur ve XmpMetdata mevcutsa çıkarır, yoksa yeni bir tane ekler. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Aspose.Page for Java ürün lisansının erişilip erişilmediğini ve geçerli olup olmadığını gösterir. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS dosyalarını bir aygıta birleştirir. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS dosyalarını bir aygıta birleştirir. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | PS/EPS dosyalarını bir aygıta birleştirir. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Yeni bir sayfa oluşturur ve onu mevcut sayfa yapar. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Belgenin boyutuyla yeni bir sayfa oluşturur ve onu mevcut sayfa yapar. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Verilen  PsDocument  EPS dosyası olarak yeniden boyutlandırır. |
| [rotate(float angleRadians)](#rotate-float-) | Köken etrafında saat yönünün tersine bir dönüş ekler (geçerli matrisi döndür). |
| [rotate(int angleDegrees)](#rotate-int-) | Köken etrafında saat yönünün tersine bir dönüş ekler (geçerli matrisi döndür). |
| [save()](#save--) | Verilen PsDocument'i PS veya EPS dosyası olarak kaydeder. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | PS/EPS dosyasını bir cihaza kaydeder. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Verilen PsDocument'i akışa kaydeder. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Verilen PsDocument'i EPS dosyası olarak kaydeder. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS dosyasını görüntü dosyasına kaydeder. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | PS/EPS dosyasını belirtilen dizine, belirtilen dosya adıyla görüntü dosyası olarak kaydeder. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | PS/EPS dosyasını görüntü bayt dizilerine kaydeder. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS dosyasını bir çıktı PDF akışına kaydeder. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | PS/EPS dosyasını PDF dosyasına kaydeder. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | BufferedImage nesnesini EPS dosyasına kaydeder. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | BufferedImage nesnesini EPS dosyasına kaydeder. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Giriş akışından PNG/JPEG/BMP/GIF görüntüsünü EPS çıkış akışına kaydeder. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Dosyadan PNG/JPEG/BMP/GIF görüntüsünü EPS dosyasına kaydeder. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Mevcut grafik durumuna ölçek ekler (geçerli matrisi ölçeklendir). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Bir giriş akışı belirtir. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Sayfa cihazı parametrelerini ayarlar ("setpagedevice" operatörüne bakın, PostScript spesifikasyonu). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Sayfa boyutunu ayarlar. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Mevcut grafik durumunda boyayı ayarlar. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Mevcut grafik durumunda çizgi (stroke) ayarlar. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Mevcut dönüşümü buna ayarla. |
| [shear(float shx, float shy)](#shear-float-float-) | Mevcut grafik durumuna kayma dönüşümü ekler (mevcut matrisi kaydır). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Mevcut grafik durumuna dönüşüm ekler (bu matrisi mevcut matrisle birleştirir). |
| [translate(float x, float y)](#translate-float-float-) | Mevcut grafik durumuna çeviri ekler (mevcut matrisi çevirir). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Geçerli grafik durumunun geri yüklenmesini yazar (PostScript spesifikasyonunda "grestore" operatörüne bakın). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Geçerli grafik durumunun kaydedilmesini yazar (PostScript spesifikasyonunda "gsave" operatörüne bakın). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Boş PsDocument'i başlatılmış sayfa ile başlatır. Bu yapıcı yalnızca PostScript dosyalarıyla ilgili olmayan ek işlemler için kullanılır, örneğin, yazı tiplerini dönüştürmek.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Boş  PsDocument  önceden başlatılmış sayfa ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Çıktı PS/EPS dosya yolu. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Boş  PsDocument  önceden başlatılmış sayfa ile başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS dosyasının kaydedileceği akış. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Boş  PsDocument  başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Çıktı PS/EPS dosya yolu. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| multipaged | boolean | false ise sayfa başlatılmaz. Bu durumda sayfa başlatma, açıkça "openPage(width, height)" çağrısı ile yapılmalıdır. |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Boş  PsDocument  başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS dosyasının kaydedileceği akış. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| multipaged | boolean | false ise sayfa başlatılmaz. Bu durumda sayfa başlatma, açıkça "openPage(width, height)" çağrısı ile yapılmalıdır. |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Boş  PsDocument  Postscript belge sayfalarının sayısı önceden bilindiğinde başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Çıktı PS/EPS dosya yolu. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| numberOfPages | int | PostScript belgesindeki sayfa sayısı. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Boş  PsDocument  Postscript belge sayfalarının sayısı önceden bilindiğinde başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| psStream | java.io.OutputStream | PS/EPS dosyasının kaydedileceği akış. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| numberOfPages | int | PostScript belgesindeki sayfa sayısı. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


PsDocument  bir giriş PS/EPS dosyasıyla başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| psFilePath | java.lang.String | PS/EPS dosya yolu. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


PsDocument  bir PS/EPS dosyası akışıyla başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| psStream | java.io.InputStream | PS/EPS dosyasının akışı. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Mevcut grafik durumuna kırpma ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | java.awt.Shape | Kırpma yolu. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Mevcut grafik durumuna kırpma ekler ve ardından "newpath" operatörünü yazar. Bu, bu kırpma yolunun ve "charpath" operatörüyle çevrelenmiş glifler gibi bazı sonraki yolların birleşmesinden kaçınmak için gereklidir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | java.awt.Shape | Kırpma yolu. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Mevcut grafik durumuna kırpma dikdörtgeni ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D.Float | Kırpma dikdörtgeni. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Verilen yazı tipindeki verilen metnin taslağından kırpma ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Metin. |
| font | java.awt.Font | Yazı tipi. |
| x | float | Metin konumunun X koordinatı. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Mevcut sayfayı tamamla.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Type 1 yazı tipini TrueType'a dönüştürür. Dönüştürülen TTF yazı tipi dosyasının adı, giriş Type 1 yazı tipinin aynı adıyla ".ttf" uzantısı eklenmiş olur. TTF dosyası atanmış çıktı dizinine kaydedilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Type 1 yazı tipi dosya yolu. |
| outputDir | java.lang.String | Sonuç TrueType yazı tipinin kaydedileceği çıktı dizini. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Type 3 yazı tipini TrueType'a dönüştürür. TTF dosyası sağlanan çıktı akışına kaydedilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 yazı tipi dosya yolu. |
| outputStream | java.io.OutputStream | Sonuç TrueType yazı tipinin kaydedileceği çıktı akışı. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Type 3 yazı tipini TrueType'a dönüştürür. Dönüştürülen TTF yazı tipi dosyasının adı, giriş Type 3 yazı tipinin aynı adıyla ".ttf" uzantısı eklenmiş olur. TTF dosyası atanmış çıktı dizinine kaydedilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Type 3 yazı tipi dosya yolu. |
| outputDir | java.lang.String | Sonuç TrueType yazı tipinin kaydedileceği çıktı dizini. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Verilen PsDocument'i EPS dosyası olarak kırpar. Mevcut %%BoundingBox güncellenmiş şekilde ilk EPS dosyasını kaydeder veya yeni bir %%BoundingBox oluşturulur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Kırpma kutusu (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Keyfi bir yol çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| şekil | java.awt.Shape | Doldurulacak yol. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Maskeli görüntü çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | Çizilecek görüntü. 24bpp RGB görüntü formatında olmalıdır |
| alphaMask1bpp | java.awt.image.BufferedImage | Görüntü maskesi. 1bpp görüntü formatında olmalıdır. |
| dönüşüm | java.awt.geom.AffineTransform | Görüntüyü dönüştürmek için matris. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Bir görüntü çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görüntü | java.awt.image.BufferedImage | Çizilecek görüntü. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Arka planlı dönüştürülmüş görüntü çizer.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görüntü | java.awt.image.BufferedImage | Çizilecek görüntü. |
| dönüşüm | java.awt.geom.AffineTransform | Görüntüyü dönüştürmek için matris. |
| bkg | java.awt.Color | Görüntünün arka planı. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Arka planlı dönüştürülmüş şeffaf görüntüyü çizer. Görüntünün alfa kanalı yoksa opak görüntü olarak çizilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görüntü | java.awt.image.BufferedImage | Çizilecek görüntü. |
| dönüşüm | java.awt.geom.AffineTransform | Görüntüyü dönüştürmek için matris. |
| transparencyThreshold | int | Şeffaflık pikselinin tam şeffaf olarak yorumlanacağı değeri tanımlayan bir eşik. Bu eşik altındaki tüm değerler tam opak olarak yorumlanır. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


EPS dosyasını okur ve EPS görüntüsünün sınırlayıcı kutusunu %%BoundingBox yorumundan veya mevcut değilse varsayılan sayfa boyutu (0, 0, 595, 842) sınırlarından çıkarır.

**Returns:**
int[] - EPS görüntüsünün sınırlama kutusu.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


EPS dosyasını okur ve EPS görüntüsünün boyutunu %%BoundingBox yorumundan veya mevcut değilse varsayılan sayfa boyutu (595, 842) üzerinden çıkarır.

**Returns:**
java.awt.Dimension - EPS görüntüsünün boyutu.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


PS dosyasından metni çıkarır. Yalnızca TrueType yazı tipleri (Type 42) ile veya TrueType yazı tiplerinden oluşan birleşik yazı tipleri (Type 0) ile yazılmış metinlerde çalışır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Kaydetme seçenekleri. |
| startPage | int | Metni çıkarmaya dahil olarak başlanacak sayfa. |
| endPage | int | Metni çıkarmak için dahil olacak sayfa. |

**Returns:**
java.lang.String - Seçilen PS dosyası sayfalarında bulunan metin.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Keyfi bir yolu doldur.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| şekil | java.awt.Shape | Doldurulacak yol. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fillPaint | java.awt.Paint | Gliflerin içini boyamak için kullanılan dolgu. |
| strokePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fillPaint | java.awt.Paint | Gliflerin içini boyamak için kullanılan dolgu. |
| strokePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| ilerlemeler | float[] |  |
| font | java.awt.Font | Metni çizmeye kullanılacak sistem yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fillPaint | java.awt.Paint | Gliflerin içini boyamak için kullanılan dolgu. |
| strokePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| font | java.awt.Font | Metni çizmeye kullanılacak sistem yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fillPaint | java.awt.Paint | Gliflerin içini boyamak için kullanılan dolgu. |
| strokePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fill | java.awt.Paint | Glifleri boyamak için kullanılan dolgu. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fill | java.awt.Paint | Glifleri boyamak için kullanılan dolgu. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| font | java.awt.Font | Metni çizmeye kullanılacak sistem yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| font | java.awt.Font | Metni çizmeye kullanılacak yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fill | java.awt.Paint | Glifleri boyamak için kullanılan dolgu. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| font | java.awt.Font | Metni çizmeye kullanılacak sistem yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Gliflerin içini doldurarak bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| font | java.awt.Font | Metni çizmeye kullanılacak yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| fill | java.awt.Paint | Glifleri boyamak için kullanılan dolgu. |

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


Oluşan PDF belgesindeki sayfa sayısını alır.

**Returns:**
int - sayfa sayısı.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Mevcut grafik durumundaki boyamayı alır.

**Returns:**
java.awt.Paint - Mevcut boya.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Mevcut grafik durumundaki çizgiyi alır.

**Returns:**
java.awt.Stroke - Mevcut çizgi.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


PS/EPS dosyasını okur ve XmpMetdata mevcutsa çıkarır, yoksa yeni bir tane ekler.

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


Aspose.Page for Java ürün lisansının erişilip erişilmediğini ve geçerli olup olmadığını gösterir.

**Returns:**
boolean - boolean değeri
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


PS/EPS dosyalarını bir aygıta birleştirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Bu dosyayla birleştirilecek PS/EPS dosyaları bir çıktı aygıtına. |
| device | [Device](../../com.aspose.page/device) | Bir çıktı cihazı. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten bayrakları içerir. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


PS/EPS dosyalarını bir aygıta birleştirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Bir çıktı PDF akışı. |
| filesForMerge | java.lang.String[] | Bu dosyayla birleştirilecek PS/EPS dosyaları bir çıktı aygıtına. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten bayrakları içerir. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


PS/EPS dosyalarını bir aygıta birleştirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Çıktı PDF dosya yolu. |
| filesForMerge | java.lang.String[] | Bu dosyayla birleştirilecek PS/EPS dosyaları bir çıktı aygıtına. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten bayrakları içerir. |

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


Yeni bir sayfa oluşturur ve onu mevcut sayfa yapar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | float | Yeni sayfanın genişliği. |
| height | float | Yeni sayfanın yüksekliği. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Belgenin boyutuyla yeni bir sayfa oluşturur ve onu mevcut sayfa yapar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pageName | java.lang.String | Yeni sayfanın adı. Eğer null ise sayfanın adı, sayfanın sıra numarası olacaktır. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| outlinePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  metni çizmeye kullanılacak. Özel bir klasörde bulunan özel bir yazı tipiyle kullanılabilir. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| outlinePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| font | java.awt.Font | Metni çizmeye kullanılacak sistem yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| ilerlemeler | float[] | Glif genişliklerinin bir dizisi. Uzunluğu, dizedeki glif sayısıyla uyumlu olmalıdır. |
| font | java.awt.Font | Metni çizmeye kullanılacak yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| outlinePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| font | java.awt.Font | Metni çizmeye kullanılacak sistem yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Glif konturlarını çizerek bir metin dizesi ekler.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| text | java.lang.String | Eklenecek metin. |
| font | java.awt.Font | Metni çizmeye kullanılacak yazı tipi. |
| x | float | Metin başlangıcı için X koordinatı. |
| y | float | Metin başlangıcı için Y koordinatı. |
| outlinePaint | java.awt.Paint | Glif konturlarını boyamak için kullanılan java.awt.Paint. JDK'daki java.awt.Paint sınıfının herhangi bir alt sınıfı olabilir. |
| stroke | java.awt.Stroke | Glif konturlarını çizmek için kullanılan stroke. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Verilen PsDocument'i EPS dosyası olarak yeniden boyutlandırır. Bu yöntem yalnızca EPS boyutu çıkarıldıktan sonra kullanılır. Güncellenmiş mevcut %%BoundingBox ile ilk EPS dosyasını kaydeder veya yeni bir %%BoundingBox oluşturulur. Sayfa dönüşüm matrisi de ayarlanacaktır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Atanan birimlerde EPS görüntüsünün yeni boyutu. |
| units | [Units](../../com.aspose.page/units) | Yeni boyutun birimleri. Nokta, inç, milimetre, santimetre ve başlangıç boyutunun yüzde değerleri olabilir. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Köken etrafında saat yönünün tersine bir dönüş ekler (geçerli matrisi döndür).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| angleRadians | float | Radyan cinsinden dönüş açısı. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Köken etrafında saat yönünün tersine bir dönüş ekler (geçerli matrisi döndür).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| angleDegrees | int | Derece cinsinden dönüş açısı. |

### save() {#save--}
```
public void save()
```


Verilen PsDocument'i PS veya EPS dosyası olarak kaydeder. Bu yöntem yalnızca PsDocument sıfırdan oluşturulduğunda kullanılır.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


PS/EPS dosyasını bir cihaza kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Bir çıktı cihazı. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten bayrakları içerir. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Verilen PsDocument'i akıma kaydeder. Bu yöntem yalnızca XMP üst verileri güncellendikten sonra kullanılır. Güncellenmiş mevcut üst verilerle ilk EPS dosyasını kaydeder veya getMetadata yöntemi çağrılırken oluşturulan yeni bir dosya kaydeder. Son durumda gerekli tüm PostScript kodları ve EPS yorumları eklenir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Çıktı EPS dosyasının akımı. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Verilen PsDocument'i EPS dosyası olarak kaydeder. Bu yöntem yalnızca XMP üst verileri güncellendikten sonra kullanılır. Güncellenmiş mevcut üst verilerle ilk EPS dosyasını kaydeder veya getMetadata yöntemi çağrılırken oluşturulan yeni bir dosya kaydeder. Son durumda gerekli tüm PostScript kodları ve EPS yorumları eklenir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Çıktı EPS dosya yolu. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


PS/EPS dosyasını görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş PS dosyasındakine aynı olacaktır. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. Belge, FileInputStream'ten türetilmemiş bir akışla başlatıldıysa, görüntü dosyası mevcut klasöre varsayılan dosya adı şablonu ile kaydedilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Görüntüyü kaydetmek için gerekli parametreleri ve dönüşüm sırasında oluşan hataların çıktısını belirten bayrakları içerir. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


PS/EPS dosyasını belirtilen dizine, belirtilen dosya adıyla görüntü dosyasına kaydeder. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Görüntüyü kaydetmek için gerekli parametreleri ve dönüşüm sırasında oluşan hataların çıktısını belirten bayrakları içerir. |
| outDir | java.lang.String | Görüntü dosyasının kaydedileceği çıktı dizini. |
| fileNameTemplate | java.lang.String | Görüntü için dosya adı şablonu (uzantısız). Giriş PS/EPS dosyası tek sayfalıysa dosya adı tam olarak bu olur, aksi takdirde "\_[n]", burada "n" - 0'dan başlayan sayfa numarasıdır, bu ekin sonuna eklenecektir. Dosya uzantısı "option" parametresindeki görüntü formatına karşılık gelecektir. |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


PS/EPS dosyasını görüntü bayt dizilerine kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Görüntüyü kaydetmek için gerekli parametreleri ve dönüşüm sırasında oluşan hataların çıktısını belirten bayrakları içerir. |

**Returns:**
byte[][] - Görüntü baytları. Bir sayfa için bir bayt dizisi.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


PS/EPS dosyasını bir çıktı PDF akışına kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Bir çıktı PDF akışı. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten bayrakları içerir. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


PS/EPS dosyasını PDF dosyasına kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Çıktı PDF dosya yolu. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten bayrakları içerir. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


BufferedImage nesnesini EPS dosyasına kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görüntü | java.awt.image.BufferedImage | Görüntü. |
| epsStream | java.io.OutputStream | EPS çıktı akışı. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten parametreleri içerir. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


BufferedImage nesnesini EPS dosyasına kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| görüntü | java.awt.image.BufferedImage | Görüntü. |
| epsFilePath | java.lang.String | EPS dosya yolu. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten parametreleri içerir. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Giriş akışından PNG/JPEG/BMP/GIF görüntüsünü EPS çıkış akışına kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageStream | java.io.InputStream | Görüntü giriş akışı. |
| epsStream | java.io.OutputStream | EPS çıktı akışı. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten parametreleri içerir. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Dosyadan PNG/JPEG/BMP/GIF görüntüsünü EPS dosyasına kaydeder.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| imageFilePath | java.lang.String | Görüntü dosya yolu. |
| epsFilePath | java.lang.String | EPS dosya yolu. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Dönüştürme sırasında ortaya çıkan hataların çıktısını belirten parametreleri içerir. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Mevcut grafik durumuna ölçek ekler (geçerli matrisi ölçeklendir).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xScale | float | X eksenindeki ölçek. |
| yScale | float | Y eksenindeki ölçek. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Bir giriş akışı belirtir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dır | java.io.InputStream | PS/EPS dosyasının giriş akışı. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Sayfa aygıtı parametrelerini ayarlar ("setpagedevice" operatörüne PostScript spesifikasyonunda bakın). Bunlar arasında sayfa boyutu, renk vb. bulunabilir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Sayfanın parametreleri. Bu sözlükte sayfa boyutu ve renk gibi değerler bulunabilir. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Sayfa boyutunu ayarlar. Tek bir belgede farklı boyutlarda sayfalar oluşturmak için bu yöntemden hemen sonra  setPageDevice  metodunu kullanın.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| width | float | Sonuç PostScript dosyasındaki sayfanın genişliği. |
| height | float | Sonuç PostScript dosyasındaki sayfanın yüksekliği. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Mevcut grafik durumunda boyayı ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| boya | java.awt.Paint | Paint nesnesi. JDK'da bulunan  Paint  sınıfının herhangi bir alt sınıfı olabilir. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Mevcut grafik durumunda çizgi (stroke) ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| stroke | java.awt.Stroke | Çizgi. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Mevcut dönüşümü buna ayarla.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Dönüşüm. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Mevcut grafik durumuna kayma dönüşümü ekler (mevcut matrisi kaydır).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| shx | float | X eksenindeki kayma. |
| shy | float | Y eksenindeki kayma. |

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


Mevcut grafik durumuna dönüşüm ekler (bu matrisi mevcut matrisle birleştirir).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Dönüşüm. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Mevcut grafik durumuna çeviri ekler (mevcut matrisi çevirir).

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | float | X yönündeki çeviri. |
| y | float | Y yönündeki çeviri. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Geçerli grafik durumunun geri yüklenmesini yazar (PostScript spesifikasyonunda "grestore" operatörüne bakın).

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Geçerli grafik durumunun kaydedilmesini yazar (PostScript spesifikasyonunda "gsave" operatörüne bakın).

