---
title: CalculationMode
second_title: Riferimento alle API di Aspose.Cells per .NET
description: Ottiene o imposta la modalità per il calcolo della cartella di lavoro in ms excel.
type: docs
weight: 40
url: /it/net/aspose.cells/formulasettings/calculationmode/
---
## FormulaSettings.CalculationMode property

Ottiene o imposta la modalità per il calcolo della cartella di lavoro in ms excel.

```csharp
public CalcModeType CalculationMode { get; set; }
```

### Osservazioni

Questa proprietà serve solo per salvare le impostazioni nel file di foglio di calcolo risultante in modo che altre applicazioni (come ms excel) possano agire di conseguenza durante il caricamento e la manipolazione del file risultante. Per considerazioni sulle prestazioni per la maggior parte delle applicazioni dell'utente, non calcoliamo alcuna formula in la cartella di lavoro automaticamente, indipendentemente dalla modalità impostata per questa proprietà. Se l'utente ha bisogno di calcolare le formule, chiama sempre metodi su oggetti diversi in base ai requisiti: [`CalculateFormula`](../../workbook/calculateformula) ,[`CalculateFormula`](../../worksheet/calculateformula) , [`Calculate`](../../cell/calculate) , ...ecc.

### Guarda anche

* enum [CalcModeType](../../calcmodetype)
* class [FormulaSettings](../../formulasettings)
* spazio dei nomi [Aspose.Cells](../../formulasettings)
* assemblea [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
