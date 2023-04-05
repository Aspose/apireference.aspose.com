---
title: Class Device
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.Device сорт. Этот класс инкапсулирует рендеринг документа на абстрактное устройство. Рендеринг документа выполняется страница за страницей.
type: docs
weight: 20
url: /ru/net/aspose.page/device/
---
## Device class

Этот класс инкапсулирует рендеринг документа на абстрактное устройство. Рендеринг документа выполняется страница за страницей.

```csharp
public abstract class Device
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Device](device/)(Size) | Инициализирует`Device` размером со страницу. |

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Возвращает или указывает текущий фон страницы. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Возвращает или задает преобразование текущих символов. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Возвращает или указывает создателя результирующего вывода устройства. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Возвращает или указывает текущий шрифт. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Указывает, использует ли устройство прямой режим RGB, то есть RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Указывает, лицензирован ли этот экземпляр библиотеки Aspose.Page. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Возвращает или указывает текущую прозрачность. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Возвращает или указывает текущую маску непрозрачности. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Возвращает или указывает текущую краску. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Свойства устройства, включая метаданные. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Опции для управления процессом рендеринга. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Возвращает или указывает размер страницы. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Возвращает или указывает текущий ход. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Возвращает или указывает текущий режим рендеринга текста. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Возвращает или указывает текущую ширину обводки текста. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Создает копию этого устройства. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Удаляет устройство. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Рисует путь. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Рисует дугу. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Рисует изображение с назначенным преобразованием и фоном. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Рисует отрезок линии. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Рисует овал. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Рисует многоугольник. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Рисует многоугольник. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Рисует полилинию. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Рисует полилинию. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Рисует прямоугольник. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Рисует круглый прямоугольник. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Рисует строку в заданной точке. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Выполняет необходимую подготовку устройства после рендеринга документа. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Заполняет путь. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Заполняет дугу. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Заполняет овал. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Заполняет полигон. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Заполняет полигон. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Заполняет прямоугольник. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Заполняет круглый прямоугольник. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Получает значение строкового свойства. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Получает значение свойства цвета. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Получает значение свойства double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Получает значение целочисленного свойства. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Получает значение свойства margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Получает значение свойства прямоугольника. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Получает значение свойства size. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Получает текущее преобразование. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Инициализирует клип устройства. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Получает значение логического свойства. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Сброс устройства в исходное состояние для всего документа. Используется для сброса выходного потока. |
| virtual [Reset](../../aspose.page/device/reset/)() | Сбросить устройство в исходное состояние для страницы. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Повернуть текущую матрицу преобразования. Вызывает writeTransform(Transform). Вращение с положительным углом тета поворачивает точки на положительной оси x по направлению к положительной оси y. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Повернуть текущую матрицу преобразования вокруг точки. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Масштабирует текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Определяет клип устройства. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Определяет текущее преобразование. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Срезает текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Выполняет необходимую подготовку устройства перед началом рендеринга документа. |
| override [ToString](../../aspose.page/device/tostring/)() | Возвращает имя типа устройства. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Преобразует текущую матрицу преобразования. Вызывает writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Переводит текущую матрицу преобразования. Вызывает writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Пишет комментарий. |

## Поля

| Имя | Описание |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Текущая версия устройства. |

### Смотрите также

* пространство имен [Aspose.Page](../../aspose.page/)
* сборка [Aspose.Page](../../)


