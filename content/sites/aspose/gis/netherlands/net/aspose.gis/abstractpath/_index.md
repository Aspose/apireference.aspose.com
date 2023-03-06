---
title: Class AbstractPath
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.AbstractPath klas. EenAbstractPath is een basisklasse voor klassen die een unieke locatie specificeren in een omgeving vergelijkbaar met een bestandssysteem zoals een lokaal bestandssysteem een externe bestandsopslag of een ZIParchief onder andere.
type: docs
weight: 10
url: /nl/net/aspose.gis/abstractpath/
---
## AbstractPath class

Een`AbstractPath` is een basisklasse voor klassen die een unieke locatie specificeren in een omgeving vergelijkbaar met een bestandssysteem, zoals een lokaal bestandssysteem, een externe bestandsopslag of een ZIP-archief, onder andere.

```csharp
public abstract class AbstractPath
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Krijgt een tekenreeksrepresentatie van de locatie hiervan`AbstractPath` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Krijgt een scheidingsteken dat wordt gebruikt om mapniveaus van de[`Location`](./location/) snaar. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Creëert een`AbstractPath` dat een locatie op het lokale bestandssysteem vertegenwoordigt. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Creëert een`AbstractPath` van eenStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Combineert dit`AbstractPath` met opgegeven padcomponenten. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Verwijdert een bestand waarnaar dit pad verwijst. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Geeft de extensie hiervan terug`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Geeft de bestandsnaam en extensie hiervan terug`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Geeft de bestandsnaam hiervan terug`AbstractPath` zonder de extensie. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Krijgt een waarde die aangeeft of dit pad verwijst naar een bestaand bestand dat kan worden geopend om te lezen. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Retourneert paden die zich hierin bevinden`AbstractPath` , als het een map is. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Opent dit`AbstractPath`als bestand. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Retourneert een nieuwe`AbstractPath` met de bestandsextensie gewijzigd in de opgegeven waarde. |

### Opmerkingen

Een`AbstractPath` kan een locatie op een lokaal bestandssysteem specificeren, een locatie op een extern bestandssysteem of een externe opslag zoals de Azure Blob-opslag, enzovoort. De locatie kan verwijzen naar bestaande of niet bestaande bestandsachtige objecten, directory-achtige objecten of een andere betekenis hebben die redelijk is voor de omgeving waartoe deze behoort. Als voorbeeld, een`AbstractPath` erfgenaam die een locatie op het lokale bestandssysteem vertegenwoordigt, kan verwijzen naar een bestaand -bestand, map of naar een plaats in het bestandssysteem die nog niet is gemaakt. Om een nieuwe bestandssysteemachtige opslag beschikbaar te maken voor`Aspose.GIS` zou men deze class moeten erven en zijn abstracte methoden moeten implementeren.

### Zie ook

* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


