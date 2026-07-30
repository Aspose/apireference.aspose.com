---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Font için C++"
description: "System::Xml::ConformanceLevel enum. XmlReader ve XmlWriter nesnelerinin C++ içinde gerçekleştirdiği giriş veya çıkış denetiminin miktarını belirtir."
type: docs
weight: 4600
url: /tr/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


[XmlReader](../xmlreader/) ve [XmlWriter](../xmlwriter/) nesnelerinin gerçekleştirdiği giriş veya çıkış denetiminin miktarını belirtir.

```cpp
enum class ConformanceLevel
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Auto | 0 | Bu [XmlReader](../xmlreader/) veya [XmlWriter](../xmlwriter/) nesnesi, belge düzeyinde mi yoksa parça düzeyinde mi kontrol yapılması gerektiğini otomatik olarak algılar ve uygun kontrolü gerçekleştirir. Başka bir [XmlReader](../xmlreader/) veya [XmlWriter](../xmlwriter/) nesnesini sarmalıyorsanız, dış nesne ek bir uyumluluk kontrolü yapmaz. Uyumluluk kontrolü alt nesneye bırakılır. |
| Fragment | 1 | XML verileri bir [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) olarak, W3C tarafından tanımlandığı gibi iyi biçimlendirilmiştir. Bu uyumluluk seviyesi, kök öğesi olmayabilecek ancak başka türlü iyi biçimlendirilmiş bir XML belgesini temsil eder. Bu kontrol seviyesi, okunan veya yazılan akışın herhangi bir işlemci tarafından bir [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) olarak tüketilebilmesini sağlar. |
| Document | 2 | XML verileri, W3C tarafından tanımlandığı gibi iyi biçimlendirilmiş bir [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) için kurallara uyar. Bu kontrol seviyesi, okunan veya yazılan akışın herhangi bir işlemci tarafından bir [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) olarak tüketilebilmesini sağlar. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
