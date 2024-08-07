---
title: Tabla en la sección de encabezado y pie de página
linktitle: Tabla en la sección de encabezado y pie de página
second_title: Referencia de API de Aspose.PDF para .NET
description: Aprenda a agregar una tabla en la sección de encabezado/pie de página de un documento PDF con Aspose.PDF para .NET.
type: docs
weight: 170
url: /es/net/programming-with-stamps-and-watermarks/table-in-header-footer-section/
---
En este tutorial, lo guiaremos paso a paso sobre cómo agregar una tabla en la sección de encabezado o pie de página de un documento PDF utilizando Aspose.PDF para .NET. El código fuente de C# proporcionado le muestra cómo crear un documento PDF vacío, agregar una página, configurar la sección de encabezado, crear una tabla, agregar filas y celdas a la tabla y, finalmente, guardar el documento PDF.

## Paso 1: Configuración del entorno

Antes de comenzar, asegúrese de tener lo siguiente:

- Un entorno de desarrollo .NET instalado.
- La biblioteca Aspose.PDF para .NET descargada y referenciada en su proyecto.

## Paso 2: Crear el documento PDF y la página

 El primer paso es crear una instancia del`Document` class y agregue una página al documento. Así es cómo:

```csharp
// La ruta al directorio de documentos.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Crear una instancia de un objeto de documento
Aspose.Pdf.Document pdfDocument = new Aspose.Pdf.Document();

// Crear una página en el documento PDF
Aspose.Pdf.Page page = pdfDocument.Pages.Add();
```

Asegúrese de reemplazar "SU DIRECTORIO DE DOCUMENTOS" con la ruta real al directorio donde desea guardar el documento PDF.

## Paso 3: Configuración de la sección de encabezado

 Ahora configuraremos la sección de encabezado del documento PDF creando una instancia del`HeaderFooter` clase. Así es cómo:

```csharp
// Crear una sección de encabezado para el archivo PDF
Aspose.Pdf.HeaderFooter header = new Aspose.Pdf.HeaderFooter();

// Definir la sección de encabezado de la página.
page. Header = header;

//Establecer el margen superior de la sección del encabezado
header. Margin. Top = 20;
```

## Paso 4: Crear la tabla

 Ahora vamos a crear una tabla usando el`Table` class y agréguelo a la colección de párrafos de la sección de encabezado. Así es cómo:

```csharp
// Crear una instancia de un objeto de tabla
Aspose.Pdf.Table tab1 = new Aspose.Pdf.Table();

// Agregue la tabla a la colección de párrafos de la sección de encabezado
header.Paragraphs.Add(tab1);

// Definir los anchos de las columnas de la tabla.
tab1.ColumnWidths = "60,300";
```

El código anterior crea una tabla con dos columnas de anchos específicos.

## Paso 5: agregue filas y celdas a la tabla

 Ahora agregaremos filas y celdas a la tabla usando el`Row` clase y el`Cell` clase. Así es cómo:

```csharp
// Crear una fila en la tabla y agregar celdas
Aspose.Pdf.Row row1 = tab1.Rows.Add();
row1.Cells.Add("Table in header section");
row1.BackgroundColor = Color.Gray;

// Combinar la primera celda de la primera fila
tab1.Rows[0].Cells[0].ColSpan = 2;
tab1.Rows[0].Cells[0].DefaultCellTextState.ForegroundColor = Color.Cyan;
tab1.Rows[0].Cells[0].DefaultCellTextState.Font = FontRepository.FindFont("Helvetica");

// Cree otra fila en la tabla y agregue una celda con una imagen
Aspose.Pdf.Row row2 = tab1.Rows.Add();
row2.BackgroundColor = Color.White;
Aspose.Pdf.Cell cell2 = row2.Cells.Add();
Aspose.Pdf.Image img = new Aspose.Pdf.Image();
img.File = dataDir + "aspose-logo.jpg";
img. FixWidth = 60;
cell2.Paragraphs.Add(img);
row2.Cells.Add("The logo is beautiful!");
row2.Cells[1].DefaultCellTextState.Font = FontRepository.FindFont("Helvetica");
row2.Cells[1].VerticalAlignment = Aspose.Pdf.VerticalAlignment.Center;
row2.Cells[1].Alignment = Aspose.Pdf.HorizontalAlignment.Center;
```

## Paso 6: Guardar el documento PDF

Una vez que se ha agregado la tabla a la sección de encabezado, podemos guardar el documento PDF. Así es cómo:

```csharp
//Guarde el archivo PDF
pdfDocument.Save(dataDir + "TableInHeaderFooterSection_out.pdf");
```

Asegúrese de reemplazar "SU DIRECTORIO DE DOCUMENTOS" con la ruta real al directorio donde desea guardar el documento PDF.

### Ejemplo de código fuente para la sección Table In Header Footer usando Aspose.PDF para .NET 
```csharp

// La ruta al directorio de documentos.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Crear una instancia de documento llamando al constructor vacío
Aspose.Pdf.Document pdfDocument = new Aspose.Pdf.Document();

//Crear una página en el documento pdf.
Aspose.Pdf.Page page = pdfDocument.Pages.Add();

// Crear una sección de encabezado del archivo PDF
Aspose.Pdf.HeaderFooter header = new Aspose.Pdf.HeaderFooter();

// Establecer el encabezado impar para el archivo PDF
page.Header = header;

// Establecer el margen superior para la sección del encabezado
header.Margin.Top = 20;

// Crear una instancia de un objeto de tabla
Aspose.Pdf.Table tab1 = new Aspose.Pdf.Table();

// Agregue la tabla en la colección de párrafos de la sección deseada
header.Paragraphs.Add(tab1);

// Establecer borde de celda predeterminado usando el objeto BorderInfo
tab1.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, 0.1F);

// Establecer con anchos de columna de la tabla
tab1.ColumnWidths = "60 300";
Aspose.Pdf.Image img = new Aspose.Pdf.Image();
img.File = dataDir + "aspose-logo.jpg";

// Crear filas en la tabla y luego celdas en las filas
Aspose.Pdf.Row row1 = tab1.Rows.Add();
row1.Cells.Add("Table in Header Section");
row1.BackgroundColor = Color.Gray;

// Establezca el valor de rango de fila para la primera fila como 2
tab1.Rows[0].Cells[0].ColSpan = 2;
tab1.Rows[0].Cells[0].DefaultCellTextState.ForegroundColor = Color.Cyan;
tab1.Rows[0].Cells[0].DefaultCellTextState.Font = FontRepository.FindFont("Helvetica");

// Crear filas en la tabla y luego celdas en las filas
Aspose.Pdf.Row row2 = tab1.Rows.Add();

// Establecer el color de fondo para Row2
row2.BackgroundColor = Color.White;

// Agregue la celda que contiene la imagen.
Aspose.Pdf.Cell cell2 = row2.Cells.Add();

// Establezca el ancho de la imagen en 60
img.FixWidth = 60;

// Agregar la imagen a la celda de la tabla
cell2.Paragraphs.Add(img);
row2.Cells.Add("Logo is looking fine !");
row2.Cells[1].DefaultCellTextState.Font = FontRepository.FindFont("Helvetica");

// Establecer la alineación vertical del texto como alineado al centro
row2.Cells[1].VerticalAlignment = Aspose.Pdf.VerticalAlignment.Center;
row2.Cells[1].Alignment = Aspose.Pdf.HorizontalAlignment.Center;

// Guarde el archivo PDF
pdfDocument.Save(dataDir + "TableInHeaderFooterSection_out.pdf");

```

## Conclusión

¡Felicidades! Ha aprendido a agregar una tabla en la sección de encabezado o pie de página de un documento PDF utilizando Aspose.PDF para .NET. Ahora puede personalizar sus encabezados y pies de página agregando tablas para mostrar información adicional en sus documentos PDF.

### Preguntas frecuentes sobre la tabla en la sección de pie de página del encabezado

#### P: ¿Cuál es el propósito de agregar una tabla en la sección de encabezado o pie de página de un documento PDF?

R: Agregar una tabla en la sección de encabezado o pie de página de un documento PDF le permite mostrar información estructurada y organizada, como títulos, subtítulos, logotipos o cualquier otro contenido que desee que aparezca uniformemente en cada página del documento.

#### P: ¿Cómo logra el código fuente de C# proporcionado agregar una tabla en la sección de encabezado o pie de página de un documento PDF?

R: El código demuestra el proceso de crear un documento PDF vacío, agregar una página, configurar la sección del encabezado, crear una tabla con filas y celdas y finalmente guardar el documento PDF. El resultado es una tabla que se muestra en la sección de encabezado del documento PDF.

#### P: ¿Puedo personalizar la apariencia de las celdas de la tabla, como los bordes, el color de fondo y el estilo del texto?

R: Sí, puede personalizar la apariencia de las celdas de la tabla configurando propiedades como bordes de celda, color de fondo, estilo de texto, fuente, tamaño de fuente y más.

#### P: ¿Cómo se agrega la tabla a la sección de encabezado del documento PDF?

R: El código agrega la tabla a la colección de párrafos de la sección de encabezado, lo que garantiza que la tabla se muestre en el encabezado de cada página.

#### P: ¿Puedo agregar más filas y celdas a la tabla según sea necesario?

 R: Absolutamente, puede agregar más filas y celdas a la tabla usando el`Rows.Add()` y`Cells.Add()` métodos. Esto le permite estructurar el contenido de la tabla como desee.

#### P: ¿Es posible ajustar el ancho de las columnas de la tabla?
 R: Sí, puede ajustar el ancho de las columnas de la tabla usando el`ColumnWidths` propiedad. Esto le permite controlar el diseño de la tabla.

#### P: ¿Cómo puedo distribuir celdas en varias columnas o filas dentro de la tabla?
 R: Para distribuir celdas en varias columnas, puede usar el`ColSpan`propiedad de la celda correspondiente. Del mismo modo, puede utilizar el`RowSpan` propiedad para abarcar celdas en varias filas.

#### P: ¿Qué sucede si deseo agregar una tabla a las secciones de encabezado y pie de página del documento PDF?

 R: Puede seguir un enfoque similar para las secciones de encabezado y pie de página. Simplemente cree un`HeaderFooter` instancia para el pie de página, configúrelo y agregue la tabla a su colección de párrafos.

#### P: ¿Puedo usar imágenes dentro de las celdas de la tabla y cómo se logra eso?

 R: Sí, puede agregar imágenes dentro de las celdas de la tabla. El ejemplo de código muestra cómo agregar una imagen a una celda mediante la creación de un`Image` objeto, configurando su ruta de archivo y dimensiones, y luego agregándolo a los párrafos de una celda.

#### P: ¿Cómo me aseguro de que la tabla aparezca uniformemente en todas las páginas del documento PDF?

 R: Cuando agrega la tabla a la sección de encabezado o pie de página usando el`HeaderFooter` Por ejemplo, Aspose.PDF garantiza que la tabla aparezca de forma coherente en cada página, proporcionando un diseño uniforme.