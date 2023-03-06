---
title: TopoJsonOptions.Transform
second_title: Справочник по Aspose.GIS for .NET API
description: TopoJsonOptions свойство. Определяет объект преобразования используемый для квантования координат и дельтакодирования дуг в выходных данных TopoJSON.
type: docs
weight: 60
url: /ru/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

Определяет объект преобразования, используемый для квантования координат и дельта-кодирования дуг в выходных данных TopoJSON.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### Примечания

Это опция записи - не влияет на чтение. Эта опция взаимоисключающая с[`QuantizationNumber`](../quantizationnumber/) - только один из этих двух вариантов может быть не`null` . Если это не так`null` - выходные координаты TopoJSON квантованы, а дуги дельта-кодированы с указанным объектом преобразования . Обратитесь к спецификации TopoJSON для получения более подробной информации об объекте преобразования. По умолчанию к`null` .

### Смотрите также

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* пространство имен [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* сборка [Aspose.GIS](../../../)


