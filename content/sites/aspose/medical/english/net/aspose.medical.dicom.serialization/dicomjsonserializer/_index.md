---
title: DicomJsonSerializer
second_title: Aspose.Medical for .NET API Reference
description: Provides functionality to serialize DICOM objects to JSON and to deserialize JSON into DICOM objects.
type: docs
weight: 1030
url: /net/aspose.medical.dicom.serialization/dicomjsonserializer/
---

## DicomJsonSerializer class

Provides functionality to serialize DICOM objects to JSON and to deserialize JSON into DICOM objects.

```csharp
public static class DicomJsonSerializer
```

## Methods

| Name | Description |
| --- | --- |
| static [Deserialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserialize#deserialize_1)(ReadOnlySpan&lt;char&gt;, DicomJsonSerializerOptions, bool) | Parses the text representing a single JSON value into an instance of the [`Dataset`](../../aspose.medical.dicom/dataset). |
| static [Deserialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserialize#deserialize)(Stream, DicomJsonSerializerOptions, bool) | Reads the UTF-8 encoded text representing a single JSON value into a [`Dataset`](../../aspose.medical.dicom/dataset). |
| static [DeserializeAsync](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializeasync)(Stream, DicomJsonSerializerOptions?, bool) | Asynchronously reads the UTF-8 encoded text representing a single JSON value into a [`Dataset`](../../aspose.medical.dicom/dataset). |
| static [DeserializeFile](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializefile#deserializefile_1)(ReadOnlySpan&lt;char&gt;, DicomJsonSerializerOptions, bool) | Parses the text representing a single JSON value into an instance of the [`DicomFile`](../../aspose.medical.dicom/dicomfile). |
| static [DeserializeFile](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializefile#deserializefile)(Stream, DicomJsonSerializerOptions, bool) | Reads the UTF-8 encoded text representing a single JSON value into a [`DicomFile`](../../aspose.medical.dicom/dicomfile). |
| static [DeserializeFileAsync](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializefileasync)(Stream, DicomJsonSerializerOptions?, bool) | Asynchronously reads the UTF-8 encoded text representing a single JSON value into a [`DicomFile`](../../aspose.medical.dicom/dicomfile). |
| static [DeserializeList](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializelist#deserializelist_1)(ReadOnlySpan&lt;char&gt;, DicomJsonSerializerOptions?, bool) | Parses the text representing a single JSON value into a collection of the [`Dataset`](../../aspose.medical.dicom/dataset). |
| static [DeserializeList](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializelist#deserializelist)(Stream, DicomJsonSerializerOptions?, bool) | Reads the UTF-8 encoded text representing a JSON value into a collection of the [`Dataset`](../../aspose.medical.dicom/dataset). |
| static [DeserializeListAsync](../../aspose.medical.dicom.serialization/dicomjsonserializer/deserializelistasync)(Stream, DicomJsonSerializerOptions?, bool) | Asynchronously reads the UTF-8 encoded text representing a JSON value into a collection of the [`Dataset`](../../aspose.medical.dicom/dataset). |
| static [Serialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/serialize#serialize)(Dataset, DicomJsonSerializerOptions?, bool) | Converts a [`Dataset`](../../aspose.medical.dicom/dataset) to JSON. |
| static [Serialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/serialize#serialize_1)(Dataset[], DicomJsonSerializerOptions?, bool) | Converts a collection of the [`Dataset`](../../aspose.medical.dicom/dataset) to JSON. |
| static [Serialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/serialize#serialize_2)(DicomFile, DicomJsonSerializerOptions?, bool) | Converts a [`DicomFile`](../../aspose.medical.dicom/dicomfile) to JSON. |
| static [Serialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/serialize#serialize_3)(Stream, Dataset, DicomJsonSerializerOptions?, bool) | Converts a [`Dataset`](../../aspose.medical.dicom/dataset) to JSON. |
| static [Serialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/serialize#serialize_4)(Stream, Dataset[], DicomJsonSerializerOptions?, bool) | Converts a collection of the [`Dataset`](../../aspose.medical.dicom/dataset) to UTF-8 JSON. |
| static [Serialize](../../aspose.medical.dicom.serialization/dicomjsonserializer/serialize#serialize_5)(Stream, DicomFile, DicomJsonSerializerOptions?, bool) | Converts a [`DicomFile`](../../aspose.medical.dicom/dicomfile) to JSON. |
| static [SerializeAsync](../../aspose.medical.dicom.serialization/dicomjsonserializer/serializeasync#serializeasync)(Stream, Dataset, DicomJsonSerializerOptions?, bool) | Asynchronously converts a [`Dataset`](../../aspose.medical.dicom/dataset) to JSON. |
| static [SerializeAsync](../../aspose.medical.dicom.serialization/dicomjsonserializer/serializeasync#serializeasync_1)(Stream, Dataset[], DicomJsonSerializerOptions?, bool) | Asynchronously converts a collection of the [`Dataset`](../../aspose.medical.dicom/dataset) to UTF-8 JSON. |
| static [SerializeAsync](../../aspose.medical.dicom.serialization/dicomjsonserializer/serializeasync#serializeasync_2)(Stream, DicomFile, DicomJsonSerializerOptions?, bool) | Asynchronously converts a [`DicomFile`](../../aspose.medical.dicom/dicomfile) to JSON. |

### See Also

* namespace [Aspose.Medical.Dicom.Serialization](../../aspose.medical.dicom.serialization)
* assembly [Aspose.Medical](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
