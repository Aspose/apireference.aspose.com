---
title: "XpsDocument"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий основную сущность документа XPS, предоставляющий методы манипуляции любым элементом XPS."
type: docs
weight: 19
url: /ru/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Класс, инкапсулирующий основную сущность документа XPS, предоставляющий методы манипуляции любым элементом XPS.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Создаёт пустой документ XPS с размером страницы по умолчанию. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Открывает существующий документ XPS, расположенный по пути . |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Загружает существующий документ, хранящийся в  stream  как документ XPS. |
## Методы

| Метод | Описание |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Добавляет элемент содержимого (Canvas, Path или Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Вставляет элемент (Canvas, Path или Glyphs) на активную страницу в позицию  index . |
| [<T>remove(T element)](#-T-remove-T-) | Удаляет элемент с активной страницы. |
| [addCanvas()](#addCanvas--) | Добавляет новый canvas на активную страницу. |
| [addDocument()](#addDocument--) | Добавляет пустой документ с размером страницы по умолчанию и делает добавленный документ активным. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Добавляет пустой документ с размером страницы по умолчанию. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Добавляет пустой документ с размерами первой страницы  width  и  height  и делает добавленный документ активным. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Добавляет пустой документ с размерами первой страницы  width  и  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Добавляет новые глифы на активную страницу. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Добавляет новые глифы на активную страницу. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Добавляет запись оглавления в документ. |
| [addPage()](#addPage--) | Добавляет пустую страницу в документ с размером страницы по умолчанию. |
| [addPage(boolean activate)](#addPage-boolean-) | Добавляет пустую страницу в документ с размером страницы по умолчанию. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Добавляет страницу в документ и делает добавленную страницу активной. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Добавляет страницу в документ. |
| [addPage(float width, float height)](#addPage-float-float-) | Добавляет пустую страницу в документ с указанными  width  и  height . |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Добавляет пустую страницу в документ с указанными  width  и  height . |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Добавляет новый путь на активную страницу. |
| [close()](#close--) | Освобождает экземпляр. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Создаёт новый сегмент эллиптической дуги с обводкой. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Создаёт новый сегмент эллиптической дуги. |
| [createCanvas()](#createCanvas--) | Создаёт новый canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Создаёт новый цвет. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Создаёт новый ресурс шрифта TrueType из потока. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Создаёт новый ресурс шрифта TrueType. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Создаёт новые glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Создаёт новые glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Создаёт новую градиентную остановку. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Создаёт новую градиентную остановку. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Создаёт новый ресурс ICC‑профиля из  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Создаёт новый ресурс ICC‑профиля из файла ICC‑профиля, расположенного по пути  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Создаёт новый ресурс изображения из  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Создаёт новый ресурс изображения из файла изображения, расположенного по пути  imagePath . |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Создаёт новую кисть изображения. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Создаёт новую кисть изображения. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Создаёт новую линейную градиентную кисть. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Создаёт новую линейную градиентную кисть. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Создаёт новую аффинную матрицу преобразования. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Создаёт новый path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Создаёт новую открытую фигуру пути. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Создаёт новую фигуру пути. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Создаёт новую открытую фигуру пути. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Создаёт новую фигуру пути. |
| [createPathGeometry()](#createPathGeometry--) | Создаёт новую геометрию пути. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Создает новую геометрию пути, указанную в сокращенной форме. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Создает новую геометрию пути с указанным списком фигур пути. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Создает новый набор обведенных кубических B?zier кривых. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Создает новый набор кубических B?zier кривых. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Создает новое обведенное полигональное изображение, содержащее произвольное количество отдельных вершин. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Создает новое полигональное изображение, содержащее произвольное количество отдельных вершин. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Создает новый набор обведенных квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Создает новый набор квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Создает новую кисть радиального градиента. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Создает новую кисть радиального градиента. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Создает новую кисть сплошного цвета. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Создает новую кисть сплошного цвета. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Создает новую визуальную кисть. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getActiveDocument()](#getActiveDocument--) | Возвращает номер активного документа. |
| [getActivePage()](#getActivePage--) | Возвращает номер активной страницы в активном документе. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Возвращает количество документов внутри пакета XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Получает печатный билет документа с индексом  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Возвращает печатный билет задания документа. |
| [getPage()](#getPage--) | Возвращает экземпляр  XpsPage  для активной страницы. |
| [getPageCount()](#getPageCount--) | Возвращает количество страниц в активном документе. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Получает печатный билет страницы с индексом  pageIndex  в документе с индексом  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Возвращает общее количество страниц во всех документах внутри XPS‑документа. |
| [getUtils()](#getUtils--) | Получает объект, предоставляющий утилиты, выходящие за рамки официального API манипуляции XPS. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Вставляет новый холст на активную страницу в позицию  index . |
| [insertDocument(int index)](#insertDocument-int-) | Вставляет пустой документ с размером страницы по умолчанию в позицию  index  и делает вставленный документ активным. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Вставляет пустой документ с размером страницы по умолчанию в позицию  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Вставляет пустой документ с размерами первой страницы  width  и  height  в позицию  index  и делает вставленный документ активным. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Вставляет пустой документ с размерами первой страницы  width  и  height  в позиции  index  position. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Вставляет новые глифы на активную страницу в позиции  index  position. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Вставляет новые глифы на активную страницу в позиции  index  position. |
| [insertPage(int index)](#insertPage-int-) | Вставляет пустую страницу в документ с размером страницы по умолчанию в позиции  index  position и выбирает вставленную страницу как активную. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Вставляет пустую страницу в документ с размером страницы по умолчанию в позиции  index  position. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Вставляет страницу в документ в позиции  index  position и выбирает вставленную страницу как активную. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Вставляет страницу в документ в позиции  index  position. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Вставляет пустую страницу в документ с указанными  width  и  height  в позиции  index  position и выбирает вставленную страницу как активную. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Вставляет пустую страницу в документ с указанными  width  и  height  в позиции  index  position. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Вставляет новый путь на активную страницу в позиции  index  position. |
| [isLicensed()](#isLicensed--) | Указывает, доступна ли лицензия продукта Aspose.Page for Java и является ли она действительной. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Объединение нескольких файлов XPS в один документ XPS. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Объединение нескольких файлов XPS в один документ XPS. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Объединение документов XPS в PDF с использованием экземпляра  Device  . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Объединение документов XPS в PDF с использованием экземпляра  Device  . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Удаляет элемент в позиции  index  position с активной страницы. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Удаляет документ в позиции  index  position. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Удаляет страницу из документа. |
| [removePageAt(int index)](#removePageAt-int-) | Удаляет страницу из документа в позиции  index  position. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Сохраняет документ с использованием экземпляра  Device  . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Сохраняет документ XPS в поток. |
| [save(String path)](#save-java.lang.String-) | Сохраняет документ XPS в файл XPS, расположенный по пути  path . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Сохраняет документ в файл изображения. Каталог вывода и имя файла будут такими же, как у входного файла XPS. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Сохраняет документ в файл изображения в указанный каталог с указанным именем файла. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Сохраняет документ в формате растрового изображения в виде массивов байтов. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Сохраняет документ в формате PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Сохраняет документ в формате PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Сохраняет документ в формате PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Сохраняет документ в формате PostSscript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Выбирает активный документ для редактирования. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Выбирает активную страницу документа для редактирования. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Связывает printTicket с документом, индексированным по documentIndex. |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Устанавливает печатный билет задания документа. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Связывает printTicket со страницей, индексированной по pageIndex, в документе, индексированном по documentIndex. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Создаёт пустой документ XPS с размером страницы по умолчанию.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Открывает существующий документ XPS, расположенный по пути .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| path | java.lang.String | Расположение документа. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Загружает существующий документ, хранящийся в  stream  как документ XPS.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.InputStream | Поток документа. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Параметры загрузки документа. |

### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Добавляет элемент содержимого (Canvas, Path или Glyphs)

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| элемент | T | Элемент для добавления. |

**Returns:**
T - Добавленный элемент.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Вставляет элемент (Canvas, Path или Glyphs) на активную страницу в позицию  index .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой элемент должен быть вставлен. |
| элемент | T | Элемент для вставки. |

**Returns:**
T - Вставленный элемент.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Удаляет элемент с активной страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| элемент | T | Элемент для удаления. |

**Returns:**
T - Удалённый элемент.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Добавляет новый canvas на активную страницу.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Добавляет пустой документ с размером страницы по умолчанию и делает добавленный документ активным.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Добавляет пустой документ с размером страницы по умолчанию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| активировать | boolean | Флаг, указывающий, следует ли выбрать добавленный документ как активный. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Добавляет пустой документ с размерами первой страницы  width  и  height  и делает добавленный документ активным.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина первой страницы. |
| высота | float | Высота первой страницы. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Добавляет пустой документ с размерами первой страницы  width  и  height .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина первой страницы. |
| высота | float | Высота первой страницы. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать добавленный документ как активный. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Добавляет новые глифы на активную страницу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ресурс шрифта. |
| fontRenderingEmSize | float | Размер шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Добавляет новые глифы на активную страницу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontRenderingEmSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Добавляет запись оглавления в документ.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| описание | java.lang.String | Описание записи. |
| outlineLevel | int | Уровень структуры. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Целевой объект входа. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Добавляет пустую страницу в документ с размером страницы по умолчанию.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Добавляет пустую страницу в документ с размером страницы по умолчанию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| активировать | boolean | Флаг, указывающий, следует ли выбрать добавленную страницу как активную. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Добавляет страницу в документ и делает добавленную страницу активной.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Страница для добавления. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Добавляет страницу в документ.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Страница для добавления. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать добавленную страницу как активную. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Добавляет пустую страницу в документ с указанными  width  и  height .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина новой страницы. |
| высота | float | Высота новой страницы. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Добавляет пустую страницу в документ с указанными  width  и  height .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | Ширина новой страницы. |
| высота | float | Высота новой страницы. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать добавленную страницу как активную. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Добавляет новый путь на активную страницу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Освобождает экземпляр.

### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Создаёт новый сегмент эллиптической дуги с обводкой.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | java.awt.geom.Point2D | Конечная точка эллиптической дуги. |
| размер | java.awt.geom.Dimension2D | Радиусы x и y эллиптической дуги в виде пары x,y. |
| rotationAngle | float | Указывает, как эллипс вращается относительно текущей системы координат. |
| isLargeArc | boolean | Определяет, рисуется ли дуга с охватом 180 градусов или более. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Направление, в котором рисуется дуга. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Создаёт новый сегмент эллиптической дуги.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | java.awt.geom.Point2D | Конечная точка эллиптической дуги. |
| размер | java.awt.geom.Dimension2D | Радиусы x и y эллиптической дуги в виде пары x,y. |
| rotationAngle | float | Указывает, как эллипс вращается относительно текущей системы координат. |
| isLargeArc | boolean | Определяет, рисуется ли дуга с охватом 180 градусов или более. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Направление, в котором рисуется дуга. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Создаёт новый canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Создаёт новый цвет в цветовом пространстве на основе ICC.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | Ресурс ICC‑профиля. |
| components | float[] | Компоненты цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Создаёт новый цвет в цветовом пространстве scRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| r | float | Красный компонент цвета. |
| g | float | Зелёный компонент цвета. |
| b | float | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Создаёт новый цвет в цветовом пространстве scRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | float | Альфа‑компонент цвета. |
| r | float | Красный компонент цвета. |
| g | float | Зелёный компонент цвета. |
| b | float | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Создаёт новый цвет в цветовом пространстве sRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| r | int | Красный компонент цвета. |
| g | int | Зелёный компонент цвета. |
| b | int | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Создаёт новый цвет в цветовом пространстве sRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | int | Альфа‑компонент цвета. |
| r | int | Красный компонент цвета. |
| g | int | Зелёный компонент цвета. |
| b | int | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Создаёт новый цвет.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | java.awt.Color | Нативный объект цвета для RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Создаёт новый цвет в цветовом пространстве на основе ICC.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| path | java.lang.String | Путь к ICC‑профилю. |
| components | float[] | Компоненты цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Создаёт новый ресурс шрифта TrueType из потока.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.InputStream | Поток, содержащий ICC‑профиль, используемый в качестве ресурса. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Создаёт новый ресурс шрифта TrueType.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. См. константы класса XpsFont (являются битовыми флагами) для доступных комбинируемых значений. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Создаёт новые glyphs.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ресурс шрифта. |
| fontRenderingEmSize | float | Размер шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Создаёт новые glyphs.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontRenderingEmSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Создаёт новую градиентную остановку.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Цвет остановки градиента. |
| смещение | float | Смещение градиента. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Создаёт новую градиентную остановку.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | java.awt.Color | Цвет остановки градиента. |
| смещение | float | Смещение градиента. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Создаёт новый ресурс ICC‑профиля из  stream .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.InputStream | Поток, содержащий ICC‑профиль, используемый в качестве ресурса. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Создаёт новый ресурс ICC‑профиля из файла ICC‑профиля, расположенного по пути  iccProfilePath .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Путь к ICC‑профилю, используемому в качестве ресурса. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Создаёт новый ресурс изображения из  stream .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.InputStream | Поток, содержащий изображение, используемое в качестве ресурса. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Создаёт новый ресурс изображения из файла изображения, расположенного по пути  imagePath .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imagePath | java.lang.String | Путь к изображению, используемому в качестве ресурса. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Создаёт новую кисть изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Ресурс изображения. |
| viewbox | java.awt.geom.Rectangle2D | Позиция и размеры исходного содержимого кисти. |
| viewport | java.awt.geom.Rectangle2D | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Создаёт новую кисть изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imagePath | java.lang.String | Путь к изображению, используемому в качестве плитки кисти. |
| viewbox | java.awt.geom.Rectangle2D | Позиция и размеры исходного содержимого кисти. |
| viewport | java.awt.geom.Rectangle2D | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Создаёт новую линейную градиентную кисть.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка линейного градиента. |
| endPoint | java.awt.geom.Point2D | Конечная точка линейного градиента. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Создаёт новую линейную градиентную кисть.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Список остановок градиента. |
| startPoint | java.awt.geom.Point2D | Начальная точка линейного градиента. |
| endPoint | java.awt.geom.Point2D | Конечная точка линейного градиента. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Создаёт новую аффинную матрицу преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| m11 | float | Элемент 11. |
| m12 | float | Элемент 12. |
| m21 | float | Элемент 21. |
| m22 | float | Элемент 22. |
| m31 | float | Элемент 31. |
| m32 | float | Элемент 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Создаёт новый path.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Создаёт новую открытую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Создаёт новую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |
| isClosed | boolean | Указывает, замкнут ли путь. Если установлено значение true, штрих рисуется "замкнутым", то есть последняя точка последнего сегмента фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, иначе штрих рисуется "открытым", и последняя точка не соединяется с начальной точкой. Применяется только если фигура пути используется в элементе Path, который задает штрих. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Создаёт новую открытую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Список сегментов пути. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Создаёт новую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Список сегментов пути. |
| isClosed | boolean | Указывает, замкнут ли путь. Если установлено значение true, штрих рисуется "замкнутым", то есть последняя точка последнего сегмента фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, иначе штрих рисуется "открытым", и последняя точка не соединяется с начальной точкой. Применяется только если фигура пути используется в элементе Path, который задает штрих. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Создаёт новую геометрию пути.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Создает новую геометрию пути, указанную в сокращенной форме.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Сокращённая форма геометрии пути. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Создает новую геометрию пути с указанным списком фигур пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Список фигур пути. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Создает новый набор обведенных кубических B?zier кривых.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких B?bezier сегментов. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Создает новый набор кубических B?zier кривых.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких B?bezier сегментов. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Создает новое обведенное полигональное изображение, содержащее произвольное количество отдельных вершин.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Набор координат для нескольких сегментов, определяющих сегмент полилинии. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Создает новое полигональное изображение, содержащее произвольное количество отдельных вершин.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Набор координат для нескольких сегментов, определяющих сегмент полилинии. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Создает новый набор обведенных квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких квадратичных B?bezier сегментов. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Создает новый набор квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких квадратичных B?bezier сегментов. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Создает новую кисть радиального градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Центральная точка радиального градиента (то есть центр эллипса). |
| gradientOrigin | java.awt.geom.Point2D | Исходная точка радиального градиента. |
| radiusX | float | Радиус в измерении x эллипса, определяющего радиальный градиент. |
| radiusY | float | Радиус в измерении y эллипса, определяющего радиальный градиент. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Создает новую кисть радиального градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Список остановок градиента. |
| center | java.awt.geom.Point2D | Центральная точка радиального градиента (то есть центр эллипса). |
| gradientOrigin | java.awt.geom.Point2D | Исходная точка радиального градиента. |
| radiusX | float | Радиус в измерении x эллипса, определяющего радиальный градиент. |
| radiusY | float | Радиус в измерении y эллипса, определяющего радиальный градиент. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Создает новую кисть сплошного цвета.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Цвет для заполненных элементов. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Создает новую кисть сплошного цвета.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | java.awt.Color | Цвет для заполненных элементов. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Создает новую визуальную кисть.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Элемент XPS (Canvas, Path или Glyphs) для свойства Visual визуальной кисти. |
| viewbox | java.awt.geom.Rectangle2D | Позиция и размеры исходного содержимого кисти. |
| viewport | java.awt.geom.Rectangle2D | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Возвращает номер активного документа.

**Returns:**
int — целочисленное значение.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Возвращает номер активной страницы в активном документе.

**Returns:**
int — целочисленное значение.
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


Возвращает количество документов внутри пакета XPS.

**Returns:**
int - Количество документов внутри пакета XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Получает печатный билет документа с индексом  documentIndex .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| documentIndex | int | Индекс документа, чей печатный билет следует вернуть. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Возвращает печатный билет задания документа.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Возвращает экземпляр  XpsPage  для активной страницы.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Возвращает количество страниц в активном документе.

**Returns:**
int - Количество страниц в активном документе.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Получает печатный билет страницы с индексом  pageIndex  в документе с индексом  documentIndex .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| documentIndex | int | Индекс документа. |
| pageIndex | int | Индекс страницы, чей печатный билет следует вернуть. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Возвращает общее количество страниц во всех документах внутри XPS‑документа.

**Returns:**
int - Общее количество страниц во всех документах внутри XPS-документа.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Получает объект, предоставляющий утилиты, выходящие за рамки официального API манипуляции XPS.

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


Вставляет новый холст на активную страницу в позицию  index .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новый canvas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Вставляет пустой документ с размером страницы по умолчанию в позицию  index  и делает вставленный документ активным.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой документ должен быть вставлен. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Вставляет пустой документ с размером страницы по умолчанию в позицию  index .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой документ должен быть вставлен. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать вставленный документ как активный. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Вставляет пустой документ с размерами первой страницы  width  и  height  в позицию  index  и делает вставленный документ активным.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой документ должен быть вставлен. |
| ширина | float | Ширина первой страницы. |
| высота | float | Высота первой страницы. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Вставляет пустой документ с размерами первой страницы  width  и  height  в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой документ должен быть вставлен. |
| ширина | float | Ширина первой страницы. |
| высота | float | Высота первой страницы. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать вставленный документ как активный. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Вставляет новые глифы на активную страницу в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новые glyphs. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ресурс шрифта. |
| fontSize | float | Размер шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Вставляет новые глифы на активную страницу в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новые glyphs. |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Вставляет пустую страницу в документ с размером страницы по умолчанию в позиции  index  position и выбирает вставленную страницу как активную.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой страница должна быть вставлена. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Вставляет пустую страницу в документ с размером страницы по умолчанию в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой страница должна быть вставлена. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать вставленную страницу как активную. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Вставляет страницу в документ в позиции  index  position и выбирает вставленную страницу как активную.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой страница должна быть добавлена. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Страница для вставки. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Вставляет страницу в документ в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой страница должна быть добавлена. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Страница для вставки. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать вставленную страницу как активную. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Вставляет пустую страницу в документ с указанными  width  и  height  в позиции  index  position и выбирает вставленную страницу как активную.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой страница должна быть вставлена. |
| ширина | float | Ширина новой страницы. |
| высота | float | Высота новой страницы. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Вставляет пустую страницу в документ с указанными  width  и  height  в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой страница должна быть вставлена. |
| ширина | float | Ширина новой страницы. |
| высота | float | Высота новой страницы. |
| активировать | boolean | Флаг, указывающий, следует ли выбрать вставленную страницу как активную. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Вставляет новый путь на активную страницу в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новый path. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Указывает, доступна ли лицензия продукта Aspose.Page for Java и является ли она действительной.

**Returns:**
boolean — логическое значение
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Объединение нескольких файлов XPS в один документ XPS.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Файлы XPS для объединения с этим документом. |
| outStream | java.io.OutputStream | Поток вывода, в котором сохраняются объединённые документы XPS. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Объединение нескольких файлов XPS в один документ XPS.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Файлы XPS для объединения с этим документом. |
| outXpsFilePath | java.lang.String | Путь к выходному файлу XPS. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Объединение документов XPS в PDF с использованием экземпляра  Device  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Путь к выходному файлу PDF. |
| filesForMerge | java.lang.String[] | Файлы XPS для объединения с этим документом на выходном устройстве. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Параметры сохранения документа. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Объединение документов XPS в PDF с использованием экземпляра  Device  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Файлы XPS для объединения с этим документом на выходном устройстве. |
| pdfStream | java.io.OutputStream | Поток вывода для записи полученного PDF. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Параметры сохранения документа. |

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


Удаляет элемент в позиции  index  position с активной страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует удалить элемент. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Удаляет документ в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, из которой документ должен быть удалён. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Удаляет страницу из документа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Страница для удаления. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Удаляет страницу из документа в позиции  index  position.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, из которой страница должна быть удалена. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Сохраняет документ с использованием экземпляра  Device  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | У  Device  экземпляр. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Параметры сохранения документа. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Сохраняет документ XPS в поток.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.OutputStream | Поток XPS‑документа, в который будет сохраняться. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Сохраняет документ XPS в файл XPS, расположенный по пути  path .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| path | java.lang.String | Расположение документа. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Сохраняет документ в файл изображения. Каталог вывода и имя файла будут такими же, как у входного XPS‑файла. Расширение файла будет соответствовать формату изображения, указанному в параметре "options". Если документ был инициализирован потоком, который не является FileInputStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Параметры сохранения документа в формате растрового изображения. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Сохраняет документ в файл изображения в указанный каталог с указанным именем файла. Расширение файла будет соответствовать формату изображения, указанному в параметре "options".

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Параметры сохранения документа в формате растрового изображения. |
| outDir | java.lang.String | Каталог вывода, в котором будет сохранён файл изображения. |
| fileNameTemplate | java.lang.String | Шаблон имени файла для изображения (без расширения). Если входной XPS‑файл состоит из одной страницы, это будет именно имя файла, иначе будет добавлен суффикс "\_[n]", где "n" — номер страницы, начиная с 1. Расширение файла будет соответствовать формату изображения, указанному в параметре "option". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Сохраняет документ в формате растрового изображения в виде массивов байтов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Параметры сохранения документа в формате растрового изображения. |

**Returns:**
byte[][][] — массивы байтов полученных изображений. Первое измерение соответствует вложенным документам, второе — страницам внутри вложенных документов.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Сохраняет документ в формате PDF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.OutputStream | Поток, в который будет записан выходной PDF‑файл. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Параметры сохранения документа в формате PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Сохраняет документ в формате PDF.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Путь к выходному файлу PDF. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Параметры сохранения документа в формате PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Сохраняет документ в формате PS.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | java.io.OutputStream | Поток, в который будет записан выходной PS‑файл. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Параметры сохранения документа в формате PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Сохраняет документ в формате PostSscript.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Путь к выходному файлу PostScript. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Параметры сохранения документа в формате PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Выбирает активный документ для редактирования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| documentNumber | int | Номер документа. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Выбирает активную страницу документа для редактирования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pageNumber | int | Номер страницы. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Связывает printTicket с документом, индексированным по documentIndex.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| documentIndex | int | Индекс документа, к которому привязывается билет печати. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Билет печати для привязки. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Устанавливает печатный билет задания документа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Билет печати задания документа. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Связывает printTicket со страницей, индексированной по pageIndex, в документе, индексированном по documentIndex.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| documentIndex | int | Индекс документа. |
| pageIndex | int | Индекс страницы, к которой привязывается билет печати. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Билет печати для привязки. |

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

