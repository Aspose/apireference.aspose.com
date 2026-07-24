---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSeverityType enum. C++ içinde doğrulama olayının şiddetini temsil eder."
type: docs
weight: 8100
url: /tr/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Doğrulama olayının şiddetini temsil eder.

```cpp
enum class XmlSeverityType
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Error | 0 | Örnek belge doğrulanırken bir doğrulama hatası oluştuğunu gösterir. Bu, belge türü tanımları (DTD'ler) ve XML [Schema](../) tanım dili (XSD) şemaları için geçerlidir. Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) geçerlilik kısıtlamaları hata olarak kabul edilir. Eğer bir doğrulama olayı işleyicisi oluşturulmamışsa, hatalar bir istisna fırlatır. |
| Warning | 1 | Bir doğrulama olayının oluştuğunu, ancak bunun bir hata olmadığını gösterir. Genellikle bir DTD bulunmadığında veya belirli bir öğe ya da özniteliği doğrulamak için bir XML [Schema](../) bulunmadığında bir uyarı verilir. Hataların aksine, uyarılar bir doğrulama olayı işleyicisi yoksa istisna fırlatmaz. |

## Ayrıca Bakınız

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
