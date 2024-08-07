---
title: Obtener lista de fuentes disponibles
linktitle: Obtener lista de fuentes disponibles
second_title: Referencia de API de Aspose.Words para .NET
description: En este tutorial, aprenda cómo obtener la lista de fuentes disponibles en Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/working-with-fonts/get-list-of-available-fonts/
---
En este tutorial, explicaremos cómo obtener la lista de fuentes disponibles en Aspose.Words para .NET. La lista de fuentes disponibles le permite saber qué fuentes puede usar en sus documentos. Lo guiaremos paso a paso para ayudarlo a comprender e implementar el código en su proyecto .NET.

## requisitos previos
Antes de comenzar, asegúrese de tener los siguientes elementos:
- Un conocimiento práctico del lenguaje de programación C#
- La biblioteca Aspose.Words para .NET instalada en su proyecto

## Paso 1: Definir el directorio de documentos
 Primero, debe establecer la ruta del directorio en la ubicación de su documento de Word. Reemplazar`"YOUR DOCUMENT DIRECTORY"` en el código con la ruta adecuada.

```csharp
// Ruta a su directorio de documentos
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Paso 2: Configurar fuentes de fuentes
 A continuación, crearemos una instancia de`FontSettings` y obtenga las fuentes de fuentes existentes usando el`GetFontsSources()` método. También agregaremos una nueva fuente de fuentes especificando una carpeta que contenga fuentes.

```csharp
// Configurar fuentes de fuentes
FontSettings fontSettings = new FontSettings();
List<FontSourceBase> fontSources = new List<FontSourceBase>(fontSettings.GetFontsSources());

// Agregar una nueva fuente de fuente
FolderFontSource folderFontSource = new FolderFontSource(dataDir, true);
fontSources.Add(folderFontSource);

FontSourceBase[] updatedFontSources = fontSources.ToArray();
```

## Paso 3: Obtenga la lista de fuentes disponibles
 Ahora buscaremos las fuentes disponibles usando el`GetAvailableFonts()` método en la primera fuente de fuente actualizada.

```csharp
// Obtener la lista de fuentes disponibles
foreach(PhysicalFontInfo fontInfo in updatedFontSources[0].GetAvailableFonts())
{
Console.WriteLine("Font Family Name: " + fontInfo.FontFamilyName);
Console.WriteLine("Full font name: " + fontInfo.FullFontName);
Console.WriteLine("Version: " + fontInfo.Version);
Console.WriteLine("Path: " + fontInfo.FilePath);
}
```


### Ejemplo de código fuente para obtener la lista de fuentes disponibles usando Aspose.Words para .NET 

```csharp

// Ruta a su directorio de documentos
string dataDir = "YOUR DOCUMENT DIRECTORY";

FontSettings fontSettings = new FontSettings();
List<FontSourceBase> fontSources = new List<FontSourceBase>(fontSettings.GetFontsSources());
// Agregue una nueva fuente de carpeta que indicará a Aspose.Words que busque fuentes en la siguiente carpeta.
FolderFontSource folderFontSource = new FolderFontSource(dataDir, true);
// Agregue la carpeta personalizada que contiene nuestras fuentes a la lista de fuentes de fuentes existentes.
fontSources.Add(folderFontSource);
FontSourceBase[] updatedFontSources = fontSources.ToArray();
foreach (PhysicalFontInfo fontInfo in updatedFontSources[0].GetAvailableFonts())
{
	Console.WriteLine("FontFamilyName : " + fontInfo.FontFamilyName);
	Console.WriteLine("FullFontName  : " + fontInfo.FullFontName);
	Console.WriteLine("Version  : " + fontInfo.Version);
	Console.WriteLine("FilePath : " + fontInfo.FilePath);
}

```

## Conclusión
En este tutorial, vimos cómo obtener la lista de fuentes disponibles en Aspose.Words para .NET. Esto le permite saber qué fuentes puede usar en sus documentos. Siéntase libre de usar esta función para elegir las fuentes apropiadas para sus necesidades.