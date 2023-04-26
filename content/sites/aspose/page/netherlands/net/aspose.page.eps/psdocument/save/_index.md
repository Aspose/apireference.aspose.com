---
title: PsDocument.Save
second_title: Aspose.Page voor .NET API-referentie
description: PsDocument methode. Slaat PS/EPSbestand op een apparaat op.
type: docs
weight: 220
url: /nl/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Slaat PS/EPS-bestand op een apparaat op.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| device | Device | Een uitvoerapparaat. |
| options | SaveOptions | Bevat vlaggen die de uitvoer specificeren van fouten die tijdens de conversie worden gegenereerd. |

### Zie ook

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* naamruimte [Aspose.Page.EPS](../../psdocument/)
* montage [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Slaat opgegeven[`PsDocument`](../) als EPS-bestand. Deze methode wordt alleen gebruikt na het bijwerken van de XMP-metadata. Het slaat het initiële EPS-bestand op met bijgewerkte bestaande metadata of een nieuw aangemaakt bestand tijdens het aanroepen van de GetMetadata-methode. In het laatste geval worden alle benodigde PostScript-code en EPS-opmerkingen toegevoegd.

```csharp
public void Save(Stream epsStream)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| epsStream | Stream | Stroom van output EPS-bestand. |

### Zie ook

* class [PsDocument](../)
* naamruimte [Aspose.Page.EPS](../../psdocument/)
* montage [Aspose.Page](../../../)

---

## Save() {#save}

Slaat opgegeven[`PsDocument`](../)als EPS-bestand. Deze methode wordt alleen gebruikt wanneer PsDocument helemaal opnieuw is gemaakt.

```csharp
public void Save()
```

### Zie ook

* class [PsDocument](../)
* naamruimte [Aspose.Page.EPS](../../psdocument/)
* montage [Aspose.Page](../../../)


