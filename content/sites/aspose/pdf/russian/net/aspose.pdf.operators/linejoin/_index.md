---
title: Enum LineJoin
second_title: Aspose.PDF for .NET API Reference
description: Enum LineJoin Aspose.Pdf.Operators. Стиль соединения линий должен указывать форму, которая будет использоваться на углах путей, которые обводятся
type: docs
weight: 7450
url: /ru/net/aspose.pdf.operators/linejoin/
---
## Перечисление LineJoin

Стиль соединения линий должен указывать форму, которая будет использоваться на углах путей, которые обводятся.

```csharp
public enum LineJoin
```

### Значения

| Название | Значение | Описание |
| --- | --- | --- |
| MiterJoin | `0` | Соединение в виде среза. Внешние края обводок для двух сегментов должны быть продлены до тех пор, пока они не встретятся под углом, как в рамке для картины. Если сегменты встречаются под слишком острым углом, как определено параметром предела среза (см. 8.4.3.5, "Предел среза"), вместо этого должно использоваться скошенное соединение. |
| RoundJoin | `1` | Закругленное соединение. Дуга круга с диаметром, равным ширине линии, должна быть нарисована вокруг точки, где встречаются два сегмента, соединяя внешние края обводок для двух сегментов. Эта фигура в форме кусочка пирога должна быть заполнена, создавая закругленный угол. |
| BevelJoin | `2` | Скошенное соединение. Два сегмента должны быть завершены плоскими капами (см. 8.4.3.3, "Стиль капы линии"), и образовавшаяся выемка за концами сегментов должна быть заполнена треугольником. |

### См. также

* пространство имен [Aspose.Pdf.Operators](../../aspose.pdf.operators/)
* сборка [Aspose.PDF](../../)