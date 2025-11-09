---
title: Open
second_title: Aspose.Medical for .NET API Reference
description: Reads a DICOM file from a Pipe and returns the DicomFileaspose.medical.dicom/dicomfile.
type: docs
weight: 20
url: /net/aspose.medical.dicom/dicomfile/open/
---

## Open(Pipe, ReadDicomPipeOptions?, ITagDataReadingStrategy?) {#open}

Reads a DICOM file from a Pipe and returns the [`DicomFile`](../../dicomfile).

```csharp
public static DicomFile Open(Pipe pipe, ReadDicomPipeOptions? options = null, 
    ITagDataReadingStrategy? strategy = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pipe | Pipe | The pipe supplying DICOM bytes (its Reader is used). |
| options | ReadDicomPipeOptions | Pipe-read options (e.g., fallback encoding). |
| strategy | ITagDataReadingStrategy | Tag data access strategy (e.g., immediate, deferred, or selective large-value handling). |

### Return Value

The parsed [`DicomFile`](../../dicomfile).

### See Also

* record [ReadDicomPipeOptions](../../../aspose.medical.dicom.readers/readdicompipeoptions)
* interface [ITagDataReadingStrategy](../../../aspose.medical.dicom.readers/itagdatareadingstrategy)
* class [DicomFile](../../dicomfile)
* namespace [Aspose.Medical.Dicom](../../dicomfile)
* assembly [Aspose.Medical](../../../)

---

## Open(PipeReader, ReadDicomPipeOptions?, ITagDataReadingStrategy?) {#open_1}

Reads a DICOM file from a PipeReader and returns the [`DicomFile`](../../dicomfile).

```csharp
public static DicomFile Open(PipeReader pipeReader, ReadDicomPipeOptions? options = null, 
    ITagDataReadingStrategy? strategy = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pipeReader | PipeReader | The pipe reader supplying DICOM bytes. |
| options | ReadDicomPipeOptions | Pipe-read options (e.g., fallback encoding). |
| strategy | ITagDataReadingStrategy | Tag data access strategy (e.g., immediate, deferred, or selective large-value handling). |

### Return Value

The parsed [`DicomFile`](../../dicomfile).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Thrown when ReadLargeTagOnDemandStrategy is used (unsupported for pipe input). |

### See Also

* record [ReadDicomPipeOptions](../../../aspose.medical.dicom.readers/readdicompipeoptions)
* interface [ITagDataReadingStrategy](../../../aspose.medical.dicom.readers/itagdatareadingstrategy)
* class [DicomFile](../../dicomfile)
* namespace [Aspose.Medical.Dicom](../../dicomfile)
* assembly [Aspose.Medical](../../../)

---

## Open(Stream, ReadDicomStreamOptions?, ITagDataReadingStrategy?) {#open_2}

Reads a DICOM file from a Stream and returns the [`DicomFile`](../../dicomfile).

```csharp
public static DicomFile Open(Stream stream, ReadDicomStreamOptions? options = null, 
    ITagDataReadingStrategy? strategy = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream containing DICOM data. |
| options | ReadDicomStreamOptions | Stream-read options (fallback encoding, buffer tuning, etc.). |
| strategy | ITagDataReadingStrategy | Tag data access strategy (e.g., immediate, deferred, or selective large-value handling). |

### Return Value

The parsed [`DicomFile`](../../dicomfile).

### Exceptions

| exception | condition |
| --- | --- |
| [BadDicomFileException](../../../aspose.medical.dicom.errors/baddicomfileexception) | *stream* does not contain a valid DICOM file. |

### See Also

* record [ReadDicomStreamOptions](../../../aspose.medical.dicom.readers/readdicomstreamoptions)
* interface [ITagDataReadingStrategy](../../../aspose.medical.dicom.readers/itagdatareadingstrategy)
* class [DicomFile](../../dicomfile)
* namespace [Aspose.Medical.Dicom](../../dicomfile)
* assembly [Aspose.Medical](../../../)

---

## Open(string, ReadDicomFileOptions?, ITagDataReadingStrategy?) {#open_3}

Reads a DICOM file from a file path and returns the [`DicomFile`](../../dicomfile).

```csharp
public static DicomFile Open(string file, ReadDicomFileOptions? options = null, 
    ITagDataReadingStrategy? strategy = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| file | String | The path to the DICOM file. |
| options | ReadDicomFileOptions | File-read options (fallback encoding, buffer tuning, etc.). |
| strategy | ITagDataReadingStrategy | Tag data access strategy (e.g., immediate, deferred, or selective large-value handling). |

### Return Value

The parsed [`DicomFile`](../../dicomfile).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | *file* is `null` or whitespace. |
| FileNotFoundException | The file specified by *file* was not found. |
| [BadDicomFileException](../../../aspose.medical.dicom.errors/baddicomfileexception) | *file* is not a valid DICOM file. |

### See Also

* record [ReadDicomFileOptions](../../../aspose.medical.dicom.readers/readdicomfileoptions)
* interface [ITagDataReadingStrategy](../../../aspose.medical.dicom.readers/itagdatareadingstrategy)
* class [DicomFile](../../dicomfile)
* namespace [Aspose.Medical.Dicom](../../dicomfile)
* assembly [Aspose.Medical](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
