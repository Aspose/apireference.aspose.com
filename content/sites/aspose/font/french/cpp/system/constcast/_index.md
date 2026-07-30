---
title: "Méthode System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ConstCast. Fin des conversions obsolètes en C++."
type: docs
weight: 16200
url: /fr/cpp/system/constcast/
---
## System::ConstCast method


Fin des conversions obsolètes.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type du pointeur cible. |
| TFrom | Type du pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé, sinon nullptr.
## Remarques


Effectue une conversion const sur les objets [SmartPtr](../smartptr/).
## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
