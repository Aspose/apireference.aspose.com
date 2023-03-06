---
title: SpatialReferenceSystem.CreateVertical
second_title: Riferimento API Aspose.GIS per .NET
description: SpatialReferenceSystem metodo. Crea SRS verticale.
type: docs
weight: 390
url: /it/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Crea SRS verticale.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Nome di SRS. Se`null` . |
| verticalDatum | VerticalDatum | Datum da utilizzare in SRS. |
| verticalUnit | Unit | Unità da utilizzare in SRS. Se`null` ,[`Meter`](../../unit/meter/) verrà utilizzato. |
| verticalAxis | Axis | Asse con direzione "up" o "down", da utilizzare in SRS. Se`null` , verrà utilizzato l'asse con la direzione in alto. |
| identifier | Identifier | Identificatore, che verrà allegato a SRS. Allegare un identificatore non modificherà altri parametri SRS. Spetta a te garantire la coerenza dell'identificatore e dei parametri SRS. |

### Valore di ritorno

Nuovo SRS verticale.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| InvalidOperationException | *verticalAxis* la direzione non è su o giù. |
| ArgumentNullException | Alcuni dei parametri obbligatori sono nulli. |

### Guarda anche

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assemblea [Aspose.GIS](../../../)


