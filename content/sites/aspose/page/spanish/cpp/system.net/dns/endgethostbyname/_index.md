---
title: "System::Net::Dns::EndGetHostByName método"
linktitle: "EndGetHostByName"
second_title: "Aspose.Page para C++"
description: "System::Net::Dns::EndGetHostByName método. Espera hasta que la operación asíncrona especificada para crear una nueva instancia de la clase IPHostEntry se complete en C++."
type: docs
weight: 600
url: /es/cpp/system.net/dns/endgethostbyname/
---
## Dns::EndGetHostByName method


Espera hasta que la operación asíncrona especificada para crear una nueva instancia de IPHostEntry-class se complete.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostByName(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa una operación asincrónica. |

### ReturnValue

Una instancia de clase IPHostEntry recién creada.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
