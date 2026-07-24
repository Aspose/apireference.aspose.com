---
title: "System::Net::WebRequest::RegisterPrefix method"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page para C++"
description: "System::Net::WebRequest::RegisterPrefix method. Registra el descendiente WebRequest para el URI especificado en C++."
type: docs
weight: 600
url: /es/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Registra el descendiente [WebRequest](../) para el URI especificado.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| prefijo | String | El URI o el prefijo del URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Crea nuevas instancias de la clase [WebRequest](../). |

### ReturnValue

Verdadero cuando el descendiente [WebRequest](../) se registra correctamente para el URI especificado, de lo contrario falso.

## Ver también

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
