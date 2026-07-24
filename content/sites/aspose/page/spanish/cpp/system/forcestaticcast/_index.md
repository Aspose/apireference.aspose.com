---
title: "Método System::ForceStaticCast"
linktitle: "ForzarConversiónEstática"
second_title: "Aspose.Page para C++"
description: "Método System::ForceStaticCast. Realiza un cast estático real sobre objetos SmartPtr en C++."
type: docs
weight: 20400
url: /es/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Realiza un cast estático real sobre objetos [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntero de origen. |

### ReturnValue

Resultado del cast si el cast está permitido, de lo contrario el comportamiento es indefinido.

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
