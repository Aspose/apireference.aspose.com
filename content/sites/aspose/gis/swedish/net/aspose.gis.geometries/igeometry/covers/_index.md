---
title: IGeometry.Covers
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Bestämmer om denna geometri täcker en specificerad geometri.
type: docs
weight: 150
url: /sv/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

Bestämmer om denna geometri täcker en specificerad geometri.

```csharp
public bool Covers(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri. |

### Returvärde

`true` om denna geometri är "spatialt täcker" en annan geometri.`false` annars.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | En av geometrierna är ogiltig på ett sådant sätt att operationen inte kan avslutas. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Anmärkningar

Denna metod testar om en geometri täcker en annan i termer av DE-9IM skärningsmatris. En geometri täcker en annan, om geometrin innehåller varje punkt i en annan geometri. Denna metod liknar[`SpatiallyContains`](../spatiallycontains/) , men återvänder`true` oftare, eftersom den inte skiljer mellan inre och gränspunkter. Så, om geometri A ligger på gränsen för geometri B,[`SpatiallyContains`](../spatiallycontains/) returnerar`false` , medan denna metod returnerar`true`. Denna metod motsvarar:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Se även

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


