---
title: HTMLTableRowElement.InsertCell
second_title: Aspose.HTML für .NET-API-Referenz
description: HTMLTableRowElement methode. Fügen Sie ein Leerzeichen einTD Zelle in diese Zeile. Wenn Index 1 oder gleich der Anzahl der Zellen ist wird die neue Zelle angehängt.
type: docs
weight: 100
url: /de/net/aspose.html/htmltablerowelement/insertcell/
---
## HTMLTableRowElement.InsertCell method

Fügen Sie ein Leerzeichen ein`TD` Zelle in diese Zeile. Wenn `Index` -1 oder gleich der Anzahl der Zellen ist, wird die neue Zelle angehängt.

```csharp
public HTMLElement InsertCell(int index)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| index | Int32 | Die Stelle, an der die Zelle eingefügt werden soll, beginnend bei 0. |

### Rückgabewert

Die neu erstellte Zelle.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | INDEX_SIZE_ERR: Wird ausgelöst, wenn die angegebene`Index` größer als die Anzahl der Zellen ist oder wenn der Index eine andere negative Zahl als -1 ist. @Version DOM Level 2 |

### Siehe auch

* class [HTMLElement](../../htmlelement/)
* class [HTMLTableRowElement](../)
* namensraum [Aspose.Html](../../htmltablerowelement/)
* Montage [Aspose.HTML](../../../)


