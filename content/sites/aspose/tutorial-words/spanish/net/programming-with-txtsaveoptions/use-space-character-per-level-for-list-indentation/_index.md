---
title: Use el carácter de espacio por nivel para la sangría de la lista
linktitle: Use el carácter de espacio por nivel para la sangría de la lista
second_title: Referencia de API de Aspose.Words para .NET
description: Guía paso a paso para usar un carácter de espacio por nivel para la sangría de lista en Aspose.Words para .NET. Cree documentos de Word bien estructurados con facilidad.
type: docs
weight: 10
url: /es/net/programming-with-txtsaveoptions/use-space-character-per-level-for-list-indentation/
---
Aspose.Words para .NET es una poderosa biblioteca para crear, editar y manipular documentos de Word en una aplicación C#. Entre las funcionalidades que ofrece Aspose.Words se encuentra la posibilidad de utilizar un carácter de espacio por nivel para la sangría de listas. En esta guía, le mostraremos cómo usar el código fuente C# de Aspose.Words para .NET para implementar esta funcionalidad.

## Comprender la biblioteca Aspose.Words

Antes de sumergirse en el código, es importante comprender la biblioteca Aspose.Words para .NET. Aspose.Words es una biblioteca popular que hace que trabajar con documentos de Word sea fácil y eficiente. Ofrece una amplia gama de funcionalidades para crear, modificar y manipular documentos de Word, incluida la gestión de listas y sangrado.

## Creación del documento y adición de contenido.

El primer paso es crear un nuevo documento y agregarle contenido. Utilice la clase Document para crear una nueva instancia de documento. Luego use la clase DocumentBuilder para agregar texto y crear una lista con múltiples niveles de sangría. Aquí hay un ejemplo :

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Crear una lista con tres niveles de sangría
builder.ListFormat.ApplyNumberDefault();
builder. Writen("Element 1");
builder.ListFormat.ListIndent();
builder. Writen("Element 2");
builder.ListFormat.ListIndent();
builder.Write("Element 3");
```

En este ejemplo, creamos un nuevo documento y usamos DocumentBuilder para agregar texto y crear una lista con tres niveles de sangría. Hemos agregado tres elementos a la lista, con cada elemento sangrado un nivel adicional.

## Uso de un carácter de espacio por nivel para la sangría de la lista

Una vez agregado el contenido, ya podemos configurar la sangría de las listas usando un carácter de espacio por nivel. Para esto usamos la clase TxtSaveOptions y establecemos la propiedad ListIndentation.Count al número de niveles de sangría y la propiedad ListIndentation.Character al carácter de espacio a usar. Así es cómo:

```csharp
TxtSaveOptions saveOptions = new TxtSaveOptions();
saveOptions.ListIndentation.Count = 3;
saveOptions.ListIndentation.Character = ' ';

doc.Save(dataDir + "WorkingWithTxtSaveOptions.UseSpaceCharacterPerLevelForListIndentation.txt", saveOptions);
```

En este ejemplo, creamos una instancia de TxtSaveOptions y establecemos la propiedad ListIndentation.Count en 3 para indicar que hay tres niveles de sangría en la lista. También establecemos la propiedad ListIndentation.Character en el carácter de espacio (' ') que queremos usar para la sangría.

### Ejemplo de código fuente para la función "Usar un carácter de espacio por nivel para sangría de lista" con Aspose.Words para .NET

Aquí está el código fuente de muestra completo para la función "Usar un carácter de espacio por nivel para sangría de lista" con Aspose.Words para .NET:

```csharp

using Aspose.Words;
using Aspose.Words.Saving;

namespace Example
{
     class Program
     {
         static void Main(string[] args)
         {
             // Ruta a su directorio de documentos
             string dataDir = "YOUR DOCUMENTS DIRECTORY";

             // Crear el documento y agregar contenido
             Document doc = new Document();
             DocumentBuilder builder = new DocumentBuilder(doc);

             // Crear una lista con tres niveles de sangría
             builder.ListFormat.ApplyNumberDefault();
             builder. Writen("Element 1");
             builder.ListFormat.ListIndent();
             builder. Writen("Element 2");
             builder.ListFormat.ListIndent();
             builder.Write("Element 3");

             // Use un carácter de espacio por nivel para la sangría de la lista
             TxtSaveOptions saveOptions = new TxtSaveOptions();
             saveOptions.ListIndentation.Count = 3;
             saveOptions.ListIndentation.Character = ' ';

             // Guarde el documento con las opciones especificadas
             doc.Save(dataDir + "WorkingWithTxtSaveOptions.UseSpaceCharacterPerLevelForListIndentation.txt", saveOptions);
         }
     }
}

```

## Conclusión

En esta guía, explicamos cómo usar Aspose.Words para .NET para aplicar la funcionalidad "Usar un carácter de espacio por nivel para sangría de lista". Siguiendo los pasos proporcionados y utilizando el código fuente de C# proporcionado, puede configurar fácilmente la sangría de las listas en sus documentos de Word utilizando un carácter de espacio por nivel. Aspose.Words ofrece una gran flexibilidad y potencia para trabajar con el formato de texto y la gestión de listas, lo que le permite crear documentos bien estructurados en su aplicación C#.