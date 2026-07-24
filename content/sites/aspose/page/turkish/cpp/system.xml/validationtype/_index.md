---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page için C++"
description: "System::Xml::ValidationType enum. C++'ta gerçekleştirilecek doğrulama türünü belirtir."
type: docs
weight: 5500
url: /tr/cpp/system.xml/validationtype/
---
## ValidationType enum


Gerçekleştirilecek doğrulama türünü belirtir.

```cpp
enum class ValidationType
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| None | 0 | Doğrulama yapılmaz ve doğrulama hataları atılmaz. Bu ayar, XML 1.0 uyumlu doğrulama yapmayan bir ayrıştırıcı oluşturur. |
| Otomatik | 1 | DTD veya şema bilgisi bulunursa doğrular. |
| DTD | 2 | DTD'ye göre doğrular. |
| XDR | 3 | XML-Data Reduced (XDR) şemalarına, satır içi XDR şemaları dahil, göre doğrulayın. XDR şemaları, **x-schema** ad alanı öneki veya [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) değeri kullanılarak tanınır. |
| Schema | 4 | XML [Schema](../../system.xml.schema/) tanım dili (XSD) şemalarına, satır içi XML Şemaları dahil, göre doğrulayın. XML Şemaları, **schemaLocation** özniteliği kullanılarak veya sağlanan **Schemas** aracılığıyla ad alanı URI'leriyle ilişkilendirilir. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
