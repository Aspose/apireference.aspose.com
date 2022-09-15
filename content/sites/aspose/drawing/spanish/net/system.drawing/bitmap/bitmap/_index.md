---
title: Bitmap
second_title: Referencia de Aspose.Drawing para .NET API
description: Inicializa una nueva instancia delBitmapsystem.drawing/bitmap clase con el tamaño especificado.
type: docs
weight: 10
url: /es/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase con el tamaño especificado.

```csharp
public Bitmap(int width, int height)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| width | Int32 | El ancho, en píxeles, del nuevo mapa de bits. |
| height | Int32 | La altura, en píxeles, del nuevo mapa de bits. |

### Observaciones

El único formato de mapa de bits interno admitido en este momento es equivalente a`PixelFormat.Format32bppPArgb` .

### Ver también

* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase del archivo especificado.

```csharp
public Bitmap(string filename)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| filename | String | El nombre del archivo de mapa de bits. |

### Ver también

* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase del archivo especificado.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| filename | String | El nombre del archivo de mapa de bits. |
| useIcm | Boolean | verdadero para usar la corrección de color para estoBitmap; en caso contrario, falso. |

### Ver también

* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase del flujo de datos especificado.

```csharp
public Bitmap(Stream stream)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | Stream | El flujo de datos utilizado para cargar la imagen. |

### Ver también

* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase del flujo de datos especificado.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | Stream | El flujo de datos utilizado para cargar la imagen. |
| useIcm | Boolean | `verdadero` para usar la corrección de color para estoBitmap ; de lo contrario,`falso`. |

### Ver también

* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase con el tamaño y formato especificado.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| width | Int32 | El ancho, en píxeles, del nuevoBitmap. |
| height | Int32 | La altura, en píxeles, del nuevoBitmap. |
| format | PixelFormat | losPixelFormat enumeración para el nuevoBitmap. |

### Ver también

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase con el tamaño especificado y datos de píxeles.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| width | Int32 | El ancho, en píxeles, del nuevoBitmap. |
| height | Int32 | La altura, en píxeles, del nuevoBitmap. |
| stride | Int32 | El desplazamiento de bytes entre el comienzo de una línea de exploración y la siguiente debe ser un múltiplo de cuatro. |
| format | PixelFormat | losPixelFormat enumeración para el nuevoBitmap. |
| data | Int32[] | Los datos de píxeles. |

### Ver también

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase de la imagen existente especificada.

```csharp
public Bitmap(Image original)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| original | Image | losImage a partir de la cual crear el nuevoBitmap. |

### Ver también

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap)clase de la imagen existente especificada, escalada al tamaño especificado.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| original | Image | losImage a partir de la cual crear el nuevoBitmap |
| newSize | Size | losSize estructura que representan el tamaño de la nuevaBitmap. |

### Ver también

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Inicializa una nueva instancia del[`Bitmap`](../../bitmap) clase de la imagen existente especificada, escalada al tamaño especificado.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| original | Image | losImage a partir de la cual crear el nuevoBitmap. |
| width | Int32 | El ancho, en píxeles, del nuevoBitmap. |
| height | Int32 | La altura, en píxeles, del nuevoBitmap. |

### Ver también

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* espacio de nombres [System.Drawing](../../bitmap)
* asamblea [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
