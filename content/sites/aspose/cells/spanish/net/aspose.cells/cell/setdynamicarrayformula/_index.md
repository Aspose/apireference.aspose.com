---
title: SetDynamicArrayFormula
second_title: Referencia de API de Aspose.Cells para .NET
description: Establece la fórmula de matriz dinámica y hace que la fórmula se extienda a las celdas vecinas si es posible.
type: docs
weight: 600
url: /es/net/aspose.cells/cell/setdynamicarrayformula/
---
## SetDynamicArrayFormula(string, FormulaParseOptions, bool) {#setdynamicarrayformula}

Establece la fórmula de matriz dinámica y hace que la fórmula se extienda a las celdas vecinas si es posible.

```csharp
public CellArea SetDynamicArrayFormula(string arrayFormula, FormulaParseOptions options, 
    bool calculateValue)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| arrayFormula | String | la expresión de la fórmula |
| options | FormulaParseOptions | opciones para analizar fórmula. La opción "Analizar" se ignorará y la fórmula siempre se analizará inmediatamente |
| calculateValue | Boolean | si calcula esta fórmula de matriz dinámica para esas celdas en el rango derramado. |

### Valor_devuelto

el rango en el que debe derramarse la fórmula.

### Ver también

* struct [CellArea](../../cellarea)
* class [FormulaParseOptions](../../formulaparseoptions)
* class [Cell](../../cell)
* espacio de nombres [Aspose.Cells](../../cell)
* asamblea [Aspose.Cells](../../../)

---

## SetDynamicArrayFormula(string, FormulaParseOptions, object[][], bool, bool) {#setdynamicarrayformula_1}

Establece la fórmula de matriz dinámica y hace que la fórmula se extienda a las celdas vecinas si es posible.

```csharp
public CellArea SetDynamicArrayFormula(string arrayFormula, FormulaParseOptions options, 
    object[][] values, bool calculateRange, bool calculateValue)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| arrayFormula | String | la expresión de la fórmula |
| options | FormulaParseOptions | opciones para analizar fórmula. La opción "Analizar" se ignorará y la fórmula siempre se analizará inmediatamente |
| values | Object[][] | valores para esas celdas con fórmula de matriz dinámica dada |
| calculateRange | Boolean | Si calcula el rango derramado para esta fórmula de matriz dinámica. Si el parámetro "valores" no es nulo y esta marca es falsa, entonces la altura del rango derramado será valores. La longitud y el ancho serán valores[0].Longitud. |
| calculateValue | Boolean | si calcula esta fórmula de matriz dinámica para aquellas celdas en el rango derramado cuando "valores" es nulo o el elemento correspondiente en "valores" para una celda es nulo. |

### Valor_devuelto

el rango en el que debe derramarse la fórmula.

### Ver también

* struct [CellArea](../../cellarea)
* class [FormulaParseOptions](../../formulaparseoptions)
* class [Cell](../../cell)
* espacio de nombres [Aspose.Cells](../../cell)
* asamblea [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
