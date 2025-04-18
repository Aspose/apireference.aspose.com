---
title: PdfFileEditor.TryInsert
second_title: Aspose.PDF for .NET API Reference
description: Método PdfFileEditor. Inserta páginas de otro archivo en el archivo Pdf de entrada
type: docs
weight: 420
url: /es/net/aspose.pdf.facades/pdffileeditor/tryinsert/
---
## TryInsert(string, int, string, int[], string) {#tryinsert_1}

Inserta páginas de otro archivo en el archivo Pdf de entrada.

```csharp
public bool TryInsert(string inputFile, int insertLocation, string portFile, int[] pageNumber, 
    string outputFile)
```

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| inputFile | String | Archivo Pdf de entrada. |
| insertLocation | Int32 | Posición de inserción en el archivo de entrada. |
| portFile | String | Páginas del archivo Pdf. |
| pageNumber | Int32[] | El número de página del archivo portado en portFile. |
| outputFile | String | Archivo Pdf de salida. |

### Valor de Retorno

Verdadero si tiene éxito, o falso.

## Observaciones

El método TryInsert es como el método Insert, excepto que el método TryInsert no lanza una excepción si la operación falla.

## Ejemplos

```csharp
PdfFileEditor pfe = new PdfFileEditor();
bool result = pfe.TryInsert("file1.pdf", 1, "file2.pdf", new int[] { 2, 6 }, "out.pdf");
```

### Ver También

* clase [PdfFileEditor](../)
* espacio de nombres [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* ensamblado [Aspose.PDF](../../../)

---

## TryInsert(Stream, int, Stream, int[], Stream) {#tryinsert}

Inserta páginas de otro archivo en el archivo Pdf de entrada.

```csharp
public bool TryInsert(Stream inputStream, int insertLocation, Stream portStream, int[] pageNumber, 
    Stream outputStream)
```

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| inputStream | Stream | Flujo de entrada del archivo Pdf. |
| insertLocation | Int32 | Posición de inserción en el archivo de entrada. |
| portStream | Stream | Flujo del archivo Pdf para las páginas. |
| pageNumber | Int32[] | El número de página del archivo portado en portFile. |
| outputStream | Stream | Flujo de salida. |

### Valor de Retorno

verdadero si la operación se completó con éxito; de lo contrario, falso.

## Observaciones

El método TryInsert es como el método Insert, excepto que el método TryInsert no lanza una excepción si la operación falla.

## Ejemplos

```csharp
PdfFileEditor pfe = new PdfFileEditor();
Stream sourceStream = new FileStream("file1.pdf", FileMode.Open, FileAccess.Read);
Stream insertedStream = new FileStream("file2.pdf", FileMode.Open, FileAccess.Read);
Stream outStream = new FileStream("out.pdf", FileMode.Create, FileAccess.Write);
bool result = pfe.TryInsert(sourceStream, 1, insertedStream, new int[] { 3, 4, 5}, outStream);
```

### Ver También

* clase [PdfFileEditor](../)
* espacio de nombres [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* ensamblado [Aspose.PDF](../../../)


## TryInsert(string, int, string, int[], HttpResponse) {#tryinsert_3}

Inserta el contenido del archivo en el archivo fuente y almacena el resultado en el objeto HttpResponse.

```csharp
public bool TryInsert(string inputFile, int insertLocation, string portFile, int[] pageNumber, 
    HttpResponse response)
```

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| inputFile | String | Nombre del archivo fuente. |
| insertLocation | Int32 | Número de página donde se insertará el segundo archivo. |
| portFile | String | Ruta al archivo que se insertará. |
| pageNumber | Int32[] | Array de números de página en el archivo fuente que se insertarán. |
| response | HttpResponse | Objeto de respuesta donde se almacenará el resultado. |

### Valor de Retorno

verdadero si la operación se completó con éxito; de lo contrario, falso.

## Observaciones

El método TryInsert es como el método Insert, excepto que el método TryInsert no lanza una excepción si la operación falla.

### Ver También

* clase [PdfFileEditor](../)
* espacio de nombres [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* ensamblado [Aspose.PDF](../../../)

---

## TryInsert(Stream, int, Stream, int[], HttpResponse) {#tryinsert_1}

Inserta un documento en otro documento y almacena el resultado en el objeto de respuesta.

```csharp
public bool TryInsert(Stream inputStream, int insertLocation, Stream portStream, int[] pageNumber, 
    HttpResponse response)
```

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| inputStream | Stream | Flujo con el documento fuente |
| insertLocation | Int32 | Ubicación donde se insertará el otro documento. |
| portStream | Stream | Documento que se insertará. |
| pageNumber | Int32[] | Array de números de página en el segundo documento que se insertarán. |
| response | HttpResponse | Objeto de respuesta donde se almacenará el resultado. |

### Valor de Retorno

verdadero si la operación se completó con éxito; de lo contrario, falso.

## Observaciones

El método TryInsert es como el método Insert, excepto que el método TryInsert no lanza una excepción si la operación falla.

### Ver También

* clase [PdfFileEditor](../)
* espacio de nombres [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* ensamblado [Aspose.PDF](../../../)