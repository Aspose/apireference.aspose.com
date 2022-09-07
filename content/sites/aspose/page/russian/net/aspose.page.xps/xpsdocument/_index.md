---
title: XpsDocument
second_title: Справочник по Aspose.Page для .NET API
description: Класс инкапсулирующий основной объект XPSдокумента который предоставляет методы манипулирования для любого элемента XPS.
type: docs
weight: 410
url: /ru/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Класс, инкапсулирующий основной объект XPS-документа, который предоставляет методы манипулирования для любого элемента XPS.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [XpsDocument](xpsdocument#constructor)() | Создает пустой документ XPS с размером страницы по умолчанию. |
| [XpsDocument](xpsdocument#constructor_2)(string) | Открывает существующий документ XPS, расположенный в*path* . |
| [XpsDocument](xpsdocument#constructor_1)(Stream, LoadOptions) | Загружает существующий документ, хранящийся в*stream* как документ XPS. |
| [XpsDocument](xpsdocument#constructor_3)(string, LoadOptions) | Открывает существующий документ, расположенный в*path* как документ XPS. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument) { get; } | Получает номер активного документа. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage) { get; } | Получает номер активной страницы в активном документе. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount) { get; } | Возвращает количество документов внутри пакета XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket) { get; set; } | Возвращает/устанавливает задание печати документа ticket |
| [Page](../../aspose.page.xps/xpsdocument/page) { get; } | Возвращает[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage) экземпляр для активной страницы. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount) { get; } | Возвращает количество страниц в активном документе. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount) { get; } | Возвращает общее количество страниц во всех документах внутри документа XPS. |

## Методы

| Имя | Описание |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add)(T) | Добавляет элемент содержимого (холст, контур или глифы) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas)() | Добавляет новый холст на активную страницу. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument)(bool) | Добавляет пустой документ с размером страницы по умолчанию. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument#adddocument_1)(float, float, bool) | Добавляет пустой документ с размерами первой страницы *width* а также*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs)(XpsFont, float, float, float, string) | Добавляет новые глифы на активную страницу. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs#addglyphs_1)(string, float, FontStyle, float, float, string) | Добавляет новые глифы на активную страницу. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry)(string, int, XpsHyperlinkTarget) | Добавляет запись схемы в документ. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_1)(bool) | Добавляет в документ пустую страницу с размером страницы по умолчанию. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage)(XpsPage, bool) | Добавляет страницу в документ. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage#addpage_2)(float, float, bool) | Добавляет пустую страницу в документ с указанным *width* а также*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath)(XpsPathGeometry) | Добавляет новый путь к активной странице. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Создает новый сегмент эллиптической дуги. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas)() | Создает новый холст. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_5)(Color) | Создает новый цвет. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_6)(string, params float[]) | Создает новый цвет в цветовом пространстве на основе ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor)(XpsIccProfile, params float[]) | Создает новый цвет в цветовом пространстве на основе ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_3)(float, float, float) | Создает новый цвет в цветовом пространстве scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_1)(int, int, int) | Создает новый цвет в цветовом пространстве sRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_4)(float, float, float, float) | Создает новый цвет в цветовом пространстве scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor#createcolor_2)(int, int, int, int) | Создает новый цвет в цветовом пространстве sRGB. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont)(Stream) | Создает новый ресурс шрифта TrueType из потока. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont#createfont_1)(string, FontStyle) | Создает новый ресурс шрифта TrueType. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs)(XpsFont, float, float, float, string) | Создает новые глифы. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs#createglyphs_1)(string, float, FontStyle, float, float, string) | Создает новые глифы. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop_1)(Color, float) | Создает новую точку градиента. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop#creategradientstop)(XpsColor, float) | Создает новую точку градиента. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile)(Stream) | Создает новый ресурс профиля ICC из*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile#createiccprofile_1)(string) | Создает новый ресурс профиля ICC из файла профиля ICC, расположенного по адресу the *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage)(Stream) | Создает новый ресурс изображения из*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage#createimage_1)(string) | Создает новый ресурс изображения из файла изображения, расположенного по адресу*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush_1)(string, RectangleF, RectangleF) | Создает новую кисть изображения. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush#createimagebrush)(XpsImage, RectangleF, RectangleF) | Создает новую кисть изображения. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush_1)(PointF, PointF) | Создает новую кисть линейного градиента. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Создает новую кисть линейного градиента. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix)(float, float, float, float, float, float) | Создает новую матрицу аффинного преобразования. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath)(XpsPathGeometry) | Создает новый путь. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure)(PointF, bool) | Создает новую фигуру пути. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Создает новую фигуру пути. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry)() | Создает новую геометрию пути. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Создает новую геометрию пути с указанным списком фигур пути. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry#createpathgeometry_2)(string) | Создает новую геометрию пути, указанную в сокращенной форме. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment)(PointF[], bool) | Создает новый набор кубических кривых Безье. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment)(PointF[], bool) | Создает новый многоугольный рисунок, содержащий произвольное количество отдельных вершин. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment)(PointF[], bool) | Создает новый набор квадратичных кривых Безье от предыдущей точки на фигуре пути через set вершин, используя указанные контрольные точки. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush_1)(PointF, PointF, float, float) | Создает новую кисть радиального градиента. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Создает новую кисть радиального градиента. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush_1)(Color) | Создает новую кисть сплошного цвета. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush#createsolidcolorbrush)(XpsColor) | Создает новую кисть сплошного цвета. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush)(XpsContentElement, RectangleF, RectangleF) | Создает новую визуальную кисть. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose)() | Удаляет экземпляр. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket)(int) | Возвращает билет печати документа, проиндексированного*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket)(int, int) | Возвращает билет печати страницы, проиндексированной*pageIndex* в документе, проиндексированном*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert)(int, T) | Вставляет элемент (холст, контур или глифы) на активную страницу в*index* позиция. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas)(int) | Вставляет новый холст на активную страницу в*index* позиция. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument)(int, bool) | Вставляет пустой документ с размером страницы по умолчанию в*index* позиция. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument#insertdocument_1)(int, float, float, bool) | Вставляет пустой документ с размерами первой страницы *width* а также*height* в*index* позиция. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs)(int, XpsFont, float, float, float, string) | Вставляет новые глифы на активную страницу по адресу*index* позиция. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Вставляет новые глифы на активную страницу по адресу*index* позиция. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_1)(int, bool) | Вставляет пустую страницу в документ с размером страницы по умолчанию в*index* позиция. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage)(int, XpsPage, bool) | Вставляет страницу в документ в*index* позиция. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage#insertpage_2)(int, float, float, bool) | Вставляет пустую страницу в документ с указанным *width* а также*height* в*index* позиция. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath)(int, XpsPathGeometry) | Вставляет новый путь к активной странице в*index* позиция. |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge_1)(string[], Stream) | Объединение нескольких файлов XPS в один документ XPS. |
| [Merge](../../aspose.page.xps/xpsdocument/merge#merge)(string[], Device, SaveOptions) | Объединение документов XPS в PDF с помощью[`Device`](../../aspose.page/device) экземпляр. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove)(T) | Удаляет элемент с активной страницы. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat)(int) | Удаляет элемент в*index* позиция с активной страницы. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat)(int) | Удаляет документ в*index* позиция. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage)(XpsPage) | Удаляет страницу из документа. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat)(int) | Удаляет страницу из документа в*index* позиция. |
| [Save](../../aspose.page.xps/xpsdocument/save#save_1)(Stream) | Сохраняет документ XPS в поток. |
| [Save](../../aspose.page.xps/xpsdocument/save#save_2)(string) | Сохраняет документ XPS в файл XPS, расположенный по адресу*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save#save)(Device, SaveOptions) | Сохраняет документ, используя[`Device`](../../aspose.page/device) экземпляр. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument)(int) | Выбирает активный документ для редактирования. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage)(int) | Выбирает активную страницу документа для редактирования. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket)(int, DocumentPrintTicket) | Связывает*printTicket* к документу, проиндексированному*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket)(int, int, PagePrintTicket) | Связывает*printTicket* на страницу, проиндексированную*pageIndex* в документе, проиндексированном*documentIndex* . |

### Смотрите также

* class [Document](../../aspose.page/document)
* пространство имен [Aspose.Page.XPS](../../aspose.page.xps)
* сборка [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
