---
title: Caja combo
linktitle: Caja combo
second_title: Referencia de API de Aspose.PDF para .NET
description: Cree fácilmente una lista de cuadros combinados en sus documentos PDF utilizando Aspose.PDF para .NET.
type: docs
weight: 30
url: /es/net/programming-with-forms/combo-box/
---
En este tutorial, le mostraremos cómo crear una lista de cuadro combinado usando Aspose.PDF para .NET. Explicaremos el código fuente de C# paso a paso para guiarlo a través de este proceso.

## Paso 1: Preparación

Primero, asegúrese de haber importado las bibliotecas necesarias y establezca la ruta al directorio de documentos:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Paso 2: crear un objeto de documento

Cree un objeto Documento para contener el formulario PDF:

```csharp
Document doc = new Document();
```

## Paso 3: Agrega una página

Añadir una página al documento:

```csharp
doc.Pages.Add();
```

## Paso 4: crear una instancia de un objeto ComboBoxField

Cree una instancia de un objeto ComboBoxField con las dimensiones deseadas:

```csharp
ComboBoxField combo = new ComboBoxField(doc.Pages[1], new Aspose.Pdf.Rectangle(100, 600, 150, 616));
```

## Paso 5: agregue opciones a la lista desplegable

Agregue las opciones deseadas a la lista desplegable:

```csharp
combo.AddOption("Red");
combo.AddOption("Yellow");
combo.AddOption("Green");
combo.AddOption("Blue");
```

## Paso 6: agregue la lista del cuadro combinado al formulario

Agregue el objeto ComboBoxField a la colección de campos de formulario de documento:

```csharp
doc.Form.Add(combo);
```

## Paso 7: Guarde el documento

Guarde el documento PDF:

```csharp
dataDir = dataDir + "ComboBox_out.pdf";
doc.Save(dataDir);
```

### Ejemplo de código fuente para Combo Box usando Aspose.PDF para .NET 
```csharp
try
{
	// La ruta al directorio de documentos.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Crear objeto de documento
	Document doc = new Document();
	// Agregar página al objeto del documento
	doc.Pages.Add();
	// Instanciar objeto ComboBox Field
	ComboBoxField combo = new ComboBoxField(doc.Pages[1], new Aspose.Pdf.Rectangle(100, 600, 150, 616));
	// Agregar opción a ComboBox
	combo.AddOption("Red");
	combo.AddOption("Yellow");
	combo.AddOption("Green");
	combo.AddOption("Blue");
	// Agregue un objeto de cuadro combinado para formar la colección de campos del objeto de documento
	doc.Form.Add(combo);
	dataDir = dataDir + "ComboBox_out.pdf";
	// Guardar el documento PDF
	doc.Save(dataDir);
	Console.WriteLine("\nCombobox field added successfully.\nFile saved at " + dataDir);
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message);
}
```

## Conclusión

En este tutorial, aprendimos a crear una lista de cuadros combinados con Aspose.PDF para .NET. Siguiendo estos pasos, puede agregar fácilmente una lista de cuadros combinados a sus documentos PDF usando Aspose.PDF.

### Preguntas frecuentes

#### P: ¿Puedo personalizar la apariencia de la lista del cuadro combinado usando Aspose.PDF para .NET?

R: Sí, puede personalizar la apariencia de la lista del cuadro combinado usando Aspose.PDF para .NET. Puede establecer propiedades como el tamaño de la fuente, el color, el color de fondo, el estilo del borde y más para que coincidan con el aspecto que desee.

#### P: ¿Puedo establecer opciones predeterminadas seleccionadas en la lista del cuadro combinado?

 R: Sí, puede configurar las opciones seleccionadas predeterminadas en la lista del cuadro combinado usando Aspose.PDF para .NET. Puedes usar el`Selected` propiedad de la`ComboBoxField` objeto para marcar una o más opciones como seleccionadas por defecto.

#### P: ¿Cómo puedo recuperar el valor seleccionado de la lista del cuadro combinado después de que el usuario haga una selección?

 R: Puede recuperar el valor seleccionado de la lista del cuadro combinado utilizando Aspose.PDF para .NET. Después de que el usuario haga una selección, puede acceder a la`Value` propiedad de la`ComboBoxField`objeto para obtener el valor seleccionado.

#### P: ¿Es posible agregar controladores de eventos o acciones a la lista del cuadro combinado?

 R: Sí, Aspose.PDF para .NET le permite agregar controladores de eventos o acciones a la lista del cuadro combinado. Puede asociar acciones de JavaScript, como`OnValueChanged`, a la lista del cuadro combinado para realizar acciones específicas cuando el usuario selecciona una opción.

#### P: ¿Puedo agregar información sobre herramientas o descripciones a las opciones en la lista del cuadro combinado?

 R: Sí, puede agregar información sobre herramientas o descripciones a las opciones en la lista del cuadro combinado usando Aspose.PDF para .NET. Puede configurar el`AlternateName` propiedad de cada opción para proporcionar información sobre herramientas o descripción que se mostrará cuando el usuario pase el cursor sobre la opción.