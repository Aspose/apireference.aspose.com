---
title: EmlSaveOptions.PreserveEmbeddedMessageFormat
second_title: Aspose.Email for .NET API Reference
description: EmlSaveOptions property. Gets or sets a value indicating whether it is necessary to preserve MSG format of embedded message at converting to MailMessage. By default the value is false
type: docs
weight: 50
url: /net/aspose.email/emlsaveoptions/preserveembeddedmessageformat/
---
## EmlSaveOptions.PreserveEmbeddedMessageFormat property

Gets or sets a value indicating whether it is necessary to preserve MSG format of embedded message at converting to MailMessage. By default the value is false.

```csharp
public bool PreserveEmbeddedMessageFormat { get; set; }
```

## Remarks

Generally, embedded messages have the same format (EML or MSG) as the underlying message. By default, when converting from MSG to EML and vice versa, embedded messages are also converted to the target format. Setting the property to true preserves the original format of embedded messages.

### See Also

* class [EmlSaveOptions](../)
* namespace [Aspose.Email](../../emlsaveoptions/)
* assembly [Aspose.Email](../../../)


