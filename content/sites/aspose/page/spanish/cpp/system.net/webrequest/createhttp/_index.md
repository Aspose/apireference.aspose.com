---
title: "System::Net::WebRequest::CreateHttp método"
linktitle: "CreateHttp"
second_title: "Aspose.Page para C++"
description: "System::Net::WebRequest::CreateHttp método. Crea una nueva instancia de la clase WebRequest usando la URI especificada en C++."
type: docs
weight: 300
url: /es/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Crea una nueva instancia de la clase [WebRequest](../) usando el URI especificado.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| requestUriString | String | El URI que se utiliza para crear una nueva instancia de la clase [WebRequest](../). |

### ReturnValue

Una instancia de la clase WebRequest recién creada.
## Observaciones



Se lanzará NotSupportedException cuando la URI especificada comience con cualquier esquema excepto [http://](http://) o [https://](https://).

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Crea una nueva instancia de la clase [WebRequest](../) usando el URI especificado.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | El URI que se utiliza para crear una nueva instancia de la clase [WebRequest](../). |

### ReturnValue

Una instancia de la clase WebRequest recién creada.
## Observaciones



Se lanzará NotSupportedException cuando la URI especificada comience con cualquier esquema excepto [http://](http://) o [https://](https://).

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
