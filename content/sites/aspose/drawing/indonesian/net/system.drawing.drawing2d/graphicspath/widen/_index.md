---
title: GraphicsPath.Widen
second_title: Aspose.Drawing untuk Referensi .NET API
description: GraphicsPath metode. Menambahkan kerangka tambahan ke jalur.
type: docs
weight: 360
url: /id/net/system.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

Menambahkan kerangka tambahan ke jalur.

```csharp
public void Widen(Pen pen)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| pen | Pen | APen yang menentukan lebar antara garis besar asli jalur dan garis besar baru yang dibuat metode ini. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| NotImplementedException | Metode tidak diterapkan. |

### Lihat juga

* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

Menambahkan kerangka tambahan keGraphicsPath .

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| pen | Pen | APen yang menentukan lebar antara garis besar asli jalur dan garis besar baru yang dibuat metode ini. |
| matrix | Matrix | AMatrix yang menentukan transformasi untuk diterapkan ke jalur sebelum pelebaran. |

### Lihat juga

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

Menggantikan iniGraphicsPath dengan kurva yang melingkupi area yang diisi saat jalur ini digambar dengan pena yang ditentukan.

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| pen | Pen | APen yang menentukan lebar antara garis besar asli jalur dan garis besar baru yang dibuat metode ini. |
| matrix | Matrix | AMatrix yang menentukan transformasi untuk diterapkan ke jalur sebelum pelebaran. |
| flatness | Single | Nilai yang menentukan kerataan untuk kurva. |

### Perkataan

Implementasi MS System.Drawing memanggil Flatten() di dalam Widen() atau menggunakan algoritma yang sama. Implementasi Aspose.Drawing menggunakan algoritma Skia tanpa mengganti kurva ke segmen garis. Ini mengabaikan`kebosanan` parameter.

### Lihat juga

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspath/)
* perakitan [Aspose.Drawing](../../../)


