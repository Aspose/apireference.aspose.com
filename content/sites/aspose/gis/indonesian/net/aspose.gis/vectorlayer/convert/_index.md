---
title: VectorLayer.Convert
second_title: Aspose.GIS untuk Referensi .NET API
description: VectorLayer metode. Mengonversi layer ke format lain.
type: docs
weight: 200
url: /id/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Mengonversi layer ke format lain.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| sourcePath | String | Path ke layer yang akan dikonversi. |
| sourceDriver | FileDriver | Driver format untuk lapisan sumber. |
| destinationPath | String | Jalur ke lapisan yang akan dibuat sebagai hasil konversi. |
| destinationDriver | FileDriver | Driver format untuk layer tujuan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Salah satu dari jalan adalah`null`. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Mengonversi layer ke format lain.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| sourcePath | AbstractPath | Path ke layer yang akan dikonversi. |
| sourceDriver | FileDriver | Driver format untuk lapisan sumber. |
| destinationPath | AbstractPath | Jalur ke lapisan yang akan dibuat sebagai hasil konversi. |
| destinationDriver | FileDriver | Driver format untuk layer tujuan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Salah satu dari jalan adalah`null`. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Mengonversi layer ke format lain.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| sourcePath | String | Path ke layer yang akan dikonversi. |
| sourceDriver | FileDriver | Driver format untuk lapisan sumber. |
| destinationPath | String | Jalur ke lapisan yang akan dibuat sebagai hasil konversi. |
| destinationDriver | FileDriver | Driver format untuk layer tujuan. |
| options | ConversionOptions | Opsi untuk prosedur konversi. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Salah satu dari jalan adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial ditentukan di*options* tidak didukung oleh*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi geometri fitur dari sistem referensi spasial sumber ke sistem referensi spasial target gagal. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Mengonversi layer ke format lain.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| sourcePath | AbstractPath | Path ke layer yang akan dikonversi. |
| sourceDriver | FileDriver | Driver format untuk lapisan sumber. |
| destinationPath | AbstractPath | Jalur ke lapisan yang akan dibuat sebagai hasil konversi. |
| destinationDriver | FileDriver | Driver format untuk layer tujuan. |
| options | ConversionOptions | Opsi untuk prosedur konversi. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Salah satu dari jalan adalah`null`. |
| ArgumentException | Objek opsi memiliki tipe yang salah untuk driver ini. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| NotSupportedException | Sistem referensi spasial ditentukan di*options* tidak didukung oleh*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi geometri fitur dari sistem referensi spasial sumber ke sistem referensi spasial target gagal. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)


