---
title: LanguageDetectionOutput
second_title: Aspose.OCR for Java API Reference
description: Languages detected in the image text
type: docs
weight: 14
url: /java/com.aspose.ocr.models/languagedetectionoutput/
---

**Inheritance:**
java.lang.Object
```
public class LanguageDetectionOutput
```

Languages detected in the image text.
## Constructors

| Constructor | Description |
| --- | --- |
| [LanguageDetectionOutput(String _source, List<Map.Entry<Language,Float>> _languages, int _page)](#LanguageDetectionOutput-java.lang.String-java.util.List-java.util.Map.Entry-com.aspose.ocr.models.Language-java.lang.Float---int) |  |
## Fields

| Field | Description |
| --- | --- |
| [languages](#languages) | A ranked list of languages detected in the image text, ordered by likelihood. |
| [page](#page) | Page number. |
| [source](#source) | The full path to the file or URL, if any. |

### LanguageDetectionOutput(String _source, List<Map.Entry<Language,Float>> _languages, int _page) {#LanguageDetectionOutput-java.lang.String-java.util.List-java.util.Map.Entry-com.aspose.ocr.models.Language-java.lang.Float---int}
```
public LanguageDetectionOutput(String _source, List<Map.Entry<Language,Float>> _languages, int _page)
```


**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| _source | java.lang.String |  |
| _languages | java.util.List<java.util.Map.Entry<com.aspose.ocr.models.Language,java.lang.Float>> |  |
| _page | int |  |

### languages {#languages}
```
public List<Map.Entry<Language,Float>> languages
```


A ranked list of languages detected in the image text, ordered by likelihood.

### page {#page}
```
public int page
```


Page number.

### source {#source}
```
public String source
```


The full path to the file or URL, if any. Empty for streams, byte arrays, base64.

