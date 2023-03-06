---
title: AbstractPath.Combine
second_title: Aspose.GIS för .NET API Referens
description: AbstractPath metod. Kombinerar dettaAbstractPath med specificerade sökvägskomponenter.
type: docs
weight: 50
url: /sv/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Kombinerar detta[`AbstractPath`](../) med specificerade sökvägskomponenter.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| location | String | En sökvägskomponent att lägga till detta[`AbstractPath`](../). |

### Returvärde

En ny[`AbstractPath`](../) pekar på en[`Location`](../location/) det är en kombination av platser av detta[`AbstractPath`](../)and argumentet.

### Anmärkningar

Vanligtvis bör denna metod inte åsidosättas av en arvtagare. Standardimplementeringen sammanfogar detta[`Location`](../location/) med argumentet och kallar[`WithLocation`](../withlocation/) -metoden med den sammanlänkade strängen som argument. Kombinationsresultatet definieras på följande sätt:  Om argumentet börjar med[`Separator`](../separator/), kombinationsresultatet är lika med argumentet; Annars, om[`Location`](../location/) slutar med[`Separator`](../separator/) , kombinationsresultatet är lika med` +`; Annars är resultatet lika med` + +`

### Se även

* class [AbstractPath](../)
* namnutrymme [Aspose.Gis](../../abstractpath/)
* hopsättning [Aspose.GIS](../../../)


