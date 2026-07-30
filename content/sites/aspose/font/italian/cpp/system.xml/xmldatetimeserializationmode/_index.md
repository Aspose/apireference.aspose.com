---
title: "System::Xml::XmlDateTimeSerializationMode enum"
linktitle: "XmlDateTimeSerializationMode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlDateTimeSerializationMode enum. Specifica come trattare il valore temporale durante la conversione tra stringa e DateTime in C++."
type: docs
weight: 5800
url: /it/cpp/system.xml/xmldatetimeserializationmode/
---
## XmlDateTimeSerializationMode enum


Specifica come trattare il valore temporale durante la conversione tra stringa e [DateTime](../../system/datetime/).

```cpp
enum class XmlDateTimeSerializationMode
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Local | 0 | Trattare come ora locale. Se l'oggetto [DateTime](../../system/datetime/) rappresenta un Tempo Universale Coordinato (UTC), viene convertito all'ora locale. |
| Utc | 1 | Trattare come UTC. Se l'oggetto [DateTime](../../system/datetime/) rappresenta un'ora locale, viene convertito in UTC. |
| Unspecified | 2 | Trattare come ora locale se un [DateTime](../../system/datetime/) viene convertito in una stringa. Se una stringa viene convertita in [DateTime](../../system/datetime/), convertire in ora locale se è specificato un fuso orario. |
| RoundtripKind | 3 | Le informazioni sul fuso orario dovrebbero essere preservate durante la conversione. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
