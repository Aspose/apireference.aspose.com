---
title: PdfFileEditor.MakeNUp
second_title: Aspose.PDF for .NET API Reference
description: PdfFileEditor method. Makes NUp document from the two input PDF streams to outputStream
type: docs
weight: 310
url: /net/aspose.pdf.facades/pdffileeditor/makenup/
---
## MakeNUp(Stream, Stream, Stream) {#makenup_2}

Makes N-Up document from the two input PDF streams to outputStream.

```csharp
public bool MakeNUp(Stream firstInputStream, Stream secondInputStream, Stream outputStream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| firstInputStream | Stream | first input stream. |
| secondInputStream | Stream | second input stream. |
| outputStream | Stream | Output pdf stream. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
Stream input1 = new FileStream("input1.pdf", FileMode.Open, FileAccess.Read);
Stream input2 = new FileStream("input2.pdf", FileMode.Open, FileAccess.Read);
Stream output = new FileStream("output.pdf");
pfe.MakeNUp(input1, input2, output);
```

### See Also

* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(string[], string, bool) {#makenup_7}

Makes N-Up document from the multi input PDF files to outputFile. Each page of outputFile will contain multi pages, which are combination with pages in the input files of the same page number. The multi pages piled up horizontally if isSidewise is true and piled up vertically if isSidewise is false.

```csharp
public bool MakeNUp(string[] inputFiles, string outputFile, bool isSidewise)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputFiles | String[] | Input Pdf files. |
| outputFile | String | Output pdf file path and name. |
| isSidewise | Boolean | Piled up way, true for horizontally and false for vertically. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
pfe.MakeNUp(new string[] { "input1.pdf", "input2.pdf", "input3.pdf" }, "output.pdf", false);
```

### See Also

* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(Stream[], Stream, bool) {#makenup_3}

Makes N-Up document from the multi input PDF streams to outputStream. Each page of outputStream will contain multi pages, which are combination with pages in the input streams of the same page number. The multi-pages piled up horizontally if isSidewise is true and piled up vertically if isSidewise is false.

```csharp
public bool MakeNUp(Stream[] inputStreams, Stream outputStream, bool isSidewise)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputStreams | Stream[] | Input Pdf streams. |
| outputStream | Stream | Output pdf stream. |
| isSidewise | Boolean | Piled up way, true for horizontally and false for vertically. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
Stream stream1 = new FileStream("input1.pdf", FileMode.Open, FileAccess.Read);
Stream stream2 = new FileStream("input2.pdf", FileMode.Open, FileAccess.Read);
Stream stream3 = new FileStream("input3.pdf", FileMode.Open, FileAccess.Read);
Stream output = new FileStream("output.pdf", FileMode.Create, FileAccess.Write);
pfe.MakeNUp(new Stream[] { stream1, stream2, stream3 }, output, false);
```

### See Also

* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(string, string, int, int, PageSize) {#makenup_5}

Makes N-Up document from the input file to outputFile.

```csharp
public bool MakeNUp(string inputFile, string outputFile, int x, int y, PageSize pageSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputFile | String | Input pdf file path and name. |
| outputFile | String | Output pdf file path and name. |
| x | Int32 | Number of columns. |
| y | Int32 | Number of rows. |
| pageSize | PageSize | The page size of the output pdf file. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
pfe.MakeNUp("input.pdf", "output.pdf", 3, 3, PageSize.A4);
```

### See Also

* class [PageSize](../../../aspose.pdf/pagesize/)
* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(string, string, int, int) {#makenup_4}

Makes N-Up document from the firstInputFile to outputFile.

```csharp
public bool MakeNUp(string inputFile, string outputFile, int x, int y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputFile | String | Input pdf file path and name. |
| outputFile | String | Output pdf file path and name. |
| x | Int32 | Number of columns. |
| y | Int32 | Number of rows. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
pfe.MakeNUp("input.pdf", "output.pdf", 3, 3);
```

### See Also

* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(Stream, Stream, int, int) {#makenup}

Makes N-Up document from the input stream and saves result into output stream.

```csharp
public bool MakeNUp(Stream inputStream, Stream outputStream, int x, int y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputStream | Stream | Input pdf stream. |
| outputStream | Stream | Output pdf stream. |
| x | Int32 | Number of columns. |
| y | Int32 | Number of rows. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
Stream inputStream = new FileStream("input.pdf", FileMode.Open, FileAccess.Read);
Stream outputStream = new FileStream("output.pdf", FileMode.Create, FileAccess.Write);
pfe.MakeNUp(inputStream, outputStream, 3, 3);
```

### See Also

* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(Stream, Stream, int, int, PageSize) {#makenup_1}

Makes N-Up document from the first input stream to output stream.

```csharp
public bool MakeNUp(Stream inputStream, Stream outputStream, int x, int y, PageSize pageSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| inputStream | Stream | Input pdf stream. |
| outputStream | Stream | Output pdf stream. |
| x | Int32 | Number of columns. |
| y | Int32 | Number of rows. |
| pageSize | PageSize | The page size of the output pdf file. |

### Return Value

True if operation was succeeded.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
Stream inputStream = new FileStream("input.pdf", FileMode.Open, FileAccess.Read);
Stream outputStream = new FileStream("output.pdf", FileMode.Create, FileAccess.Write);
pfe.MakeNUp(inputStream, outputStream, 3, 3, PageSize.A4);
```

### See Also

* class [PageSize](../../../aspose.pdf/pagesize/)
* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## MakeNUp(string, string, string) {#makenup_6}

Makes N-Up document from the two input PDF files to outputFile. Each page of outputFile will contain two pages, one page is from the first input file and another is from the second input file. The two pages are piled up horizontally.

```csharp
public bool MakeNUp(string firstInputFile, string secondInputFile, string outputFile)
```

| Parameter | Type | Description |
| --- | --- | --- |
| firstInputFile | String | first input file. |
| secondInputFile | String | second input file. |
| outputFile | String | Output pdf file path and name. |

### Return Value

boolean - True for success, or false.

## Examples

```csharp
PdfFileEditor pfe = new PdfFileEditor();
pfe.MakeNUp("input1.pdf", "input2.pdf", "output.pdf");
```

### See Also

* class [PdfFileEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)


