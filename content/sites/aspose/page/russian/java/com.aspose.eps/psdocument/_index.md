---
title: "PsDocument"
second_title: "Справочник API Aspose.Page для Java"
description: "Этот класс инкапсулирует документы PS/EPS."
type: docs
weight: 16
url: /ru/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Этот класс инкапсулирует документы PS/EPS.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PsDocument()](#PsDocument--) | Инициализирует пустой  PsDocument  с инициализированной страницей. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Инициализирует пустой  PsDocument  с инициализированной страницей. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Инициализирует пустой  PsDocument  с инициализированной страницей. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Инициализирует пустой  PsDocument . |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Инициализирует пустой  PsDocument . |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Инициализирует пустой  PsDocument  когда количество страниц Postscript‑документа известно заранее. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Инициализирует пустой  PsDocument  когда количество страниц Postscript‑документа известно заранее. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Инициализирует  PsDocument  входным файлом PS/EPS. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Инициализирует  PsDocument  потоком файла PS/EPS. |
## Методы

| Метод | Описание |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Добавляет обрезку к текущему графическому состоянию. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Добавляет обрезку к текущему графическому состоянию и затем записывает оператор "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Добавляет прямоугольник обрезки к текущему графическому состоянию. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Добавляет обрезку из контура заданного текста в заданном шрифте. |
| [closePage()](#closePage--) | Завершает текущую страницу. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Преобразует шрифт Type 1 в TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Преобразует шрифт Type 3 в TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Преобразует шрифт Type 3 в TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Обрезает указанный  PsDocument  как EPS‑файл. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Рисует произвольный путь. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Рисует маскированное изображение. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Рисует изображение. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Рисует преобразованное изображение с фоном. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Рисует преобразованное прозрачное изображение с фоном. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Читает EPS‑файл и извлекает ограничивающий прямоугольник EPS‑изображения из комментария %%BoundingBox или границы для размера страницы по умолчанию (0, 0, 595, 842), если он не существует. |
| [extractEpsSize()](#extractEpsSize--) | Читает EPS‑файл и извлекает размер EPS‑изображения из комментария %%BoundingBox или размер страницы по умолчанию (595, 842), если он не существует. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Извлекает текст из PS‑файла. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Заполнить произвольный контур. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Добавляет строку текста, заполняя внутреннюю часть глифов. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Получает количество страниц в полученном PDF‑документе. |
| [getPaint()](#getPaint--) | Получает заливку в текущем графическом состоянии. |
| [getStroke()](#getStroke--) | Получает обводку в текущем графическом состоянии. |
| [getXmpMetadata()](#getXmpMetadata--) | Читает файл PS/EPS и извлекает XmpMetdata, если он уже существует, или добавляет новый, если его нет. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Указывает, доступна ли лицензия продукта Aspose.Page for Java и является ли она действительной. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Объединяет файлы PS/EPS в устройство. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Объединяет файлы PS/EPS в устройство. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Объединяет файлы PS/EPS в устройство. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Создаёт новую страницу и делает её текущей. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Создаёт новую страницу с размером документа и делает её текущей. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Добавляет строку текста, рисуя контуры глифов. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Добавляет строку текста, рисуя контуры глифов. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Изменяет размер заданного PsDocument как EPS‑файл. |
| [rotate(float angleRadians)](#rotate-float-) | Добавляет вращение против часовой стрелки относительно начала координат в текущее графическое состояние (поворачивает текущую матрицу). |
| [rotate(int angleDegrees)](#rotate-int-) | Добавляет вращение против часовой стрелки относительно начала координат в текущее графическое состояние (поворачивает текущую матрицу). |
| [save()](#save--) | Сохраняет заданный PsDocument как PS‑ или EPS‑файл. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Сохраняет файл PS/EPS в устройство. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Сохраняет заданный PsDocument в поток. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Сохраняет заданный PsDocument как EPS‑файл. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Сохраняет файл PS/EPS в графический файл. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Сохраняет файл PS/EPS в графический файл в указанный каталог с указанным именем файла. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Сохраняет файл PS/EPS в массивы байтов изображений. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Сохраняет файл PS/EPS в выходной PDF‑поток. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Сохраняет файл PS/EPS в PDF‑файл. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Сохраняет объект BufferedImage в EPS‑файл. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Сохраняет объект BufferedImage в EPS‑файл. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Сохраняет изображение PNG/JPEG/BMP/GIF из входного потока в EPS‑выходной поток. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Сохраняет изображение PNG/JPEG/BMP/GIF из файла в EPS‑файл. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Добавляет масштаб к текущему графическому состоянию (масштабирует текущую матрицу). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Указывает входной поток. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Устанавливает параметры устройства страницы (см. оператор "setpagedevice" в спецификации PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Устанавливает размер страницы. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Устанавливает заливку в текущем графическом состоянии. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Устанавливает обводку в текущем графическом состоянии. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Устанавливает текущую трансформацию в эту. |
| [shear(float shx, float shy)](#shear-float-float-) | Добавляет сдвиговую трансформацию к текущему графическому состоянию (сдвигает текущую матрицу). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Добавляет трансформацию к текущему графическому состоянию (конкатенирует эту матрицу с текущей). |
| [translate(float x, float y)](#translate-float-float-) | Добавляет перемещение к текущему графическому состоянию (перемещает текущую матрицу). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Записывает восстановление текущего графического состояния (см. спецификацию PostScript по оператору "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Записывает сохранение текущего графического состояния (см. спецификацию PostScript по оператору "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Инициализирует пустой  PsDocument  с инициализированной страницей. Этот конструктор используется только для дополнительных операций, не связанных с файлами PostScript, например, преобразования шрифтов.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Инициализирует пустой  PsDocument  с инициализированной страницей.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Путь к выходному файлу PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Набор параметров, контролирующих сохранение файла PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Инициализирует пустой  PsDocument  с инициализированной страницей.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| psStream | java.io.OutputStream | Поток, в который сохраняется файл PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Набор параметров, контролирующих сохранение файла PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Инициализирует пустой  PsDocument .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Путь к выходному файлу PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Набор параметров, контролирующих сохранение файла PostScript. |
| multipaged | boolean | Если false, страница не будет инициализирована. В этом случае инициализацию страницы следует выполнить через явный вызов "openPage(width, height)". |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Инициализирует пустой  PsDocument .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| psStream | java.io.OutputStream | Поток, в который сохраняется файл PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Набор параметров, контролирующих сохранение файла PostScript. |
| multipaged | boolean | Если false, страница не будет инициализирована. В этом случае инициализацию страницы следует выполнить через явный вызов "openPage(width, height)". |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Инициализирует пустой  PsDocument  когда количество страниц Postscript‑документа известно заранее.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Путь к выходному файлу PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Набор параметров, контролирующих сохранение файла PostScript. |
| numberOfPages | int | Количество страниц в документе PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Инициализирует пустой  PsDocument  когда количество страниц Postscript‑документа известно заранее.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| psStream | java.io.OutputStream | Поток, в который сохраняется файл PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Набор параметров, контролирующих сохранение файла PostScript. |
| numberOfPages | int | Количество страниц в документе PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Инициализирует  PsDocument  входным файлом PS/EPS.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| psFilePath | java.lang.String | Путь к файлу PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Инициализирует  PsDocument  потоком файла PS/EPS.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| psStream | java.io.InputStream | Поток файла PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Добавляет обрезку к текущему графическому состоянию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| s | java.awt.Shape | Контур обрезки. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Добавляет обрезку к текущему графическому состоянию и затем записывает оператор "newpath". Это необходимо выполнить, чтобы избежать слияния этого контура обрезки с некоторыми последующими путями, такими как глифы, очерченные оператором "charpath".

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| s | java.awt.Shape | Контур обрезки. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Добавляет прямоугольник обрезки к текущему графическому состоянию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| прямоугольник | java.awt.geom.Rectangle2D.Float | Прямоугольник обрезки. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Добавляет обрезку из контура заданного текста в заданном шрифте.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст. |
| шрифт | java.awt.Font | Шрифт. |
| x | float | Координата X позиции текста. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Завершает текущую страницу.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Преобразует шрифт Type 1 в TrueType. Имя полученного TTF‑файла будет таким же, как у входного шрифта Type 1, но с расширением ".ttf". TTF‑файл будет сохранён в указанном выходном каталоге.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Путь к файлу шрифта Type 1.. |
| outputDir | java.lang.String | Выходной каталог, в котором сохраняется полученный шрифт TrueType. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Преобразует шрифт Type 3 в TrueType. TTF‑файл будет сохранён в предоставленный выходной поток.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Путь к файлу шрифта Type 3. |
| outputStream | java.io.OutputStream | Выходной поток, в который сохраняется полученный шрифт TrueType. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Преобразует шрифт Type 3 в TrueType. Имя полученного TTF‑файла будет таким же, как у входного шрифта Type 3, но с расширением ".ttf". TTF‑файл будет сохранён в указанный выходной каталог.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Путь к файлу шрифта Type 3.. |
| outputDir | java.lang.String | Выходной каталог, в котором сохраняется полученный шрифт TrueType. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Обрезает заданный PsDocument как EPS‑файл. Сохраняет исходный EPS‑файл с обновлённым существующим %%BoundingBox или создаёт новый.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Обрезная рамка (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Рисует произвольный путь.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| shape | java.awt.Shape | Путь для заполнения. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Рисует маскированное изображение.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | Изображение для отрисовки. Должно быть в формате 24bpp RGB. |
| alphaMask1bpp | java.awt.image.BufferedImage | Маска изображения. Должна быть в формате 1bpp. |
| transform | java.awt.geom.AffineTransform | Матрица для преобразования изображения. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Рисует изображение.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Изображение для отрисовки. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Рисует преобразованное изображение с фоном.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Изображение для отрисовки. |
| transform | java.awt.geom.AffineTransform | Матрица для преобразования изображения. |
| bkg | java.awt.Color | Фон для изображения. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Отрисовать преобразованное прозрачное изображение с фоном. Если у изображения нет альфа-канала, оно будет отрисовано как непрозрачное.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Изображение для отрисовки. |
| transform | java.awt.geom.AffineTransform | Матрица для преобразования изображения. |
| transparencyThreshold | int | Порог, определяющий, с какого значения прозрачности пиксель будет считаться полностью прозрачным. Все значения ниже этого порога будут считаться полностью непрозрачными. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Читает EPS‑файл и извлекает ограничивающий прямоугольник EPS‑изображения из комментария %%BoundingBox или границы для размера страницы по умолчанию (0, 0, 595, 842), если он не существует.

**Returns:**
int[] - Ограничивающая рамка EPS‑изображения.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Читает EPS‑файл и извлекает размер EPS‑изображения из комментария %%BoundingBox или размер страницы по умолчанию (595, 842), если он не существует.

**Returns:**
java.awt.Dimension - Размер EPS‑изображения.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Извлекает текст из PS‑файла. Работает только с текстом, написанным шрифтами TrueType (Type 42) или составными шрифтами (Type 0), состоящими из TrueType.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Параметры сохранения. |
| startPage | int | Страница, с которой включительно начинать извлечение текста. |
| endPage | int | Страница, из которой включительно извлекать текст. |

**Returns:**
java.lang.String - Текст, содержащийся в выбранных страницах PS‑файла.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Заполнить произвольный контур.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| shape | java.awt.Shape | Путь для заполнения. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | java.awt.Paint | Заливка, используемая для рисования внутренней части глифов. |
| strokePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | java.awt.Paint | Заливка, используемая для рисования внутренней части глифов. |
| strokePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. advances Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| advances | float[] |  |
| шрифт | java.awt.Font | Системный шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | java.awt.Paint | Заливка, используемая для рисования внутренней части глифов. |
| strokePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Добавляет строку текста, заполняя внутреннюю часть глифов и рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| шрифт | java.awt.Font | Системный шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fillPaint | java.awt.Paint | Заливка, используемая для рисования внутренней части глифов. |
| strokePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | java.awt.Paint | Заливка, используемая для рисования глифов. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | java.awt.Paint | Заливка, используемая для рисования глифов. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| шрифт | java.awt.Font | Системный шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| шрифт | java.awt.Font | Шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | java.awt.Paint | Заливка, используемая для рисования глифов. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| шрифт | java.awt.Font | Системный шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Добавляет строку текста, заполняя внутреннюю часть глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| шрифт | java.awt.Font | Шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| fill | java.awt.Paint | Заливка, используемая для рисования глифов. |

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


Получает количество страниц в полученном PDF‑документе.

**Returns:**
int - количество страниц.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Получает заливку в текущем графическом состоянии.

**Returns:**
java.awt.Paint - Текущая заливка.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Получает обводку в текущем графическом состоянии.

**Returns:**
java.awt.Stroke — текущий штрих.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Читает файл PS/EPS и извлекает XmpMetdata, если он уже существует, или добавляет новый, если его нет.

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


Указывает, доступна ли лицензия продукта Aspose.Page for Java и является ли она действительной.

**Returns:**
boolean — логическое значение
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Объединяет файлы PS/EPS в устройство.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | PS/EPS файлы для объединения с этим файлом в выходное устройство. |
| device | [Device](../../com.aspose.page/device) | Устройство вывода. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Объединяет файлы PS/EPS в устройство.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Выходной поток PDF. |
| filesForMerge | java.lang.String[] | PS/EPS файлы для объединения с этим файлом в выходное устройство. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Объединяет файлы PS/EPS в устройство.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Путь к выходному PDF‑файлу. |
| filesForMerge | java.lang.String[] | PS/EPS файлы для объединения с этим файлом в выходное устройство. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

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


Создаёт новую страницу и делает её текущей.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина новой страницы. |
| высота | float | Высота новой страницы. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Создаёт новую страницу с размером документа и делает её текущей.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pageName | java.lang.String | Имя новой страницы. Если оно равно null, имя страницы будет порядковым номером страницы. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| outlinePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont  который будет использоваться для отрисовки текста. Его можно использовать с пользовательским шрифтом, расположенным в пользовательской папке. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| outlinePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| шрифт | java.awt.Font | Системный шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| advances | float[] | Массив ширин глифов. Его длина должна соответствовать количеству глифов в строке. |
| шрифт | java.awt.Font | Шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| outlinePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| шрифт | java.awt.Font | Системный шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Добавляет строку текста, рисуя контуры глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| текст | java.lang.String | Текст для добавления. |
| шрифт | java.awt.Font | Шрифт, который будет использоваться для отрисовки текста. |
| x | float | Координата X начала текста. |
| y | float | Координата Y начала текста. |
| outlinePaint | java.awt.Paint | java.awt.Paint, используемый для рисования контуров глифов. Может быть любой подкласс класса java.awt.Paint в JDK. |
| stroke | java.awt.Stroke | Штрих, используемый для рисования контуров глифов. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Изменяет размер заданного PsDocument как EPS‑файла. Этот метод используется только после извлечения размера EPS. Он сохраняет исходный EPS‑файл с обновлённым существующим %%BoundingBox, либо создаётся новый. Также будет установлен матрица преобразования страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Новый размер EPS‑изображения в заданных единицах. |
| units | [Units](../../com.aspose.page/units) | Единицы нового размера. Может быть точками, дюймами, миллиметрами, сантиметрами и процентами от исходного размера. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Добавляет вращение против часовой стрелки относительно начала координат в текущее графическое состояние (поворачивает текущую матрицу).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angleRadians | float | Угол вращения в радианах. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Добавляет вращение против часовой стрелки относительно начала координат в текущее графическое состояние (поворачивает текущую матрицу).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angleDegrees | int | Угол вращения в градусах. |

### save() {#save--}
```
public void save()
```


Сохраняет заданный PsDocument как PS или EPS‑файл. Этот метод используется только когда PsDocument был создан с нуля.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Сохраняет файл PS/EPS в устройство.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Устройство вывода. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Сохраняет заданный PsDocument в поток. Этот метод используется только после обновления XMP‑метаданных. Он сохраняет исходный EPS‑файл с обновлёнными существующими метаданными или создаёт новый при вызове метода getMetadata. В последнем случае добавляется весь необходимый PostScript‑код и EPS‑комментарии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Поток выходного EPS‑файла. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Сохраняет заданный PsDocument как EPS‑файл. Этот метод используется только после обновления XMP‑метаданных. Он сохраняет исходный EPS‑файл с обновлёнными существующими метаданными или создаёт новый при вызове метода getMetadata. В последнем случае добавляется весь необходимый PostScript‑код и EPS‑комментарии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Путь к выходному файлу EPS.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Сохраняет файл PS/EPS в файл изображения. Выходной каталог и имя файла будут такими же, как у входного файла PS. Расширение файла будет соответствовать формату изображения, указанному в параметре "options". Если документ был инициализирован потоком, не производным от FileInputStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Содержит необходимые параметры для сохранения изображения и флаги, указывающие вывод ошибок, возникших во время конвертации. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Сохраняет файл PS/EPS в файл изображения в указанный каталог с указанным именем файла. Расширение файла будет соответствовать формату изображения, указанному в параметре "options".

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Содержит необходимые параметры для сохранения изображения и флаги, указывающие вывод ошибок, возникших во время конвертации. |
| outDir | java.lang.String | Выходной каталог, в котором будет сохранён файл изображения. |
| fileNameTemplate | java.lang.String | Шаблон имени файла для изображения (без расширения). Если входной файл PS/EPS состоит из одной страницы, он будет точно именем файла, иначе "\_[n]", где "n" — номер страницы, начиная с 0, к этому будет добавлен суффикс. Расширение файла будет соответствовать формату изображения, указанному в параметре "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Сохраняет файл PS/EPS в массивы байтов изображений.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Содержит необходимые параметры для сохранения изображения и флаги, указывающие вывод ошибок, возникших во время конвертации. |

**Returns:**
byte[][] — байты изображений. Один массив байтов для одной страницы.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Сохраняет файл PS/EPS в выходной PDF‑поток.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Выходной поток PDF. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Сохраняет файл PS/EPS в PDF‑файл.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Путь к выходному PDF‑файлу. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Содержит флаги, указывающие вывод ошибок, возникших во время преобразования. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Сохраняет объект BufferedImage в EPS‑файл.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Изображение. |
| epsStream | java.io.OutputStream | Поток вывода EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Содержит параметры, указывающие вывод ошибок, возникших при конвертации. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Сохраняет объект BufferedImage в EPS‑файл.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Изображение. |
| epsFilePath | java.lang.String | Путь к файлу EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Содержит параметры, указывающие вывод ошибок, возникших при конвертации. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Сохраняет изображение PNG/JPEG/BMP/GIF из входного потока в EPS‑выходной поток.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageStream | java.io.InputStream | Входной поток изображения. |
| epsStream | java.io.OutputStream | Поток вывода EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Содержит параметры, указывающие вывод ошибок, возникших при конвертации. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Сохраняет изображение PNG/JPEG/BMP/GIF из файла в EPS‑файл.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFilePath | java.lang.String | Путь к файлу изображения. |
| epsFilePath | java.lang.String | Путь к файлу EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Содержит параметры, указывающие вывод ошибок, возникших при конвертации. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Добавляет масштаб к текущему графическому состоянию (масштабирует текущую матрицу).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xScale | float | Масштаб по оси X. |
| yScale | float | Масштаб по оси Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Указывает входной поток.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| is | java.io.InputStream | Входной поток файла PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Устанавливает параметры устройства страницы (см. оператор "setpagedevice" в спецификации PostScript). Среди них могут быть размер страницы, цвет и т.д.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Параметры страницы. В этом словаре могут быть размер страницы и цвет и т.д. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Устанавливает размер страницы. Чтобы создать страницы разных размеров в одном документе, используйте метод  setPageDevice  сразу после этого метода.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина страницы в результирующем файле PostScript. |
| высота | float | Высота страницы в результирующем файле PostScript. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Устанавливает заливку в текущем графическом состоянии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| paint | java.awt.Paint | Объект paint. Он может быть любой подсущностью класса  Paint  существующего в JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Устанавливает обводку в текущем графическом состоянии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| stroke | java.awt.Stroke | Обводка. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Устанавливает текущую трансформацию в эту.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Преобразование. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Добавляет сдвиговую трансформацию к текущему графическому состоянию (сдвигает текущую матрицу).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| shx | float | Сдвиг по оси X. |
| shy | float | Сдвиг по оси Y. |

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


Добавляет трансформацию к текущему графическому состоянию (конкатенирует эту матрицу с текущей).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Преобразование. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Добавляет перемещение к текущему графическому состоянию (перемещает текущую матрицу).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | Перемещение в направлении X. |
| y | float | Перемещение в направлении Y. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Записывает восстановление текущего графического состояния (см. спецификацию PostScript по оператору "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Записывает сохранение текущего графического состояния (см. спецификацию PostScript по оператору "gsave").

