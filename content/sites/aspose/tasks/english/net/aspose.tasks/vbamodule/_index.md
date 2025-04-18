---
title: Class VbaModule
second_title: Aspose.Tasks for .NET API Reference
description: Aspose.Tasks.VbaModule class. Represents a VBA module
type: docs
weight: 2730
url: /net/aspose.tasks/vbamodule/
---
## VbaModule class

Represents a VBA module.

```csharp
public class VbaModule : IVbaModule
```

## Properties

| Name | Description |
| --- | --- |
| [Attributes](../../aspose.tasks/vbamodule/attributes/) { get; } |  |
| [Name](../../aspose.tasks/vbamodule/name/) { get; } |  |
| [SourceCode](../../aspose.tasks/vbamodule/sourcecode/) { get; } |  |

## Examples

Shows how to read modules of VBA project.

```csharp
var project = new Project(DataDir + "VbaProject.mpp");

Console.WriteLine("Total Modules Count: " + project.VbaProject.Modules.Count);

foreach (var module in project.VbaProject.Modules)
{
    Console.WriteLine("Module Name: " + module.Name);
    Console.WriteLine("Source Code: " + module.SourceCode);
}
```

### See Also

* interface [IVbaModule](../ivbamodule/)
* namespace [Aspose.Tasks](../../aspose.tasks/)
* assembly [Aspose.Tasks](../../)


