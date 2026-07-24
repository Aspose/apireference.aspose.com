---
title: "Clase System::Net::IPHostEntry"
linktitle: "IPHostEntry"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::IPHostEntry. Representa información sobre una dirección de host de internet. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2600
url: /es/cpp/system.net/iphostentry/
---
## IPHostEntry class


Representa información sobre una dirección de host de internet. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class IPHostEntry : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Obtiene la colección de direcciones IP del host. |
| [get_Aliases](./get_aliases/)() | Obtiene la colección de alias del host. |
| [get_HostName](./get_hostname/)() const | Información RTTI. |
| [IPHostEntry](./iphostentry/)() | Construye una nueva instancia. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Establece una colección de direcciones IP del host. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Establece una colección de alias del host. |
| [set_HostName](./set_hostname/)(String) | Establece el nombre del host. |
| [ToString](./tostring/)() const override | Análogo del método C# [Object.ToString()](../../system/object/tostring/). Permite convertir objetos personalizados a cadena. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
