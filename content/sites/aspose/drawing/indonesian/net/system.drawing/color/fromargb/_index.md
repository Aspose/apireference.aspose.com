---
title: Color.FromArgb
second_title: Aspose.Drawing untuk Referensi .NET API
description: Color metode. Membuat aColor struktur dari nilai ARGB 32bit.
type: docs
weight: 1430
url: /id/net/system.drawing/color/fromargb/
---
## FromArgb(int) {#fromargb}

Membuat aColor struktur dari nilai ARGB 32-bit.

```csharp
public static Color FromArgb(int argb)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| argb | Int32 | Nilai yang menentukan nilai ARGB 32-bit. |

### Nilai Pengembalian

ItuColor struktur yang diciptakan metode ini.

### Lihat juga

* struct [Color](../)
* ruang nama [System.Drawing](../../color/)
* perakitan [Aspose.Drawing](../../../)

---

## FromArgb(int, Color) {#fromargb_3}

Membuat aColor struktur dari yang ditentukanColorstructure, tetapi dengan nilai alpha baru yang ditentukan. Meskipun metode ini memungkinkan nilai 32-bit dilewatkan untuk nilai alfa, nilainya dibatasi hingga 8 bit.

```csharp
public static Color FromArgb(int alpha, Color baseColor)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| alpha | Int32 | Nilai alfa untuk yang baruColor. Nilai yang valid adalah 0 hingga 255. |
| baseColor | Color | ItuColor dari mana untuk membuat yang baruColor. |

### Nilai Pengembalian

ItuColor yang dibuat oleh metode ini.

### Lihat juga

* struct [Color](../)
* ruang nama [System.Drawing](../../color/)
* perakitan [Aspose.Drawing](../../../)

---

## FromArgb(int, int, int) {#fromargb_1}

Membuat aColor struktur dari nilai warna 8-bit yang ditentukan (merah, hijau, dan biru). Nilai alfa secara implisit 255 (sepenuhnya buram). Meskipun metode ini memungkinkan nilai 32-bit dilewatkan untuk setiap komponen warna, nilai setiap komponen dibatasi hingga 8 bit.

```csharp
public static Color FromArgb(int red, int green, int blue)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| red | Int32 | Nilai komponen merah untuk yang baruColor. Nilai yang valid adalah 0 hingga 255. |
| green | Int32 | Nilai komponen hijau untuk yang baruColor. Nilai yang valid adalah 0 hingga 255. |
| blue | Int32 | Nilai komponen biru untuk yang baruColor. Nilai yang valid adalah 0 hingga 255. |

### Nilai Pengembalian

ItuColor yang dibuat oleh metode ini.

### Lihat juga

* struct [Color](../)
* ruang nama [System.Drawing](../../color/)
* perakitan [Aspose.Drawing](../../../)

---

## FromArgb(int, int, int, int) {#fromargb_2}

Membuat struktur Warna dari empat nilai komponen ARGB (alfa, merah, hijau, dan biru). Meskipun metode ini memungkinkan nilai 32-bit dilewatkan untuk setiap komponen, nilai setiap komponen dibatasi hingga 8 bit .

```csharp
public static Color FromArgb(int alpha, int red, int green, int blue)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| alpha | Int32 | Komponen alfa. Nilai yang valid adalah 0 hingga 255. |
| red | Int32 | Komponen merah. Nilai yang valid adalah 0 hingga 255. |
| green | Int32 | Komponen hijau. Nilai yang valid adalah 0 hingga 255. |
| blue | Int32 | Komponen biru. Nilai yang valid adalah 0 hingga 255. |

### Nilai Pengembalian

Warna yang dibuat oleh metode ini.

### Lihat juga

* struct [Color](../)
* ruang nama [System.Drawing](../../color/)
* perakitan [Aspose.Drawing](../../../)


