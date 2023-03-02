---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS für .NET-API-Referenz
description: LabelingRule methode. Erstellt eine neue Regel die eine Kennzeichnung auf das Feature anwendet wenn es den Filter passiert.
type: docs
weight: 20
url: /de/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Erstellt eine neue Regel, die eine Kennzeichnung auf das Feature anwendet, wenn es den Filter passiert.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filter | Func`2 | Legt fest, wann Beschriftung verwendet werden soll. |
| labeling | Labeling | Kennzeichnung anzuwenden. |

### Rückgabewert

Neues LabelingRule-Objekt.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Filter ist`null`. |

### Siehe auch

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* namensraum [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* Montage [Aspose.GIS](../../../)


