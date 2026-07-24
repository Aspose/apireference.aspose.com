---
title: "System::Cast método"
linktitle: "Cast"
second_title: "Aspose.Page para C++"
description: "System::Cast método. Realiza un cast en objetos SmartPtr en C++."
type: docs
weight: 15300
url: /es/cpp/system/cast/
---
## System::Cast method


Realiza un cast en objetos [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntero de origen. |

### ReturnValue

Resultado del cast si el cast está permitido.

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
