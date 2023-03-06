---
title: FileDriver.EditLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: FileDriver metode. Membuka lapisan untuk diedit.
type: docs
weight: 70
url: /id/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

Membuka lapisan untuk diedit.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| options | DriverOptions | Opsi khusus pengemudi. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca fitur dari file. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Membuka lapisan untuk diedit.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| options | DriverOptions | Opsi khusus pengemudi. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca fitur dari file. |
| NotSupportedException | Pengemudi tidak dapat mengedit lapisan. |
| IOException | Terjadi kesalahan I/O. |

### Perkataan

Pengemudi membuat lapisan dalam dengan semua fitur. Tetapi kami memiliki opsi untuk menggunakan ruang disk sebagai pengganti RAM. Ada driver untuk penggunaan sumber daya yang lebih optimal (lihat dokumentasi driver khusus). Driver juga dapat mengedit lapisan Jika dapat membuat dan membuka lapisan.

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)


