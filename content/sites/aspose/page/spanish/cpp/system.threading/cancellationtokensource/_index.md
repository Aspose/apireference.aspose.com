---
title: "System::Threading::CancellationTokenSource clase"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page para C++"
description: "System::Threading::CancellationTokenSource clase. Un origen de token de cancelación que puede usarse para activar notificaciones de cancelación en C++."
type: docs
weight: 400
url: /es/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Una fuente de token de cancelación que puede usarse para activar notificaciones de cancelación.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Cancel](./cancel/)() | Comunica una solicitud de cancelación. |
| [CancellationTokenSource](./cancellationtokensource/)() | Construye un nuevo [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Crea un origen de token enlazado que se cancela cuando cualquiera de los tokens proporcionados se cancela. |
| [Dispose](./dispose/)() override | Libera todos los recursos utilizados por el [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Obtiene si se ha solicitado la cancelación. |
| [get_Token](./get_token/)() const | Obtiene el token de cancelación asociado a este origen. |
## Observaciones


Proporciona mecanismos para crear y controlar tokens de cancelación para la cancelación cooperativa de operaciones.
## Ver también

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
