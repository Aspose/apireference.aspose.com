---
title: PdfRenderMode
second_title: Справочник по Aspose.3D для .NET API
description: Режим рендеринга определяет стиль в котором визуализируется 3Dграфика.
type: docs
weight: 1260
url: /ru/net/aspose.threed.formats/pdfrendermode/
---
## PdfRenderMode enumeration

Режим рендеринга определяет стиль, в котором визуализируется 3D-графика.

```csharp
public enum PdfRenderMode
```

### Ценности

| Имя | Ценность | Описание |
| --- | --- | --- |
| Solid | `0` | Отображает текстурированные и освещенные геометрические фигуры. |
| SolidWireframe | `1` | Отображает текстурированные и освещенные геометрические фигуры (треугольники) с краями одного цвета поверх них. |
| Transparent | `2` | Отображает текстурированные и освещенные геометрические фигуры (треугольники) с дополнительным уровнем прозрачности. |
| TransparentWireframe | `3` | Отображает текстурированные и освещенные геометрические фигуры (треугольники) с дополнительным уровнем прозрачности, с одноцветными непрозрачными краями поверх них. |
| BoundingBox | `4` | Отображает края ограничивающей рамки каждого узла, выровненные с осями локального координатного пространства для этого узла. |
| TransparentBoundingBox | `5` | Отображает грани ограничительных рамок каждого узла, выровненные с осями локального координатного пространства для этого узла, с добавленным уровнем прозрачности. |
| TransparentBoundingBoxOutline | `6` | Отображает края и грани ограничивающих рамок каждого узла, выровненные с осями локального координатного пространства для этого узла, с добавленным уровнем прозрачности. |
| Wireframe | `7` | Отображает только ребра одного цвета. |
| ShadedWireframe | `8` | Отображает только ребра, но интерполирует их цвет между двумя их вершинами и применяет освещение. |
| HiddenWireframe | `9` | Отображает края одним цветом, но удаляет обратные и закрытые края. |
| Vertices | `10` | Отображает только вершины одного цвета. |
| ShadedVertices | `11` | Отображает только вершины, но использует цвет их вершин и применяет освещение. |
| Illustration | `12` | Отображает края силуэта с поверхностями, удаляет затененные линии. |
| SolidOutline | `13` | Отображает края силуэта с освещенными и текстурированными поверхностями, удаляет затемненные линии. |
| ShadedIllustration | `14` | Отображает края силуэта с освещенными и текстурированными поверхностями, а также дополнительный коэффициент излучения для удаления плохо освещенных областей изображения. |

### Смотрите также

* пространство имен [Aspose.ThreeD.Formats](../../aspose.threed.formats)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
