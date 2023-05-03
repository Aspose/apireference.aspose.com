---
title: Bitmap.Bitmap
second_title: Aspose.Drawing voor .NET API-referentie
description: Bitmap constructeur. Initialiseert een nieuw exemplaar van hetBitmap klasse met de opgegeven grootte.
type: docs
weight: 10
url: /nl/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse met de opgegeven grootte.

```csharp
public Bitmap(int width, int height)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| width | Int32 | De breedte, in pixels, van de nieuwe bitmap. |
| height | Int32 | De hoogte, in pixels, van de nieuwe bitmap. |

### Opmerkingen

Het enige ondersteunde interne bitmapformaat op dit moment is gelijk aan`PixelFormat.Format32bppPARgb` .

### Zie ook

* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse uit het opgegeven bestand.

```csharp
public Bitmap(string filename)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | String | De naam van het bitmapbestand. |

### Zie ook

* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse uit het opgegeven bestand.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | String | De naam van het bitmapbestand. |
| useIcm | Boolean | True om hiervoor kleurcorrectie te gebruikenBitmap; anders, vals. |

### Zie ook

* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse uit de opgegeven gegevensstroom.

```csharp
public Bitmap(Stream stream)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | Stream | De gegevensstroom die is gebruikt om de afbeelding te laden. |

### Zie ook

* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse uit de opgegeven gegevensstroom.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | Stream | De gegevensstroom die is gebruikt om de afbeelding te laden. |
| useIcm | Boolean | `WAAR` om hiervoor kleurcorrectie te gebruikenBitmap ; anders,`vals`. |

### Zie ook

* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse met de opgegeven grootte en indeling.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| width | Int32 | De breedte, in pixels, van de nieuweBitmap. |
| height | Int32 | De hoogte, in pixels, van de nieuweBitmap. |
| format | PixelFormat | DePixelFormat opsomming voor het nieuweBitmap. |

### Zie ook

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse met de opgegeven grootte en pixelgegevens.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| width | Int32 | De breedte, in pixels, van de nieuweBitmap. |
| height | Int32 | De hoogte, in pixels, van de nieuweBitmap. |
| stride | Int32 | De byte-offset tussen het begin van de ene scanregel en de volgende moet een veelvoud van vier zijn. |
| format | PixelFormat | DePixelFormat opsomming voor het nieuweBitmap. |
| data | Int32[] | De pixelgegevens. |

### Zie ook

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse van de opgegeven bestaande afbeelding.

```csharp
public Bitmap(Image original)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| original | Image | DeImage waaruit het nieuwe ontstaatBitmap. |

### Zie ook

* class [Image](../../image/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../)klasse van de opgegeven bestaande afbeelding, geschaald naar de opgegeven grootte.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| original | Image | DeImage waaruit het nieuwe ontstaatBitmap |
| newSize | Size | DeSize structuur die de grootte van het nieuwe vertegenwoordigtBitmap. |

### Zie ook

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Initialiseert een nieuw exemplaar van het[`Bitmap`](../) klasse van de opgegeven bestaande afbeelding, geschaald naar de opgegeven grootte.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| original | Image | DeImage waaruit het nieuwe ontstaatBitmap. |
| width | Int32 | De breedte, in pixels, van de nieuweBitmap. |
| height | Int32 | De hoogte, in pixels, van de nieuweBitmap. |

### Zie ook

* class [Image](../../image/)
* class [Bitmap](../)
* naamruimte [System.Drawing](../../bitmap/)
* montage [Aspose.Drawing](../../../)


