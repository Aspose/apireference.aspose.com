---
title: "System::Net::WebRequest::CreateHttp method"
linktitle: "CreateHttp"
second_title: "Aspose.Page لـ C++"
description: "System::Net::WebRequest::CreateHttp method. ينشئ نسخة جديدة من فئة WebRequest باستخدام عنوان URI المحدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


ينشئ نسخة جديدة من الفئة [WebRequest](../) باستخدام URI المحدد.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| requestUriString | String | معرف URI المستخدم لإنشاء نسخة جديدة من الفئة [WebRequest](../). |

### ReturnValue

مثيل جديد من فئة WebRequest-class.
## ملاحظات



سيتم رمي استثناء NotSupportedException عندما يبدأ عنوان URI المحدد بأي مخطط باستثناء [http://](http://) أو [https://](https://).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


ينشئ نسخة جديدة من الفئة [WebRequest](../) باستخدام URI المحدد.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | معرف URI المستخدم لإنشاء نسخة جديدة من الفئة [WebRequest](../). |

### ReturnValue

مثيل جديد من فئة WebRequest-class.
## ملاحظات



سيتم رمي استثناء NotSupportedException عندما يبدأ عنوان URI المحدد بأي مخطط باستثناء [http://](http://) أو [https://](https://).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
