---
title: CadRasterizationOptions
second_title: Справочник по Aspose.CAD для .NET API
description: Опции растеризации CAD.
type: docs
weight: 29590
url: /ru/net/aspose.cad.imageoptions/cadrasterizationoptions/
---
## CadRasterizationOptions class

Опции растеризации CAD.

```csharp
public class CadRasterizationOptions : VectorRasterizationOptions
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [CadRasterizationOptions](cadrasterizationoptions)() | Конструктор по умолчанию. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AutomaticLayoutsScaling](../../aspose.cad.imageoptions/cadrasterizationoptions/automaticlayoutsscaling) { get; set; } | Получает или задает значение, указывающее, следует ли автоматически масштабировать макеты. |
| [BackgroundColor](../../aspose.cad.imageoptions/vectorrasterizationoptions/backgroundcolor) { get; set; } | Получает или задает цвет фона. |
| [ContentAsBitmap](../../aspose.cad.imageoptions/vectorrasterizationoptions/contentasbitmap) { get; set; } | Получает или задает значение, указывающее, представлено ли содержимое рисунка в виде изображения внутри Pdf. Применимо только для экспорта CAD в Pdf. Значение по умолчанию — ложь. |
| [CtbSources](../../aspose.cad.imageoptions/cadrasterizationoptions/ctbsources) { get; set; } | Получает или устанавливает источники CTB. |
| [DrawColor](../../aspose.cad.imageoptions/vectorrasterizationoptions/drawcolor) { get; set; } | Получает или задает цвет переднего плана. |
| [DrawType](../../aspose.cad.imageoptions/cadrasterizationoptions/drawtype) { get; set; } | Получает или устанавливает тип рисования. |
| [EmbedBackground](../../aspose.cad.imageoptions/vectorrasterizationoptions/embedbackground) { get; set; } | Если цвет фона не равен цвету фона по умолчанию выходного формата (белый для PDF и SVG, прозрачный для растра) должен быть встроен в выходное изображение (если не встроен, фон будет установлен по умолчанию для выходной системы рендеринга, но цвет содержимого, который зависит от цвета фона, будет отображаться с использованием указанного цвета фона) |
| [ExportAllLayoutContent](../../aspose.cad.imageoptions/cadrasterizationoptions/exportalllayoutcontent) { get; set; } | Получает или задает, следует ли экспортировать объекты на макетах, которые находятся за пределами области построения. |
| [GraphicsOptions](../../aspose.cad.imageoptions/vectorrasterizationoptions/graphicsoptions) { get; set; } | Получает или задает параметры для рендеринга растрового изображения внутри pdf (если для параметра ContentAsBitmap установлено значение true). |
| [Layers](../../aspose.cad.imageoptions/cadrasterizationoptions/layers) { get; set; } | Получает или задает слои файла DXF для экспорта. |
| [LayoutPageSizes](../../aspose.cad.imageoptions/vectorrasterizationoptions/layoutpagesizes) { get; set; } | Получает или задает размеры страницы макета. |
| [Layouts](../../aspose.cad.imageoptions/cadrasterizationoptions/layouts) { get; set; } | Получает или задает layoutName. |
| [Margins](../../aspose.cad.imageoptions/vectorrasterizationoptions/margins) { get; set; } | Получает или устанавливает поля. |
| [NoScaling](../../aspose.cad.imageoptions/cadrasterizationoptions/noscaling) { get; set; } | Получает или задает отсутствие масштабирования при экспорте. |
| [ObserverPoint](../../aspose.cad.imageoptions/cadrasterizationoptions/observerpoint) { get; set; } | Получает или устанавливает точку наблюдения. |
| [PageHeight](../../aspose.cad.imageoptions/vectorrasterizationoptions/pageheight) { get; set; } | Получает или задает высоту страницы. |
| [PageSize](../../aspose.cad.imageoptions/vectorrasterizationoptions/pagesize) { get; set; } | Получает или задает размер страницы. |
| [PageWidth](../../aspose.cad.imageoptions/vectorrasterizationoptions/pagewidth) { get; set; } | Получает или задает ширину страницы. |
| [PdfProductLocation](../../aspose.cad.imageoptions/cadrasterizationoptions/pdfproductlocation) { get; set; } | Местоположение продукта в формате PDF |
| [PenOptions](../../aspose.cad.imageoptions/cadrasterizationoptions/penoptions) { get; set; } | Получает или устанавливает параметры пера. |
| [Quality](../../aspose.cad.imageoptions/cadrasterizationoptions/quality) { get; set; } | Получает или устанавливает качество. |
| [RelativePosition](../../aspose.cad.imageoptions/vectorrasterizationoptions/relativeposition) { get; set; } | Положение левого верхнего угла экспортируемой области относительно всего изображения документа, в относительных единицах - 0,0 вверху слева, 1,1 внизу изображения документа. |
| [RelativeScale](../../aspose.cad.imageoptions/vectorrasterizationoptions/relativescale) { get; set; } | Масштаб экспортируемой области относительно всего изображения документа. Рассчитывается как отношение соответствующего размера экспортируемой области к большему размеру экспортируемого документа. |
| [ScaleMethod](../../aspose.cad.imageoptions/cadrasterizationoptions/scalemethod) { get; set; } | Получает или задает метод масштабирования для автоматической настройки размера изображения. |
| [ShxFonts](../../aspose.cad.imageoptions/cadrasterizationoptions/shxfonts) { get; set; } | Получает или задает пути к шрифтам SHX, которые будут использоваться при экспорте. |
| [UnitType](../../aspose.cad.imageoptions/vectorrasterizationoptions/unittype) { get; set; } | Получает или устанавливает тип единицы измерения результата экспорта. |
| [Zoom](../../aspose.cad.imageoptions/cadrasterizationoptions/zoom) { get; set; } | Получает или устанавливает коэффициент масштабирования. Позволяет масштабировать рисунок относительно размера холста. Значение 1 соответствует точной подгонке, значение ниже 1 позволяет сохранить поля, значение выше 1 позволяет масштабировать чертеж. |

## Поля

| Имя | Описание |
| --- | --- |
| [RenderResult](../../aspose.cad.imageoptions/cadrasterizationoptions/renderresult) | Обработчик результата рендеринга. |

### Смотрите также

* class [VectorRasterizationOptions](../vectorrasterizationoptions)
* пространство имен [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions)
* сборка [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
