---
title: Class TypeInfo
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.TypeInfo kelas. TypeInfo merepresentasikan tipe yang direferensikan dari node Element atau Attr ditentukan dalam skema yang terkait dengan dokumen.
type: docs
weight: 1280
url: /id/net/aspose.svg.dom/typeinfo/
---
## TypeInfo class

TypeInfo merepresentasikan tipe yang direferensikan dari node Element atau Attr, ditentukan dalam skema yang terkait dengan dokumen.

```csharp
public class TypeInfo : DOMObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [TypeName](../../aspose.svg.dom/typeinfo/typename/) { get; } | Nama tipe yang dideklarasikan untuk elemen atau atribut terkait, atau null jika tidak diketahui. |
| [TypeNamespace](../../aspose.svg.dom/typeinfo/typenamespace/) { get; } | Mendapat namespace tipe. Namespace dari tipe yang dideklarasikan untuk elemen atau atribut terkait atau null jika elemen tidak memiliki deklarasi atau jika tidak ada informasi namespace yang tersedia. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |
| [IsDerivedFrom](../../aspose.svg.dom/typeinfo/isderivedfrom/)(string, string, ulong) | Metode ini kembali jika ada turunan antara definisi tipe referensi, yaitu TypeInfo tempat metode dipanggil, dan definisi tipe lainnya, yaitu yang diteruskan sebagai parameter. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.svg.dom/typeinfo/derivation_extension/) | Jika skema dokumen adalah Skema XML [Skema XML Bagian 1], konstanta ini merepresentasikan derivasi dengan ekstensi. |
| const [DERIVATION_LIST](../../aspose.svg.dom/typeinfo/derivation_list/) | Jika skema dokumen adalah Skema XML [Skema XML Bagian 1], konstanta ini mewakili daftar. |
| const [DERIVATION_RESTRICTION](../../aspose.svg.dom/typeinfo/derivation_restriction/) | Jika skema dokumen adalah Skema XML [Skema XML Bagian 1], konstanta ini merepresentasikan derivasi dengan pembatasan jika melibatkan tipe kompleks, atau pembatasan jika melibatkan tipe sederhana. |
| const [DERIVATION_UNION](../../aspose.svg.dom/typeinfo/derivation_union/) | Jika skema dokumen adalah Skema XML [Skema XML Bagian 1], konstanta ini mewakili penyatuan jika tipe sederhana terlibat. |

### Lihat juga

* class [DOMObject](../domobject/)
* ruang nama [Aspose.Svg.Dom](../../aspose.svg.dom/)
* perakitan [Aspose.SVG](../../)


