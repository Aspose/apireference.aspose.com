---
title: TeXFragment
second_title: Referencia de API de Aspose.PDF para .NET
description: Representa el fragmento de TeX.
type: docs
weight: 6560
url: /es/net/aspose.pdf/texfragment/
---
## TeXFragment class

Representa el fragmento de TeX.

```csharp
public class TeXFragment : FormattedFragment
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [TeXFragment](texfragment#constructor)(string) | Inicializa una nueva instancia de la clase HtmlFragment. |
| [TeXFragment](texfragment#constructor_1)(string, bool) | Inicializa una nueva instancia de la clase HtmlFragment. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [HorizontalAlignment](../../aspose.pdf/baseparagraph/horizontalalignment) { get; set; } | Obtiene o establece una alineación horizontal del párrafo |
| virtual [Hyperlink](../../aspose.pdf/baseparagraph/hyperlink) { get; set; } | Obtiene o establece el hipervínculo del fragmento (para el generador de pdf). |
| [IsFirstParagraphInColumn](../../aspose.pdf/baseparagraph/isfirstparagraphincolumn) { get; set; } | Obtiene o establece un valor bool que indica si este párrafo estará en la siguiente columna. El valor predeterminado es falso. (para la generación de PDF) |
| [IsInLineParagraph](../../aspose.pdf/baseparagraph/isinlineparagraph) { get; set; } | Obtiene o establece que un párrafo está en línea. El valor predeterminado es falso. (para la generación de PDF) |
| [IsInNewPage](../../aspose.pdf/baseparagraph/isinnewpage) { get; set; } | Obtiene o establece un valor booleano que obliga a generar este párrafo en una nueva página. El valor predeterminado es falso. (para la generación de PDF) |
| [IsKeptWithNext](../../aspose.pdf/baseparagraph/iskeptwithnext) { get; set; } | Obtiene o establece un valor booleano que indica si el párrafo actual permanece en la misma página junto con el párrafo siguiente. El valor predeterminado es falso. (para la generación de PDF) |
| [Margin](../../aspose.pdf/baseparagraph/margin) { get; set; } | Obtiene o establece un margen exterior para el párrafo (para la generación de pdf) |
| [TeXLoadOptionsOfInstance](../../aspose.pdf/texfragment/texloadoptionsofinstance) { get; set; } | Obtiene o establece TeXLoadOptions que se usarán para cargar (y renderizar) LaTeX en esta instancia de clase. Úselo cuando sea necesario use una configuración específica para importar LaTeX para esta o aquella instancia (por ejemplo, cuando esta o aquella instancia debería use BasePath específico para LaTeX importado o debe usar un cargador específico de recursos externos) Si el parámetro es predeterminado (nulo), entonces se usarán las opciones estándar de carga de LaTeX. |
| virtual [VerticalAlignment](../../aspose.pdf/baseparagraph/verticalalignment) { get; set; } | Obtiene o establece una alineación vertical del párrafo |
| [ZIndex](../../aspose.pdf/baseparagraph/zindex) { get; set; } | Obtiene o establece un valor int que indica el orden Z del gráfico. Un gráfico con ZIndex más grande se colocará sobre el gráfico con ZIndex más pequeño. ZIndex puede ser negativo. El gráfico con ZIndex negativo se colocará detrás del texto en la página. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Clone](../../aspose.pdf/texfragment/clone)() | Clona fragmento. |

### Ver también

* class [FormattedFragment](../formattedfragment)
* espacio de nombres [Aspose.Pdf](../../aspose.pdf)
* asamblea [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
