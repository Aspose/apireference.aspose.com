---
title: tachar palabras
linktitle: tachar palabras
second_title: Referencia de API de Aspose.PDF para .NET
description: Este artículo proporciona una guía paso a paso para usar Aspose.PDF para la función Tachar palabras de .NET, que incluye una guía paso a paso y explicaciones.
type: docs
weight: 150
url: /es/net/annotations/strikeoutwords/
---
Aspose.PDF para .NET es una biblioteca de manipulación y procesamiento de documentos PDF que proporciona varias funciones para crear, modificar y convertir archivos PDF. Una de las características útiles que proporciona Aspose.PDF es la capacidad de tachar palabras o frases en un documento PDF utilizando el código fuente de C#. En este artículo, proporcionaremos una guía paso a paso sobre cómo tachar palabras usando Aspose.PDF para .NET.

## Paso 1: Cargar el documento PDF
El primer paso es cargar el documento PDF que desea modificar. En este tutorial, cargaremos un documento PDF llamado "input.pdf" desde la carpeta "SU DIRECTORIO DE DOCUMENTOS". 

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document document = new Document(dataDir + "input.pdf");
```

## Paso 2: Buscar fragmentos de texto
Para tachar palabras o frases específicas en el documento PDF, primero debe buscarlas. Aspose.PDF proporciona una clase TextFragmentAbsorber que se puede usar para buscar un fragmento de texto específico en el documento PDF.

```csharp
Aspose.Pdf.Text.TextFragmentAbsorber textFragmentAbsorber = new Aspose.Pdf.Text.TextFragmentAbsorber("Estoque");
```

En el código anterior, estamos buscando el fragmento de texto "Estoque" en el documento PDF. Puede modificar esto para buscar cualquier otra palabra o frase que desee tachar.

## Paso 3: tachar los fragmentos de texto
Después de encontrar los fragmentos de texto, el siguiente paso es tacharlos. Aspose.PDF proporciona una clase StrikeOutAnnotation que se puede usar para crear una anotación tachada para el fragmento de texto. 

```csharp
Aspose.Pdf.Rectangle rect = new Aspose.Pdf.Rectangle((float)textFragment.Position.XIndent, (float)textFragment.Position.YIndent, (float)textFragment.Position.XIndent + (float)textFragment.Rectangle.Width, (float)textFragment.Position.YIndent + (float)textFragment.Rectangle.Height);

StrikeOutAnnotation strikeOut = new StrikeOutAnnotation(textFragment.Page, rect);
strikeOut.Opacity = .80f;
strikeOut.Border = new Border(strikeOut);
strikeOut.Color = Aspose.Pdf.Color.Red;
textFragment.Page.Annotations.Add(strikeOut);
```

En el código anterior, estamos creando una anotación tachada para cada fragmento de texto que encontramos. También estamos configurando la opacidad, el borde y el color de la anotación tachada.

## Paso 4: Guardar el documento PDF modificado
Después de tachar los fragmentos de texto, guarde el documento modificado.

```csharp
dataDir = dataDir + "StrikeOutWords_out.pdf";
document.Save(dataDir);
```

### Ejemplo de código fuente para tachar palabras usando Aspose.PDF para .NET


```csharp

// La ruta al directorio de documentos.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Abrir documento
Document document = new Document(dataDir + "input.pdf");

// Cree una instancia de TextFragment Absorber para buscar un fragmento de texto en particular
Aspose.Pdf.Text.TextFragmentAbsorber textFragmentAbsorber = new Aspose.Pdf.Text.TextFragmentAbsorber("Estoque");
// Iterar a través de las páginas del documento PDF
for (int i = 1; i <= document.Pages.Count; i++)
{
	// Obtener la primera página del documento PDF
	Page page = document.Pages[1];
	page.Accept(textFragmentAbsorber);
}

// Crear una colección de texto absorbido
Aspose.Pdf.Text.TextFragmentCollection textFragmentCollection = textFragmentAbsorber.TextFragments;

//Iterar en la colección anterior
for (int j = 1; j <= textFragmentCollection.Count; j++)
{
	Aspose.Pdf.Text.TextFragment textFragment = textFragmentCollection[j];

	// Obtener dimensiones rectangulares del objeto TextFragment
	Aspose.Pdf.Rectangle rect = new Aspose.Pdf.Rectangle(
				(float)textFragment.Position.XIndent,
				(float)textFragment.Position.YIndent,
				(float)textFragment.Position.XIndent +
				(float)textFragment.Rectangle.Width,
				(float)textFragment.Position.YIndent +
				(float)textFragment.Rectangle.Height);

	// Crear una instancia de anotación StrikeOut
	StrikeOutAnnotation strikeOut = new StrikeOutAnnotation(textFragment.Page, rect);
	// Establecer la opacidad para la anotación
	strikeOut.Opacity = .80f;
	// Establecer el borde para la instancia de anotación
	strikeOut.Border = new Border(strikeOut);
	// Establecer el color de la anotación
	strikeOut.Color = Aspose.Pdf.Color.Red;
	// Agregar anotación a la colección de anotaciones de TextFragment
	textFragment.Page.Annotations.Add(strikeOut);
}
dataDir = dataDir + "StrikeOutWords_out.pdf";
document.Save(dataDir);
```

## Conclusión

En este tutorial, aprendimos a usar Aspose.PDF para .NET para tachar palabras específicas en un documento PDF. Al seguir la guía paso a paso y usar el código fuente de C# provisto, puede cargar fácilmente un documento PDF, buscar fragmentos de texto específicos y crear anotaciones tachadas para marcar y tachar visualmente esas palabras. Aspose.PDF para .NET ofrece una forma sencilla y eficaz de manipular documentos PDF mediante programación, lo que la convierte en una herramienta valiosa para los desarrolladores que trabajan con archivos PDF en aplicaciones .NET.

### Preguntas frecuentes

#### P: ¿Qué es Aspose.PDF para .NET?

R: Aspose.PDF para .NET es una potente biblioteca que permite a los desarrolladores crear, editar y manipular documentos PDF mediante programación en aplicaciones .NET. Proporciona una amplia gama de funciones para trabajar con archivos PDF, incluida la extracción de texto, el manejo de anotaciones, el llenado de formularios y mucho más.

#### P: ¿Puedo usar Aspose.PDF para .NET para tachar palabras específicas en un documento PDF?

R: Sí, Aspose.PDF para .NET proporciona funcionalidad para buscar fragmentos de texto específicos en un documento PDF y luego crear anotaciones tachadas para marcar y tachar visualmente esas palabras.

#### P: ¿Cómo especifico el texto que quiero tachar en el documento PDF?

 R: Para especificar el texto que desea tachar, puede usar el`TextFragmentAbsorber` clase proporcionada por Aspose.PDF para .NET. Le permite buscar un fragmento de texto específico en el documento PDF según los criterios que desee.

#### P: ¿Puedo personalizar la apariencia de la anotación tachada?

R: Sí, puede personalizar varias propiedades de la anotación tachada, como la opacidad, el estilo del borde y el color. Esto le permite adaptar la apariencia de la anotación tachada a sus requisitos específicos.