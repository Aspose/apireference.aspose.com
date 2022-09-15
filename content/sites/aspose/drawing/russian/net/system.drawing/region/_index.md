---
title: Region
second_title: Справочник по API Aspose.Drawing для .NET
description: Описывает внутреннюю часть графической фигуры состоящей из прямоугольников и путей. Этот класс не может быть унаследован.
type: docs
weight: 1060
url: /ru/net/system.drawing/region/
---
## Region class

Описывает внутреннюю часть графической фигуры, состоящей из прямоугольников и путей. Этот класс не может быть унаследован.

```csharp
public sealed class Region : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [Region](region#constructor)() | Инициализирует новый экземпляр[`Region`](../region) класс. |
| [Region](region#constructor_1)(GraphicsPath) | Инициализирует новый экземпляр[`Region`](../region) класс с указаннымGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Инициализирует новый экземпляр[`Region`](../region) класс из указанногоRectangle структура. |
| [Region](region#constructor_4)(RectangleF) | Инициализирует новый экземпляр[`Region`](../region) класс из указанногоRectangleF структура. |
| [Region](region#constructor_2)(RegionData) | Инициализирует новый экземпляр[`Region`](../region) класс из указанных данных. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Создает точную копию этогоRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | Обновляет этоRegion содержать часть указанногоGraphicsPath что do не пересекается с этимRegion . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | Обновляет этоRegion содержать часть указанногоRectangle структура , которая не пересекается с этойRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | Обновляет этоRegion содержать часть указанногоRectangleF структура , которая не пересекается с этойRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | Обновляет этоRegion содержать часть указанногоRegion что не пересекается с этимRegion . |
| [Dispose](../../system.drawing/region/dispose)() | Освобождает все ресурсы, используемые этимRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | Проверяет, указанныйRegion идентичен этомуRegion на указанной поверхности рисования. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | Обновляет этоRegion содержать только ту часть его внутренней части, которая не пересекается с указанным GraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | Обновляет этоRegion содержать только ту часть его внутренней части, которая не пересекается с указаннымRectangle структура. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | Обновляет этоRegion содержать только ту часть его внутренней части, которая не пересекается с указанным RectangleF структура. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | Обновляет этоRegion содержать только ту часть его внутренней части, которая не пересекается с указаннымRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | ПолучаетRectangleFструктура, представляющая прямоугольник, который ограничивает этоRegion на поверхности рисованияGraphics объект. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | ВозвращаетRegionData который представляет информацию, описывающую этоRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Возвращает массивRectangleF структуры, приближенные к этомуRegion после применения указанного матричного преобразования. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | Обновляет этоRegion до пересечения себя с указаннымGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | Обновляет этоRegion до пересечения себя с указаннымRectangle структура. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | Обновляет этоRegion до пересечения себя с указанным RectangleF структура. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | Обновляет этоRegion до пересечения себя с указаннымRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Проверяет, является ли этоRegion имеет пустую внутреннюю часть на указанной поверхности рисования. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Проверяет, является ли этоRegion имеет бесконечную внутреннюю часть на указанной поверхности рисования. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | Проверяет, указанныйPoint структура содержится в этомRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | Проверяет, указанныйPointF структура содержится в этомRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Проверяет, является ли какая-либо часть указанногоRectangle структура содержится внутри this Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Проверяет, является ли какая-либо часть указанногоRectangleF структура содержится внутри этогоRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Проверяет, содержится ли указанная точка в этомRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | Проверяет, указанныйPoint структура содержится в этомRegion при рисовании с использованием указанногоGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | Проверяет, указанныйPointF структура содержится в этомRegion при рисовании с использованием указанногоGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Проверяет, является ли какая-либо часть указанногоRectangle структура содержится внутри этогоRegion при рисовании с использованием указанногоGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Проверяет, является ли какая-либо часть указанногоRectangleF структура содержится внутри этогоRegion при рисовании с использованием указанногоGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Проверяет, содержится ли указанная точка в этомRegion при рисовании с использованием указанногоGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Проверяет, содержится ли указанная точка в этомRegion объект при рисовании с помощью указанногоGraphics объект. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion при рисовании с использованием указанногоGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Проверяет, содержится ли какая-либо часть указанного прямоугольника в этомRegion когда нарисовано с использованием указанногоGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Инициализирует этоRegion в пустой интерьер. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Инициализирует этоRegion объект в бесконечный интерьер. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Преобразует этоRegion указаннымMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Смещает координаты этогоRegion на указанную сумму. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Смещает координаты этогоRegion на указанную сумму. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | Обновляет этоRegion к союзу самого себя и указанногоGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | Обновляет этоRegion к союзу самого себя и указанногоRectangle структура. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | Обновляет этоRegion к союзу самого себя и указанногоRectangleF структура. |
| [Union](../../system.drawing/region/union#union_3)(Region) | Обновляет этоRegion к союзу самого себя и указанногоRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | Обновляет этоRegionна объединение минус пересечение самого себя с указанным GraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | Обновляет этоRegionна объединение минус пересечение самого себя с указанным Rectangle структура. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | Обновляет этоRegion на объединение минус пересечение себя с указаннымRectangleF структура. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | Обновляет этоRegionна объединение минус пересечение самого себя с указанным Region . |

### Смотрите также

* пространство имен [System.Drawing](../../system.drawing)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
