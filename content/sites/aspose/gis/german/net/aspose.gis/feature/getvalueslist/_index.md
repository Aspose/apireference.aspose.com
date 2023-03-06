---
title: Feature.GetValuesList
second_title: Aspose.GIS für .NET-API-Referenz
description: Feature methode. Ruft die Werte einer Attributsequenz als Liste ab.
type: docs
weight: 70
url: /de/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

Ruft die Werte einer Attributsequenz als Liste ab.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| Parameter | Beschreibung |
| --- | --- |
| T | Gewünschter Typ für die Werte. |
| attributeName | Name des Attributs. |
| separator | Eine Zeichenfolge, die verwendet wird, um den Attributnamen und den Indexwert der Sequenz zu trennen. |

### Rückgabewert

Liste der Werte der Attribute, die nach Sequenzindexwert unterschiedlich benannt sind.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Der Attributname ist`null`. |
| ArgumentException | Das Attribut mit diesem Namen ist in dieser Ebene nicht vorhanden. |
| InvalidOperationException | Das Attribut ist nicht gesperrt. |
| InvalidOperationException | Der Wert dieses Attributs ist für diese Funktion nicht festgelegt. |
| InvalidCastException | Der angeforderte Typ wird nicht implementiertIConvertible. |
| InvalidCastException | Wert des Attributs ist`null`, aber der angeforderte Typ ist ein Werttyp. |
| FormatException | Die Konvertierung ist fehlgeschlagen, weil der Wert das falsche Format hat. |
| OverflowException | Konvertierung wegen Überlauf fehlgeschlagen. |

### Bemerkungen

Dies verwendet[`GetValue`](../getvalue/) Einzelwert zu bekommen. Diese Methode konvertiert den Wert also automatisch in den Typ, der im generischen Typparameter angefordert wird.  Wenn das Attribut mit dem Index 0 nicht gefunden wird, wird es generiertArgumentException .

### Siehe auch

* class [Feature](../)
* namensraum [Aspose.Gis](../../feature/)
* Montage [Aspose.GIS](../../../)


