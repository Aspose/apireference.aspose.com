---
title: Bitmap
second_title: Aspose.Drawing für .NET-API-Referenz
description: Initialisiert eine neue Instanz vonBitmapsystem.drawing/bitmap Klasse mit der angegebenen Größe.
type: docs
weight: 10
url: /de/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse mit der angegebenen Größe.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| width | Int32 | Die Breite der neuen Bitmap in Pixel. |
| height | Int32 | Die Höhe der neuen Bitmap in Pixel. |

### Bemerkungen

Das derzeit einzige unterstützte interne Bitmap-Format ist äquivalent zu`PixelFormat.Format32bppPArgb` .

### Siehe auch

* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse aus der angegebenen Datei.

```csharp
public Bitmap(string filename)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | String | Der Name der Bitmap-Datei. |

### Siehe auch

* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse aus der angegebenen Datei.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | String | Der Name der Bitmap-Datei. |
| useIcm | Boolean | true, um hierfür eine Farbkorrektur zu verwendenBitmap; andernfalls falsch. |

### Siehe auch

* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse aus dem angegebenen Datenstrom.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | Stream | Der zum Laden des Bildes verwendete Datenstrom. |

### Siehe auch

* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse aus dem angegebenen Datenstrom.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stream | Stream | Der zum Laden des Bildes verwendete Datenstrom. |
| useIcm | Boolean | `Stimmt` Farbkorrektur dafür verwendenBitmap ; Andernfalls,`FALSCH`. |

### Siehe auch

* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse mit der angegebenen Größe und dem angegebenen Format.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| width | Int32 | Die Breite des neuen in PixelBitmap. |
| height | Int32 | Die Höhe des neuen in PixelBitmap. |
| format | PixelFormat | DasPixelFormat Aufzählung für das NeueBitmap. |

### Siehe auch

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse mit der angegebenen Größe und Pixeldaten.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| width | Int32 | Die Breite des neuen in PixelBitmap. |
| height | Int32 | Die Höhe des neuen in PixelBitmap. |
| stride | Int32 | Der Byte-Offset zwischen dem Beginn einer Abtastzeile und der nächsten muss ein Vielfaches von vier sein. |
| format | PixelFormat | DasPixelFormat Aufzählung für das NeueBitmap. |
| data | Int32[] | Die Pixeldaten. |

### Siehe auch

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse aus dem angegebenen vorhandenen Image.

```csharp
public Bitmap(Image original)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| original | Image | DasImage aus der das Neue entstehtBitmap. |

### Siehe auch

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap)Klasse aus dem angegebenen vorhandenen Bild, skaliert auf die angegebene Größe.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| original | Image | DasImage aus der das Neue entstehtBitmap |
| newSize | Size | DasSize Struktur, die die Größe des Neuen darstellenBitmap. |

### Siehe auch

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Initialisiert eine neue Instanz von[`Bitmap`](../../bitmap) Klasse aus dem angegebenen vorhandenen Bild, auf die angegebene Größe skaliert.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| original | Image | DasImage aus der das Neue entstehtBitmap. |
| width | Int32 | Die Breite des neuen in PixelBitmap. |
| height | Int32 | Die Höhe des neuen in PixelBitmap. |

### Siehe auch

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namensraum [System.Drawing](../../bitmap)
* Montage [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
