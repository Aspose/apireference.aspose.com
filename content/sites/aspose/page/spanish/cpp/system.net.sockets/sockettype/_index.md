---
title: "System::Net::Sockets::SocketType enum"
linktitle: "SocketType"
second_title: "Aspose.Page para C++"
description: "System::Net::Sockets::SocketType enum. Enumera los tipos de socket en C++."
type: docs
weight: 1800
url: /es/cpp/system.net.sockets/sockettype/
---
## SocketType enum


Enumera los tipos de socket.

```cpp
enum class SocketType
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Stream | 1 | El tipo que admite flujos de bytes confiables, bidireccionales y basados en conexión, sin duplicación de datos y sin preservación de límites. |
| Dgram | 2 | El tipo que admite datagramas, que son mensajes sin conexión, no confiables, de longitud máxima fija. |
| Raw | 3 | El tipo que permite el acceso al protocolo de transporte subyacente. |
| Rdm | 4 | El tipo que admite mensajes sin conexión, orientados a mensajes, entregados de forma confiable, y preserva los límites de los mensajes en los datos. |
| Seqpacket | 5 | El tipo que proporciona transferencia bidireccional, orientada a conexión y confiable de flujos de bytes ordenados a través de una red. |
| Desconocido | n/a | Un tipo desconocido. |

## Ver también

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
