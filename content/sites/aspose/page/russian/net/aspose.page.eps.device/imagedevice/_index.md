---
title: ImageDevice
second_title: Справочник по Aspose.Page для .NET API
description: Этот класс инкапсулирует рендеринг документа в изображение.
type: docs
weight: 40
url: /ru/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Этот класс инкапсулирует рендеринг документа в изображение.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Инициализирует новый экземпляр[`ImageDevice`](../imagedevice) . |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | Инициализирует новый экземпляр[`ImageDevice`](../imagedevice) с указанным форматом изображения. |
| [ImageDevice](imagedevice#constructor_2)(Size) | Инициализирует новый экземпляр[`ImageDevice`](../imagedevice) с указанным размером страницы. |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | Инициализирует новый экземпляр[`ImageDevice`](../imagedevice)с указанным размером страницы и форматом изображения. |

## Характеристики

| Имя | Описание |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Указывает, использует ли устройство прямой режим RGB, то есть RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Возвращает или задает преобразование текущих символов. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Возвращает или указывает создателя результирующего вывода устройства. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Текущий номер страницы. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Возвращает или указывает текущий шрифт. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Формат изображения. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Возвращает результирующие изображения в байтах, один байтовый массив для одной страницы. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Указывает, использует ли устройство прямой режим RGB, то есть RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Указывает, лицензирован ли этот экземпляр библиотеки Aspose.Page. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Возвращает или указывает текущий фон страницы. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Возвращает или указывает текущую маску непрозрачности. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Возвращает или указывает текущую краску. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Свойства устройства, включая метаданные. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Опции для управления процессом рендеринга. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Возвращает или указывает размер страницы. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Возвращает или указывает текущий ход. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Возвращает или указывает текущий режим рендеринга текста. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Возвращает или указывает текущую ширину обводки текста. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Выполняет необходимую подготовку устройства после отображения страницы. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Создает копию этого устройства. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Удаляет устройство. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Рисует путь. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Рисует дугу. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Рисует изображение с назначенным преобразованием и фоном. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Рисует отрезок линии. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Рисует овал. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Рисует многоугольник. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Рисует многоугольник. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Рисует полилинию. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Рисует полилинию. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Рисует прямоугольник. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Рисует круглый прямоугольник. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Рисует строку в заданной точке. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Выполняет необходимую подготовку устройства после рендеринга документа. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Заполняет путь. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Заполняет дугу. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Заполняет овал. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Заполняет полигон. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Заполняет полигон. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Заполняет прямоугольник. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Заполняет круглый прямоугольник. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | Получает значение строкового свойства. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | Получает значение свойства цвета. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | Получает значение свойства double. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | Получает значение целочисленного свойства. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | Получает значение свойства полей. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | Получает значение свойства прямоугольника. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | Получает значение свойства size. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Получает текущее преобразование. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Инициализирует клип устройства. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Инициализирует количество страниц для вывода. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | Получает значение логического свойства. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | Выполняет необходимую подготовку устройства перед рендерингом страницы. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | Делает необходимую подготовку устройства перед рендерингом каждой страницы. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Сбросить устройство в исходное состояние для всего документа. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Сбросить устройство в исходное состояние для страницы. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | Повернуть текущую матрицу преобразования по оси Z. Вызывает writeTransform(Transform). Вращение с положительным углом тета поворачивает точки на положительной оси x по направлению к положительной оси y. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Повернуть текущую матрицу преобразования вокруг точки. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Масштабирует текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Форма зажимов. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Определяет текущее преобразование. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Срезает текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Выполняет необходимую подготовку устройства перед началом рендеринга документа. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Возвращает имя типа устройства. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Преобразует текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Переводит текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Обновляет параметры страницы с другого многостраничного устройства. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | Пишет комментарий. |

## Поля

| Имя | Описание |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | Ключ свойства "Фон". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | Ключ свойства "Цвет фона". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | Ключ свойства «Встроить шрифт в документ». |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | Значение свойства "Выдавать ошибки". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | Значение свойства "Выдавать предупреждения". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | Ключ свойства "По размеру страницы". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | Ключ свойства "Ориентация". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | Ключ свойства "Поля страницы". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | Ключ свойства "Размер страницы". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | Значение свойства "Производитель". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | Ключ свойства "Прозрачный". |

### Смотрите также

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* пространство имен [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* сборка [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
