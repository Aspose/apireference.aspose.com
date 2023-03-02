---
title: VectorMapLayer.ImportSld
second_title: Referencia de API de Aspose.GIS para .NET
description: VectorMapLayer método. Importa el estilo del archivo Styled Layer Descriptor ubicado en la ruta especificada.
type: docs
weight: 60
url: /es/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

Importa el estilo del archivo Styled Layer Descriptor ubicado en la ruta especificada.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo descriptor de capa con estilo. |
| options | SldImportOptions | Opciones de importación. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| XmlException | Se produjo un error al analizar el XML. |
| FormatException | No se encontró ningún estilo SLD en el XML. |

### Observaciones

Este método sobrescribe el valor del[`Symbolizer`](../symbolizer/) propiedad.

### Ver también

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* espacio de nombres [Aspose.Gis.Rendering](../../vectormaplayer/)
* asamblea [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

Importa el estilo del archivo Styled Layer Descriptor ubicado en la ruta especificada.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo descriptor de capa con estilo. |
| options | SldImportOptions | Opciones de importación. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |
| XmlException | Se produjo un error al analizar el XML. |
| FormatException | No se encontró ningún estilo SLD en el XML. |

### Observaciones

Este método sobrescribe el valor del[`Symbolizer`](../symbolizer/) propiedad.

### Ver también

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* espacio de nombres [Aspose.Gis.Rendering](../../vectormaplayer/)
* asamblea [Aspose.GIS](../../../)


