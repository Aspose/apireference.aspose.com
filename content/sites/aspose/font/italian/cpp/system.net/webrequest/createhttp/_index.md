---
title: "System::Net::WebRequest::CreateHttp metodo"
linktitle: "CreateHttp"
second_title: "Aspose.Font per C++"
description: "System::Net::WebRequest::CreateHttp metodo. Crea una nuova istanza della classe WebRequest utilizzando l'URI specificato in C++."
type: docs
weight: 300
url: /it/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Crea una nuova istanza della classe [WebRequest](../) utilizzando l'URI specificato.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| requestUriString | String | L'URI utilizzato per creare una nuova istanza della classe [WebRequest](../). |

### ReturnValue

Una nuova istanza della classe WebRequest.
## Osservazioni



Verrà sollevata un'eccezione NotSupportedException quando l'URI specificato inizia con uno schema diverso da [http://](http://) o [https://](https://).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Crea una nuova istanza della classe [WebRequest](../) utilizzando l'URI specificato.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | L'URI utilizzato per creare una nuova istanza della classe [WebRequest](../). |

### ReturnValue

Una nuova istanza della classe WebRequest.
## Osservazioni



Verrà sollevata un'eccezione NotSupportedException quando l'URI specificato inizia con uno schema diverso da [http://](http://) o [https://](https://).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
