---
title: FileDriver.CreateLayer
second_title: Aspose.GIS untuk Referensi .NET API
description: FileDriver metode. Membuat layer dan membukanya untuk ditambahkan.
type: docs
weight: 60
url: /id/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(string path)
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
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuat lapisan vektor (lihat[`CanCreateLayers`](../cancreatelayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuat lapisan vektor (lihat[`CanCreateLayers`](../cancreatelayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
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
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuat lapisan vektor (lihat[`CanCreateLayers`](../cancreatelayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
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
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Pengemudi tidak dapat membuat lapisan vektor (lihat[`CanCreateLayers`](../cancreatelayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| options | DriverOptions | Opsi khusus pengemudi. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |
| NotSupportedException | Pengemudi tidak dapat membuat lapisan vektor (lihat[`CanCreateLayers`](../cancreatelayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| options | DriverOptions | Opsi khusus pengemudi. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../../vectorlayer/).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |
| NotSupportedException | Pengemudi tidak dapat membuat lapisan vektor (lihat[`CanCreateLayers`](../cancreatelayers/)). |

### Lihat juga

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* ruang nama [Aspose.Gis](../../filedriver/)
* perakitan [Aspose.GIS](../../../)


