---
title: "طريقة System::Net::CredentialCache::GetCredential"
linktitle: "GetCredential"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::CredentialCache::GetCredential. تُرجع بيانات الاعتماد للاسم المضيف المحدد، المنفذ، ونوع المصادقة في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


يرجع بيانات الاعتماد لاسم المضيف المحدد، المنفذ، ونوع المصادقة.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المضيف | String | اسم المضيف المرتبط ببيانات الاعتماد. |
| port | int32_t | رقم المنفذ. |
| authenticationType | String | نوع المصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


يعيد الاعتمادات للبادئة URI المحددة ونوع المصادقة.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | بادئة URI. |
| authenticationType | String | نوع المصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
