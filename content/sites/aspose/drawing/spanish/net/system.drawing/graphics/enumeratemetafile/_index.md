---
title: EnumerateMetafile
second_title: Referencia de Aspose.Drawing para .NET API
description: Envía los registros en el especificadoMetafilesystem.drawing.imaging/metafile  uno a la vez a un método de devolución de llamada para mostrar en un punto específico usando atributos de imagen específicos.
type: docs
weight: 460
url: /es/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | PointF | [`PointF`](../../pointf) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | PointF | [`PointF`](../../pointf) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | PointF[] | matriz de tres[`PointF`](../../pointf) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | Point | [`Point`](../../point) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | Point | [`Point`](../../point) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) uno a la vez, a un método de devolución de llamada para mostrar en un punto específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | Point | [`Point`](../../point) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Envía los registros del especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Envía los registros del especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Envía los registros del especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Envía los registros del especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | PointF | [`PointF`](../../pointf) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | PointF[] | matriz de tres[`PointF`](../../pointf) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | Point[] | matriz de tres[`Point`](../../point) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | Point[] | matriz de tres[`Point`](../../point) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | Point[] | matriz de tres[`Point`](../../point) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| unit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | Point[] | matriz de tres[`Point`](../../point) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | Point[] | matriz de tres[`Point`](../../point) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | PointF[] | matriz de tres[`PointF`](../../pointf) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| unit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | PointF[] | matriz de tres[`PointF`](../../pointf) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Envía los registros en un rectángulo seleccionado desde una S[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | PointF[] | matriz de tres[`PointF`](../../pointf) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Envía los registros de un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| unit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Envía los registros de un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Envía los registros de un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | PointF[] | matriz de tres[`PointF`](../../pointf) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Envía los registros de un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| unit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Envía los registros de un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) uno a la vez, a un método de devolución de llamada para mostrar en un punto específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | Point | [`Point`](../../point) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| unit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | Point | [`Point`](../../point) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | Point | [`Point`](../../point) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Envía los registros del especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) uno a la vez, a un método de devolución de llamada para mostrar en un punto específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | PointF | [`PointF`](../../pointf) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| unit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | PointF | [`PointF`](../../pointf) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Envía los registros en un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un punto específico.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoint | PointF | [`PointF`](../../pointf) estructura que especifica la ubicación de la esquina superior izquierda del metarchivo dibujado. |
| srcRect | RectangleF | Estructura System.Drawing.RectangleF que especifica la parte del metarchivo, en relación con su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Envía los registros en el especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un paralelogramo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destPoints | Point[] | matriz de tres[`Point`](../../point) estructuras que definen un paralelogramo que determina el tamaño y la ubicación del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Envía los registros de un rectángulo seleccionado desde un[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo especificado.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) estructura que especifica la porción del metarchivo, relativa a su esquina superior izquierda, para dibujar. |
| srcUnit | GraphicsUnit | Miembro de[`GraphicsUnit`](../../graphicsunit) enumeración que especifica la unidad de medida utilizada para determinar la parte del metarchivo que el rectángulo especificado por el*srcRect* contiene el parámetro. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Envía los registros del especificado[`Metafile`](../../../system.drawing.imaging/metafile) , uno a la vez, a un método de devolución de llamada para mostrar en un rectángulo específico usando atributos de imagen específicos.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerar |
| destRect | Rectangle | [`Rectangle`](../../rectangle) estructura que especifica la ubicación y el tamaño del metarchivo dibujado. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegado que especifica el método al que se envían los registros del metarchivo. |
| callbackData | IntPtr | Puntero interno requerido, pero ignorado. Puedes pasarZero para este parámetro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) que especifica información de atributos de imagen para la imagen dibujada. |

### Ver también

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espacio de nombres [System.Drawing](../../graphics)
* asamblea [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
