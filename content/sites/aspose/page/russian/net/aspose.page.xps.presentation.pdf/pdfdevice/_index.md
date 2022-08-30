---
title: PdfDevice
second_title: Справочник по Aspose.Page для .NET API
description: Класс инкапсулирующий устройство для создания изображений.
type: docs
weight: 340
url: /ru/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Класс, инкапсулирующий устройство для создания изображений.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | Создает новый экземпляр. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | Создает новый экземпляр с указанным размером носителя. |

## Характеристики

| Имя | Описание |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background) { get; set; } | Получает/устанавливает цвет фона. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Возвращает или задает преобразование текущих символов. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Возвращает или указывает создателя результирующего вывода устройства. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber) { get; } | Возвращает абсолютный номер текущей страницы в документе. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber) { get; } | Возвращает номер текущей страницы в текущем разделе. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font) { get; set; } | Получает/устанавливает текущий шрифт. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Указывает, использует ли устройство прямой режим RGB, то есть RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Указывает, лицензирован ли этот экземпляр библиотеки Aspose.Page. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity) { get; set; } | Получает/устанавливает непрозрачность. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask) { get; set; } | Получает/устанавливает кисть для маски непрозрачности. Маска применяется поверх Paint или Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint) { get; set; } | Получает/задает кисть для заливки контуров. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Свойства устройства, включая метаданные. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions) { set; } | Инициализирует параметры сохранения. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size) { get; set; } | Получает/устанавливает размер носителя устройства. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke) { get; set; } | Получает/задает обводку для контуров рисования. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Возвращает или указывает текущий режим рендеринга текста. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Возвращает или указывает текущую ширину обводки текста. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline)(int, string) | Добавляет элемент схемы с последним объектом в качестве цели. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline_1)(PointF, int, string) | Добавляет элемент схемы с исходной точкой в качестве цели. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage)() | Завершает страницу. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition)() | Выполнен раздел документа. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create)() | Создает новый экземпляр устройства на основе этого экземпляра устройства. Записывает графическое состояние этого устройства, т.е. создаетApsCanvas instance(s) с соответствующими свойствами RenderTransform и Clip. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose)() | Удаляет этот экземпляр устройства. Завершает графическое состояние этого экземпляра устройства, т. е. переключает контекст создания APS наApsCanvas на уровень выше, чем графическое состояние устройства this ApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw)(GraphicsPath) | Рисует указанный путь. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Рисует дугу. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Рисует изображение с назначенным преобразованием и фоном. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Рисует отрезок линии. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Рисует овал. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Рисует многоугольник. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Рисует многоугольник. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Рисует полилинию. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Рисует полилинию. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Рисует прямоугольник. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Рисует круглый прямоугольник. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring)(string, double, double) | Рисует строку в указанной позиции. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument)() | Завершает документ. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill)(GraphicsPath) | Заполняет указанный путь. |
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
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Получает значение свойства size. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform)() | Возвращает текущую матрицу преобразования. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Инициализирует клип устройства. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers)() | Инициализирует количество страниц для вывода. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Получает значение логического свойства. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage_1)(string) | Начинает новую страницу с указанным заголовком. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage)(float, float) | Начинает новую страницу с указанной шириной и высотой. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition)() | Запускает новый раздел документа. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew)() | Устанавливает устройства в начальное состояние. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset)() | Сбрасывает устройство. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate#rotate)(double) | Применяет вращение по часовой стрелке вокруг начала координат к текущей матрице преобразования. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Повернуть текущую матрицу преобразования вокруг точки. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale)(double, double) | Применяет указанный вектор масштабирования к текущей матрице преобразования. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip)(GraphicsPath) | Добавляет указанный путь к текущему пути клипа. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget)(int) | Устанавливает гиперссылку с номером страницы в качестве цели. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget_1)(string) | Устанавливает гиперссылку с внешним URI в качестве цели. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform)(Matrix) | Задает текущую матрицу преобразования. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear)(double, double) | Применяет указанный вектор сдвига к текущей матрице преобразования. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument)() | Запускает документ. |
| override [ToString](../../aspose.page/device/tostring)() | Возвращает имя типа устройства. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform)(Matrix) | Умножает текущую матрицу преобразования на заданноеMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate)(double, double) | Применяет указанный вектор смещения к текущей матрице преобразования. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters)(IMultiPageDevice) | Обновляет параметры текущей страницы. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Пишет комментарий. |

### Смотрите также

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* пространство имен [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf)
* сборка [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
