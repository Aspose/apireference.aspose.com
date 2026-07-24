---
title: "Aspose::Page::XPS::XpsDocument класс"
linktitle: "XpsDocument"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument класс. Класс, инкапсулирующий основную сущность XPS‑документа, предоставляющий методы манипуляции любым элементом XPS в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Класс, инкапсулирующий основную сущность [XPS](../) документа, предоставляющий методы манипуляции любым элементом [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(T) | Добавляет элемент содержимого (Canvas, Path или Glyphs). |
| [AddCanvas](./addcanvas/)() | Добавляет новый холст к активной странице. |
| [AddDocument](./adddocument/)(bool) | Добавляет пустой документ с размером страницы по умолчанию. |
| [AddDocument](./adddocument/)(float, float, bool) | Добавляет пустой документ с размерами первой страницы *width* и *height* . |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Добавляет новые глифы к активной странице. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Добавляет новые глифы к активной странице. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Добавляет запись оглавления в документ. |
| [AddPage](./addpage/)(bool) | Добавляет пустую страницу в документ с размером страницы по умолчанию. |
| [AddPage](./addpage/)(float, float, bool) | Добавляет пустую страницу в документ с указанными *width* и *height* . |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Добавляет страницу в документ. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Добавляет новый путь к активной странице. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Создаёт новый сегмент эллиптической дуги. |
| [CreateCanvas](./createcanvas/)() | Создаёт новый canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Создаёт новый цвет. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Создаёт новый ресурс шрифта **TrueType**. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Создаёт новый ресурс шрифта **TrueType** из потока. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Создаёт новые glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Создаёт новые glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Создает новую точку градиента. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Создает новую точку градиента. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Создаёт новый ресурс ICC‑профиля из файла ICC‑профиля, расположенного по пути *iccProfilePath* . |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Создаёт новый ресурс ICC‑профиля из *stream* . |
| [CreateImage](./createimage/)(System::String) | Создаёт новый ресурс изображения из файла изображения, расположенного по пути *imagePath* . |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Создаёт новый ресурс изображения из *stream* . |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Создает новую кисть изображения. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Создает новую кисть изображения. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Создает новую линейную градиентную кисть. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Создает новую линейную градиентную кисть. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Создает новую аффинную матрицу преобразования. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Создает новый путь. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Создает новую фигуру пути. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Создает новую фигуру пути. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Создает новую геометрию пути, указанную в сокращенной форме. |
| [CreatePathGeometry](./createpathgeometry/)() | Создает новую геометрию пути. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Создает новую геометрию пути с указанным списком фигур пути. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Создает новый набор кубических кривых Безье. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Создает новый многоугольный рисунок, содержащий произвольное количество отдельных вершин. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Создает новый набор квадратичных кривых Безье от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Создает новую радиальную градиентную кисть. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Создает новую радиальную градиентную кисть. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Создает новую кисть сплошного цвета. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Создает новую кисть сплошного цвета. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Создает новую визуальную кисть. |
| [Dispose](./dispose/)() override | Освобождает экземпляр. |
| [get_ActiveDocument](./get_activedocument/)() | Получает номер активного документа. |
| [get_ActivePage](./get_activepage/)() | Получает номер активной страницы в активном документе. |
| [get_DocumentCount](./get_documentcount/)() | Возвращает количество документов внутри пакета [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | Возвращает/устанавливает печатный билет задания документа. |
| [get_Page](./get_page/)() | Возвращает экземпляр [XpsPage](../) для активной страницы. |
| [get_PageCount](./get_pagecount/)() | Возвращает количество страниц в активном документе. |
| [get_TotalPageCount](./get_totalpagecount/)() | Возвращает общее количество страниц во всех документах внутри [XPS](../) документа. |
| [get_Utils](./get_utils/)() const | Получает объект, предоставляющий утилиты за пределами официального API манипуляции [XPS](../). |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Возвращает печатный билет документа, индексированного по *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Возвращает печатный билет страницы, индексированной по *pageIndex* в документе, индексированном по *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | Вставляет элемент (Canvas, Path или Glyphs) на активную страницу в позицию *index* . |
| [InsertCanvas](./insertcanvas/)(int32_t) | Вставляет новый canvas на активную страницу в позицию *index* . |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Вставляет пустой документ с размером страницы по умолчанию в позицию *index* . |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Вставляет пустой документ с размерами первой страницы *width* и *height* в позицию *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Вставляет новые glyphs на активную страницу в позицию *index* . |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Вставляет новые glyphs на активную страницу в позицию *index* . |
| [InsertPage](./insertpage/)(int32_t, bool) | Вставляет пустую страницу в документ с размером страницы по умолчанию в позицию *index* . |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Вставляет пустую страницу в документ с указанными *width* и *height* в позицию *index* . |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Вставляет страницу в документ в позицию *index* . |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Вставляет новый path на активную страницу в позицию *index* . |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Объединение нескольких файлов [XPS](../) в один документ [XPS](../). |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Объединение нескольких файлов [XPS](../) в один документ [XPS](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Объединение документов [XPS](../) в PDF с использованием экземпляра [Device](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Объединение документов [XPS](../) в PDF с использованием экземпляра [Device](../). |
| [Remove](./remove/)(T) | Удаляет элемент с активной страницы. |
| [RemoveAt](./removeat/)(int32_t) | Удаляет элемент в позиции *index* с активной страницы. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Удаляет документ в позиции *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Удаляет страницу из документа. |
| [RemovePageAt](./removepageat/)(int32_t) | Удаляет страницу из документа в позиции *index*. |
| [Save](./save/)(System::String) | Сохраняет документ [XPS](../) в файл [XPS](../), расположенный по пути *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Сохраняет документ [XPS](../) в поток. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Сохраняет документ в файл изображения. Каталог вывода и имя файла будут такими же, как у входного файла [XPS](../). Расширение файла будет соответствовать формату изображения в параметре \"options\". Если документ был инициализирован потоком, который не является FileStream, файл изображения будет сохранён в текущей папке с шаблоном имени файла по умолчанию. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Сохраняет документ в файл изображения в указанный каталог с указанным именем файла. Расширение файла будет соответствовать формату изображения в параметре \"options\". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Сохраняет документ в формате растрового изображения в виде массивов байтов. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Сохраняет документ в формате PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Сохраняет документ в формате PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Сохраняет документ в формате PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Сохраняет документ в формате PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Выбирает активный документ для редактирования. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Выбирает страницу активного документа для редактирования. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Возвращает/устанавливает печатный билет задания документа. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Связывает *printTicket* с документом, индексированным по *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Связывает *printTicket* со страницей, индексированной по *pageIndex*, в документе, индексированном по *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Создаёт пустой документ [XPS](../) с размером страницы по умолчанию. |
| [XpsDocument](./xpsdocument/)(System::String) | Открывает существующий документ [XPS](../), расположенный по пути *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Открывает существующий документ, расположенный по пути *path*, как документ [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Загружает существующий документ, хранящийся в *stream*, как документ [XPS](../). |
## См. также

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
