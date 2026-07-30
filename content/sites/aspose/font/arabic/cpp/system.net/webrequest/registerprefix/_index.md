---
title: "System::Net::WebRequest::RegisterPrefix طريقة"
linktitle: "RegisterPrefix"
second_title: "Aspose.Font لـ C++"
description: "System::Net::WebRequest::RegisterPrefix طريقة. يسجل السليل WebRequest للعنوان URI المحدد في C++."
type: docs
weight: 600
url: /ar/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


يسجل السليل [WebRequest](../) للعنوان URI المحدد.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | String | عنوان URI أو بادئة URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | ينشئ مثيلات جديدة من الفئة [WebRequest](../). |

### ReturnValue

صحيح عندما يتم تسجيل السليل [WebRequest](../) بنجاح للعنوان URI المحدد، وإلا يكون خطأ.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
