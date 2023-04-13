---
title: Class AbstractSyncResponse
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.AbstractSyncResponse klas. Abstracte basisklasse van aan synchronisatiereacties gerelateerde klassen
type: docs
weight: 110
url: /nl/net/aspose.finance.ofx/abstractsyncresponse/
---
## AbstractSyncResponse class

Abstracte basisklasse van aan synchronisatiereacties gerelateerde klassen

```csharp
public class AbstractSyncResponse : AbstractResponse
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | Ja als het token in het synchronisatieverzoek ouder is dan de vroegste vermelding in de geschiedenistabel van de server. In dit geval zijn sommige antwoorden verloren gegaan. Nee als het token in het synchronisatieverzoek nieuwer is dan of overeenkomt met een token in het geschiedenistabel. |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | Haalt het nieuwe synchronisatietoken op of stelt het in. |

### Zie ook

* class [AbstractResponse](../abstractresponse/)
* naamruimte [Aspose.Finance.Ofx](../../aspose.finance.ofx/)
* montage [Aspose.Finance](../../)


