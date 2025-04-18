---
title: Class Formatter
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Tools.Logging.Formatter class. Represents the interface for formatting log entry messsages
type: docs
weight: 20920
url: /net/aspose.email.tools.logging/formatter/
---
## Formatter class

Represents the interface for formatting log entry messsages.

```csharp
public abstract class Formatter : IFormatter
```

## Properties

| Name | Description |
| --- | --- |
| virtual [Footer](../../aspose.email.tools.logging/formatter/footer/) { get; } | Gets or sets the footer. |
| virtual [Header](../../aspose.email.tools.logging/formatter/header/) { get; } | Gets or sets the header. |
| virtual [LogHeader](../../aspose.email.tools.logging/formatter/logheader/) { get; } | Gets or sets the log header |
| static [DefaultFormatter](../../aspose.email.tools.logging/formatter/defaultformatter/) { get; set; } | Gets or sets default formatter |

## Methods

| Name | Description |
| --- | --- |
| virtual [Format](../../aspose.email.tools.logging/formatter/format/#format_1)(DateTime) | Formats a datetime and return a string to be outputted. |
| virtual [Format](../../aspose.email.tools.logging/formatter/format/#format)(LogEntry) | Formats a log entry and return a string to be outputted. |

### See Also

* interface [IFormatter](../iformatter/)
* namespace [Aspose.Email.Tools.Logging](../../aspose.email.tools.logging/)
* assembly [Aspose.Email](../../)


