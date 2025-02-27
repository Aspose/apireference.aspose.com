---
title: Class NameIndexDataProvider
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.CffDataProviders.NameIndexDataProvider class. Declares functionality to access CFF Name INDEX structure
type: docs
weight: 90
url: /net/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class

Declares functionality to access CFF Name INDEX structure.

```csharp
public abstract class NameIndexDataProvider : ICffIndexDataProvider
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Count](../../aspose.font.cffdataproviders/nameindexdataprovider/count/) { get; } | The number of objects in the CFF INDEX structure. |
| abstract [Item](../../aspose.font.cffdataproviders/nameindexdataprovider/item/) { get; set; } | Gets/sets font name at the specified index. |

## Methods

| Name | Description |
| --- | --- |
| abstract [AddName](../../aspose.font.cffdataproviders/nameindexdataprovider/addname/)(string) | Adds a font name to the Name INDEX structure. Use this method with caution because each font name in the CFF Name INDEX structure must have a corresponding DICT structure in the Top DICT index according to the CFF specification. |
| abstract [GetName](../../aspose.font.cffdataproviders/nameindexdataprovider/getname/)(int) | Gets name of font at the specified index. |
| abstract [GetRawBytes](../../aspose.font.cffdataproviders/nameindexdataprovider/getrawbytes/)() | Gets all the bytes of the CFF INDEX structure. |
| abstract [RemoveName](../../aspose.font.cffdataproviders/nameindexdataprovider/removename/)(int) | Removes the name at the specified index. Use this method with caution because each font name in the CFF Name INDEX structure must have a corresponding DICT structure in the Top DICT index according to the CFF specification. |
| abstract [SetName](../../aspose.font.cffdataproviders/nameindexdataprovider/setname/)(string, int) | Sets font name at the specified index. |

### See Also

* interface [ICffIndexDataProvider](../icffindexdataprovider/)
* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


