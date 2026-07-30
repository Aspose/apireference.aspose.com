---
title: "System::Net::WebRequest::RegisterPrefix-Methode"
linktitle: "RegisterPrefix"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::RegisterPrefix-Methode. Registriert den WebRequest-Nachfolger für die angegebene URI in C++."
type: docs
weight: 600
url: /de/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Registriert den [WebRequest](../)-Nachfolger für die angegebene URI.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Präfix | String | Die URI oder das URI-Präfix. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Erstellt neue Instanzen der [WebRequest](../)-Klasse. |

### ReturnValue

Wahr, wenn der [WebRequest](../)-Nachfolger erfolgreich für die angegebene URI registriert wurde, andernfalls falsch.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
