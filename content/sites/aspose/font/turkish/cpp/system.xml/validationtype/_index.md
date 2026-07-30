---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Font için C++"
description: "System::Xml::ValidationType enum. C++'de gerçekleştirilecek doğrulama türünü belirtir."
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
| Yok | 0 | Doğrulama yapılmaz ve doğrulama hataları atılmaz. Bu ayar, XML 1.0 uyumlu doğrulama yapmayan bir ayrıştırıcı oluşturur. |
| Otomatik | 1 | DTD veya şema bilgisi bulunursa doğrular. |
| DTD | 2 | DTD'ye göre doğrular. |
| XDR | 3 | Satır içi XDR şemaları dahil olmak üzere XML-Data Reduced (XDR) şemalarına göre doğrular. XDR şemaları, **x-schema** ad alanı öneki veya [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) değeri kullanılarak tanınır. |
| Schema | 4 | Satır içi XML Şemaları dahil olmak üzere XML [Schema](../../system.xml.schema/) tanım dili (XSD) şemalarına göre doğrular. XML Şemaları, **schemaLocation** özniteliği kullanılarak veya sağlanan **Schemas** aracılığıyla ad alanı URI'leriyle ilişkilendirilir. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
