---
title: EnumerateMetafile
second_title: Aspose.Drawing för .NET API Referens
description: Skickar posterna i det angivnaMetafilesystem.drawing.imaging/metafile  en i taget till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut.
type: docs
weight: 460
url: /sv/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | PointF | [`PointF`](../../pointf) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | PointF | [`PointF`](../../pointf) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | PointF[] | Uppsättning av tre[`PointF`](../../pointf) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | Point | [`Point`](../../point) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | Point | [`Point`](../../point) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | Point | [`Point`](../../point) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Skickar posterna för den angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Skickar posterna för den angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Skickar posterna för den angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Skickar posterna för den angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger platsen och storleken på den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | PointF | [`PointF`](../../pointf) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | PointF[] | Uppsättning av tre[`PointF`](../../pointf) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | Point[] | Uppsättning av tre[`Point`](../../point) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | Point[] | Uppsättning av tre[`Point`](../../point) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | Point[] | Uppsättning av tre[`Point`](../../point) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| unit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | Point[] | Uppsättning av tre[`Point`](../../point) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | Point[] | Uppsättning av tre[`Point`](../../point) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | PointF[] | Uppsättning av tre[`PointF`](../../pointf) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| unit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | PointF[] | Uppsättning av tre[`PointF`](../../pointf) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Skickar posterna i en vald rektangel från en S[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | PointF[] | Uppsättning av tre[`PointF`](../../pointf) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Skickar posterna för en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger platsen och storleken på den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| unit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Skickar posterna för en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger platsen och storleken på den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Skickar posterna för en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger platsen och storleken på den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | PointF[] | Uppsättning av tre[`PointF`](../../pointf) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Skickar posterna för en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| unit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Skickar posterna för en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | Point | [`Point`](../../point) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| unit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | Point | [`Point`](../../point) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | Point | [`Point`](../../point) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Skickar posterna för den angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) en i taget, till en återuppringningsmetod för visning vid en angiven punkt med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | PointF | [`PointF`](../../pointf) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| unit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | PointF | [`PointF`](../../pointf) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Skickar posterna i en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning vid en angiven punkt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoint | PointF | [`PointF`](../../pointf) struktur som anger platsen för det övre vänstra hörnet av den ritade metafilen. |
| srcRect | RectangleF | System.Drawing.RectangleF-struktur som specificerar den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Skickar posterna i det angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i ett specificerat parallellogram med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destPoints | Point[] | Uppsättning av tre[`Point`](../../point) strukturer som definierar ett parallellogram som bestämmer storleken och placeringen av den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Skickar posterna för en vald rektangel från en[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger platsen och storleken på den ritade metafilen. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struktur som anger den del av metafilen, i förhållande till dess övre vänstra hörn, som ska ritas. |
| srcUnit | GraphicsUnit | Medlem av[`GraphicsUnit`](../../graphicsunit) uppräkning som specificerar måttenheten som används för att bestämma den del av metafilen som rektangeln specificeras av*srcRect* parametern innehåller. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Skickar posterna för den angivna[`Metafile`](../../../system.drawing.imaging/metafile) , en i taget, till en återuppringningsmetod för visning i en specificerad rektangel med angivna bildattribut.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) att räkna upp. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struktur som anger platsen och storleken på den ritade metafilen. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegat som anger metoden till vilken metafilposterna skickas. |
| callbackData | IntPtr | Intern pekare som krävs, men ignoreras. Du kan passeraZero för denna parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) som anger bildattributinformation för den ritade bilden. |

### Se även

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* namnutrymme [System.Drawing](../../graphics)
* hopsättning [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
