---
title: "System::Net::WebRequest::CreateHttp yöntemi"
linktitle: "CreateHttp"
second_title: "Aspose.Page için C++"
description: "System::Net::WebRequest::CreateHttp yöntemi. Belirtilen URI'yi kullanarak C++'ta WebRequest sınıfının yeni bir örneğini oluşturur."
type: docs
weight: 300
url: /tr/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Belirtilen URI'yi kullanarak [WebRequest](../) sınıfının yeni bir örneğini oluşturur.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| requestUriString | String | Yeni bir [WebRequest](../) sınıfı örneği oluşturmak için kullanılan URI. |

### ReturnValue

Yeni oluşturulmuş bir WebRequest sınıfı örneği.
## Açıklamalar



Belirtilen URI, [http://](http://) veya [https://](https://) dışındaki herhangi bir şema ile başladığında NotSupportedException fırlatılacaktır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Belirtilen URI'yi kullanarak [WebRequest](../) sınıfının yeni bir örneğini oluşturur.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | Yeni bir [WebRequest](../) sınıfı örneği oluşturmak için kullanılan URI. |

### ReturnValue

Yeni oluşturulmuş bir WebRequest sınıfı örneği.
## Açıklamalar



Belirtilen URI, [http://](http://) veya [https://](https://) dışındaki herhangi bir şema ile başladığında NotSupportedException fırlatılacaktır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
