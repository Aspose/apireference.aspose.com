---
title: SkipLargeTags
second_title: Aspose.Medical for .NET API Reference
description: Returns a reading strategy that skips loading of large DICOM tags to reduce memory usage.
type: docs
weight: 30
url: /net/aspose.medical.dicom.readers/tagdatareadingstrategies/skiplargetags/
---

## TagDataReadingStrategies.SkipLargeTags method

Returns a reading strategy that skips loading of large DICOM tags to reduce memory usage.

```csharp
public static ITagDataReadingStrategy SkipLargeTags(int largeObjectSizeKb = 0)
```

| Parameter | Type | Description |
| --- | --- | --- |
| largeObjectSizeKb | Int32 | The size threshold (in kilobytes) above which a tag is considered large and will be skipped (inclusive). Defaults to 64 kB if not specified. |

### Return Value

An instance of [`ITagDataReadingStrategy`](../../itagdatareadingstrategy) configured to load only non-large tag data.

### See Also

* interface [ITagDataReadingStrategy](../../itagdatareadingstrategy)
* class [TagDataReadingStrategies](../../tagdatareadingstrategies)
* namespace [Aspose.Medical.Dicom.Readers](../../tagdatareadingstrategies)
* assembly [Aspose.Medical](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Medical.dll -->
