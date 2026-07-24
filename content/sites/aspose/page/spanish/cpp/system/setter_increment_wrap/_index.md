---
title: "System::setter_increment_wrap método"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page para C++"
description: "System::setter_increment_wrap método. El traductor traduce las expresiones de incremento de C# que apuntan a la propiedad de la clase que tiene setter y getter definidos, en la invocación de esta función en C++."
type: docs
weight: 37400
url: /es/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


El traductor traduce las expresiones de incremento de C# que apuntan a la propiedad de la clase que tiene setter y getter definidos, en la invocación de esta función.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de la propiedad |
| Host | - clase de la instancia a modificar |
| HostGet | - Host mismo, o su tipo base, donde se define el getter de la propiedad |
| HostSet | - Host mismo, o su tipo base, donde se define el setter de la propiedad. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| host | Host *const | Un puntero a un objeto cuya propiedad será incrementada |
| pGetter | T(HostGet::*)() | Puntero a función que apunta al método getter de la propiedad |
| pSetter | void(HostSet::*)(T) | Puntero a función que apunta al método setter de la propiedad |

### ReturnValue

El valor incrementado de la propiedad

## Ver también

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


El traductor traduce las expresiones de incremento de C# que apuntan a la propiedad de la clase que tiene setter y getter definidos, en la invocación de esta función.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de la propiedad |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pGetter | T(*)() | Puntero a función que apunta a la función libre getter de la propiedad |
| pSetter | void(*)(T) | Puntero a función que apunta a la función libre setter de la propiedad |

### ReturnValue

El valor incrementado de la propiedad

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
