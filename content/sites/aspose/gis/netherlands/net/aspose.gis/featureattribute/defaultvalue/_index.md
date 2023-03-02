---
title: FeatureAttribute.DefaultValue
second_title: Aspose.GIS voor .NET API-referentie
description: FeatureAttribute eigendom. Haalt of stelt een waarde in voor het attribuut die ontbrekende gegevens aangeeft.
type: docs
weight: 50
url: /nl/net/aspose.gis/featureattribute/defaultvalue/
---
## FeatureAttribute.DefaultValue property

Haalt of stelt een waarde in voor het attribuut, die ontbrekende gegevens aangeeft.

```csharp
public object DefaultValue { get; set; }
```

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Het attribuut is vergrendeld. |
| InvalidOperationException | Het attribuut staat het niet toe`nul` waarden. |

### Opmerkingen

Dit is de waarde die een ontbrekend stuk informatie vertegenwoordigt, wanneer een attribuut het niet toestaat`nul`waarde. Voor attributen die wel toestaan`nul` waarden ([`CanBeNull`](../canbenull/) ==`WAAR` ),`DefaultValue` is`nul` tenzij expliciet gewijzigd.

### Zie ook

* class [FeatureAttribute](../)
* naamruimte [Aspose.Gis](../../featureattribute/)
* montage [Aspose.GIS](../../../)


