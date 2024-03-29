---
title: TopoJsonOptions.QuantizationNumber
second_title: Справочник по Aspose.GIS for .NET API
description: TopoJsonOptions свойство. Определяет номер квантования используемый для квантования координат и дельтакодирования дуг в выходных данных TopoJSON.
type: docs
weight: 50
url: /ru/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Определяет номер квантования, используемый для квантования координат и дельта-кодирования дуг в выходных данных TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Аргумент меньше двух. |

### Примечания

Это опция записи - не влияет на чтение. Эта опция взаимоисключающая с[`Transform`](../transform/) - только один из этих двух вариантов может быть не`null` . Если это не так`null` - выходные координаты TopoJSON квантуются, а дуги дельта-кодируются с указанным номером квантования . Число квантования определяет максимальное количество выражаемых значений на размерность в результирующих квантованных координатах; обычно выбирается степень десяти. По умолчанию`null` .

### Смотрите также

* class [TopoJsonOptions](../)
* пространство имен [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* сборка [Aspose.GIS](../../../)


