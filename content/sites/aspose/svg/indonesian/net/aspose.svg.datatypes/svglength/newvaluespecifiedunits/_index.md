---
title: SVGLength.NewValueSpecifiedUnits
second_title: Aspose.SVG untuk Referensi .NET API
description: SVGLength metode. Setel ulang nilai sebagai angka dengan unitType terkait sehingga mengganti nilai untuk semua atribut pada objek.
type: docs
weight: 60
url: /id/net/aspose.svg.datatypes/svglength/newvaluespecifiedunits/
---
## SVGLength.NewValueSpecifiedUnits method

Setel ulang nilai sebagai angka dengan unitType terkait, sehingga mengganti nilai untuk semua atribut pada objek.

```csharp
public void NewValueSpecifiedUnits(ushort unitType, float valueInSpecifiedUnits)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| unitType | UInt16 | Jenis unit untuk nilai. |
| valueInSpecifiedUnits | Single | Nilai baru.. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Kode [`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Dimunculkan jika unitType adalah SVG_LENGTHTYPE_UNKNOWN atau bukan konstanta tipe unit yang valid (salah satu dari konstanta SVG_LENGTHTYPE_* lain yang ditentukan pada antarmuka ini). |
| [DOMException](../../../aspose.svg.dom/domexception/) | Kode [`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Dibesarkan saat panjangnya sesuai dengan atribut hanya baca atau saat objek itu sendiri hanya baca. |

### Lihat juga

* class [SVGLength](../)
* ruang nama [Aspose.Svg.DataTypes](../../svglength/)
* perakitan [Aspose.SVG](../../../)


