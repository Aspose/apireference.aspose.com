---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader метод"
linktitle: "FindHeader"
second_title: "Aspose.Font для C++"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader метод. Находит сопоставление заголовка по указанному типу заголовка в C++."
type: docs
weight: 300
url: /ru/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


Находит сопоставление заголовка по указанному типу заголовка.

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | Коллекция сопоставлений заголовков. |
| headerType | const TypeInfo\& | Тип заголовка, который нужно найти. |

### ReturnValue

Сопоставление заголовка.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
