---
title: "Clase System::Net::ServicePoint"
linktitle: "ServicePoint"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::ServicePoint. Proporciona gestión de conexiones HTTP. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3100
url: /es/cpp/system.net/servicepoint/
---
## ServicePoint class


Proporciona gestión de conexiones HTTP. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class ServicePoint : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Cierra y elimina las conexiones que pertenecen al grupo de conexiones especificado. |
| [get_Address](./get_address/)() | Devuelve el URI del servidor al que se conecta la instancia actual. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | Información RTTI. |
| [get_Certificate](./get_certificate/)() | Devuelve un certificado que es usado por la instancia actual. |
| [get_ClientCertificate](./get_clientcertificate/)() | Devuelve el último certificado de cliente. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Obtiene un tiempo de espera en milisegundos después del cual se cerrará el [ServicePoint](./) activo. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Obtiene el número máximo de conexiones que permite la instancia actual. |
| [get_ConnectionName](./get_connectionname/)() | Devuelve el nombre de la conexión. |
| [get_CurrentConnections](./get_currentconnections/)() | Devuelve un número de conexiones abiertas. |
| [get_Expect100Continue](./get_expect100continue/)() | Obtiene un valor que indica si se usa el comportamiento 100-Continue. |
| [get_IdleSince](./get_idlesince/)() | Devuelve la fecha y hora de la última conexión a un host. |
| [get_MaxIdleTime](./get_maxidletime/)() | Obtiene una cantidad de tiempo en milisegundos después de la cual una conexión inactiva será cerrada. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Devuelve la versión HTTP. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Obtiene el tamaño del búfer de recepción. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Devuelve un valor que indica si la instancia actual soporta conexiones en pipeline. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Obtiene un valor que indica si el algoritmo Nagle es usado por las conexiones gestionadas por la instancia actual. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Establece el delegado que se usa para asociar el [IPEndPoint](../ipendpoint/) local con la instancia actual. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Establece un tiempo de espera en milisegundos después del cual el [ServicePoint](./) activo será cerrado. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Establece el número máximo de conexiones que permite la instancia actual. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Establece un valor que indica si se usa el comportamiento 100-Continue. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Establece una cantidad de tiempo en milisegundos después de la cual una conexión inactiva será cerrada. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Establece el tamaño del búfer de recepción. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Establece un valor que indica si el algoritmo Nagle es usado por las conexiones gestionadas por la instancia actual. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Establece el valor que indica si la opción 'Keep-Alive' está habilitada. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
