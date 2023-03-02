---
title: SpatialReferenceSystem.CreateCompound
second_title: Riferimento API Aspose.GIS per .NET
description: SpatialReferenceSystem metodo. Crea composto SRS.
type: docs
weight: 340
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Crea composto SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Nome del nuovo SRS. |
| head | SpatialReferenceSystem | Capo SRS del nuovo SRS. |
| tail | SpatialReferenceSystem | SRS di coda del nuovo SRS. |
| identifier | Identifier | Identificatore, che verrà allegato a SRS. Allegare un identificatore non modificherà altri parametri SRS. Spetta a te garantire la coerenza dell'identificatore e dei parametri SRS. |

### Valore di ritorno

Nuova mescola SRS.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Qualsiasi argomento tranne*identifier* È`null` . |
| InvalidOperationException | *head* O*tail* sono composti SRS stessi. |

### Guarda anche

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assemblea [Aspose.GIS](../../../)


