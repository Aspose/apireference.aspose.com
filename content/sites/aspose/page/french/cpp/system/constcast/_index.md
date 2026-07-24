---
title: "Méthode System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Page pour C++"
description: "Méthode System::ConstCast. Fin des conversions obsolètes en C++."
type: docs
weight: 16100
url: /fr/cpp/system/constcast/
---
## System::ConstCast method


Fin des conversions obsolètes.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Paramètre | Description |
| --- | --- |
| TTo | Type pointeur cible. |
| TFrom | Type pointeur source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Pointeur source. |

### ReturnValue

Résultat du cast si le cast est autorisé ou nullptr sinon.
## Remarques


Effectue une conversion const sur les objets [SmartPtr](../smartptr/).
## Voir aussi

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
