---
title: DocTypeOutput
second_title: Aspose.OCR for Java API Reference
description: Represents the document type detection result for a single input item
type: docs
weight: 14
url: /java/com.aspose.ocr/doctypeoutput/
---

**Inheritance:**
java.lang.Object
```
public class DocTypeOutput
```

Represents the document type detection result for a single input item.
## Constructors

| Constructor | Description |
| --- | --- |
| [DocTypeOutput()](#DocTypeOutput) |  |
## Fields

| Field | Description |
| --- | --- |
| [confidence](#confidence) | Confidence score in the range from 0.0 to 1.0. |
| [docType](#docType) | Detected document category. |
| [page](#page) | Zero-based page index. |
| [source](#source) | Input source identifier (file path or URL when available). |

### DocTypeOutput() {#DocTypeOutput}
```
public DocTypeOutput()
```


### confidence {#confidence}
```
public float confidence
```


Confidence score in the range from 0.0 to 1.0.

### docType {#docType}
```
public DocType docType
```


Detected document category.

### page {#page}
```
public int page
```


Zero-based page index.

### source {#source}
```
public String source
```


Input source identifier (file path or URL when available). Empty for in-memory inputs.