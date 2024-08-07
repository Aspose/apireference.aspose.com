---
title: Mantenga la fuente unida
linktitle: Mantenga la fuente unida
second_title: API de procesamiento de documentos Aspose.Words
description: Aprenda a usar Aspose.Words para .NET para unir y agregar documentos de Word manteniendo el contenido de origen junto con el documento de destino.
type: docs
weight: 10
url: /es/net/join-and-append-documents/keep-source-together/
---

Este tutorial lo guiará a través del proceso de uso de la función Mantener el código fuente junto de Aspose.Words para .NET. Esta función le permite unir y adjuntar varios documentos de Word mientras mantiene el contenido del documento de origen junto con el contenido del documento de destino. 

## Requisitos previos

Antes de comenzar, asegúrese de tener lo siguiente:

1. Aspose.Words para .NET instalado. Puede descargarlo del sitio web de Aspose o instalarlo a través de NuGet.
2. Visual Studio o cualquier otro entorno de desarrollo C#.

## Paso 1: inicializar los directorios de documentos

 Primero, debe establecer la ruta a su directorio de documentos. Modificar el valor de la`dataDir` variable a la ruta donde se encuentran sus documentos.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Paso 2: cargue los documentos de origen y de destino

 A continuación, debe cargar los documentos de origen y de destino utilizando Aspose.Words.`Document` clase. Actualice los nombres de los archivos en el`Document` constructor de acuerdo con los nombres de sus documentos.

```csharp
Document srcDoc = new Document(dataDir + "Document source.docx");
Document dstDoc = new Document(dataDir + "Document destination with list.docx");
```

## Paso 3: configurar el documento de origen para que aparezca después del contenido del documento de destino

 Para garantizar que el documento de origen aparezca inmediatamente después del contenido del documento de destino, debe configurar el`SectionStart` propiedad de la primera sección del documento fuente para`SectionStart.Continuous`.

```csharp
srcDoc.FirstSection.PageSetup.SectionStart = SectionStart.Continuous;
```

## Paso 4: Establezca el formato de párrafo "Mantener con el siguiente" para el documento fuente

 Para mantener juntos los párrafos del documento fuente, puede recorrer cada párrafo del documento y establecer el`KeepWithNext` propiedad a`true`.

```csharp
foreach (Paragraph para in srcDoc.GetChildNodes(NodeType.Paragraph, true))
{
    para.ParagraphFormat.KeepWithNext = true;
}
```

## Paso 5: agregue el documento de origen al documento de destino

 Ahora, puede adjuntar el documento de origen al documento de destino utilizando el`AppendDocument` método de la`Document` clase. El`ImportFormatMode.KeepSourceFormatting` El parámetro garantiza que el formato de origen se conserve durante la operación de adición.

```csharp
dstDoc.AppendDocument(srcDoc, ImportFormatMode.KeepSourceFormatting);
```

## Paso 6: guarde el documento final

 Finalmente, guarde el documento combinado con la función "Mantener la fuente junta" habilitada usando el`Save` método de la`Document` clase.

```csharp
dstDoc.Save(dataDir + "JoinAndAppendDocuments.KeepSourceTogether.docx");
```

### Código fuente de ejemplo para Keep Source Together usando Aspose.Words para .NET 

Aquí está el código fuente completo de la función "Mantener el código fuente unido" en C# usando Aspose.Words para .NET:


```csharp
	// Ruta a su directorio de documentos
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document srcDoc = new Document(dataDir + "Document source.docx");
	Document dstDoc = new Document(dataDir + "Document destination with list.docx");
	// Configure el documento de origen para que aparezca inmediatamente después del contenido del documento de destino.
	srcDoc.FirstSection.PageSetup.SectionStart = SectionStart.Continuous;
	foreach (Paragraph para in srcDoc.GetChildNodes(NodeType.Paragraph, true))
	{
		para.ParagraphFormat.KeepWithNext = true;
	}
	dstDoc.AppendDocument(srcDoc, ImportFormatMode.KeepSourceFormatting);
	dstDoc.Save(dataDir + "JoinAndAppendDocuments.KeepSourceTogether.docx");
```

¡Eso es todo! Ha implementado con éxito la función Mantener el código fuente junto utilizando Aspose.Words para .NET. El documento final contendrá el contenido fusionado y los párrafos del documento fuente se mantendrán juntos.