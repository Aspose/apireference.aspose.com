---
title: Class SVGMatrix
second_title: Справочник по Aspose.HTML для .NET API
description: Aspose.Html.Dom.Svg.DataTypes.SVGMatrix сорт. Многие графические операции SVG используют матрицы 2x3 вида ace bdf  которые при преобразовании в матрицу 3x3 для целей матричной арифметики становятся ace bdf 0 0 1
type: docs
weight: 1220
url: /ru/net/aspose.html.dom.svg.datatypes/svgmatrix/
---
## SVGMatrix class

Многие графические операции SVG используют матрицы 2x3 вида: [ace] [bdf] , которые при преобразовании в матрицу 3x3 для целей матричной арифметики становятся: [ace] [bdf] [0 0 1]

```csharp
public class SVGMatrix : SVGValueType
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [A](../../aspose.html.dom.svg.datatypes/svgmatrix/a/) { get; set; } | Компонент A матрицы. |
| [B](../../aspose.html.dom.svg.datatypes/svgmatrix/b/) { get; set; } | Компонент B матрицы. |
| [C](../../aspose.html.dom.svg.datatypes/svgmatrix/c/) { get; set; } | Компонент C матрицы. |
| [D](../../aspose.html.dom.svg.datatypes/svgmatrix/d/) { get; set; } | Компонент D матрицы. |
| [E](../../aspose.html.dom.svg.datatypes/svgmatrix/e/) { get; set; } | Компонент E матрицы. |
| [F](../../aspose.html.dom.svg.datatypes/svgmatrix/f/) { get; set; } | Компонент F матрицы. |

## Методы

| Имя | Описание |
| --- | --- |
| [Dispose](../../aspose.html.dom.svg.datatypes/svgvaluetype/dispose/)() | Освобождает неуправляемые и (необязательно) управляемые ресурсы. |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | Этот метод используется для получения объекта ECMAScript.Type . |
| [Multiply](../../aspose.html.dom.svg.datatypes/svgmatrix/multiply/)(SVGMatrix) | Выполняет умножение матриц. Эта матрица постумножается на другую матрицу, возвращая результирующую новую матрицу. |
| [Rotate](../../aspose.html.dom.svg.datatypes/svgmatrix/rotate/)(float) | Умножает преобразование вращения на текущую матрицу и возвращает результирующую матрицу. |
| [Scale](../../aspose.html.dom.svg.datatypes/svgmatrix/scale/)(float) | Пост-умножает преобразование равномерного масштаба на текущую матрицу и возвращает результирующую матрицу. |
| [ScaleNonUniform](../../aspose.html.dom.svg.datatypes/svgmatrix/scalenonuniform/)(float, float) | Пост-умножает преобразование неравномерного масштаба на текущую матрицу и возвращает результирующую матрицу. |
| [SkewX](../../aspose.html.dom.svg.datatypes/svgmatrix/skewx/)(float) | Пост-умножает преобразование skewX на текущую матрицу и возвращает результирующую матрицу. |
| [SkewY](../../aspose.html.dom.svg.datatypes/svgmatrix/skewy/)(float) | пост-умножает преобразование skewY на текущую матрицу и возвращает результирующую матрицу. |
| override [ToString](../../aspose.html.dom.svg.datatypes/svgmatrix/tostring/)() | ВозвращаетString который представляет этот экземпляр. |
| [Translate](../../aspose.html.dom.svg.datatypes/svgmatrix/translate/)(float, float) | Пост-умножает трансляционное преобразование на текущую матрицу и возвращает результирующую матрицу. |

### Смотрите также

* class [SVGValueType](../svgvaluetype/)
* пространство имен [Aspose.Html.Dom.Svg.DataTypes](../../aspose.html.dom.svg.datatypes/)
* сборка [Aspose.HTML](../../)


