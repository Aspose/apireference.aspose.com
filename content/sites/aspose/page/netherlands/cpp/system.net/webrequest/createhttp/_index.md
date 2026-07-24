---
title: "System::Net::WebRequest::CreateHttp method"
linktitle: "CreateHttp"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebRequest::CreateHttp method. Maakt een nieuwe instantie van de WebRequest‑klasse met behulp van de opgegeven URI in C++."
type: docs
weight: 300
url: /nl/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Maakt een nieuw exemplaar van de [WebRequest](../)-klasse aan met behulp van de opgegeven URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| requestUriString | String | De URI die wordt gebruikt om een nieuw exemplaar van de [WebRequest](../)-klasse te maken. |

### ReturnValue

Een nieuw aangemaakte WebRequest‑klasse‑instantie.
## Opmerkingen



NotSupportedException wordt gegooid wanneer de opgegeven URI begint met een ander schema dan [http://](http://) of [https://](https://).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Maakt een nieuw exemplaar van de [WebRequest](../)-klasse aan met behulp van de opgegeven URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | De URI die wordt gebruikt om een nieuw exemplaar van de [WebRequest](../)-klasse te maken. |

### ReturnValue

Een nieuw aangemaakte WebRequest‑klasse‑instantie.
## Opmerkingen



NotSupportedException wordt gegooid wanneer de opgegeven URI begint met een ander schema dan [http://](http://) of [https://](https://).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
