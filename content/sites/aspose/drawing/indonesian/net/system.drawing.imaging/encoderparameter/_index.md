---
title: Class EncoderParameter
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.EncoderParameter kelas. Digunakan untuk meneruskan nilai atau larik nilai ke encoder gambar.
type: docs
weight: 700
url: /id/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Digunakan untuk meneruskan nilai, atau larik nilai, ke encoder gambar.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | Menginisialisasi instance baru dari`EncoderParameter` kelas dengan yang ditentukanEncoder object dan satu integer 8-bit yang tidak ditandatangani. MengaturValueType properti keValueTypeByte , dan mengaturNumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan array bilangan bulat 8-bit yang tidak ditandatangani. MengaturValueType properti untukValueTypeByte , dan aturNumberOfValues properti ke jumlah elemen dalam array. |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan satu bilangan bulat 64-bit. MengaturValueType properti keValueTypeLong (32 bit), dan atur the NumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan array bilangan bulat 64-bit. MengaturValueType properti keValueTypeLong (32-bit), dan sets ituNumberOfValues properti ke jumlah elemen dalam array. |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan satu, bilangan bulat 16-bit. MengaturValueType properti keValueTypeShort , dan mengaturNumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan array bilangan bulat 16-bit. MengaturValueType properti keValueTypeShort , dan atur the NumberOfValues properti ke jumlah elemen dalam array. |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan string karakter. String diubah menjadi string ASCII yang diakhiri null sebelum disimpan diEncoderParameter obyek. MengaturValueType properti keValueTypeAscii , dan sets ituNumberOfValues properti dengan panjang string ASCII termasuk terminator NULL. |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan satu nilai 8-bit. MengaturValueType properti keValueTypeUndefined atauValueTypeByte , dan aturNumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan array byte. MengaturValueType properti keValueTypeUndefined or ValueTypeByte , dan mengaturNumberOfValues properti ke jumlah elemen dalam array. |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoderobjek dan sepasang bilangan bulat 32-bit. Pasangan bilangan bulat mewakili pecahan, bilangan bulat pertama menjadi pembilang, dan bilangan bulat kedua menjadi penyebut. MenetapkanValueType properti untukValueTypeRational , dan aturNumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan dua larik bilangan bulat 32-bit. Kedua larik mewakili larik pecahan. MengaturValueType properti untukValueTypeRational , dan aturNumberOfValuesproperti ke jumlah elemen di*numerator* array, yang harus sama dengan jumlah elemen di*denominator* Himpunan. |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan sepasang bilangan bulat 64-bit. Pasangan bilangan bulat mewakili rentang bilangan bulat, bilangan bulat pertama adalah angka terkecil dalam rentang, dan bilangan bulat kedua adalah angka terbesar dalam rentang. MengaturValueType properti untukValueTypeLongRange , dan aturNumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan dua larik bilangan bulat 64-bit. Kedua larik mewakili larik integer ranges. MengaturValueType properti untukValueTypeLongRange , dan aturNumberOfValuesproperti ke jumlah elemen di*rangebegin* array, yang harus sama dengan jumlah elemen di*rangeend* larik. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan tiga bilangan bulat yang menentukan jumlah nilai, tipe data dari nilai, dan pointer ke nilai yang disimpan diEncoderParameter objek. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan empat, bilangan bulat 32-bit. Empat bilangan bulat mewakili rentang pecahan. Dua bilangan bulat pertama mewakili pecahan terkecil dalam rentang tersebut, dan dua bilangan bulat lainnya mewakili pecahan terbesar dalam rentang tersebut. MengaturValueType properti ke ValueTypeRationalRange , dan sets ituNumberOfValues properti ke 1. |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | Menginisialisasi instance baru dari`EncoderParameter`kelas dengan yang ditentukan Encoder objek dan empat larik bilangan bulat 32-bit. Empat larik mewakili larik rentang rasional. Rentang rasional adalah himpunan semua pecahan dari nilai pecahan minimum hingga nilai pecahan maksimum. AturValueType properti untukValueTypeRationalRange , dan aturNumberOfValues properti dengan jumlah elemen in tersebut*numerator1* array, yang harus sama dengan jumlah elemen di tiga array lainnya. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | Mendapat atau menyetelEncoder objek yang terkait dengan iniEncoderParameter objek. ItuEncoder objek merangkum pengidentifikasi unik global (GUID) yang menentukan kategori (misalnyaQuality ,ColorDepth , atauCompression ) dari parameter yang disimpan di siniEncoderParameter objek. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | Mendapat jumlah elemen dalam larik nilai yang disimpan di dalamnyaEncoderParameter objek. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | Merilis semua sumber daya yang digunakan oleh iniEncoderParameter objek. |

### Lihat juga

* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


