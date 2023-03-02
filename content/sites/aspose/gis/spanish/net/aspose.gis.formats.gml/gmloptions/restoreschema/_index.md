---
title: GmlOptions.RestoreSchema
second_title: Referencia de API de Aspose.GIS para .NET
description: GmlOptions propiedad. Determina si Aspose.GIS puede analizar atributos en un archivo Gml en el que falta un esquema XML o no se puede cargar. Si se establece entrue  el lector Aspose.GIS no requiere la presencia de un esquema XML. El valor predeterminado esfalse .
type: docs
weight: 40
url: /es/net/aspose.gis.formats.gml/gmloptions/restoreschema/
---
## GmlOptions.RestoreSchema property

Determina si Aspose.GIS puede analizar atributos en un archivo Gml en el que falta un esquema XML o no se puede cargar. Si se establece en`true` , el lector Aspose.GIS no requiere la presencia de un esquema XML. El valor predeterminado es`false` .

```csharp
public bool RestoreSchema { get; set; }
```

### Observaciones

El controlador intenta analizar automáticamente las clases de entidad y sus propiedades asociadas escaneando el archivo y buscando objetos "conocidos" para determinar la organización. Si bien este enfoque es propenso a errores, tiene la ventaja de funcionar para archivos GML incluso si el asociado El esquema XML se ha perdido o no se puede cargar desde Internet.

### Ver también

* class [GmlOptions](../)
* espacio de nombres [Aspose.Gis.Formats.Gml](../../gmloptions/)
* asamblea [Aspose.GIS](../../../)


