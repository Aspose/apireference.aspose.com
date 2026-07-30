---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader Methode"
linktitle: "FindHeader"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader method. Findet die Headerzuordnung anhand des angegebenen Headertyps in C++."
type: docs
weight: 300
url: /de/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


Findet die Header‑Zuordnung anhand des angegebenen Header‑Typs.

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | Die Sammlung der Headerzuordnungen. |
| headerType | const TypeInfo\& | Der gesuchte Headertyp. |

### ReturnValue

Die Headerzuordnung.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
