---
title: PsDocument.Save
second_title: Aspose.Page per riferimento all'API .NET
description: PsDocument metodo. Salva il file PS/EPS su un dispositivo.
type: docs
weight: 200
url: /it/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Salva il file PS/EPS su un dispositivo.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| device | Device | Un dispositivo di output. |
| options | SaveOptions | Contiene flag che specificano l'output degli errori generati durante la conversione. |

### Guarda anche

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* spazio dei nomi [Aspose.Page.EPS](../../psdocument/)
* assemblea [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Salvataggi dati[`PsDocument`](../) come file EPS. Questo metodo viene utilizzato solo dopo l'aggiornamento dei metadati XMP. Salva il file EPS iniziale con i metadati esistenti aggiornati o uno nuovo creato durante la chiamata al metodo GetMetadata. Nell'ultimo caso vengono aggiunti tutti i codici PostScript e i commenti EPS necessari.

```csharp
public void Save(Stream epsStream)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| epsStream | Stream | Flusso del file EPS di output. |

### Guarda anche

* class [PsDocument](../)
* spazio dei nomi [Aspose.Page.EPS](../../psdocument/)
* assemblea [Aspose.Page](../../../)

---

## Save() {#save}

Salvataggi dati[`PsDocument`](../) come file EPS. Questo metodo viene utilizzato solo quando PsDocument è stato creato da zero.

```csharp
public void Save()
```

### Guarda anche

* class [PsDocument](../)
* spazio dei nomi [Aspose.Page.EPS](../../psdocument/)
* assemblea [Aspose.Page](../../../)


