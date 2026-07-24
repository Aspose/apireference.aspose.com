---
title: "Méthode System::Cast"
linktitle: "Cast"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Cast. Effectue un transtypage sur les objets SmartPtr en C++."
type: docs
weight: 15300
url: /fr/cpp/system/cast/
---
## System::Cast method


Effectue un transtypage sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type pointeur cible. |
| TFrom | Type pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
