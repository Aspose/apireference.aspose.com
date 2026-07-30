---
title: "System::Net::WebRequest::CreateHttp method"
linktitle: "CreateHttp"
second_title: "Aspose.Font für C++"
description: "System::Net::WebRequest::CreateHttp method. Erstellt eine neue Instanz der WebRequest-Klasse unter Verwendung der angegebenen URI in C++."
type: docs
weight: 300
url: /de/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Erstellt eine neue Instanz der [WebRequest](../)-Klasse mit der angegebenen URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| requestUriString | String | Der URI, der verwendet wird, um eine neue Instanz der [WebRequest](../)-Klasse zu erstellen. |

### ReturnValue

Eine neu erstellte Instanz der WebRequest-Klasse.
## Hinweise



NotSupportedException wird ausgelöst, wenn die angegebene URI mit einem anderen Schema als [http://](http://) oder [https://](https://) beginnt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Erstellt eine neue Instanz der [WebRequest](../)-Klasse mit der angegebenen URI.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | Der URI, der verwendet wird, um eine neue Instanz der [WebRequest](../)-Klasse zu erstellen. |

### ReturnValue

Eine neu erstellte Instanz der WebRequest-Klasse.
## Hinweise



NotSupportedException wird ausgelöst, wenn die angegebene URI mit einem anderen Schema als [http://](http://) oder [https://](https://) beginnt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
