---
title: "Método System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page para C++"
description: "Método System::Cast_noexcept. Realiza una conversión de objetos SmartPtr en C++."
type: docs
weight: 15400
url: /es/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Realiza un cast en objetos [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntero de origen. |

### ReturnValue

Resultado del casting si el casting está permitido o nullptr en caso contrario.

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
