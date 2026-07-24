---
title: "Método System::IO::Stream::EndRead"
linktitle: "EndRead"
second_title: "Aspose.Page para C++"
description: "Método System::IO::Stream::EndRead. Espera hasta que la operación de lectura asíncrona especificada se complete en C++."
type: docs
weight: 600
url: /es/cpp/system.io/stream/endread/
---
## Stream::EndRead method


Espera hasta que la operación de lectura asíncrona especificada se complete.

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | Un objeto [IAsyncResult](../../../system/iasyncresult/) que representa una operación de lectura asíncrona |

### ReturnValue

El número de bytes leídos durante la operación de lectura representada por **asyncResult**

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
