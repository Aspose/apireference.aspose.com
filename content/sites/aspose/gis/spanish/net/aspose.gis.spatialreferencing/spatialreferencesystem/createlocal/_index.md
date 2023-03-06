---
title: SpatialReferenceSystem.CreateLocal
second_title: Referencia de API de Aspose.GIS para .NET
description: SpatialReferenceSystem método. Crear SRS local.
type: docs
weight: 370
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Crear SRS local.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| name | String | Nombre de SRS. |
| datum | LocalDatum | Dato a utilizar en SRS. |
| unit | Unit | Unidad a utilizar en SRS. |
| axises | ICollection`1 | Ejes a utilizar en SRS. No debe estar vacío |
| identifier | Identifier | Identificador, que se adjuntará al SRS. Adjuntar un identificador no modificará otros parámetros de SRS. Depende de usted garantizar la coherencia del identificador y los parámetros de SRS. |

### Valor_devuelto

Nuevo SRS Local.

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | *axises* esta vacio. |
| ArgumentNullException | Cualquier argumento, excepto*identifier* es nulo. |

### Ver también

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* asamblea [Aspose.GIS](../../../)


