---
title: "Método System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Page para C++"
description: "Método System::ConstCast. Fin de conversiones obsoletas en C++."
type: docs
weight: 16100
url: /es/cpp/system/constcast/
---
## System::ConstCast method


Fin de conversiones obsoletas.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parámetro | Descripción |
| --- | --- |
| TTo | Tipo de puntero objetivo. |
| TFrom | Tipo de puntero de origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Puntero de origen. |

### ReturnValue

Resultado del casting si el casting está permitido o nullptr en caso contrario.
## Observaciones


Realiza un cast const en objetos [SmartPtr](../smartptr/).
## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
