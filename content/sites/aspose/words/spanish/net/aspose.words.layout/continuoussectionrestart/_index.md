---
title: ContinuousSectionRestart Enum
linktitle: ContinuousSectionRestart
articleTitle: ContinuousSectionRestart
second_title: Aspose.Words para .NET
description: Aspose.Words.Layout.ContinuousSectionRestart enumeración. Representa diferentes comportamientos al calcular números de página en una sección continua que reinicia la numeración de páginas en C#.
type: docs
weight: 3300
url: /es/net/aspose.words.layout/continuoussectionrestart/
---
## ContinuousSectionRestart enumeration

Representa diferentes comportamientos al calcular números de página en una sección continua que reinicia la numeración de páginas.

```csharp
public enum ContinuousSectionRestart
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Always | `0` | La numeración de páginas siempre se reinicia independientemente del flujo de contenido. |
| FromNewPageOnly | `1` | La numeración de páginas se reinicia solo si no hay otro contenido antes de la sección en la página donde comienza la sección. |

## Ejemplos

Muestra cómo controlar la numeración de páginas en una sección continua.

```csharp
Document doc = new Document(MyDir + "Continuous section page numbering.docx");

// De forma predeterminada, el comportamiento de Aspose.Words coincide con Microsoft Word 2019.
// Si necesita un comportamiento antiguo de Aspose.Words, repetitivo de Microsoft Word 2016, use 'ContinuousSectionRestart.FromNewPageOnly'.
// La numeración de páginas se reinicia solo si no hay otro contenido antes de la sección en la página donde comienza la sección,
// debido a eso la numeración se restablecerá a 2 desde la segunda página.
doc.LayoutOptions.ContinuousSectionPageNumberingRestart = ContinuousSectionRestart.FromNewPageOnly;
doc.UpdatePageLayout();

doc.Save(ArtifactsDir + "Layout.RestartPageNumberingInContinuousSection.pdf");
```

### Ver también

* espacio de nombres [Aspose.Words.Layout](../../aspose.words.layout/)
* asamblea [Aspose.Words](../../)
