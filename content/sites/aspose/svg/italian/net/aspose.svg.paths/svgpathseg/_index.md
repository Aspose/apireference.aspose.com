---
title: SVGPathSeg
second_title: Riferimento API Aspose.SVG per .NET
description: Linterfaccia SVGPathSeg è uninterfaccia di base che corrisponde a un singolo comando allinterno di una specifica di dati di percorso.
type: docs
weight: 2460
url: /it/net/aspose.svg.paths/svgpathseg/
---
## SVGPathSeg class

L'interfaccia SVGPathSeg è un'interfaccia di base che corrisponde a un singolo comando all'interno di una specifica di dati di percorso.

```csharp
public abstract class SVGPathSeg : SVGValueType
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [PathSegType](../../aspose.svg.paths/svgpathseg/pathsegtype) { get; } | Il tipo del segmento di percorso come specificato da una delle costanti definite su questa interfaccia. |
| [PathSegTypeAsLetter](../../aspose.svg.paths/svgpathseg/pathsegtypeasletter) { get; } | Il tipo del segmento di percorso, specificato dal nome del comando di un carattere corrispondente. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose)() | Rilascia risorse non gestite e, facoltativamente, gestite. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [PATHSEG_ARC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_arc_abs) | Corrisponde a un comando di dati di percorso "absolute arcto" (A). |
| const [PATHSEG_ARC_REL](../../aspose.svg.paths/svgpathseg/pathseg_arc_rel) | Corrisponde a un comando di dati di percorso "Arcto relativo" (a). |
| const [PATHSEG_CLOSEPATH](../../aspose.svg.paths/svgpathseg/pathseg_closepath) | Corrisponde a un comando di dati di percorso "closepath" (z). |
| const [PATHSEG_CURVETO_CUBIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_abs) | Corrisponde a un comando di dati percorso "absolute cubic Bézier curveto" (C). |
| const [PATHSEG_CURVETO_CUBIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_rel) | Corrisponde a un comando di dati di percorso "relativo cubico Bézier curveto" (c). |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_abs) | Corrisponde a un comando di dati di percorso "absolute smooth cubic curveto" (S). |
| const [PATHSEG_CURVETO_CUBIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_cubic_smooth_rel) | Corrisponde a un comando di dati di percorso "curva cubica liscia relativa" (s). |
| const [PATHSEG_CURVETO_QUADRATIC_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_abs) | Corrisponde a un comando di dati di percorso "absolute quadratic Bézier curveto" (Q). |
| const [PATHSEG_CURVETO_QUADRATIC_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_rel) | Corrisponde a un comando di dati di percorso "relativo quadratico Bézier curveto" (q). |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_abs) | Corrisponde a un comando di dati di percorso "Curva quadratica arrotondata assoluta" (T). |
| const [PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL](../../aspose.svg.paths/svgpathseg/pathseg_curveto_quadratic_smooth_rel) | Corrisponde a un comando di dati di percorso "curva quadratica liscia relativa" (t). |
| const [PATHSEG_LINETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_abs) | Corrisponde a un comando di dati percorso "Absolute lineto" (L). |
| const [PATHSEG_LINETO_HORIZONTAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_abs) | Corrisponde a un comando di dati percorso "linea orizzontale assoluta" (H). |
| const [PATHSEG_LINETO_HORIZONTAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_horizontal_rel) | Corrisponde a un comando di dati percorso "linea orizzontale relativa" (h). |
| const [PATHSEG_LINETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_rel) | Corrisponde a un comando di dati di percorso "relativo lineto" (l). |
| const [PATHSEG_LINETO_VERTICAL_ABS](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_abs) | Corrisponde a un comando di dati percorso "linea verticale assoluta" (V). |
| const [PATHSEG_LINETO_VERTICAL_REL](../../aspose.svg.paths/svgpathseg/pathseg_lineto_vertical_rel) | Corrisponde a un comando di dati del percorso "relativo vertical lineto" (v). |
| const [PATHSEG_MOVETO_ABS](../../aspose.svg.paths/svgpathseg/pathseg_moveto_abs) | Corrisponde a un comando di dati percorso "Absolute moveto" (M). |
| const [PATHSEG_MOVETO_REL](../../aspose.svg.paths/svgpathseg/pathseg_moveto_rel) | Corrisponde a un comando di dati di percorso "movimento relativo" (m). |
| const [PATHSEG_UNKNOWN](../../aspose.svg.paths/svgpathseg/pathseg_unknown) | Il tipo di unità non è uno dei tipi predefiniti. Non è valido tentare di definire un nuovo valore di questo tipo o tentare di cambiare un valore esistente in questo tipo. |

### Guarda anche

* class [SVGValueType](../../aspose.svg.datatypes/svgvaluetype)
* spazio dei nomi [Aspose.Svg.Paths](../../aspose.svg.paths)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
