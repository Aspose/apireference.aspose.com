---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Page para C++"
description: "System::Net::Sockets::SocketFlags enum. Proporciona valores constantes para los mensajes de socket en C++."
type: docs
weight: 1400
url: /es/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Proporciona valores constantes para los mensajes del socket.

```cpp
enum class SocketFlags
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| None | 0 | No hay banderas usadas para esta llamada. |
| OutOfBand | 1 | Los datos fuera de banda se están procesando. |
| Peek | 2 | Observar un mensaje entrante. |
| DontRoute | 4 | Enviar un mensaje sin usar tablas de enrutamiento. |
| Truncated | 256 | Un mensaje es demasiado grande para caber en el búfer especificado. Ha sido truncado. |
| ControlDataTruncated | 512 | Los datos de control son mayores de 64 KB y no caben en el búfer interno. Han sido truncados. |
| Broadcast | 1024 | Un paquete de difusión. |
| Multicast | 2048 | Un paquete multicast. |
| Partial | 32768 | Un mensaje enviado o recibido parcialmente. |

## Ver también

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
