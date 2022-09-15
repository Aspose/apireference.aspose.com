---
title: Metafile
second_title: Aspose.Drawing für .NET-API-Referenz
description: Initialisiert eine neue Instanz vonMetafilesystem.drawing.imaging/metafile Klasse aus dem angegebenen Handle.
type: docs
weight: 10
url: /de/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse aus dem angegebenen Handle.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| henhmetafile | IntPtr | Ein Handle für eine erweiterte Metadatei. |
| deleteEmf | Boolean | true, um das erweiterte Metadatei-Handle when the zu löschenMetafile ist gelöscht; andernfalls falsch. |

### Siehe auch

* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse vom angegebenen Handle zu einem Gerätekontext und einerEmfTypeEnumeration, die das Format der angibtMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| referenceHdc | IntPtr | Das Handle für einen Gerätekontext. |
| emfType | EmfType | EinEmfType die das Format derMetafile. |

### Siehe auch

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse aus dem angegebenen Dateinamen.

```csharp
public Metafile(string filename)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | String | EINString das stellt den Dateinamen dar, aus dem die neue erstellt werden sollMetafile. |

### Siehe auch

* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse aus dem angegebenen Dateinamen.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | String | EINString das stellt den Dateinamen dar, aus dem die neue erstellt werden sollMetafile. |
| referenceHdc | IntPtr | Ein Windows-Handle für einen Gerätekontext. |

### Siehe auch

* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse aus dem angegebenen Datenstrom.

```csharp
public Metafile(Stream stream)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | Stream | DasStream aus denen das neue zu erstellen Metafile. |

### Siehe auch

* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) -Klasse aus dem spezifizierten -Datenstrom und einem Windows-Handle zu einem Gerätekontext. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | Stream | EINStream das die Daten für this enthältMetafile. |
| referenceHdc | IntPtr | Ein Windows-Handle für einen Gerätekontext derMetafile Objekt. |

### Siehe auch

* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse aus dem spezifizierten -Datenstrom, ein Windows-Handle zu einem Gerätekontext und eineEmfType enumeration , die das Format derMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | Stream | EINStream das die Daten für this enthältMetafile. |
| referenceHdc | IntPtr | Ein Windows-Handle für einen Gerätekontext. |
| type | EmfType | EinEmfType das spezifiziert das format derMetafile. |

### Siehe auch

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Initialisiert eine neue Instanz von[`Metafile`](../../metafile) Klasse aus dem spezifizierten -Datenstrom, ein Windows-Handle zu einem Gerätekontext und eineEmfType enumeration , die das Format derMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | Stream | EINStream das die Daten für this enthältMetafile. |
| referenceHdc | IntPtr | Ein Windows-Handle für einen Gerätekontext. |
| frameRect | RectangleF | EINRectangle das das Rechteck darstellt, das das neue begrenztMetafile . |
| frameUnit | MetafileFrameUnit | EINMetafileFrameUnit die die Maßeinheit für frameRect angibt. |
| type | EmfType | EinEmfType das spezifiziert das format derMetafile. |

### Siehe auch

* struct [RectangleF](../../../system.drawing/rectanglef)
* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* namensraum [System.Drawing.Imaging](../../metafile)
* Montage [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
