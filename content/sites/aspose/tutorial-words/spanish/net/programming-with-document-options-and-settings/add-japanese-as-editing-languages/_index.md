---
title: Agregar japonés como idiomas de edición
linktitle: Agregar japonés como idiomas de edición
second_title: Referencia de API de Aspose.Words para .NET
description: Guía paso a paso para agregar japonés como idioma de edición con Aspose.Words para .NET.
type: docs
weight: 10
url: /es/net/programming-with-document-options-and-settings/add-japanese-as-editing-languages/
---

En este tutorial, lo guiaremos paso a paso para comprender e implementar la funcionalidad de agregar japonés como idioma de edición con Aspose.Words para .NET. Esta función le permite establecer preferencias de idioma al cargar un documento y agregar japonés como idioma de edición.

## Paso 1: Configuración del proyecto

Para comenzar, cree un nuevo proyecto de C# en su IDE favorito. Asegúrese de que se haga referencia a la biblioteca Aspose.Words para .NET en su proyecto.

## Paso 2: Cargar el documento

En este paso, cargaremos el documento de Word que no contiene un idioma de edición predeterminado y al que queremos agregar japonés. Use el siguiente código para cargar el documento:

```csharp
LoadOptions loadOptions = new LoadOptions();

// Establezca las preferencias de idioma que se utilizarán al cargar el documento.
loadOptions.LanguagePreferences.AddEditingLanguage(EditingLanguage.Japanese);

string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "No default editing language.docx", loadOptions);
```

## Paso 3: Comprobación del idioma predeterminado

Después de cargar el documento, comprobaremos si el idioma de edición predeterminado se ha configurado correctamente en japonés. Use el siguiente código para obtener la identificación del idioma del Lejano Oriente:

```csharp
int localeIdFarEast = doc.Styles.DefaultFont.LocaleIdFarEast;
Console.WriteLine(
	localeIdFarEast == (int) EditingLanguage.Japanese
		? "The document either has no any FarEast language set in defaults or it was set to Japanese originally."
		: "The document default FarEast language was set to another than Japanese language originally, so it is not overridden.");
```

El código verifica si la identificación del idioma del Lejano Oriente coincide con la del japonés. Según el resultado, muestra un mensaje correspondiente.

### Código fuente de ejemplo para agregar japonés como idiomas de edición usando Aspose.Words para .NET

```csharp

	LoadOptions loadOptions = new LoadOptions();
	
	// Establezca las preferencias de idioma que se utilizarán cuando se cargue el documento.
	loadOptions.LanguagePreferences.AddEditingLanguage(EditingLanguage.Japanese);
	
	// La ruta al directorio de documentos.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "No default editing language.docx", loadOptions);

	int localeIdFarEast = doc.Styles.DefaultFont.LocaleIdFarEast;
	Console.WriteLine(
		localeIdFarEast == (int) EditingLanguage.Japanese
			? "The document either has no any FarEast language set in defaults or it was set to Japanese originally."
			: "The document default FarEast language was set to another than Japanese language originally, so it is not overridden.");

```

