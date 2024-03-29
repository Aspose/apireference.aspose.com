---
title: SetDynamicArrayFormula
second_title: Aspose.Cells för .NET API-referens
description: Ställer in dynamisk matrisformel och får formeln att spilla in i närliggande celler om möjligt.
type: docs
weight: 600
url: /sv/net/aspose.cells/cell/setdynamicarrayformula/
---
## SetDynamicArrayFormula(string, FormulaParseOptions, bool) {#setdynamicarrayformula}

Ställer in dynamisk matrisformel och får formeln att spilla in i närliggande celler om möjligt.

```csharp
public CellArea SetDynamicArrayFormula(string arrayFormula, FormulaParseOptions options, 
    bool calculateValue)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arrayFormula | String | formeluttrycket |
| options | FormulaParseOptions | alternativ för att analysera formel. "Parse"-alternativet kommer att ignoreras och formeln kommer alltid att tolkas omedelbart |
| calculateValue | Boolean | om beräkna denna dynamiska matrisformel för de cellerna i det utspillda området. |

### Returvärde

intervallet som formeln ska spilla in i.

### Se även

* struct [CellArea](../../cellarea)
* class [FormulaParseOptions](../../formulaparseoptions)
* class [Cell](../../cell)
* namnutrymme [Aspose.Cells](../../cell)
* hopsättning [Aspose.Cells](../../../)

---

## SetDynamicArrayFormula(string, FormulaParseOptions, object[][], bool, bool) {#setdynamicarrayformula_1}

Ställer in dynamisk matrisformel och får formeln att spilla in i närliggande celler om möjligt.

```csharp
public CellArea SetDynamicArrayFormula(string arrayFormula, FormulaParseOptions options, 
    object[][] values, bool calculateRange, bool calculateValue)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arrayFormula | String | formeluttrycket |
| options | FormulaParseOptions | alternativ för att analysera formel. "Parse"-alternativet kommer att ignoreras och formeln kommer alltid att tolkas omedelbart |
| values | Object[][] | värden för dessa celler med given dynamisk matrisformel |
| calculateRange | Boolean | Om du beräknar det utspillda området för denna dynamiska matrisformel. Om parametern "values" inte är null och denna flagga är falsk, kommer det utspillda områdets höjd att vara värden. Längd och bredd kommer att vara värden[0].Längd. |
| calculateValue | Boolean | om beräkna denna dynamiska matrisformel för de cellerna i det utspillda området när "values" är null eller motsvarande objekt i "values" för en cell är null. |

### Returvärde

intervallet som formeln ska spilla in i.

### Se även

* struct [CellArea](../../cellarea)
* class [FormulaParseOptions](../../formulaparseoptions)
* class [Cell](../../cell)
* namnutrymme [Aspose.Cells](../../cell)
* hopsättning [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
