---
title: "System::IConvertible::ToType method"
linktitle: "ToType"
second_title: "Aspose.Page para C++"
description: "Método System::IConvertible::ToType. Convierte el valor de esta instancia a un System::Object del System::Type especificado que tiene un valor equivalente, utilizando la información de formato específica de cultura especificada en C++."
type: docs
weight: 1400
url: /es/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Convierte el valor de esta instancia a un [System::Object](../../object/) del System::Type especificado que tiene un valor equivalente, utilizando la información de formato específica de cultura especificada.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| conversionType | const TypeInfo\& | El System::Type al que se convierte el valor de esta instancia. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Una implementación de la interfaz [System::IFormatProvider](../../iformatprovider/) que proporciona información de formato específica de cultura. |

### ReturnValue

Una instancia de [System::Object](../../object/) de tipo conversionType cuyo valor es equivalente al valor de esta instancia.

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
