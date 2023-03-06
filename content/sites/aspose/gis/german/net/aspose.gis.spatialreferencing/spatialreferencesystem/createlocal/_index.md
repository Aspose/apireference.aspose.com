---
title: SpatialReferenceSystem.CreateLocal
second_title: Aspose.GIS für .NET-API-Referenz
description: SpatialReferenceSystem methode. Lokalen SRS erstellen.
type: docs
weight: 370
url: /de/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Lokalen SRS erstellen.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Name des SRS. |
| datum | LocalDatum | In SRS zu verwendendes Datum. |
| unit | Unit | Einheit zur Verwendung in SRS. |
| axises | ICollection`1 | In SRS zu verwendende Achsen. Darf nicht leer sein |
| identifier | Identifier | Kennung, die an SRS angehängt wird. Durch das Anhängen einer Kennung werden andere SRS-Parameter nicht geändert. Es liegt an Ihnen, die Konsistenz von Kennung und SRS-Parametern sicherzustellen. |

### Rückgabewert

Neues lokales SRS.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | *axises* ist leer. |
| ArgumentNullException | Irgendein Argument, außer*identifier* ist Null. |

### Siehe auch

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* namensraum [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Montage [Aspose.GIS](../../../)


