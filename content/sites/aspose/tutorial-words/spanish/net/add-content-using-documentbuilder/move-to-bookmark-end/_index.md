---
title: Mover al final del marcador
linktitle: Mover al final del marcador
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a usar Aspose.Words para .NET para moverse al final de un marcador en documentos de Word con esta guía paso a paso.
type: docs
weight: 10
url: /es/net/add-content-using-documentbuilder/move-to-bookmark-end/
---

En este ejemplo, exploraremos la función Mover al final del marcador de Aspose.Words para .NET. Aspose.Words es una poderosa biblioteca de manipulación de documentos que permite a los desarrolladores crear, modificar y convertir documentos de Word mediante programación. La función Mover al final del marcador nos permite navegar hasta el final de un marcador específico dentro de un documento y agregar contenido después.

## Configuración del entorno

Antes de profundizar en los detalles de implementación, asegurémonos de tener el entorno necesario configurado para trabajar con Aspose.Words para .NET. Asegúrese de tener lo siguiente:

- Una instalación funcional de Aspose.Words para la biblioteca .NET
- Conocimientos básicos del lenguaje de programación C#
- Acceso a un entorno de desarrollo .NET

## Descripción de la función Mover al final del marcador de Aspose.Words para .NET

La función Mover al final del marcador le permite navegar hasta el final de un marcador dentro de un documento de Word utilizando Aspose.Words para .NET. Esta función es útil cuando desea agregar contenido después de un marcador específico en su documento mediante programación.

## Explicando el código fuente paso a paso

Desglosemos el código fuente proporcionado paso a paso para comprender cómo usar la función Mover al final del marcador en Aspose.Words para .NET.

## Paso 1: Inicializar el documento y el generador de documentos

 Primero, necesitamos inicializar el`Document` y`DocumentBuilder` objetos:

```csharp
Document doc = new Document(MyDir + "Bookmarks.docx");
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Paso 2: Ir al final del marcador

 Para ir al final de un marcador, utilice el`MoveToBookmark` metodo de la`DocumentBuilder` clase:

```csharp
builder.MoveToBookmark("MyBookmark1", false, true);
```

 El`MoveToBookmark` El método toma tres parámetros:
- Nombre del marcador: proporcione el nombre del marcador al que desea pasar.
-  IsBookmarkStart: establecer en`false` para ir al final del marcador.
-  IsBookmarkEnd: establecer en`true` para indicar que desea pasar al final del marcador.

## Paso 3: agregar contenido al final del marcador

Una vez que se haya movido al final del marcador, puede agregar contenido utilizando los diversos métodos proporcionados por el`DocumentBuilder` clase. En este ejemplo, usamos el`Writeln` método para escribir una línea de texto:

```csharp
builder.Writeln("This is a bookmark.");
```

 El`Writeln` agrega el texto especificado como un nuevo párrafo en la posición actual del`DocumentBuilder`.

### Código fuente de ejemplo para Move To Bookmark End usando Aspose.Words para .NET

```csharp

	Document doc = new Document(MyDir + "Bookmarks.docx");
	DocumentBuilder builder = new DocumentBuilder(doc);

	builder.MoveToBookmark("MyBookmark1", false, true);
	builder.Writeln("This is a bookmark.");
	
```

## Conclusión

exploramos la función Mover al final del marcador de Aspose.Words para .NET. Aprendimos cómo navegar hasta el final de un marcador y agregar contenido mediante programación usando el código fuente proporcionado. Esta característica brinda flexibilidad en la manipulación de documentos de Word utilizando Aspose.Words para .NET.

