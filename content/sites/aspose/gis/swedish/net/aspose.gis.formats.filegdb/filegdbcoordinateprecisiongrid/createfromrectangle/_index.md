---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS för .NET API Referens
description: FileGdbCoordinatePrecisionGrid metod. Skapar nyttFileGdbCoordinatePrecisionGrid så att alla värden inom en rektangel är representerbara.
type: docs
weight: 20
url: /sv/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

Skapar nytt`FileGdbCoordinatePrecisionGrid` så att alla värden inom en rektangel är representerbara.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| p1 | IPoint | Ena hörnet av rektangeln. |
| p2 | IPoint | Rektangelns motsatta hörn. Måste ha samma mått som*p1*. |

### Returvärde

Den`FileGdbCoordinatePrecisionGrid`så att alla värden inom en rektangel är representerbara. Värden utanför rektangeln kan inte representeras, så alla koordinater som kommer att skrivas till FileGDB layer måste vara inuti rektangeln.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null` . |
| ArgumentException | *p1* och*p2* bilda inte en giltig icke-tom rektangel: *p1* eller*p2* är tom. HasZ' flaggor av*p1* är inte lika med 'HasZ'-flaggan för*p2* HasM' flaggor av*p1* är inte lika med 'HasM'-flaggan för*p2* X' koordinat av*p1* är lika med 'X'-koordinaten för*p2* Y' koordinat av*p1* är lika med 'Y'-koordinaten för*p2* Z' koordinat för*p1* är lika med 'Z'-koordinaten för*p2* M' koordinat av*p1* är lika med 'M'-koordinaten för*p2* Alla koordinater ärNaN eller oändlighet. |

### Se även

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* hopsättning [Aspose.GIS](../../../)


