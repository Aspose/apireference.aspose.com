---
title: "System::Net::WebRequest::CreateHttp méthode"
linktitle: "CreateHttp"
second_title: "Aspose.Page pour C++"
description: "System::Net::WebRequest::CreateHttp méthode. Crée une nouvelle instance de la classe WebRequest en utilisant l'URI spécifié en C++."
type: docs
weight: 300
url: /fr/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Crée une nouvelle instance de la classe [WebRequest](../) en utilisant l'URI spécifié.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| requestUriString | String | L'URI utilisé pour créer une nouvelle instance de la classe [WebRequest](../). |

### ReturnValue

Une nouvelle instance de la classe WebRequest.
## Remarques



NotSupportedException sera levée lorsque l'URI spécifié commence par un schéma autre que [http://](http://) ou [https://](https://).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Crée une nouvelle instance de la classe [WebRequest](../) en utilisant l'URI spécifié.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | L'URI utilisé pour créer une nouvelle instance de la classe [WebRequest](../). |

### ReturnValue

Une nouvelle instance de la classe WebRequest.
## Remarques



NotSupportedException sera levée lorsque l'URI spécifié commence par un schéma autre que [http://](http://) ou [https://](https://).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
