---
title: "Méthode System::Net::WebRequest::RegisterPrefix"
linktitle: "RegisterPrefix"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::WebRequest::RegisterPrefix. Enregistre le descendant WebRequest pour l'URI spécifié en C++."
type: docs
weight: 600
url: /fr/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Enregistre le descendant [WebRequest](../) pour l'URI spécifié.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| préfixe | String | L'URI ou le préfixe d'URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Crée de nouvelles instances de la classe [WebRequest](../). |

### ReturnValue

Vrai lorsque le descendant [WebRequest](../) est enregistré avec succès pour l'URI spécifié, sinon faux.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
