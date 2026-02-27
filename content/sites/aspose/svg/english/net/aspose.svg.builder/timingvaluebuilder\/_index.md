---
title: TimingValueBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.TimingValueBuilder class. Builds a timing value used for specifying animation or transition timings
type: docs
weight: 1870
url: /net/aspose.svg.builder/timingvaluebuilder/
---
## TimingValueBuilder class

Builds a timing value used for specifying animation or transition timings.

```csharp
public class TimingValueBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [TimingValueBuilder](timingvaluebuilder/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [AddAccessKey](../../aspose.svg.builder/timingvaluebuilder/addaccesskey/)(*char, TimeSpan?*) | Adds an access key-based timing value. |
| [AddEvent](../../aspose.svg.builder/timingvaluebuilder/addevent/)(*string, string, TimeSpan?*) | Adds an event-based timing value. |
| [AddIndefinite](../../aspose.svg.builder/timingvaluebuilder/addindefinite/)() | Adds an indefinite timing value. |
| [AddOffset](../../aspose.svg.builder/timingvaluebuilder/addoffset/)(*TimeSpan*) | Adds a time offset to the timing value. |
| [AddRepeat](../../aspose.svg.builder/timingvaluebuilder/addrepeat/)(*string, int, TimeSpan?*) | Adds a repeat-based timing value. |
| [AddSyncbase](../../aspose.svg.builder/timingvaluebuilder/addsyncbase/)(*string, string, TimeSpan?*) | Adds a syncbase timing value, which synchronizes with another element's timing. |
| [AddWallclock](../../aspose.svg.builder/timingvaluebuilder/addwallclock/)(*DateTime*) | Adds a wallclock timing value. |
| [Build](../../aspose.svg.builder/timingvaluebuilder/build/)() | Builds the final timing value string from the added components. |
| static [FormatTimeSpan](../../aspose.svg.builder/timingvaluebuilder/formattimespan/)(*TimeSpan*) | Formats a TimeSpan into a string representation suitable for timing values. |

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
