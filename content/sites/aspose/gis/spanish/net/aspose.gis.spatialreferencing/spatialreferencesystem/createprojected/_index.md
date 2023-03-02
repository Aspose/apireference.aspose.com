---
title: SpatialReferenceSystem.CreateProjected
second_title: Referencia de API de Aspose.GIS para .NET
description: SpatialReferenceSystem método. Crear SRS proyectado a partir de parámetros personalizados.
type: docs
weight: 380
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Crear SRS proyectado a partir de parámetros personalizados.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Parámetros desde los que crear. |
| identifier | Identifier | Identificador, que se adjuntará al SRS. Adjuntar un identificador no modificará otros parámetros de SRS. Depende de usted garantizar la coherencia del identificador y los parámetros de SRS. |

### Valor_devuelto

Nuevo SRS Proyectado.

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | SRS base en parámetros es`null` . El método de proyección en los parámetros es`null` . |

### Ver también

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* asamblea [Aspose.GIS](../../../)


