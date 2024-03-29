---
title: KeySize
second_title: Aspose.PDF for .NET API Referansı
description: Pdf belgelerini şifrelemek için kullanılabilecek farklı anahtar boyutlarını tanımlar.
type: docs
weight: 2400
url: /tr/net/aspose.pdf.facades/keysize/
---
## KeySize enumeration

Pdf belgelerini şifrelemek için kullanılabilecek farklı anahtar boyutlarını tanımlar.

```csharp
public enum KeySize
```

### değerler

| İsim | Değer | Tanım |
| --- | --- | --- |
| x40 | `0` | 40 bit anahtarı. Bu anahtar boyutu, RC4 algoritması ile kullanılır ve düşük düzeyde güvenlik sağlar. Yine de pdf belgelerinin eski sürümleri yalnızca bu tür anahtarlarla şifrelenebilir (v. 1.3 ve altı); |
| x128 | `1` | 128 bit anahtarı. Hem RC4 hem de AES algoritmaları bu tür anahtar boyutunu kullanabilir. |
| x256 | `2` | 256 bit anahtar. Bu tür anahtar boyutu yalnızca AES ile kullanılabilir ve son Adobe Reader sürümleriyle (v.9'dan başlayarak) tanınır. |

### Ayrıca bakınız

* ad alanı [Aspose.Pdf.Facades](../../aspose.pdf.facades)
* toplantı [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
