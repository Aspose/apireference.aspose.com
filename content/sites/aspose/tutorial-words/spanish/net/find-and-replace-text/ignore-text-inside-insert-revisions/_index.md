---
title: Ignorar texto dentro de insertar revisiones
linktitle: Ignorar texto dentro de insertar revisiones
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a usar la característica "Ignorar texto dentro de las revisiones de inserción" de Aspose.Words para .NET para manipular las revisiones de inserción en documentos de Word.
type: docs
weight: 10
url: /es/net/find-and-replace-text/ignore-text-inside-insert-revisions/
---

En este artículo, exploraremos el código fuente de C# anterior para entender cómo usar la función Ignorar texto interior Insertar revisiones en la biblioteca Aspose.Words para .NET. Esta característica es útil cuando queremos ignorar el texto dentro de las revisiones de inserción mientras manipulamos documentos.

## requisitos previos

- Conocimientos básicos del lenguaje C#.
- Entorno de desarrollo .NET con la biblioteca Aspose.Words instalada.

## Paso 1: Creación de un nuevo documento

 Antes de comenzar a manipular el texto dentro de las revisiones de inserción, debemos crear un nuevo documento usando Aspose.Words para .NET. Esto se puede hacer instanciando un`Document` objeto:

```csharp
Document doc = new Document();
```

## Paso 2: inserte texto con seguimiento de revisión

 Una vez que tenemos un documento, podemos insertar texto con seguimiento de revisión usando un`DocumentBuilder` objeto. Por ejemplo, para insertar el texto "Insertado" con seguimiento de revisión, podemos usar el`StartTrackRevisions`, `Writeln` y`StopTrackRevisions` métodos:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
doc.StartTrackRevisions("author", DateTime.Now);
builder.Writeln("Inserted");
doc.StopTrackRevisions();
```

## Paso 3: Inserta texto sin revisar

 Además del texto con seguimiento de revisión, también podemos insertar texto sin revisar usando el`DocumentBuilder`objeto. Por ejemplo, para insertar el texto "Texto" sin revisión, podemos usar el`Write` método:

```csharp
builder.Write("Text");
```

## Paso 4: Uso de la función Ignorar texto interior Insertar revisiones

 Para ignorar el texto dentro de las revisiones de inserción en operaciones posteriores, podemos usar un`FindReplaceOptions` objeto y establecer el`IgnoreInserted` propiedad a`true`:

```csharp
FindReplaceOptions options = new FindReplaceOptions { IgnoreInserted = true };
```

## Paso 5: Uso de expresiones regulares para buscar y reemplazar

Para realizar operaciones de búsqueda y reemplazo sobre el texto del documento, utilizaremos expresiones regulares. En nuestro ejemplo, buscaremos todas las ocurrencias de la letra "e" y las reemplazaremos con un asterisco "* ". Usaremos .NET's`Regex` clase para esto:

```csharp
Regex regex = new Regex("e");
doc.Range.Replace(regex, "*", options);
```

## Paso 6: Ver la salida del documento modificado

Después de aplicar la búsqueda y reemplazo, podemos mostrar el contenido modificado del documento usando el`GetText` método:

```csharp
Console.WriteLine(doc.GetText());
```

## Paso 7: Cambio de opciones para incluir revisiones de inserción

 Si queremos incluir el texto dentro de las revisiones de inserción en el resultado de salida, podemos cambiar las opciones para no ignorar las revisiones de inserción. Para ello estableceremos el`IgnoreInserted` propiedad a`false`:

```csharp
options.IgnoreInserted = false;
```

## Paso 8: Visualización del documento modificado con Insertar revisiones

Después de cambiar las opciones, podemos realizar la búsqueda y reemplazar nuevamente para obtener el resultado con el texto dentro de las revisiones de inserción incluidas:

```csharp
doc.Range.Replace(regex, "*", options);
Console.WriteLine(doc.GetText());
```


### Código fuente de ejemplo para Ignorar texto dentro Insertar revisiones usando Aspose.Words para .NET

Aquí está el código fuente de muestra completo para demostrar el uso de la función Ignorar texto interior Insertar revisiones con Aspose.Words para .NET:


```csharp
       
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	// Inserte texto con revisiones de seguimiento.
	doc.StartTrackRevisions("author", DateTime.Now);
	builder.Writeln("Inserted");
	doc.StopTrackRevisions();

	// Insertar texto no revisado.
	builder.Write("Text");

	FindReplaceOptions options = new FindReplaceOptions { IgnoreInserted = true };

	Regex regex = new Regex("e");
	doc.Range.Replace(regex, "*", options);
	
	Console.WriteLine(doc.GetText());

	options.IgnoreInserted = false;
	doc.Range.Replace(regex, "*", options);
	
	Console.WriteLine(doc.GetText());
   
```

## Conclusión

En este artículo, exploramos el código fuente de C# para entender cómo usar la función Ignorar texto interior Insertar revisiones en Aspose.Words para .NET. Seguimos una guía paso a paso para crear un documento, insertar texto con revisiones de seguimiento y texto no revisado, usar la función Ignorar texto dentro de insertar revisiones, realizar operaciones de búsqueda y reemplazo con expresiones regulares y mostrar el documento modificado.