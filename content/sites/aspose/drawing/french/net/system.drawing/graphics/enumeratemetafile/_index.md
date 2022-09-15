---
title: EnumerateMetafile
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Envoie les enregistrements dans le format spécifiéMetafilesystem.drawing.imaging/metafile  un par un à une méthode de rappel pour un affichage à un point spécifié à laide des attributs dimage spécifiés.
type: docs
weight: 460
url: /fr/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | PointF | [`PointF`](../../pointf) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | PointF | [`PointF`](../../pointf) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | PointF[] | Tableau de trois[`PointF`](../../pointf) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | Point | [`Point`](../../point) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | Point | [`Point`](../../point) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide d'attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | Point | [`Point`](../../point) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Envoie les enregistrements du spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Envoie les enregistrements du spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Envoie les enregistrements du spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Envoie les enregistrements du spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | PointF | [`PointF`](../../pointf) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | PointF[] | Tableau de trois[`PointF`](../../pointf) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | Point[] | Tableau de trois[`Point`](../../point) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | Point[] | Tableau de trois[`Point`](../../point) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | Point[] | Tableau de trois[`Point`](../../point) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| unit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | Point[] | Tableau de trois[`Point`](../../point) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | Point[] | Tableau de trois[`Point`](../../point) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | PointF[] | Tableau de trois[`PointF`](../../pointf) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| unit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | PointF[] | Tableau de trois[`PointF`](../../pointf) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un S[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | PointF[] | Tableau de trois[`PointF`](../../pointf) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| unit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | PointF[] | Tableau de trois[`PointF`](../../pointf) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| unit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide d'attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | Point | [`Point`](../../point) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| unit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | Point | [`Point`](../../point) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | Point | [`Point`](../../point) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Envoie les enregistrements du spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide d'attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | PointF | [`PointF`](../../pointf) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| unit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | PointF | [`PointF`](../../pointf) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoint | PointF | [`PointF`](../../pointf) structure qui spécifie l'emplacement du coin supérieur gauche du métafichier dessiné. |
| srcRect | RectangleF | Structure System.Drawing.RectangleF qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Envoie les enregistrements dans le format spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destPoints | Point[] | Tableau de trois[`Point`](../../point) structures qui définissent un parallélogramme qui détermine la taille et l'emplacement du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) structure qui spécifie la partie du métafichier, par rapport à son coin supérieur gauche, à dessiner. |
| srcUnit | GraphicsUnit | Membre de la[`GraphicsUnit`](../../graphicsunit) énumération qui spécifie l'unité de mesure utilisée pour déterminer la partie du métafichier que le rectangle spécifié par le*srcRect* paramètre contient. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Envoie les enregistrements du spécifié[`Metafile`](../../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) à énumérer. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) structure qui spécifie l'emplacement et la taille du métafichier dessiné. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) délégué qui spécifie la méthode à laquelle les enregistrements de métafichier sont envoyés. |
| callbackData | IntPtr | Pointeur interne requis, mais ignoré. Tu peux passerZero pour ce paramètre. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) qui spécifie les informations d'attribut d'image pour l'image dessinée. |

### Voir également

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* espace de noms [System.Drawing](../../graphics)
* Assemblée [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
