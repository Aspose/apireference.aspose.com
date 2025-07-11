---
title: Enum MhtFormatOptions
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.MhtFormatOptions enum. Enumerates the Mht format options
type: docs
weight: 19330
url: /net/aspose.email/mhtformatoptions/
---
## MhtFormatOptions enumeration

Enumerates the Mht format options

```csharp
[Flags]
public enum MhtFormatOptions
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | No specific settings are specified. |
| WriteHeader | `1` | Indicates that header information should be written. |
| WriteOutlineAttachments | `2` | Indicates that outline attachments should be written. |
| WriteCompleteEmailAddress | `4` | Indicates that complete e-mail address should be written in all email headers. |
| NoEncodeCharacters | `8` | Indicates that no transfer encoding of characters should be used. |
| HideExtraPrintHeader | `10` | Indicates that PageHeader will be unvisible. |
| WriteCompleteToEmailAddress | `20` | Indicates that complete e-mail address should be written in 'To' header. |
| WriteCompleteFromEmailAddress | `40` | Indicates that complete e-mail address should be written in 'From' header. |
| WriteCompleteCcEmailAddress | `80` | Indicates that complete e-mail address should be written in 'Cc' header. |
| WriteCompleteBccEmailAddress | `100` | Indicates that complete e-mail address should be written in 'Bcc' header. |
| RenderCalendarEvent | `200` | Indicates that text from calendar event should be written in output mhtml. |
| SkipByteOrderMarkInBody | `400` | Indicates that Byte Order Mark(BOM) bytes should be written to body. |
| RenderVCardInfo | `800` | Indicates that text from VCard AlternativeView should be written in output mhtml. |
| DisplayAsOutlook | `1000` | Indicates that From header will be displayed as in Outlook. |
| RenderTaskFields | `2000` | Indicates that the specific Task fields should be written in output mhtml. |

### See Also

* namespace [Aspose.Email](../../aspose.email/)
* assembly [Aspose.Email](../../)


