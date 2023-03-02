---
title: AbstractPath.Combine
second_title: Aspose.GIS voor .NET API-referentie
description: AbstractPath methode. Combineert ditAbstractPath met opgegeven padcomponenten.
type: docs
weight: 50
url: /nl/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Combineert dit[`AbstractPath`](../) met opgegeven padcomponenten.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| location | String | Een padcomponent om hieraan toe te voegen[`AbstractPath`](../). |

### Winstwaarde

Een nieuwe[`AbstractPath`](../) wijzend naar een[`Location`](../location/) dat is een combinatie van locaties hiervan[`AbstractPath`](../)and het argument.

### Opmerkingen

Gewoonlijk zou deze methode niet overschreven moeten worden door een erfgenaam. De standaardimplementatie voegt dit samen[`Location`](../location/) met het argument en roept de[`WithLocation`](../withlocation/) methode met de samengevoegde tekenreeks als argument. Het resultaat van de combinatie wordt op de volgende manier gedefinieerd:  Als het argument begint met de[`Separator`](../separator/), het resultaat van de combinatie is gelijk aan het argument; Anders, als[`Location`](../location/) eindigt met de[`Separator`](../separator/) , het resultaat van de combinatie is gelijk aan` +`; Anders is het resultaat gelijk aan` + +`

### Zie ook

* class [AbstractPath](../)
* naamruimte [Aspose.Gis](../../abstractpath/)
* montage [Aspose.GIS](../../../)


