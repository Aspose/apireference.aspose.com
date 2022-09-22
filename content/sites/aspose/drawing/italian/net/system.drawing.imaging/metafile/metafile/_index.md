---
title: Metafile
second_title: Aspose.Drawing per .NET API Reference
description: Inizializza una nuova istanza diMetafilesystem.drawing.imaging/metafile classe dallhandle specificato.
type: docs
weight: 10
url: /it/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dall'handle specificato.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| henhmetafile | IntPtr | Un handle per un metafile avanzato. |
| deleteEmf | Boolean | true per eliminare l'handle avanzato del metafile quando ilMetafile viene cancellato; altrimenti falso. |

### Guarda anche

* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dall'handle specificato a un contesto di dispositivo e anEmfTypeenumerazione che specifica il formato delMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| referenceHdc | IntPtr | L'handle in un contesto di dispositivo. |
| emfType | EmfType | UnEmfType che specifica il formato delMetafile. |

### Guarda anche

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dal nome file specificato.

```csharp
public Metafile(string filename)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filename | String | UNString che rappresenta il nome del file da cui creare il nuovoMetafile. |

### Guarda anche

* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dal nome file specificato.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filename | String | UNString che rappresenta il nome del file da cui creare il nuovoMetafile. |
| referenceHdc | IntPtr | Un handle di Windows per un contesto di dispositivo. |

### Guarda anche

* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dal flusso di dati specificato.

```csharp
public Metafile(Stream stream)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | Stream | IlStream da cui creare il nuovoMetafile. |

### Guarda anche

* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dal flusso di dati specificato e un handle di Windows in un contesto di dispositivo. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | Stream | UNStream che contiene i dati per thisMetafile. |
| referenceHdc | IntPtr | Un handle di Windows per un contesto di dispositivo diMetafile oggetto. |

### Guarda anche

* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dal flusso di dati specificato , un handle di Windows in un contesto di dispositivo e unEmfType enumeration che specifica il formato del fileMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | Stream | UNStream che contiene i dati per thisMetafile. |
| referenceHdc | IntPtr | Un handle di Windows per un contesto di dispositivo. |
| type | EmfType | UnEmfType che specifica il formato del fileMetafile. |

### Guarda anche

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Inizializza una nuova istanza di[`Metafile`](../../metafile) classe dal flusso di dati specificato , un handle di Windows in un contesto di dispositivo e unEmfType enumeration che specifica il formato del fileMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | Stream | UNStream che contiene i dati per thisMetafile. |
| referenceHdc | IntPtr | Un handle di Windows per un contesto di dispositivo. |
| frameRect | RectangleF | UNRectangle che rappresenta il rettangolo che delimita il nuovoMetafile . |
| frameUnit | MetafileFrameUnit | UNMetafileFrameUnit che specifica l'unità di misura per frameRect. |
| type | EmfType | UnEmfType che specifica il formato del fileMetafile. |

### Guarda anche

* struct [RectangleF](../../../system.drawing/rectanglef)
* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* spazio dei nomi [System.Drawing.Imaging](../../metafile)
* assemblea [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
