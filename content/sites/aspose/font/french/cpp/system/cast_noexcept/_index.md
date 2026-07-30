---
title: "System::Cast_noexcept method"
linktitle: "Cast_noexcept"
second_title: "Aspose.Font pour C++"
description: "System::Cast_noexcept method. Effectue un cast sur les objets SmartPtr en C++."
type: docs
weight: 15500
url: /fr/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Effectue un cast sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon nullptr.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
