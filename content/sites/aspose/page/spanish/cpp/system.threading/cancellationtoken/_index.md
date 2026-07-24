---
title: "System::Threading::CancellationToken class"
linktitle: "CancellationToken"
second_title: "Aspose.Page para C++"
description: "System::Threading::CancellationToken class. Propaga una notificación de que las operaciones deben cancelarse. Esta clase proporciona un mecanismo para la cancelación cooperativa entre hilos, permitiendo que un hilo notifique a los demás que una operación debe cancelarse en C++."
type: docs
weight: 200
url: /es/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Propaga la notificación de que las operaciones deben cancelarse. Esta clase proporciona un mecanismo de cancelación cooperativa entre hilos, permitiendo que un hilo notifique a los demás que una operación debe cancelarse.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Constructor predeterminado. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Obtiene si este token puede estar en estado cancelado. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Obtiene si se ha solicitado la cancelación para este token. |
| static [get_None](./get_none/)() | Devuelve un valor vacío de [System::Threading::CancellationToken](./). |
| [Register](./register/)(const Action<>\&) const | Registra una devolución de llamada que se invocará cuando se solicite la cancelación. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Lanza una OperationCanceledException si se ha solicitado la cancelación. |
## Observaciones



Un [CancellationToken](./) solo puede cancelarse a través de su [CancellationTokenSource](../cancellationtokensource/) asociado.

## Ver también

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
