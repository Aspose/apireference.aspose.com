---
title: Class MhtSaveOptions
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.MhtSaveOptions class. Allows to specify additional options when saving MailMessage to Mhtml format
type: docs
weight: 19340
url: /net/aspose.email/mhtsaveoptions/
---
## MhtSaveOptions class

Allows to specify additional options when saving MailMessage to Mhtml format.

```csharp
public class MhtSaveOptions : HeadersFormattingOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [MhtSaveOptions](mhtsaveoptions/)() | Initializes a new instance of this class that can be used to save a MailMessage in the Mhtml format. |

## Properties

| Name | Description |
| --- | --- |
| [AfterHeadersFormat](../../aspose.email/headersformattingoptions/afterheadersformat/) { get; set; } | After headers format. |
| [BeforeHeadersFormat](../../aspose.email/headersformattingoptions/beforeheadersformat/) { get; set; } | Before headers format. |
| [CheckBodyContentEncoding](../../aspose.email/mhtsaveoptions/checkbodycontentencoding/) { get; set; } | Defines whether need check message body content encoding when saving. By default the value is false. |
| [CssStyles](../../aspose.email/headersformattingoptions/cssstyles/) { get; set; } | Gets or sets the additional css styles for the formatter. |
| [CustomProgressHandler](../../aspose.email/saveoptions/customprogresshandler/) { get; set; } | Represents method that usually supplied by calling side and handles progress events. |
| [DefaultHeaderFormat](../../aspose.email/headersformattingoptions/defaultheaderformat/) { get; set; } | Default header line format. |
| [DefaultPageHeaderFormat](../../aspose.email/headersformattingoptions/defaultpageheaderformat/) { get; set; } | Default page header format. |
| [FormatTemplates](../../aspose.email/headersformattingoptions/formattemplates/) { get; } | Gets the format templates. |
| [MailMessageSaveType](../../aspose.email/saveoptions/mailmessagesavetype/) { get; set; } | Represents the mail message save type.It can be in eml,msg(ASCII or Unicode),mhtml or html format. The default value is Eml. |
| [MhtFormatOptions](../../aspose.email/mhtsaveoptions/mhtformatoptions/) { get; set; } | Defines additional options when saving in MHTML format. Default value is MhtFormatOptions.WriteHeader &#x7C; MhtFormatOptions.WriteOutlineAttachments. |
| [PreserveOriginalBoundaries](../../aspose.email/mhtsaveoptions/preserveoriginalboundaries/) { get; set; } | Defines whether need keep original boundaries in mail message when saving or not. |
| [PreserveOriginalDate](../../aspose.email/mhtsaveoptions/preserveoriginaldate/) { get; set; } | Defines whether need keep original date in mail message when saving or not. Default value is true. |
| [RenderedContactFields](../../aspose.email/headersformattingoptions/renderedcontactfields/) { get; set; } | Defines groups of Contact fields which will be included in output mhtml. Default value is ContactFieldsSet.AllExisting. |
| [RenderingHeaders](../../aspose.email/headersformattingoptions/renderingheaders/) { get; } | Gets list of headers for rendering. |
| [SaveAllHeaders](../../aspose.email/mhtsaveoptions/saveallheaders/) { get; set; } | Defines whether need to save all headers in output mhtml or not. Default value is false. |
| [SaveAttachments](../../aspose.email/mhtsaveoptions/saveattachments/) { get; set; } | Gets or sets a value indicating whether to save attachments. |
| [SavedHeaders](../../aspose.email/mhtsaveoptions/savedheaders/) { get; } | Gets list of headers which will be present in saved mhtml content. Default value is empty list. |
| [SkipInlineImages](../../aspose.email/mhtsaveoptions/skipinlineimages/) { get; set; } | Defines whether skip references on images at saving in mhtml or not. Default value is false. |
| [Timeout](../../aspose.email/headersformattingoptions/timeout/) { get; set; } | Limits the time in milliseconds of formatting message while saving in Mht. Default value 3 sec. |

## Events

| Name | Description |
| --- | --- |
| event [TimeoutReached](../../aspose.email/headersformattingoptions/timeoutreached/) | Raised if timed out while saving to Mhtml. |

## Examples

The following example shows how to save MailMessage as MHTML.

[C#]

```csharp
var eml = MailMessage.Load("Message.eml");
eml.Save("target.mthml", SaveOptions.DefaultMhtml);
```

[Visual Basic]

```csharp
Dim eml = MailMessage.Load("Message.eml")
eml.Save("target.mthml", SaveOptions.DefaultMhtml)
```

### See Also

* class [HeadersFormattingOptions](../headersformattingoptions/)
* namespace [Aspose.Email](../../aspose.email/)
* assembly [Aspose.Email](../../)


