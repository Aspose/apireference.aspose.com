---
title: "طريقة System::Net::NetworkCredential::GetCredential"
linktitle: "GetCredential"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::NetworkCredential::GetCredential. إرجاع بيانات الاعتماد للمضيف المحدد، المنفذ، ونوع المصادقة في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/networkcredential/getcredential/
---
## NetworkCredential::GetCredential(String, int32_t, String) method


يرجع بيانات الاعتماد لاسم المضيف المحدد، المنفذ، ونوع المصادقة.

```cpp
System::SharedPtr<NetworkCredential> System::Net::NetworkCredential::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المضيف | String | اسم المضيف. |
| port | int32_t | رقم المنفذ. |
| authenticationType | String | نوع المصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkCredential::GetCredential(System::SharedPtr\<Uri\>, String) method


يرجع بيانات الاعتماد للـ URI المحدد ونوع المصادقة.

```cpp
System::SharedPtr<NetworkCredential> System::Net::NetworkCredential::GetCredential(System::SharedPtr<Uri> uri, String authenticationType) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| uri | System::SharedPtr\<Uri\> | The type of object to return. The current version only returns Stream objects. |
| authenticationType | String | نوع المصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
