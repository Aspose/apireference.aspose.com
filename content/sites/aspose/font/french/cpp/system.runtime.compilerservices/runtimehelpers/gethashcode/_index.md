---
title: "Méthode System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode"
linktitle: "GetHashCode"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode. Obtient le code de hachage d'un type arbitraire. Appelle Object::GetHashCode() pour ce faire en C++."
type: docs
weight: 100
url: /fr/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


Obtient le code de hachage d'un type arbitraire. Appelle [Object::GetHashCode()](../../../system/object/gethashcode/) pour ce faire.

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type pour lequel obtenir le code de hachage. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | [Object](../../../system/object/) dont on veut obtenir des informations. |

### ReturnValue

Valeur du code de hachage telle que calculée par l'implémentation cible.

## Voir aussi

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Font for C++](../../../)
