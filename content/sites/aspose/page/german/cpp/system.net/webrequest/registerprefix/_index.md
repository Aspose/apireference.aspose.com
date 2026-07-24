---
title: "System::Net::WebRequest::RegisterPrefix Methode"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page für C++"
description: "System::Net::WebRequest::RegisterPrefix Methode. Registriert das WebRequest‑Abkömmling für die angegebene URI in C++."
type: docs
weight: 600
url: /de/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Registriert das [WebRequest](../)-Abkömmling für die angegebene URI.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Präfix | String | Die URI oder das URI‑Präfix. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Erstellt neue Instanzen der [WebRequest](../)-Klasse. |

### ReturnValue

Wahr, wenn das [WebRequest](../)-Abkömmling erfolgreich für die angegebene URI registriert wurde, andernfalls falsch.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
