---
title: "System::ObjectExt::UnboxToNullable méthode"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::UnboxToNullable méthode. Désencapsule l'objet en type nullable en C++."
type: docs
weight: 1600
url: /fr/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Déboxe l'objet en type nullable.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Paramètre | Description |
| --- | --- |
| T | Type de destination. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) à déballer. |
| sûr | bool | Si vrai, renvoie nullptr en cas d'échec, sinon lance InvalidCastException. |

### ReturnValue

Valeur nullable désencapsulée (peut être nulle).

## Voir aussi

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
