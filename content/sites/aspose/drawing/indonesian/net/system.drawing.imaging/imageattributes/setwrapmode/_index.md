---
title: ImageAttributes.SetWrapMode
second_title: Aspose.Drawing untuk Referensi .NET API
description: ImageAttributes metode. Mengatur mode bungkus yang digunakan untuk memutuskan cara menyusun tekstur melintasi bentuk atau pada batas bentuk. Tekstur disusun melintasi bentuk untuk mengisinya saat tekstur lebih kecil dari bentuk yang diisi.
type: docs
weight: 240
url: /id/net/system.drawing.imaging/imageattributes/setwrapmode/
---
## SetWrapMode(WrapMode) {#setwrapmode}

Mengatur mode bungkus yang digunakan untuk memutuskan cara menyusun tekstur melintasi bentuk, atau pada batas bentuk. Tekstur disusun melintasi bentuk untuk mengisinya saat tekstur lebih kecil dari bentuk yang diisi.

```csharp
public void SetWrapMode(WrapMode mode)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| mode | WrapMode | Elemen dariWrapMode yang menentukan bagaimana salinan berulang dari image digunakan untuk menyusun suatu area. |

### Lihat juga

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* class [ImageAttributes](../)
* ruang nama [System.Drawing.Imaging](../../imageattributes/)
* perakitan [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color) {#setwrapmode_1}

Mengatur mode pembungkusan dan warna yang digunakan untuk menentukan cara menyusun tekstur di seluruh bentuk, atau pada batas bentuk. Sebuah tekstur disusun di atas bentuk untuk diisi ketika tekstur lebih kecil dari bentuk yang diisi.

```csharp
public void SetWrapMode(WrapMode mode, Color color)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| mode | WrapMode | Elemen dariWrapMode yang menentukan bagaimana salinan berulang dari image digunakan untuk menyusun suatu area. |
| color | Color | SebuahColorobjek yang menentukan warna piksel di luar gambar yang dirender. Warna ini terlihat jika parameter mode diatur keClamp dan persegi panjang sumber meneruskan ke[`DrawImage`](../../../system.drawing/graphics/drawimage/) lebih besar dari gambar itu sendiri. |

### Lihat juga

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* ruang nama [System.Drawing.Imaging](../../imageattributes/)
* perakitan [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color, bool) {#setwrapmode_2}

Mengatur mode pembungkusan dan warna yang digunakan untuk menentukan cara menyusun tekstur di seluruh bentuk, atau pada batas bentuk. Sebuah tekstur disusun di atas bentuk untuk diisi ketika tekstur lebih kecil dari bentuk yang diisi.

```csharp
public void SetWrapMode(WrapMode mode, Color color, bool clamp)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| mode | WrapMode | Elemen dariWrapMode yang menentukan bagaimana salinan berulang dari image digunakan untuk menyusun suatu area. |
| color | Color | Objek warna yang menentukan warna piksel di luar gambar yang dirender. Warna ini terlihat jika parameter mode diatur keClamp dan persegi panjang sumber diteruskan ke[`DrawImage`](../../../system.drawing/graphics/drawimage/) lebih besar dari gambar itu sendiri. |
| clamp | Boolean | Parameter ini tidak berpengaruh. Setel ke salah. |

### Lihat juga

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* ruang nama [System.Drawing.Imaging](../../imageattributes/)
* perakitan [Aspose.Drawing](../../../)


