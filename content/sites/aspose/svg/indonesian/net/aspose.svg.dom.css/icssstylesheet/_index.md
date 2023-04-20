---
title: Interface ICSSStyleSheet
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Css.ICSSStyleSheet antarmuka. Antarmuka CSSStyleSheet adalah antarmuka konkret yang digunakan untuk mewakili lembar gaya CSS yaitu lembar gaya yang jenis kontennya adalah teks/css.
type: docs
weight: 660
url: /id/net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

Antarmuka CSSStyleSheet adalah antarmuka konkret yang digunakan untuk mewakili lembar gaya CSS yaitu, lembar gaya yang jenis kontennya adalah "teks/css".

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | Daftar semua aturan CSS yang ada di dalam style sheet. Ini termasuk kumpulan aturan dan at-rules. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | Jika style sheet ini berasal dari aturan @import, atribut ownerRule akan berisi CSSImportRule. Dalam hal ini, atribut ownerNode di antarmuka StyleSheet akan menjadi nol. Jika style sheet berasal dari elemen atau instruksi pemrosesan, atribut ownerRule akan menjadi null dan atribut ownerNode akan berisi Node. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | Digunakan untuk menghapus aturan dari style sheet. |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | Digunakan untuk menyisipkan aturan baru ke dalam style sheet. Aturan baru sekarang menjadi bagian dari kaskade. |

### Lihat juga

* interface [IStyleSheet](../istylesheet/)
* ruang nama [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* perakitan [Aspose.SVG](../../)


