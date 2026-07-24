---
title: "System::Net::WebRequest::RegisterPrefix méthode"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page pour C++"
description: "System::Net::WebRequest::RegisterPrefix méthode. Enregistre le descendant WebRequest pour l'URI spécifiée en C++."
type: docs
weight: 600
url: /fr/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Enregistre le descendant [WebRequest](../) pour l'URI spécifiée.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| préfixe | String | L'URI ou le préfixe d'URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Crée de nouvelles instances de la classe [WebRequest](../). |

### ReturnValue

Vrai lorsque le descendant [WebRequest](../) est enregistré avec succès pour l'URI spécifiée, sinon faux.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
