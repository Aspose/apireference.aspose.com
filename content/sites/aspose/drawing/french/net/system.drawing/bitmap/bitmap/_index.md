---
title: Bitmap
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Initialise une nouvelle instance duBitmapsystem.drawing/bitmap classe avec la taille spécifiée.
type: docs
weight: 10
url: /fr/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe avec la taille spécifiée.

```csharp
public Bitmap(int width, int height)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| width | Int32 | La largeur, en pixels, du nouveau Bitmap. |
| height | Int32 | La hauteur, en pixels, du nouveau Bitmap. |

### Remarques

Le seul format bitmap interne pris en charge pour le moment est équivalent à`PixelFormat.Format32bppPARgb` .

### Voir également

* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe du fichier spécifié.

```csharp
public Bitmap(string filename)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| filename | String | Nom du fichier bitmap. |

### Voir également

* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe du fichier spécifié.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| filename | String | Nom du fichier bitmap. |
| useIcm | Boolean | vrai d'utiliser la correction des couleurs pour celaBitmap; sinon, faux. |

### Voir également

* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe du flux de données spécifié.

```csharp
public Bitmap(Stream stream)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | Stream | Le flux de données utilisé pour charger l'image. |

### Voir également

* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe du flux de données spécifié.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | Stream | Le flux de données utilisé pour charger l'image. |
| useIcm | Boolean | `vrai` utiliser la correction des couleurs pour celaBitmap ; Par ailleurs,`faux`. |

### Voir également

* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe avec la taille et le format spécifiés.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| width | Int32 | La largeur, en pixels, du nouveauBitmap. |
| height | Int32 | La hauteur, en pixels, du nouveauBitmap. |
| format | PixelFormat | LaPixelFormat énumération pour le nouveauBitmap. |

### Voir également

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe avec la taille et les données de pixel spécifiées.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| width | Int32 | La largeur, en pixels, du nouveauBitmap. |
| height | Int32 | La hauteur, en pixels, du nouveauBitmap. |
| stride | Int32 | Le décalage d'octet entre le début d'une ligne de balayage et la suivante doit être un multiple de quatre. |
| format | PixelFormat | LaPixelFormat énumération pour le nouveauBitmap. |
| data | Int32[] | Les données de pixels. |

### Voir également

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe à partir de l'image existante spécifiée.

```csharp
public Bitmap(Image original)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| original | Image | LaImage à partir de laquelle créer le nouveauBitmap. |

### Voir également

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap)classe à partir de l'image existante spécifiée, mise à l'échelle à la taille spécifiée.

```csharp
public Bitmap(Image original, Size newSize)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| original | Image | LaImage à partir de laquelle créer le nouveauBitmap |
| newSize | Size | LaSize structure qui représentent la taille de la nouvelleBitmap. |

### Voir également

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Initialise une nouvelle instance du[`Bitmap`](../../bitmap) classe à partir de l'image existante spécifiée, mise à l'échelle à la taille spécifiée.

```csharp
public Bitmap(Image original, int width, int height)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| original | Image | LaImage à partir de laquelle créer le nouveauBitmap. |
| width | Int32 | La largeur, en pixels, du nouveauBitmap. |
| height | Int32 | La hauteur, en pixels, du nouveauBitmap. |

### Voir également

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* espace de noms [System.Drawing](../../bitmap)
* Assemblée [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
