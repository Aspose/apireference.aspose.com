---
title: PsDocument.ResizeEps
second_title: Aspose.Page for .NET API Reference
description: PsDocument method. Resizes given PsDocument as EPS file. This method is used only after extracting EPS size. It saves initial EPS file with updated existing BoundingBox or new one will be created. Page transformation matrix also will be set
type: docs
weight: 380
url: /net/aspose.page.eps/psdocument/resizeeps/
---
## ResizeEps(string, SizeF, Units) {#resizeeps_1}

Resizes given [`PsDocument`](../) as EPS file. This method is used only after extracting EPS size. It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set.

```csharp
public void ResizeEps(string outEpsFilePath, SizeF newSizeInUnits, Units units)
```

| Parameter | Type | Description |
| --- | --- | --- |
| outEpsFilePath | String | The output EPS file path. |
| newSizeInUnits | SizeF | New size of EPS image in assigned units. |
| units | Units | The units of the new size. Can be points, inches, millimeters, centimeters and percents of initial size. |

### See Also

* enum [Units](../../../aspose.page/units/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)

---

## ResizeEps(Stream, SizeF, Units) {#resizeeps}

Resizes given [`PsDocument`](../) as EPS file. This method is used only after extracting EPS size. It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set.

```csharp
public void ResizeEps(Stream epsStream, SizeF newSizeInUnits, Units units)
```

| Parameter | Type | Description |
| --- | --- | --- |
| epsStream | Stream | Stream of output EPS file. |
| newSizeInUnits | SizeF | New size of EPS image in assigned units. |
| units | Units | The units of the new size. Can be points, inches, millimeters, centimeters and percents of initial size. |

### See Also

* enum [Units](../../../aspose.page/units/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)


