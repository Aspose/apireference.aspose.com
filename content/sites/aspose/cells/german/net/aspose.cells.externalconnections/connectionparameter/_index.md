---
title: ConnectionParameter
second_title: Aspose.Cells für .NET-API-Referenz
description: Gibt Eigenschaften zu allen Parametern an die mit externen Datenverbindungen verwendet werden Parameter gelten für ODBC- und Webabfragen.
type: docs
weight: 3240
url: /de/net/aspose.cells.externalconnections/connectionparameter/
---
## ConnectionParameter class

Gibt Eigenschaften zu allen Parametern an, die mit externen Datenverbindungen verwendet werden Parameter gelten für ODBC- und Webabfragen.

```csharp
public class ConnectionParameter
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CellReference](../../aspose.cells.externalconnections/connectionparameter/cellreference) { get; set; } | Zellreferenz, die den Wert der Zelle angibt, der für den Abfrageparameter verwendet werden soll. Wird nur verwendet, wenn parameterType cell ist. |
| [Name](../../aspose.cells.externalconnections/connectionparameter/name) { get; set; } | Der Name des Parameters. |
| [Prompt](../../aspose.cells.externalconnections/connectionparameter/prompt) { get; set; } | Aufforderungszeichenfolge für den Parameter. Wird dem Tabellenbenutzer zusammen mit der Eingabe-UI präsentiert, um den Parameterwert zu erfassen, bevor die externen Daten aktualisiert werden. Wird nur verwendet, wenn parameterType = prompt. |
| [RefreshOnChange](../../aspose.cells.externalconnections/connectionparameter/refreshonchange) { get; set; } | Flag, das angibt, ob die Abfrage automatisch aktualisiert werden soll, wenn sich der Inhalt einer -Zelle ändert, die den Parameterwert bereitstellt. Wenn wahr, werden externe Daten bei jeder Änderung mit dem neuen Parameterwert aktualisiert . Wenn falsch, werden externe Daten nur aktualisiert, wenn sie vom Benutzer angefordert werden, oder ein anderes Ereignis löst eine Aktualisierung aus (z. B. Arbeitsmappe geöffnet). |
| [SqlType](../../aspose.cells.externalconnections/connectionparameter/sqltype) { get; set; } | SQL-Datentyp des Parameters. Nur gültig für ODBC-Quellen. |
| [Type](../../aspose.cells.externalconnections/connectionparameter/type) { get; set; } | Art des verwendeten Parameters. Wenn ParameterType=Wert, dann wird der Wert aus Boolean, Double, Integer, oder String verwendet. In diesem Fall wird erwartet, dass nur einer von {boolean, double, integer oder string} angegeben wird. |
| [Value](../../aspose.cells.externalconnections/connectionparameter/value) { get; set; } | Nicht ganzzahliger numerischer Wert, ganzzahliger Wert, Zeichenfolgenwert oder boolescher Wert zur Verwendung als Abfrageparameter. Wird nur verwendet, wenn parameterType value ist. |

### Siehe auch

* namensraum [Aspose.Cells.ExternalConnections](../../aspose.cells.externalconnections)
* Montage [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
