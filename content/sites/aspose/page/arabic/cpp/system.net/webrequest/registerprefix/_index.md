---
title: "طريقة System::Net::WebRequest::RegisterPrefix"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::WebRequest::RegisterPrefix. تُسجِّل سليل WebRequest للـ URI المحدد في C++."
type: docs
weight: 600
url: /ar/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


يسجِّل سليل [WebRequest](../) للـ URI المحدد.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| البادئة | String | الـ URI أو بادئة الـ URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | ينشئ مثيلات جديدة من الفئة [WebRequest](../). |

### ReturnValue

صحيح عندما يتم تسجيل سليل [WebRequest](../) بنجاح للـ URI المحدد، وإلا يكون خاطئ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
