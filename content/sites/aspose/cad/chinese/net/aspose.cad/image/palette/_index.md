---
title: Palette
second_title: Aspose.CAD for .NET API 参考
description: 获取或设置调色板
type: docs
weight: 50
url: /zh/net/aspose.cad/image/palette/
---
## Image.Palette property

获取或设置调色板。

```csharp
public IColorPalette Palette { get; set; }
```

### 适当的价值

调色板。

### 例子

断言 DGN 绘图包含调色板

```csharp
var fileName = @"C:\path\drawing.dgn";
using (DgnImage drawing = (DgnImage)Image.Load(fileName))
{
    Assert.IsNotNull(drawing.Palette);
}
```

### 也可以看看

* interface [IColorPalette](../../icolorpalette)
* class [Image](../../image)
* 命名空间 [Aspose.CAD](../../image)
* 部件 [Aspose.CAD](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
