---
title: Insertar campos de formulario
linktitle: Insertar campos de formulario
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a insertar campos de formulario desplegables en documentos de Word usando Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/working-with-formfields/insert-form-fields/
---

En este tutorial paso a paso, lo guiaremos sobre cómo insertar campos de formulario, específicamente un campo de formulario desplegable, en un documento de Word usando Aspose.Words para .NET. Explicaremos el código fuente de C# provisto y le mostraremos cómo implementarlo en sus propios proyectos.

Para comenzar, asegúrese de tener Aspose.Words para .NET instalado y configurado en su entorno de desarrollo. Si no lo ha hecho, descargue e instale la biblioteca desde el sitio web oficial.

## Paso 1: inicialización de los objetos Document y DocumentBuilder

 Primero, inicialice el`Document` y`DocumentBuilder` objetos:

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Paso 2: Inserción de un campo de formulario desplegable

 A continuación, especifique las opciones para el campo de formulario desplegable e insértelo en el documento usando el`InsertComboBox` metodo de la`DocumentBuilder`objeto. En este ejemplo, insertamos un campo de formulario desplegable llamado "DropDown" con tres opciones: "Uno", "Dos" y "Tres":

```csharp
string[] items = { "One", "Two", "Three" };
builder.InsertComboBox("DropDown", items, 0);
```

## Paso 3: Guardar el documento

Finalmente, guarde el documento:

```csharp
doc.Save("OutputDocument.docx");
```

¡Eso es todo! Ha insertado con éxito un campo de formulario desplegable en un documento de Word utilizando Aspose.Words para .NET.

### Ejemplo de código fuente para Insertar campos de formulario usando Aspose.Words para .NET

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

string[] items = { "One", "Two", "Three" };
builder.InsertComboBox("DropDown", items, 0);

doc.Save("OutputDocument.docx");
```

Siéntase libre de usar este código en sus propios proyectos y modifíquelo de acuerdo con sus requisitos específicos.