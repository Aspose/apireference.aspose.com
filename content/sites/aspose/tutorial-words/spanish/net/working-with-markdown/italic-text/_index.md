---
title: Texto en cursiva
linktitle: Texto en cursiva
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a poner texto en cursiva con Aspose.Words para la guía paso a paso de .NET.
type: docs
weight: 10
url: /es/net/working-with-markdown/italic-text/
---

En este ejemplo, lo guiaremos a través de cómo usar la función de texto en cursiva con Aspose.Words para .NET. El texto en cursiva se utiliza para enfatizar ciertas partes de un documento.

## Paso 1: usar un generador de documentos

Primero, usaremos un generador de documentos para agregar contenido a nuestro documento.

```csharp
DocumentBuilder builder = new DocumentBuilder();
```

## Paso 2: Texto en cursiva

 Podemos poner el texto en cursiva configurando la fuente`Italic` propiedad a`true`.

```csharp
builder.Font.Italic = true;
builder.Writeln("This text will be in italics");
```

### Ejemplo de código fuente para texto en cursiva con Aspose.Words para .NET


```csharp
	// Use un generador de documentos para agregar contenido al documento.
	DocumentBuilder builder = new DocumentBuilder();

	// Pon el texto en cursiva.
	builder.Font.Italic = true;
	builder.Writeln("This text will be Italic");
            
```

¡Felicidades! Ahora ha aprendido a usar la función de texto en cursiva con Aspose.Words para .NET.

