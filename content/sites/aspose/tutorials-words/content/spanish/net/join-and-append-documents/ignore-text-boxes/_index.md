---
title: Ignorar cuadros de texto
linktitle: Ignorar cuadros de texto
second_title: API de procesamiento de documentos Aspose.Words
description: Aprenda cómo adjuntar un documento ignorando el formato del cuadro de texto usando Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/join-and-append-documents/ignore-text-boxes/
---

Este tutorial explica cómo usar Aspose.Words para .NET para adjuntar un documento conservando el formato de los cuadros de texto. El código fuente proporcionado demuestra cómo configurar las opciones de formato de importación para incluir cuadros de texto durante el proceso de adición.

## Paso 1: configurar el proyecto

Asegúrese de tener los siguientes requisitos previos:

-  Aspose.Words para la biblioteca .NET instalada. Puedes descargarlo desde[Aspose.Releases]https://releases.aspose.com/words/net/ o utilice el administrador de paquetes NuGet para instalarlo.
- Una ruta de directorio de documentos donde se encuentran los documentos de origen y de destino.

## Paso 2: abra los documentos de origen y destino

 Abra los documentos de origen y destino utilizando el`Document` constructor de clases. Reemplazar`"YOUR DOCUMENT DIRECTORY"` con la ruta real a su directorio de documentos.

```csharp
// Ruta a su directorio de documentos
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document srcDoc = new Document(dataDir + "Document source.docx");
Document dstDoc = new Document(dataDir + "Northwind traders.docx");
```

## Paso 3: configurar las opciones de formato de importación

 Crear una instancia del`ImportFormatOptions` clase y establecer el`IgnoreTextBoxes` propiedad a`false`. Esto garantiza que los cuadros de texto se incluyan durante el proceso de adición conservando su formato.

```csharp
ImportFormatOptions importFormatOptions = new ImportFormatOptions { IgnoreTextBoxes = false };
```

## Paso 4: agregar contenido del cuadro de texto

 Crear un`NodeImporter` objeto y utilícelo para importar nodos de cuadro de texto desde el documento de origen al documento de destino. Repita cada párrafo del documento de origen e impórtelo al documento de destino.

```csharp
NodeImporter importer = new NodeImporter(srcDoc, dstDoc, ImportFormatMode.KeepSourceFormatting, importFormatOptions);
ParagraphCollection srcParas = srcDoc.FirstSection.Body.Paragraphs;
foreach (Paragraph srcPara in srcParas)
{
    Node importedNode = importer.ImportNode(srcPara, true);
    dstDoc.FirstSection.Body.AppendChild(importedNode);
}
```

## Paso 5: guarde el documento de destino

 Finalmente, guarde el documento de destino modificado usando el`Save` método de la`Document` objeto.

```csharp
dstDoc.Save(dataDir + "JoinAndAppendDocuments.IgnoreTextBoxes.docx");
```

Esto completa la implementación de agregar un documento mientras se conserva el formato del cuadro de texto usando Aspose.Words para .NET.

### Código fuente de ejemplo para ignorar cuadros de texto usando Aspose.Words para .NET 

```csharp
	// Ruta a su directorio de documentos
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document srcDoc = new Document(dataDir + "Document source.docx");
	Document dstDoc = new Document(dataDir + "Northwind traders.docx");
	// Mantenga el formato de los cuadros de texto de origen al importar.
	ImportFormatOptions importFormatOptions = new ImportFormatOptions { IgnoreTextBoxes = false };
	NodeImporter importer = new NodeImporter(srcDoc, dstDoc, ImportFormatMode.KeepSourceFormatting,
		importFormatOptions);
	ParagraphCollection srcParas = srcDoc.FirstSection.Body.Paragraphs;
	foreach (Paragraph srcPara in srcParas)
	{
		Node importedNode = importer.ImportNode(srcPara, true);
		dstDoc.FirstSection.Body.AppendChild(importedNode);
	}
	dstDoc.Save(dataDir + "JoinAndAppendDocuments.IgnoreTextBoxes.docx");
```