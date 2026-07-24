---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page için C++"
description: "System::Xml::ConformanceLevel enum. XmlReader ve XmlWriter nesnelerinin C++'ta gerçekleştirdiği giriş veya çıkış denetiminin miktarını belirtir."
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
| Auto | 0 | [XmlReader](../xmlreader/) veya [XmlWriter](../xmlwriter/) nesnesi, belge düzeyinde mi yoksa parça düzeyinde mi denetimin yapılması gerektiğini otomatik olarak algılar ve uygun denetimi gerçekleştirir. Başka bir [XmlReader](../xmlreader/) veya [XmlWriter](../xmlwriter/) nesnesini sarmalıyorsanız, dış nesne ek bir uyumluluk denetimi yapmaz. Uyumluluk denetimi alt nesneye bırakılır. |
| Fragment | 1 | XML verisi, W3C tarafından tanımlanan bir [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) olarak tanımlanır. Bu uyumluluk seviyesi, kök öğesi olmayabilecek ancak başka türlü iyi biçimlendirilmiş bir XML belgesini temsil eder. Bu denetim seviyesi, okunan veya yazılan akışın herhangi bir işlemci tarafından bir [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) olarak tüketilebilmesini sağlar. |
| Document | 2 | XML verisi, W3C tarafından tanımlanan iyi biçimlendirilmiş bir [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) kurallarına uyar. Bu denetim seviyesi, okunan veya yazılan akışın herhangi bir işlemci tarafından bir [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) olarak tüketilebilmesini sağlar. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
