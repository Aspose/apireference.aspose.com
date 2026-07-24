---
title: "System::TypeInfo::IsDefined método"
linktitle: "IsDefined"
second_title: "Aspose.Page para C++"
description: "Método System::TypeInfo::IsDefined. NO IMPLEMENTADO. Indica si uno o más atributos del tipo especificado o de sus tipos derivados se aplican a este miembro en C++."
type: docs
weight: 4400
url: /es/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


NO IMPLEMENTADO. Indica si uno o más atributos del tipo especificado o de sus tipos derivados se aplican a este miembro.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| attributeType | const TypeInfo\& | El tipo de atributo personalizado a buscar. La búsqueda incluye tipos derivados. |
| inherit | bool | true to search this member's inheritance chain to find the attributes; otherwise, false. This parameter is ignored for properties and events. |

### ReturnValue

true if one or more instances of attributeType or any of its derived types is applied to this member; otherwise, false.

## Ver también

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
