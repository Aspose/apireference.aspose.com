---
title: Detectar forma de arte inteligente
linktitle: Detectar forma de arte inteligente
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a detectar formas Smart Art en un documento de Word usando Aspose.Words para .NET, identificando representaciones gráficas.
type: docs
weight: 10
url: /es/net/programming-with-shapes/detect-smart-art-shape/
---

Este tutorial explica cómo detectar formas Smart Art en un documento de Word utilizando Aspose.Words para .NET. Las formas Smart Art son representaciones gráficas que se utilizan para presentar visualmente información e ideas.

## requisitos previos
Para seguir este tutorial, necesita tener lo siguiente:

- Aspose.Words para la biblioteca .NET instalada.
- Conocimientos básicos de C# y trabajo con documentos de Word.

## Paso 1: configurar el directorio de documentos
 Comience configurando la ruta a su directorio de documentos. Reemplazar`"YOUR DOCUMENT DIRECTORY"` con la ruta real al directorio donde se encuentra su documento.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Paso 2: Cargue el Documento
 Cargue el documento de Word usando el`Document` constructor, pasando la ruta al documento como parámetro.

```csharp
Document doc = new Document(dataDir + "Smart Art.docx");
```

## Paso 3: Detectar formas artísticas inteligentes
Iterar a través de los nodos secundarios de tipo`Shape` en el documento utilizando el`GetChildNodes` método. Compruebe si cada forma tiene Smart Art usando el`HasSmart Art` propiedad.

```csharp
int count = doc.GetChildNodes(NodeType.Shape, true).Cast<Shape>().Count(shape => shape.HasSmart Art);
```

## Paso 4: salida del resultado
Imprime el recuento de formas con Smart Art detectadas en el documento.

```csharp
Console.WriteLine("The document has {0} shapes with Smart Art.", count);
```

### Código fuente de ejemplo para Detectar forma de arte inteligente usando Aspose.Words para .NET 

```csharp
	// Ruta a su directorio de documentos
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document(dataDir + "Smart Art.docx");
	int count = doc.GetChildNodes(NodeType.Shape, true).Cast<Shape>().Count(shape => shape.HasSmart Art);
	Console.WriteLine("The document has {0} shapes with Smart Art.", count);
```

¡Eso es todo! Ha detectado con éxito formas Smart Art en su documento de Word usando Aspose.Words para .NET.