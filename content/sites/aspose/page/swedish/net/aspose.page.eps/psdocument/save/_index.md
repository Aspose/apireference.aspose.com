---
title: PsDocument.Save
second_title: Aspose.Page för .NET API-referens
description: PsDocument metod. Sparar PS/EPSfil på en enhet.
type: docs
weight: 200
url: /sv/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Sparar PS/EPS-fil på en enhet.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| device | Device | En utgångsenhet. |
| options | SaveOptions | Innehåller flaggor som anger utdata för fel som kastas under konvertering. |

### Se även

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* namnutrymme [Aspose.Page.EPS](../../psdocument/)
* hopsättning [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Sparningar ges[`PsDocument`](../) som EPS-fil. Den här metoden används endast efter uppdatering av XMP-metadata. Den sparar den initiala EPS-filen med uppdaterad befintlig metadata eller ny skapad under anrop av GetMetadata-metoden. I det sista fallet läggs all nödvändig PostScript-kod och EPS-kommentarer till.

```csharp
public void Save(Stream epsStream)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| epsStream | Stream | Ström av utdata EPS-fil. |

### Se även

* class [PsDocument](../)
* namnutrymme [Aspose.Page.EPS](../../psdocument/)
* hopsättning [Aspose.Page](../../../)

---

## Save() {#save}

Sparningar ges[`PsDocument`](../) som EPS-fil. Denna metod används endast när PsDocument skapades från början.

```csharp
public void Save()
```

### Se även

* class [PsDocument](../)
* namnutrymme [Aspose.Page.EPS](../../psdocument/)
* hopsättning [Aspose.Page](../../../)


