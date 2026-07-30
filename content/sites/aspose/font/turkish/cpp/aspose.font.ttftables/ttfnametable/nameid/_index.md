---
title: "Aspose::Font::TtfTables::TtfNameTable::NameId enum"
linktitle: "NameId"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfNameTable::NameId enum. C++'da NameId'yi temsil eder."
type: docs
weight: 1600
url: /tr/cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


[NameId](./) temsil eder.

```cpp
enum class NameId : uint16_t
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 Telif hakkı bildirimi. |
| FontFamily | 1 | 1 [Font](../../../aspose.font/font/) Ailesi. Bu dize, kullanıcının Macintosh platformlarında gördüğü [Font](../../../aspose.font/font/) aile adıdır. |
| FontSubfamily | 2 | 2 [Font](../../../aspose.font/font/) Alt Aile. Bu dize, kullanıcının Macintosh platformlarında gördüğü [Font](../../../aspose.font/font/) alt ailesidir. |
| UniqueFontId | 3 | 3 Benzersiz alt aile tanımlaması (Apple spec). 3 Benzersiz [Font](../../../aspose.font/font/) tanımlayıcısı (MS spec). |
| FullName | 4 | 4 [Font](../../../aspose.font/font/) tam adı. |
| Sürüm | 5 | 5 İsim tablosunun sürümü. |
| PostScriptName | 6 | 6 [Font](../../../aspose.font/font/) PostScript adı. Not: Bir [Font](../../../aspose.font/font/) yalnızca bir PostScript adına sahip olabilir ve bu ad ASCII olmalıdır. |
| TrademarkNotice | 7 | 7 Ticari marka bildirimi. |
| ManufacturerName | 8 | 8 Üretici adı. |
| DesignerName | 9 | 9 Designer; yazı tipinin tasarımcısının adı. |
| Açıklama | 10 | 10 Description; yazı tipinin açıklaması. Revizyon bilgileri, kullanım önerileri, tarihçe, özellikler ve benzeri içeriklere sahip olabilir. |
| UrlVendor | 11 | 11 URL'si [Font](../../../aspose.font/font/) satıcısının (protokolle birlikte, ör. [http://](http://), [ftp://](ftp://)). Eğer URL içinde benzersiz bir seri numarası gömülü ise, bu [Font](../../../aspose.font/font/) kaydetmek için kullanılabilir. |
| UrlDesigner | 12 | 12 URL'si [Font](../../../aspose.font/font/) tasarımcısının (protokolle birlikte, ör. [http://](http://), [ftp://](ftp://)) |
| LicenseDescription | 13 | 13 [License](../../../aspose.font/license/) açıklaması; [Font](../../../aspose.font/font/) nasıl yasal olarak kullanılabilir ya da lisanslı kullanım için farklı örnek senaryoların açıklaması. Bu alan sade bir dille, hukuki terimlerden kaçınarak yazılmalıdır. |
| LicenseInfoUrl | 14 | 14 [License](../../../aspose.font/license/) bilgi URL'si, ek lisans bilgilerine buradan ulaşılabilir. |
| PreferredFamily | 16 | 15 Reserved 16 Tercih Edilen Aile (yalnızca Windows); Windows'ta, Aile adı [Font](../../../aspose.font/font/) menüsünde gösterilir; Alt Aile adı Stil adı olarak sunulur. Tarihsel nedenlerle, [Font](../../../aspose.font/font/) aileleri en fazla dört stil içerir, ancak [Font](../../../aspose.font/font/) tasarımcıları bir aileye dörtten fazla yazı tipi gruplandırabilir. Tercih Edilen Aile ve Tercih Edilen Alt Aile kimlikleri, [Font](../../../aspose.font/font/) tasarımcılarının tercih edilen aile/alt aile gruplamalarını eklemelerine olanak tanır. Bu kimlikler yalnızca 1 ve 2 numaralı kimliklerden farklı olduğunda bulunur. |
| PreferredSubfamily | 17 | 17 Tercih Edilen Alt Aile (yalnızca Windows); Windows'ta, Aile adı [Font](../../../aspose.font/font/) menüsünde gösterilir; Alt Aile adı Stil adı olarak sunulur. Tarihsel nedenlerle, [Font](../../../aspose.font/font/) aileleri en fazla dört stil içerir, ancak [Font](../../../aspose.font/font/) tasarımcıları bir aileye dörtten fazla yazı tipi gruplandırabilir. Tercih Edilen Aile ve Tercih Edilen Alt Aile kimlikleri, [Font](../../../aspose.font/font/) tasarımcılarının tercih edilen aile/alt aile gruplamalarını eklemelerine olanak tanır. Bu kimlikler yalnızca 1 ve 2 numaralı kimliklerden farklı olduğunda bulunur. |
| CompatibleFull | 18 | 18 Uyumluluk Tam (yalnızca Macintosh); Macintosh'ta menü adı [Font](../../../aspose.font/font/) kaynağı kullanılarak oluşturulur. Bu genellikle Tam Ad ile eşleşir. Eğer [Font](../../../aspose.font/font/) adının Tam Ad'dan farklı görünmesini istiyorsanız, ID 18'de Uyumluluk Tam Adını ekleyebilirsiniz. Bu ad Mac OS tarafından kullanılmaz, ancak uygulama geliştiricileri (ör. Adobe) tarafından kullanılabilir. |
| SampleText | 19 | 19 Örnek metin. Bu, [Font](../../../aspose.font/font/) adı olabileceği gibi, tasarımcının [Font](../../../aspose.font/font/) nasıl göründüğünü göstermek için en iyi örnek metin olduğunu düşündüğü herhangi bir metin de olabilir. |
| PostScriptCID | 20 | Bir yazı tipinde bulunması, nameID 6'nın bir PostScript yazı tipi adı içerdiği ve bu adın, yazı tipini bir PostScript yorumlayıcısında çağırmak için “composefont” komutuyla kullanılmak üzere tasarlandığı anlamına gelir. |
| WwsFamilyName | 21 | ID'ler 16 ve 17 için girişler WWS modeline uymadığında, WWS uyumlu bir aile adı sağlamak için kullanılır. |
| WwsSubfamilyName | 22 | ID 21 ile birlikte kullanıldığında, bu kimlik ID'ler 16 ve 17 için girişler WWS modeline uymadığında yalnızca ağırlık, genişlik ve eğim özelliklerini yansıtan WWS uyumlu bir alt aile adı sağlar. |
| LightBackground | 23 | Bu kimlik, CPAL tablosunun Palet Etiketleri Dizisinde kullanılırsa, ilgili renk paletinin beyaz gibi açık bir arka plan üzerinde yazı tipini görüntülerken kullanılmaya uygun olduğunu belirtir. |
| DarkBackground | 24 | Bu kimlik, CPAL tablosunun Palet Etiketleri Dizisinde kullanılırsa, ilgili renk paletinin siyah gibi koyu bir arka plan üzerinde yazı tipini görüntülerken kullanılmaya uygun olduğunu belirtir. |
| VariationsPostScriptNamePrefix | 25 | Değişken bir yazı tipinde mevcutsa, Varyasyon Yazı Tipleri algoritması için PostScript Adı Oluşturma sürecinde aile öneki olarak kullanılabilir. |

## Ayrıca Bakınız

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
