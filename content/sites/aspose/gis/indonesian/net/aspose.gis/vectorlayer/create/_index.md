---
title: VectorLayer.Create
second_title: Aspose.GIS untuk Referensi .NET API
description: VectorLayer metode. Membuat layer dan membukanya untuk menambahkan fitur baru.
type: docs
weight: 10
url: /id/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Membuat layer dan membukanya untuk menambahkan fitur baru.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |

### Nilai Pengembalian

Lapisan hanya tulis.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Membuat layer dan membukanya untuk menambahkan fitur baru.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |
| options | DriverOptions | Opsi khusus pengemudi. |

### Nilai Pengembalian

Lapisan hanya tulis.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Membuat layer dan membukanya untuk menambahkan fitur baru.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |

### Nilai Pengembalian

Lapisan hanya tulis.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Membuat layer dan membukanya untuk menambahkan fitur baru.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |
| options | DriverOptions | Opsi khusus pengemudi. |

### Nilai Pengembalian

Lapisan hanya tulis.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Terjadi kesalahan saat menulis fitur ke file. |
| IOException | Terjadi kesalahan I/O. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | String | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |
| options | DriverOptions | Opsi khusus pengemudi. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Membuat layer dan membukanya untuk ditambahkan.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | AbstractPath | Jalur ke file. |
| driver | FileDriver | Sopir untuk digunakan. |
| options | DriverOptions | Opsi khusus pengemudi. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem referensi spasial. |

### Nilai Pengembalian

Contoh dari[`VectorLayer`](../).

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Jalannya adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial tidak didukung oleh driver. Gunakan[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) untuk memeriksa apakah sistem referensi spasial didukung. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)


