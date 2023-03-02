---
title: AbstractPath.Open
second_title: Aspose.GIS voor .NET API-referentie
description: AbstractPath methode. Opent ditAbstractPathals bestand.
type: docs
weight: 120
url: /nl/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Opent dit`AbstractPath`als bestand.

```csharp
public abstract Stream Open(FileAccess access)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| access | FileAccess | Specificeert een subset van bewerkingen die kunnen worden uitgevoerd op eenStream. |

### Winstwaarde

AStream geopend met de opgegevenFileAccess .

### Opmerkingen

Als*access* heeft de vlagWrite ingesteld en het bestand bestaat niet, moet een erfgenaam het maken. Een`AbstractPath` kan meerdere keren worden geopend door`Aspose.GIS` . Dit is vereist om een file onafhankelijk te kunnen lezen met meerdere streams. U moet het resultaat niet in de cache plaatsen, maar eerder nieuw retournerenStream elke keer wordt deze methode aangeroepen.

### Zie ook

* class [AbstractPath](../)
* naamruimte [Aspose.Gis](../../abstractpath/)
* montage [Aspose.GIS](../../../)


