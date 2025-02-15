---
title: Obtener intervalo de páginas JPEG
linktitle: Obtener intervalo de páginas JPEG
second_title: Referencia de API de Aspose.Words para .NET
description: Aprenda a obtener una variedad de páginas JPEG con Aspose.Words para .NET. Tutorial completo para extraer imágenes personalizadas.
type: docs
weight: 10
url: /es/net/programming-with-imagesaveoptions/get-jpeg-page-range/
---

En este tutorial, exploraremos el código fuente de C# provisto para la función "Obtener rango de páginas JPEG" con Aspose.Words para .NET. Esta característica le permite convertir un rango específico de páginas de un documento en imágenes en formato JPEG.

## Paso 1: Configuración del entorno

Antes de comenzar, asegúrese de haber configurado su entorno de desarrollo con Aspose.Words para .NET. Asegúrese de haber agregado las referencias necesarias e importado los espacios de nombres apropiados.

## Paso 2: Cargar el documento

```csharp
// Ruta a su directorio de documentos
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Document doc = new Document(dataDir + "Rendering.docx");
```

 En este paso, cargamos el documento usando el`Document` método y pasando la ruta al archivo DOCX para cargar.

## Paso 3: Configure las opciones de copia de seguridad de imágenes

```csharp
ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Jpeg);
options. PageSet = new PageSet(0);
options. ImageBrightness = 0.3f;
options. ImageContrast = 0.7f;
options. HorizontalResolution = 72f;
```

 En este paso, configuramos las opciones de respaldo para las imágenes. Creamos un nuevo`ImageSaveOptions` objeto especificando el formato de guardado deseado, aquí "Jpeg" para el formato JPEG. También establecemos el rango de páginas para convertir usando el`PageSet`objeto. Finalmente, ajustamos el brillo y el contraste de la imagen usando el`ImageBrightness` y`ImageContrast` propiedades, respectivamente. También cambiamos la resolución horizontal usando el`HorizontalResolution` propiedad.

## Paso 4: Copia de seguridad de las imágenes

```csharp
doc.Save(dataDir + "WorkingWithImageSaveOptions.GetJpegPageRange.jpeg", options);
```

 En este último paso, guardamos las imágenes del rango de páginas especificado en formato JPEG usando el`Save` y pasando la ruta al archivo de salida, junto con las opciones de guardado especificadas.

Ahora puede ejecutar el código fuente para convertir un rango específico de páginas en su documento a imágenes JPEG. El archivo resultante se guardará en el directorio especificado con el nombre "WorkingWithImageSaveOptions.GetJpegPageRange.jpeg".

### Ejemplo de código fuente para Obtener rango de páginas Jpeg usando Aspose.Words para .NET

```csharp 
 // Ruta a su directorio de documentos
 string dataDir = "YOUR DOCUMENT DIRECTORY"; 

Document doc = new Document(dataDir + "Rendering.docx");

ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Jpeg);

// Establezca el "Conjunto de páginas" en "0" para convertir solo la primera página de un documento.
options.PageSet = new PageSet(0);

// Cambia el brillo y el contraste de la imagen.
// Ambos están en una escala de 0-1 y están en 0,5 por defecto.
options.ImageBrightness = 0.3f;
options.ImageContrast = 0.7f;

// Cambia la resolución horizontal.
// El valor predeterminado para estas propiedades es 96,0, para una resolución de 96 ppp.
options.HorizontalResolution = 72f;

doc.Save(dataDir + "WorkingWithImageSaveOptions.GetJpegPageRange.jpeg", options);
            
        
```

## Conclusión

En este tutorial, exploramos la funcionalidad de obtener un rango de páginas JPEG con Aspose.Words para .NET. Aprendimos cómo convertir un rango específico de páginas de un documento en imágenes en formato JPEG, mientras personalizamos las opciones de guardado.

Esta característica es útil cuando desea extraer páginas específicas de un documento y guardarlas como imágenes JPEG. También puede ajustar el brillo, el contraste y la resolución horizontal de las imágenes para lograr resultados personalizados.

Aspose.Words para .NET ofrece una amplia gama de funciones avanzadas para la manipulación y generación de documentos. Obtener un rango de páginas JPEG es una de las muchas herramientas poderosas que pone a su disposición.

Siéntase libre de integrar esta función en sus proyectos Aspose.Words para .NET para obtener imágenes JPEG de alta calidad de sus documentos.