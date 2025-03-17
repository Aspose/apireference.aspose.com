---
title: LanguageDetectionOutput
second_title: Aspose.OCR for Java API Reference
description: Languages detected in the image text
type: docs
weight: 21
url: /java/com.aspose.ocr/languagedetectionoutput/
---

**Inheritance:**
java.lang.Object
```
public class LanguageDetectionOutput
```

Languages detected in the image text.
## Fields

| Field | Description |
| --- | --- |
| [languages](#languages) | A ranked list of languages detected in the image text, ordered by likelihood. |
| [page](#page) | Page number. |
| [source](#source) | The full path to the file or URL, if any. |
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
