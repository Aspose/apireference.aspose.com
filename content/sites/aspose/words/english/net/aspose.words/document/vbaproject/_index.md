---
title: Document.VbaProject
linktitle: VbaProject
articleTitle: VbaProject
second_title: Aspose.Words for .NET
description: Discover how to manage VbaProject properties effectively. Learn to get or set VbaProject for enhanced automation and streamlined workflows.
type: docs
weight: 470
url: /net/aspose.words/document/vbaproject/
---
## Document.VbaProject property

Gets or sets a `VbaProject`.

```csharp
public VbaProject VbaProject { get; set; }
```

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

* class [VbaProject](../../../aspose.words.vba/vbaproject/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
