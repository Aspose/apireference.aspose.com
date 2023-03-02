---
title: WarpOptions.CellHeight
second_title: Справочник по Aspose.GIS for .NET API
description: WarpOptions свойство. Определяет новую высоту растровой ячейки в целевых единицах с географической привязкой. Если установлено значение 0CellHeight вычисляется автоматически. Значение по умолчанию  0.
type: docs
weight: 20
url: /ru/net/aspose.gis.raster/warpoptions/cellheight/
---
## WarpOptions.CellHeight property

Определяет новую высоту растровой ячейки (в целевых единицах с географической привязкой). Если установлено значение 0,`CellHeight` вычисляется автоматически. Значение по умолчанию — «0».

```csharp
public double CellHeight { get; set; }
```

### Примечания

Если для высоты ячейки установлено значение 0, значение будет взято из исходной высоты ячейки или вычислено из[`Height`](../height/) . Обратите внимание, что`CellHeight` нельзя использовать с[`Height`](../height/) .

### Смотрите также

* class [WarpOptions](../)
* пространство имен [Aspose.Gis.Raster](../../warpoptions/)
* сборка [Aspose.GIS](../../../)


