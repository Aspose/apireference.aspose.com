---
title: Ignorar texto dentro de Eliminar revisiones
linktitle: Ignorar texto dentro de Eliminar revisiones
second_title: API de procesamiento de documentos Aspose.Words
description: Aprenda a utilizar la función "Ignorar texto dentro de eliminar revisiones" de Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/find-and-replace-text/ignore-text-inside-delete-revisions/
---

En este artículo, exploraremos el código fuente de C# anterior para comprender cómo utilizar la función "Ignorar texto dentro de eliminar revisiones" en la biblioteca Aspose.Words para .NET. Esta característica es útil cuando queremos ignorar el texto dentro de las revisiones de eliminación cuando procesamos textos con documentos.

## Descripción general de la biblioteca Aspose.Words para .NET

Antes de profundizar en los detalles del código, permítanme presentarles brevemente la biblioteca Aspose.Words para .NET. Es una poderosa biblioteca que permite crear, modificar y convertir documentos de Word en aplicaciones .NET. Ofrece muchas funciones avanzadas para el procesamiento de textos con documentos, incluida la gestión de revisiones.

## Comprender la función "Ignorar texto dentro de eliminar revisiones"

La función "Ignorar texto dentro de las revisiones de eliminación" en Aspose.Words para .NET le permite especificar si el texto dentro de las revisiones de eliminación debe ignorarse durante ciertas operaciones, como buscar y reemplazar texto. Cuando esta función está habilitada, el texto eliminado dentro de las revisiones no se considera durante las operaciones.

## Paso 1: crear un nuevo documento usando Aspose.Words para .NET

 Antes de comenzar a manipular texto en un documento, necesitamos crear un nuevo documento usando Aspose.Words para .NET. Se puede hacer creando una instancia de un`Document` objeto:

```csharp
Document doc = new Document();
```

## Paso 2: insertar texto no revisado en el documento

 Una vez que tenemos un documento, podemos insertar texto no revisado usando un`DocumentBuilder` objeto. Por ejemplo, para insertar el texto "Texto eliminado", podemos utilizar el`Writeln` y`Write` métodos:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder. Writen("Deleted");
builder. Write("Text");
```

## Paso 3: eliminar un párrafo con revisiones de seguimiento

Para ilustrar el uso de la función "Ignorar texto dentro de eliminar revisiones", eliminaremos un párrafo del documento mediante el seguimiento de revisiones. Esto nos permitirá ver cómo afecta esta característica a operaciones posteriores.

```csharp
doc.StartTrackRevisions("author", DateTime.Now);
doc.FirstSection.Body.FirstParagraph.Remove();
doc.StopTrackRevisions();
```

## Paso 4: Aplicar la función "Ignorar texto dentro de Eliminar revisiones"

 Ahora que hemos preparado nuestro documento eliminando un párrafo, podemos habilitar la función "Ignorar texto dentro de eliminar revisiones" usando un`FindReplaceOptions` objeto. Estableceremos el`IgnoreDeleted` propiedad a`true`:

```csharp
FindReplaceOptions options = new FindReplaceOptions { IgnoreDeleted = true };
```

## Paso 5: usar expresiones regulares para buscar y reemplazar

Para realizar operaciones de búsqueda y reemplazo en el texto del documento, usaremos expresiones regulares. En nuestro ejemplo, buscaremos todas las apariciones de la letra "e" y las reemplazaremos con un asterisco ".* ". .NETO`Regex` La clase se utiliza para esto:

```csharp
Regex regex = new Regex("e");
doc.Range.Replace(regex, "*", options);
```

## Paso 6: Mostrar el resultado del documento modificado

Después de aplicar la búsqueda y reemplazo, podemos mostrar el contenido modificado del documento usando el`GetText` método:

```csharp
Console.WriteLine(doc.GetText());
```

## Paso 7: Modificar las opciones para incluir texto eliminado

 Si queremos incluir texto eliminado en el resultado de salida, podemos cambiar las opciones para no ignorar el texto eliminado. Para ello estableceremos el`IgnoreDeleted` propiedad a`false`:

```csharp
options. IgnoreDeleted = false;
```

## Paso 8: generar el documento modificado con texto eliminado

Luego de cambiar las opciones, podemos realizar la búsqueda y reemplazar nuevamente para obtener el resultado con el texto eliminado incluido:

```csharp
doc.Range.Replace(regex, "*", options);
Console.WriteLine(doc.GetText());
```

### Código fuente de ejemplo para ignorar texto dentro de eliminar revisiones usando Aspose.Words para .NET

Aquí está el código fuente de muestra completo para demostrar el uso de la función "Ignorar texto dentro de eliminar revisiones" con Aspose.Words para .NET:

```csharp
        
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	// Insertar texto no revisado.
	builder.Writeln("Deleted");
	builder.Write("Text");

	// Elimine el primer párrafo con revisiones de seguimiento.
	doc.StartTrackRevisions("author", DateTime.Now);
	doc.FirstSection.Body.FirstParagraph.Remove();
	doc.StopTrackRevisions();

	FindReplaceOptions options = new FindReplaceOptions { IgnoreDeleted = true };

	Regex regex = new Regex("e");
	doc.Range.Replace(regex, "*", options);

	Console.WriteLine(doc.GetText());

	options.IgnoreDeleted = false;
	doc.Range.Replace(regex, "*", options);

	Console.WriteLine(doc.GetText());
    
```

## Conclusión

En este artículo, exploramos el código fuente de C# para comprender cómo utilizar la función "Ignorar texto dentro de eliminar revisiones" en Aspose.Words para .NET. Esta característica es útil para ignorar el texto dentro de las revisiones de eliminación al manipular documentos. Seguimos una guía paso a paso para crear un documento, insertar texto, eliminar un párrafo con seguimiento de revisiones, aplicar la función "Ignorar texto dentro de eliminar revisiones" y realizar operaciones de búsqueda y reemplazo.

### Preguntas frecuentes

#### P: ¿Qué es la función "Ignorar texto dentro de eliminar revisiones" en Aspose.Words para .NET?

R: La función "Ignorar texto dentro de las revisiones de eliminación" en Aspose.Words para .NET le permite especificar si el texto dentro de las revisiones de eliminación debe ignorarse durante ciertas operaciones, como buscar y reemplazar texto. Cuando esta función está habilitada, el texto eliminado dentro de las revisiones no se considera durante las operaciones.

#### P: ¿Qué es Aspose.Words para .NET?

R: Aspose.Words para .NET es una poderosa biblioteca para crear, editar y convertir documentos de Word en aplicaciones .NET. Ofrece muchas funciones avanzadas para el procesamiento de textos con documentos, incluida la gestión de revisiones.

#### P: ¿Cómo crear un nuevo documento en Aspose.Words para .NET?

 R: Antes de comenzar a manipular texto en un documento, necesita crear un documento nuevo usando Aspose.Words para .NET. Esto se puede hacer creando una instancia de un`Document` objeto. Aquí hay un código de muestra para crear un nuevo documento:

```csharp
Document doc = new Document();
```

#### P: ¿Cómo insertar texto sin editar en un documento usando Aspose.Words para .NET?

 R: Una vez que tenga un documento, puede insertar texto no revisado usando un`DocumentBuilder` objeto. Por ejemplo, para insertar el texto "Texto eliminado", puede utilizar el`Writeln` y`Write` métodos:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writen("Deleted");
builder.Write("Text");
```

#### P: ¿Cómo elimino un párrafo con seguimiento de revisión en Aspose.Words para .NET?

R: Para ilustrar el uso de la función "Ignorar texto dentro de eliminar revisiones", eliminaremos un párrafo del documento mediante el seguimiento de revisiones. Esto nos permitirá ver cómo afecta esta función a operaciones posteriores.

```csharp
doc.StartTrackRevisions("author", DateTime.Now);
doc.FirstSection.Body.FirstParagraph.Remove();
doc.StopTrackRevisions();
```

#### P: ¿Cómo habilitar la función "Ignorar texto dentro de eliminar revisiones" en Aspose.Words para .NET?

 R: Ahora que hemos preparado nuestro documento eliminando un párrafo, podemos habilitar la función "Ignorar texto dentro de eliminar revisiones" usando un`FindReplaceOptions` objeto. Estableceremos el`IgnoreDeleted` propiedad a`true`:

```csharp
FindReplaceOptions options = new FindReplaceOptions { IgnoreDeleted = true };
```

#### P: ¿Cómo buscar y reemplazar usando expresiones regulares en Aspose.Words para .NET?

R: Para realizar operaciones de búsqueda y reemplazo en el texto del documento, usaremos expresiones regulares. En nuestro ejemplo, buscaremos todas las apariciones de la letra "e" y las reemplazaremos con un asterisco ".* ". Usaremos el .NET`Regex` clase para esto:

```csharp
Regex regex = new Regex("e");
doc.Range.Replace(regex, "*", options);
```

#### P: ¿Cómo ver el contenido modificado del documento en Aspose.Words para .NET?

R: Después de aplicar la búsqueda y reemplazo, podemos mostrar el contenido modificado del documento usando el`GetText` método:

```csharp
Console.WriteLine(doc.GetText());
```

#### P: ¿Cómo incluir texto eliminado en el resultado de salida en Aspose.Words para .NET?

 R: Si queremos incluir texto eliminado en el resultado de salida, podemos cambiar las opciones para no ignorar el texto eliminado. Para ello estableceremos el`IgnoreDeleted` propiedad a`false`:

```csharp
options. IgnoreDeleted = false;
```

#### P: ¿Cómo mostrar un documento editado con texto eliminado en Aspose.Words para .NET?

R: Después de cambiar las opciones, podemos hacer una nueva búsqueda y reemplazar para obtener el resultado con el texto eliminado incluido:

```csharp
doc.Range.Replace(regex, "*", options);
Console.WriteLine(doc.GetText());
```
