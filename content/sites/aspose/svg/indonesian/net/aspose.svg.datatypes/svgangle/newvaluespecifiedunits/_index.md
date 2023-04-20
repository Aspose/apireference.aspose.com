---
title: SVGAngle.NewValueSpecifiedUnits
second_title: Aspose.SVG untuk Referensi .NET API
description: SVGAngle metode. Setel ulang nilai sebagai angka dengan unitType terkait sehingga mengganti nilai untuk semua atribut pada objek.
type: docs
weight: 60
url: /id/net/aspose.svg.datatypes/svgangle/newvaluespecifiedunits/
---
## SVGAngle.NewValueSpecifiedUnits method

Setel ulang nilai sebagai angka dengan unitType terkait, sehingga mengganti nilai untuk semua atribut pada objek.

```csharp
public void NewValueSpecifiedUnits(ushort newUnitType, float valueInSpecifiedUnits)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| newUnitType | UInt16 | Jenis satuan untuk nilai (misalnya, SVG_ANGLETYPE_DEG). |
| valueInSpecifiedUnits | Single | Nilai sudut. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Kode [`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Dimunculkan jika unitType adalah SVG_ANGLETYPE_UNKNOWN atau bukan konstanta tipe unit yang valid (salah satu dari konstanta SVG_ANGLETYPE_* lain yang ditentukan pada antarmuka ini). |
| [DOMException](../../../aspose.svg.dom/domexception/) | Kode [`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Dibesarkan saat sudut sesuai dengan atribut hanya baca atau saat objek itu sendiri hanya dapat dibaca. |

### Lihat juga

* class [SVGAngle](../)
* ruang nama [Aspose.Svg.DataTypes](../../svgangle/)
* perakitan [Aspose.SVG](../../../)


