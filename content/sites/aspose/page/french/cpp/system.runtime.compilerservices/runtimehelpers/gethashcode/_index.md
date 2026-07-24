---
title: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode méthode"
linktitle: "ObtenirCodeHash"
second_title: "Aspose.Page pour C++"
description: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode méthode. Obtient le code de hachage d'un type arbitraire. Appelle Object::GetHashCode() pour le faire en C++."
type: docs
weight: 100
url: /fr/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


Obtient le code de hachage d'un type arbitraire. Appelle [Object::GetHashCode()](../../../system/object/gethashcode/) pour le faire.

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type pour lequel obtenir le code de hachage. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | [Object](../../../system/object/) pour obtenir des informations. |

### ReturnValue

Valeur du code de hachage telle que calculée par l'implémentation cible.

## Voir aussi

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Page for C++](../../../)
