---
title: "Méthode System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Cast_noexcept. Effectue un cast sur les objets SmartPtr en C++."
type: docs
weight: 15400
url: /fr/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Effectue un transtypage sur les objets [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type pointeur cible. |
| TFrom | Type pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé ou nullptr sinon.

## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
