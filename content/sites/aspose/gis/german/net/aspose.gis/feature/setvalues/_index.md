---
title: Feature.SetValues
second_title: Aspose.GIS für .NET-API-Referenz
description: Feature methode. Legt neue Werte für alle Attribute fest. Ziehen Sie auch die Verwendung in BetrachtCopyValues Methode zum Optimieren von Einstellungswerten in einem Aufruf.
type: docs
weight: 120
url: /de/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Legt neue Werte für alle Attribute fest. Ziehen Sie auch die Verwendung in Betracht[`CopyValues`](../copyvalues/) Methode zum Optimieren von Einstellungswerten in einem Aufruf.

```csharp
public int SetValues(object[] values)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| values | Object[] | Das Array der neuen Werte. |

### Rückgabewert

Die Anzahl der festgelegten Attributwerte.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument kann nicht sein`null`. |
| ArgumentException | Das Attribut mit diesem Namen ist in dieser Ebene nicht vorhanden. |
| InvalidOperationException | Das Attribut ist nicht gesperrt. |
| InvalidCastException | Der Typ des Werts wird nicht implementiertIConvertible. |
| FormatException | Die Konvertierung ist fehlgeschlagen, weil der Wert das falsche Format hat. |
| OverflowException | Konvertierung wegen Überlauf fehlgeschlagen. |

### Bemerkungen

Diese Methode konvertiert jeden Wert automatisch in den Typ des Attributs.  Die Länge des Werte-Arrays muss nicht mit der Anzahl der Attribute im Feature übereinstimmen. Wenn die Array-Länge größer als die Anzahl der Attribute ist, werden alle Array-Werte in die Attribute kopiert; wenn sie kleiner ist, es wird nur die Array-Länge Anzahl der Werte in die Attribute kopiert, beginnend beim Attributwert mit Ordinalzahl 0.

### Siehe auch

* class [Feature](../)
* namensraum [Aspose.Gis](../../feature/)
* Montage [Aspose.GIS](../../../)


