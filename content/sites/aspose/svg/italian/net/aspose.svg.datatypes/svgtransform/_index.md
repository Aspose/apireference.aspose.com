---
title: SVGTransform
second_title: Riferimento API Aspose.SVG per .NET
description: SVGTransform è linterfaccia per una delle trasformazioni dei componenti allinterno di un SVGTransformList quindi un oggetto SVGTransform corrisponde a un singolo componente ad esempio scale o matrix allinterno di una specifica di attributo transform.
type: docs
weight: 320
url: /it/net/aspose.svg.datatypes/svgtransform/
---
## SVGTransform class

SVGTransform è l'interfaccia per una delle trasformazioni dei componenti all'interno di un SVGTransformList; quindi, un oggetto SVGTransform corrisponde a un singolo componente (ad esempio, 'scale(…)' o 'matrix(…)') all'interno di una specifica di attributo 'transform'.

```csharp
public class SVGTransform : SVGValueType
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Angle](../../aspose.svg.datatypes/svgtransform/angle) { get; } | Un attributo pratico per SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX e SVG_TRANSFORM_SKEWY. Mantiene l'angolo specificato. Per SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE e SVG_TRANSFORM_SCALE, l'angolo sarà zero. |
| [Matrix](../../aspose.svg.datatypes/svgtransform/matrix) { get; } | La matrice che rappresenta questa trasformazione. L'oggetto matrice è attivo, il che significa che qualsiasi modifica apportata all'oggetto SVGTransform si riflette immediatamente nell'oggetto matrice e viceversa. Nel caso in cui l'oggetto matrice venga modificato direttamente (ovvero, senza utilizzare i metodi sull'interfaccia SVGTransform stessa), il tipo di SVGTransform cambia in SVG_TRANSFORM_MATRIX. Per SVG_TRANSFORM_MATRIX, la matrice contiene a, b, c, d, e, f valori forniti dall'utente. Per SVG_TRANSFORM_TRANSLATE, e e f rappresentano gli importi di conversione(a= 1, b= 0, c= 0 e d = 1). Per SVG_TRANSFORM_SCALE, a e d rappresentano gli importi della scala(b= 0 , c= 0, e= 0 e f = 0). Per SVG_TRANSFORM_SKEWX e SVG_TRANSFORM_SKEWY, a, b, c e d rappresentano la matrice che risulterà nell'inclinazione data (e= 0 e f = 0). Per SVG_TRANSFORM_ROTATE , a, b, c, d, e e f insieme rappresentano la matrice che risulterà nella rotazione data. Quando la rotazione è attorno al punto centrale (0, 0), e e f saranno zero. |
| [Type](../../aspose.svg.datatypes/svgtransform/type) { get; } | Il tipo del valore come specificato da una delle costanti SVG_TRANSFORM_* definite su questa interfaccia. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose)() | Rilascia risorse non gestite e, facoltativamente, gestite. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [SetMatrix](../../aspose.svg.datatypes/svgtransform/setmatrix)(SVGMatrix) | Imposta il tipo di trasformazione su SVG_TRANSFORM_MATRIX, con la matrice dei parametri che definisce la nuova trasformazione. I valori della matrice del parametro vengono copiati, il parametro della matrice non sostituisce SVGTransform::matrix. |
| [SetRotate](../../aspose.svg.datatypes/svgtransform/setrotate)(float, float, float) | Imposta il tipo di trasformazione su SVG_TRANSFORM_ROTATE, con il parametro angolo che definisce l'angolo di rotazione e i parametri cx e cy che definiscono il centro di rotazione opzionale. |
| [SetScale](../../aspose.svg.datatypes/svgtransform/setscale)(float, float) | Imposta il tipo di trasformazione su SVG_TRANSFORM_SCALE, con i parametri sx e sy che definiscono gli importi della scala. |
| [SetSkewX](../../aspose.svg.datatypes/svgtransform/setskewx)(float) | Imposta il tipo di trasformazione su SVG_TRANSFORM_SKEWX, con l'angolo del parametro che definisce la quantità di skew. |
| [SetSkewY](../../aspose.svg.datatypes/svgtransform/setskewy)(float) | Imposta il tipo di trasformazione su SVG_TRANSFORM_SKEWY, con l'angolo del parametro che definisce la quantità di skew. |
| [SetTranslate](../../aspose.svg.datatypes/svgtransform/settranslate)(float, float) | Imposta il tipo di trasformazione su SVG_TRANSFORM_TRANSLATE, con i parametri tx e ty che definiscono gli importi di conversione. |
| override [ToString](../../aspose.svg.datatypes/svgtransform/tostring)() | Restituisce aString che rappresenta questa istanza. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [SVG_TRANSFORM_MATRIX](../../aspose.svg.datatypes/svgtransform/svg_transform_matrix) | Una trasformazione 'matrice(…)'. |
| const [SVG_TRANSFORM_ROTATE](../../aspose.svg.datatypes/svgtransform/svg_transform_rotate) | Una trasformazione 'ruota(…)'. |
| const [SVG_TRANSFORM_SCALE](../../aspose.svg.datatypes/svgtransform/svg_transform_scale) | Una trasformazione 'scala(...)'. |
| const [SVG_TRANSFORM_SKEWX](../../aspose.svg.datatypes/svgtransform/svg_transform_skewx) | Una trasformazione 'skewX(…)'. |
| const [SVG_TRANSFORM_SKEWY](../../aspose.svg.datatypes/svgtransform/svg_transform_skewy) | Una trasformazione 'skewY(…)'. |
| const [SVG_TRANSFORM_TRANSLATE](../../aspose.svg.datatypes/svgtransform/svg_transform_translate) | Una trasformazione 'translate(…)'. |
| const [SVG_TRANSFORM_UNKNOWN](../../aspose.svg.datatypes/svgtransform/svg_transform_unknown) | Il tipo di unità non è uno dei tipi predefiniti. Non è valido tentare di definire un nuovo valore di questo tipo o tentare di cambiare un valore esistente in questo tipo. |

### Guarda anche

* class [SVGValueType](../svgvaluetype)
* spazio dei nomi [Aspose.Svg.DataTypes](../../aspose.svg.datatypes)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
