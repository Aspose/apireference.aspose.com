---
title: Geometry.AsImage
second_title: Referencia de API de Aspose.GIS para .NET
description: Geometry método. Exportar esta geometría a una representación de imagen.
type: docs
weight: 120
url: /es/net/aspose.gis.geometries/geometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Exportar esta geometría a una representación de imagen.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| outputPath | AbstractPath | Ruta a la imagen de salida. |
| width | Measurement | Ancho del mapa. |
| height | Measurement | Altura del mapa. |
| renderer | Renderer | Renderizador a utilizar. |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. Si`null`, se utiliza el símbolo predeterminado. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | cualquier argumento`null`. |
| IOException | Se produjo un error de E/S. |
| [GisException](../../../aspose.gis/gisexception/) | Un error al procesar o leer datos GIS. |
| ArgumentException | La unidad de ancho o alto es!:Unit.MapUnits . |
| ArgumentOutOfRangeException | El ancho o la altura es negativo o cero. |

### Ver también

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Exportar esta geometría a una representación de imagen.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| outputPath | String | Ruta a la imagen de salida. |
| width | Measurement | Ancho del mapa. |
| height | Measurement | Altura del mapa. |
| renderer | Renderer | Renderizador a utilizar. |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. Si`null`, se utiliza el símbolo predeterminado. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | cualquier argumento`null`. |
| IOException | Se produjo un error de E/S. |
| [GisException](../../../aspose.gis/gisexception/) | Un error al procesar o leer datos GIS. |
| ArgumentException | La unidad de ancho o alto es!:Unit.MapUnits . |
| ArgumentOutOfRangeException | El ancho o la altura es negativo o cero. |

### Ver también

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Exportar esta geometría a una representación de imagen.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| width | Measurement | Ancho del mapa. |
| height | Measurement | Altura del mapa. |
| renderer | Renderer | Renderizador a utilizar. |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. Si`null`, se utiliza el símbolo predeterminado. |

### Valor_devuelto

La imagen como flujo

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | cualquier argumento`null`. |
| IOException | Se produjo un error de E/S. |
| [GisException](../../../aspose.gis/gisexception/) | Un error al procesar o leer datos GIS. |
| ArgumentException | La unidad de ancho o alto es!:Unit.MapUnits . |
| ArgumentOutOfRangeException | El ancho o la altura es negativo o cero. |

### Ver también

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* espacio de nombres [Aspose.Gis.Geometries](../../geometry/)
* asamblea [Aspose.GIS](../../../)


