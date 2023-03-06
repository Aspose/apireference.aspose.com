---
title: RasterDriver.OpenLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: RasterDriver método. Abre la capa para lectura.
type: docs
weight: 20
url: /es/net/aspose.gis/rasterdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_1}

Abre la capa para lectura.

```csharp
public abstract RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | RasterDriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir capas ráster (ver[`CanOpenLayers`](../canopenlayers/)). |

### Ver también

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* espacio de nombres [Aspose.Gis](../../rasterdriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenLayer(string) {#openlayer_2}

Abre la capa para lectura.

```csharp
public RasterLayer OpenLayer(string path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |

### Valor_devuelto

una instancia de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir capas ráster (ver[`CanOpenLayers`](../canopenlayers/)). |

### Ver también

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriver](../)
* espacio de nombres [Aspose.Gis](../../rasterdriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Abre la capa para lectura.

```csharp
public RasterLayer OpenLayer(AbstractPath path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |

### Valor_devuelto

una instancia de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | el camino es`null`. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir capas ráster (ver[`CanOpenLayers`](../canopenlayers/)). |

### Ver también

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../abstractpath/)
* class [RasterDriver](../)
* espacio de nombres [Aspose.Gis](../../rasterdriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenLayer(string, RasterDriverOptions) {#openlayer_3}

Abre la capa para lectura.

```csharp
public RasterLayer OpenLayer(string path, RasterDriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | RasterDriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir capas ráster (ver[`CanOpenLayers`](../canopenlayers/)). |

### Ver también

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterDriverOptions](../../rasterdriveroptions/)
* class [RasterDriver](../)
* espacio de nombres [Aspose.Gis](../../rasterdriver/)
* asamblea [Aspose.GIS](../../../)


