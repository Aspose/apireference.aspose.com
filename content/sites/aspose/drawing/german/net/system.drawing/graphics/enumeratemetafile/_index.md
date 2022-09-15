---
title: EnumerateMetafile
second_title: Aspose.Drawing für .NET-API-Referenz
description: Sendet die Datensätze in der angegebenenMetafilesystem.drawing.imaging/metafile  einzeln an eine CallbackMethode zur Anzeige an einem bestimmten Punkt unter Verwendung bestimmter Bildattribute.
type: docs
weight: 460
url: /de/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt unter Verwendung bestimmter Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | PointF | [`PointF`](../../pointf) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | PointF | [`PointF`](../../pointf) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | PointF[] | Array von drei[`PointF`](../../pointf) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | Point | [`Point`](../../point) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | Point | [`Point`](../../point) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt unter Verwendung bestimmter Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | Point | [`Point`](../../point) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Sendet die Datensätze der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Sendet die Datensätze der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Sendet die Datensätze der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Rechteck mit angegebenen Bildattributen.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Sendet die Datensätze der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | PointF | [`PointF`](../../pointf) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | PointF[] | Array von drei[`PointF`](../../pointf) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | Point[] | Array von drei[`Point`](../../point) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | Point[] | Array von drei[`Point`](../../point) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Parallelogramm unter Verwendung angegebener Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | Point[] | Array von drei[`Point`](../../point) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| unit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | Point[] | Array von drei[`Point`](../../point) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | Point[] | Array von drei[`Point`](../../point) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Parallelogramm unter Verwendung angegebener Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | PointF[] | Array von drei[`PointF`](../../pointf) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| unit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | PointF[] | Array von drei[`PointF`](../../pointf) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Sendet die Datensätze in einem ausgewählten Rechteck aus einem S[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Parallelogramm.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | PointF[] | Array von drei[`PointF`](../../pointf) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Sendet die Datensätze eines ausgewählten Rechtecks von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Rechteck mit angegebenen Bildattributen.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| unit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Sendet die Datensätze eines ausgewählten Rechtecks von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Sendet die Datensätze eines ausgewählten Rechtecks von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Parallelogramm unter Verwendung angegebener Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | PointF[] | Array von drei[`PointF`](../../pointf) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Sendet die Datensätze eines ausgewählten Rechtecks von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Rechteck mit angegebenen Bildattributen.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| unit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Sendet die Datensätze eines ausgewählten Rechtecks von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt unter Verwendung bestimmter Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | Point | [`Point`](../../point) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| unit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | Point | [`Point`](../../point) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | Point | [`Point`](../../point) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Sendet die Datensätze der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt unter Verwendung bestimmter Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | PointF | [`PointF`](../../pointf) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| unit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | PointF | [`PointF`](../../pointf) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Sendet die Datensätze in einem ausgewählten Rechteck von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige an einem bestimmten Punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoint | PointF | [`PointF`](../../pointf) -Struktur, die die Position der oberen linken Ecke der gezeichneten Metadatei angibt. |
| srcRect | RectangleF | System.Drawing.RectangleF-Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Sendet die Datensätze in der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Parallelogramm unter Verwendung angegebener Bildattribute.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destPoints | Point[] | Array von drei[`Point`](../../point) Strukturen, die ein Parallelogramm definieren, das die Größe und Position der gezeichneten Metadatei bestimmt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Sendet die Datensätze eines ausgewählten Rechtecks von a[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem bestimmten Rechteck.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) -Struktur, die den zu zeichnenden Teil der Metadatei relativ zu ihrer oberen linken Ecke angibt. |
| srcUnit | GraphicsUnit | Mitglied von[`GraphicsUnit`](../../graphicsunit) Enumeration, die die Maßeinheit angibt, die verwendet wird, um den Teil der Metadatei zu bestimmen, der das durch die angegebene Rechteck enthält*srcRect* Parameter enthält. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Sendet die Datensätze der angegebenen[`Metafile`](../../../system.drawing.imaging/metafile) , einzeln an eine Callback-Methode zur Anzeige in einem angegebenen Rechteck mit angegebenen Bildattributen.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) aufzuzählen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) -Struktur, die den Speicherort und die Größe der gezeichneten Metadatei angibt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) Delegate, der die Methode angibt, an die die Metadatei-Datensätze gesendet werden. |
| callbackData | IntPtr | Interner Zeiger, der erforderlich ist, aber ignoriert wird. Du kannst passierenZero für diesen Parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) die Bildattributinformationen für das gezeichnete Bild angibt. |

### Siehe auch

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namensraum [System.Drawing](../../graphics)
* Montage [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
