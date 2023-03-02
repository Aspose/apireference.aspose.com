---
title: FileGdbOptions.GeometryFieldName
second_title: Referencia de API de Aspose.GIS para .NET
description: FileGdbOptions propiedad. Nombre del campo de geometría.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/
---
## FileGdbOptions.GeometryFieldName property

Nombre del campo de geometría.

```csharp
public string GeometryFieldName { get; set; }
```

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El valor no es un nombre de campo válido. Un nombre de campo válido debe:  No seas`null` y no vacíoComience con letra latina o guión bajoContener solo letras latinas, dígitos o guiones bajos |

### Observaciones

Esta es una opción de creación y no afecta la lectura. Define el nombre del campo de geometría (columna). Por defecto es "SHAPE". Si algún atributo en[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) tiene un nombre igual al valor de esta propiedad, entonces se cambia el nombre de este atributo.

### Ver también

* class [FileGdbOptions](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* asamblea [Aspose.GIS](../../../)


