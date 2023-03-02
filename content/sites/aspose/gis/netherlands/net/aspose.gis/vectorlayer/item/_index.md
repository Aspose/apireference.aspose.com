---
title: VectorLayer.Item
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer eigendom. Krijgt deFeature op de opgegeven index.
type: docs
weight: 70
url: /nl/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

Krijgt de[`Feature`](../../feature/) op de opgegeven index.

```csharp
public virtual Feature this[int index] { get; }
```

| Parameter | Beschrijving |
| --- | --- |
| index | De index van het kenmerk. |

### Eigendoms-waarde

De[`Feature`](../../feature/) .

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | wordt gegenereerd als de laag alleen-schrijven wordt geopend. |
| ArgumentOutOfRangeException | Index is buiten bereik. |
| [GisException](../../gisexception/) | Fout bij het lezen van de functie uit het bestand. |
| IOException | Er is een I/O-fout opgetreden. |

### Zie ook

* class [Feature](../../feature/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


