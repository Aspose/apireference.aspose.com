---
title: Metafile.Metafile
second_title: Aspose.Drawing voor .NET API-referentie
description: Metafile constructeur. Initialiseert een nieuw exemplaar van hetMetafile klasse van de opgegeven handle.
type: docs
weight: 10
url: /nl/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) klasse van de opgegeven handle.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| henhmetafile | IntPtr | Een handvat voor een verbeterd metabestand. |
| deleteEmf | Boolean | true om de verbeterde metabestandshandle te verwijderen when theMetafile is verwijderd; anders, vals. |

### Zie ook

* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) klasse van de opgegeven ingang naar een apparaatcontext en eenEmfTypeopsomming die het formaat van deMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| referenceHdc | IntPtr | De ingang van een apparaatcontext. |
| emfType | EmfType | EenEmfType die het formaat van deMetafile. |

### Zie ook

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) klasse van de opgegeven bestandsnaam.

```csharp
public Metafile(string filename)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | String | AString dat staat voor de bestandsnaam van waaruit het nieuwe bestand moet worden gemaaktMetafile. |

### Zie ook

* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) klasse van de opgegeven bestandsnaam.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | String | AString dat staat voor de bestandsnaam van waaruit het nieuwe bestand moet worden gemaaktMetafile. |
| referenceHdc | IntPtr | Een Windows-handle naar een apparaatcontext. |

### Zie ook

* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) klasse uit de opgegeven gegevensstroom.

```csharp
public Metafile(Stream stream)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | Stream | DeStream van waaruit create het nieuweMetafile. |

### Zie ook

* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) class van de gegevensstroom specific en een Windows-handle naar een apparaatcontext. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | Stream | AStream dat de gegevens bevat voor ditMetafile. |
| referenceHdc | IntPtr | Een Windows-handle naar een apparaatcontext van hetMetafile voorwerp. |

### Zie ook

* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) class van de gegevensstroom specific , een Windows-handle naar een apparaatcontext en eenEmfType enumeration die het formaat specificeert van hetMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | Stream | AStream dat de gegevens bevat voor ditMetafile. |
| referenceHdc | IntPtr | Een Windows-handle naar een apparaatcontext. |
| type | EmfType | EenEmfType dat specificeert het formaat van hetMetafile. |

### Zie ook

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Initialiseert een nieuw exemplaar van het[`Metafile`](../) class van de gegevensstroom specific , een Windows-handle naar een apparaatcontext en eenEmfType enumeration die het formaat specificeert van hetMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | Stream | AStream dat de gegevens bevat voor ditMetafile. |
| referenceHdc | IntPtr | Een Windows-handle naar een apparaatcontext. |
| frameRect | RectangleF | ARectangle dat vertegenwoordigt de rechthoek die het nieuwe begrenstMetafile . |
| frameUnit | MetafileFrameUnit | AMetafileFrameUnit dat specificeert de maateenheid voor frameRect. |
| type | EmfType | EenEmfType dat specificeert het formaat van hetMetafile. |

### Zie ook

* struct [RectangleF](../../../system.drawing/rectanglef/)
* enum [MetafileFrameUnit](../../metafileframeunit/)
* enum [EmfType](../../emftype/)
* class [Metafile](../)
* naamruimte [System.Drawing.Imaging](../../metafile/)
* montage [Aspose.Drawing](../../../)


