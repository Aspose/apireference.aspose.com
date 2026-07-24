---
title: "System::Xml::NewLineHandling enum'ı"
linktitle: "NewLineHandling"
second_title: "Aspose.Page için C++"
description: "System::Xml::NewLineHandling enum'ı. C++'ta satır sonlarının nasıl işleneceğini belirtir."
type: docs
weight: 5200
url: /tr/cpp/system.xml/newlinehandling/
---
## NewLineHandling enum


Satır sonlarının nasıl ele alınacağını belirtir.

```cpp
enum class NewLineHandling
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Replace | 0 | Satır sonu karakterleri, [XmlWriterSettings::set_NewLineChars](../xmlwritersettings/set_newlinechars/) değerinde belirtilen karakterle eşleşecek şekilde değiştirilir. |
| Entitize | 1 | Satır sonu karakterleri varlıklaştırılır. Bu ayar, çıktı normalleştiren bir [XmlReader](../xmlreader/) tarafından okunduğunda tüm karakterleri korur. |
| None | 2 | Satır sonu karakterleri değişmeden kalır. Çıktı, girdiye aynı olur. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
