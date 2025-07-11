---
title: VbaModuleCollection Class
linktitle: VbaModuleCollection
articleTitle: VbaModuleCollection
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Vba.VbaModuleCollection class, your essential tool for managing VbaModule objects efficiently in document automation.
type: docs
weight: 7410
url: /net/aspose.words.vba/vbamodulecollection/
---
## VbaModuleCollection class

Represents a collection of [`VbaModule`](../vbamodule/) objects.

To learn more, visit the [Working with VBA Macros](https://docs.aspose.com/words/net/working-with-vba-macros/) documentation article.

```csharp
public sealed class VbaModuleCollection : IEnumerable<VbaModule>
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words.vba/vbamodulecollection/count/) { get; } | Returns the number of VBA modules in the collection. |
| [Item](../../aspose.words.vba/vbamodulecollection/item/) { get; } | Retrieves a [`VbaModule`](../vbamodule/) object by index. (2 indexers) |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.words.vba/vbamodulecollection/add/)(*[VbaModule](../vbamodule/)*) | Adds a module to the collection. |
| [Remove](../../aspose.words.vba/vbamodulecollection/remove/)(*[VbaModule](../vbamodule/)*) | Removes the specified module from the collection. |

## Examples

Shows how to access a document's VBA project information.

```csharp
Document doc = new Document(MyDir + "VBA project.docm");

// A VBA project contains a collection of VBA modules.
VbaProject vbaProject = doc.VbaProject;
Console.WriteLine(vbaProject.IsSigned
    ? $"Project name: {vbaProject.Name} signed; Project code page: {vbaProject.CodePage}; Modules count: {vbaProject.Modules.Count()}\n"
    : $"Project name: {vbaProject.Name} not signed; Project code page: {vbaProject.CodePage}; Modules count: {vbaProject.Modules.Count()}\n");

VbaModuleCollection vbaModules = doc.VbaProject.Modules;

Assert.That(3, Is.EqualTo(vbaModules.Count()));

foreach (VbaModule module in vbaModules)
    Console.WriteLine($"Module name: {module.Name};\nModule code:\n{module.SourceCode}\n");

// Set new source code for VBA module. You can access VBA modules in the collection either by index or by name.
vbaModules[0].SourceCode = "Your VBA code...";
vbaModules["Module1"].SourceCode = "Your VBA code...";

// Remove a module from the collection.
vbaModules.Remove(vbaModules[2]);
```

### See Also

* class [VbaModule](../vbamodule/)
* namespace [Aspose.Words.Vba](../../aspose.words.vba/)
* assembly [Aspose.Words](../../)
