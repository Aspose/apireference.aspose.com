---
title: Aspose.Svg.ImageVectorization
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.ImageВекторизацияпространство имен содержит классы для векторизации растровых изображений и преобразования их в документы SVG. Этот процесс включает преобразование растровых изображений в геометрические фигуры составленные из элементов контура и сохранение их в виде SVG. Пространство имен включает классы для построения сегментов пути упрощения и сглаживания точек трассировки и настройка параметров векторизации.
type: docs
weight: 170
url: /ru/net/aspose.svg.imagevectorization/
---
**Aspose.Svg.ImageВекторизация**пространство имен содержит классы для векторизации растровых изображений и преобразования их в документы SVG. Этот процесс включает преобразование растровых изображений в геометрические фигуры, составленные из элементов контура, и сохранение их в виде SVG. Пространство имен включает классы для построения сегментов пути, упрощения и сглаживания точек трассировки, и настройка параметров векторизации.

## Классы

| Учебный класс | Описание |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | [`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) класс отвечает за построение сегментов пути[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) из списка точек трассировки. Этот построитель пути основан на использовании метода наименьших квадратов для поиска контрольных точек Безье для трассировки точек. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | Класс ImageTraceSimplifier отвечает за уменьшение количества точек на кривой, аппроксимируемой серией точек трассировки. |
| [ImageTraceSmoother](./imagetracesmoother/) | Класс ImageTraceSimplifier отвечает за сглаживание количества точек на кривой, аппроксимируемой серией точек трассировки. Этот класс реализует метод ближайшего соседа. |
| [ImageVectorizer](./imagevectorizer/) | Этот класс ImageVectorizer векторизует растровые изображения, такие как PNG, JPG, GIF, BMP и т. д., и возвращает SVGDocument. Под векторизацией мы подразумеваем процесс преобразования растровых изображений в геометрические фигуры, составленные из элементов контура и сохраненные в виде SVG. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | [`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) класс определяет конфигурацию методов и параметров векторизации изображения. Конфигурация используется для инициализации ImageVectorizer и предоставляет параметры конфигурации для векторизации изображений. |
| [SplinePathBuilder](./splinepathbuilder/) | [`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) класс отвечает за построение сегментов пути[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) из списка точек трассировки. Этот построитель пути основан на применении сплайна Катмулла-Рома к набору сглаженных и уменьшенных точек пути.. |
| [StencilConfiguration](./stencilconfiguration/) | [`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) класс определяет конфигурацию параметров эффекта трафарета. |
## Интерфейсы

| Интерфейс | Описание |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | За уменьшение количества точек в трассе отвечает интерфейс IImageTraceSimplifier. |
| [IImageTraceSmoother](./iimagetracesmoother/) | За сглаживание трассировки отвечает интерфейс IImageTraceSmoother. |
| [IPathBuilder](./ipathbuilder/) | Интерфейс IPathBuilder отвечает за построение сегментов пути[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) из списка точек трассировки. |
## перечисление

| перечисление | Описание |
| --- | --- |
| [StencilType](./stenciltype/) | [`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum определяет типы трафаретов. |


