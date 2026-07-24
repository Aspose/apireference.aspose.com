---
title: "Método System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Page para C++"
description: "Método System::setter_wrap. Sobrecarga para funciones setter de instancia con conversión de tipos en C++."
type: docs
weight: 38200
url: /es/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Sobrecarga para funciones setter de instancia con conversión de tipos.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de valor. |
| T2 | Tipo esperado por la función setter. |
| Host | Tipo de instancia. |
| HostSet | - El propio host, o su tipo base, donde se define el setter de la propiedad. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| host | Host *const | [Object](../object/) para llamar a la función setter de. |
| pSetter | void(HostSet::*)(T2) | Referencia a la función setter. |
| value | T | Valor a establecer. |

### ReturnValue

establecer valor.

## Ver también

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Sobrecarga para funciones setter estáticas con conversión de tipo.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de valor. |
| T2 | Tipo esperado por la función setter. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pSetter | void(*)(T2) | Referencia a la función setter estática. |
| value | T | Valor a establecer. |

### ReturnValue

establecer valor.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
