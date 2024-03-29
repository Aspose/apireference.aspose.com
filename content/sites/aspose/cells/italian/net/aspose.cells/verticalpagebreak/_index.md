---
title: VerticalPageBreak
second_title: Riferimento alle API di Aspose.Cells per .NET
description: Incapsula loggetto che rappresenta uninterruzione di pagina verticale.
type: docs
weight: 6310
url: /it/net/aspose.cells/verticalpagebreak/
---
## VerticalPageBreak class

Incapsula l'oggetto che rappresenta un'interruzione di pagina verticale.

```csharp
public class VerticalPageBreak
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Column](../../aspose.cells/verticalpagebreak/column) { get; } | Ottiene l'indice di colonna dell'interruzione di pagina verticale. |
| [EndRow](../../aspose.cells/verticalpagebreak/endrow) { get; } | Ottiene l'indice di fine riga dell'interruzione di pagina verticale. |
| [StartRow](../../aspose.cells/verticalpagebreak/startrow) { get; } | Ottiene l'indice della riga iniziale dell'interruzione di pagina verticale. |

### Esempi

```csharp
[C#]
Workbook excel = new Workbook();
//Aggiungi un'interruzione di pagina in G5
excel.Worksheets[0].HorizontalPageBreaks.Add("G5");
excel.Worksheets[0].VerticalPageBreaks.Add("G5");

[VB]
Dim excel as Workbook = new Workbook()
'Aggiungi un'interruzione di pagina a G5
excel.Worksheets(0).HorizontalPageBreaks.Add("G5")
excel.Worksheets(0).VerticalPageBreaks.Add("G5")
```

### Guarda anche

* spazio dei nomi [Aspose.Cells](../../aspose.cells)
* assemblea [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
