---
title: Bitmap
second_title: Aspose.Drawing för .NET API Referens
description: Initierar en ny instans avBitmapsystem.drawing/bitmap klass med angiven storlek.
type: docs
weight: 10
url: /sv/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass med angiven storlek.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | Int32 | Bredden, i pixlar, på den nya bitmappen. |
| height | Int32 | Höjden, i pixlar, på den nya bitmappen. |

### Anmärkningar

Det enda stödda interna bitmappsformatet för närvarande motsvarar`PixelFormat.Format32bppPARgb` .

### Se även

* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass från den angivna filen.

```csharp
public Bitmap(string filename)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filename | String | Namnet på bitmappsfilen. |

### Se även

* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass från den angivna filen.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filename | String | Namnet på bitmappsfilen. |
| useIcm | Boolean | sant att använda färgkorrigering för dettaBitmap; annars falskt. |

### Se även

* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass från den angivna dataströmmen.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | Stream | Dataströmmen som används för att ladda bilden. |

### Se även

* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass från den angivna dataströmmen.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stream | Stream | Dataströmmen som används för att ladda bilden. |
| useIcm | Boolean | `Sann` att använda färgkorrigering för dettaBitmap ; annat,`falsk`. |

### Se även

* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass med angiven storlek och format.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | Int32 | Bredden, i pixlar, på den nyaBitmap. |
| height | Int32 | Höjden, i pixlar, på den nyaBitmap. |
| format | PixelFormat | DePixelFormat uppräkning för det nyaBitmap. |

### Se även

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass med angiven storlek och pixeldata.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | Int32 | Bredden, i pixlar, på den nyaBitmap. |
| height | Int32 | Höjden, i pixlar, på den nyaBitmap. |
| stride | Int32 | Byteförskjutningen mellan början av en avsökningsrad och nästa måste vara en multipel av fyra. |
| format | PixelFormat | DePixelFormat uppräkning för det nyaBitmap. |
| data | Int32[] | Pixeldata. |

### Se även

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass från den angivna befintliga bilden.

```csharp
public Bitmap(Image original)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| original | Image | DeImage varifrån man skapar det nyaBitmap. |

### Se även

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Initierar en ny instans av[`Bitmap`](../../bitmap)klass från den angivna befintliga bilden, skalad till den angivna storleken.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| original | Image | DeImage varifrån man skapar det nyaBitmap |
| newSize | Size | DeSize struktur som representerar storleken på det nyaBitmap. |

### Se även

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Initierar en ny instans av[`Bitmap`](../../bitmap) klass från den angivna befintliga bilden, skalad till den angivna storleken.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| original | Image | DeImage varifrån man skapar det nyaBitmap. |
| width | Int32 | Bredden, i pixlar, på den nyaBitmap. |
| height | Int32 | Höjden, i pixlar, på den nyaBitmap. |

### Se även

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* namnutrymme [System.Drawing](../../bitmap)
* hopsättning [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
