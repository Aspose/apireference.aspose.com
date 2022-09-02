---
title: PageWatermarkTransparency
second_title: Aspose.Page for Java API Reference
description: Specifies the transparency for the watermark.
type: docs
weight: 138
url: /java/com.aspose.xps.metadata/pagewatermarktransparency/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.IntegerParameterInit](../../com.aspose.xps.metadata/integerparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageWatermarkTransparency extends IntegerParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Specifies the transparency for the watermark. Fully opaque would have a value of 0. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktransparency
## Constructors

| Constructor | Description |
| --- | --- |
| [PageWatermarkTransparency(int value)](#PageWatermarkTransparency-int-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getMinValue()](#getMinValue--) | For integer- or decimal-valued parameters, defines the smallest allowed value. |
| [getMaxValue()](#getMaxValue--) | For integer- or decimal-valued parameters, defines the largest allowed value. |
### PageWatermarkTransparency(int value) {#PageWatermarkTransparency-int-}
```
public PageWatermarkTransparency(int value)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The parameter value. |

### getMinValue() {#getMinValue--}
```
public int getMinValue()
```


For integer- or decimal-valued parameters, defines the smallest allowed value.

**Returns:**
int
### getMaxValue() {#getMaxValue--}
```
public int getMaxValue()
```


For integer- or decimal-valued parameters, defines the largest allowed value.

**Returns:**
int
