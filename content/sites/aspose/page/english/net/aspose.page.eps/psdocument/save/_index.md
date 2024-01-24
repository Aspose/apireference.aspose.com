---
title: PsDocument.Save
second_title: Aspose.Page for .NET API Reference
description: PsDocument method. Saves PS/EPS file to a device
type: docs
weight: 380
url: /net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Saves PS/EPS file to a device.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | Device | An output device. |
| options | SaveOptions | Contains flags that specify output of errors thrown during conversion. |

### See Also

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Saves given [`PsDocument`](../) as EPS file. This method is used only after updating XMP metadata. It saves initial EPS file with updated existing metadata or new one created while calling GetMetadata method. In the last case all necessary PostScript code and EPS comments are added.

```csharp
public void Save(Stream epsStream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| epsStream | Stream | Stream of output EPS file. |

### See Also

* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)

---

## Save() {#save}

Saves given [`PsDocument`](../) as EPS file. This method is used only when PsDocument was created from scratch.

```csharp
public void Save()
```

### See Also

* class [PsDocument](../)
* namespace [Aspose.Page.EPS](../../psdocument/)
* assembly [Aspose.Page](../../../)


