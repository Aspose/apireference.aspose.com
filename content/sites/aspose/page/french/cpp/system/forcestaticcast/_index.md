---
title: "System::ForceStaticCast méthode"
linktitle: "ForcerConversionStatique"
second_title: "Aspose.Page pour C++"
description: "System::ForceStaticCast méthode. Effectue un cast statique réel sur les objets SmartPtr en C++."
type: docs
weight: 20400
url: /fr/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Effectue un cast statique réel sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type pointeur cible. |
| TFrom | Type pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon le comportement est indéfini.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
