---
title: TopoJsonOptions.DefaultObjectName
second_title: Aspose.GIS voor .NET API-referentie
description: TopoJsonOptions eigendom. Naam van het object waarin objecten standaard worden geplaatst.
type: docs
weight: 20
url: /nl/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Naam van het object waarin objecten standaard worden geplaatst.

```csharp
public string DefaultObjectName { get; set; }
```

### Opmerkingen

Dit is een schrijfoptie - het heeft geen invloed op het lezen. TopoJSON kan een onbeperkt aantal benoemde objecten bevatten. Elk dergelijk object kan meerdere functies bevatten. Gebruik om te specificeren in welk object uw object moet worden geplaatst[`ObjectNameAttribute`](../objectnameattribute/) property. Als attribuut met naam[`ObjectNameAttribute`](../objectnameattribute/) is`null`of unset for een functie, deze functie wordt toegevoegd aan het object met de naam`DefaultObjectName` . Als attribuut met naam[`ObjectNameAttribute`](../objectnameattribute/) is niet aanwezig in[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) verzameling, alle kenmerken worden in object met naam geplaatst[`ObjectNameAttribute`](../objectnameattribute/) . Standaardwaarde is "naamloos".

### Zie ook

* class [TopoJsonOptions](../)
* naamruimte [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* montage [Aspose.GIS](../../../)


