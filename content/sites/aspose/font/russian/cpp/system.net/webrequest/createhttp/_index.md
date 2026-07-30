---
title: "System::Net::WebRequest::CreateHttp метод"
linktitle: "CreateHttp"
second_title: "Aspose.Font для C++"
description: "System::Net::WebRequest::CreateHttp метод. Создаёт новый экземпляр класса WebRequest, используя указанный URI в C++."
type: docs
weight: 300
url: /ru/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Создает новый экземпляр класса [WebRequest](../), используя указанный URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| requestUriString | String | URI, используемый для создания нового экземпляра класса [WebRequest](../). |

### ReturnValue

Новый экземпляр класса WebRequest.
## Примечания



NotSupportedException будет выброшено, если указанный URI начинается с любой схемы, кроме [http://](http://) или [https://](https://).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Создает новый экземпляр класса [WebRequest](../), используя указанный URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | URI, используемый для создания нового экземпляра класса [WebRequest](../). |

### ReturnValue

Новый экземпляр класса WebRequest.
## Примечания



NotSupportedException будет выброшено, если указанный URI начинается с любой схемы, кроме [http://](http://) или [https://](https://).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
