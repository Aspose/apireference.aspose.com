---
title: PageDestinationColorProfileURI
second_title: Aspose.Page for Java API Reference
description: Specifies a relative URI reference to an ICC profile contained in an XPS Document.
type: docs
weight: 93
url: /java/com.aspose.xps.metadata/pagedestinationcolorprofileuri/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageDestinationColorProfileURI extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Specifies a relative URI reference to an ICC profile contained in an XPS Document. The processing of this option depends of the setting of the PageDeviceColorSpaceUsage feature. All elements using that profile are assumed to be already in the appropriate device color space, and will not be color managed in the driver or device. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofileuri
## Constructors

| Constructor | Description |
| --- | --- |
| [PageDestinationColorProfileURI(String value)](#PageDestinationColorProfileURI-java.lang.String-) | Creates a new instance. |
### PageDestinationColorProfileURI(String value) {#PageDestinationColorProfileURI-java.lang.String-}
```
public PageDestinationColorProfileURI(String value)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The parameter value. |

