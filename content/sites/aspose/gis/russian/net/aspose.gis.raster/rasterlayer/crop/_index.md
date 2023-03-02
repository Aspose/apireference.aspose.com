---
title: RasterLayer.Crop
second_title: Справочник по Aspose.GIS for .NET API
description: RasterLayer метод. Обрезает растровый слой используя форму формы и полосовую маску.
type: docs
weight: 110
url: /ru/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Обрезает растровый слой, используя форму формы (и полосовую маску).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| geometry | IGeometry | Геометрия представляла форму формы. |
| masks | Double[] | Маска для слоя обрезки |

### Возвращаемое значение

Обрезанный растровый слой. Если пересечения не найдены, возвращается`null`.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент не может быть нулевым. Имя параметра: геометрия. |
| NotSupportedException | Аргумент не может быть отличным от многоугольника или поверхности. Имя параметра: геометрия. |
| InvalidOperationException | Исходный слой не может быть другим CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Ошибка при обрезке слоя. |

### Смотрите также

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* пространство имен [Aspose.Gis.Raster](../../rasterlayer/)
* сборка [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Обрезает растровый слой с помощью полосовой маски).

```csharp
public RasterLayer Crop(double[] masks)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| masks | Double[] | Маска для слоя обрезки |

### Возвращаемое значение

Обрезанный растровый слой. Если пересечения не найдены, возвращается`null`.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException |  |

### Смотрите также

* class [RasterLayer](../)
* пространство имен [Aspose.Gis.Raster](../../rasterlayer/)
* сборка [Aspose.GIS](../../../)


