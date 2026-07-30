---
title: "System::Cast method"
linktitle: "Cast"
second_title: "Aspose.Font pour C++"
description: "System::Cast method. Effectue un transtypage sur les objets SmartPtr en C++."
type: docs
weight: 15400
url: /fr/cpp/system/cast/
---
## System::Cast method


Effectue un cast sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
