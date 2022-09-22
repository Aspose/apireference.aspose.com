---
title: EnumerateMetafile
second_title: Aspose.Drawing for .NET API Referansı
description: Belirtilen dizindeki kayıtları gönderirMetafilesystem.drawing.imaging/metafile  belirli bir noktada belirtilen görüntü özniteliklerini kullanarak görüntülemek için bir geri arama method için birer birer.
type: docs
weight: 460
url: /tr/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada belirtilen görüntü özniteliklerini kullanarak görüntülemek için bir geri arama method için birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | PointF | [`PointF`](../../pointf) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | PointF | [`PointF`](../../pointf) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | PointF[] | üçlü dizi[`PointF`](../../pointf) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | Point | [`Point`](../../point) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | Point | [`Point`](../../point) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) belirtilen görüntü özniteliklerini kullanarak belirli bir noktada görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | Point | [`Point`](../../point) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | PointF | [`PointF`](../../pointf) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | PointF[] | üçlü dizi[`PointF`](../../pointf) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | Point[] | üçlü dizi[`Point`](../../point) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | Point[] | üçlü dizi[`Point`](../../point) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | Point[] | üçlü dizi[`Point`](../../point) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| unit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | Point[] | üçlü dizi[`Point`](../../point) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | Point[] | üçlü dizi[`Point`](../../point) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | PointF[] | üçlü dizi[`PointF`](../../pointf) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| unit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | PointF[] | üçlü dizi[`PointF`](../../pointf) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

Bir S'den seçilen bir dikdörtgendeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | PointF[] | üçlü dizi[`PointF`](../../pointf) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| unit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | PointF[] | üçlü dizi[`PointF`](../../pointf) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| unit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) belirtilen görüntü özniteliklerini kullanarak belirli bir noktada görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | Point | [`Point`](../../point) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| unit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | Point | [`Point`](../../point) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | Point | [`Point`](../../point) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| srcRect | Rectangle | [`Rectangle`](../../rectangle) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* struct [Rectangle](../../rectangle)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | Rectangle | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) belirtilen görüntü özniteliklerini kullanarak belirli bir noktada görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | PointF | [`PointF`](../../pointf) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| unit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | PointF | [`PointF`](../../pointf) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

Seçilen bir dikdörtgendeki kayıtları bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir noktada görüntülenmek üzere bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoint | PointF | [`PointF`](../../pointf) çizilen meta dosyasının sol üst köşesinin konumunu belirten yapı. |
| srcRect | RectangleF | Meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten System.Drawing.RectangleF yapısı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [PointF](../../pointf)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

Belirtilen dizindeki kayıtları gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü özniteliklerini kullanarak belirli bir paralelkenarda görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destPoints | Point[] | üçlü dizi[`Point`](../../point) çizilen meta dosyasının boyutunu ve konumunu belirleyen bir paralelkenar tanımlayan yapılar. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Point](../../point)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

Seçilen bir dikdörtgenin kayıtlarını bir[`Metafile`](../../../system.drawing.imaging/metafile) , belirli bir dikdörtgende görüntülemek için bir geri arama yöntemine birer birer.

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | RectangleF | [`RectangleF`](../../rectanglef) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef) meta dosyasının sol üst köşesine göre çizilecek bölümünü belirten yapı. |
| srcUnit | GraphicsUnit | Üyesi[`GraphicsUnit`](../../graphicsunit) tarafından belirtilen dikdörtgenin meta dosyasının bölümünü belirlemek için kullanılan ölçü birimini belirten numaralandırma.*srcRect* parametre içerir. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [RectangleF](../../rectanglef)
* enum [GraphicsUnit](../../graphicsunit)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

Belirtilenlerin kayıtlarını gönderir[`Metafile`](../../../system.drawing.imaging/metafile) , birer birer, belirtilen görüntü niteliklerini kullanarak belirtilen bir dikdörtgende görüntülemek için bir geri arama yöntemine.

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile) saymak. |
| destRect | Rectangle | [`Rectangle`](../../rectangle) çizilen meta dosyasının konumunu ve boyutunu belirten yapı. |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc) meta dosyası kayıtlarının gönderileceği yöntemi belirten temsilci. |
| callbackData | IntPtr | Gerekli, ancak yoksayılan dahili işaretçi. GeçebilirsinZero bu parametre için. |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes) bu, çizilen görüntü için görüntü öznitelik bilgilerini belirtir. |

### Ayrıca bakınız

* class [Metafile](../../../system.drawing.imaging/metafile)
* struct [Rectangle](../../rectangle)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes)
* class [Graphics](../../graphics)
* ad alanı [System.Drawing](../../graphics)
* toplantı [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
