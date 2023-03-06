---
title: Feature.GetValuesDump
second_title: Aspose.GIS für .NET-API-Referenz
description: Feature methode. Gibt die Werte für alle Attribute in einem Array zurück. Ziehen Sie die Verwendung in BetrachtGetValues Methode um zusätzliche Speicherzuweisung zu vermeiden.
type: docs
weight: 60
url: /de/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Gibt die Werte für alle Attribute in einem Array zurück. Ziehen Sie die Verwendung in Betracht[`GetValues`](../getvalues/) Methode, um zusätzliche Speicherzuweisung zu vermeiden.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| defaultValue | Object | Der zurückzugebende Wert, wenn der Attributwert fehlt (ungesetzt). Standardwert ist`null`. Erwägen Sie die Verwendung von 'DBNull.Value' zum Trennen von 'unset' und '`null` Werte. |

### Rückgabewert

Ein neues Array, in das die Attributwerte kopiert werden.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Das Argument ist`null`. |
| InvalidOperationException | Das Attribut ist nicht gesperrt. |

### Bemerkungen

Die Values-Attribute des Features werden in das Values-Array kopiert, das als Parameter übergeben wird. Für Attribute mit nicht gesetztem Wert wird der angegebene 'unsetValue'-Parameter zurückgegeben.

### Siehe auch

* class [Feature](../)
* namensraum [Aspose.Gis](../../feature/)
* Montage [Aspose.GIS](../../../)


