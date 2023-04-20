---
title: Interface ICSSImportRule
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Css.ICSSImportRule antarmuka. Antarmuka CSSImportRule mewakili aturan import dalam lembar gaya CSS. Aturan import digunakan untuk mengimpor aturan gaya dari lembar gaya lain.
type: docs
weight: 560
url: /id/net/aspose.svg.dom.css/icssimportrule/
---
## ICSSImportRule interface

Antarmuka CSSImportRule mewakili aturan @import dalam lembar gaya CSS. Aturan @import digunakan untuk mengimpor aturan gaya dari lembar gaya lain.

```csharp
public interface ICSSImportRule : ICSSRule
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Href](../../aspose.svg.dom.css/icssimportrule/href/) { get; } | Lokasi style sheet yang akan diimpor. Atribut tidak akan berisi penentu "url(...)" di sekitar URI. |
| [Media](../../aspose.svg.dom.css/icssimportrule/media/) { get; } | Daftar jenis media yang mungkin menggunakan style sheet ini. |
| [StyleSheet](../../aspose.svg.dom.css/icssimportrule/stylesheet/) { get; } | Style sheet yang dirujuk oleh aturan ini, jika telah dimuat. Nilai atribut ini adalah null jika style sheet belum dimuat atau jika tidak akan dimuat (misalnya jika style sheet adalah untuk jenis media yang tidak didukung oleh agen pengguna). |

### Lihat juga

* interface [ICSSRule](../icssrule/)
* ruang nama [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* perakitan [Aspose.SVG](../../)


