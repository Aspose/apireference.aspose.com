---
title: Class Logger
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.Tools.Logging.Logger class. Provides the logging functionality
type: docs
weight: 20970
url: /net/aspose.email.tools.logging/logger/
---
## Logger class

Provides the logging functionality.

```csharp
public sealed class Logger : IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| static [Debug](../../aspose.email.tools.logging/logger/debug/) { get; } | Gets the debug logger. |
| [Appenders](../../aspose.email.tools.logging/logger/appenders/) { get; set; } | Gets or sets the appender list. |
| [Name](../../aspose.email.tools.logging/logger/name/) { get; } | Gets or sets name. |
| [Severity](../../aspose.email.tools.logging/logger/severity/) { get; set; } | Gets or sets severity. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.email.tools.logging/logger/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [IsEnabled](../../aspose.email.tools.logging/logger/isenabled/)(LogLevel) | Determines if logging is enabled for the specified level. |
| [Write](../../aspose.email.tools.logging/logger/write/#write)(object) | Writes the specified message to appenders. |
| [Write](../../aspose.email.tools.logging/logger/write/#write_1)(string) | Writes the specified message to appenders. |
| [Write](../../aspose.email.tools.logging/logger/write/#write_2)(string, Exception) | Writes the specified message and exception to appenders. |
| [Write](../../aspose.email.tools.logging/logger/write/#write_3)(string, Exception, LogLevel) | Writes the specified message and exception to appenders. |
| [WriteFormat](../../aspose.email.tools.logging/logger/writeformat/)(string, params object[]) | Writes the message with specified format to appenders. |
| [WriteIf](../../aspose.email.tools.logging/logger/writeif/#writeif_2)(bool, object) | Writes the specified message to appenders if condition is true. |
| [WriteIf](../../aspose.email.tools.logging/logger/writeif/#writeif_4)(bool, string) | Writes the specified message to appenders if condition is true. |
| [WriteIf](../../aspose.email.tools.logging/logger/writeif/#writeif)(LogLevel, string) | Writes the specified message if the log level is enabled. |
| [WriteIf](../../aspose.email.tools.logging/logger/writeif/#writeif_3)(bool, object, Exception) | Writes the specified message and exception to appenders if condition is true. |
| [WriteIf](../../aspose.email.tools.logging/logger/writeif/#writeif_1)(LogLevel, string, Exception) | Writes the specified message and exception if the log level is enabled. |
| [WriteLine](../../aspose.email.tools.logging/logger/writeline/#writeline)() | Writes the empty line to appenders. |
| [WriteLine](../../aspose.email.tools.logging/logger/writeline/#writeline_1)(object) | Writes the specified message to appenders. |
| [WriteLine](../../aspose.email.tools.logging/logger/writeline/#writeline_2)(string) | Writes the specified message to appenders. |

### See Also

* namespace [Aspose.Email.Tools.Logging](../../aspose.email.tools.logging/)
* assembly [Aspose.Email](../../)


