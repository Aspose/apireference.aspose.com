---
title: OCRTablePage
second_title: Aspose.OCR for Java API Reference
description: Represents structured table data for the entire OCR documents page
type: docs
weight: 18
url: /java/com.aspose.ocr.models/ocrtablepage/
---

**Inheritance:**
java.lang.Object
```
public class OCRTablePage
```

Represents structured table data for the entire OCR document's page.

This object aggregates all recognized tables across one processed page. Each page may contain one or more detected tables, represented as [OCRTable](../../com.aspose.ocr.models/ocrtable/) entries.
## Constructors

| Constructor | Description |
| --- | --- |
| [OCRTablePage()](#OCRTablePage) |  |
## Methods

| Method | Description |
| --- | --- |
| [getTables()](#getTables) |  |
### OCRTablePage() {#OCRTablePage}
```
public OCRTablePage()
```


### addTable(OCRTable table) {#addTable-com.aspose.ocr.models.OCRTable}
```
public void addTable(OCRTable table)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| table | [OCRTable](../../com.aspose.ocr.models/ocrtable/) |  |

### getTables() {#getTables}
```
public List<OCRTable> getTables()
```




**Returns:**
java.util.List<com.aspose.ocr.models.OCRTable>
