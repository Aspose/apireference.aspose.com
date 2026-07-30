---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader méthode"
linktitle: "FindHeader"
second_title: "Aspose.Font pour C++"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader méthode. Trouve le mappage d'en-tête par le type d'en-tête spécifié en C++."
type: docs
weight: 300
url: /fr/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


Trouve le mappage d'en-tête par le type d'en-tête spécifié.

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | La collection des mappages d'en-tête. |
| headerType | const TypeInfo\& | Le type d'en-tête à rechercher. |

### ReturnValue

Le mappage d'en-tête.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
