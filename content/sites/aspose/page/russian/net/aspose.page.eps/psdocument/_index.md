---
title: Class PsDocument
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.EPS.PsDocument сорт. Этот класс инкапсулирует документы PS/EPS.
type: docs
weight: 140
url: /ru/net/aspose.page.eps/psdocument/
---
## PsDocument class

Этот класс инкапсулирует документы PS/EPS.

```csharp
public sealed class PsDocument : Document
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Инициализирует`PsDocument` с потоком файла PS/EPS. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Инициализирует пустой`PsDocument` с инициализированной страницей. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Инициализирует пустой`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Инициализирует пустой`PsDocument` когда заранее известно количество страниц документа Postscript. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Возвращает количество страниц в результирующем документе PDF. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Добавляет клип в текущее состояние графики. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Добавляет клип в текущее графическое состояние, а затем записывает оператор "newpath". Это необходимо сделать, чтобы избежать слияния этого пути отсечения и некоторых последующих путей, таких как глифы, обведенные оператором "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Добавляет прямоугольник обрезки к текущему графическому состоянию. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Завершить текущую страницу. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Нарисуйте произвольный путь. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Нарисовать замаскированное изображение. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Нарисовать изображение. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Нарисуйте преобразованное изображение с фоном. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Заполнить произвольный путь. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Добавляет текстовую строку, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Добавляет текстовую строку, заполняя внутреннюю часть глифов и рисуя контуры глифов. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | Добавляет текстовую строку, заполняя внутреннюю часть глифов. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | Добавляет текстовую строку, заполняя внутреннюю часть глифов. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Получает отрисовку текущего состояния графики. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Получает обводку текущего состояния графики. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Читает файл PS/EPS и извлекает XmpMetdata, если он уже существует, или добавляет новый, если он не существует. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Слияние файлов PS/EPS на устройство. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | Создает новую страницу и делает ее текущей. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | Добавляет текстовую строку, рисуя контуры глифов. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | Добавляет текстовую строку, рисуя контуры глифов. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | Добавляет вращение к текущему состоянию графики (повернуть текущую матрицу). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | сохранено`PsDocument` как EPS-файл. Этот метод используется только в том случае, если PsDocument был создан с нуля. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | сохранено`PsDocument` как EPS-файл. Этот метод используется только после обновления метаданных XMP. Он сохраняет исходный файл EPS с обновленными существующими метаданными или новым, созданным при вызове метода GetMetadata. В последнем случае добавляется весь необходимый код PostScript и комментарии EPS. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Сохраняет файл PS/EPS на устройство. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Добавляет масштаб к текущему состоянию графики (масштабировать текущую матрицу). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Устанавливает параметры устройства страницы (см. спецификацию PostScript оператора "setpagedevice"). Среди них могут быть размер страницы, цвет и т. д. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Устанавливает размер страницы. Для создания страниц разного размера в одном документе используйте[`SetPageDevice`](./setpagedevice/) сразу после этого метода. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Устанавливает рисование в текущем графическом состоянии. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Устанавливает обводку в текущем графическом состоянии. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Добавляет преобразование сдвига к текущему состоянию графики (матрица текущего сдвига). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Добавляет преобразование к текущему состоянию графики (объединяет эту матрицу с текущей). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Добавляет перевод в текущее состояние графики (переводит текущую матрицу). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Записывает восстановление текущего состояния графики (см. спецификацию PostScript по оператору "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Записывает сохранение текущего состояния графики (см. спецификацию PostScript для оператора "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Сохраняет объект Bitmap в выходной поток EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Сохраняет объект Bitmap в файл EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Сохраняет изображение PNG/JPEG/TIFF/BMP/GIF/EMF из входного потока в выходной поток EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Сохраняет изображение PNG/JPEG/TIFF/BMP/GIF/EMF из файла в файл EPS. |

### Смотрите также

* class [Document](../../aspose.page/document/)
* пространство имен [Aspose.Page.EPS](../../aspose.page.eps/)
* сборка [Aspose.Page](../../)


