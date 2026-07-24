---
title: "Класс Aspose::Page::EPS::Device::PdfDevice"
linktitle: "PdfDevice"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::Device::PdfDevice class. Этот класс инкапсулирует рендеринг документа в PDF на C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Этот класс инкапсулирует рендеринг документа в PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Методы

| Метод | Описание |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" значение свойства. |
| static [BACKGROUND](./background/)() | "Background" ключ свойства. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" ключ свойства. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Обрезает с использованием заданной формы. Перенаправляет к writeClip(Rectangle), writeClip(RectangleF) или writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Обрезает прямоугольник. Вызывает clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Выполняет необходимую подготовку устройства после рендеринга страницы. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" ключ свойства. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Создаёт копию этого устройства. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Освобождает графический контекст. Если при создании restoreOnDispose было истинным, будет вызвано writeGraphicsRestore(). |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Рисует путь. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Рисует изображение с заданным преобразованием и фоном. |
| [DrawString](./drawstring/)(System::String, double, double) override | Рисует строку в заданной точке. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" ключ свойства. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" ключ свойства. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" значение свойства. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" значение свойства. |
| [EndDocument](./enddocument/)() override | Выполняет необходимую подготовку устройства после рендеринга документа. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Заполняет путь. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" ключ свойства. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Текущий номер страницы. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Рисует рамку и баннер вокруг строки. Метод вычисляет и возвращает точку, в которую следует установить курсор текста перед рисованием строки. |
| [get_OutputStream](./get_outputstream/)() override | Указывает или возвращает поток вывода. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Получает текущее преобразование. |
| [InitClip](./initclip/)() override | Инициализирует обрезку устройства. |
| [InitPageNumbers](./initpagenumbers/)() override | Инициализирует количество страниц для вывода. |
| static [KEYWORDS](./keywords/)() | "Keywords" значение свойства. |
| [OpenPage](./openpage/)(System::String) override | Выполняет необходимую подготовку устройства перед рендерингом страницы. |
| [OpenPage](./openpage/)(float, float) override | Выполняет необходимую подготовку устройства перед рендерингом каждой страницы. |
| static [ORIENTATION](./orientation/)() | "Orientation" ключ свойства. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" ключ свойства. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" ключ свойства. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Инициализирует новый экземпляр [PdfDevice](./) с выходным потоком. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Инициализирует новый экземпляр [PdfDevice](./) с выходным потоком и указанным размером страницы. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Конструктор копирования. Инициализирует новый экземпляр [PdfDevice](./) с существующим устройством. |
| [ReNew](./renew/)() override | Сбрасывает устройство в исходное состояние для всего документа. Используется для сброса выходного потока. |
| [ReNewForMerge](./renewformerge/)(bool) override | Сбрасывает устройство в исходное состояние для всего документа при объединении нескольких документов. Используется для сброса выходного потока. |
| [Reset](./reset/)() override | Если параметры устройства страницы будут установлены, этот метод позволяет вернуть поток записи к началу страницы. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Поворачивает текущую трансформацию вокруг оси Z. Вызывает writeTransform(Transform). Поворот с положительным углом θ вращает точки вдоль положительной оси x в сторону положительной оси y. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Масштабирует текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Указывает текущий шрифт. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Указывает или возвращает поток вывода. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Возвращает или задает текущую заливку. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Возвращает или задает текущий обводочный стиль. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Указывает обрезку устройства. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Указывает текущую трансформацию. Поскольку большинство форматов вывода не реализуют эту функциональность, вычисляется обратная трансформация currentTransform и умножается на задаваемую трансформацию. Затем результат передаётся вызовом writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Косит текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Выполняет необходимую подготовку устройства перед началом рендеринга документа. |
| static [SUBJECT](./subject/)() | "Subject" значение свойства. |
| static [TITLE](./title/)() | "Title" значение свойства. |
| [ToString](./tostring/)() const override | Возвращает название типа устройства. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Трансформирует текущую матрицу преобразования. Вызывает writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Перемещает текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" ключ свойства. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Обновляет параметры страницы из другого многостраничного устройства. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" ключ свойства. |
| [WriteBackground](./writebackground/)() override | Записывает текущий фон. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Записывает окончание штриха. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Записывает комментарий. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Записывает пунктир штриха. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Записывает каталог, docinfo, настройки и (поскольку мы используем вывод только одной страницы) дерево страниц. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Записывает соединение штриха. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Записывает последний использованный цвет. Это полезно в случаях, когда после записи цвета выполняется восстановление графики ("Q"). |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Записывает предел среза (miter limit) штриха. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Записывает заливку как указанный цвет. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Записывает заливку как заданный градиент. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Записывает заливку как заданную текстуру. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Записывает заливку. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Записывает строку с указанным шрифтом. |
| [WriteTrailer](./writetrailer/)() | Записывает трейлер PDF‑документа. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Записывает заданную матрицу преобразования в файл. |
| [WriteWarning](./writewarning/)(System::String) override | Записывает предупреждение, по умолчанию в System.err. |
| [WriteWidth](./writewidth/)(float) override | Записывает ширину штриха. |
## Поля

| Поле | Описание |
| --- | --- |
| static [VERSION](./version/) | "Version" ключ свойства. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" значение свойства. |

## Deprecated
Класс PdfDevice устарел, начиная с версии 24.3. Пожалуйста, используйте метод SaveAsPdf в классе PsDocument вместо него. В версии 24.6 этот класс будет полностью скрыт.

## См. также

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
