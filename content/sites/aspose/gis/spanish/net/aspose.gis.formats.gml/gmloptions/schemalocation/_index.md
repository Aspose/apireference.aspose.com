---
title: GmlOptions.SchemaLocation
second_title: Referencia de API de Aspose.GIS para .NET
description: GmlOptions propiedad. Lista separada por espacios de pares de URI. El primer URI de cada par es un URI del espacio de nombres el segundo URI es una ruta al esquema XML del espacio de nombres. Si se establece ennull GmlDriver intentará leer schemaLocation desde el elemento raíz del documento. El valor predeterminado esnull .
type: docs
weight: 50
url: /es/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Lista separada por espacios de pares de URI. El primer URI de cada par es un URI del espacio de nombres, el segundo URI es una ruta al esquema XML del espacio de nombres. Si se establece en`null` ,[`GmlDriver`](../../gmldriver/) intentará leer schemaLocation desde el elemento raíz del documento. El valor predeterminado es`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Observaciones

Aspose.GIS utiliza el esquema XML del archivo GML para crear[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) De forma predeterminada, la ubicación del esquema se extrae del atributo schemaLocation. Si no existe tal atributo o apunta a una ubicación no válida, Aspose.GIS no podrá leer el archivo GML. En este caso, configure esta opción para que Aspose.GIS pueda cargar schema.

### Ejemplos

"http://sitio.com/espacio de nombres http://sitio.com/esquema.xsd"

### Ver también

* class [GmlOptions](../)
* espacio de nombres [Aspose.Gis.Formats.Gml](../../gmloptions/)
* asamblea [Aspose.GIS](../../../)


