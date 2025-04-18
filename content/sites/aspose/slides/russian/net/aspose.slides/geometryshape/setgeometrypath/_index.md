---
title: SetGeometryPath
second_title: Справочник по API Aspose.Slides для .NET
description: Обновляет геометрию формы из объектаIGeometryPathaspose.slides/igeometrypath. Координаты должны быть относительно левого верхнего угла фигуры. Изменяет тип фигуры ShapeTypeaspose.slides/geometryshape/shapetype наCustom.
type: docs
weight: 60
url: /ru/net/aspose.slides/geometryshape/setgeometrypath/
---
## GeometryShape.SetGeometryPath method

Обновляет геометрию формы из объекта[`IGeometryPath`](../../igeometrypath). Координаты должны быть относительно левого верхнего угла фигуры. Изменяет тип фигуры ([`ShapeType`](../shapetype)) наCustom.

```csharp
public void SetGeometryPath(IGeometryPath geometryPath)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| geometryPath | IGeometryPath | Путь геометрии |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Нет найден путь |
| ArgumentException | Найден пустой путь |

### Примеры

Пример:

```csharp
[C#]
using (Presentation pres = new Presentation())
{
    GeometryShape shape = pres.Slides[0].Shapes.AddAutoShape(ShapeType.Rectangle, 100, 100, 200, 100) as GeometryShape;

    GeometryPath geometryPath0 = new GeometryPath();
    geometryPath0.MoveTo(0, 0);
    geometryPath0.LineTo(shape.Width, 0);
    geometryPath0.LineTo(shape.Width, shape.Height/3);
    geometryPath0.LineTo(0, shape.Height / 3);
    geometryPath0.CloseFigure();

    GeometryPath geometryPath1 = new GeometryPath();
    geometryPath1.MoveTo(0, shape.Height/3 * 2);
    geometryPath1.LineTo(shape.Width, shape.Height / 3 * 2);
    geometryPath1.LineTo(shape.Width, shape.Height);
    geometryPath1.LineTo(0, shape.Height);
    geometryPath1.CloseFigure();

    shape.SetGeometryPaths(new GeometryPath[] { geometryPath0, geometryPath1});

    pres.Save("output.pptx", SaveFormat.Pptx);
}
```

### Смотрите также

* interface [IGeometryPath](../../igeometrypath)
* class [GeometryShape](../../geometryshape)
* пространство имен [Aspose.Slides](../../geometryshape)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
