---
title: Class LoadOptions.ResourceLoadingResult
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.LoadOptionsResourceLoadingResult class. Result of custom loading of resource
type: docs
weight: 6290
url: /net/aspose.pdf/loadoptions.resourceloadingresult/
---
## LoadOptions.ResourceLoadingResult class

Result of custom loading of resource

```csharp
public class ResourceLoadingResult
```

## Constructors

| Name | Description |
| --- | --- |
| [ResourceLoadingResult](../../aspose.pdf/loadoptions.resourceloadingresult/.ctor)(byte[]) | Creates instance of loading result |

## Properties

| Name | Description |
| --- | --- |
| [Data](../../aspose.pdf/loadoptions.resourceloadingresult/data) { get; } | Bynary data that loaded with custom loader - it must be set after loading |

## Fields

| Name | Description |
| --- | --- |
| [EncodingIfKnown](../../aspose.pdf/loadoptions.resourceloadingresult/encodingifknown) | Sometimes encoding of resource is known after or during loading. In such case custom code can provide converter with that knowledge via this parameter. You can leave null in this parameter if encoding is unknown or does not matter. |
| [ExceptionOfLoadingIfAny](../../aspose.pdf/loadoptions.resourceloadingresult/exceptionofloadingifany) | Sometimes it's impossible to load requested resource for some reason. Unavailability of resource often does not lead to crash of conversiov and result document can be created anyway(but maybe in a bit worse quality, without images etc.). If exception occured during loading, just catch it and put in this parameter - sometimes that information is usefull for converter for rendering of result. |
| [LoadingCancelled](../../aspose.pdf/loadoptions.resourceloadingresult/loadingcancelled) | Sometimes for some reasons loading should not occure custom code. In such case please set this flag as True. In such case converter will try use internal default resource loader to get that result(as it behave in situation when custom strategy not supplied). |
| [MIMETypeIfKnown](../../aspose.pdf/loadoptions.resourceloadingresult/mimetypeifknown) | Sometimes knowledge about MIME type of loaded resource is usefull for converter You can provide MIME type(if it'd known after loading) in this parameter. Please leave parameter equal to null when MIME type unknown or it's not necessary to supply it. |

### See Also

* class [LoadOptions](../loadoptions/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


