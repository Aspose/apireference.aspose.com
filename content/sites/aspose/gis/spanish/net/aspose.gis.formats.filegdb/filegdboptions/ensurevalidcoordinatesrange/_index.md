---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Referencia de API de Aspose.GIS para .NET
description: FileGdbOptions propiedad. Si las coordenadas deben estar en un rango válido.
type: docs
weight: 30
url: /es/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

Si las coordenadas deben estar en un rango válido.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### Observaciones

Esta es una opción de creación y no afecta la lectura. Si se establece en`true` se lanzará una excepción al intentar escribir una coordenada con valores fuera del rango válido. Si se establece en`false` dicha coordenada se escribirá silenciosamente. El rango válido se define por[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) . Referirse a[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) documentación para leer acerca de cómo se determina el rango válido a partir de la cuadrícula de precisión de coordenadas. El valor predeterminado es`false` .

### Ver también

* class [FileGdbOptions](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* asamblea [Aspose.GIS](../../../)


