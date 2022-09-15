---
title: EnumerateMetafile
second_title: Aspose.Drawing per .NET API Reference
description: Invia i record nel formato specificatoMetafilesystem.drawing.imaging/metafile  uno alla volta a un metodo di callback per la visualizzazione in un punto specificato utilizzando gli attributi dellimmagine specificati.
type: docs
weight: 460
url: /it/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | PointF | [`PointF`](../../pointf) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | PointF | [`PointF`](../../pointf) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | PointF[] | Matrice di tre[`PointF`](../../pointf) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | Point | [`Point`](../../point) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | Point | [`Point`](../../point) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | Point | [`Point`](../../point) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Invia i record dell'oggetto specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Invia i record dell'oggetto specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Invia i record dell'oggetto specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Invia i record dell'oggetto specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | PointF | [`PointF`](../../pointf) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | PointF[] | Matrice di tre[`PointF`](../../pointf) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | Point[] | Matrice di tre[`Point`](../../point) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | Point[] | Matrice di tre[`Point`](../../point) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato utilizzando attributi di immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | Point[] | Matrice di tre[`Point`](../../point) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| unit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | Point[] | Matrice di tre[`Point`](../../point) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | Point[] | Matrice di tre[`Point`](../../point) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato utilizzando attributi di immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | PointF[] | Matrice di tre[`PointF`](../../pointf) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| unit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | PointF[] | Matrice di tre[`PointF`](../../pointf) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Invia i record in un rettangolo selezionato da un S[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | PointF[] | Matrice di tre[`PointF`](../../pointf) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Invia i record di un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| unit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Invia i record di un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Invia i record di un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato utilizzando attributi di immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | PointF[] | Matrice di tre[`PointF`](../../pointf) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Invia i record di un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| unit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Invia i record di un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | Point | [`Point`](../../point) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| unit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | Point | [`Point`](../../point) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | Point | [`Point`](../../point) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Invia i record dell'oggetto specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | PointF | [`PointF`](../../pointf) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| unit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | PointF | [`PointF`](../../pointf) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Invia i record in un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un punto specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoint | PointF | [`PointF`](../../pointf) struttura che specifica la posizione dell'angolo superiore sinistro del metafile disegnato. |
| srcRect | RectangleF | System.Drawing.RectangleF struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Invia i record nel formato specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un parallelogramma specificato utilizzando attributi di immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destPoints | Point[] | Matrice di tre[`Point`](../../point) strutture che definiscono un parallelogramma che determina la dimensione e la posizione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Invia i record di un rettangolo selezionato da a[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) struttura che specifica la parte del metafile, relativa al suo angolo superiore sinistro, da disegnare. |
| srcUnit | GraphicsUnit | Membro del[`GraphicsUnit`](../../graphicsunit) enumerazione che specifica l'unità di misura utilizzata per determinare la parte del metafile che il rettangolo specificato da*srcRect* parametro contiene. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Invia i record dell'oggetto specificato[`Metafile`](../../../system.drawing.imaging/metafile) , uno alla volta, a un metodo di callback per la visualizzazione in un rettangolo specificato utilizzando gli attributi dell'immagine specificati.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) enumerare. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) struttura che specifica la posizione e la dimensione del metafile disegnato. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) delegato che specifica il metodo a cui vengono inviati i record del metafile. |
| callbackData | IntPtr | Puntatore interno richiesto, ma ignorato. Puoi passareZero per questo parametro. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) che specifica le informazioni sugli attributi dell'immagine per l'immagine disegnata. |

### Guarda anche

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* spazio dei nomi [System.Drawing](../../graphics)
* assemblea [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
