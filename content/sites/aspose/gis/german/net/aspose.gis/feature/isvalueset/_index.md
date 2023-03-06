---
title: Feature.IsValueSet
second_title: Aspose.GIS für .NET-API-Referenz
description: Feature methode. Überprüft ob der Attributwert in dieser Funktion festgelegt ist.
type: docs
weight: 90
url: /de/net/aspose.gis/feature/isvalueset/
---
## Feature.IsValueSet method

Überprüft, ob der Attributwert in dieser Funktion festgelegt ist.

```csharp
public bool IsValueSet(string attributeName)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| attributeName | String | Name des Attributs. |

### Rückgabewert

`true`wenn der Wert für das angegebene Attribut gesetzt ist; ansonsten,`false` .

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Das Attribut ist nicht gesperrt. |
| ArgumentException | Das Attribut mit diesem Namen ist in dieser Ebene nicht vorhanden. |
| ArgumentNullException | Der Attributname ist`null`. |

### Siehe auch

* class [Feature](../)
* namensraum [Aspose.Gis](../../feature/)
* Montage [Aspose.GIS](../../../)


