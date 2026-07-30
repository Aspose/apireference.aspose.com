---
title: "Metodo System::Net::WebRequest::RegisterPrefix"
linktitle: "RegisterPrefix"
second_title: "Aspose.Font per C++"
description: "Metodo System::Net::WebRequest::RegisterPrefix. Registra il discendente WebRequest per l'URI specificato in C++."
type: docs
weight: 600
url: /it/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Registra il discendente [WebRequest](../) per l'URI specificato.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefisso | Stringa | L'URI o il prefisso URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Crea nuove istanze della classe [WebRequest](../). |

### ReturnValue

Vero quando il discendente [WebRequest](../) è registrato correttamente per l'URI specificato, altrimenti falso.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
