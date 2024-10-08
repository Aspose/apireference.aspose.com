---
title: Copiar encabezados y pies de página de la sección anterior
linktitle: Copiar encabezados y pies de página de la sección anterior
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a copiar encabezados y pies de página de la sección anterior en documentos de Word usando Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/working-with-headers-and-footers/copy-headers-footers-from-previous-section/
---

En este tutorial paso a paso, lo guiaremos sobre cómo copiar encabezados y pies de página de la sección anterior en un documento de Word usando Aspose.Words para .NET. Explicaremos el código fuente de C# provisto y le mostraremos cómo implementarlo en sus propios proyectos.

Para comenzar, asegúrese de tener Aspose.Words para .NET instalado y configurado en su entorno de desarrollo. Si no lo ha hecho, descargue e instale la biblioteca desde el sitio web oficial.

## Paso 1: Acceso a la sección anterior

 En primer lugar, recupere la sección anterior accediendo a la`PreviousSibling` propiedad de la sección actual:

```csharp
Section previousSection = (Section)section.PreviousSibling;
```

## Paso 2: Comprobación de la sección anterior

continuación, compruebe si existe una sección anterior. Si no hay apartado anterior, simplemente devolvemos:

```csharp
if (previousSection == null)
    return;
```

## Paso 3: borrar y copiar encabezados y pies de página

Para copiar los encabezados y pies de página de la sección anterior a la sección actual, borramos los encabezados y pies de página existentes en la sección actual y luego iteramos a través de los encabezados y pies de página de la sección anterior para agregar copias clonadas a la sección actual:

```csharp
section.HeadersFooters.Clear();

foreach (HeaderFooter headerFooter in previousSection.HeadersFooters)
    section.HeadersFooters.Add(headerFooter.Clone(true));
```

## Paso 4: Guardar el documento

Finalmente, guarde el documento modificado:

```csharp
doc.Save("OutputDocument.docx");
```

¡Eso es todo! Ha copiado con éxito encabezados y pies de página de la sección anterior a la sección actual en un documento de Word usando Aspose.Words para .NET.

### Ejemplo de código fuente para copiar encabezados y pies de página de la sección anterior usando Aspose.Words para .NET

```csharp
Section previousSection = (Section)section.PreviousSibling;

if (previousSection == null)
    return;

section.HeadersFooters.Clear();

foreach (HeaderFooter headerFooter in previousSection.HeadersFooters)
    section.HeadersFooters.Add(headerFooter.Clone(true));

doc.Save("OutputDocument.docx");
```

Siéntase libre de usar este código en sus propios proyectos y modifíquelo de acuerdo con sus requisitos específicos.