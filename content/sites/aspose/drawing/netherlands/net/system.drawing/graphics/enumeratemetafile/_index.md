---
title: Graphics.EnumerateMetafile
second_title: Aspose.Drawing voor .NET API-referentie
description: Graphics methode. Verzendt de records in de opgegevenMetafile  één voor één naar een callbackmethode voor weergave op een opgegeven punt met behulp van opgegeven afbeeldingsattributen.
type: docs
weight: 460
url: /nl/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave op een opgegeven punt met behulp van opgegeven afbeeldingsattributen.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | PointF | [`PointF`](../../pointf/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | PointF | [`PointF`](../../pointf/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | PointF[] | Reeks van drie[`PointF`](../../pointf/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | Point | [`Point`](../../point/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | Point | [`Point`](../../point/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) één voor één, naar een callback-methode voor weergave op een opgegeven punt met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | Point | [`Point`](../../point/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Verzendt de records van de gespecificeerde[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Verzendt de records van de gespecificeerde[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Verzendt de records van de gespecificeerde[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven rechthoek met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Verzendt de records van de gespecificeerde[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | PointF | [`PointF`](../../pointf/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | PointF[] | Reeks van drie[`PointF`](../../pointf/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | Point[] | Reeks van drie[`Point`](../../point/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | Point[] | Reeks van drie[`Point`](../../point/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven parallellogram met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | Point[] | Reeks van drie[`Point`](../../point/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| unit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | Point[] | Reeks van drie[`Point`](../../point/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | Point[] | Reeks van drie[`Point`](../../point/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven parallellogram met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | PointF[] | Reeks van drie[`PointF`](../../pointf/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| unit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | PointF[] | Reeks van drie[`PointF`](../../pointf/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Verzendt de records in een geselecteerde rechthoek vanuit een S[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven parallellogram.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | PointF[] | Reeks van drie[`PointF`](../../pointf/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Verzendt de records van een geselecteerde rechthoek van een[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven rechthoek met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| unit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Verzendt de records van een geselecteerde rechthoek van een[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Verzendt de records van een geselecteerde rechthoek van een[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven parallellogram met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | PointF[] | Reeks van drie[`PointF`](../../pointf/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Verzendt de records van een geselecteerde rechthoek van een[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven rechthoek met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| unit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Verzendt de records van een geselecteerde rechthoek van een[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) één voor één, naar een callback-methode voor weergave op een opgegeven punt met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | Point | [`Point`](../../point/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| unit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | Point | [`Point`](../../point/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | Point | [`Point`](../../point/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Verzendt de records van de gespecificeerde[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) één voor één, naar een callback-methode voor weergave op een opgegeven punt met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | PointF | [`PointF`](../../pointf/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| unit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | PointF | [`PointF`](../../pointf/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Verzendt de records in een geselecteerde rechthoek van a[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave op een bepaald punt.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoint | PointF | [`PointF`](../../pointf/) structuur die de locatie van de linkerbovenhoek van het getekende metabestand specificeert. |
| srcRect | RectangleF | System.Drawing.RectangleF-structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Verzendt de records in de opgegeven[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven parallellogram met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destPoints | Point[] | Reeks van drie[`Point`](../../point/) structuren die een parallellogram definiëren dat de grootte en locatie van het getekende metabestand bepaalt. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Verzendt de records van een geselecteerde rechthoek van een[`Metafile`](../../../system.drawing.imaging/metafile/) , een voor een, naar een callback-methode voor weergave in een opgegeven rechthoek.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) structuur die aangeeft welk deel van het metabestand, relatief ten opzichte van de linkerbovenhoek, moet worden getekend. |
| srcUnit | GraphicsUnit | Lid van de[`GraphicsUnit`](../../graphicsunit/) opsomming die de maateenheid specificeert die wordt gebruikt om het gedeelte van het metabestand te bepalen dat de rechthoek specificeert door de*srcRect* parameter bevat. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Verzendt de records van de gespecificeerde[`Metafile`](../../../system.drawing.imaging/metafile/) , één voor één, naar een callback-methode voor weergave in een opgegeven rechthoek met behulp van opgegeven afbeeldingskenmerken.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) opsommen. |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) structuur die de locatie en grootte van het getekende metabestand specificeert. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) gedelegeerde die de methode specificeert waarnaar de metabestandsrecords worden verzonden. |
| callbackData | IntPtr | Interne aanwijzer die vereist is, maar wordt genegeerd. Je kunt passerenZero voor deze parameter. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) die afbeeldingsattribuutinformatie specificeert voor de getekende afbeelding. |

### Zie ook

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* naamruimte [System.Drawing](../../graphics/)
* montage [Aspose.Drawing](../../../)


