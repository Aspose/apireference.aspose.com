---
title: Insertar objeto viejo
linktitle: Insertar objeto viejo
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a insertar un objeto OLE en un documento usando Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/working-with-oleobjects-and-activex/insert-ole-object/
---

Aquí hay una guía paso a paso para explicar el código fuente de C# a continuación que ilustra cómo insertar un objeto OLE usando Aspose.Words para .NET.

## Paso 1: Importa las referencias necesarias
Antes de comenzar, asegúrese de haber importado las referencias necesarias para usar Aspose.Words para .NET en su proyecto. Esto incluye importar la biblioteca Aspose.Words y agregar los espacios de nombres requeridos a su archivo fuente.

```csharp
using Aspose.Words;
using Aspose.Words.Drawing;
```

## Paso 2: Crear un nuevo documento y generador de documentos
 En este paso, crearemos un nuevo documento usando el`Document` clase y un generador de documentos usando el`DocumentBuilder` clase.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Paso 3: Insertar un objeto OLE
 Utilice el Creador de documentos`InsertOleObject` para insertar un objeto OLE en el documento. Especifique la URL del objeto OLE, el tipo de objeto, las opciones de visualización y otras configuraciones necesarias.

```csharp
builder. InsertOleObject("http://www.aspose.com", "htmlfile", verdadero, verdadero, nulo);
```

## Paso 4: Guarde el documento
 Usa el documento`Save` para guardar el documento en un archivo.

```csharp
doc.Save("Path_to_your_directory/WorkingWithOleObjectsAndActiveX.InsertOleObject.docx");
```

### Ejemplo de código fuente para insertar un objeto OLE con Aspose.Words para .NET

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder. InsertOleObject("http://www.aspose.com", "htmlfile", verdadero, verdadero, nulo);

doc.Save("Path_to_your_directory/WorkingWithOleObjectsAndActiveX.InsertOleObject.docx");
```

Este es un ejemplo de código completo para insertar un objeto OLE con Aspose.Words para .NET. Asegúrese de importar las referencias necesarias y siga los pasos descritos anteriormente para integrar este código en su proyecto.
