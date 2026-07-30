---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSeverityType enum. Rappresenta la gravità dell'evento di convalida in C++."
type: docs
weight: 8100
url: /it/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Rappresenta la gravità dell'evento di convalida.

```cpp
enum class XmlSeverityType
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Error | 0 | Indica che si è verificato un errore di convalida durante la convalida del documento di istanza. Questo si applica alle definizioni di tipo di documento (DTDs) e agli schemi XML [Schema](../) del linguaggio di definizione (XSD). I vincoli di validità del World Wide [Web](../../system.web/) Consortium (W3C) sono considerati errori. Se non è stato creato alcun gestore di eventi di convalida, gli errori generano un'eccezione. |
| Warning | 1 | Indica che si è verificato un evento di convalida che non è un errore. Un avviso viene tipicamente emesso quando non è presente un DTD o un XML [Schema](../) per convalidare un particolare elemento o attributo. A differenza degli errori, gli avvisi non generano un'eccezione se non esiste un gestore di eventi di convalida. |

## Vedi anche

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
