---
title: PdfDevice
second_title: Справочник по Aspose.Page для .NET API
description: Этот класс инкапсулирует визуализацию документа в PDF.
type: docs
weight: 60
url: /ru/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Этот класс инкапсулирует визуализацию документа в PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | Инициализирует новый экземпляр[`PdfDevice`](../pdfdevice)с выходным потоком. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | Инициализирует новый экземпляр[`PdfDevice`](../pdfdevice)с выходным потоком и указанным размером страницы. |

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | Возвращает или указывает текущий фон страницы. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Возвращает или указывает текущее преобразование символов. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Возвращает или указывает создателя результирующего вывода устройства. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber) { get; } | Текущий номер страницы. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font) { set; } | Указывает текущий шрифт. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Указывает, использует ли устройство прямой режим RGB, то есть RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Указывает, лицензирован ли данный экземпляр библиотеки Aspose.Page. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | Возвращает или указывает текущую непрозрачность. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Возвращает или указывает текущую маску непрозрачности. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream) { get; set; } | Задает или возвращает выходной поток. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint) { set; } | Возвращает или указывает текущую краску. |
| [Properties](../../aspose.page.eps.device/pdfdevice/properties) { get; set; } | Свойства устройства, включая метаданные. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | Опции для управления процессом рендеринга. |
| virtual [Size](../../aspose.page/device/size) { get; set; } | Возвращает или указывает размер страницы. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke) { set; } | Возвращает или указывает текущий штрих. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Возвращает или указывает текущий режим рендеринга текста. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Возвращает или указывает текущую ширину обводки текста. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage)() | Выполняет необходимую подготовку устройства после отображения страницы. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create)() | Создает копию этого устройства. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose)() | Удаляет графический контекст. Если при создании restoreOnDispose было true, будет вызван writeGraphicsRestore(). |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw)(GraphicsPath) | Рисует путь. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Рисует дугу. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage)(Bitmap, Matrix, Color) | Рисует изображение с заданным преобразованием и фоном. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Рисует отрезок. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Рисует овал. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Рисует многоугольник. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Рисует многоугольник. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Рисует полилинию. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Рисует полилинию. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Рисует прямоугольник. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Рисует круглый прямоугольник. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring)(string, double, double) | Рисует строку в заданной точке. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument)() | Выполняет необходимую подготовку устройства после рендеринга документа. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill)(GraphicsPath) | Заполняет путь. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Заполняет дугу. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Заполняет овал. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Заполняет полигон. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Заполняет полигон. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Заполняет прямоугольник. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Заполняет круглый прямоугольник. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Получает значение строкового свойства. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Получает значение свойства цвета. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Получает значение свойства double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Получает значение целочисленного свойства. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Получает значение свойства margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Получает значение свойства прямоугольника. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Получает значение свойства размера. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform)() | Получает текущее преобразование. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip)() | Инициализирует клип устройства. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers)() | Инициализирует количество страниц для вывода. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Получает значение логического свойства. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage#openpage_1)(string) | Выполняет необходимую подготовку устройства перед рендерингом страницы. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage#openpage)(float, float) | Делает необходимую подготовку устройства перед рендерингом каждой страницы. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew)() | Сброс устройства в исходное состояние для всего документа. Используется для сброса выходного потока. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset)() | Если будут заданы параметры устройства страницы, то этот метод позволяет вернуть поток записи в начало страницы. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate#rotate)(double) | Вращение текущего преобразования по оси Z. Вызывает writeTransform(преобразование). Вращение с положительным углом тета поворачивает точки на положительной оси x по направлению к положительной оси y. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Повернуть текущую матрицу преобразования вокруг точки. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale)(double, double) | Масштабирует текущую матрицу преобразования. Вызывает writeTransform(преобразование). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip)(GraphicsPath) | Определяет клип устройства. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform)(Matrix) | Определяет текущее преобразование. Поскольку большинство форматов вывода не реализуют эту функцию , обратное преобразование currentTransform вычисляется и умножается на устанавливаемое преобразование . Результат затем перенаправляется вызовом writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear)(double, double) | Срезает текущую матрицу преобразования. Вызывает writeTransform(преобразование). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument)() | Выполняет необходимую подготовку устройства перед началом рендеринга документа. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring)() | Возвращает имя типа устройства. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform)(Matrix) | Преобразует текущую матрицу преобразования. Вызывает writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate)(double, double) | Переводит текущую матрицу преобразования. Вызывает writeTransform(преобразование). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters)(IMultiPageDevice) | Обновляет параметры страницы с другого многостраничного устройства. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment)(string) | Пишет комментарий. |

## Поля

| Имя | Описание |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author) | Значение свойства "Автор". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background) | Ключ свойства "Фон". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color) | Ключ свойства "Цвет фона". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress) | Ключ свойства "Сжать". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts) | Ключ свойства "Встроить шрифт в документ". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as) | Ключ свойства "Какой шрифт используется для встраивания". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors) | Значение свойства "Выдавать ошибки". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings) | Значение свойства "Выдавать предупреждения". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page) | Ключ свойства "По размеру страницы". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords) | Значение свойства "Ключевые слова". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation) | Ключ свойства "Ориентация". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins) | Ключ свойства "Поля страницы". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size) | Ключ свойства "Размер страницы". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject) | Значение свойства "Тема". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title) | Значение свойства "Заголовок". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent) | Ключ свойства "Прозрачный". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version) | Ключ свойства "Версия". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5) | Значение свойства "Версия Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as) | Ключ свойства "Формат изображений". |

### Смотрите также

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* interface [IStreamable](../../aspose.page/istreamable)
* пространство имен [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* сборка [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
