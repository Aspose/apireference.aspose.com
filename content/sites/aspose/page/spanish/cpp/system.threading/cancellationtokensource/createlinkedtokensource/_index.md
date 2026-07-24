---
title: "Método System::Threading::CancellationTokenSource::CreateLinkedTokenSource"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Page para C++"
description: "Método System::Threading::CancellationTokenSource::CreateLinkedTokenSource. Crea una fuente de token vinculada que se cancela cuando cualquiera de los tokens proporcionados se cancela en C++."
type: docs
weight: 600
url: /es/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Crea un origen de token enlazado que se cancela cuando cualquiera de los tokens proporcionados se cancela.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| token1 | const CancellationToken\& | Primer token de cancelación a monitorear. |
| token2 | const CancellationToken\& | Segundo token de cancelación a monitorear. |

### ReturnValue

Nueva fuente de token que se cancelará cuando cualquiera de los tokens de entrada se cancele.
## Observaciones



La fuente devuelta se cancelará inmediatamente si cualquiera de los tokens de entrada ya está cancelado.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
