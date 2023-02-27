---
title: Enum DetectAreasMode
second_title: Aspose.OCR untuk .NET API Referensi
description: Aspose.OCR.DetectAreasMode enum. Menentukan jenis jaringan neural yang digunakan untuk deteksi area.
type: docs
weight: 60
url: /id/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Menentukan jenis jaringan neural yang digunakan untuk deteksi area.

```csharp
public enum DetectAreasMode
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| NONE | `0` | Tidak mendeteksi paragraf. Lebih baik untuk dokumen satu kolom sederhana tanpa gambar. |
| DOCUMENT | `1` | Mendeteksi paragraf menggunakan model NN untuk dokumen. Lebih baik untuk dokumen multikolom, dokumen dengan gambar atau dengan objek bukan teks lainnya. |
| PHOTO | `2` | Mendeteksi paragraf menggunakan model NN untuk foto. Lebih baik untuk gambar dengan banyak gambar dan bukan objek teks lainnya. |
| COMBINE | `3` | Mendeteksi paragraf dengan teks lalu menggunakan model NN lain untuk mendeteksi area di dalam paragraf. Lebih baik untuk gambar dengan struktur kompleks. |
| TABLE | `4` | Mendeteksi sel dengan teks. Mode yang lebih disukai untuk gambar dengan struktur tabel. |
| CURVED_TEXT | `5` | Mendeteksi garis dan mengenali teks pada gambar melengkung. Mode pilihan untuk foto halaman buku dan majalah. |

### Perkataan

Digunakan di[`RecognitionSettings`](../recognitionsettings/) untuk menentukan jenis gambar yang ingin Anda kenali.

### Lihat juga

* ruang nama [Aspose.OCR](../../aspose.ocr/)
* perakitan [Aspose.OCR](../../)


