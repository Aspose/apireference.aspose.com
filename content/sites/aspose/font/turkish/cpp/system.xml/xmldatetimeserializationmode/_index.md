---
title: "System::Xml::XmlDateTimeSerializationMode enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Dize ile DateTime arasında C++'ta dönüştürürken zaman değerinin nasıl ele alınacağını belirtir."
type: docs
weight: 5800
url: /tr/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Dize ile [DateTime](../../system/datetime/) arasında dönüştürürken zaman değerinin nasıl ele alınacağını belirtir.

```cpp
enum class XmlDateTimeSerializationMode
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Local | 0 | Yerel zaman olarak ele al. Eğer [DateTime](../../system/datetime/) nesnesi Koordinatlı Evrensel Zamanı (UTC) temsil ediyorsa, yerel zamana dönüştürülür. |
| Utc | 1 | UTC olarak ele al. Eğer [DateTime](../../system/datetime/) nesnesi yerel zamanı temsil ediyorsa, UTC'ye dönüştürülür. |
| Unspecified | 2 | Eğer bir [DateTime](../../system/datetime/) dizeye dönüştürülüyorsa yerel zaman olarak ele al. Bir dize bir [DateTime](../../system/datetime/) nesnesine dönüştürülüyorsa, bir saat dilimi belirtilmişse yerel zamana dönüştür. |
| RoundtripKind | 3 | Dönüştürürken saat dilimi bilgisi korunmalıdır. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
