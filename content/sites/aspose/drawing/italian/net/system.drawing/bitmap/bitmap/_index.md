---
title: Bitmap
second_title: Aspose.Drawing per .NET API Reference
description: Inizializza una nuova istanza diBitmapsystem.drawing/bitmap classe con la dimensione specificata.
type: docs
weight: 10
url: /it/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe con la dimensione specificata.

```csharp
public Bitmap(int width, int height)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| width | Int32 | La larghezza, in pixel, della nuova Bitmap. |
| height | Int32 | L'altezza, in pixel, della nuova Bitmap. |

### Osservazioni

L'unico formato bitmap interno supportato al momento è equivalente a`PixelFormat.Format32bppPArgb` .

### Guarda anche

* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe dal file specificato.

```csharp
public Bitmap(string filename)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filename | String | Il nome del file bitmap. |

### Guarda anche

* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe dal file specificato.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filename | String | Il nome del file bitmap. |
| useIcm | Boolean | true per usare la correzione del colore per questoBitmap; altrimenti falso. |

### Guarda anche

* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe dal flusso di dati specificato.

```csharp
public Bitmap(Stream stream)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | Stream | Il flusso di dati utilizzato per caricare l'immagine. |

### Guarda anche

* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe dal flusso di dati specificato.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | Stream | Il flusso di dati utilizzato per caricare l'immagine. |
| useIcm | Boolean | `VERO` utilizzare la correzione del colore per questoBitmap ; altrimenti,`falso`. |

### Guarda anche

* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe con la dimensione e il formato specificati.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| width | Int32 | La larghezza, in pixel, del nuovoBitmap. |
| height | Int32 | L'altezza, in pixel, del nuovoBitmap. |
| format | PixelFormat | IlPixelFormat enumerazione per il nuovoBitmap. |

### Guarda anche

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe con la dimensione e i dati pixel specificati.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| width | Int32 | La larghezza, in pixel, del nuovoBitmap. |
| height | Int32 | L'altezza, in pixel, del nuovoBitmap. |
| stride | Int32 | L'offset di byte tra l'inizio di una riga di scansione e la successiva deve essere un multiplo di quattro. |
| format | PixelFormat | IlPixelFormat enumerazione per il nuovoBitmap. |
| data | Int32[] | I dati dei pixel. |

### Guarda anche

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe dall'immagine esistente specificata.

```csharp
public Bitmap(Image original)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| original | Image | IlImage da cui creare il nuovoBitmap. |

### Guarda anche

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap)classe dall'immagine esistente specificata, ridimensionata alla dimensione specificata.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| original | Image | IlImage da cui creare il nuovoBitmap |
| newSize | Size | IlSize struttura che rappresenta la dimensione del nuovoBitmap. |

### Guarda anche

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Inizializza una nuova istanza di[`Bitmap`](../../bitmap) classe dall'immagine esistente specificata, ridimensionata alla dimensione specificata.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| original | Image | IlImage da cui creare il nuovoBitmap. |
| width | Int32 | La larghezza, in pixel, del nuovoBitmap. |
| height | Int32 | L'altezza, in pixel, del nuovoBitmap. |

### Guarda anche

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* spazio dei nomi [System.Drawing](../../bitmap)
* assemblea [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
