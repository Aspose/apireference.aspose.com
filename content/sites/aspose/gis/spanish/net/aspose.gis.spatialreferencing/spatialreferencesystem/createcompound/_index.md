---
title: SpatialReferenceSystem.CreateCompound
second_title: Referencia de API de Aspose.GIS para .NET
description: SpatialReferenceSystem método. Crear compuesto SRS.
type: docs
weight: 340
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Crear compuesto SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| name | String | Nombre del nuevo SRS. |
| head | SpatialReferenceSystem | Jefe SRS de nuevo SRS. |
| tail | SpatialReferenceSystem | SRS de cola de SRS nuevo. |
| identifier | Identifier | Identificador, que se adjuntará al SRS. Adjuntar un identificador no modificará otros parámetros de SRS. Depende de usted garantizar la coherencia del identificador y los parámetros de SRS. |

### Valor_devuelto

Nuevo Compuesto SRS.

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | Cualquier argumento excepto*identifier* es`null` . |
| InvalidOperationException | *head* o*tail* son compuestos SRS en sí mismos. |

### Ver también

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* asamblea [Aspose.GIS](../../../)


