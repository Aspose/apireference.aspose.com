---
title: PageBlackGenerationProcessingUnderColorAdditionLevel
second_title: Aspose.Page for Java API Reference
description: Describes the amount chromatic ink in gray component ratios to add to areas where GCR/UCR has generated BlackInkLimit or UCAStart if specified in the dark neutrals and near-neutral areas.
type: docs
weight: 84
url: /java/com.aspose.xps.metadata/pageblackgenerationprocessingundercoloradditionlevel/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.IntegerParameterInit](../../com.aspose.xps.metadata/integerparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageBlackGenerationProcessingUnderColorAdditionLevel extends IntegerParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Describes the amount chromatic ink (in gray component ratios) to add to areas where GCR/UCR has generated "BlackInkLimit" (or UCAStart, if specified) in the dark neutrals and near-neutral areas. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessingundercoloradditionlevel
## Constructors

| Constructor | Description |
| --- | --- |
| [PageBlackGenerationProcessingUnderColorAdditionLevel(int value)](#PageBlackGenerationProcessingUnderColorAdditionLevel-int-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getMinValue()](#getMinValue--) | For integer- or decimal-valued parameters, defines the smallest allowed value. |
| [getMaxValue()](#getMaxValue--) | For integer- or decimal-valued parameters, defines the largest allowed value. |
### PageBlackGenerationProcessingUnderColorAdditionLevel(int value) {#PageBlackGenerationProcessingUnderColorAdditionLevel-int-}
```
public PageBlackGenerationProcessingUnderColorAdditionLevel(int value)
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
