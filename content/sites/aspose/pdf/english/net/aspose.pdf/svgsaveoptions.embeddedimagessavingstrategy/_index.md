---
title: Delegate SvgSaveOptions.EmbeddedImagesSavingStrategy
second_title: Aspose.PDF for .NET API Reference
description: To property of such type You can assign delegate created from custom method that implements processing of external saving of image that was extracted from SVG created from PDF and must be saved as external resource during conversion of PDF to HTML. In such case processing like selfmade saving into stream or on disk can be done in that custom code and that custom code must return pathor any another string without quotemarks that will be afterwards incorporated into generated SVG instead of original supposed path to that image resource. In such case all the necessary actions for saving of image must be undertaken in code of supplied method because saving of result in code of converter will be not in use. If processing for this or that file for some reason must be done by converters code itself not in custom code please set in custom code flag CustomProcessingCancelled of imageSavingInfo parameters variable It signals to converter that all the necessary steps for processing of that resource must be done in converter itself as if there was no any external custom code . represents information about saved image that can be use in custom code must return string that represents URL of image that will be put into SVG
type: docs
weight: 10420
url: /net/aspose.pdf/svgsaveoptions.embeddedimagessavingstrategy/
---
## SvgSaveOptions.EmbeddedImagesSavingStrategy delegate

To property of such type You can assign delegate created from custom method that implements processing of external saving of image that was extracted from SVG created from PDF and must be saved as external resource during conversion of PDF to HTML. In such case processing (like self-made saving into stream or on disk) can be done in that custom code and that custom code must return path(or any another string without quotemarks) that will be afterwards incorporated into generated SVG instead of original supposed path to that image resource. In such case all the necessary actions for saving of image must be undertaken in code of supplied method, because saving of result in code of converter will be not in use. If processing for this or that file for some reason must be done by converter's code itself, not in custom code, please set in custom code flag 'CustomProcessingCancelled' of 'imageSavingInfo' parameter's variable It signals to converter that all the necessary steps for processing of that resource must be done in converter itself as if there was no any external custom code . represents information about saved image that can be use in custom code must return string that represents URL of image that will be put into SVG

```csharp
public delegate string EmbeddedImagesSavingStrategy(SvgImageSavingInfo imageSavingInfo);
```

### See Also

* class [SvgImageSavingInfo](../svgsaveoptions.svgimagesavinginfo/)
* class [SvgSaveOptions](../svgsaveoptions/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


