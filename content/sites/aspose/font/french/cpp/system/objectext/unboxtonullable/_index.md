---
title: "méthode System::ObjectExt::UnboxToNullable"
linktitle: "UnboxToNullable"
second_title: "Aspose.Font pour C++"
description: "méthode System::ObjectExt::UnboxToNullable. Déballe l’objet en type nullable en C++."
type: docs
weight: 1700
url: /fr/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Déboîte l'objet en type nullable.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Paramètre | Description |
| --- | --- |
| T | Type de destination. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) à déballer. |
| sûr | bool | Si vrai, renvoie nullptr en cas d'échec, sinon lève InvalidCastException. |

### ReturnValue

Valeur nullable non emballée (peut être nulle).

## Voir aussi

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
