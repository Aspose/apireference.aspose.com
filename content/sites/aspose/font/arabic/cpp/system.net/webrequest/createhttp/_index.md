---
title: "طريقة System::Net::WebRequest::CreateHttp"
linktitle: "CreateHttp"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::WebRequest::CreateHttp. تنشئ نسخة جديدة من فئة WebRequest باستخدام عنوان URI المحدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


ينشئ مثيلاً جديداً من الفئة [WebRequest](../) باستخدام عنوان URI المحدد.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| requestUriString | String | معرف URI الذي يُستخدم لإنشاء نسخة جديدة من الفئة [WebRequest](../). |

### ReturnValue

مثال جديد من فئة WebRequest.
## ملاحظات



سيتم إلقاء استثناء NotSupportedException عندما يبدأ عنوان URI المحدد بأي مخطط غير [http://](http://) أو [https://](https://).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


ينشئ مثيلاً جديداً من الفئة [WebRequest](../) باستخدام عنوان URI المحدد.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | معرف URI الذي يُستخدم لإنشاء نسخة جديدة من الفئة [WebRequest](../). |

### ReturnValue

مثال جديد من فئة WebRequest.
## ملاحظات



سيتم إلقاء استثناء NotSupportedException عندما يبدأ عنوان URI المحدد بأي مخطط غير [http://](http://) أو [https://](https://).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
