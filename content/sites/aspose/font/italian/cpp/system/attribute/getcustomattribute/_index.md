---
title: "Metodo System::Attribute::GetCustomAttribute"
linktitle: "GetCustomAttribute"
second_title: "Aspose.Font per C++"
description: "Metodo System::Attribute::GetCustomAttribute. Restituisce un attributo personalizzato di un tipo specificato applicato a un tipo specificato in C++."
type: docs
weight: 100
url: /it/cpp/system/attribute/getcustomattribute/
---
## Attribute::GetCustomAttribute method


Restituisce un attributo personalizzato di un tipo specificato applicato al tipo specificato.

```cpp
static Object::ptr System::Attribute::GetCustomAttribute(const TypeInfo &type, const TypeInfo &attributeType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tipo | const TypeInfo\& | Tipo di attributo che viene recuperato |
| attributeType | const TypeInfo\& | Tipo dell'attributo da recuperare |

### ReturnValue

Un attributo recuperato o null se il tipo specificato non possiede un attributo del tipo specificato.

## Vedi anche

* Typedef [ptr](../../object/ptr/)
* Class [TypeInfo](../../typeinfo/)
* Class [Attribute](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
