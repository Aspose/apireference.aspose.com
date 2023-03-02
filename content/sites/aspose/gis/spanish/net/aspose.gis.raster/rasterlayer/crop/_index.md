---
title: RasterLayer.Crop
second_title: Referencia de API de Aspose.GIS para .NET
description: RasterLayer método. Recorta la capa ráster usando una forma de forma y una máscara de banda.
type: docs
weight: 110
url: /es/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Recorta la capa ráster usando una forma de forma (y una máscara de banda).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| geometry | IGeometry | La geometría representaba la forma de la forma. |
| masks | Double[] | Máscara para capa de recorte |

### Valor_devuelto

La capa ráster recortada. Si no se encuentran intersecciones regresa`null`.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento no puede ser nulo. Nombre del parámetro: geometría. |
| NotSupportedException | El argumento no puede ser diferente del polígono o la superficie. Nombre del parámetro: geometría. |
| InvalidOperationException | La capa original no puede ser otra CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Error al recortar la capa. |

### Ver también

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* espacio de nombres [Aspose.Gis.Raster](../../rasterlayer/)
* asamblea [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Recorta la capa ráster utilizando una máscara de banda).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| masks | Double[] | Máscara para capa de recorte |

### Valor_devuelto

La capa ráster recortada. Si no se encuentran intersecciones regresa`null`.

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException |  |

### Ver también

* class [RasterLayer](../)
* espacio de nombres [Aspose.Gis.Raster](../../rasterlayer/)
* asamblea [Aspose.GIS](../../../)


