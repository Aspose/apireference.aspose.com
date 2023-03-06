---
title: FileDriver.OpenLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: FileDriver metode. Membuka lapisan untuk dibaca.
type: docs
weight: 90
url: /id/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Membuka lapisan untuk dibaca.

```csharp
public VectorLayer OpenLayer(string path)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca fitur dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuka lapisan vektor (lihat[`CanOpenLayers`](../canopenlayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Membuka lapisan untuk dibaca.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca fitur dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuka lapisan vektor (lihat[`CanOpenLayers`](../canopenlayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Membuka lapisan untuk dibaca.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
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
| NotSupportedException | Pengemudi tidak dapat membuka lapisan vektor (lihat[`CanOpenLayers`](../canopenlayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Membuka lapisan untuk dibaca.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
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
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuka lapisan vektor (lihat[`CanOpenLayers`](../canopenlayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)


