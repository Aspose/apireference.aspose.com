---
title: Bitmap
second_title: Aspose.Drawing for .NET API Referansı
description: Yeni bir örneğini başlatırBitmapsystem.drawing/bitmap belirtilen boyuta sahip sınıf.
type: docs
weight: 10
url: /tr/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen boyuta sahip sınıf.

```csharp
public Bitmap(int width, int height)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| width | Int32 | Yeni Bitmap'in piksel cinsinden genişliği. |
| height | Int32 | Yeni Bitmap'in piksel cinsinden yüksekliği. |

### Notlar

Şu anda desteklenen tek dahili bit eşlem biçimi şuna eşdeğerdir:`PixelFormat.Format32bppPARrgb` .

### Ayrıca bakınız

* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen dosyadan sınıf.

```csharp
public Bitmap(string filename)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filename | String | Bit eşlem dosyasının adı. |

### Ayrıca bakınız

* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen dosyadan sınıf.

```csharp
public Bitmap(string filename, bool useIcm)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filename | String | Bit eşlem dosyasının adı. |
| useIcm | Boolean | bunun için renk düzeltmeyi kullanmak doğruBitmap; aksi halde yanlış. |

### Ayrıca bakınız

* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen veri akışından sınıf.

```csharp
public Bitmap(Stream stream)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | Stream | Görüntüyü yüklemek için kullanılan veri akışı. |

### Ayrıca bakınız

* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen veri akışından sınıf.

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | Stream | Görüntüyü yüklemek için kullanılan veri akışı. |
| useIcm | Boolean | `doğru` bunun için renk düzeltmeyi kullanmak içinBitmap ; aksi halde,`yanlış`. |

### Ayrıca bakınız

* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen boyut ve biçime sahip sınıf.

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| width | Int32 | Yeni görüntünün piksel cinsinden genişliğiBitmap. |
| height | Int32 | Yeni öğenin piksel cinsinden yüksekliğiBitmap. |
| format | PixelFormat | buPixelFormat yeni için numaralandırmaBitmap. |

### Ayrıca bakınız

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen boyut ve piksel verisine sahip sınıf.

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| width | Int32 | Yeni görüntünün piksel cinsinden genişliğiBitmap. |
| height | Int32 | Yeni öğenin piksel cinsinden yüksekliğiBitmap. |
| stride | Int32 | Bir tarama satırının başlangıcı ile sonraki arasındaki bayt ofseti dördün katı olmalıdır. |
| format | PixelFormat | buPixelFormat yeni için numaralandırmaBitmap. |
| data | Int32[] | Piksel verileri. |

### Ayrıca bakınız

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat)
* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen mevcut görüntüden sınıf.

```csharp
public Bitmap(Image original)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| original | Image | buImage hangi yeni oluşturmak içinBitmap. |

### Ayrıca bakınız

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap)belirtilen boyuta ölçeklenmiş, belirtilen mevcut görüntüden sınıf.

```csharp
public Bitmap(Image original, Size newSize)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| original | Image | buImage hangi yeni oluşturmak içinBitmap |
| newSize | Size | buSize yeni boyutunu temsil eden yapıBitmap. |

### Ayrıca bakınız

* class [Image](../../image)
* struct [Size](../../size)
* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

Yeni bir örneğini başlatır[`Bitmap`](../../bitmap) belirtilen mevcut görüntüden sınıf, belirtilen boyuta ölçeklendi.

```csharp
public Bitmap(Image original, int width, int height)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| original | Image | buImage hangi yeni oluşturmak içinBitmap. |
| width | Int32 | Yeni görüntünün piksel cinsinden genişliğiBitmap. |
| height | Int32 | Yeni öğenin piksel cinsinden yüksekliğiBitmap. |

### Ayrıca bakınız

* class [Image](../../image)
* class [Bitmap](../../bitmap)
* ad alanı [System.Drawing](../../bitmap)
* toplantı [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
