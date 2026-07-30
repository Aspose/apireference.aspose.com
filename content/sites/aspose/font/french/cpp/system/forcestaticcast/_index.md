---
title: "System::ForceStaticCast method"
linktitle: "ForceStaticCast"
second_title: "Aspose.Font pour C++"
description: "System::ForceStaticCast method. Effectue une conversion statique réelle sur les objets SmartPtr en C++."
type: docs
weight: 20500
url: /fr/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Effectue une conversion statique réelle sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Convertit le résultat si la conversion est autorisée, sinon le comportement est indéfini.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
