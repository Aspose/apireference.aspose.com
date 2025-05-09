---
title: VbaProject.Clone
linktitle: Clone
articleTitle: Clone
second_title: Aspose.Words for .NET
description: Effortlessly duplicate your VbaProject with the Clone method. Enhance your workflow and streamline project management today!
type: docs
weight: 80
url: /net/aspose.words.vba/vbaproject/clone/
---
## VbaProject.Clone method

Performs a copy of the [`VbaProject`](../).

```csharp
public VbaProject Clone()
```

### Return Value

The cloned [`VbaProject`](../).

## Examples

Shows how to deep clone a VBA project and module.

```csharp
Document doc = new Document(MyDir + "VBA project.docm");
Document destDoc = new Document();

VbaProject copyVbaProject = doc.VbaProject.Clone();
destDoc.VbaProject = copyVbaProject;

// In the destination document, we already have a module named "Module1"
// because we cloned it along with the project. We will need to remove the module.
VbaModule oldVbaModule = destDoc.VbaProject.Modules["Module1"];
VbaModule copyVbaModule = doc.VbaProject.Modules["Module1"].Clone();
destDoc.VbaProject.Modules.Remove(oldVbaModule);
destDoc.VbaProject.Modules.Add(copyVbaModule);

destDoc.Save(ArtifactsDir + "VbaProject.CloneVbaProject.docm");
```

### See Also

* class [VbaProject](../)
* namespace [Aspose.Words.Vba](../../../aspose.words.vba/)
* assembly [Aspose.Words](../../../)
