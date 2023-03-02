---
title: FeaturesSequence.SaveTo
second_title: Aspose.GIS untuk Referensi .NET API
description: FeaturesSequence metode. Menyimpan urutan fitur ke lapisan.
type: docs
weight: 50
url: /id/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Menyimpan urutan fitur ke lapisan.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| destinationPath | String | Jalur ke lapisan keluaran. |
| destinationDriver | FileDriver | Driver format untuk lapisan output. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen apa pun`null`. |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi geometri fitur dari sistem referensi spasial sumber ke sistem referensi spasial target gagal. |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* ruang nama [Aspose.Gis](../../featuressequence/)
* perakitan [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Menyimpan urutan fitur ke lapisan.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| destinationPath | AbstractPath | Jalur ke lapisan keluaran. |
| destinationDriver | FileDriver | Driver format untuk lapisan output. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi geometri fitur dari sistem referensi spasial sumber ke sistem referensi spasial target gagal. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* ruang nama [Aspose.Gis](../../featuressequence/)
* perakitan [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Menyimpan urutan fitur ke lapisan.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| destinationPath | String | Jalur ke lapisan keluaran. |
| destinationDriver | FileDriver | Driver format untuk lapisan output. |
| options | SavingOptions | Opsi untuk prosedur penyimpanan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi geometri fitur dari sistem referensi spasial sumber ke sistem referensi spasial target gagal. |
| NotSupportedException | Sistem referensi spasial ditentukan di*options* tidak didukung oleh*destinationDriver* . |

### Lihat juga

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* ruang nama [Aspose.Gis](../../featuressequence/)
* perakitan [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Menyimpan urutan fitur ke lapisan.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| destinationPath | AbstractPath | Jalur ke lapisan keluaran. |
| destinationDriver | FileDriver | Driver format untuk lapisan output. |
| options | SavingOptions | Opsi untuk prosedur penyimpanan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [GisException](../../gisexception/) | Kesalahan membaca atau menulis fitur ke/dari file. |
| IOException | Terjadi kesalahan I/O. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformasi geometri fitur dari sistem referensi spasial sumber ke sistem referensi spasial target gagal. |
| NotSupportedException | Sistem referensi spasial ditentukan di*options* tidak didukung oleh*destinationDriver* . |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* ruang nama [Aspose.Gis](../../featuressequence/)
* perakitan [Aspose.GIS](../../../)


