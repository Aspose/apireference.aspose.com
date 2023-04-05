---
title: Class ImageDevice
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.Presentation.Image.ImageDevice сорт. Класс инкапсулирующий устройство для создания изображений.
type: docs
weight: 350
url: /ru/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Класс, инкапсулирующий устройство для создания изображений.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Создает новый экземпляр. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Создает новый экземпляр с указанным размером носителя. |

## Характеристики

| Имя | Описание |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Получает/устанавливает цвет фона. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Возвращает или задает преобразование текущих символов. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Возвращает или указывает создателя результирующего вывода устройства. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Возвращает абсолютный номер текущей страницы в документе. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Возвращает относительный номер текущей страницы в текущем разделе. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Получает/устанавливает текущий шрифт. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Указывает, использует ли устройство прямой режим RGB, то есть RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Указывает, лицензирован ли этот экземпляр библиотеки Aspose.Page. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Получает/устанавливает непрозрачность. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Получает/устанавливает кисть для маски непрозрачности. Маска применяется поверх Paint или Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Получает/задает кисть для заливки контуров. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Свойства устройства, включая метаданные. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Возвращает результирующие байтовые массивы изображений. Первое измерение предназначено для внутренних документов , а второе — для страниц во внутренних документах. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Инициализирует параметры сохранения. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Получает/устанавливает размер носителя устройства. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Получает/задает обводку для контуров рисования. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Возвращает или указывает текущий режим рендеринга текста. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Возвращает или указывает текущую ширину обводки текста. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Завершает страницу. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Выполнен раздел документа. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Создает новый экземпляр устройства на основе этого экземпляра устройства. Записывает графическое состояние этого устройства, т.е. создаетApsCanvas instance(s) с соответствующими свойствами RenderTransform и Clip. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Удаляет этот экземпляр устройства. Завершает графическое состояние этого экземпляра устройства, т. е. переключает контекст создания APS наApsCanvas на уровень выше, чем графическое состояние устройства this ApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Рисует указанный путь. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Рисует дугу. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Рисует изображение с назначенным преобразованием и фоном. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Рисует отрезок линии. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Рисует овал. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Рисует многоугольник. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Рисует многоугольник. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Рисует полилинию. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Рисует полилинию. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Рисует прямоугольник. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Рисует круглый прямоугольник. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Рисует строку в указанной позиции. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Завершает документ. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Заполняет указанный путь. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Заполняет дугу. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Заполняет овал. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Заполняет полигон. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Заполняет полигон. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Заполняет прямоугольник. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Заполняет круглый прямоугольник. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Получает значение строкового свойства. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Получает значение свойства цвета. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Получает значение свойства double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Получает значение целочисленного свойства. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Получает значение свойства margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Получает значение свойства прямоугольника. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Получает значение свойства size. |
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Возвращает текущую матрицу преобразования. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Инициализирует клип устройства. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Инициализирует количество страниц для вывода. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Получает значение логического свойства. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Начинает новую страницу с указанным заголовком. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Начинает новую страницу с указанной шириной и высотой. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Запускает новый раздел документа. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Устанавливает устройства в начальное состояние. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Сбрасывает устройство. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Применяет вращение по часовой стрелке вокруг начала координат к текущей матрице преобразования. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Повернуть текущую матрицу преобразования вокруг точки. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Применяет указанный вектор масштабирования к текущей матрице преобразования. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Добавляет указанный путь к текущему пути клипа. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Задает текущую матрицу преобразования. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Применяет указанный вектор сдвига к текущей матрице преобразования. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Запускает документ. |
| override [ToString](../../aspose.page/device/tostring/)() | Возвращает имя типа устройства. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Умножает текущую матрицу преобразования на заданноеMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Применяет указанный вектор смещения к текущей матрице преобразования. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Обновляет параметры текущей страницы. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Пишет комментарий. |

### Смотрите также

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* пространство имен [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* сборка [Aspose.Page](../../)


