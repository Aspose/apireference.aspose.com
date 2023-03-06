---
title: FileGdbOptions.ZTolerance
second_title: Referencia de API de Aspose.GIS para .NET
description: FileGdbOptions propiedad. Tolerancia de ajuste Z.
type: docs
weight: 80
url: /es/net/aspose.gis.formats.filegdb/filegdboptions/ztolerance/
---
## FileGdbOptions.ZTolerance property

Tolerancia de ajuste Z.

```csharp
public double? ZTolerance { get; set; }
```

### Observaciones

Esta es una opción de creación y no afecta la lectura. Este parámetro controla una tolerancia de ajuste utilizada para características avanzadas de ArcGIS. No afecta el comportamiento de Aspose.GIS, pero puede ser utilizado por ArcGIS. La unidad del parámetro es la unidad del sistema de referencia espacial. Si se establece en`null` , se utiliza el valor predeterminado. Si el sistema de referencia espacial es unknown o tiene menos de tres dimensiones, el valor predeterminado es 0,001. Si el sistema de referencia espacial tiene tres dimensiones , el valor predeterminado es 0,001 metros convertidos a la unidad de la tercera dimensión.

### Ver también

* class [FileGdbOptions](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* asamblea [Aspose.GIS](../../../)


